package com.crrepa.ble.conn.bond;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.ble.conn.bond.CRPBluetoothManager;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.d;
import z3.a;

/* loaded from: classes3.dex */
public class CRPBtBluetoothBondManager {
    private static final String ALPS = "alps";
    private static final int BT_ACTION_DELAY = 5000;
    private static final String CMA_AN00 = "CMA-AN00";
    private static final int DELAY_CONNECT_HEADSET_MSG = 1;
    private static final int DELAY_DISCONNECT_A2DP_MSG = 2;
    private static final String GOOGLE = "Google";
    private static final String HONOR = "HONOR";
    private static final int MAX_CONNECT_COUNT = 3;
    private static final String V2065A = "V2065A";
    private static final String VIVO = "vivo";
    private int a2dpConnectCount;
    private BluetoothBondStateListener bluetoothBondStateListener;
    private CRPBluetoothManager bluetoothManager;
    private BluetoothDevice btBluetoothDevice;
    private Handler btConnectHandler;
    private boolean classicBond;
    private boolean createBond;
    private int headsetConnectCount;
    private boolean manualConnectionMode;
    private boolean removeBond;

    public interface BluetoothBondStateListener extends CRPBluetoothManager.BluetoothBondStateListener {
        void onBleDisconnect();
    }

    private static class Holder {
        private static final CRPBtBluetoothBondManager INSTANCE = new CRPBtBluetoothBondManager();

        private Holder() {
        }
    }

