package com.realsil.sdk.dfu.utils;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.BluetoothProfileCallback;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.ConnectionException;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.m.o;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.List;

/* loaded from: classes4.dex */
public class HidDfuAdapter extends com.realsil.sdk.dfu.utils.a implements o {
    public static volatile HidDfuAdapter T;

    public class a extends BluetoothProfileCallback {
        public a() {
        }

        @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
        public void onHidStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            super.onHidStateChanged(bluetoothDevice, i8);
            HidDfuAdapter hidDfuAdapter = HidDfuAdapter.this;
            int i9 = hidDfuAdapter.f16389p;
            if (i9 == 2065) {
                BluetoothDevice bluetoothDevice2 = hidDfuAdapter.B;
                if (bluetoothDevice2 == null) {
                    ZLogger.v("device has already been clean");
                    HidDfuAdapter.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_FAILED);
                    return;
                }
                if (!bluetoothDevice2.equals(bluetoothDevice)) {
                    ZLogger.v(String.format("target device is %s, ignore device:%s", HidDfuAdapter.this.B.toString(), bluetoothDevice.toString()));
                    return;
                }
                if (i8 == 2) {
                    ZLogger.v("pending to back connect with previous device");
                    HidDfuAdapter hidDfuAdapter2 = HidDfuAdapter.this;
                    hidDfuAdapter2.connectDevice(hidDfuAdapter2.f16384k);
                    return;
                } else {
                    if (i8 == 0) {
                        ZLogger.v("profile disconnected");
                        HidDfuAdapter.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_FAILED);
                        return;
                    }
                    return;
                }
            }
            if (i9 != 529) {
                ZLogger.v(hidDfuAdapter.f16382i, String.format("ignore hid state change, when state is 0x%04X", Integer.valueOf(hidDfuAdapter.f16388o)));
                return;
            }
            BluetoothDevice bluetoothDevice3 = hidDfuAdapter.B;
            if (bluetoothDevice3 == null) {
                ZLogger.v("device has already been clean");
                HidDfuAdapter.this.notifyStateChanged(4098);
                return;
            }
            if (!bluetoothDevice3.equals(bluetoothDevice)) {
                ZLogger.v(String.format("target device is %s, ignore device:%s", HidDfuAdapter.this.B.toString(), bluetoothDevice.toString()));
                return;
            }
            if (i8 == 0) {
                ZLogger.v(HidDfuAdapter.this.f16381h, "RCU Disconnected!");
                HidDfuAdapter.this.a((DfuException) new ConnectionException(0), false);
            } else {
                if (i8 == 1) {
                    ZLogger.v(HidDfuAdapter.this.f16382i, "RCU Connecting!");
                    return;
                }
                if (i8 == 2) {
                    ZLogger.v(HidDfuAdapter.this.f16381h, "RCU Connected!");
                    HidDfuAdapter.this.notifyLock();
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    ZLogger.v(HidDfuAdapter.this.f16382i, " RCU Disconnecting!");
                }
            }
        }
    }

    public HidDfuAdapter(Context context) {
        super(context);
    }

    public static HidDfuAdapter getInstance(Context context) {
        if (T == null) {
            synchronized (HidDfuAdapter.class) {
                try {
                    if (T == null) {
                        T = new HidDfuAdapter(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return T;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean connectBack() {
        if (!super.connectBack()) {
            ZLogger.v("connect back failed");
            return false;
        }
        if (getBondState(this.B) != 12) {
            ZLogger.d(this.f16381h, "device is not bonded, maybe has something wrong");
            return false;
        }
        if (isHidConnect(this.B)) {
            this.f16388o = 2048;
            ZLogger.d(this.f16381h, "profile has already connected, pending to connect");
            return connectDevice(this.f16384k);
        }
        ZLogger.v("wait hid profile auto connected");
        notifyStateChanged(2048, 17);
        return true;
    }

    @Override // com.realsil.sdk.dfu.utils.a, com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        T = null;
    }

    @Override // com.realsil.sdk.dfu.utils.a, com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public BluetoothProfileCallback getBluetoothProfileCallback() {
        return new a();
    }

    @Override // com.realsil.sdk.dfu.utils.a
    public boolean toEstablishGattConnection() {
        if (this.f16384k.isHid() && f()) {
            if (isHidConnect(this.B)) {
                ZLogger.v(this.f16382i, "HID already connected");
            } else {
                ZLogger.v(this.f16382i, "hid not connect");
                a(this.B);
            }
        }
        return a(this.D);
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean validate(OtaDeviceInfo otaDeviceInfo) {
        List<SubFileInfo> list;
        String str;
        if (!super.validate(otaDeviceInfo)) {
            return false;
        }
        if (this.f16392s.isBankEnabled()) {
            if (otaDeviceInfo.isBankEnabled()) {
                str = this.f16392s.getActiveBank() == otaDeviceInfo.getActiveBank() ? "conflict: active bank not changed" : "conflict: not support bank";
            }
            ZLogger.d(str);
            return false;
        }
        if (this.f16393t != null) {
            try {
                BinInfo loadImageBinInfo = FirmwareLoaderX.loadImageBinInfo(new LoadParams.Builder().with(this.mContext).binParameters(this.f16393t.getBinParameters()).setSectionSizeCheckEnabled(this.f16393t.isSectionSizeCheckEnabled()).setIcCheckEnabled(this.f16393t.isIcCheckEnabled()).versionCheckEnabled(true).setOtaDeviceInfo(otaDeviceInfo).build());
                if (loadImageBinInfo != null && loadImageBinInfo.status == 4096 && (list = loadImageBinInfo.supportSubFileInfos) != null && !list.isEmpty()) {
                    ZLogger.d("conflict: version not apply");
                    return false;
                }
            } catch (LoadFileException e8) {
                ZLogger.w(e8.toString());
            }
        }
        return true;
    }
}
