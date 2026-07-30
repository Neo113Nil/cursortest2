package com.crrepa.ble.sifli.dfu;

import android.app.IntentService;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.crrepa.ble.sifli.dfu.constants.General;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.crrepa.ble.util.BleLog;
import com.google.android.exoplayer2.ExoPlayer;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public class SifliDFUService extends IntentService {
    private static final String ACTION_NAND = "com.sifli.siflidfu.action.NAND";
    private static final String ACTION_NOR_V1 = "com.sifli.siflidfu.action.NOR_V1";
    private static final String ACTION_NOR_V2 = "com.sifli.siflidfu.action.NOR_V2";
    public static final String BROADCAST_DFU_LOG = "com.sifli.siflidfu.BROADCAST_DFU_LOG";
    public static final String BROADCAST_DFU_PROGRESS = "com.sifli.siflidfu.EXTRA_BROADCAST_PROGRESS";
    public static final String BROADCAST_DFU_STATE = "com.sifli.siflidfu.BROADCAST_DFU_STATE";
    private static final String EXTRA_ADDRESS = "com.sifli.siflidfu.extra.ADDRESS";
    private static final String EXTRA_BLE_DATA = "com.sifli.siflidfu.extra.BLE_DATA";
    public static final String EXTRA_DFU_PROGRESS = "com.sifli.siflidfu.EXTRA_DFU_PROGRESS";
    public static final String EXTRA_DFU_PROGRESS_TYPE = "com.sifli.siflidfu.EXTRA_DFU_PROGRESS_TYPE";
    public static final String EXTRA_DFU_STATE = "com.sifli.siflidfu.EXTRA_DFU_STATE";
    public static final String EXTRA_DFU_STATE_RESULT = "com.sifli.siflidfu.EXTRA_DFU_STATE_RESULT";
    private static final String EXTRA_IMAGES = "com.sifli.siflidfu.extra.IMAGES";
    public static final String EXTRA_LOG_LEVEL = "com.sifli.siflidfu.LOG_LEVEL";
    public static final String EXTRA_LOG_MESSAGE = "com.sifli.siflidfu.EXTRA_LOG_MESSAGE";
    private static final String EXTRA_NUM_OF_RSP = "com.sifli.siflidfu.extra.PARAM2";
    private static final String EXTRA_RESUME_MODE = "com.sifli.siflidfu.extra.PARAM1";
    private static boolean isReleased = true;
    private final int MAX_RETRY_CONNECT_COUNT;
    int countAll;
    int countCurrent;
    int countPrevious;
    private BroadcastReceiver mBleBroadcastReceiver;
    private Handler mBleHandler;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothDevice mBluetoothDevice;
    private BluetoothGatt mBluetoothGatt;
    private final Runnable mConnectTimerRunnable;
    private int mConnectionState;
    private int mConnectionStatus;
    private int mCurrentRetryCount;
    DFUState mDFUState;
    private final Runnable mDfuCommandTimerRunnable;
    private final Runnable mDiscoveryTimerRunnable;
    private int mError;
    private BluetoothGattCallback mGattCallback;
    private int mImageSkipInfo;
    private boolean mIsDescriptorWrite;
    private boolean mIsRemoteBoot;
    private int mLastCateID;
    private final int mLoadFileMode;
    private final Object mLock;
    private long mLoseCheckTime;
    private int mMaxPacketLen;
    int mProgressType;
    private int mRemoteBoot;
    private int mRemoteCurrentIndex;
    private int mRemoteImageID;
    private int mRemoteResume;
    private int mRemoteResumeCount;
    private int mRemoteResumeNumOfRsp;
    private int mRemoteResumeRestart;
    private int mRspFreq;
    private boolean mRspReceive;
    private boolean mSendAvailable;
    private Handler mTimerHandler;
    private int mWaitEndMode;
    private BluetoothGattCharacteristic mWriteCharacteristic;
    private final Runnable mWriteDescriptorTimerRunnable;
    private boolean misAlreadyConnect;
    byte[] receiveData;
    int receiveDataCurrentLen;
    int receiveDataLen;

    private class bleHandlerCallback implements Handler.Callback {
        private bleHandlerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (SifliDFUService.this.mConnectionState == 0 || SifliDFUService.this.mError != 0) {
                BleLog.e("handle exit " + SifliDFUService.this.mError);
                return false;
            }
            int i8 = message.what;
            if (i8 != 0) {
                if (i8 == 1) {
                    byte b8 = message.getData().getByteArray(SifliDFUService.EXTRA_BLE_DATA)[1];
                    if (b8 == 0 || b8 == 1) {
                        SifliDFUService sifliDFUService = SifliDFUService.this;
                        int i9 = sifliDFUService.countCurrent + 1;
                        sifliDFUService.countCurrent = i9;
                        sifliDFUService.sendDFUProgressBroadcast(((i9 + sifliDFUService.countPrevious) * 100) / sifliDFUService.countAll, sifliDFUService.mProgressType);
                    }
                }
                return false;
            }
            byte[] byteArray = message.getData().getByteArray(SifliDFUService.EXTRA_BLE_DATA);
            if (SifliDFUService.this.mWriteCharacteristic == null || SifliDFUService.this.mBluetoothGatt == null) {
                return false;
            }
            SifliDFUService.this.mWriteCharacteristic.setValue(byteArray);
            SifliDFUService.this.mWriteCharacteristic.setWriteType(1);
            SifliDFUService.this.mSendAvailable = false;
            if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(SifliDFUService.this, "android.permission.BLUETOOTH_CONNECT") != 0) {
                BleLog.e("no Permission");
                SifliDFUService.this.mError = 61;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
                return false;
            }
            SifliDFUService.this.mBluetoothGatt.writeCharacteristic(SifliDFUService.this.mWriteCharacteristic);
            synchronized (SifliDFUService.this.mLock) {
                while (!SifliDFUService.this.mSendAvailable && SifliDFUService.this.mError == 0) {
                    try {
                        SifliDFUService.this.mLock.wait();
                    } catch (InterruptedException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            return false;
        }
    }

    public SifliDFUService() {
        super("SifliDFUIntentService");
        this.mMaxPacketLen = 20;
        this.mRemoteBoot = 0;
        this.mLoadFileMode = 0;
        this.MAX_RETRY_CONNECT_COUNT = 2;
        this.mLock = new Object();
        this.mTimerHandler = new Handler();
        this.mConnectTimerRunnable = new Runnable() { // from class: com.crrepa.ble.sifli.dfu.SifliDFUService.2
            @Override // java.lang.Runnable
            public void run() {
                BleLog.e("connect call timeout, system bt may error");
                SifliDFUService.this.mError = 62;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notify();
                }
            }
        };
        this.mWriteDescriptorTimerRunnable = new Runnable() { // from class: com.crrepa.ble.sifli.dfu.SifliDFUService.3
            @Override // java.lang.Runnable
            public void run() {
                BleLog.e("write descriptor timeout");
                SifliDFUService.this.mError = 68;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
        this.mDfuCommandTimerRunnable = new Runnable() { // from class: com.crrepa.ble.sifli.dfu.SifliDFUService.4
            @Override // java.lang.Runnable
            public void run() {
                BleLog.e("ota command timeout");
                SifliDFUService.this.mError = 79;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
        this.mDiscoveryTimerRunnable = new Runnable() { // from class: com.crrepa.ble.sifli.dfu.SifliDFUService.5
            @Override // java.lang.Runnable
            public void run() {
                BleLog.e("discovery timeout");
                SifliDFUService.this.sendLogBroadcast(5, "discovery timeout");
                SifliDFUService.this.mError = 67;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
    }

    private BluetoothGatt connect(BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        BluetoothGatt connectGatt;
        if (!this.mBluetoothAdapter.isEnabled()) {
            return null;
        }
        this.mConnectionState = 1;
        BleLog.d("connecting to " + bluetoothDevice);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
            BleLog.e("no Permission");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return null;
        }
        if (i8 >= 26) {
            sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, preferredPhy = LE_1M|LE_2M)");
            connectGatt = bluetoothDevice.connectGatt(this, false, bluetoothGattCallback, 2, 3);
        } else if (i8 >= 23) {
            sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)");
            connectGatt = bluetoothDevice.connectGatt(this, false, bluetoothGattCallback, 2);
        } else {
            sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false)");
            connectGatt = bluetoothDevice.connectGatt(this, false, bluetoothGattCallback);
        }
        this.mTimerHandler.postDelayed(this.mConnectTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        int i9 = this.mConnectionState;
                        if ((i9 == 1 || i9 == 2) && this.mError == 0) {
                            this.mLock.wait();
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mConnectTimerRunnable);
        if (this.mError == 62) {
            return null;
        }
        return connectGatt;
    }

    private boolean connectDevice(String str, BluetoothGattCallback bluetoothGattCallback) {
        String format;
        String str2;
        BleLog.d("init connect");
        this.mError = 0;
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        this.mBluetoothDevice = remoteDevice;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        BluetoothGatt connect = connect(remoteDevice, bluetoothGattCallback);
        if (this.mError == 62) {
            BleLog.e("system bluetooth no response");
            sendLogBroadcast(20, "system bluetooth no response");
            close(connect);
            return false;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (connect == null) {
            this.mError = 63;
            BleLog.e("Bluetooth adapter disabled");
            sendLogBroadcast(20, "Bluetooth adapter disabled");
            return false;
        }
        if (this.mDFUState.getState() == 10) {
            for (int i8 = 0; i8 < 2; i8++) {
                BleLog.d("retry connect, count " + i8);
                connect = connect(remoteDevice, bluetoothGattCallback);
                if (this.mDFUState.getState() != 10) {
                    if (this.mError != 0) {
                        str2 = "other fail " + this.mError;
                    } else {
                        int i9 = this.mConnectionState;
                        if (i9 == 2 || i9 == 3) {
                            str2 = "retry success";
                        }
                    }
                    BleLog.d(str2);
                    break;
                }
            }
        }
        this.mBluetoothGatt = connect;
        int i10 = this.mError;
        if (i10 <= 0 || i10 == 64) {
            if (this.mConnectionState != 0) {
                BleLog.d("connect success");
                sendLogBroadcast(5, "Services discovered");
                return true;
            }
            this.mError = 65;
            BleLog.e("Disconnect due to state disconnect");
            sendLogBroadcast(20, "Disconnected");
            close(connect);
            return false;
        }
        int i11 = this.mConnectionStatus;
        if (i10 == 65) {
            BleLog.d("Connection error after: " + (elapsedRealtime2 - elapsedRealtime) + " ms");
            if (i11 != 133 || elapsedRealtime2 <= elapsedRealtime + 25000) {
                BleLog.e("An error occurred while connecting to the device:" + i11);
                format = String.format(Locale.US, "Connection failed (0x%02X)", Integer.valueOf(i11));
            } else {
                BleLog.e("Device not reachable. Check if the device with address " + str + " is in range, is advertising and is connectable");
                format = "Error 133: Connect timeout";
            }
        } else if (i10 == 66) {
            BleLog.e("error discovery not start");
            format = String.format(Locale.US, "error discovery not start, Connection failed (0x%02X)", Integer.valueOf(i11));
        } else if (i10 == 67) {
            BleLog.e("discovery time out");
            format = String.format(Locale.US, "discovery time out, Connection failed (0x%02X)", Integer.valueOf(i11));
        } else {
            BleLog.e("An error occurred during discovering services:" + i11);
            format = String.format(Locale.US, "discovery error, Connection failed (0x%02X)", Integer.valueOf(i11));
        }
        sendLogBroadcast(20, format);
        close(connect);
        return false;
    }

    private int getAllFileLength(ArrayList<OTAFile> arrayList, int i8) {
        Iterator<OTAFile> it = arrayList.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getImageID() != -1) {
                int fileLength = next.getFileLength() % i8;
                int fileLength2 = next.getFileLength() / i8;
                if (fileLength != 0) {
                    fileLength2++;
                }
                i9 += fileLength2;
            }
        }
        BleLog.d("all file len " + i9);
        return i9;
    }

    private BroadcastReceiver getBLEBroadcastReceiver() {
        return new BroadcastReceiver() { // from class: com.crrepa.ble.sifli.dfu.SifliDFUService.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) != 10) {
                    return;
                }
                BleLog.e("Bluetooth off");
                SifliDFUService.this.mError = 74;
                SifliDFUService.this.mBleHandler.removeMessages(1);
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
    }

    private BluetoothGattCallback getEmptyGattCallback() {
        return new BluetoothGattCallback() { // from class: com.crrepa.ble.sifli.dfu.SifliDFUService.1
            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
                if (bluetoothGattCharacteristic.getUuid().toString().equals(SifliDFUService.this.mWriteCharacteristic.getUuid().toString())) {
                    SifliDFUService.this.processNotify(bluetoothGattCharacteristic.getValue());
                    synchronized (SifliDFUService.this.mLock) {
                        SifliDFUService.this.mLock.notifyAll();
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
                super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
                SifliDFUService.this.mSendAvailable = true;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.bluetooth.BluetoothGattCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
                String str;
                SifliDFUService sifliDFUService;
                int i10;
                super.onConnectionStateChange(bluetoothGatt, i8, i9);
                BleLog.d("onConnectionStateChange status " + i8 + ", new state " + i9);
                if (i9 == 2) {
                    if (SifliDFUService.this.misAlreadyConnect) {
                        str = "return for repeat";
                        BleLog.e(str);
                        return;
                    }
                    SifliDFUService.this.misAlreadyConnect = true;
                } else if (i9 == 0) {
                    SifliDFUService.this.misAlreadyConnect = false;
                }
                if (i9 != 2) {
                    if (i9 == 0) {
                        BleLog.d("disconnect with " + i8);
                        SifliDFUService.this.sendLogBroadcast(5, "disconnect with " + i8);
                        SifliDFUService.this.mConnectionStatus = i8;
                        BleLog.d("clear state");
                        SifliDFUService.this.mConnectionState = 0;
                        bluetoothGatt.close();
                        if (SifliDFUService.this.mDFUState.getState() == 2) {
                            BleLog.d("disconnect remote reboot");
                        } else if ((SifliDFUService.this.mDFUState.getState() == 9 || SifliDFUService.this.mDFUState.getState() == 10) && (i8 == 133 || i8 == 62)) {
                            BleLog.e("retry due to reboot connect 133");
                            SifliDFUService.this.mDFUState.setState(10);
                        } else {
                            sifliDFUService = SifliDFUService.this;
                            i10 = 70;
                        }
                    }
                    synchronized (SifliDFUService.this.mLock) {
                        SifliDFUService.this.mLock.notifyAll();
                    }
                    return;
                }
                if (SifliDFUService.this.mConnectionState == 3) {
                    str = "state is ready!";
                    BleLog.e(str);
                    return;
                }
                if (SifliDFUService.this.mDFUState.getState() == 2 || SifliDFUService.this.mDFUState.getState() == 10) {
                    SifliDFUService.this.mDFUState.setState(3);
                }
                SifliDFUService.this.mConnectionState = 2;
                SifliDFUService.this.waitFor(1000L);
                SifliDFUService.this.updateMtu(bluetoothGatt, SerialTrans.MTU_MAX);
                SifliDFUService.this.waitFor(1000L);
                SifliDFUService.this.refreshDeviceCache(bluetoothGatt);
                SifliDFUService.this.waitFor(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                if (SifliDFUService.this.mError != 0) {
                    BleLog.d("abort connect due to error");
                    if (Build.VERSION.SDK_INT < 31 || ContextCompat.checkSelfPermission(SifliDFUService.this, "android.permission.BLUETOOTH_CONNECT") == 0) {
                        bluetoothGatt.close();
                        synchronized (SifliDFUService.this.mLock) {
                            SifliDFUService.this.mLock.notifyAll();
                        }
                        return;
                    }
                    BleLog.e("no Permission");
                    SifliDFUService.this.mError = 61;
                    synchronized (SifliDFUService.this.mLock) {
                        SifliDFUService.this.mLock.notifyAll();
                    }
                    return;
                }
                if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(SifliDFUService.this, "android.permission.BLUETOOTH_CONNECT") != 0) {
                    BleLog.e("no Permission");
                    SifliDFUService.this.mError = 61;
                    synchronized (SifliDFUService.this.mLock) {
                        SifliDFUService.this.mLock.notifyAll();
                    }
                    return;
                }
                boolean discoverServices = bluetoothGatt.discoverServices();
                SifliDFUService.this.mTimerHandler.postDelayed(SifliDFUService.this.mDiscoveryTimerRunnable, 40000L);
                BleLog.d("Attempting to start service discovery:" + discoverServices);
                if (discoverServices) {
                    return;
                }
                sifliDFUService = SifliDFUService.this;
                i10 = 66;
                sifliDFUService.mError = i10;
                synchronized (SifliDFUService.this.mLock) {
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
                super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
                BleLog.d("onDescriptorWrite");
                SifliDFUService.this.mIsDescriptorWrite = true;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
                SifliDFUService sifliDFUService;
                int i10;
                BleLog.d("onMtuChanged " + i8 + ", status " + i9);
                if (i8 > 247) {
                    sifliDFUService = SifliDFUService.this;
                    i10 = 244;
                } else if (i8 < 23) {
                    sifliDFUService = SifliDFUService.this;
                    i10 = 20;
                } else {
                    sifliDFUService = SifliDFUService.this;
                    i10 = i8 - 3;
                }
                sifliDFUService.mMaxPacketLen = i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
            
                if (r2 == false) goto L17;
             */
            @Override // android.bluetooth.BluetoothGattCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
                super.onServicesDiscovered(bluetoothGatt, i8);
                SifliDFUService.this.mTimerHandler.removeCallbacks(SifliDFUService.this.mDiscoveryTimerRunnable);
                if (i8 == 0) {
                    BleLog.d("onServicesDiscovered");
                    boolean z7 = false;
                    for (int i9 = 0; i9 < bluetoothGatt.getServices().size(); i9++) {
                        Iterator<BluetoothGattCharacteristic> it = bluetoothGatt.getServices().get(i9).getCharacteristics().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                BluetoothGattCharacteristic next = it.next();
                                BleLog.e("find uuid: " + next.getUuid().toString() + ", expect: 00000000-0000-0200-6473-5f696c666973");
                                if (next.getUuid().toString().equals("00000000-0000-0200-6473-5f696c666973")) {
                                    BleLog.d("find serial trans UUID");
                                    SifliDFUService.this.mWriteCharacteristic = next;
                                    SifliDFUService.this.mConnectionState = 3;
                                    z7 = true;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    BleLog.e("onServicesDiscovered received: " + i8);
                    SifliDFUService.this.mError = 101;
                    SifliDFUService.this.mConnectionStatus = i8;
                    SifliDFUService.this.mConnectionState = 4;
                    SifliDFUService sifliDFUService = SifliDFUService.this;
                    sifliDFUService.sendDfuStateChangeBroadcast(sifliDFUService.mError, i8);
                }
                BleLog.e("fail to find target uuid");
                SifliDFUService.this.sendLogBroadcast(20, "fail to find target uuid");
                SifliDFUService.this.mError = 102;
                SifliDFUService.this.mConnectionState = 4;
                SifliDFUService sifliDFUService2 = SifliDFUService.this;
                sifliDFUService2.sendDfuStateChangeBroadcast(sifliDFUService2.mError, i8);
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
    }

    private OTAFile getImageByID(ArrayList<OTAFile> arrayList, int i8) {
        Iterator<OTAFile> it = arrayList.iterator();
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getImageID() == i8) {
                return next;
            }
        }
        return null;
    }

    private int getSendFileLength(ArrayList<OTAFile> arrayList, int i8, int i9) {
        Iterator<OTAFile> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getFileIndex() >= i8) {
                break;
            }
            int fileLength = next.getFileLength() % i9;
            int fileLength2 = next.getFileLength() / i9;
            if (fileLength != 0) {
                fileLength2++;
            }
            i10 += fileLength2;
        }
        return i10;
    }

    private int getSendImageLength(ArrayList<OTAFile> arrayList, int i8, int i9) {
        Iterator<OTAFile> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getImageID() != -1) {
                if (next.getImageID() >= i8) {
                    break;
                }
                int fileLength = next.getFileLength() % i9;
                int fileLength2 = next.getFileLength() / i9;
                if (fileLength != 0) {
                    fileLength2++;
                }
                i10 += fileLength2;
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int handleActionDFUNand(String str, ArrayList<DFUImagePath> arrayList, int i8, int i9) {
        int i10;
        int i11;
        ArrayList<OTAFile> imageFile;
        int i12;
        boolean z7;
        int i13;
        int init = init();
        if (init != 0) {
            return init;
        }
        HandlerThread handlerThread = new HandlerThread("BleWrite");
        handlerThread.start();
        DFUImagePath dFUImagePath = null;
        Handler handler = new Handler(handlerThread.getLooper(), new bleHandlerCallback());
        this.mBleHandler = handler;
        handler.removeCallbacksAndMessages(null);
        Iterator<DFUImagePath> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DFUImagePath next = it.next();
            if (next.getImageType() == -2) {
                dFUImagePath = next;
                break;
            }
        }
        int i14 = 1;
        boolean z8 = dFUImagePath != null;
        ArrayList<OTAFile> arrayList2 = new ArrayList<>();
        if (z8) {
            String imagePath = dFUImagePath.getImagePath();
            if (imagePath == null) {
                imagePath = FileProcess.getFilePathFromURI(this, dFUImagePath.getImageUri());
            }
            String str2 = getCacheDir() + General.resDir;
            BleLog.d("new path: " + str2);
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileProcess.deleteFolderFile(str2, false);
            FileProcess.unzipFolder(imagePath, str2);
            arrayList2 = FileProcess.getNandResFiles(str2, arrayList2, str2, this);
            if (arrayList2 == null) {
                sendLogBroadcast(5, "files are empty");
                return 60;
            }
        }
        if (!z8) {
            i10 = 0;
            i11 = 0;
        } else {
            if (!FileProcess.LoadListFile(arrayList2, this)) {
                BleLog.e("load list file fail");
                sendLogBroadcast(5, "load list file fail");
                return 73;
            }
            Iterator<OTAFile> it2 = arrayList2.iterator();
            i11 = 0;
            while (it2.hasNext()) {
                i11 += it2.next().getFileLength();
            }
            i10 = arrayList2.size();
            Collections.sort(arrayList2, new OTAFileComparator());
            BleLog.d("process res file end");
            sendLogBroadcast(5, "files count " + i10);
        }
        connectDevice(str, this.mGattCallback);
        if (this.mConnectionState != 3 || this.mError != 0) {
            return this.mError;
        }
        writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
        synchronized (this.mLock) {
            while (!this.mIsDescriptorWrite && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
        int i15 = this.mError;
        if (i15 != 0) {
            return i15;
        }
        sendDfuFileInit(i11, i10);
        int i16 = this.mError;
        if (i16 != 0) {
            if (i16 != 14) {
                return i16;
            }
            BleLog.e("res already update");
        }
        if (!z8) {
            imageFile = FileProcess.getImageFile(arrayList, this, 0);
        } else {
            if (this.mError == 0) {
                BleLog.d("sendDfuImageInitComplete resumeMode " + i8 + ", remote resume " + this.mRemoteResume);
                if (i8 == 1 && this.mRemoteResume == 1) {
                    BleLog.d("sendDfuImageInitComplete use resume");
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                sendDfuFileInitComplete(i13);
                waitFor(1000L);
                this.mProgressType = 1;
                this.mRspFreq = 1;
                this.countAll = getAllFileLength(arrayList2, General.SIFLI_DFU_PACKET_BODY_LEN_NAND);
                updateLink();
                handleDFUFileSend(i13, arrayList2);
                imageFile = FileProcess.getImageFile(arrayList, this, 0);
                if (imageFile == null) {
                    BleLog.d("no image upgrade");
                    sendLogBroadcast(5, "no image ota");
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                sendDfuFileTotalEnd(i12);
                z7 = true;
                if (i12 == 0) {
                    BleLog.d("no hcpu, ret " + init);
                    return init;
                }
                sendLogBroadcast(5, "start image ota");
                Collections.sort(imageFile, new OTAImageComparator());
                this.mRspFreq = i9;
                OTAFile imageByID = getImageByID(imageFile, -1);
                if (imageByID == null) {
                    return 72;
                }
                sendDfuImageInitExt(imageByID.getFileData());
                int i17 = this.mError;
                if (i17 != 0) {
                    return i17;
                }
                BleLog.d("sendDfuImageInitCompleteExt resumeMode " + i8 + ", remote resume " + this.mRemoteResume);
                sendLogBroadcast(5, "sendDfuImageInitCompleteExt resumeMode " + i8 + ", remote resume " + this.mRemoteResume);
                if (i8 == 1 && this.mRemoteResume == 1) {
                    BleLog.d("sendDfuImageInitComplete use resume");
                } else {
                    i14 = 0;
                }
                sendDfuImageInitCompleteExt(i14);
                this.mProgressType = 0;
                this.countAll = getAllFileLength(imageFile, General.SIFLI_DFU_PACKET_BODY_LEN_NAND);
                if (!z7) {
                    updateLink();
                }
                handleDFUImageSend(i14, imageFile, General.SIFLI_DFU_PACKET_BODY_LEN_NAND);
                int i18 = this.mError;
                if (i18 != 0) {
                    return i18;
                }
                sendDfuImageTransmissionEndWait();
                int i19 = this.mError;
                return i19 != 0 ? i19 : init;
            }
            imageFile = FileProcess.getImageFile(arrayList, this, 0);
            if (imageFile == null) {
                BleLog.d("no image upgrade");
                sendLogBroadcast(5, "no image ota");
                i12 = 0;
                z7 = false;
                if (i12 == 0) {
                }
            }
        }
        i12 = 1;
        z7 = false;
        if (i12 == 0) {
        }
    }

    private int handleActionDFUNorV1(String str, ArrayList<DFUImagePath> arrayList, int i8, int i9) {
        BleLog.d("handleActionDFUNorV1");
        int init = init();
        this.mRspFreq = i9;
        if (init != 0) {
            return init;
        }
        HandlerThread handlerThread = new HandlerThread("BleWrite");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), new bleHandlerCallback());
        this.mBleHandler = handler;
        handler.removeCallbacksAndMessages(null);
        ArrayList<OTAFile> imageFile = FileProcess.getImageFile(arrayList, this, 0);
        if (imageFile == null) {
            return 60;
        }
        Collections.sort(imageFile, new OTAImageComparator());
        connectDevice(str, this.mGattCallback);
        if (this.mConnectionState != 3 || this.mError != 0) {
            return this.mError;
        }
        writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
        synchronized (this.mLock) {
            while (!this.mIsDescriptorWrite && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
        int i10 = this.mError;
        if (i10 != 0) {
            return i10;
        }
        OTAFile imageByID = getImageByID(imageFile, -1);
        Objects.requireNonNull(imageByID);
        sendDfuImageInit(imageByID.getFileData(), i8);
        int i11 = this.mError;
        if (i11 != 0) {
            return i11;
        }
        if (this.mRemoteBoot == 1) {
            this.mDFUState.setState(2);
        }
        if (i8 == 2) {
            sendDfuImageResumeComplete();
        } else {
            sendDfuImageInitComplete();
        }
        if (this.mRemoteBoot == 1) {
            BleLog.d("wait reboot, mConnectionState " + this.mConnectionState);
            if (this.mConnectionState != 0) {
                synchronized (this.mLock) {
                    while (this.mConnectionState != 0) {
                        try {
                            this.mLock.wait();
                        } catch (InterruptedException e9) {
                            throw new RuntimeException(e9);
                        }
                    }
                }
            }
            this.mDFUState.setState(9);
            connectDevice(str, this.mGattCallback);
            if (this.mConnectionState != 3 || this.mError != 0) {
                return this.mError;
            }
            writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
            synchronized (this.mLock) {
                while (!this.mIsDescriptorWrite && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
            int i12 = this.mError;
            if (i12 != 0) {
                return i12;
            }
        }
        int i13 = i8 == 2 ? 1 : 0;
        this.mProgressType = 0;
        this.countAll = getAllFileLength(imageFile, General.SIFLI_DFU_PACKET_BODY_LEN_NOR);
        updateLink();
        int handleDFUImageSend = handleDFUImageSend(i13, imageFile, General.SIFLI_DFU_PACKET_BODY_LEN_NOR);
        BleLog.d("send image end with " + handleDFUImageSend);
        if (handleDFUImageSend != 0) {
            return handleDFUImageSend;
        }
        BleLog.d("wait end mode " + this.mWaitEndMode);
        int i14 = this.mWaitEndMode;
        if (i14 == 1) {
            sendDfuImageTransmissionEndWait();
        } else if (i14 == 0) {
            sendDfuImageTransmissionEnd();
        } else if (i14 == 2) {
            sendDfuImageTransmissionEndWait();
            sendDfuEndCommand(this.mError);
        }
        int i15 = this.mError;
        return i15 != 0 ? i15 : handleDFUImageSend;
    }

    private int handleActionDFUNorV2(String str, ArrayList<DFUImagePath> arrayList, int i8, int i9) {
        int i10;
        BleLog.d("handleActionDFUNorV2");
        sendLogBroadcast(5, "OTA START");
        int init = init();
        this.mRspFreq = i9;
        if (init != 0) {
            return init;
        }
        HandlerThread handlerThread = new HandlerThread("BleWrite");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), new bleHandlerCallback());
        this.mBleHandler = handler;
        handler.removeCallbacksAndMessages(null);
        ArrayList<OTAFile> imageFile = FileProcess.getImageFile(arrayList, this, 0);
        if (imageFile == null) {
            return 60;
        }
        Collections.sort(imageFile, new OTAImageComparator());
        connectDevice(str, this.mGattCallback);
        if (this.mConnectionState != 3 || this.mError != 0) {
            return this.mError;
        }
        writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
        synchronized (this.mLock) {
            while (!this.mIsDescriptorWrite && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
        int i11 = this.mError;
        if (i11 != 0) {
            return i11;
        }
        OTAFile imageByID = getImageByID(imageFile, -1);
        Objects.requireNonNull(imageByID);
        sendDfuImageInitExt(imageByID.getFileData());
        int i12 = this.mError;
        if (i12 != 0) {
            return i12;
        }
        if (this.mRemoteBoot == 1) {
            this.mDFUState.setState(2);
        }
        BleLog.d("sendDfuImageInitComplete resumeMode " + i8 + ", remote resume " + this.mRemoteResume);
        if (i8 != 1 || this.mRemoteResume == 0) {
            i10 = 0;
        } else {
            BleLog.d("sendDfuImageInitComplete use resume");
            i10 = 1;
        }
        sendDfuImageInitCompleteExt(i10);
        if (i10 == 1) {
            i10 = this.mRemoteResume;
        }
        if (this.mRemoteBoot == 1) {
            BleLog.d("wait reboot, mConnectionState " + this.mConnectionState);
            if (this.mConnectionState != 0) {
                synchronized (this.mLock) {
                    while (this.mConnectionState != 0) {
                        try {
                            this.mLock.wait();
                        } catch (InterruptedException e9) {
                            throw new RuntimeException(e9);
                        }
                    }
                }
            }
            this.mDFUState.setState(9);
            connectDevice(str, this.mGattCallback);
            if (this.mConnectionState != 3 || this.mError != 0) {
                return this.mError;
            }
            writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
            synchronized (this.mLock) {
                while (!this.mIsDescriptorWrite && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
            int i13 = this.mError;
            if (i13 != 0) {
                return i13;
            }
        }
        this.mProgressType = 0;
        this.countAll = getAllFileLength(imageFile, General.SIFLI_DFU_PACKET_BODY_LEN_NOR);
        updateLink();
        handleDFUImageSend(i10, imageFile, General.SIFLI_DFU_PACKET_BODY_LEN_NOR);
        int i14 = this.mError;
        if (i14 != 0) {
            return i14;
        }
        BleLog.d("wait end mode " + this.mWaitEndMode);
        int i15 = this.mWaitEndMode;
        if (i15 == 1) {
            sendDfuImageTransmissionEndWait();
        } else if (i15 == 0) {
            sendDfuImageTransmissionEnd();
        } else if (i15 == 2) {
            sendDfuImageTransmissionEndWait();
            int i16 = this.mError;
            if (i16 == 0) {
                sendDfuEndCommand(i16);
                waitFor(5000L);
            }
        }
        int i17 = this.mError;
        return i17 != 0 ? i17 : init;
    }

    private int handleDFUFileSend(int i8, ArrayList<OTAFile> arrayList) {
        int i9;
        if (i8 == 1) {
            BleLog.d("enable resume");
            i9 = this.mRemoteResumeCount;
        } else {
            i9 = 0;
        }
        while (i9 < arrayList.size()) {
            OTAFile oTAFile = arrayList.get(i9);
            CurrentSendFile currentSendFile = new CurrentSendFile(oTAFile.getFileData(), 10240, oTAFile.getFileName());
            sendDfuFileStart(oTAFile.getFilePath(), currentSendFile.getTotalSize(), currentSendFile.getTotalCount(), oTAFile.getFileIndex());
            this.countPrevious = getSendFileLength(arrayList, oTAFile.getFileIndex(), General.SIFLI_DFU_PACKET_BODY_LEN_NAND);
            this.countCurrent = 0;
            int i10 = this.mError;
            if (i10 != 0) {
                return i10;
            }
            int i11 = 0;
            boolean z7 = false;
            while (i11 < currentSendFile.getTotalCount()) {
                int i12 = i11 + 1;
                sendDfuFilePacket(i12, currentSendFile.getData(i11));
                if (currentSendFile.getTotalCount() == i12) {
                    z7 = true;
                }
                int i13 = this.mRspFreq;
                if (i13 != 0 && i12 % i13 == 0) {
                    z7 = true;
                }
                if (z7) {
                    this.mRspReceive = false;
                    try {
                        synchronized (this.mLock) {
                            while (!this.mRspReceive && this.mError == 0) {
                                try {
                                    this.mLock.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        BleLog.e("Sleeping interrupted");
                    }
                    int i14 = this.mError;
                    if (i14 != 0) {
                        if (i14 != 13) {
                            BleLog.d("download exit with " + this.mError);
                            return this.mError;
                        }
                        int i15 = this.mRemoteCurrentIndex;
                        this.countCurrent = i15;
                        i11 = i15 - 1;
                    }
                    z7 = false;
                }
                i11++;
            }
            int i16 = this.mError;
            if (i16 != 0) {
                return i16;
            }
            sendDfuFileEnd(oTAFile.getFileIndex());
            int i17 = this.mError;
            if (i17 != 0) {
                return i17;
            }
            i9++;
        }
        return 0;
    }

    private int handleDFUImageSend(int i8, ArrayList<OTAFile> arrayList, int i9) {
        int i10;
        boolean z7;
        int i11;
        int i12 = 1;
        if (i8 == 1) {
            BleLog.d("enable resume");
            i10 = this.mRemoteImageID;
            if (this.mRemoteResumeRestart == 1) {
                this.mRemoteResumeCount = 0;
            }
            this.mRspFreq = this.mRemoteResumeNumOfRsp;
            z7 = true;
        } else {
            i10 = 0;
            z7 = false;
        }
        int i13 = 2;
        if (i8 == 2) {
            BleLog.d("resume query");
            i10 = this.mRemoteImageID;
            this.mRspFreq = this.mRemoteResumeNumOfRsp;
        }
        int i14 = i10;
        int i15 = 0;
        while (i15 < arrayList.size()) {
            OTAFile oTAFile = arrayList.get(i15);
            this.countPrevious = getSendImageLength(arrayList, oTAFile.getImageID(), i9);
            this.countCurrent = 0;
            if (oTAFile.getImageID() != -1) {
                if (i8 == i13 && oTAFile.getImageID() == i14) {
                    BleLog.d("resume psram image id " + i14 + ", " + this.mRemoteResumeCount);
                    z7 = true;
                }
                if (!z7) {
                    i11 = 0;
                } else if (oTAFile.getImageID() != i14) {
                    continue;
                } else {
                    i11 = this.mRemoteResumeCount;
                    this.countCurrent = i11;
                    z7 = false;
                }
                CurrentSendFile currentSendFile = new CurrentSendFile(oTAFile.getFileData(), i9, oTAFile.getFileName());
                sendDfuImageStart(currentSendFile.getTotalSize(), currentSendFile.getTotalCount(), oTAFile.getImageID());
                int i16 = this.mError;
                if (i16 != 0) {
                    return i16;
                }
                if (this.mImageSkipInfo == i12) {
                    BleLog.d("skip " + oTAFile.getImageID());
                } else {
                    int i17 = i11;
                    boolean z8 = false;
                    while (i17 < currentSendFile.getTotalCount()) {
                        int i18 = i17 + 1;
                        if (i18 == currentSendFile.getTotalCount()) {
                            BleLog.d("last packet " + (FileProcess.getFileSize(oTAFile.getFilePath()) - (i17 * i9)));
                        }
                        sendDfuImagePacket(oTAFile.getImageID(), i18, currentSendFile.getData(i17));
                        if (currentSendFile.getTotalCount() == i18) {
                            z8 = true;
                        }
                        if (this.mError != 0) {
                            z8 = true;
                        }
                        int i19 = this.mRspFreq;
                        if (i19 != 0 && i18 % i19 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            this.mRspReceive = false;
                            try {
                                synchronized (this.mLock) {
                                    while (!this.mRspReceive && this.mError == 0) {
                                        try {
                                            this.mLock.wait();
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } catch (InterruptedException unused) {
                                BleLog.e("Sleeping interrupted");
                            }
                            int i20 = this.mError;
                            if (i20 != 0) {
                                if (i20 != 13) {
                                    BleLog.d("download exit with " + this.mError);
                                    return this.mError;
                                }
                                int i21 = this.mRemoteCurrentIndex;
                                i17 = i21 - 1;
                                this.countCurrent = i21;
                                BleLog.d("continue with index " + i17);
                                this.mError = 0;
                            }
                            z8 = false;
                        }
                        i12 = 1;
                        i17++;
                    }
                    int i22 = this.mError;
                    if (i22 != 0) {
                        return i22;
                    }
                    sendDfuImageEnd(oTAFile.getImageID(), i15 + 1 != arrayList.size() ? 1 : 0);
                }
            }
            i15++;
            i13 = 2;
        }
        return 0;
    }

    private int init() {
        String str;
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        if (bluetoothManager == null) {
            str = "Unable to initialize BluetoothManager.";
        } else {
            isReleased = false;
            BluetoothAdapter adapter = bluetoothManager.getAdapter();
            this.mBluetoothAdapter = adapter;
            if (adapter != null) {
                this.mDFUState = new DFUState();
                this.mGattCallback = getEmptyGattCallback();
                this.misAlreadyConnect = false;
                this.mIsRemoteBoot = false;
                this.mWaitEndMode = 0;
                registerBleBroadcast();
                return 0;
            }
            str = "Unable to obtain a BluetoothAdapter.";
        }
        BleLog.e(str);
        return 62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNotify(byte[] bArr) {
        int unsignedShortFromByteArray;
        StringBuilder sb;
        int i8;
        StringBuilder sb2;
        int i9;
        int i10;
        int i11;
        String sb3;
        int unsignedShortFromByteArray2;
        String str;
        StringBuilder sb4;
        byte[] serialReceive = serialReceive(bArr);
        if (serialReceive != null && this.mLastCateID == 1) {
            int unsignedShortFromByteArray3 = Utils.getUnsignedShortFromByteArray(serialReceive, 0);
            int unsignedShortFromByteArray4 = Utils.getUnsignedShortFromByteArray(serialReceive, 2);
            switch (unsignedShortFromByteArray3) {
                case 1:
                    BleLog.d("receive init response len " + serialReceive.length);
                    this.mRspReceive = true;
                    unsignedShortFromByteArray = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendLogBroadcast(5, "image init response " + unsignedShortFromByteArray);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, unsignedShortFromByteArray);
                    if (unsignedShortFromByteArray == 0) {
                        byte b8 = serialReceive[6];
                        BleLog.d("receive init response, result: " + unsignedShortFromByteArray + ", boot: " + ((int) b8));
                        this.mRemoteBoot = b8;
                        break;
                    } else {
                        BleLog.d("receive init response " + unsignedShortFromByteArray);
                        this.mError = unsignedShortFromByteArray;
                        break;
                    }
                case 4:
                    BleLog.d("receive resume response");
                    this.mRspReceive = true;
                    unsignedShortFromByteArray = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, unsignedShortFromByteArray);
                    if (unsignedShortFromByteArray == 0) {
                        byte b9 = serialReceive[6];
                        this.mRemoteBoot = b9;
                        this.mRemoteResumeRestart = serialReceive[7];
                        BleLog.d("resume message len " + unsignedShortFromByteArray4);
                        if (unsignedShortFromByteArray4 != 8) {
                            if (unsignedShortFromByteArray4 != 12) {
                                BleLog.d("fail to resume due to get data error");
                                this.mError = 71;
                                break;
                            } else {
                                this.mRemoteResumeCount = Utils.getIntFromByteArray(serialReceive, 8);
                                this.mRemoteImageID = serialReceive[12];
                                this.mRemoteResumeNumOfRsp = serialReceive[13];
                                sb = new StringBuilder();
                                sb.append("resume rsp, img id ");
                                sb.append(this.mRemoteImageID);
                                sb.append(", img num ");
                                sb.append(this.mRemoteResumeNumOfRsp);
                                sb.append(",reply freq ");
                                i8 = this.mRemoteResumeNumOfRsp;
                            }
                        } else {
                            this.mRemoteResumeCount = Utils.getUnsignedShortFromByteArray(serialReceive, 8);
                            this.mRemoteImageID = serialReceive[10];
                            sb = new StringBuilder();
                            sb.append("resume rsp, img id ");
                            sb.append(this.mRemoteImageID);
                            sb.append(", img num ");
                            i8 = this.mRemoteResumeCount;
                        }
                        sb.append(i8);
                        BleLog.d(sb.toString());
                        BleLog.d("resume rsp: boot " + ((int) b9) + ", resume restart " + this.mRemoteResumeRestart);
                        break;
                    }
                    this.mError = unsignedShortFromByteArray;
                    break;
                case 7:
                    int unsignedShortFromByteArray5 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, unsignedShortFromByteArray5);
                    BleLog.d("SIFLI_DFU_IMAGE_SEND_START_RESPONSE " + unsignedShortFromByteArray5);
                    sendLogBroadcast(5, "image start rsp " + unsignedShortFromByteArray5);
                    this.mRspReceive = true;
                    if (unsignedShortFromByteArray5 == 0) {
                        if (serialReceive.length == 8) {
                            this.mWaitEndMode = serialReceive[6];
                            BleLog.d("wait end mode " + this.mWaitEndMode);
                            this.mImageSkipInfo = serialReceive[7];
                            sb2 = new StringBuilder();
                            sb2.append("image skip ");
                            i9 = this.mImageSkipInfo;
                            sb2.append(i9);
                            sb3 = sb2.toString();
                            BleLog.e(sb3);
                            break;
                        }
                    } else {
                        i10 = unsignedShortFromByteArray5;
                        this.mError = i10;
                        break;
                    }
                    break;
                case 9:
                    i11 = serialReceive[4];
                    BleLog.d("DFU_IMAGE_END_RESPONSE " + i11);
                    sendLogBroadcast(5, "image end rsp " + i11);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, i11);
                    this.mRspReceive = true;
                    if (i11 == 0) {
                    }
                    this.mError = i11;
                    break;
                case 11:
                    i11 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    BleLog.d("DFU_IMAGE_PACKET_DATA_RESPONSE " + i11);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, i11);
                    this.mRspReceive = true;
                    if (i11 == 0) {
                    }
                    this.mError = i11;
                    break;
                case 13:
                    i11 = serialReceive[4];
                    BleLog.d("DFU_END " + i11);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, i11);
                    this.mRspReceive = true;
                    if (i11 == 0) {
                    }
                    this.mError = i11;
                    break;
                case 22:
                    this.mRspReceive = true;
                    i10 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, i10);
                    BleLog.d("processNotify: result " + i10);
                    sendLogBroadcast(5, "dfu file init rsp result " + i10);
                    if (i10 == 0) {
                        this.mRemoteResume = Utils.getUnsignedShortFromByteArray(serialReceive, 6);
                        this.mRemoteResumeCount = Utils.getIntFromByteArray(serialReceive, 8);
                        sb2 = new StringBuilder();
                        sb2.append("processNotify: init response ");
                        sb2.append(i10);
                        sb2.append(", mode ");
                        sb2.append(this.mRemoteResume);
                        sb2.append(", ");
                        i9 = this.mRemoteResumeCount;
                        sb2.append(i9);
                        sb3 = sb2.toString();
                        BleLog.e(sb3);
                        break;
                    }
                    this.mError = i10;
                    break;
                case 25:
                    i11 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, i11);
                    this.mRspReceive = true;
                    if (i11 == 0) {
                    }
                    this.mError = i11;
                    break;
                case 27:
                    int unsignedShortFromByteArray6 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, unsignedShortFromByteArray6);
                    this.mRspReceive = true;
                    if (unsignedShortFromByteArray6 != 0) {
                        BleLog.e("file packet result " + unsignedShortFromByteArray6);
                        this.mError = unsignedShortFromByteArray6;
                    }
                    this.mRspFreq = Utils.getUnsignedShortFromByteArray(serialReceive, 6);
                    this.mRemoteCurrentIndex = Utils.getIntFromByteArray(serialReceive, 8);
                    break;
                case 29:
                    unsignedShortFromByteArray2 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, unsignedShortFromByteArray2);
                    BleLog.d("file end " + unsignedShortFromByteArray2);
                    this.mError = unsignedShortFromByteArray2;
                    this.mRspReceive = true;
                    break;
                case 31:
                    unsignedShortFromByteArray2 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, unsignedShortFromByteArray2);
                    StringBuilder sb5 = new StringBuilder();
                    str = "file total end ";
                    sb5.append("file total end ");
                    sb5.append(unsignedShortFromByteArray2);
                    BleLog.d(sb5.toString());
                    sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(unsignedShortFromByteArray2);
                    sendLogBroadcast(5, sb4.toString());
                    this.mError = unsignedShortFromByteArray2;
                    this.mRspReceive = true;
                    break;
                case 33:
                    this.mRspReceive = true;
                    BleLog.d("data length " + serialReceive.length);
                    i10 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    BleLog.d("dfu init rsp ext result " + i10);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, i10);
                    if (i10 == 0) {
                        this.mRemoteResume = serialReceive[6];
                        this.mRemoteResumeRestart = serialReceive[7];
                        this.mRemoteResumeCount = Utils.getIntFromByteArray(serialReceive, 8);
                        this.mRemoteImageID = serialReceive[12];
                        this.mRemoteResumeNumOfRsp = serialReceive[13];
                        this.mRemoteBoot = serialReceive[14];
                        BleLog.d("remote dfu version " + ((int) serialReceive[15]));
                        BleLog.d("dfu init rsp ext resume " + this.mRemoteResume + ", restart " + this.mRemoteResumeRestart);
                        BleLog.d("dfu init rsp ext count " + this.mRemoteResumeCount + ", id " + this.mRemoteImageID + ", rsp " + this.mRemoteResumeNumOfRsp + ", boot " + this.mRemoteBoot);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("init rsp ext ");
                        sb6.append(i10);
                        sendLogBroadcast(5, sb6.toString());
                        sendLogBroadcast(0, "dfu init rsp ext resume " + this.mRemoteResume + ", restart " + this.mRemoteResumeRestart);
                        sendLogBroadcast(0, "dfu init rsp ext count " + this.mRemoteResumeCount + ", id " + this.mRemoteImageID + ", rsp " + this.mRemoteResumeNumOfRsp + ", boot " + this.mRemoteBoot);
                        break;
                    }
                    this.mError = i10;
                    break;
                case 35:
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, serialReceive[4]);
                    this.mRspFreq = Utils.getUnsignedShortFromByteArray(serialReceive, 6);
                    if (this.mRemoteCurrentIndex == Utils.getIntFromByteArray(serialReceive, 8) && System.currentTimeMillis() - this.mLoseCheckTime < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                        sb3 = "repeat message, ignore";
                        BleLog.e(sb3);
                        break;
                    } else {
                        this.mRemoteCurrentIndex = Utils.getIntFromByteArray(serialReceive, 8);
                        this.mLoseCheckTime = System.currentTimeMillis();
                        BleLog.e("lost check at index " + this.mRemoteCurrentIndex);
                        sendDfuLinkLoseResponse(0);
                        this.mError = 13;
                        this.mBleHandler.removeMessages(1);
                        break;
                    }
                    break;
                case 37:
                    unsignedShortFromByteArray2 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray3, unsignedShortFromByteArray2);
                    BleLog.d("dfu abort with " + unsignedShortFromByteArray2);
                    sb4 = new StringBuilder();
                    str = "dfu abort ";
                    sb4.append(str);
                    sb4.append(unsignedShortFromByteArray2);
                    sendLogBroadcast(5, sb4.toString());
                    this.mError = unsignedShortFromByteArray2;
                    this.mRspReceive = true;
                    break;
            }
        }
    }

    private void registerBleBroadcast() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        BroadcastReceiver bLEBroadcastReceiver = getBLEBroadcastReceiver();
        this.mBleBroadcastReceiver = bLEBroadcastReceiver;
        registerReceiver(bLEBroadcastReceiver, intentFilter);
    }

    private void release() {
        if (isReleased) {
            BleLog.d("already released");
            return;
        }
        BleLog.d("release");
        isReleased = true;
        unregisterReceiver(this.mBleBroadcastReceiver);
        if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
            BleLog.e("no Permission");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null || this.mConnectionState == 0) {
            return;
        }
        bluetoothGatt.disconnect();
        this.mBluetoothGatt.close();
    }

    private void sendDfuEndCommand(int i8) {
        BleLog.d("sendDfuEndCommand " + i8);
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(13, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) i8;
        sendToSerial(bArr, 0);
    }

    private void sendDfuFileEnd(int i8) {
        BleLog.d("sendDfuFileEnd");
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(28, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        Utils.addShortToByteArray(i8, bArr, 4);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuFileInit(int i8, int i9) {
        BleLog.d("sendDfuFileInit " + i8 + ", count " + i9);
        byte[] bArr = new byte[20];
        Utils.addShortToByteArray(21, bArr, 0);
        Utils.addShortToByteArray(16, bArr, 2);
        Utils.addIntToByteArray(i9, bArr, 4);
        Utils.addIntToByteArray(i8, bArr, 8);
        Utils.addShortToByteArray(2, bArr, 12);
        Utils.addShortToByteArray(4, bArr, 14);
        Utils.addIntToByteArray(100, bArr, 16);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuFileInitComplete(int i8) {
        BleLog.d("sendDfuFileInitComplete");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(23, bArr, 0);
        int i9 = 1;
        Utils.addShortToByteArray(1, bArr, 2);
        if (i8 == 1 && this.mRemoteResume == 1) {
            BleLog.e("sendDfuFileInitComplete resume");
        } else {
            i9 = 0;
        }
        bArr[4] = (byte) i9;
        sendToSerial(bArr, 0);
    }

    private void sendDfuFilePacket(int i8, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 8];
        Utils.addShortToByteArray(26, bArr2, 0);
        Utils.addShortToByteArray(bArr.length + 4, bArr2, 2);
        Utils.addShortToByteArray(i8, bArr2, 4);
        Utils.addShortToByteArray(bArr.length, bArr2, 6);
        System.arraycopy(bArr, 0, bArr2, 8, bArr.length);
        sendToSerial(bArr2, 1);
    }

    private void sendDfuFileStart(String str, int i8, int i9, int i10) {
        BleLog.d("sendDfuFileStart " + str + ", len " + i8 + ", count " + i9 + ", index " + i10);
        StringBuilder sb = new StringBuilder();
        sb.append("sendDfuFileStart freq ");
        sb.append(this.mRspFreq);
        BleLog.d(sb.toString());
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 16];
        Utils.addShortToByteArray(24, bArr, 0);
        Utils.addShortToByteArray(bytes.length + 12, bArr, 2);
        Utils.addShortToByteArray(i10, bArr, 4);
        Utils.addShortToByteArray(this.mRspFreq, bArr, 6);
        Utils.addIntToByteArray(i8, bArr, 8);
        Utils.addShortToByteArray(i9, bArr, 12);
        Utils.addShortToByteArray(bytes.length, bArr, 14);
        System.arraycopy(bytes, 0, bArr, 16, bytes.length);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuFileTotalEnd(int i8) {
        BleLog.d("sendDfuFileTotalEnd");
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(30, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        Utils.addShortToByteArray(i8, bArr, 4);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImageEnd(int i8, int i9) {
        BleLog.d("sendDfuImageEnd");
        sendLogBroadcast(5, "send dfu image end");
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(8, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        bArr[4] = (byte) i8;
        bArr[5] = (byte) i9;
        BleLog.d("sendDfuImageEnd, id " + i8 + ",more image: " + i9);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImageInit(byte[] bArr, int i8) {
        int i9;
        BleLog.d("sendDfuInit " + bArr.length + ", mode " + i8);
        byte[] bArr2 = new byte[bArr.length + 4];
        if (i8 == 1) {
            i9 = 0;
        } else {
            i9 = 3;
            if (i8 != 2) {
                if (i8 != 3) {
                    BleLog.e("error mode " + i8);
                }
                i9 = 14;
            }
        }
        Utils.addShortToByteArray(i9, bArr2, 0);
        Utils.addShortToByteArray(bArr.length, bArr2, 2);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        sendToSerial(bArr2, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImageInitComplete() {
        BleLog.d("sendDfuImageInitComplete");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(2, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) 1;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageInitCompleteExt(int i8) {
        BleLog.d("sendDfuImageInitCompleteExt");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(34, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) i8;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageInitExt(byte[] bArr) {
        BleLog.d("sendDfuInitExt " + bArr.length);
        byte[] bArr2 = new byte[bArr.length + 4];
        Utils.addShortToByteArray(32, bArr2, 0);
        Utils.addShortToByteArray(bArr.length, bArr2, 2);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        sendToSerial(bArr2, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImagePacket(int i8, int i9, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 10];
        Utils.addShortToByteArray(10, bArr2, 0);
        Utils.addShortToByteArray(bArr.length + 6, bArr2, 2);
        Utils.addShortToByteArray(i8, bArr2, 4);
        Utils.addShortToByteArray(i9, bArr2, 6);
        Utils.addShortToByteArray(bArr.length, bArr2, 8);
        System.arraycopy(bArr, 0, bArr2, 10, bArr.length);
        sendToSerial(bArr2, 1);
    }

    private void sendDfuImageResumeComplete() {
        BleLog.d("sendDfuImageResumeComplete");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(5, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) 1;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageStart(int i8, int i9, int i10) {
        BleLog.d("send dfu start id " + i10 + ", count " + i9 + ", len " + i8);
        StringBuilder sb = new StringBuilder();
        sb.append("IMG ID: ");
        sb.append(i10);
        sendLogBroadcast(5, sb.toString());
        byte[] bArr = new byte[14];
        Utils.addShortToByteArray(6, bArr, 0);
        Utils.addShortToByteArray(10, bArr, 2);
        Utils.addIntToByteArray(i8, bArr, 4);
        Utils.addIntToByteArray(i9, bArr, 8);
        bArr[12] = (byte) this.mRspFreq;
        bArr[13] = (byte) i10;
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImageTransmissionEnd() {
        BleLog.d("sendDfuImageTransmissionEnd");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(12, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = 0;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageTransmissionEndWait() {
        BleLog.d("sendDfuImageTransmissionEndWait");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(12, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = 0;
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 120000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            BleLog.e("Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuLinkLoseResponse(int i8) {
        BleLog.d("sendDfuLinkLoseResponse");
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(36, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        Utils.addShortToByteArray(i8, bArr, 4);
        sendToSerial(bArr, 0);
    }

    private void sendToBleHandler(byte[] bArr, int i8) {
        Message message = new Message();
        message.what = i8;
        Bundle bundle = new Bundle();
        bundle.putByteArray(EXTRA_BLE_DATA, bArr);
        message.setData(bundle);
        this.mBleHandler.sendMessage(message);
    }

    private void sendToSerial(byte[] bArr, int i8) {
        int length = bArr.length;
        int i9 = length + 4;
        if (i9 > 65535) {
            BleLog.e("serial length over");
            return;
        }
        int i10 = this.mMaxPacketLen;
        if (i9 <= i10) {
            byte[] bArr2 = new byte[i9];
            bArr2[0] = 1;
            bArr2[1] = 0;
            byte[] addShortToByteArray = Utils.addShortToByteArray(length, bArr2, 2);
            System.arraycopy(bArr, 0, addShortToByteArray, 4, length);
            sendToBleHandler(addShortToByteArray, i8);
            return;
        }
        byte[] bArr3 = new byte[i10];
        bArr3[0] = 1;
        bArr3[1] = 1;
        byte[] addShortToByteArray2 = Utils.addShortToByteArray(length, bArr3, 2);
        System.arraycopy(bArr, 0, addShortToByteArray2, 4, this.mMaxPacketLen - 4);
        int i11 = this.mMaxPacketLen - 4;
        sendToBleHandler(addShortToByteArray2, i8);
        while (i11 < length) {
            int i12 = length - i11;
            int i13 = this.mMaxPacketLen;
            int i14 = i13 - 2;
            if (i12 > i14) {
                byte[] bArr4 = new byte[i13];
                bArr4[0] = 1;
                bArr4[1] = 2;
                System.arraycopy(bArr, i11, bArr4, 2, i14);
                i11 += this.mMaxPacketLen - 2;
                sendToBleHandler(bArr4, i8);
            } else {
                byte[] bArr5 = new byte[i12 + 2];
                bArr5[0] = 1;
                bArr5[1] = 3;
                System.arraycopy(bArr, i11, bArr5, 2, i12);
                sendToBleHandler(bArr5, i8);
                i11 = length;
            }
        }
    }

    private byte[] serialReceive(byte[] bArr) {
        int i8;
        int length;
        this.mLastCateID = bArr[0];
        byte b8 = bArr[1];
        if (b8 != 0) {
            if (b8 == 1) {
                this.receiveDataCurrentLen = 0;
                int unsignedShortFromByteArray = Utils.getUnsignedShortFromByteArray(bArr, 2);
                this.receiveDataLen = unsignedShortFromByteArray;
                this.receiveData = new byte[unsignedShortFromByteArray];
                BleLog.d("receiveDataLen " + this.receiveDataLen);
                System.arraycopy(bArr, 4, this.receiveData, 0, bArr.length - 4);
                i8 = this.receiveDataCurrentLen;
                length = bArr.length - 4;
            } else if (b8 == 2) {
                System.arraycopy(bArr, 2, this.receiveData, this.receiveDataCurrentLen, bArr.length - 2);
                i8 = this.receiveDataCurrentLen;
                length = bArr.length - 2;
            } else {
                if (b8 != 3) {
                    return null;
                }
                System.arraycopy(bArr, 2, this.receiveData, this.receiveDataCurrentLen, bArr.length - 2);
                int length2 = this.receiveDataCurrentLen + (bArr.length - 2);
                this.receiveDataCurrentLen = length2;
                if (length2 != this.receiveDataLen) {
                    BleLog.e("length error, final: " + this.receiveDataCurrentLen + ", expect: " + this.receiveDataLen);
                    return null;
                }
                BleLog.d("receive finish");
            }
            this.receiveDataCurrentLen = i8 + length;
            return null;
        }
        int unsignedShortFromByteArray2 = Utils.getUnsignedShortFromByteArray(bArr, 2);
        this.receiveDataLen = unsignedShortFromByteArray2;
        byte[] bArr2 = new byte[unsignedShortFromByteArray2];
        this.receiveData = bArr2;
        System.arraycopy(bArr, 4, bArr2, 0, unsignedShortFromByteArray2);
        return this.receiveData;
    }

    public static void startActionDFUNand(Context context, String str, ArrayList<DFUImagePath> arrayList, int i8, int i9) {
        Intent intent = new Intent(context, (Class<?>) SifliDFUService.class);
        intent.setAction(ACTION_NAND);
        intent.putExtra(EXTRA_ADDRESS, str);
        intent.putExtra(EXTRA_IMAGES, arrayList);
        intent.putExtra(EXTRA_RESUME_MODE, i8);
        intent.putExtra(EXTRA_NUM_OF_RSP, i9);
        context.startService(intent);
    }

    public static void startActionDFUNor(Context context, String str, ArrayList<DFUImagePath> arrayList, int i8, int i9) {
        BleLog.d("onHandleIntent isReleased: " + isReleased);
        if (isReleased) {
            Intent intent = new Intent(context, (Class<?>) SifliDFUService.class);
            intent.setAction(ACTION_NOR_V1);
            intent.putExtra(EXTRA_ADDRESS, str);
            intent.putExtra(EXTRA_IMAGES, arrayList);
            intent.putExtra(EXTRA_RESUME_MODE, i8);
            intent.putExtra(EXTRA_NUM_OF_RSP, i9);
            context.startService(intent);
        }
    }

    public static void startActionDFUNorExt(Context context, String str, ArrayList<DFUImagePath> arrayList, int i8, int i9) {
        Intent intent = new Intent(context, (Class<?>) SifliDFUService.class);
        intent.setAction(ACTION_NOR_V2);
        intent.putExtra(EXTRA_ADDRESS, str);
        intent.putExtra(EXTRA_IMAGES, arrayList);
        intent.putExtra(EXTRA_RESUME_MODE, i8);
        intent.putExtra(EXTRA_NUM_OF_RSP, i9);
        context.startService(intent);
    }

    private void updateLink() {
        BleLog.d("update link");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31 || ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") == 0) {
            this.mBluetoothGatt.requestConnectionPriority(1);
            waitFor(1000L);
            if (i8 >= 26) {
                this.mBluetoothGatt.setPreferredPhy(2, 2, 0);
            }
            waitFor(1000L);
            return;
        }
        BleLog.e("no Permission");
        this.mError = 61;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMtu(BluetoothGatt bluetoothGatt, int i8) {
        if (Build.VERSION.SDK_INT < 31 || ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") == 0) {
            bluetoothGatt.requestMtu(i8);
            return;
        }
        BleLog.e("no Permission update mtu");
        this.mError = 61;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    private void writeCCCD(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
            BleLog.e("no Permission");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (descriptor == null) {
            this.mError = 68;
            BleLog.e("desc null!!!");
            return;
        }
        this.mIsDescriptorWrite = false;
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        BleLog.d("Write descriptor");
        this.mTimerHandler.postDelayed(this.mWriteDescriptorTimerRunnable, 30000L);
        bluetoothGatt.writeDescriptor(descriptor);
    }

    protected void close(BluetoothGatt bluetoothGatt) {
        BleLog.d("Cleaning up...");
        if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        if (bluetoothGatt != null) {
            BleLog.d("gatt.disconnect()");
            bluetoothGatt.disconnect();
            BleLog.d("gatt.close()");
            bluetoothGatt.close();
        }
        this.mConnectionState = 5;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        BleLog.d("onCreate()");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        release();
        BleLog.d("onDestroy");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        int handleActionDFUNand;
        StringBuilder sb;
        if (intent != null) {
            String action = intent.getAction();
            if (ACTION_NOR_V1.equals(action)) {
                handleActionDFUNand = handleActionDFUNorV1(intent.getStringExtra(EXTRA_ADDRESS), intent.getParcelableArrayListExtra(EXTRA_IMAGES), intent.getIntExtra(EXTRA_RESUME_MODE, 0), intent.getIntExtra(EXTRA_NUM_OF_RSP, 0));
                if (handleActionDFUNand != 74) {
                    try {
                        Thread.sleep(5000L);
                        BleLog.e("nor ota end with " + handleActionDFUNand);
                    } catch (InterruptedException e8) {
                        throw new RuntimeException(e8);
                    }
                }
                sb = new StringBuilder();
            } else if (ACTION_NOR_V2.equals(action)) {
                handleActionDFUNand = handleActionDFUNorV2(intent.getStringExtra(EXTRA_ADDRESS), intent.getParcelableArrayListExtra(EXTRA_IMAGES), intent.getIntExtra(EXTRA_RESUME_MODE, 0), intent.getIntExtra(EXTRA_NUM_OF_RSP, 0));
                try {
                    Thread.sleep(5000L);
                    BleLog.e("end with " + handleActionDFUNand);
                    sb = new StringBuilder();
                } catch (InterruptedException e9) {
                    throw new RuntimeException(e9);
                }
            } else {
                if (!ACTION_NAND.equals(action)) {
                    return;
                }
                handleActionDFUNand = handleActionDFUNand(intent.getStringExtra(EXTRA_ADDRESS), intent.getParcelableArrayListExtra(EXTRA_IMAGES), intent.getIntExtra(EXTRA_RESUME_MODE, 0), intent.getIntExtra(EXTRA_NUM_OF_RSP, 0));
                BleLog.e("end with " + handleActionDFUNand);
                sb = new StringBuilder();
            }
            sb.append("DFU end with ");
            sb.append(handleActionDFUNand);
            sendLogBroadcast(5, sb.toString());
            sendDfuStateChangeBroadcast(100, handleActionDFUNand);
            release();
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i8) {
        super.onStart(intent, i8);
        BleLog.d("onStart()");
    }

    protected void refreshDeviceCache(BluetoothGatt bluetoothGatt) {
        try {
            BleLog.d("Refreshing result: " + ((Boolean) bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue());
        } catch (Exception e8) {
            BleLog.e("An exception occurred while refreshing device");
            e8.printStackTrace();
            sendLogBroadcast(15, "Refreshing failed");
        }
    }

    void sendDFUProgressBroadcast(int i8, int i9) {
        Intent intent = new Intent(BROADCAST_DFU_PROGRESS);
        intent.putExtra(EXTRA_DFU_PROGRESS, i8);
        intent.putExtra(EXTRA_DFU_PROGRESS_TYPE, i9);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void sendDfuStateChangeBroadcast(int i8, int i9) {
        Intent intent = new Intent(BROADCAST_DFU_STATE);
        intent.putExtra(EXTRA_DFU_STATE, i8);
        intent.putExtra(EXTRA_DFU_STATE_RESULT, i9);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void sendLogBroadcast(int i8, String str) {
        Intent intent = new Intent(BROADCAST_DFU_LOG);
        intent.putExtra(EXTRA_LOG_MESSAGE, "[DFU] " + str);
        intent.putExtra(EXTRA_LOG_LEVEL, i8);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    protected void waitFor(long j8) {
        synchronized (this.mLock) {
            try {
                sendLogBroadcast(0, "wait(" + j8 + ")");
                this.mLock.wait(j8);
            } catch (InterruptedException unused) {
                BleLog.e("Sleeping interrupted");
            }
        }
    }
}
