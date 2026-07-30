package com.crrepa.band.my.ble.band.ota.rtk;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.ota.realtek.RtkDfuController;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements n0.a {
    private RtkDfuController controller = new RtkDfuController();
    private boolean startDfu = false;
    private CRPBleFirmwareUpgradeListener upgradeListener;

    /* renamed from: com.crrepa.band.my.ble.band.ota.rtk.a$a, reason: collision with other inner class name */
    class C0156a implements Consumer {
        C0156a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            a.this.startUpgrade();
        }
    }

    public a() {
        c.getDefault().register(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUpgrade() {
        String address = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getAddress();
        if (TextUtils.isEmpty(address)) {
            this.upgradeListener.onError(18, "The device's Mac address is null!");
        } else {
            this.controller.start(address);
        }
    }

    @Override // n0.a
    public void abort() {
        this.controller.abort();
    }

    @Override // n0.a
    public void complete() {
    }

    @Override // n0.a
    public void error() {
    }

    @l(threadMode = ThreadMode.MAIN)
    @SuppressLint({"CheckResult"})
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        if (aVar.getState() == 0 && this.startDfu) {
            Observable.timer(6L, TimeUnit.SECONDS).subscribe(new C0156a());
        }
    }

    @Override // n0.a
    public void recover(boolean z7) {
    }

    @Override // n0.a
    public void release() {
        c.getDefault().unregister(this);
    }

    @Override // n0.a
    public void resume(String str) {
    }

    @Override // n0.a
    public void setFirmwareUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.upgradeListener = cRPBleFirmwareUpgradeListener;
        this.controller.setUpgradeListener(cRPBleFirmwareUpgradeListener);
    }

    @Override // n0.a
    public void start() {
        f.d("startRtkOTA");
        com.crrepa.band.my.ble.band.connect.f.getInstance().startDfu(true);
        com.crrepa.band.my.ble.band.connect.a.disconnect(false);
        this.startDfu = true;
    }
}
