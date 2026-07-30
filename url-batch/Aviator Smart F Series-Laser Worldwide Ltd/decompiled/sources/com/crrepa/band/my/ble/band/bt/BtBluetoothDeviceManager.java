package com.crrepa.band.my.ble.band.bt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.device.appmarket.map.WatchMapHelper;
import com.crrepa.ble.conn.bond.CRPBluetoothManager;
import com.crrepa.ble.conn.queue.CRPBleMessageManage;
import com.moyoung.dafit.module.common.utils.b;
import com.moyoung.dafit.module.common.utils.d;
import com.orhanobut.logger.f;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class BtBluetoothDeviceManager {
    private static final String ALPS = "alps";
    private static final int BLE_CMD_DELAY = 10;
    private static final int BT_ACTION_DELAY = 5;
    private static final String CMA_AN00 = "CMA-AN00";
    private static final String GOOGLE = "Google";
    private static final String HONOR = "HONOR";
    private static final int MAX_CONNECT_COUNT = 1;
    private static final String V2065A = "V2065A";
    private static final String VIVO = "vivo";
    private static final String WATCH_BT11 = "BT11";
    private CRPBluetoothManager bluetoothManager;
    private Disposable bondSubscribe;
    private BluetoothDevice btBluetoothDevice;
    private boolean classicBond;
    private Disposable connectHeadsetSubscribe;
    private boolean createBond;
    private Disposable disconnectA2dpSubscribe;
    private int headsetConnectCount;
    private boolean manualConnectionMode;
    private boolean removeBond;

    private static class Holder {
        private static final BtBluetoothDeviceManager INSTANCE = new BtBluetoothDeviceManager();

        private Holder() {
        }
    }

    static /* synthetic */ int access$1208(BtBluetoothDeviceManager btBluetoothDeviceManager) {
        int i8 = btBluetoothDeviceManager.headsetConnectCount;
        btBluetoothDeviceManager.headsetConnectCount = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectHeadset() {
        Disposable disposable = this.connectHeadsetSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.connectHeadsetSubscribe.dispose();
        this.connectHeadsetSubscribe = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelDisconnectA2dp() {
        Disposable disposable = this.disconnectA2dpSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.disconnectA2dpSubscribe.dispose();
        this.disconnectA2dpSubscribe = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean connectA2dp() {
        if (this.btBluetoothDevice == null) {
            return false;
        }
        boolean connectionState = getConnectionState(1);
        f.d("a2dp connectionState: " + connectionState);
        boolean connectA2dp = connectionState ? false : this.bluetoothManager.connectA2dp(this.btBluetoothDevice);
        f.d("connectA2dp: " + connectA2dp);
        return connectA2dp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean connectHeadset() {
        if (this.btBluetoothDevice == null) {
            return false;
        }
        boolean connectionState = getConnectionState(4);
        f.d("headset connectionState: " + connectionState);
        boolean connectHeadset = connectionState ? false : this.bluetoothManager.connectHeadset(this.btBluetoothDevice);
        f.d("connectHeadset: " + connectHeadset);
        return connectHeadset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayConnectHeadset() {
        this.manualConnectionMode = false;
        this.connectHeadsetSubscribe = Observable.timer(5L, TimeUnit.SECONDS).subscribe(new Consumer<Long>() { // from class: com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager.2
            @Override // io.reactivex.functions.Consumer
            public void accept(Long l8) {
                BtBluetoothDeviceManager.this.manualConnectionMode = true;
                if (BtBluetoothDeviceManager.this.connectHeadset()) {
                    return;
                }
                BtBluetoothDeviceManager.this.connectA2dp();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void delayDisconnectA2dp() {
        this.disconnectA2dpSubscribe = Observable.timer(5L, TimeUnit.SECONDS).subscribe(new Consumer<Long>() { // from class: com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager.3
            @Override // io.reactivex.functions.Consumer
            public void accept(Long l8) {
                BtBluetoothDeviceManager.this.disconnectA2dp();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectA2dp() {
        if (this.btBluetoothDevice != null) {
            f.d("a2dp connectionState: " + getConnectionState(1));
            boolean disconnectA2dp = this.bluetoothManager.disconnectA2dp(this.btBluetoothDevice);
            f.d("disconnectA2dp: " + disconnectA2dp);
            if (disconnectA2dp) {
                Observable.timer(5L, TimeUnit.SECONDS).subscribe(new Consumer<Comparable<? extends Comparable<?>>>() { // from class: com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager.5
                    @Override // io.reactivex.functions.Consumer
                    public void accept(Comparable<? extends Comparable<?>> comparable) {
                        if (BtBluetoothDeviceManager.this.removeBond) {
                            BtBluetoothDeviceManager.this.disconnectGatt();
                        }
                    }
                });
            } else {
                disconnectGatt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectGatt() {
        f.d("disconnectGatt: " + this.removeBond);
        if (this.removeBond) {
            this.removeBond = false;
            com.crrepa.band.my.ble.band.connect.a.disconnect(false);
        }
    }

    private boolean disconnectHeadset() {
        if (this.btBluetoothDevice == null) {
            return false;
        }
        f.d("headset connectionState: " + getConnectionState(4));
        boolean disconnectHeadset = this.bluetoothManager.disconnectHeadset(this.btBluetoothDevice);
        f.d("disconnectHeadset: " + disconnectHeadset);
        return disconnectHeadset;
    }

    private boolean getConnectionState(int i8) {
        BluetoothDevice bluetoothDevice = this.btBluetoothDevice;
        if (bluetoothDevice == null) {
            return false;
        }
        return this.bluetoothManager.getConnectionState(bluetoothDevice, i8);
    }

    public static BtBluetoothDeviceManager getInstance() {
        return Holder.INSTANCE;
    }

    private boolean hasBluetoothConnectPermission() {
        return 31 > Build.VERSION.SDK_INT || ContextCompat.checkSelfPermission(d.get(), "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    private boolean isClassicBond() {
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        if (aVar.isJieli() || aVar.isSifli() || aVar.isHisilicon() || aVar.isBluetrum() || aVar.isRealtek8773() || com.moyoung.dafit.module.common.utils.a.isHarmonyOs()) {
            return true;
        }
        String manufacturer = b.getManufacturer();
        String systemModel = b.getSystemModel();
        f.d("manufacturer: " + manufacturer);
        f.d("model: " + systemModel);
        if (TextUtils.isEmpty(manufacturer) || TextUtils.isEmpty(systemModel)) {
            return false;
        }
        manufacturer.hashCode();
        switch (manufacturer) {
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
    public /* synthetic */ void lambda$startBondTimer$0(Long l8) {
        f.d("No status change after createBond!");
        connectHeadset();
    }

    private void startBondTimer() {
        this.bondSubscribe = Observable.timer(20L, TimeUnit.SECONDS).subscribe(new Consumer() { // from class: com.crrepa.band.my.ble.band.bt.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BtBluetoothDeviceManager.this.lambda$startBondTimer$0((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMapNavigation(@NonNull BluetoothDevice bluetoothDevice) {
        try {
            WatchMapHelper.getInstance().connect(bluetoothDevice.getAddress());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBondTimer() {
        Disposable disposable = this.bondSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.bondSubscribe.dispose();
    }

    private void stopMapNavigation() {
        try {
            WatchMapHelper.getInstance().close();
        } catch (Throwable th) {
            th.printStackTrace();
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

    public void close() {
        f.d("close: " + this.removeBond);
        if (this.removeBond) {
            this.removeBond = false;
            com.crrepa.band.my.ble.band.connect.f.getInstance().closeGatt();
            unBondDevice();
        }
    }

    @SuppressLint({"MissingPermission"})
    public void createBond(@NonNull BluetoothDevice bluetoothDevice) {
        this.classicBond = isClassicBond() && !TextUtils.equals(bluetoothDevice.getName(), WATCH_BT11);
        f.d("classicBond: " + this.classicBond);
        this.createBond = true;
        this.removeBond = false;
        this.headsetConnectCount = 0;
        this.btBluetoothDevice = bluetoothDevice;
        boolean hasBluetoothConnectPermission = hasBluetoothConnectPermission();
        f.d("createBond hasBluetoothConnectPermission: " + hasBluetoothConnectPermission);
        int bondState = hasBluetoothConnectPermission ? this.btBluetoothDevice.getBondState() : 10;
        f.d("bondState: " + bondState);
        if (bondState != 10) {
            if (bondState == 12) {
                delayConnectHeadset();
                startMapNavigation(bluetoothDevice);
                return;
            }
            return;
        }
        boolean createBondOfClassic = this.classicBond ? createBondOfClassic(bluetoothDevice) : this.bluetoothManager.createBond(this.btBluetoothDevice);
        startBondTimer();
        f.d("createBond: " + createBondOfClassic);
        if (createBondOfClassic) {
            CRPBleMessageManage.getInstance().stop();
            Observable.timer(10L, TimeUnit.SECONDS).subscribe(new Consumer<Comparable<? extends Comparable<?>>>() { // from class: com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager.4
                @Override // io.reactivex.functions.Consumer
                public void accept(Comparable<? extends Comparable<?>> comparable) {
                    CRPBleMessageManage.getInstance().start();
                }
            });
        }
    }

    public boolean createBondOfClassic(@NonNull BluetoothDevice bluetoothDevice) {
        try {
            Method method = bluetoothDevice.getClass().getMethod("createBond", Integer.TYPE);
            f.d("device.createBond(int transport) (hidden)");
            method.setAccessible(true);
            return ((Boolean) method.invoke(bluetoothDevice, 1)).booleanValue();
        } catch (Exception e8) {
            f.d("An exception occurred while creating bond", e8);
            return false;
        }
    }

    public boolean isRemoveBond() {
        return this.removeBond;
    }

    @SuppressLint({"MissingPermission"})
    public void removeBond(@NonNull BluetoothDevice bluetoothDevice, boolean z7) {
        f.d("removeBond dualMode: " + z7);
        this.btBluetoothDevice = bluetoothDevice;
        this.createBond = false;
        this.removeBond = true;
        stopMapNavigation();
        if (!z7) {
            com.crrepa.band.my.ble.band.connect.a.disconnect(false);
            unBondDevice();
        } else {
            com.crrepa.band.my.ble.band.connect.f.getInstance().startUnBond();
            if (disconnectHeadset()) {
                return;
            }
            disconnectA2dp();
        }
    }

    public void unBondDevice() {
        if (this.btBluetoothDevice != null) {
            boolean hasBluetoothConnectPermission = hasBluetoothConnectPermission();
            f.d("unBondDevice hasBluetoothConnectPermission: " + hasBluetoothConnectPermission);
            f.d("unBond: " + (hasBluetoothConnectPermission ? this.bluetoothManager.unBondDevice(this.btBluetoothDevice) : BluetoothDeviceCompat.removeBond(this.btBluetoothDevice)));
            this.btBluetoothDevice = null;
        }
    }

    private BtBluetoothDeviceManager() {
        this.createBond = false;
        this.removeBond = false;
        this.headsetConnectCount = 0;
        this.manualConnectionMode = false;
        CRPBluetoothManager cRPBluetoothManager = CRPBluetoothManager.getInstance(d.get());
        this.bluetoothManager = cRPBluetoothManager;
        cRPBluetoothManager.setBondStateListener(new CRPBluetoothManager.BluetoothBondStateListener() { // from class: com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager.1
            private boolean isEmptyDevice(BluetoothDevice bluetoothDevice) {
                return BtBluetoothDeviceManager.this.btBluetoothDevice == null || !TextUtils.equals(bluetoothDevice.getAddress(), BtBluetoothDeviceManager.this.btBluetoothDevice.getAddress());
            }

            @Override // com.crrepa.ble.conn.bond.CRPBluetoothManager.BluetoothBondStateListener
            public void onBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
                f.d("onBondStateChanged: " + bluetoothDevice.getAddress() + "=" + i8);
                if (isEmptyDevice(bluetoothDevice)) {
                    return;
                }
                if (i8 != 11) {
                    CRPBleMessageManage.getInstance().start();
                    BtBluetoothDeviceManager.this.stopBondTimer();
                }
                if (i8 == 12 && !BtBluetoothDeviceManager.this.classicBond) {
                    BtBluetoothDeviceManager.this.delayConnectHeadset();
                } else if (i8 == 10) {
                    BtBluetoothDeviceManager.this.removeBond = false;
                }
            }

            @Override // com.crrepa.ble.conn.bond.CRPBluetoothManager.BluetoothBondStateListener
            public void onConnectionState(BluetoothDevice bluetoothDevice, int i8, int i9) {
                if (isEmptyDevice(bluetoothDevice)) {
                    return;
                }
                f.d("onConnectionState: profile = " + i8 + ", state = " + i9);
                StringBuilder sb = new StringBuilder();
                sb.append("createBond = ");
                sb.append(BtBluetoothDeviceManager.this.createBond);
                f.d(sb.toString());
                f.d("removeBond = " + BtBluetoothDeviceManager.this.removeBond);
                if (!BtBluetoothDeviceManager.this.createBond) {
                    if (BtBluetoothDeviceManager.this.removeBond) {
                        if (i8 != 1) {
                            if (i8 == 4 && i9 == 0) {
                                BtBluetoothDeviceManager.this.delayDisconnectA2dp();
                                return;
                            }
                            return;
                        }
                        if (i9 == 0) {
                            BtBluetoothDeviceManager.this.cancelDisconnectA2dp();
                            BtBluetoothDeviceManager.this.disconnectGatt();
                            return;
                        }
                        return;
                    }
                    return;
                }
                BtBluetoothDeviceManager.this.cancelConnectHeadset();
                BtBluetoothDeviceManager.this.updateCreateBondState(i8, i9);
                if (i8 != 4) {
                    return;
                }
                if (i9 == 2) {
                    BtBluetoothDeviceManager.this.startMapNavigation(bluetoothDevice);
                    if (BtBluetoothDeviceManager.this.manualConnectionMode) {
                        BtBluetoothDeviceManager.this.connectA2dp();
                        return;
                    }
                    return;
                }
                if (i9 != 0 || BtBluetoothDeviceManager.this.headsetConnectCount >= 1) {
                    return;
                }
                BtBluetoothDeviceManager.access$1208(BtBluetoothDeviceManager.this);
                BtBluetoothDeviceManager.this.connectHeadset();
            }
        });
    }
}
