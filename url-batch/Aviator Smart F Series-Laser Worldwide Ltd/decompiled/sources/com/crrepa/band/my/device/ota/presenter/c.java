package com.crrepa.band.my.device.ota.presenter;

import android.annotation.SuppressLint;
import com.crrepa.band.my.device.ota.model.BandUpgradeCompleteEvent;
import com.crrepa.band.my.device.watchface.model.WatchFaceDeleteCompleteEvent;
import com.crrepa.band.my.model.band.provider.BandDisplayWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.ble.CRPBleClient;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.conn.listener.CRPTransListener;
import com.crrepa.ble.trans.tp.CRPTpHelper;
import com.moyoung.dafit.module.common.baseui.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class c implements f {
    private static final int MAX_FIRMWARE_UPGRADE_COUNT = 5;
    private static final int MAX_TP_UPGRADE_COUNT = 3;
    private static final int UPGRADE_FIRMWARE_COMPLETE = 4;
    private static final int UPGRADE_FIRMWARE_DOWNLOAD = 1;
    private static final int UPGRADE_FIRMWARE_ERROR = 5;
    private static final int UPGRADE_FIRMWARE_PROGRESS_CHANGE = 3;
    private static final int UPGRADE_FIRMWARE_START = 2;
    private static final int UPGRADE_TP_COMPLETE = 6;
    private static final int UPGRADE_TP_ERROR = 7;
    private j1.b view;
    private d upgradeListener = new d(this);
    private e tpTransListener = new e(this);
    private n0.a upgradePresenter = n0.b.create();
    private CRPTpHelper tpHelper = new CRPTpHelper();
    private int tpUpgradeCount = 0;
    private int firmwareUpgradeCount = 0;
    private boolean transCompleted = false;
    private boolean recoverable = true;

    class a implements Consumer {
        final /* synthetic */ int val$errorType;
        final /* synthetic */ int val$percent;

        a(int i8, int i9) {
            this.val$percent = i8;
            this.val$errorType = i9;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            switch (num.intValue()) {
                case 1:
                    c.this.showDownloadFirmware();
                    break;
                case 2:
                    c.this.showFirmwareUpgrade();
                    break;
                case 3:
                    c.this.updateUpgradeProgress(this.val$percent);
                    break;
                case 4:
                    c.this.upgradeComplete();
                    break;
                case 5:
                    com.orhanobut.logger.f.e("upgradeError UPGRADE_FIRMWARE_ERROR", new Object[0]);
                    c cVar = c.this;
                    cVar.upgradeError(cVar.recoverable, this.val$errorType);
                    c.this.abortFirmwareUpgrade();
                    break;
                case 6:
                    c.this.delayStartFirmwareUpgrade();
                    break;
                case 7:
                    c.this.tpReupgrade(this.val$errorType);
                    break;
            }
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            c.this.startTpUpgrade();
        }
    }

    /* renamed from: com.crrepa.band.my.device.ota.presenter.c$c, reason: collision with other inner class name */
    class C0183c implements Consumer {
        C0183c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            c.this.startFirmwareUpgrade();
        }
    }

    static class d implements CRPBleFirmwareUpgradeListener {
        private WeakReference<c> weakReference;

        public d(c cVar) {
            this.weakReference = new WeakReference<>(cVar);
        }

        private void handUpgradeMessage(int i8, int i9, int i10) {
            c cVar = this.weakReference.get();
            if (cVar == null) {
                return;
            }
            cVar.handleUpgradeMessage(i8, i9, i10);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onError(int i8, String str) {
            com.orhanobut.logger.f.e("upgrade error: " + str, new Object[0]);
            handUpgradeMessage(5, 0, i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onFirmwareDownloadComplete() {
            handUpgradeMessage(2, 0, 0);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onFirmwareDownloadStarting() {
            handUpgradeMessage(1, 0, 0);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeAborted() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeCompleted() {
            handUpgradeMessage(4, 100, 0);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeProgressChanged(int i8, float f8) {
            handUpgradeMessage(3, i8, 0);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeProgressStarting(boolean z7) {
            com.orhanobut.logger.f.e("onUpgradeProgressStarting: " + z7, new Object[0]);
            c cVar = this.weakReference.get();
            if (cVar != null) {
                cVar.recoverable = z7;
                cVar.upgradePresenter.recover(z7);
            }
        }
    }

    private static class e implements CRPTransListener {
        private WeakReference<c> weakReference;

        public e(c cVar) {
            this.weakReference = new WeakReference<>(cVar);
        }

        private void handUpgradeMessage(int i8, int i9, int i10) {
            c cVar = this.weakReference.get();
            if (cVar == null) {
                return;
            }
            cVar.handleUpgradeMessage(i8, i9, i10);
        }

        @Override // com.crrepa.ble.conn.listener.CRPTransListener
        public void onError(int i8) {
            com.orhanobut.logger.f.e("tp onError", new Object[0]);
            handUpgradeMessage(7, 0, i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPTransListener
        public void onTransCompleted() {
            com.orhanobut.logger.f.d("tp onTransCompleted");
            handUpgradeMessage(6, 0, 0);
        }

        @Override // com.crrepa.ble.conn.listener.CRPTransListener
        public void onTransProgressChanged(int i8) {
            com.orhanobut.logger.f.d("tp onTransProgressChanged: " + i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPTransListener
        public void onTransProgressStarting() {
        }
    }

    public c() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void abortFirmwareUpgrade() {
        this.upgradePresenter.abort();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void delayStartFirmwareUpgrade() {
        Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0183c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void handleUpgradeMessage(int i8, int i9, int i10) {
        if (i10 == 24) {
            this.view.renderLowStorage();
        } else {
            Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(i9, i10));
        }
    }

    private void playUpgradeAnimation() {
        this.view.playUpgradeAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownloadFirmware() {
        this.view.renderDownloadFirmwareStarting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFirmwareUpgrade() {
        this.view.renderUpgradeProgressStarting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFirmwareUpgrade() {
        this.upgradePresenter.setFirmwareUpgradeListener(this.upgradeListener);
        this.upgradePresenter.start();
        this.firmwareUpgradeCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTpUpgrade() {
        this.tpHelper.start(BandInfoManager.getFirmwareVersion(), this.tpTransListener);
        this.tpUpgradeCount++;
    }

    private void stopUpgradeAnimation() {
        this.view.stopUpgradeAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void tpReupgrade(int i8) {
        if (3 >= this.tpUpgradeCount) {
            Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
            return;
        }
        com.orhanobut.logger.f.e("upgradeError tpReupgrade", new Object[0]);
        upgradeError(true, i8);
        this.tpHelper.abort();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUpgradeProgress(int i8) {
        this.view.renderUpgradeProgressChanged(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void upgradeComplete() {
        updateUpgradeProgress(100);
        this.transCompleted = true;
        stopUpgradeAnimation();
        this.upgradePresenter.complete();
        org.greenrobot.eventbus.c.getDefault().post(new BandUpgradeCompleteEvent());
        this.view.renderUpgradeCompleted();
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isNewWatchFace()) {
            BandDisplayWatchFaceProvider.delete();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        this.upgradePresenter.release();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandDfuStateChangeEvent(l0.e eVar) {
        if (eVar.getState() != 0 || this.transCompleted) {
            return;
        }
        com.orhanobut.logger.f.e("upgradeError onBandDfuStateChangeEvent", new Object[0]);
        upgradeError(true, 23);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(j1.b bVar) {
        this.view = bVar;
    }

    public void startUpgrade(boolean z7) {
        playUpgradeAnimation();
        if (z7) {
            startTpUpgrade();
        } else {
            startFirmwareUpgrade();
        }
    }

    public void upgradeError(boolean z7, int i8) {
        com.orhanobut.logger.f.d("upgradeErro recoverabler: " + z7 + ", firmwareUpgradeCount: " + this.firmwareUpgradeCount);
        if (!z7 && !(this.upgradePresenter instanceof com.crrepa.band.my.ble.band.ota.hs.a) && 5 > this.firmwareUpgradeCount) {
            if (CRPBleClient.create(com.moyoung.dafit.module.common.utils.d.get()).isBluetoothEnable() || !(this.upgradePresenter instanceof com.crrepa.band.my.ble.band.ota.sfl.a)) {
                delayStartFirmwareUpgrade();
                return;
            } else {
                upgradeError(true, 23);
                return;
            }
        }
        this.transCompleted = true;
        stopUpgradeAnimation();
        this.upgradePresenter.error();
        this.view.renderUpgradeError(z7, i8);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isNewWatchFace()) {
            org.greenrobot.eventbus.c.getDefault().post(new WatchFaceDeleteCompleteEvent());
        }
    }
}
