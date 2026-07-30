package com.realsil.sdk.dfu.utils;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.BluetoothProfileCallback;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.List;

/* loaded from: classes4.dex */
public final class HeadsetDfuAdapter extends b {
    public static volatile HeadsetDfuAdapter O;

    public class a extends BluetoothProfileCallback {
        public a() {
        }

        @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
        public void onA2dpStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            super.onA2dpStateChanged(bluetoothDevice, i8);
            HeadsetDfuAdapter headsetDfuAdapter = HeadsetDfuAdapter.this;
            if (!headsetDfuAdapter.checkState(headsetDfuAdapter.f16388o, 18)) {
                HeadsetDfuAdapter headsetDfuAdapter2 = HeadsetDfuAdapter.this;
                ZLogger.v(headsetDfuAdapter2.f16382i, String.format("ignore a2dp state change, when state=0x%04X", Integer.valueOf(headsetDfuAdapter2.f16389p)));
                return;
            }
            BluetoothDevice bluetoothDevice2 = HeadsetDfuAdapter.this.B;
            if (bluetoothDevice2 == null) {
                ZLogger.v("device has already been clean");
                HeadsetDfuAdapter.this.notifyStateChanged(4098);
                return;
            }
            if (!bluetoothDevice2.equals(bluetoothDevice)) {
                HeadsetDfuAdapter headsetDfuAdapter3 = HeadsetDfuAdapter.this;
                ZLogger.v(headsetDfuAdapter3.f16381h, String.format("target device is %s, ignore device:%s", headsetDfuAdapter3.B.toString(), bluetoothDevice.toString()));
            } else if (i8 == 2) {
                ZLogger.v("A2DP connected");
                HeadsetDfuAdapter.this.notifyLock();
            } else if (i8 == 0) {
                ZLogger.v("A2DP disconnected");
                HeadsetDfuAdapter.this.notifyLock();
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
        public void onHfpConnectionStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            super.onHfpConnectionStateChanged(bluetoothDevice, i8);
            if (HeadsetDfuAdapter.this.checkState(512, 19)) {
                BluetoothDevice bluetoothDevice2 = HeadsetDfuAdapter.this.B;
                if (bluetoothDevice2 == null) {
                    ZLogger.v("device has already been clean");
                    HeadsetDfuAdapter.this.notifyStateChanged(4098);
                    return;
                }
                if (!bluetoothDevice2.equals(bluetoothDevice)) {
                    HeadsetDfuAdapter headsetDfuAdapter = HeadsetDfuAdapter.this;
                    ZLogger.v(headsetDfuAdapter.f16381h, String.format("target device is %s, ignore device:%s", headsetDfuAdapter.B.toString(), bluetoothDevice.toString()));
                    return;
                } else if (i8 == 2) {
                    ZLogger.v(HeadsetDfuAdapter.this.f16381h, "hfp connected");
                    HeadsetDfuAdapter.this.notifyLock();
                    return;
                } else {
                    if (i8 == 0) {
                        ZLogger.v(HeadsetDfuAdapter.this.f16381h, "hfp disconnected");
                        HeadsetDfuAdapter.this.notifyLock();
                        return;
                    }
                    return;
                }
            }
            if (!HeadsetDfuAdapter.this.checkState(2048, 19)) {
                HeadsetDfuAdapter headsetDfuAdapter2 = HeadsetDfuAdapter.this;
                ZLogger.v(headsetDfuAdapter2.f16382i, String.format("ignore hfp state change when state is 0x%04X", Integer.valueOf(headsetDfuAdapter2.f16389p)));
                return;
            }
            HeadsetDfuAdapter headsetDfuAdapter3 = HeadsetDfuAdapter.this;
            BluetoothDevice bluetoothDevice3 = headsetDfuAdapter3.B;
            if (bluetoothDevice3 == null) {
                ZLogger.v(headsetDfuAdapter3.f16381h, "device has already been cleaned");
                HeadsetDfuAdapter.this.notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_FAILED);
            } else if (!bluetoothDevice3.equals(bluetoothDevice)) {
                HeadsetDfuAdapter headsetDfuAdapter4 = HeadsetDfuAdapter.this;
                ZLogger.v(headsetDfuAdapter4.f16382i, String.format("target device is %s, ignore device:%s", headsetDfuAdapter4.B.toString(), bluetoothDevice.toString()));
            } else if (i8 == 2) {
                HeadsetDfuAdapter.this.notifyHfpLock();
            } else if (i8 == 0) {
                HeadsetDfuAdapter.this.notifyHfpLock();
            }
        }
    }

    public HeadsetDfuAdapter(Context context) {
        super(context);
    }

    public static HeadsetDfuAdapter getInstance(Context context) {
        if (O == null) {
            synchronized (HeadsetDfuAdapter.class) {
                try {
                    if (O == null) {
                        O = new HeadsetDfuAdapter(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return O;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean connectBack() {
        if (!super.connectBack()) {
            return false;
        }
        BluetoothDevice bluetoothDevice = this.B;
        if (bluetoothDevice == null) {
            ZLogger.d("device has already been clean, no need to connect back");
            return false;
        }
        if (getBondState(bluetoothDevice) != 12) {
            ZLogger.w(this.f16381h, "device is not bonded, maybe has something wrong");
            return false;
        }
        if (!j()) {
            notifyStateChanged(DfuAdapter.STATE_BACKCONNECT_FAILED);
            return false;
        }
        this.f16388o = 2048;
        ZLogger.d(this.f16381h, "profile has already connected, pending to connect");
        return connectDevice(this.f16384k);
    }

    @Override // com.realsil.sdk.dfu.utils.b, com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        O = null;
    }

    @Override // com.realsil.sdk.dfu.utils.b, com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public BluetoothProfileCallback getBluetoothProfileCallback() {
        return new a();
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
