package com.crrepa.band.my.ble.band.cmd.callback;

import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ota.model.BandFirmwareVersionEvent;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandLastBindBandProvider;
import com.crrepa.ble.conn.callback.CRPDeviceFirmwareVersionCallback;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class e implements CRPDeviceFirmwareVersionCallback {
    private static final int QUERY_FIRMWARE_VERSION_PERIOD = 60;
    private boolean queryFirmwareVersion = true;
    private boolean querySuccess = false;
    private Disposable subscribe;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            if (e.this.isQuerySuccess()) {
                return;
            }
            com.orhanobut.logger.f.d("subscribe timeout, disconnect...");
            e.this.setQueryFirmwareVersion(false);
            com.crrepa.band.my.ble.band.connect.a.disconnect(true);
        }
    }

    private void checkBandFirmwareVersion(String str) {
        i4.getInstance().checkFirmwareVersion(str, 0);
    }

    private void sendStepLength() {
        i4.getInstance().sendStepLength();
    }

    private void updateConnectedBandConfig(String str) {
        if (TextUtils.equals(str, BandInfoManager.getFirmwareVersion())) {
            return;
        }
        BandInfoManager.saveFirmwareVersion(str);
        com.crrepa.band.my.ble.band.utils.a.getInstance().updateConnectBand(new com.crrepa.band.my.ble.band.config.e().getBoundBand());
        org.greenrobot.eventbus.c.getDefault().post(new l0.d(true, true));
    }

    public void cancelTimer() {
        Disposable disposable = this.subscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.subscribe.dispose();
    }

    public boolean isQueryFirmwareVersion() {
        return this.queryFirmwareVersion;
    }

    public boolean isQuerySuccess() {
        return this.querySuccess;
    }

    @Override // com.crrepa.ble.conn.callback.CRPDeviceFirmwareVersionCallback
    public void onDeviceFirmwareVersion(String str) {
        setQuerySuccess(true);
        com.orhanobut.logger.f.d("firmware version: " + str);
        com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().setFirmwareVersion(str);
        BandLastBindBandProvider.saveFirmwareVersion(str);
        org.greenrobot.eventbus.c.getDefault().post(new BandFirmwareVersionEvent(str));
        updateConnectedBandConfig(str);
        sendStepLength();
        checkBandFirmwareVersion(str);
    }

    public void setQueryFirmwareVersion(boolean z7) {
        this.queryFirmwareVersion = z7;
    }

    public void setQuerySuccess(boolean z7) {
        this.querySuccess = z7;
    }

    public void startTimer() {
        setQuerySuccess(false);
        this.subscribe = Observable.timer(60L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }
}
