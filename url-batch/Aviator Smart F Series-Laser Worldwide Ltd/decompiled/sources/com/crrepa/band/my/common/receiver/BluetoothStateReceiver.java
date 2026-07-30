package com.crrepa.band.my.common.receiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.model.BluetoothStateChangeEvent;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class BluetoothStateReceiver extends BroadcastReceiver {
    private static final String BLUETOOTH_STATE_ACTION = "android.bluetooth.adapter.action.STATE_CHANGED";
    private static final int DEFAULT_CONNECT_DELAY = 3;
    private static final BluetoothStateReceiver receiver = new BluetoothStateReceiver();

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
                com.crrepa.band.my.ble.band.connect.a.connect();
            }
        }
    }

    @SuppressLint({"CheckResult"})
    private void connectBand() {
        Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    private void disconnectBand() {
        com.crrepa.band.my.ble.band.connect.a.disconnect(false);
    }

    public static void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.setPriority(Integer.MAX_VALUE);
        intentFilter.addAction(BLUETOOTH_STATE_ACTION);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(receiver, intentFilter, 2);
        } else {
            context.registerReceiver(receiver, intentFilter);
        }
    }

    private void showBluetoothDisableNotification(Context context) {
        if (TextUtils.isEmpty(BandInfoManager.getAddress())) {
            return;
        }
        m1.a.showBluetoothDisableNotification(context);
    }

    public static void unregister(Context context) {
        context.unregisterReceiver(receiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        BluetoothStateChangeEvent bluetoothStateChangeEvent;
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        f.d("bluetooth state changed:" + intExtra);
        if (intExtra == 12) {
            connectBand();
            bluetoothStateChangeEvent = new BluetoothStateChangeEvent(true);
        } else if (intExtra != 13) {
            bluetoothStateChangeEvent = null;
        } else {
            disconnectBand();
            BluetoothStateChangeEvent bluetoothStateChangeEvent2 = new BluetoothStateChangeEvent(false);
            showBluetoothDisableNotification(context);
            bluetoothStateChangeEvent = bluetoothStateChangeEvent2;
        }
        if (bluetoothStateChangeEvent != null) {
            org.greenrobot.eventbus.c.getDefault().post(bluetoothStateChangeEvent);
        }
    }
}
