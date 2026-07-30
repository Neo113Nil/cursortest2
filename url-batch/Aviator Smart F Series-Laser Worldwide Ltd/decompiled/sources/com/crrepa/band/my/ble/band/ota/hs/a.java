package com.crrepa.band.my.ble.band.ota.hs;

import android.annotation.SuppressLint;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.proxy.RecoverDaoProxy;
import com.crrepa.ble.conn.callback.CRPDeviceDfuAddressCallback;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.ota.hs.HsDfuController;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements n0.a {
    private String dfuAddress;
    private CRPDeviceDfuAddressCallback addressCallback = new b(this);
    private HsDfuController hsDfuController = HsDfuController.getInstance();
    private boolean startDfu = false;

    /* renamed from: com.crrepa.band.my.ble.band.ota.hs.a$a, reason: collision with other inner class name */
    class C0155a implements Consumer {
        C0155a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            a.this.startUpgrade();
        }
    }

    static class b implements CRPDeviceDfuAddressCallback {
        private WeakReference<a> weakReference;

        public b(a aVar) {
            this.weakReference = new WeakReference<>(aVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceDfuAddressCallback
        public void onAddress(String str) {
            a aVar = this.weakReference.get();
            if (aVar == null) {
                return;
            }
            aVar.enableDfu(str);
        }
    }

    public a() {
        c.getDefault().register(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void enableDfu(String str) {
        if (this.startDfu) {
            return;
        }
        f.d("hs dfu address: " + str);
        this.dfuAddress = str;
        this.hsDfuController.setAddress(str);
        boolean enableHsDfu = i4.getInstance().enableHsDfu();
        this.startDfu = enableHsDfu;
        if (enableHsDfu) {
            com.crrepa.band.my.ble.band.connect.f.getInstance().startDfu(false);
        }
    }

    private void queryDfuAddress() {
        i4.getInstance().queryHsDfuAddress(this.addressCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUpgrade() {
        this.hsDfuController.start(!com.crrepa.band.my.ble.band.utils.a.getInstance().isHSA4());
    }

    @Override // n0.a
    public void abort() {
        this.hsDfuController.abort();
    }

    @Override // n0.a
    public void complete() {
        new RecoverDaoProxy().delete(this.dfuAddress);
        com.crrepa.band.my.ble.band.connect.f.getInstance().closeGatt();
    }

    @Override // n0.a
    public void error() {
        com.crrepa.band.my.ble.band.connect.f.getInstance().closeGatt();
    }

    @l(threadMode = ThreadMode.MAIN)
    @SuppressLint({"CheckResult"})
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        int state = aVar.getState();
        f.d("BluetoothGatt enableDfu: " + this.startDfu);
        f.d("BluetoothGatt connectState: " + state);
        if (state == 0 && this.startDfu) {
            Observable.timer(3L, TimeUnit.SECONDS).subscribe(new C0155a());
        } else {
            if (state != 2 || this.startDfu) {
                return;
            }
            queryDfuAddress();
        }
    }

    @Override // n0.a
    public void recover(boolean z7) {
        if (z7) {
            return;
        }
        new RecoverDaoProxy().insert(this.dfuAddress, 2);
    }

    @Override // n0.a
    public void release() {
        c.getDefault().unregister(this);
    }

    @Override // n0.a
    public void resume(String str) {
        this.hsDfuController.setAddress(str);
        this.hsDfuController.resume();
    }

    @Override // n0.a
    public void setFirmwareUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.hsDfuController.setUpgradeListener(cRPBleFirmwareUpgradeListener);
    }

    @Override // n0.a
    public void start() {
        queryDfuAddress();
    }
}
