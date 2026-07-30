package com.crrepa.band.my.device.ota.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import com.crrepa.band.my.device.ota.model.BandUpgradeCompleteEvent;
import com.crrepa.band.my.model.db.Recover;
import com.crrepa.band.my.model.db.proxy.RecoverDaoProxy;
import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;
import com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.a0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements f {
    private String address;
    private int mcuType;
    private n0.a upgradePresenter;
    private j1.a view;
    private CRPBleFirmwareUpgradeListener upgradeListener = new d(this);
    private CRPDeviceNewFirmwareVersionCallback newFirmwareVersionCallback = new e(this);
    private RecoverDaoProxy upgradeDaoProxy = new RecoverDaoProxy();

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            b.this.view.renderStartUpgrade();
        }
    }

    /* renamed from: com.crrepa.band.my.device.ota.presenter.b$b, reason: collision with other inner class name */
    class C0182b implements Consumer {
        C0182b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            b.this.view.renderUpgradePercent(num.intValue());
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            b.this.stopUpgradeAnimation();
            b.this.view.renderUpgradeComplete();
        }
    }

    static class d implements CRPBleFirmwareUpgradeListener {
        private WeakReference<b> weakReference;

        public d(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onError(int i8, String str) {
            com.orhanobut.logger.f.e("upgrade error: " + str, new Object[0]);
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.showUpgradeError();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onFirmwareDownloadComplete() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onFirmwareDownloadStarting() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeAborted() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeCompleted() {
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.showUpgradeComplete();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeProgressChanged(int i8, float f8) {
            com.orhanobut.logger.f.e("onUpgradeProgressChanged: " + i8, new Object[0]);
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.showUpgradeProgress(i8);
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener
        public void onUpgradeProgressStarting(boolean z7) {
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.showStartUpgrade();
            }
        }
    }

    static class e implements CRPDeviceNewFirmwareVersionCallback {
        private WeakReference<b> weakReference;

        public e(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback
        public void onLatestVersion() {
            com.orhanobut.logger.f.d("onLatestVersion");
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.showUpgradeError();
            }
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback
        public void onNewFirmwareVersion(CRPFirmwareVersionInfo cRPFirmwareVersionInfo) {
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.startUpgrade();
            }
        }
    }

    private void checkFirmwareVersion(Context context, String str) {
        if (a0.isNetworkConnected(context)) {
            FirmwareUpgradePresenter.getInstance().checkFirmwareVersion(str, 0, this.newFirmwareVersionCallback);
        } else {
            showUpgradeError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showUpgradeError$0(Integer num) {
        stopUpgradeAnimation();
        this.view.renderUpgradeError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showStartUpgrade() {
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showUpgradeComplete() {
        new RecoverDaoProxy().delete(this.address);
        org.greenrobot.eventbus.c.getDefault().post(new BandUpgradeCompleteEvent());
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showUpgradeError() {
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ota.presenter.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                b.this.lambda$showUpgradeError$0((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showUpgradeProgress(int i8) {
        Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0182b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUpgrade() {
        com.orhanobut.logger.f.d("startUpgrade: " + this.mcuType);
        n0.a create = n0.b.create(this.mcuType);
        this.upgradePresenter = create;
        if (create == null) {
            showUpgradeError();
        } else {
            create.setFirmwareUpgradeListener(this.upgradeListener);
            this.upgradePresenter.resume(this.address);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopUpgradeAnimation() {
        this.view.stopUpgradeAnimation();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        n0.a aVar = this.upgradePresenter;
        if (aVar != null) {
            aVar.abort();
            this.upgradePresenter.release();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void restore(Context context) {
        if (!com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable()) {
            this.view.renderBluetoothDisable();
            return;
        }
        List<Recover> all = this.upgradeDaoProxy.getAll();
        if (all == null || all.isEmpty()) {
            showUpgradeComplete();
            return;
        }
        this.view.playUpgradeAnimation();
        com.crrepa.band.my.ble.band.connect.f.getInstance().startDfu(false);
        com.crrepa.band.my.ble.band.connect.a.disconnect(false);
        Recover recover = all.get(0);
        this.address = recover.getAddress();
        this.mcuType = recover.getMcu().intValue();
        checkFirmwareVersion(context, recover.getFirmwareVersion());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(j1.a aVar) {
        this.view = aVar;
    }
}
