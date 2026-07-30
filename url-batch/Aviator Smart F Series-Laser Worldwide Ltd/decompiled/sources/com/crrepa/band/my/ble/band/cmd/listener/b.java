package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.ble.conn.listener.CRPDeviceBatteryListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b implements CRPDeviceBatteryListener {
    private static final int SUBSCRIBE_BATTERY_PERIOD = 60;
    private Disposable subscribe;
    private boolean subscribeBattery = true;
    private boolean subscribeSuccess = false;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            if (b.this.isSubscribeSuccess()) {
                return;
            }
            com.orhanobut.logger.f.d("subscribe timeout, disconnect...");
            b.this.setSubscribeBattery(false);
            com.crrepa.band.my.ble.band.connect.a.disconnect(true);
        }
    }

    public void cancelTimer() {
        Disposable disposable = this.subscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.subscribe.dispose();
    }

    public boolean isSubscribeBattery() {
        return this.subscribeBattery;
    }

    public boolean isSubscribeSuccess() {
        return this.subscribeSuccess;
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceBatteryListener
    public void onDeviceBattery(int i8) {
        com.orhanobut.logger.f.d("onDeviceBattery: " + i8);
        int i9 = i8 & 255;
        org.greenrobot.eventbus.c.getDefault().post(new l0.b(i9));
        BandBatteryProvider.saveBandBattery(i9);
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceBatteryListener
    public void onSubscribe(boolean z7) {
        com.orhanobut.logger.f.d("onSubscribe: " + z7);
        if (z7) {
            setSubscribeSuccess(true);
        }
    }

    public void setSubscribeBattery(boolean z7) {
        this.subscribeBattery = z7;
    }

    public void setSubscribeSuccess(boolean z7) {
        this.subscribeSuccess = z7;
    }

    public void startTimer() {
        setSubscribeSuccess(false);
        this.subscribe = Observable.timer(60L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }
}
