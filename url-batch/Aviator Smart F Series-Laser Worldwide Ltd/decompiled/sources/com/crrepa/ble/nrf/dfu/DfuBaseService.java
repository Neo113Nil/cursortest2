package com.crrepa.ble.nrf.dfu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
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
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import cn.hutool.core.util.g1;
import com.baidu.ar.auth.FeatureCodes;
import com.crrepa.ble.R;
import com.crrepa.ble.nrf.dfu.DfuProgressInfo;
import com.crrepa.ble.nrf.dfu.internal.ArchiveInputStream;
import com.crrepa.ble.nrf.dfu.internal.HexInputStream;
import com.crrepa.ble.nrf.dfu.internal.exception.DeviceDisconnectedException;
import com.crrepa.ble.nrf.dfu.internal.exception.DfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.SizeValidationException;
import com.crrepa.ble.nrf.dfu.internal.exception.UploadAbortedException;
import com.crrepa.ble.nrf.error.GattError;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class DfuBaseService extends IntentService implements DfuProgressInfo.ProgressListener {
    public static final int ACTION_ABORT = 2;
    public static final int ACTION_PAUSE = 0;
    public static final int ACTION_RESUME = 1;
    public static final String BROADCAST_ACTION = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ACTION";
    public static final String BROADCAST_ERROR = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ERROR";
    public static final String BROADCAST_LOG = "no.nordicsemi.android.dfu.broadcast.BROADCAST_LOG";
    public static final String BROADCAST_PROGRESS = "no.nordicsemi.android.dfu.broadcast.BROADCAST_PROGRESS";
    static boolean DEBUG = false;

    @Deprecated
    public static final int DFU_STATUS_CRC_ERROR = 5;

    @Deprecated
    public static final int DFU_STATUS_DATA_SIZE_EXCEEDS_LIMIT = 4;

    @Deprecated
    public static final int DFU_STATUS_INVALID_STATE = 2;

    @Deprecated
    public static final int DFU_STATUS_NOT_SUPPORTED = 3;

    @Deprecated
    public static final int DFU_STATUS_OPERATION_FAILED = 6;

    @Deprecated
    public static final int DFU_STATUS_SUCCESS = 1;
    public static final int ERROR_BLUETOOTH_DISABLED = 4106;

    @Deprecated
    public static final int ERROR_CHARACTERISTICS_NOT_FOUND = 4103;
    public static final int ERROR_CONNECTION_MASK = 16384;
    public static final int ERROR_CONNECTION_STATE_MASK = 32768;
    public static final int ERROR_CRC_ERROR = 4109;
    public static final int ERROR_DEVICE_DISCONNECTED = 4096;
    public static final int ERROR_DEVICE_NOT_BONDED = 4110;
    public static final int ERROR_FILE_ERROR = 4098;
    public static final int ERROR_FILE_INVALID = 4099;
    public static final int ERROR_FILE_IO_EXCEPTION = 4100;
    public static final int ERROR_FILE_NOT_FOUND = 4097;
    public static final int ERROR_FILE_SIZE_INVALID = 4108;
    public static final int ERROR_FILE_TYPE_UNSUPPORTED = 4105;
    public static final int ERROR_INIT_PACKET_REQUIRED = 4107;
    public static final int ERROR_INVALID_RESPONSE = 4104;
    public static final int ERROR_MASK = 4096;
    public static final int ERROR_REMOTE_MASK = 8192;
    public static final int ERROR_SERVICE_DISCOVERY_NOT_STARTED = 4101;
    public static final int ERROR_SERVICE_NOT_FOUND = 4102;
    public static final int ERROR_TYPE_COMMUNICATION = 2;
    public static final int ERROR_TYPE_COMMUNICATION_STATE = 1;
    public static final int ERROR_TYPE_DFU_REMOTE = 3;
    public static final int ERROR_TYPE_OTHER = 0;
    public static final String EXTRA_ACTION = "no.nordicsemi.android.dfu.extra.EXTRA_ACTION";
    private static final String EXTRA_ATTEMPT = "no.nordicsemi.android.dfu.extra.EXTRA_ATTEMPT";
    public static final String EXTRA_AVG_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_AVG_SPEED_B_PER_MS";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU";
    public static final String EXTRA_DATA = "no.nordicsemi.android.dfu.extra.EXTRA_DATA";
    public static final String EXTRA_DEVICE_ADDRESS = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_ADDRESS";
    public static final String EXTRA_DEVICE_NAME = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_NAME";
    public static final String EXTRA_DISABLE_NOTIFICATION = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_NOTIFICATION";
    public static final String EXTRA_ERROR_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_ERROR_TYPE";
    public static final String EXTRA_FILE_MIME_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_MIME_TYPE";
    public static final String EXTRA_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_PATH";
    public static final String EXTRA_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_RES_ID";
    public static final String EXTRA_FILE_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_TYPE";
    public static final String EXTRA_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_URI";
    public static final String EXTRA_FORCE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_FORCE_DFU";
    public static final String EXTRA_INIT_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_PATH";
    public static final String EXTRA_INIT_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_RES_ID";
    public static final String EXTRA_INIT_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_URI";
    public static final String EXTRA_KEEP_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_KEEP_BOND";
    public static final String EXTRA_LOG_LEVEL = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_LEVEL";
    public static final String EXTRA_LOG_MESSAGE = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_INFO";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_ENABLED";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_VALUE";
    public static final String EXTRA_PARTS_TOTAL = "no.nordicsemi.android.dfu.extra.EXTRA_PARTS_TOTAL";
    public static final String EXTRA_PART_CURRENT = "no.nordicsemi.android.dfu.extra.EXTRA_PART_CURRENT";
    public static final String EXTRA_PROGRESS = "no.nordicsemi.android.dfu.extra.EXTRA_PROGRESS";
    public static final String EXTRA_RESTORE_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_RESTORE_BOND";
    public static final String EXTRA_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_SPEED_B_PER_MS";
    public static final String EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final int LOG_LEVEL_APPLICATION = 10;
    public static final int LOG_LEVEL_DEBUG = 0;
    public static final int LOG_LEVEL_ERROR = 20;
    public static final int LOG_LEVEL_INFO = 5;
    public static final int LOG_LEVEL_VERBOSE = 1;
    public static final int LOG_LEVEL_WARNING = 15;
    public static final String MIME_TYPE_OCTET_STREAM = "application/octet-stream";
    public static final String MIME_TYPE_ZIP = "application/zip";
    public static final int NOTIFICATION_ID = 283;
    public static final int PROGRESS_ABORTED = -7;
    public static final int PROGRESS_COMPLETED = -6;
    public static final int PROGRESS_CONNECTING = -1;
    public static final int PROGRESS_DISCONNECTING = -5;
    public static final int PROGRESS_ENABLING_DFU_MODE = -3;
    public static final int PROGRESS_STARTING = -2;
    public static final int PROGRESS_VALIDATING = -4;
    protected static final int STATE_CLOSED = -5;
    protected static final int STATE_CONNECTED = -2;
    protected static final int STATE_CONNECTED_AND_READY = -3;
    protected static final int STATE_CONNECTING = -1;
    protected static final int STATE_DISCONNECTED = 0;
    protected static final int STATE_DISCONNECTING = -4;
    private static final String TAG = "DfuBaseService";
    public static final int TYPE_APPLICATION = 4;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_BOOTLOADER = 2;
    public static final int TYPE_SOFT_DEVICE = 1;
    private boolean mAborted;
    private BluetoothAdapter mBluetoothAdapter;
    private final BroadcastReceiver mBondStateBroadcastReceiver;
    protected int mConnectionState;
    private final BroadcastReceiver mConnectionStateBroadcastReceiver;
    private String mDeviceAddress;
    private String mDeviceName;
    private final BroadcastReceiver mDfuActionReceiver;
    private DfuCallback mDfuServiceImpl;
    private boolean mDisableNotification;
    private int mError;
    private final BluetoothGattCallback mGattCallback;
    private long mLastNotificationTime;
    private int mLastProgress;
    private final Object mLock;
    DfuProgressInfo mProgressInfo;

    public DfuBaseService() {
        super(TAG);
        this.mLock = new Object();
        this.mLastProgress = -1;
        this.mDfuActionReceiver = new BroadcastReceiver() { // from class: com.crrepa.ble.nrf.dfu.DfuBaseService.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_ACTION, 0);
                DfuBaseService.this.logi("User action received: " + intExtra);
                if (intExtra == 0) {
                    DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Pause action received");
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.pause();
                        return;
                    }
                    return;
                }
                if (intExtra == 1) {
                    DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Resume action received");
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.resume();
                        return;
                    }
                    return;
                }
                if (intExtra != 2) {
                    return;
                }
                DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Abort action received");
                DfuBaseService.this.mAborted = true;
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.abort();
                }
            }
        };
        this.mBondStateBroadcastReceiver = new BroadcastReceiver() { // from class: com.crrepa.ble.nrf.dfu.DfuBaseService.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (!((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")).getAddress().equals(DfuBaseService.this.mDeviceAddress) || (intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) == 11 || DfuBaseService.this.mDfuServiceImpl == null) {
                    return;
                }
                DfuBaseService.this.mDfuServiceImpl.onBondStateChanged(intExtra);
            }
        };
        this.mConnectionStateBroadcastReceiver = new BroadcastReceiver() { // from class: com.crrepa.ble.nrf.dfu.DfuBaseService.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")).getAddress().equals(DfuBaseService.this.mDeviceAddress)) {
                    String action = intent.getAction();
                    DfuBaseService.this.logi("Action received: " + action);
                    DfuBaseService.this.sendLogBroadcast(0, "[Broadcast] Action received: " + action);
                }
            }
        };
        this.mGattCallback = new BluetoothGattCallback() { // from class: com.crrepa.ble.nrf.dfu.DfuBaseService.4
            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i8);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.bluetooth.BluetoothGattCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
                DfuBaseService dfuBaseService;
                int i10;
                if (i8 != 0) {
                    DfuBaseService.this.loge("Connection state change error: " + i8 + " newState: " + i9);
                    if (i9 == 0) {
                        DfuBaseService dfuBaseService2 = DfuBaseService.this;
                        dfuBaseService2.mConnectionState = 0;
                        if (dfuBaseService2.mDfuServiceImpl != null) {
                            DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                        }
                    }
                    dfuBaseService = DfuBaseService.this;
                    i10 = i8 | 32768;
                } else {
                    if (i9 != 2) {
                        if (i9 == 0) {
                            DfuBaseService.this.logi("Disconnected from GATT server");
                            DfuBaseService dfuBaseService3 = DfuBaseService.this;
                            dfuBaseService3.mConnectionState = 0;
                            if (dfuBaseService3.mDfuServiceImpl != null) {
                                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                            }
                        }
                        synchronized (DfuBaseService.this.mLock) {
                            DfuBaseService.this.mLock.notifyAll();
                        }
                        return;
                    }
                    DfuBaseService.this.logi("Connected to GATT server");
                    DfuBaseService.this.sendLogBroadcast(5, "Connected to " + DfuBaseService.this.mDeviceAddress);
                    DfuBaseService.this.mConnectionState = -2;
                    if (bluetoothGatt.getDevice().getBondState() == 12) {
                        DfuBaseService.this.logi("Waiting 1600 ms for a possible Service Changed indication...");
                        DfuBaseService.this.waitFor(FeatureCodes.ADVANCE_BEAUTY);
                    }
                    DfuBaseService.this.sendLogBroadcast(1, "Discovering services...");
                    DfuBaseService.this.sendLogBroadcast(0, "gatt.discoverServices()");
                    boolean discoverServices = bluetoothGatt.discoverServices();
                    DfuBaseService dfuBaseService4 = DfuBaseService.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempting to start service discovery... ");
                    sb.append(discoverServices ? "succeed" : "failed");
                    dfuBaseService4.logi(sb.toString());
                    if (discoverServices) {
                        return;
                    }
                    dfuBaseService = DfuBaseService.this;
                    i10 = 4101;
                }
                dfuBaseService.mError = i10;
                synchronized (DfuBaseService.this.mLock) {
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i8);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @SuppressLint({"NewApi"})
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onMtuChanged(bluetoothGatt, i8, i9);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
                DfuBaseService dfuBaseService = DfuBaseService.this;
                if (i8 == 0) {
                    dfuBaseService.logi("Services discovered");
                    DfuBaseService.this.mConnectionState = -3;
                } else {
                    dfuBaseService.loge("Service discovery error: " + i8);
                    DfuBaseService.this.mError = i8 | 16384;
                }
                synchronized (DfuBaseService.this.mLock) {
                    DfuBaseService.this.mLock.notifyAll();
                }
            }
        };
    }

    private boolean initialize() {
        String str;
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        if (bluetoothManager == null) {
            str = "Unable to initialize BluetoothManager.";
        } else {
            BluetoothAdapter adapter = bluetoothManager.getAdapter();
            this.mBluetoothAdapter = adapter;
            if (adapter != null) {
                return true;
            }
            str = "Unable to obtain a BluetoothAdapter.";
        }
        loge(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loge(String str) {
        Log.e(TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logi(String str) {
        if (DEBUG) {
            Log.i(TAG, str);
        }
    }

    private void logw(String str) {
        if (DEBUG) {
            Log.w(TAG, str);
        }
    }

    private static IntentFilter makeDfuActionIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BROADCAST_ACTION);
        return intentFilter;
    }

    private InputStream openInputStream(int i8, String str, int i9, int i10) {
        InputStream openRawResource = getResources().openRawResource(i8);
        if (MIME_TYPE_ZIP.equals(str)) {
            return new ArchiveInputStream(openRawResource, i9, i10);
        }
        openRawResource.mark(2);
        int read = openRawResource.read();
        openRawResource.reset();
        return read == 58 ? new HexInputStream(openRawResource, i9) : openRawResource;
    }

    private void report(int i8) {
        sendErrorBroadcast(i8);
        if (this.mDisableNotification) {
            return;
        }
        String str = this.mDeviceAddress;
        String str2 = this.mDeviceName;
        if (str2 == null) {
            str2 = getString(R.string.dfu_unknown_name);
        }
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(this).setSmallIcon(android.R.drawable.stat_sys_upload).setOnlyAlertOnce(true).setColor(SupportMenu.CATEGORY_MASK).setOngoing(false).setContentTitle(getString(R.string.dfu_status_error)).setSmallIcon(android.R.drawable.stat_sys_upload_done).setContentText(getString(R.string.dfu_status_error_msg)).setAutoCancel(true);
        Intent intent = new Intent(this, getNotificationTarget());
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, str);
        intent.putExtra(EXTRA_DEVICE_NAME, str2);
        intent.putExtra(EXTRA_PROGRESS, i8);
        autoCancel.setContentIntent(PendingIntent.getActivity(this, 0, intent, C.BUFFER_FLAG_FIRST_SAMPLE));
        ((NotificationManager) getSystemService("notification")).notify(283, autoCancel.build());
    }

    private void sendErrorBroadcast(int i8) {
        int i9;
        Intent intent = new Intent(BROADCAST_ERROR);
        if ((i8 & 16384) > 0) {
            intent.putExtra(EXTRA_DATA, i8 & (-16385));
            i9 = 2;
        } else if ((32768 & i8) > 0) {
            intent.putExtra(EXTRA_DATA, i8 & (-32769));
            i9 = 1;
        } else {
            int i10 = i8 & 8192;
            intent.putExtra(EXTRA_DATA, i8);
            i9 = i10 > 0 ? 3 : 0;
        }
        intent.putExtra(EXTRA_ERROR_TYPE, i9);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void sendProgressBroadcast(DfuProgressInfo dfuProgressInfo) {
        Intent intent = new Intent(BROADCAST_PROGRESS);
        intent.putExtra(EXTRA_DATA, dfuProgressInfo.getProgress());
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        intent.putExtra(EXTRA_PART_CURRENT, dfuProgressInfo.getCurrentPart());
        intent.putExtra(EXTRA_PARTS_TOTAL, dfuProgressInfo.getTotalParts());
        intent.putExtra(EXTRA_SPEED_B_PER_MS, dfuProgressInfo.getSpeed());
        intent.putExtra(EXTRA_AVG_SPEED_B_PER_MS, dfuProgressInfo.getAverageSpeed());
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    protected void close(BluetoothGatt bluetoothGatt) {
        logi("Cleaning up...");
        sendLogBroadcast(0, "gatt.close()");
        bluetoothGatt.close();
        this.mConnectionState = -5;
    }

    protected BluetoothGatt connect(String str) {
        if (!this.mBluetoothAdapter.isEnabled()) {
            return null;
        }
        this.mConnectionState = -1;
        logi("Connecting to the device...");
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false)");
        BluetoothGatt connectGatt = remoteDevice.connectGatt(this, false, this.mGattCallback);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        int i8 = this.mConnectionState;
                        if ((i8 == -1 || i8 == -2) && this.mError == 0) {
                            this.mLock.wait();
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
        return connectGatt;
    }

    protected void disconnect(BluetoothGatt bluetoothGatt) {
        if (this.mConnectionState == 0) {
            return;
        }
        sendLogBroadcast(1, "Disconnecting...");
        this.mProgressInfo.setProgress(-5);
        this.mConnectionState = -4;
        logi("Disconnecting from the device...");
        sendLogBroadcast(0, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        waitUntilDisconnected();
        sendLogBroadcast(5, "Disconnected");
    }

    protected abstract Class<? extends Activity> getNotificationTarget();

    protected boolean isDebug() {
        return false;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        DEBUG = isDebug();
        initialize();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        IntentFilter makeDfuActionIntentFilter = makeDfuActionIntentFilter();
        localBroadcastManager.registerReceiver(this.mDfuActionReceiver, makeDfuActionIntentFilter);
        registerReceiver(this.mDfuActionReceiver, makeDfuActionIntentFilter);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        registerReceiver(this.mConnectionStateBroadcastReceiver, intentFilter);
        registerReceiver(this.mBondStateBroadcastReceiver, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.mDfuActionReceiver);
        unregisterReceiver(this.mDfuActionReceiver);
        unregisterReceiver(this.mConnectionStateBroadcastReceiver);
        unregisterReceiver(this.mBondStateBroadcastReceiver);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0411, code lost:
    
        if (r5 == null) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x041c A[Catch: all -> 0x0117, TRY_ENTER, TryCatch #35 {all -> 0x0117, blocks: (B:43:0x010e, B:44:0x0149, B:47:0x0153, B:49:0x0159, B:50:0x0161, B:52:0x0167, B:54:0x016e, B:57:0x0177, B:58:0x017e, B:59:0x017f, B:61:0x0183, B:64:0x018c, B:65:0x0193, B:66:0x0194, B:68:0x0198, B:70:0x01a2, B:71:0x01a9, B:74:0x01ac, B:76:0x01b2, B:77:0x01bd, B:79:0x01c3, B:81:0x01cd, B:83:0x01e9, B:86:0x01fd, B:93:0x020e, B:95:0x021f, B:102:0x0230, B:104:0x0234, B:111:0x0247, B:117:0x025a, B:118:0x02ae, B:120:0x02b9, B:122:0x02c4, B:123:0x02c7, B:130:0x02e6, B:137:0x0284, B:139:0x02f2, B:141:0x02f6, B:149:0x030b, B:197:0x0338, B:162:0x0413, B:191:0x041c, B:192:0x041f, B:227:0x0420, B:228:0x0427, B:230:0x0137, B:232:0x013f), top: B:41:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[Catch: all -> 0x0117, SYNTHETIC, TRY_LEAVE, TryCatch #35 {all -> 0x0117, blocks: (B:43:0x010e, B:44:0x0149, B:47:0x0153, B:49:0x0159, B:50:0x0161, B:52:0x0167, B:54:0x016e, B:57:0x0177, B:58:0x017e, B:59:0x017f, B:61:0x0183, B:64:0x018c, B:65:0x0193, B:66:0x0194, B:68:0x0198, B:70:0x01a2, B:71:0x01a9, B:74:0x01ac, B:76:0x01b2, B:77:0x01bd, B:79:0x01c3, B:81:0x01cd, B:83:0x01e9, B:86:0x01fd, B:93:0x020e, B:95:0x021f, B:102:0x0230, B:104:0x0234, B:111:0x0247, B:117:0x025a, B:118:0x02ae, B:120:0x02b9, B:122:0x02c4, B:123:0x02c7, B:130:0x02e6, B:137:0x0284, B:139:0x02f2, B:141:0x02f6, B:149:0x030b, B:197:0x0338, B:162:0x0413, B:191:0x041c, B:192:0x041f, B:227:0x0420, B:228:0x0427, B:230:0x0137, B:232:0x013f), top: B:41:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0420 A[Catch: all -> 0x0117, Exception -> 0x011c, IOException -> 0x0121, SizeValidationException -> 0x0126, FileNotFoundException -> 0x012b, SecurityException -> 0x0130, TRY_ENTER, TryCatch #35 {all -> 0x0117, blocks: (B:43:0x010e, B:44:0x0149, B:47:0x0153, B:49:0x0159, B:50:0x0161, B:52:0x0167, B:54:0x016e, B:57:0x0177, B:58:0x017e, B:59:0x017f, B:61:0x0183, B:64:0x018c, B:65:0x0193, B:66:0x0194, B:68:0x0198, B:70:0x01a2, B:71:0x01a9, B:74:0x01ac, B:76:0x01b2, B:77:0x01bd, B:79:0x01c3, B:81:0x01cd, B:83:0x01e9, B:86:0x01fd, B:93:0x020e, B:95:0x021f, B:102:0x0230, B:104:0x0234, B:111:0x0247, B:117:0x025a, B:118:0x02ae, B:120:0x02b9, B:122:0x02c4, B:123:0x02c7, B:130:0x02e6, B:137:0x0284, B:139:0x02f2, B:141:0x02f6, B:149:0x030b, B:197:0x0338, B:162:0x0413, B:191:0x041c, B:192:0x041f, B:227:0x0420, B:228:0x0427, B:230:0x0137, B:232:0x013f), top: B:41:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e A[Catch: all -> 0x0117, Exception -> 0x011c, IOException -> 0x0121, SizeValidationException -> 0x0126, FileNotFoundException -> 0x012b, SecurityException -> 0x0130, TRY_ENTER, TryCatch #35 {all -> 0x0117, blocks: (B:43:0x010e, B:44:0x0149, B:47:0x0153, B:49:0x0159, B:50:0x0161, B:52:0x0167, B:54:0x016e, B:57:0x0177, B:58:0x017e, B:59:0x017f, B:61:0x0183, B:64:0x018c, B:65:0x0193, B:66:0x0194, B:68:0x0198, B:70:0x01a2, B:71:0x01a9, B:74:0x01ac, B:76:0x01b2, B:77:0x01bd, B:79:0x01c3, B:81:0x01cd, B:83:0x01e9, B:86:0x01fd, B:93:0x020e, B:95:0x021f, B:102:0x0230, B:104:0x0234, B:111:0x0247, B:117:0x025a, B:118:0x02ae, B:120:0x02b9, B:122:0x02c4, B:123:0x02c7, B:130:0x02e6, B:137:0x0284, B:139:0x02f2, B:141:0x02f6, B:149:0x030b, B:197:0x0338, B:162:0x0413, B:191:0x041c, B:192:0x041f, B:227:0x0420, B:228:0x0427, B:230:0x0137, B:232:0x013f), top: B:41:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v36, types: [com.crrepa.ble.nrf.dfu.DfuCallback, com.crrepa.ble.nrf.dfu.DfuService] */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onHandleIntent(Intent intent) {
        int i8;
        Throwable th;
        InputStream inputStream;
        Exception exc;
        InputStream inputStream2;
        SecurityException securityException;
        InputStream inputStream3;
        IOException iOException;
        InputStream inputStream4;
        FileNotFoundException fileNotFoundException;
        InputStream inputStream5;
        SizeValidationException sizeValidationException;
        InputStream inputStream6;
        InputStream inputStream7;
        InputStream openInputStream;
        int available;
        Throwable th2;
        DfuService dfuService;
        DfuService dfuService2;
        int i9;
        char c8;
        DfuException dfuException;
        DfuService dfuService3;
        DeviceDisconnectedException deviceDisconnectedException;
        DfuService dfuService4;
        String format;
        DfuService dfuService5;
        DfuService dfuService6;
        int i10;
        String format2;
        String stringExtra = intent.getStringExtra(EXTRA_DEVICE_ADDRESS);
        String stringExtra2 = intent.getStringExtra(EXTRA_DEVICE_NAME);
        boolean booleanExtra = intent.getBooleanExtra(EXTRA_DISABLE_NOTIFICATION, false);
        String stringExtra3 = intent.getStringExtra(EXTRA_FILE_PATH);
        Uri uri = (Uri) intent.getParcelableExtra(EXTRA_FILE_URI);
        int intExtra = intent.getIntExtra(EXTRA_FILE_RES_ID, 0);
        String stringExtra4 = intent.getStringExtra(EXTRA_INIT_FILE_PATH);
        Uri uri2 = (Uri) intent.getParcelableExtra(EXTRA_INIT_FILE_URI);
        int intExtra2 = intent.getIntExtra(EXTRA_INIT_FILE_RES_ID, 0);
        int intExtra3 = intent.getIntExtra(EXTRA_FILE_TYPE, 0);
        if (stringExtra3 != null && intExtra3 == 0) {
            intExtra3 = stringExtra3.toLowerCase(Locale.US).endsWith(g1.URL_PROTOCOL_ZIP) ? 0 : 4;
        }
        String stringExtra5 = intent.getStringExtra(EXTRA_FILE_MIME_TYPE);
        if (stringExtra5 == null) {
            stringExtra5 = intExtra3 == 0 ? MIME_TYPE_ZIP : "application/octet-stream";
        }
        if ((intExtra3 & (-8)) > 0 || !(MIME_TYPE_ZIP.equals(stringExtra5) || "application/octet-stream".equals(stringExtra5))) {
            logw("File type or file mime-type not supported");
            sendLogBroadcast(15, "File type or file mime-type not supported");
        } else if (!"application/octet-stream".equals(stringExtra5) || intExtra3 == 1 || intExtra3 == 2 || intExtra3 == 4) {
            UuidHelper.assignCustomUuids(intent);
            this.mDeviceAddress = stringExtra;
            this.mDeviceName = stringExtra2;
            this.mDisableNotification = booleanExtra;
            this.mConnectionState = 0;
            this.mError = 0;
            try {
                i8 = Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(this).getString(DfuSettingsConstants.SETTINGS_MBR_SIZE, String.valueOf(4096)));
                if (i8 < 0) {
                    i8 = 0;
                }
            } catch (NumberFormatException unused) {
                i8 = 4096;
            }
            ?? r52 = "DFU service started";
            sendLogBroadcast(1, "DFU service started");
            try {
                try {
                    sendLogBroadcast(1, "Opening file...");
                    try {
                        try {
                            if (uri != null) {
                                openInputStream = openInputStream(uri, stringExtra5, i8, intExtra3);
                            } else if (stringExtra3 != null) {
                                openInputStream = openInputStream(stringExtra3, stringExtra5, i8, intExtra3);
                            } else if (intExtra > 0) {
                                openInputStream = openInputStream(intExtra, stringExtra5, i8, intExtra3);
                            } else {
                                inputStream7 = null;
                                InputStream openInputStream2 = uri2 == null ? getContentResolver().openInputStream(uri2) : stringExtra4 != null ? new FileInputStream(stringExtra4) : intExtra2 > 0 ? getResources().openRawResource(intExtra2) : null;
                                available = inputStream7.available();
                                if (available % 4 == 0) {
                                    throw new SizeValidationException("The new firmware is not word-aligned.");
                                }
                                if (intExtra3 == 0 && MIME_TYPE_ZIP.equals(stringExtra5)) {
                                    intExtra3 = ((ArchiveInputStream) inputStream7).getContentType();
                                }
                                if (MIME_TYPE_ZIP.equals(stringExtra5)) {
                                    ArchiveInputStream archiveInputStream = (ArchiveInputStream) inputStream7;
                                    if ((intExtra3 & 4) > 0 && archiveInputStream.applicationImageSize() % 4 != 0) {
                                        throw new SizeValidationException("Application firmware is not word-aligned.");
                                    }
                                    if ((intExtra3 & 2) > 0 && archiveInputStream.bootloaderImageSize() % 4 != 0) {
                                        throw new SizeValidationException("Bootloader firmware is not word-aligned.");
                                    }
                                    if ((intExtra3 & 1) > 0 && archiveInputStream.softDeviceImageSize() % 4 != 0) {
                                        throw new SizeValidationException("Soft Device firmware is not word-aligned.");
                                    }
                                    if (intExtra3 == 4) {
                                        if (archiveInputStream.getApplicationInit() != null) {
                                            openInputStream2 = new ByteArrayInputStream(archiveInputStream.getApplicationInit());
                                        }
                                    } else if (archiveInputStream.getSystemInit() != null) {
                                        openInputStream2 = new ByteArrayInputStream(archiveInputStream.getSystemInit());
                                    }
                                }
                                InputStream inputStream8 = openInputStream2;
                                ?? r53 = 5;
                                sendLogBroadcast(5, "Image file opened (" + available + " bytes in total)");
                                waitFor(1000);
                                waitFor(1000);
                                this.mProgressInfo = new DfuProgressInfo(this);
                                if (this.mAborted) {
                                    logw("Upload aborted");
                                    sendLogBroadcast(15, "Upload aborted");
                                    this.mProgressInfo.setProgress(-7);
                                    try {
                                        inputStream7.close();
                                        return;
                                    } catch (IOException unused2) {
                                        return;
                                    }
                                }
                                sendLogBroadcast(1, "Connecting to DFU target...");
                                this.mProgressInfo.setProgress(-1);
                                BluetoothGatt connect = connect(stringExtra);
                                if (connect == null) {
                                    loge("Bluetooth adapter disabled");
                                    sendLogBroadcast(20, "Bluetooth adapter disabled");
                                    report(4106);
                                    try {
                                        inputStream7.close();
                                        return;
                                    } catch (IOException unused3) {
                                        return;
                                    }
                                }
                                if (this.mConnectionState == 0) {
                                    loge("Device got disconnected before service discovery finished");
                                    sendLogBroadcast(5, "Disconnected");
                                    terminateConnection(connect, 4096);
                                    try {
                                        inputStream7.close();
                                        return;
                                    } catch (IOException unused4) {
                                        return;
                                    }
                                }
                                int i11 = this.mError;
                                if (i11 > 0) {
                                    if ((i11 & 32768) > 0) {
                                        int i12 = i11 & (-32769);
                                        loge("An error occurred while connecting to the device:" + i12);
                                        format2 = String.format("Connection failed (0x%02X): %s", Integer.valueOf(i12), GattError.parseConnectionError(i12));
                                        i10 = 0;
                                    } else {
                                        int i13 = i11 & (-16385);
                                        loge("An error occurred during discovering services:" + i13);
                                        i10 = 0;
                                        format2 = String.format("Connection failed (0x%02X): %s", Integer.valueOf(i13), GattError.parse(i13));
                                    }
                                    sendLogBroadcast(20, format2);
                                    if (intent.getIntExtra(EXTRA_ATTEMPT, i10) != 0) {
                                        terminateConnection(connect, this.mError);
                                        try {
                                            inputStream7.close();
                                            return;
                                        } catch (IOException unused5) {
                                            return;
                                        }
                                    }
                                    sendLogBroadcast(15, "Retrying...");
                                    if (this.mConnectionState != 0) {
                                        disconnect(connect);
                                    }
                                    refreshDeviceCache(connect, true);
                                    close(connect);
                                    logi("Restarting the service");
                                    Intent intent2 = new Intent();
                                    intent2.fillIn(intent, 24);
                                    intent2.putExtra(EXTRA_ATTEMPT, 1);
                                    startService(intent2);
                                    try {
                                        inputStream7.close();
                                        return;
                                    } catch (IOException unused6) {
                                        return;
                                    }
                                }
                                if (this.mAborted) {
                                    logw("Upload aborted");
                                    sendLogBroadcast(15, "Upload aborted");
                                    terminateConnection(connect, 0);
                                    this.mProgressInfo.setProgress(-7);
                                    try {
                                        inputStream7.close();
                                        return;
                                    } catch (IOException unused7) {
                                        return;
                                    }
                                }
                                try {
                                    sendLogBroadcast(5, "Services discovered");
                                    intent.putExtra(EXTRA_ATTEMPT, 0);
                                    try {
                                        DfuServiceProvider dfuServiceProvider = new DfuServiceProvider();
                                        this.mDfuServiceImpl = dfuServiceProvider;
                                        r53 = dfuServiceProvider.getServiceImpl(intent, this, connect);
                                        try {
                                            try {
                                                this.mDfuServiceImpl = r53;
                                            } catch (UploadAbortedException unused8) {
                                                dfuService6 = r53;
                                            }
                                        } catch (DeviceDisconnectedException e8) {
                                            e = e8;
                                        } catch (DfuException e9) {
                                            i9 = 2;
                                            c8 = 1;
                                            dfuException = e9;
                                            dfuService3 = r53;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th2 = th;
                                            dfuService = r53;
                                            if (dfuService != null) {
                                                throw th2;
                                            }
                                            dfuService.release();
                                            throw th2;
                                        }
                                    } catch (DeviceDisconnectedException e10) {
                                        deviceDisconnectedException = e10;
                                        dfuService4 = null;
                                    } catch (DfuException e11) {
                                        i9 = 2;
                                        c8 = 1;
                                        dfuException = e11;
                                        dfuService3 = null;
                                    } catch (UploadAbortedException unused9) {
                                        dfuService2 = null;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        dfuService = null;
                                    }
                                    try {
                                        if (r53 != 0) {
                                            c8 = 1;
                                            i9 = 2;
                                            dfuService6 = r53;
                                            try {
                                                if (r53.initialize(intent, connect, intExtra3, inputStream7, inputStream8)) {
                                                    dfuService6.performDfu(intent);
                                                }
                                                dfuService5 = dfuService6;
                                            } catch (DeviceDisconnectedException e12) {
                                                deviceDisconnectedException = e12;
                                                dfuService4 = dfuService6;
                                                sendLogBroadcast(20, "Device has disconnected");
                                                loge(deviceDisconnectedException.getMessage());
                                                close(connect);
                                                report(4096);
                                                if (dfuService4 != null) {
                                                }
                                                inputStream7.close();
                                                return;
                                            } catch (DfuException e13) {
                                                dfuException = e13;
                                                dfuService3 = dfuService6;
                                            } catch (UploadAbortedException unused10) {
                                                dfuService2 = dfuService6;
                                                logw("Upload aborted");
                                                sendLogBroadcast(15, "Upload aborted");
                                                terminateConnection(connect, 0);
                                                this.mProgressInfo.setProgress(-7);
                                                dfuService5 = dfuService2;
                                            } catch (Throwable th5) {
                                                th2 = th5;
                                                dfuService = dfuService6;
                                                if (dfuService != null) {
                                                }
                                            }
                                            dfuService5.release();
                                            inputStream7.close();
                                            return;
                                        }
                                        try {
                                            Log.w(TAG, "DFU Service not found.");
                                            sendLogBroadcast(15, "DFU Service not found");
                                            terminateConnection(connect, 4102);
                                            if (r53 != 0) {
                                                r53.release();
                                            }
                                            try {
                                                inputStream7.close();
                                                return;
                                            } catch (IOException unused11) {
                                                return;
                                            }
                                        } catch (DeviceDisconnectedException e14) {
                                            e = e14;
                                            deviceDisconnectedException = e;
                                            dfuService4 = r53;
                                            sendLogBroadcast(20, "Device has disconnected");
                                            loge(deviceDisconnectedException.getMessage());
                                            close(connect);
                                            report(4096);
                                            if (dfuService4 != null) {
                                                dfuService5 = dfuService4;
                                                dfuService5.release();
                                            }
                                            inputStream7.close();
                                            return;
                                        } catch (DfuException e15) {
                                            dfuException = e15;
                                            i9 = 2;
                                            c8 = 1;
                                            dfuService3 = r53;
                                        }
                                        inputStream7.close();
                                        return;
                                    } catch (IOException unused12) {
                                        return;
                                    }
                                    int errorNumber = dfuException.getErrorNumber();
                                    if ((errorNumber & 32768) > 0) {
                                        int i14 = errorNumber & (-32769);
                                        Object[] objArr = new Object[i9];
                                        objArr[0] = Integer.valueOf(i14);
                                        objArr[c8] = GattError.parseConnectionError(i14);
                                        format = String.format("Error (0x%02X): %s", objArr);
                                    } else {
                                        int i15 = errorNumber & (-16385);
                                        Object[] objArr2 = new Object[i9];
                                        objArr2[0] = Integer.valueOf(i15);
                                        objArr2[c8] = GattError.parse(i15);
                                        format = String.format("Error (0x%02X): %s", objArr2);
                                    }
                                    sendLogBroadcast(20, format);
                                    loge(dfuException.getMessage());
                                    terminateConnection(connect, dfuException.getErrorNumber());
                                    if (dfuService3 != null) {
                                        dfuService5 = dfuService3;
                                        dfuService5.release();
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                            if (uri2 == null) {
                            }
                            available = inputStream7.available();
                            if (available % 4 == 0) {
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            inputStream = inputStream7;
                            if (inputStream == null) {
                                throw th;
                            }
                            try {
                                inputStream.close();
                                throw th;
                            } catch (IOException unused13) {
                                throw th;
                            }
                        }
                    } catch (SizeValidationException e16) {
                        sizeValidationException = e16;
                        inputStream6 = inputStream7;
                        loge("Firmware not word-aligned", sizeValidationException);
                        sendLogBroadcast(20, "Opening file failed: Firmware size must be word-aligned");
                        report(4108);
                        if (inputStream6 != null) {
                            try {
                                inputStream6.close();
                                return;
                            } catch (IOException unused14) {
                                return;
                            }
                        }
                        return;
                    } catch (FileNotFoundException e17) {
                        fileNotFoundException = e17;
                        inputStream5 = inputStream7;
                        loge("An exception occurred while opening file", fileNotFoundException);
                        sendLogBroadcast(20, "Opening file failed: File not found");
                        report(4097);
                        if (inputStream5 != null) {
                            try {
                                inputStream5.close();
                                return;
                            } catch (IOException unused15) {
                                return;
                            }
                        }
                        return;
                    } catch (IOException e18) {
                        iOException = e18;
                        inputStream4 = inputStream7;
                        loge("An exception occurred while calculating file size", iOException);
                        sendLogBroadcast(20, "Opening file failed: " + iOException.getLocalizedMessage());
                        report(4098);
                        if (inputStream4 != null) {
                            try {
                                inputStream4.close();
                                return;
                            } catch (IOException unused16) {
                                return;
                            }
                        }
                        return;
                    } catch (SecurityException e19) {
                        securityException = e19;
                        inputStream3 = inputStream7;
                        loge("A security exception occurred while opening file", securityException);
                        sendLogBroadcast(20, "Opening file failed: Permission required");
                        report(4097);
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                                return;
                            } catch (IOException unused17) {
                                return;
                            }
                        }
                        return;
                    } catch (Exception e20) {
                        exc = e20;
                        inputStream2 = inputStream7;
                        loge("An exception occurred while opening files. Did you set the firmware file?", exc);
                        sendLogBroadcast(20, "Opening file failed: " + exc.getLocalizedMessage());
                        report(4098);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                                return;
                            } catch (IOException unused18) {
                                return;
                            }
                        }
                        return;
                    }
                    inputStream7 = openInputStream;
                } catch (Throwable th8) {
                    th = th8;
                    inputStream = r52;
                }
            } catch (SizeValidationException e21) {
                sizeValidationException = e21;
                inputStream6 = null;
            } catch (FileNotFoundException e22) {
                fileNotFoundException = e22;
                inputStream5 = null;
            } catch (IOException e23) {
                iOException = e23;
                inputStream4 = null;
            } catch (SecurityException e24) {
                securityException = e24;
                inputStream3 = null;
            } catch (Exception e25) {
                exc = e25;
                inputStream2 = null;
            } catch (Throwable th9) {
                th = th9;
                inputStream = null;
            }
        } else {
            logw("Unable to determine file type");
            sendLogBroadcast(15, "Unable to determine file type");
        }
        report(4105);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        ((NotificationManager) getSystemService("notification")).cancel(283);
        stopSelf();
    }

    protected void refreshDeviceCache(BluetoothGatt bluetoothGatt, boolean z7) {
        if (z7 || bluetoothGatt.getDevice().getBondState() == 10) {
            sendLogBroadcast(0, "gatt.refresh() (hidden)");
            try {
                Method method = bluetoothGatt.getClass().getMethod("refresh", new Class[0]);
                if (method != null) {
                    logi("Refreshing result: " + ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue());
                }
            } catch (Exception e8) {
                loge("An exception occurred while refreshing device", e8);
                sendLogBroadcast(15, "Refreshing failed");
            }
        }
    }

    void sendLogBroadcast(int i8, String str) {
        Intent intent = new Intent(BROADCAST_LOG);
        intent.putExtra(EXTRA_LOG_MESSAGE, "[DFU] " + str);
        intent.putExtra(EXTRA_LOG_LEVEL, i8);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    protected void terminateConnection(BluetoothGatt bluetoothGatt, int i8) {
        if (this.mConnectionState != 0) {
            disconnect(bluetoothGatt);
        }
        refreshDeviceCache(bluetoothGatt, false);
        close(bluetoothGatt);
        waitFor(600);
        if (i8 != 0) {
            report(i8);
        }
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuProgressInfo.ProgressListener
    public void updateProgressNotification() {
        NotificationCompat.Builder contentTitle;
        String string;
        int i8;
        DfuProgressInfo dfuProgressInfo = this.mProgressInfo;
        int progress = dfuProgressInfo.getProgress();
        if (this.mLastProgress == progress) {
            return;
        }
        this.mLastProgress = progress;
        sendProgressBroadcast(dfuProgressInfo);
        if (this.mDisableNotification) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.mLastNotificationTime < 250) {
            return;
        }
        this.mLastNotificationTime = elapsedRealtime;
        String str = this.mDeviceAddress;
        String str2 = this.mDeviceName;
        if (str2 == null) {
            str2 = getString(R.string.dfu_unknown_name);
        }
        NotificationCompat.Builder onlyAlertOnce = new NotificationCompat.Builder(this).setSmallIcon(android.R.drawable.stat_sys_upload).setOnlyAlertOnce(true);
        onlyAlertOnce.setColor(-7829368);
        switch (progress) {
            case -7:
                onlyAlertOnce.setOngoing(false).setContentTitle(getString(R.string.dfu_status_aborted)).setSmallIcon(android.R.drawable.stat_sys_upload_done).setContentText(getString(R.string.dfu_status_aborted_msg)).setAutoCancel(true);
                break;
            case -6:
                onlyAlertOnce.setOngoing(false).setContentTitle(getString(R.string.dfu_status_completed)).setSmallIcon(android.R.drawable.stat_sys_upload_done).setContentText(getString(R.string.dfu_status_completed_msg)).setAutoCancel(true).setColor(-16730086);
                break;
            case -5:
                contentTitle = onlyAlertOnce.setOngoing(true).setContentTitle(getString(R.string.dfu_status_disconnecting));
                string = getString(R.string.dfu_status_disconnecting_msg, str2);
                contentTitle.setContentText(string).setProgress(100, 0, true);
                break;
            case -4:
                contentTitle = onlyAlertOnce.setOngoing(true).setContentTitle(getString(R.string.dfu_status_validating));
                i8 = R.string.dfu_status_validating_msg;
                string = getString(i8);
                contentTitle.setContentText(string).setProgress(100, 0, true);
                break;
            case -3:
                contentTitle = onlyAlertOnce.setOngoing(true).setContentTitle(getString(R.string.dfu_status_switching_to_dfu));
                i8 = R.string.dfu_status_switching_to_dfu_msg;
                string = getString(i8);
                contentTitle.setContentText(string).setProgress(100, 0, true);
                break;
            case -2:
                contentTitle = onlyAlertOnce.setOngoing(true).setContentTitle(getString(R.string.dfu_status_starting));
                i8 = R.string.dfu_status_starting_msg;
                string = getString(i8);
                contentTitle.setContentText(string).setProgress(100, 0, true);
                break;
            case -1:
                contentTitle = onlyAlertOnce.setOngoing(true).setContentTitle(getString(R.string.dfu_status_connecting));
                string = getString(R.string.dfu_status_connecting_msg, str2);
                contentTitle.setContentText(string).setProgress(100, 0, true);
                break;
            default:
                onlyAlertOnce.setOngoing(true).setContentTitle(dfuProgressInfo.getTotalParts() == 1 ? getString(R.string.dfu_status_uploading) : getString(R.string.dfu_status_uploading_part, Integer.valueOf(dfuProgressInfo.getCurrentPart()), Integer.valueOf(dfuProgressInfo.getTotalParts()))).setContentText(getString(R.string.dfu_status_uploading_msg, str2)).setProgress(100, progress, false);
                break;
        }
        Intent intent = new Intent(this, getNotificationTarget());
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, str);
        intent.putExtra(EXTRA_DEVICE_NAME, str2);
        intent.putExtra(EXTRA_PROGRESS, progress);
        onlyAlertOnce.setContentIntent(PendingIntent.getActivity(this, 0, intent, C.BUFFER_FLAG_FIRST_SAMPLE));
        if (progress != -7 && progress != -6) {
            Intent intent2 = new Intent(BROADCAST_ACTION);
            intent2.putExtra(EXTRA_ACTION, 2);
            onlyAlertOnce.addAction(R.drawable.ic_action_notify_cancel, getString(R.string.dfu_action_abort), PendingIntent.getBroadcast(this, 1, intent2, C.BUFFER_FLAG_FIRST_SAMPLE));
        }
        ((NotificationManager) getSystemService("notification")).notify(283, onlyAlertOnce.build());
    }

    protected void waitFor(int i8) {
        synchronized (this.mLock) {
            try {
                sendLogBroadcast(0, "wait(" + i8 + ")");
                this.mLock.wait((long) i8);
            } catch (InterruptedException e8) {
                loge("Sleeping interrupted", e8);
            }
        }
    }

    protected void waitUntilDisconnected() {
        try {
            synchronized (this.mLock) {
                while (this.mConnectionState != 0 && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
    }

    private void loge(String str, Throwable th) {
        Log.e(TAG, str, th);
    }

    private InputStream openInputStream(Uri uri, String str, int i8, int i9) {
        InputStream openInputStream = getContentResolver().openInputStream(uri);
        if (MIME_TYPE_ZIP.equals(str)) {
            return new ArchiveInputStream(openInputStream, i8, i9);
        }
        Cursor query = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        try {
            return (query.moveToNext() && query.getString(0).toLowerCase(Locale.US).endsWith("hex")) ? new HexInputStream(openInputStream, i8) : openInputStream;
        } finally {
            query.close();
        }
    }

    private InputStream openInputStream(String str, String str2, int i8, int i9) {
        FileInputStream fileInputStream = new FileInputStream(str);
        return MIME_TYPE_ZIP.equals(str2) ? new ArchiveInputStream(fileInputStream, i8, i9) : str.toLowerCase(Locale.US).endsWith("hex") ? new HexInputStream(fileInputStream, i8) : fileInputStream;
    }
}
