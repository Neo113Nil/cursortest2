package com.crrepa.ble.conn.bond;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.annotation.NonNull;
import com.crrepa.ble.util.BleLog;
import com.realsil.sdk.core.bluetooth.BluetoothProfileCallback;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManager;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;

/* loaded from: classes3.dex */
public class CRPBluetoothManager {
    private static CRPBluetoothManager INSTANCE;
    private BluetoothBondStateListener bondStateListener;

    public interface BluetoothBondStateListener {
        public static final int INDICATOR_A2DP = 1;
        public static final int INDICATOR_HEADSET = 4;

        void onBondStateChanged(BluetoothDevice bluetoothDevice, int i8);

        void onConnectionState(BluetoothDevice bluetoothDevice, int i8, int i9);
    }

    private CRPBluetoothManager(Context context) {
        RtkBluetoothManager.initial(context);
        RtkBluetoothManager.getInstance().addManagerCallback(new RtkBluetoothManagerCallback() { // from class: com.crrepa.ble.conn.bond.CRPBluetoothManager.1
            @Override // com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback
            public void onBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
                super.onBondStateChanged(bluetoothDevice, i8);
                BleLog.d("onBondStateChanged: " + i8);
                if (CRPBluetoothManager.this.bondStateListener != null) {
                    CRPBluetoothManager.this.bondStateListener.onBondStateChanged(bluetoothDevice, i8);
                }
            }
        });
        BluetoothProfileManager.initial(context);
        BluetoothProfileManager.getInstance().addManagerCallback(new BluetoothProfileCallback() { // from class: com.crrepa.ble.conn.bond.CRPBluetoothManager.2
            @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
            public void onA2dpStateChanged(BluetoothDevice bluetoothDevice, int i8) {
                super.onA2dpStateChanged(bluetoothDevice, i8);
                BleLog.d("onA2dpStateChanged: " + i8);
                if (CRPBluetoothManager.this.bondStateListener != null) {
                    CRPBluetoothManager.this.bondStateListener.onConnectionState(bluetoothDevice, 1, i8);
                }
            }

            @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
            public void onHfpConnectionStateChanged(BluetoothDevice bluetoothDevice, int i8) {
                super.onHfpConnectionStateChanged(bluetoothDevice, i8);
                BleLog.d("onHfpConnectionStateChanged: " + i8);
                if (CRPBluetoothManager.this.bondStateListener != null) {
                    CRPBluetoothManager.this.bondStateListener.onConnectionState(bluetoothDevice, 4, i8);
                }
            }
        });
    }

    public static CRPBluetoothManager getInstance(@NonNull Context context) {
        if (INSTANCE == null) {
            synchronized (CRPBluetoothManager.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new CRPBluetoothManager(context);
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public boolean connectA2dp(@NonNull BluetoothDevice bluetoothDevice) {
        BleLog.d("connectA2dp: " + bluetoothDevice.getAddress());
        BluetoothProfileManager bluetoothProfileManager = BluetoothProfileManager.getInstance();
        boolean profileProxy = bluetoothProfileManager.getProfileProxy(1);
        BleLog.d("a2dpProfileProxy: " + profileProxy);
        if (profileProxy) {
            return bluetoothProfileManager.connectA2dpSource(bluetoothDevice);
        }
        return false;
    }

    public boolean connectHeadset(@NonNull BluetoothDevice bluetoothDevice) {
        BleLog.d("connectHeadset: " + bluetoothDevice.getAddress());
        BluetoothProfileManager bluetoothProfileManager = BluetoothProfileManager.getInstance();
        boolean profileProxy = bluetoothProfileManager.getProfileProxy(4);
        BleLog.d("headsetProfileProxy: " + profileProxy);
        if (profileProxy) {
            return bluetoothProfileManager.connectHfpAg(bluetoothDevice.getAddress());
        }
        return false;
    }

    public boolean createBond(@NonNull BluetoothDevice bluetoothDevice) {
        BleLog.d("createBond: " + bluetoothDevice.getAddress());
        return BluetoothDeviceCompat.createBond(bluetoothDevice);
    }

    public boolean createBondOfClassic(@NonNull BluetoothDevice bluetoothDevice) {
        BleLog.d("createBondOfClassic: " + bluetoothDevice.getAddress());
        return BluetoothDeviceCompat.createBond(bluetoothDevice, 1);
    }

    public boolean disconnectA2dp(@NonNull BluetoothDevice bluetoothDevice) {
        BleLog.d("disconnectA2dp: " + bluetoothDevice.getAddress());
        return BluetoothProfileManager.getInstance().disconnectA2dpSource(bluetoothDevice.getAddress());
    }

    public boolean disconnectHeadset(@NonNull BluetoothDevice bluetoothDevice) {
        BleLog.d("disconnectHeadset: " + bluetoothDevice.getAddress());
        return BluetoothProfileManager.getInstance().disconnectHfp(bluetoothDevice.getAddress());
    }

    public boolean getConnectionState(@NonNull BluetoothDevice bluetoothDevice, int i8) {
        return BluetoothProfileManager.getInstance().getConnectionState(i8, bluetoothDevice) == 2;
    }

    public boolean hasProfile(int i8) {
        return BluetoothProfileManager.getInstance().getProfileProxy(i8);
    }

    public void setBondStateListener(BluetoothBondStateListener bluetoothBondStateListener) {
        this.bondStateListener = bluetoothBondStateListener;
    }

    @SuppressLint({"MissingPermission"})
    public boolean unBondDevice(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        if (bluetoothDevice.getBondState() != 10) {
            return BluetoothDeviceCompat.removeBond(bluetoothDevice);
        }
        return true;
    }
}
