package com.crrepa.band.my.ble.band.cmd.callback;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.crrepa.ble.conn.callback.CRPBtAddressCallback;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* loaded from: classes2.dex */
public class b implements CRPBtAddressCallback {

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        @SuppressLint({"MissingPermission"})
        public void accept(String str) {
            com.orhanobut.logger.f.d("BT address: " + str);
            BluetoothDevice bluetoothDevice = com.crrepa.band.my.ble.band.a.getBleClient().getBleDevice(str).getBluetoothDevice();
            if (bluetoothDevice != null) {
                String name = bluetoothDevice.getName();
                BtBluetoothProvider.saveName(name);
                com.orhanobut.logger.f.d("BT device name: " + name);
                com.orhanobut.logger.f.d("BT device type: " + bluetoothDevice.getType());
                BtBluetoothDeviceManager.getInstance().createBond(bluetoothDevice);
            }
        }
    }

    /* renamed from: com.crrepa.band.my.ble.band.cmd.callback.b$b, reason: collision with other inner class name */
    class C0150b implements Consumer {
        C0150b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.crrepa.ble.conn.callback.CRPBtAddressCallback
    @SuppressLint({"CheckResult"})
    public void onAddress(String str) {
        com.orhanobut.logger.f.d("onAddress: " + str);
        BtBluetoothProvider.saveAddress(str);
        i4.getInstance().setCallNumberListener();
        if (BtBluetoothDeviceManager.getInstance().isRemoveBond()) {
            com.orhanobut.logger.f.d("BtBluetoothDeviceManager remove bond!");
        } else {
            Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new C0150b());
        }
    }
}
