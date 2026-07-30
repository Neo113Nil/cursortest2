package com.crrepa.band.my.ble.band.ota.sfl;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.connect.f;
import com.crrepa.band.my.model.db.proxy.RecoverDaoProxy;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.ota.sifli.SifliDfuController;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a implements n0.a {
    private String upgradeAddress;
    private CRPBleFirmwareUpgradeListener upgradeListener;
    private SifliDfuController controller = new SifliDfuController();
    private RecoverDaoProxy upgradeDaoProxy = new RecoverDaoProxy();

    /* renamed from: com.crrepa.band.my.ble.band.ota.sfl.a$a, reason: collision with other inner class name */
    class C0157a implements Consumer {
        final /* synthetic */ String val$address;

        C0157a(String str) {
            this.val$address = str;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            f.getInstance().closeGatt();
            com.orhanobut.logger.f.d("sifli ota resume");
            a.this.controller.resume(this.val$address);
        }
    }

    @Override // n0.a
    public void abort() {
    }

    @Override // n0.a
    public void complete() {
        this.upgradeDaoProxy.delete(this.upgradeAddress);
    }

    @Override // n0.a
    public void error() {
    }

    @Override // n0.a
    public void recover(boolean z7) {
        if (z7) {
            return;
        }
        this.upgradeDaoProxy.insert(this.upgradeAddress, 5);
    }

    @Override // n0.a
    public void release() {
    }

    @Override // n0.a
    @SuppressLint({"CheckResult"})
    public void resume(String str) {
        this.upgradeAddress = str;
        f.getInstance().disconnect(false);
        Observable.timer(3L, TimeUnit.SECONDS).subscribe(new C0157a(str));
    }

    @Override // n0.a
    public void setFirmwareUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.upgradeListener = cRPBleFirmwareUpgradeListener;
        this.controller.setUpgradeListener(cRPBleFirmwareUpgradeListener);
    }

    @Override // n0.a
    public void start() {
        String address = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getAddress();
        if (TextUtils.isEmpty(address)) {
            this.upgradeListener.onError(18, "The device's Mac address is null!");
            return;
        }
        this.upgradeAddress = address;
        f.getInstance().startDfu(true);
        com.orhanobut.logger.f.d("sifli ota start");
        this.controller.start(address);
    }
}
