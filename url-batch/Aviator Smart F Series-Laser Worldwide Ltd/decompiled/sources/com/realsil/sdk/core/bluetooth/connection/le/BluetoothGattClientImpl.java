package com.realsil.sdk.core.bluetooth.connection.le;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class BluetoothGattClientImpl extends BluetoothGattClient {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f15467t = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f15468n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15469o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15470p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15471q = false;

    /* renamed from: r, reason: collision with root package name */
    public final Runnable f15472r = new Runnable() { // from class: com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattClientImpl.1
        @Override // java.lang.Runnable
        public void run() {
            ZLogger.v(((BluetoothClient) BluetoothGattClientImpl.this).DBG, "connection procedure started");
            BluetoothGattClientImpl bluetoothGattClientImpl = BluetoothGattClientImpl.this;
            bluetoothGattClientImpl.f15469o = false;
            bluetoothGattClientImpl.f15452d = true;
            bluetoothGattClientImpl.f15466m = false;
            bluetoothGattClientImpl.f15471q = false;
            bluetoothGattClientImpl.f15464k = false;
            BluetoothDevice a8 = bluetoothGattClientImpl.a(((BluetoothClient) bluetoothGattClientImpl).mDeviceAddress);
            if (BluetoothGattClientImpl.this.mGattConnParams.isCreateBond()) {
                if (BluetoothGattClientImpl.this.getBondState() != 12) {
                    BluetoothGattClientImpl bluetoothGattClientImpl2 = BluetoothGattClientImpl.this;
                    bluetoothGattClientImpl2.a(a8, bluetoothGattClientImpl2.mGattConnParams.getBondTransport());
                }
                if (!BluetoothClient.a(a8)) {
                    ZLogger.v(((BluetoothClient) BluetoothGattClientImpl.this).DBG, "device(" + BluetoothHelper.formatAddress(((BluetoothClient) BluetoothGattClientImpl.this).mDeviceAddress, true) + ") bond failed");
                }
            }
            if (BluetoothGattClientImpl.this.mGattConnParams.isA2dpEnabled() && BluetoothClient.a(a8)) {
                BluetoothGattClientImpl.this.a();
            }
            if (BluetoothGattClientImpl.this.mGattConnParams.isHfpEnabled() && BluetoothClient.a(a8)) {
                BluetoothGattClientImpl.this.b();
            }
            BluetoothGattClientImpl bluetoothGattClientImpl3 = BluetoothGattClientImpl.this;
            if (!bluetoothGattClientImpl3.f15452d) {
                BluetoothGattClientImpl.a(bluetoothGattClientImpl3, 1);
                return;
            }
            bluetoothGattClientImpl3.updateConnectionState(1);
            int i8 = 0;
            do {
                boolean z7 = i8 == BluetoothGattClientImpl.this.mGattConnParams.getReconnectTimes();
                boolean z8 = ((BluetoothClient) BluetoothGattClientImpl.this).DBG;
                Locale locale = Locale.US;
                ZLogger.d(z8, "connect to " + BluetoothHelper.formatAddress(((BluetoothClient) BluetoothGattClientImpl.this).mDeviceAddress, true) + " , times=" + i8 + "/" + z7);
                i8++;
                boolean d8 = BluetoothGattClientImpl.d(BluetoothGattClientImpl.this);
                int i9 = !d8 ? 8 : 0;
                ZLogger.v(((BluetoothClient) BluetoothGattClientImpl.this).VDBG, "establishConnection.ret=" + d8 + ",statusCode=" + i9);
                if (d8) {
                    break;
                }
                BluetoothGattClientImpl.f(BluetoothGattClientImpl.this);
                if (z7) {
                    BluetoothGattClientImpl.a(BluetoothGattClientImpl.this, i9);
                    return;
                }
            } while (BluetoothGattClientImpl.this.f15452d);
            if (!BluetoothGattClientImpl.this.isConnected()) {
                BluetoothGattClientImpl.a(BluetoothGattClientImpl.this, 2);
                return;
            }
            int g8 = BluetoothGattClientImpl.g(BluetoothGattClientImpl.this);
            if (g8 != 0) {
                BluetoothGattClientImpl.a(BluetoothGattClientImpl.this, g8);
                return;
            }
            BluetoothGattClientImpl bluetoothGattClientImpl4 = BluetoothGattClientImpl.this;
            bluetoothGattClientImpl4.processServices(bluetoothGattClientImpl4.mBluetoothGatt);
            if (BluetoothGattClientImpl.this.mGattConnParams.isRequestMtuEnabled()) {
                BluetoothGattClientImpl bluetoothGattClientImpl5 = BluetoothGattClientImpl.this;
                if (!bluetoothGattClientImpl5.f15452d) {
                    BluetoothGattClientImpl.a(bluetoothGattClientImpl5, 1);
                    return;
                }
                BluetoothGattClientImpl.h(bluetoothGattClientImpl5);
            } else {
                BluetoothGattClientImpl bluetoothGattClientImpl6 = BluetoothGattClientImpl.this;
                bluetoothGattClientImpl6.f15453e = bluetoothGattClientImpl6.mGattConnParams.getDefaultMtuSize();
                BluetoothGattClientImpl bluetoothGattClientImpl7 = BluetoothGattClientImpl.this;
                bluetoothGattClientImpl7.f15454f.setTxMtu(bluetoothGattClientImpl7.mGattConnParams.getDefaultMtuSize());
            }
            if (BluetoothGattClientImpl.this.mGattConnParams.isPhyEnabled()) {
                BluetoothGattClientImpl bluetoothGattClientImpl8 = BluetoothGattClientImpl.this;
                if (!bluetoothGattClientImpl8.f15452d) {
                    BluetoothGattClientImpl.a(bluetoothGattClientImpl8, 1);
                    return;
                } else if (BluetoothGattClientImpl.b(bluetoothGattClientImpl8, bluetoothGattClientImpl8.mGattConnParams.phyLevel)) {
                    BluetoothGattClientImpl.i(BluetoothGattClientImpl.this);
                }
            }
            BluetoothGattClientImpl bluetoothGattClientImpl9 = BluetoothGattClientImpl.this;
            if (!bluetoothGattClientImpl9.f15452d) {
                BluetoothGattClientImpl.a(bluetoothGattClientImpl9, 1);
                return;
            }
            boolean enableCccd = bluetoothGattClientImpl9.enableCccd();
            if (!BluetoothGattClientImpl.this.mGattConnParams.ignoreEnableNotificationResponse() && !enableCccd) {
                BluetoothGattClientImpl.f(BluetoothGattClientImpl.this);
                BluetoothGattClientImpl.a(BluetoothGattClientImpl.this, 5);
                return;
            }
            BluetoothGattClientImpl bluetoothGattClientImpl10 = BluetoothGattClientImpl.this;
            if (!bluetoothGattClientImpl10.f15452d) {
                BluetoothGattClientImpl.a(bluetoothGattClientImpl10, 1);
            } else {
                bluetoothGattClientImpl10.processConnectionTask();
                BluetoothGattClientImpl.a(BluetoothGattClientImpl.this, 0);
            }
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final BluetoothGattCallbackCompat f15473s = new BluetoothGattCallbackCompat() { // from class: com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattClientImpl.2
        public final void a() {
            BluetoothGattClientImpl.this.mBluetoothGatt = null;
            StringBuilder sb = new StringBuilder("onConnectionLostOrFailed.connectionProcedureStarted=");
            BluetoothGattClientImpl bluetoothGattClientImpl = BluetoothGattClientImpl.this;
            int i8 = BluetoothGattClientImpl.f15467t;
            sb.append(bluetoothGattClientImpl.f15452d);
            ZLogger.v(sb.toString());
            BluetoothGattClientImpl bluetoothGattClientImpl2 = BluetoothGattClientImpl.this;
            if (!bluetoothGattClientImpl2.f15452d) {
                bluetoothGattClientImpl2.updateConnectionState(0);
                return;
            }
            bluetoothGattClientImpl2.f15470p = false;
            if (!bluetoothGattClientImpl2.f15469o) {
                bluetoothGattClientImpl2.closeGatt();
            }
            BluetoothGattClientImpl.this.notifyConnLock();
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicChanged(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            BluetoothGattClientImpl.this.processCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bArr);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicRead(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr, int i8) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
            BluetoothGattClientImpl.this.processCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
            BluetoothGattClientImpl.this.processCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
            if (i8 != 0) {
                a();
                return;
            }
            if (i9 != 2) {
                if (i9 == 0) {
                    a();
                }
            } else {
                BluetoothGattClientImpl bluetoothGattClientImpl = BluetoothGattClientImpl.this;
                bluetoothGattClientImpl.mBluetoothGatt = bluetoothGatt;
                bluetoothGattClientImpl.f15470p = true;
                if (bluetoothGattClientImpl.f15452d) {
                    bluetoothGattClientImpl.notifyConnLockWithState(1);
                }
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i8, int i9, int i10, int i11) {
            super.onConnectionUpdated(bluetoothGatt, i8, i9, i10, i11);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onDescriptorRead(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, int i8, @NonNull byte[] bArr) {
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i8, bArr);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
            BluetoothGattClientImpl.this.processDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
            BluetoothGattClientImpl bluetoothGattClientImpl;
            boolean z7;
            super.onMtuChanged(bluetoothGatt, i8, i9);
            BluetoothGattClientImpl bluetoothGattClientImpl2 = BluetoothGattClientImpl.this;
            int i10 = BluetoothGattClientImpl.f15467t;
            synchronized (bluetoothGattClientImpl2.f15456h) {
                try {
                    if (i9 == 0) {
                        BluetoothGattClientImpl bluetoothGattClientImpl3 = BluetoothGattClientImpl.this;
                        int i11 = i8 - 3;
                        bluetoothGattClientImpl3.f15453e = i11;
                        bluetoothGattClientImpl3.f15454f.setTxMtu(i11);
                        bluetoothGattClientImpl = BluetoothGattClientImpl.this;
                        z7 = true;
                    } else {
                        bluetoothGattClientImpl = BluetoothGattClientImpl.this;
                        z7 = false;
                    }
                    bluetoothGattClientImpl.f15471q = z7;
                    BluetoothGattClientImpl bluetoothGattClientImpl4 = BluetoothGattClientImpl.this;
                    if (bluetoothGattClientImpl4.f15465l == 3) {
                        try {
                            bluetoothGattClientImpl4.f15456h.notifyAll();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onPhyRead(BluetoothGatt bluetoothGatt, int i8, int i9, int i10) {
            super.onPhyRead(bluetoothGatt, i8, i9, i10);
            if (i10 == 0) {
                BluetoothGattClientImpl bluetoothGattClientImpl = BluetoothGattClientImpl.this;
                int i11 = BluetoothGattClientImpl.f15467t;
                bluetoothGattClientImpl.f15454f.setPhy(i8, i9);
            }
            BluetoothGattClientImpl.this.notifyConnLockWithState(5);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i8, int i9, int i10) {
            super.onPhyUpdate(bluetoothGatt, i8, i9, i10);
            if (i10 == 0) {
                BluetoothGattClientImpl bluetoothGattClientImpl = BluetoothGattClientImpl.this;
                int i11 = BluetoothGattClientImpl.f15467t;
                bluetoothGattClientImpl.f15454f.setPhy(i8, i9);
            }
            BluetoothGattClientImpl.this.notifyConnLockWithState(4);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i8, int i9) {
            super.onReadRemoteRssi(bluetoothGatt, i8, i9);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i8) {
            super.onReliableWriteCompleted(bluetoothGatt, i8);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onServiceChanged(@NonNull BluetoothGatt bluetoothGatt) {
            super.onServiceChanged(bluetoothGatt);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
            if (i8 == 0 && ((BluetoothClient) BluetoothGattClientImpl.this).DBG) {
                ZLogger.v(BluetoothHelper.dumpBluetoothGattService(bluetoothGatt));
            }
            BluetoothGattClientImpl bluetoothGattClientImpl = BluetoothGattClientImpl.this;
            int i9 = BluetoothGattClientImpl.f15467t;
            synchronized (bluetoothGattClientImpl.f15456h) {
                BluetoothGattClientImpl bluetoothGattClientImpl2 = BluetoothGattClientImpl.this;
                bluetoothGattClientImpl2.f15466m = i8 == 0;
                if (bluetoothGattClientImpl2.f15465l == 2) {
                    try {
                        bluetoothGattClientImpl2.f15456h.notifyAll();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    };

    public BluetoothGattClientImpl(Context context, BluetoothGattClientCallback bluetoothGattClientCallback) {
        this.mContext = context;
        this.mCallback = bluetoothGattClientCallback;
        c();
        this.f15468n = new ThreadPoolExecutor(10, 10, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.AbortPolicy());
    }

    public static void a(BluetoothGattClientImpl bluetoothGattClientImpl, int i8) {
        ZLogger.v(bluetoothGattClientImpl.VDBG, "connection procedure complete:" + i8);
        if (bluetoothGattClientImpl.isConnected()) {
            bluetoothGattClientImpl.updateConnectionState(2, i8);
        } else {
            bluetoothGattClientImpl.updateConnectionState(0, i8);
        }
        bluetoothGattClientImpl.f15452d = false;
    }

    public static boolean d(BluetoothGattClientImpl bluetoothGattClientImpl) {
        bluetoothGattClientImpl.f15470p = false;
        bluetoothGattClientImpl.f15465l = 1;
        ZLogger.v(bluetoothGattClientImpl.DBG, "establishConnection.connectionEstablished=" + bluetoothGattClientImpl.f15470p);
        boolean connect = bluetoothGattClientImpl.mGlobalGatt.connect(bluetoothGattClientImpl.mDeviceAddress, bluetoothGattClientImpl.mGattConnParams.getConnectionTransport(), bluetoothGattClientImpl.f15473s);
        if (connect) {
            if (!bluetoothGattClientImpl.f15470p || bluetoothGattClientImpl.mBluetoothGatt == null) {
                bluetoothGattClientImpl.a(30000L);
                if (!bluetoothGattClientImpl.f15470p) {
                    connect = false;
                }
            }
            bluetoothGattClientImpl.f15470p = bluetoothGattClientImpl.isConnected();
            ZLogger.v(bluetoothGattClientImpl.DBG, "connectionEstablished=" + bluetoothGattClientImpl.f15470p);
        } else {
            ZLogger.w("establish connection failed");
        }
        bluetoothGattClientImpl.f15465l = 0;
        return connect;
    }

    public static void f(BluetoothGattClientImpl bluetoothGattClientImpl) {
        bluetoothGattClientImpl.f15469o = true;
        if (bluetoothGattClientImpl.isConnected()) {
            bluetoothGattClientImpl.disconnect();
            ZLogger.v(bluetoothGattClientImpl.TVDBG, "disconnectAndCheckState.wait connection disconnect");
            bluetoothGattClientImpl.a(10000L);
        }
    }

    public static int g(BluetoothGattClientImpl bluetoothGattClientImpl) {
        int i8;
        if (bluetoothGattClientImpl.mBluetoothGatt == null) {
            ZLogger.v(bluetoothGattClientImpl.DBG, "device disconnected");
            return 9;
        }
        ZLogger.v(bluetoothGattClientImpl.DBG, "discoverServices ...");
        bluetoothGattClientImpl.f15465l = 2;
        if (bluetoothGattClientImpl.mBluetoothGatt.discoverServices()) {
            if (!bluetoothGattClientImpl.f15466m) {
                bluetoothGattClientImpl.a(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                if (!bluetoothGattClientImpl.f15466m) {
                    ZLogger.w("discover Services timeout");
                    i8 = 4;
                }
            }
            i8 = 0;
        } else {
            ZLogger.w("discoverServices failed");
            i8 = 3;
        }
        bluetoothGattClientImpl.f15465l = 0;
        return i8;
    }

    public static void h(BluetoothGattClientImpl bluetoothGattClientImpl) {
        String str;
        BluetoothGatt bluetoothGatt = bluetoothGattClientImpl.mBluetoothGatt;
        if (bluetoothGatt == null) {
            ZLogger.v(bluetoothGattClientImpl.DBG, "device disconnected");
            return;
        }
        bluetoothGattClientImpl.f15471q = false;
        bluetoothGattClientImpl.f15465l = 3;
        if (bluetoothGatt.requestMtu(256)) {
            if (!bluetoothGattClientImpl.f15471q) {
                bluetoothGattClientImpl.a(10000L);
                str = bluetoothGattClientImpl.f15471q ? "requestMtu failed" : "requestMtu timeout";
            }
            bluetoothGattClientImpl.f15465l = 0;
        }
        ZLogger.w(str);
        bluetoothGattClientImpl.f15465l = 0;
    }

    public static void i(BluetoothGattClientImpl bluetoothGattClientImpl) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bluetoothGattClientImpl.mBluetoothGatt == null) {
            ZLogger.v(bluetoothGattClientImpl.DBG, "device disconnected");
            return;
        }
        bluetoothGattClientImpl.f15465l = 5;
        ZLogger.v(bluetoothGattClientImpl.DBG, "readPhy...");
        bluetoothGattClientImpl.mBluetoothGatt.readPhy();
        if (bluetoothGattClientImpl.f15465l == 5) {
            bluetoothGattClientImpl.a(10000L);
        }
    }

    public void closeGatt() {
        if (isConnected()) {
            disconnect();
        }
        this.mGlobalGatt.close(this.mDeviceAddress);
    }

    public boolean connect(GattConnParams gattConnParams) {
        String str;
        if (gattConnParams == null) {
            str = "connectParams can not be null";
        } else {
            if (gattConnParams.getAddress() != null) {
                if (this.f15452d) {
                    ZLogger.v(this.VDBG, "connection procedure already started");
                    return true;
                }
                if (this.DBG) {
                    ZLogger.d(gattConnParams.toString());
                }
                this.mGattConnParams = gattConnParams;
                this.mDeviceAddress = gattConnParams.getAddress();
                this.f15468n.execute(this.f15472r);
                return true;
            }
            str = "address is null";
        }
        ZLogger.w(str);
        return false;
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattClient, com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public void destroy() {
        super.destroy();
        this.f15469o = true;
        closeGatt();
        ThreadPoolExecutor threadPoolExecutor = this.f15468n;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattClient, com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public void disconnect() {
        super.disconnect();
        this.mGlobalGatt.disconnect(this.mDeviceAddress);
        this.f15468n.remove(this.f15472r);
    }

    public boolean enableCccd() {
        try {
            Thread.sleep(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        } catch (InterruptedException unused) {
        }
        ZLogger.v(this.DBG, "enable notification");
        return true;
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public void processBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
        if (b(bluetoothDevice.getAddress())) {
            ZLogger.v(this.TVDBG, "bonded device(" + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ") not match with current device(" + BluetoothHelper.formatAddress(this.mDeviceAddress, true) + ")");
            return;
        }
        this.mBondState = i8;
        if (i8 == 10) {
            if (this.f15451c == 5) {
                notifyConnLock();
            }
        } else if (i8 == 12 && this.f15451c == 5) {
            notifyConnLock();
        }
    }

    public void processCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
    }

    public void processCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr, int i8) {
    }

    public void processCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
    }

    public boolean processConnectionTask() {
        return true;
    }

    public void processDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
        notifyCccdEnabled(i8 == 0);
    }

    public boolean processServices(BluetoothGatt bluetoothGatt) {
        return true;
    }

    public boolean writeCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bluetoothGattCharacteristic == null) {
            if (this.DBG) {
                ZLogger.w("mTXCharacteristic == null.");
            }
            return false;
        }
        if (isConnected()) {
            this.mGlobalGatt.writeCharacteristic(this.mDeviceAddress, bluetoothGattCharacteristic, bArr);
            return true;
        }
        if (this.DBG) {
            ZLogger.w("disconnect.");
        }
        return false;
    }

    public static boolean b(BluetoothGattClientImpl bluetoothGattClientImpl, int i8) {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        if (bluetoothGattClientImpl.mBluetoothGatt == null) {
            ZLogger.v(bluetoothGattClientImpl.DBG, "device disconnected");
            return false;
        }
        bluetoothGattClientImpl.f15465l = 4;
        ZLogger.v(bluetoothGattClientImpl.DBG, "setPreferredPhy:" + i8);
        if (i8 == 0) {
            bluetoothGattClientImpl.mBluetoothGatt.setPreferredPhy(1, 1, 0);
        } else if (i8 == 2) {
            bluetoothGattClientImpl.mBluetoothGatt.setPreferredPhy(4, 4, 1);
        } else if (i8 != 3) {
            bluetoothGattClientImpl.mBluetoothGatt.setPreferredPhy(2, 2, 0);
        } else {
            bluetoothGattClientImpl.mBluetoothGatt.setPreferredPhy(4, 4, 2);
        }
        if (bluetoothGattClientImpl.f15465l == 4) {
            bluetoothGattClientImpl.a(10000L);
        }
        return true;
    }
}
