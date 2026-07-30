package com.realsil.sdk.dfu.utils;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.usb.GlobalUsbGatt;
import com.realsil.sdk.core.usb.UsbGatt;
import com.realsil.sdk.core.usb.UsbGattCallback;
import com.realsil.sdk.core.usb.UsbGattCharacteristic;
import com.realsil.sdk.dfu.exception.ConnectionException;
import com.realsil.sdk.dfu.m.o;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.y.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public class UsbGattDfuAdapter extends com.realsil.sdk.dfu.y.e implements o {
    public static volatile UsbGattDfuAdapter L;
    public GlobalUsbGatt B;
    public UsbGatt C;
    public UsbGattCharacteristic D;
    public com.realsil.sdk.dfu.y.b E;
    public final b.InterfaceC0338b F = new a();
    public Runnable G = new b();
    public Runnable H = new c();
    public Runnable I = new d();
    public Handler J = new Handler(Looper.getMainLooper());
    public UsbGattCallback K = new e();

    public class a implements b.InterfaceC0338b {
        public a() {
        }

        @Override // com.realsil.sdk.dfu.y.b.InterfaceC0338b
        public void a(int i8) {
            if (i8 == 1) {
                if (UsbGattDfuAdapter.this.isPreparing()) {
                    UsbGattDfuAdapter.this.notifyStateChanged(527);
                } else {
                    ZLogger.d(String.format("ignore, is not in preparing state: 0x%04X", Integer.valueOf(UsbGattDfuAdapter.this.f16389p)));
                }
            }
            if (i8 == 2) {
                if (UsbGattDfuAdapter.this.isPreparing()) {
                    UsbGattDfuAdapter.this.a(new ConnectionException(5));
                } else {
                    ZLogger.d(String.format("ignore, is not in preparing state: 0x%04X", Integer.valueOf(UsbGattDfuAdapter.this.f16389p)));
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UsbGattDfuAdapter.this.a(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
            try {
                Thread.sleep(800L);
            } catch (InterruptedException e8) {
                ZLogger.v(UsbGattDfuAdapter.this.f16382i, e8.toString());
            }
            if (UsbGattDfuAdapter.this.c()) {
                ZLogger.v("wait discover service ...");
                UsbGattDfuAdapter.this.a(30000L);
                if (UsbGattDfuAdapter.this.f16389p == 537) {
                    ZLogger.w("discoverServices timeout");
                    UsbGattDfuAdapter.this.disconnect();
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UsbGattDfuAdapter.this.c()) {
                ZLogger.d("wait discover service commplete");
                synchronized (UsbGattDfuAdapter.this.f16387n) {
                    try {
                        UsbGattDfuAdapter.this.f16387n.wait(30000L);
                    } catch (InterruptedException e8) {
                        ZLogger.v(UsbGattDfuAdapter.this.f16382i, e8.toString());
                    }
                }
                if (UsbGattDfuAdapter.this.f16389p == 537) {
                    ZLogger.w("discoverServices timeout");
                    UsbGattDfuAdapter.this.disconnect();
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UsbGattDfuAdapter.this.f16389p == 536) {
                new Thread(UsbGattDfuAdapter.this.H).start();
                return;
            }
            ZLogger.d("ignore state:" + UsbGattDfuAdapter.this.f16389p);
        }
    }

    public class e extends UsbGattCallback {
        public e() {
        }

        public final void a() {
            if (!UsbGattDfuAdapter.this.isPreparing()) {
                UsbGattDfuAdapter.this.notifyStateChanged(4097);
            } else {
                UsbGattDfuAdapter.this.notifyLock();
                UsbGattDfuAdapter.this.a(new ConnectionException(0));
            }
        }

        public void onCharacteristicRead(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, int i8) {
            super.onCharacteristicRead(usbGatt, usbGattCharacteristic, i8);
            UUID uuid = usbGattCharacteristic.getUuid();
            usbGattCharacteristic.getValue();
            if (i8 == 0) {
                byte[] value = usbGattCharacteristic.getValue();
                if (o.f16095d.equals(uuid)) {
                    ByteBuffer wrap = ByteBuffer.wrap(value);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    ZLogger.d(String.format("protocolType=0x%04X", Integer.valueOf(wrap.getShort(0) & u.MAX_VALUE)));
                    UsbGattDfuAdapter.this.E = new com.realsil.sdk.dfu.y.a(0);
                    UsbGattDfuAdapter.this.E.a(UsbGattDfuAdapter.this.A, UsbGattDfuAdapter.this.C, UsbGattDfuAdapter.this.F);
                    UsbGattDfuAdapter.this.E.e();
                    return;
                }
                return;
            }
            ZLogger.w(UsbGattDfuAdapter.this.f16381h, "Characteristic read error: " + i8);
            if (!o.f16095d.equals(uuid)) {
                ZLogger.d("ignore exception when read other info");
            } else if (UsbGattDfuAdapter.this.isPreparing()) {
                UsbGattDfuAdapter.this.a(new ConnectionException(5));
            }
        }

        public void onConnectionStateChange(UsbGatt usbGatt, int i8, int i9) {
            if (i8 != 0) {
                a();
                return;
            }
            if (i9 != 2) {
                if (i9 == 0) {
                    UsbGattDfuAdapter.this.disconnect();
                    a();
                    return;
                }
                return;
            }
            UsbGattDfuAdapter usbGattDfuAdapter = UsbGattDfuAdapter.this;
            usbGattDfuAdapter.C = usbGattDfuAdapter.B.getUsbGatt(UsbGattDfuAdapter.this.A);
            if (usbGatt != null) {
                UsbGattDfuAdapter.this.d();
            } else {
                a();
            }
        }

        public void onServicesDiscovered(UsbGatt usbGatt, int i8) {
            UsbGattDfuAdapter usbGattDfuAdapter = UsbGattDfuAdapter.this;
            int i9 = usbGattDfuAdapter.f16389p;
            if (i9 == 1025) {
                ZLogger.d("ignore, when it is ota processing");
                return;
            }
            if (i8 == 0) {
                usbGattDfuAdapter.notifyStateChanged(539);
                if (i9 == 537) {
                    UsbGattDfuAdapter.this.notifyLock();
                }
                UsbGattDfuAdapter.this.e();
                return;
            }
            ZLogger.w("service discovery failed !!!");
            if (UsbGattDfuAdapter.this.isPreparing()) {
                UsbGattDfuAdapter.this.a(new ConnectionException(1));
            }
        }
    }

    public UsbGattDfuAdapter(Context context) {
        this.mContext = context;
        a();
    }

    public static UsbGattDfuAdapter getInstance(Context context) {
        if (L == null) {
            synchronized (UsbGattDfuAdapter.class) {
                try {
                    if (L == null) {
                        L = new UsbGattDfuAdapter(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return L;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean connectDevice(ConnectParams connectParams) {
        if (!super.connectDevice(connectParams)) {
            return false;
        }
        if (this.f16384k.getAddress() == null) {
            ZLogger.w("address is null");
            return false;
        }
        String str = this.A;
        if (str != null && !str.equals(this.f16384k.getAddress())) {
            this.B.unRegisterCallback(this.A, this.K);
            this.B.close(this.A);
        }
        this.f16469z = getRemoteDevice(this.f16384k.getAddress());
        this.A = this.f16384k.getAddress();
        this.f16385l = this.f16384k.getReconnectTimes();
        boolean a8 = a(this.f16469z);
        if (!a8) {
            notifyStateChanged(4098);
        }
        return a8;
    }

    @Override // com.realsil.sdk.dfu.y.e, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        GlobalUsbGatt globalUsbGatt = this.B;
        if (globalUsbGatt != null) {
            globalUsbGatt.unRegisterCallback(this.A, this.K);
        }
        com.realsil.sdk.dfu.y.b bVar = this.E;
        if (bVar != null) {
            bVar.a();
        }
        L = null;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void disconnect() {
        String str;
        super.disconnect();
        String str2 = this.A;
        if (str2 == null) {
            str = "no device registered";
        } else {
            GlobalUsbGatt globalUsbGatt = this.B;
            if (globalUsbGatt != null) {
                if (!globalUsbGatt.isConnected(str2)) {
                    ZLogger.v("already disconnected");
                } else {
                    if (this.B.isCallbackRegisted(this.A, this.K)) {
                        notifyStateChanged(4096);
                        this.B.close(this.A);
                        this.C = null;
                    }
                    ZLogger.v(this.f16381h, "no gatt callback registered");
                }
                notifyStateChanged(4097);
                this.C = null;
            }
            str = "mGlobalGatt == null";
        }
        ZLogger.d(str);
        notifyStateChanged(4097);
        this.C = null;
    }

    @Override // com.realsil.sdk.dfu.y.e
    public OtaDeviceInfo getOtaDeviceInfo() {
        com.realsil.sdk.dfu.y.b bVar = this.E;
        return bVar != null ? bVar.b() : super.getOtaDeviceInfo();
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public OtaModeInfo getPriorityWorkMode(int i8) {
        com.realsil.sdk.dfu.y.b bVar = this.E;
        return bVar != null ? bVar.a(i8) : super.getPriorityWorkMode(i8);
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public List<OtaModeInfo> getSupportedModes() {
        com.realsil.sdk.dfu.y.b bVar = this.E;
        return bVar != null ? bVar.c() : super.getSupportedModes();
    }

    @Override // com.realsil.sdk.dfu.y.e
    public boolean startOtaProcedure(DfuConfig dfuConfig, boolean z7) {
        if (!super.startOtaProcedure(dfuConfig, z7)) {
            return false;
        }
        notifyStateChanged(1025);
        GlobalUsbGatt globalUsbGatt = this.B;
        if (globalUsbGatt != null) {
            globalUsbGatt.unRegisterCallback(this.A, this.K);
        }
        com.realsil.sdk.dfu.y.b bVar = this.E;
        if (bVar != null) {
            bVar.a();
        }
        boolean startOtaTask = startOtaTask(dfuConfig);
        if (!startOtaTask) {
            notifyStateChanged(1026);
        }
        return startOtaTask;
    }

    public UsbGattDfuAdapter(Context context, DfuAdapter.DfuHelperCallback dfuHelperCallback) {
        this.mContext = context;
        this.f16386m = dfuHelperCallback;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        UsbGatt usbGatt = this.C;
        if (usbGatt == null) {
            notifyStateChanged(527);
            return;
        }
        List<UsbGattCharacteristic> characteristics = usbGatt.getCharacteristics();
        if (characteristics == null || characteristics.size() <= 0) {
            ZLogger.d("no characteristic found");
        } else {
            for (UsbGattCharacteristic usbGattCharacteristic : characteristics) {
                ZLogger.v(String.format(Locale.US, "instanceId=%d(0x%02X), uuid=%s", Integer.valueOf(usbGattCharacteristic.getInstanceId()), Integer.valueOf(usbGattCharacteristic.getInstanceId()), usbGattCharacteristic.getUuid().toString()));
            }
        }
        notifyStateChanged(540);
        UsbGatt usbGatt2 = this.C;
        UUID uuid = o.f16095d;
        UsbGattCharacteristic characteristic = usbGatt2.getCharacteristic(uuid);
        this.D = characteristic;
        if (characteristic == null) {
            ZLogger.d(this.f16382i, "CHARACTERISTIC_PROTOCOL_TYPE not found");
            com.realsil.sdk.dfu.y.a aVar = new com.realsil.sdk.dfu.y.a(0);
            this.E = aVar;
            aVar.a(this.A, this.C, this.F);
            this.E.e();
            return;
        }
        ZLogger.v(this.f16383j, "find CHARACTERISTIC_PROTOCOL_TYPE = " + uuid);
        a(this.D);
    }

    public static UsbGattDfuAdapter getInstance(Context context, DfuAdapter.DfuHelperCallback dfuHelperCallback) {
        if (L == null) {
            synchronized (UsbGattDfuAdapter.class) {
                try {
                    if (L == null) {
                        L = new UsbGattDfuAdapter(context.getApplicationContext(), dfuHelperCallback);
                    }
                } finally {
                }
            }
        }
        return L;
    }

    public final void d() {
        if (this.f16389p != 536) {
            notifyStateChanged(DfuAdapter.STATE_PENDDING_DISCOVERY_SERVICE);
            if (this.J == null) {
                ZLogger.v(this.f16382i, "mHandler == null");
                return;
            }
            ZLogger.d("delay to discover service for : 1600");
            this.J.removeCallbacks(this.I);
            boolean postDelayed = this.J.postDelayed(this.I, 1600L);
            ZLogger.v(this.f16381h, "postDelayed:" + postDelayed);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        if (this.f16389p == 537) {
            ZLogger.w("discoverServices already started");
            return false;
        }
        notifyStateChanged(DfuAdapter.STATE_DISCOVERY_SERVICE);
        if (this.C != null) {
            ZLogger.v("discoverServices...");
            if (this.C.discoverServices()) {
                return true;
            }
        } else {
            ZLogger.w("mBtGatt == null");
        }
        ZLogger.w("discoverServices failed");
        if (isPreparing()) {
            a(new ConnectionException(1));
        }
        return false;
    }

    @Override // com.realsil.sdk.dfu.y.e, com.realsil.sdk.dfu.utils.DfuAdapter
    public void a() {
        super.a();
        GlobalUsbGatt globalUsbGatt = GlobalUsbGatt.getInstance();
        this.B = globalUsbGatt;
        if (globalUsbGatt == null) {
            GlobalUsbGatt.initial(this.mContext);
            this.B = GlobalUsbGatt.getInstance();
        }
    }

    public final boolean a(UsbDevice usbDevice) {
        notifyStateChanged(DfuAdapter.STATE_PREPARE_CONNECTING);
        return this.B.connect(usbDevice, this.mContext, this.K);
    }

    private boolean a(UsbGattCharacteristic usbGattCharacteristic) {
        if (this.C == null || usbGattCharacteristic == null) {
            ZLogger.w("mBtGatt is null maybe disconnected just now");
            return false;
        }
        ZLogger.v(this.f16381h, "readCharacteristic:" + usbGattCharacteristic.getUuid());
        return this.C.readCharacteristic(usbGattCharacteristic);
    }
}