    private CRPBtBluetoothBondManager() {
        this.createBond = false;
        this.removeBond = false;
        this.classicBond = true;
        this.headsetConnectCount = 0;
        this.a2dpConnectCount = 0;
        this.manualConnectionMode = false;
        this.btConnectHandler = new Handler(Looper.getMainLooper()) { // from class: com.crrepa.ble.conn.bond.CRPBtBluetoothBondManager.2
            @Override // android.os.Handler
            public void handleMessage(@NonNull Message message) {
                super.handleMessage(message);
                int i8 = message.what;
                if (i8 != 1) {
                    if (i8 != 2) {
                        return;
                    }
                    CRPBtBluetoothBondManager.this.disconnectA2dp();
                } else {
                    CRPBtBluetoothBondManager.this.manualConnectionMode = true;
                    if (CRPBtBluetoothBondManager.this.connectHeadset()) {
                        return;
                    }
                    CRPBtBluetoothBondManager.this.connectA2dp();
                }
            }
        };
        CRPBluetoothManager cRPBluetoothManager = CRPBluetoothManager.getInstance(d.a());
        this.bluetoothManager = cRPBluetoothManager;
        cRPBluetoothManager.setBondStateListener(new CRPBluetoothManager.BluetoothBondStateListener() { // from class: com.crrepa.ble.conn.bond.CRPBtBluetoothBondManager.1
            @Override // com.crrepa.ble.conn.bond.CRPBluetoothManager.BluetoothBondStateListener
            public void onBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
                BleLog.d("onBondStateChanged: " + i8);
                if (CRPBtBluetoothBondManager.this.isEmptyDevice(bluetoothDevice)) {
                    return;
                }
                if (CRPBtBluetoothBondManager.this.bluetoothBondStateListener != null) {
                    CRPBtBluetoothBondManager.this.bluetoothBondStateListener.onBondStateChanged(bluetoothDevice, i8);
                }
                if (i8 == 12 && !CRPBtBluetoothBondManager.this.classicBond) {
                    CRPBtBluetoothBondManager.this.delayConnectHeadset();
                } else if (i8 == 10) {
                    CRPBtBluetoothBondManager.this.removeBond = false;
                }
            }

            @Override // com.crrepa.ble.conn.bond.CRPBluetoothManager.BluetoothBondStateListener
            public void onConnectionState(BluetoothDevice bluetoothDevice, int i8, int i9) {
                BleLog.d("onConnectionState: profile = " + i8 + ", state = " + i9);
                if (CRPBtBluetoothBondManager.this.isEmptyDevice(bluetoothDevice)) {
                    return;
                }
                if (CRPBtBluetoothBondManager.this.bluetoothBondStateListener != null) {
                    CRPBtBluetoothBondManager.this.bluetoothBondStateListener.onConnectionState(bluetoothDevice, i8, i9);
                }
                BleLog.d("createBond = " + CRPBtBluetoothBondManager.this.createBond);
                BleLog.d("removeBond = " + CRPBtBluetoothBondManager.this.removeBond);
                if (!CRPBtBluetoothBondManager.this.createBond) {
                    if (CRPBtBluetoothBondManager.this.removeBond) {
                        if (i8 != 1) {
                            if (i8 == 4 && i9 == 0) {
                                CRPBtBluetoothBondManager.this.delayDisconnectA2dp();
                                return;
                            }
                            return;
                        }
                        if (i9 == 0) {
                            CRPBtBluetoothBondManager.this.cancelDisconnectA2dp();
                            CRPBtBluetoothBondManager.this.onBleDisconnect();
                            return;
                        }
                        return;
                    }
                    return;
                }
                CRPBtBluetoothBondManager.this.cancelConnectHeadset();
                CRPBtBluetoothBondManager.this.updateCreateBondState(i8, i9);
                if (i8 != 1) {
                    if (i8 != 4) {
                        return;
                    }
                    if (i9 != 2 || !CRPBtBluetoothBondManager.this.manualConnectionMode) {
                        if (i9 != 0 || CRPBtBluetoothBondManager.this.headsetConnectCount >= 3) {
                            return;
                        }
                        CRPBtBluetoothBondManager.access$1208(CRPBtBluetoothBondManager.this);
                        CRPBtBluetoothBondManager.this.connectHeadset();
                        return;
                    }
                } else if (i9 != 0 || CRPBtBluetoothBondManager.this.a2dpConnectCount >= 3) {
                    return;
                } else {
                    CRPBtBluetoothBondManager.access$1408(CRPBtBluetoothBondManager.this);
                }
                CRPBtBluetoothBondManager.this.connectA2dp();
            }
        });
    }

    static /* synthetic */ int access$1208(CRPBtBluetoothBondManager cRPBtBluetoothBondManager) {
        int i8 = cRPBtBluetoothBondManager.headsetConnectCount;
        cRPBtBluetoothBondManager.headsetConnectCount = i8 + 1;
        return i8;
    }

    static /* synthetic */ int access$1408(CRPBtBluetoothBondManager cRPBtBluetoothBondManager) {
        int i8 = cRPBtBluetoothBondManager.a2dpConnectCount;
        cRPBtBluetoothBondManager.a2dpConnectCount = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectHeadset() {
        this.btConnectHandler.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelDisconnectA2dp() {
        this.btConnectHandler.removeMessages(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean connectA2dp() {
        boolean connectionState = this.bluetoothManager.getConnectionState(this.btBluetoothDevice, 1);
        BleLog.d("a2dp connectionState: " + connectionState);
        boolean connectA2dp = !connectionState ? this.bluetoothManager.connectA2dp(this.btBluetoothDevice) : false;
        BleLog.d("connectA2dp: " + connectA2dp);
        return connectA2dp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean connectHeadset() {
        boolean connectionState = this.bluetoothManager.getConnectionState(this.btBluetoothDevice, 4);
        BleLog.d("headset connectionState: " + connectionState);
        boolean connectHeadset = !connectionState ? this.bluetoothManager.connectHeadset(this.btBluetoothDevice) : false;
        BleLog.d("connectHeadset: " + connectHeadset);
        return connectHeadset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayConnectHeadset() {
        this.manualConnectionMode = false;
        this.btConnectHandler.sendEmptyMessageDelayed(1, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayDisconnectA2dp() {
        this.btConnectHandler.sendEmptyMessageDelayed(2, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectA2dp() {
        BluetoothDevice bluetoothDevice = this.btBluetoothDevice;
        boolean disconnectA2dp = bluetoothDevice != null ? this.bluetoothManager.disconnectA2dp(bluetoothDevice) : false;
        BleLog.d("disconnectA2dp: " + disconnectA2dp);
        if (disconnectA2dp) {
            return;
        }
        onBleDisconnect();
    }

    public static CRPBtBluetoothBondManager getInstance() {
        return Holder.INSTANCE;
    }

    private boolean isClassicBond() {
        if (a.f()) {
            return true;
        }
        String a8 = a.a();
        String d8 = a.d();
        BleLog.d("manufacturer: " + a8);
        BleLog.d("model: " + d8);
        if (TextUtils.isEmpty(a8) || TextUtils.isEmpty(d8)) {
            return false;
        }
        a8.hashCode();
        switch (a8) {
            case "alps":
            case "vivo":
            case "HONOR":
            case "Google":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEmptyDevice(BluetoothDevice bluetoothDevice) {
        return this.btBluetoothDevice == null || bluetoothDevice == null || !TextUtils.equals(bluetoothDevice.getAddress(), this.btBluetoothDevice.getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBleDisconnect() {
        BluetoothBondStateListener bluetoothBondStateListener = this.bluetoothBondStateListener;
        if (bluetoothBondStateListener != null) {
            bluetoothBondStateListener.onBleDisconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCreateBondState(int i8, int i9) {
        if (i9 == 2) {
            if (i8 == 1 || !this.bluetoothManager.hasProfile(1)) {
                this.createBond = false;
                this.btBluetoothDevice = null;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void createBond(@NonNull BluetoothDevice bluetoothDevice) {
        this.createBond = true;
        this.removeBond = false;
        this.headsetConnectCount = 0;
        this.a2dpConnectCount = 0;
        this.btBluetoothDevice = bluetoothDevice;
        int bondState = bluetoothDevice.getBondState();
        BleLog.d("bondState: " + bondState);
        if (bondState != 10) {
            if (bondState == 12) {
                delayConnectHeadset();
            }
        } else {
            BleLog.d("createBond: " + this.bluetoothManager.createBondOfClassic(bluetoothDevice));
        }
    }

    @SuppressLint({"MissingPermission"})
    public void removeBond(@NonNull BluetoothDevice bluetoothDevice, boolean z7) {
        BleLog.d("removeBond");
        this.btBluetoothDevice = bluetoothDevice;
        this.createBond = false;
        this.removeBond = true;
        if (!z7) {
            unBondDevice();
            return;
        }
        boolean disconnectHeadset = this.bluetoothManager.disconnectHeadset(bluetoothDevice);
        BleLog.d("disconnectHeadset: " + disconnectHeadset);
        if (disconnectHeadset) {
            return;
        }
        disconnectA2dp();
    }

    public void setBluetoothBondStateListener(BluetoothBondStateListener bluetoothBondStateListener) {
        this.bluetoothBondStateListener = bluetoothBondStateListener;
    }

    public void unBondDevice() {
        BluetoothDevice bluetoothDevice = this.btBluetoothDevice;
        if (bluetoothDevice != null) {
            BleLog.d("unBond: " + this.bluetoothManager.unBondDevice(bluetoothDevice));
            this.btBluetoothDevice = null;
        }
    }
}
