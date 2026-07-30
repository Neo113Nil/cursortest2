package com.crrepa.ble.ota.goodix;

import android.text.TextUtils;
import com.crrepa.ble.CRPBleClient;
import com.crrepa.ble.conn.CRPBleDevice;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.c;
import com.crrepa.g1.d;
import com.google.android.exoplayer2.C;
import d4.a;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class RestoreFirmwareControllerImpl {
    private static final int DELAY_TIME = 3000;
    private static final int MAX_RETRY_COUNT = 5;
    private static final int STATE_READ_BOOT = 17;
    private static final int STATE_SEND_BOOT = 18;
    private static final int STATE_SEND_START = 19;
    private static final int STATE_SHUTDOWN = 20;
    private BleRestoreConnection bleConnection;
    private CRPBleDevice bleDevice;
    private byte[] bootBytes;
    private RestoreFirmwareChangeListener listener;
    private int restoreState;
    private CRPBleConnectionStateListener connectionStateListener = new BleConnectionStateListener(this);
    private BootInfoChangeListener bootInfoChangeListener = new BootInfoChangeListener(this);
    private int connectCount = 0;
    private CRPBleClient bleClient = CRPBleClient.create(d.a());

    static class BleConnectionStateListener implements CRPBleConnectionStateListener {
        private WeakReference<RestoreFirmwareControllerImpl> weakReference;

        public BleConnectionStateListener(RestoreFirmwareControllerImpl restoreFirmwareControllerImpl) {
            this.weakReference = new WeakReference<>(restoreFirmwareControllerImpl);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleConnectionStateListener
        public void onConnectionStateChange(int i8) {
            BleLog.i("restore onConnectionStateChange: " + i8);
            RestoreFirmwareControllerImpl restoreFirmwareControllerImpl = this.weakReference.get();
            if (restoreFirmwareControllerImpl == null) {
                return;
            }
            if (i8 == 0) {
                restoreFirmwareControllerImpl.handleDisconnected();
            } else {
                if (i8 != 2) {
                    return;
                }
                restoreFirmwareControllerImpl.handleConnected();
            }
        }
    }

    static class BootInfoChangeListener implements BleBootInfoChangeListener {
        private WeakReference<RestoreFirmwareControllerImpl> weakReference;

        public BootInfoChangeListener(RestoreFirmwareControllerImpl restoreFirmwareControllerImpl) {
            this.weakReference = new WeakReference<>(restoreFirmwareControllerImpl);
        }

        @Override // com.crrepa.ble.ota.goodix.BleBootInfoChangeListener
        public void onBootInfo(byte[] bArr) {
            BleLog.i("onBootInfo: " + c.c(bArr));
            RestoreFirmwareControllerImpl restoreFirmwareControllerImpl = this.weakReference.get();
            if (restoreFirmwareControllerImpl != null && restoreFirmwareControllerImpl.restoreState == 17) {
                restoreFirmwareControllerImpl.bootBytes = bArr;
                restoreFirmwareControllerImpl.sendBootInfo();
            }
        }

        @Override // com.crrepa.ble.ota.goodix.BleBootInfoChangeListener
        public void onBootInfoSendState(boolean z7) {
            BleLog.i("onBootInfoSendState success: " + z7);
            RestoreFirmwareControllerImpl restoreFirmwareControllerImpl = this.weakReference.get();
            if (restoreFirmwareControllerImpl == null) {
                return;
            }
            BleLog.i("onBootInfoSendState state: " + restoreFirmwareControllerImpl.restoreState);
            if (!z7) {
                restoreFirmwareControllerImpl.onError(RestoreFirmwareChangeListener.ERROR_SEND_BOOTINFO);
            } else if (restoreFirmwareControllerImpl.restoreState == 18) {
                restoreFirmwareControllerImpl.sendStartInfo();
            } else if (restoreFirmwareControllerImpl.restoreState == 19) {
                restoreFirmwareControllerImpl.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connect() {
        CRPBleDevice cRPBleDevice = this.bleDevice;
        if (cRPBleDevice == null) {
            onError(RestoreFirmwareChangeListener.ERROR_NULL_DEVICE);
            return;
        }
        BleRestoreConnection connectRestore = cRPBleDevice.connectRestore();
        this.bleConnection = connectRestore;
        connectRestore.setConnectionStateListener(this.connectionStateListener);
        this.connectCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnected() {
        this.bleConnection.setBootInfoListener(this.bootInfoChangeListener);
        this.bleConnection.readBootInfo();
        this.restoreState = 17;
        onReadBootInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDisconnected() {
        if (this.restoreState == 20) {
            onComplete();
        } else if (this.connectCount < 5) {
            a.a(new Runnable() { // from class: com.crrepa.ble.ota.goodix.RestoreFirmwareControllerImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    RestoreFirmwareControllerImpl.this.connect();
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            onError(RestoreFirmwareChangeListener.ERROR_MAX_CONNECT_COUNT);
        }
    }

    private void onComplete() {
        RestoreFirmwareChangeListener restoreFirmwareChangeListener = this.listener;
        if (restoreFirmwareChangeListener != null) {
            restoreFirmwareChangeListener.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(int i8) {
        RestoreFirmwareChangeListener restoreFirmwareChangeListener = this.listener;
        if (restoreFirmwareChangeListener != null) {
            restoreFirmwareChangeListener.onError(i8);
        }
    }

    private void onReadBootInfo() {
        RestoreFirmwareChangeListener restoreFirmwareChangeListener = this.listener;
        if (restoreFirmwareChangeListener != null) {
            restoreFirmwareChangeListener.onReadBootInfo();
        }
    }

    private void onSendBootInfo() {
        RestoreFirmwareChangeListener restoreFirmwareChangeListener = this.listener;
        if (restoreFirmwareChangeListener != null) {
            restoreFirmwareChangeListener.onSendBootInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBootInfo() {
        if (this.restoreState != 17) {
            onError(RestoreFirmwareChangeListener.ERROR_NOT_BOOTINFO);
        } else {
            if (c.h(this.bootBytes)) {
                onError(RestoreFirmwareChangeListener.ERROR_NOT_BOOTINFO);
                return;
            }
            this.bleConnection.sendBootInfo(this.bootBytes);
            this.restoreState = 18;
            onSendBootInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendStartInfo() {
        if (c.h(this.bootBytes)) {
            onError(RestoreFirmwareChangeListener.ERROR_NOT_BOOTINFO);
        } else {
            this.bleConnection.sendStartInfo(this.bootBytes);
            this.restoreState = 19;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.bleConnection.shutdown();
        this.restoreState = 20;
    }

    public void setListener(RestoreFirmwareChangeListener restoreFirmwareChangeListener) {
        this.listener = restoreFirmwareChangeListener;
    }

    public void start(String str) {
        if (TextUtils.isEmpty(str)) {
            onError(RestoreFirmwareChangeListener.ERROR_NULL_ADDRESS);
        } else {
            this.bleDevice = this.bleClient.getBleDevice(str);
            connect();
        }
    }
}
