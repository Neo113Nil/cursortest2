package com.realsil.sdk.dfu.m;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.realsil.sdk.core.bluetooth.GlobalGatt;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class a implements o {
    public List A;
    public String B;
    public c C;
    public ConnectParams D;
    public int E;
    public b F;
    public boolean G = false;
    public final BluetoothGattCallbackCompat H;
    public final Object I;
    public boolean J;
    public int K;
    public boolean L;
    public Object M;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16009h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16010i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16011j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16012k;

    /* renamed from: l, reason: collision with root package name */
    public int f16013l;

    /* renamed from: m, reason: collision with root package name */
    public GlobalGatt f16014m;

    /* renamed from: n, reason: collision with root package name */
    public BluetoothGatt f16015n;

    /* renamed from: o, reason: collision with root package name */
    public BluetoothGattCharacteristic f16016o;

    /* renamed from: p, reason: collision with root package name */
    public BluetoothGattCharacteristic f16017p;

    /* renamed from: q, reason: collision with root package name */
    public BluetoothGattService f16018q;

    /* renamed from: r, reason: collision with root package name */
    public BluetoothGattCharacteristic f16019r;

    /* renamed from: s, reason: collision with root package name */
    public BluetoothGattCharacteristic f16020s;

    /* renamed from: t, reason: collision with root package name */
    public BluetoothGattCharacteristic f16021t;

    /* renamed from: u, reason: collision with root package name */
    public List f16022u;

    /* renamed from: v, reason: collision with root package name */
    public List f16023v;

    /* renamed from: w, reason: collision with root package name */
    public BluetoothGattService f16024w;

    /* renamed from: x, reason: collision with root package name */
    public BluetoothGattCharacteristic f16025x;

    /* renamed from: y, reason: collision with root package name */
    public List f16026y;

    /* renamed from: z, reason: collision with root package name */
    public OtaDeviceInfo f16027z;

    /* renamed from: com.realsil.sdk.dfu.m.a$a, reason: collision with other inner class name */
    public class C0328a extends BluetoothGattCallbackCompat {
        public C0328a() {
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            a.this.a(bluetoothGatt, bluetoothGattCharacteristic, bArr);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
            a.this.a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
            if (i8 == 0 && i9 == 0 && a.this.d()) {
                a.this.b(2);
                a.this.i();
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
            try {
                ZLogger.v(a.this.f16011j, "onDescriptorWrite: " + i8);
                synchronized (a.this.I) {
                    a.this.J = true;
                    a.this.I.notifyAll();
                }
            } catch (Exception e8) {
                ZLogger.w(e8.toString());
            }
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            setName("AdapterXGBase-DeviceInfoThread");
            a.this.g();
        }

        public /* synthetic */ b(a aVar, C0328a c0328a) {
            this();
        }
    }

    public interface c {
        void a(int i8);
    }

    public a(int i8, ConnectParams connectParams, String str, BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, c cVar) {
        this.f16009h = true;
        this.f16010i = true;
        this.f16011j = false;
        this.f16012k = false;
        this.A = new ArrayList();
        this.E = 1;
        C0328a c0328a = new C0328a();
        this.H = c0328a;
        this.I = new Object();
        this.J = true;
        this.K = 0;
        this.L = false;
        this.M = new Object();
        boolean z7 = RtkDfu.DEBUG_ENABLE;
        this.f16010i = z7;
        this.f16009h = z7;
        this.f16011j = RtkDfu.VDBG;
        this.f16012k = RtkDfu.TDBG;
        this.f16013l = i8;
        this.D = connectParams;
        this.B = str;
        GlobalGatt globalGatt = GlobalGatt.getInstance();
        this.f16014m = globalGatt;
        this.f16015n = globalGatt.getBluetoothGatt(str);
        this.f16018q = bluetoothGattService;
        this.f16024w = bluetoothGattService2;
        this.C = cVar;
        this.A = new ArrayList();
        this.f16026y = new ArrayList();
        this.f16022u = new ArrayList();
        this.f16023v = new ArrayList();
        ConnectParams connectParams2 = this.D;
        if (connectParams2 != null) {
            this.E = connectParams2.getBatteryValueFormat();
        } else {
            this.E = 1;
        }
        BluetoothGatt bluetoothGatt2 = this.f16015n;
        if (bluetoothGatt2 != null) {
            a(bluetoothGatt2);
            b(this.f16015n);
        }
        f();
        GlobalGatt.getInstance().registerCallback(this.B, c0328a);
    }

    public OtaModeInfo a(int i8) {
        List list = this.A;
        if (list == null || list.size() <= 0) {
            return new OtaModeInfo(i8);
        }
        for (OtaModeInfo otaModeInfo : this.A) {
            if (otaModeInfo != null && otaModeInfo.getWorkmode() == i8) {
                return otaModeInfo;
            }
        }
        return (OtaModeInfo) this.A.get(0);
    }

    public OtaDeviceInfo b() {
        if (this.f16027z == null) {
            this.f16027z = new OtaDeviceInfo(this.f16013l, 2);
        }
        return this.f16027z;
    }

    public List c() {
        return this.A;
    }

    public boolean d() {
        return (this.K & 256) == 256;
    }

    public void e() {
        if (this.f16024w == null) {
            this.f16025x = null;
            ZLogger.v(this.f16011j, "not find DFU_SERVICE_UUID = " + com.realsil.sdk.dfu.r.g.f16273a);
            return;
        }
        ZLogger.v(this.f16011j, "find DFU_SERVICE_UUID = " + this.f16024w.getUuid());
        BluetoothGattService bluetoothGattService = this.f16024w;
        UUID uuid = com.realsil.sdk.dfu.r.g.f16275c;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.f16025x = characteristic;
        if (characteristic == null) {
            ZLogger.v(this.f16011j, "not found DFU_CONTROL_POINT_CHARACTERISTIC: " + uuid);
            return;
        }
        if (this.f16011j) {
            ZLogger.v("find DFU_CONTROL_POINT_CHARACTERISTIC: " + uuid);
        }
        this.f16025x.setWriteType(2);
    }

    public boolean f() {
        BluetoothGattService bluetoothGattService = this.f16018q;
        if (bluetoothGattService == null) {
            ZLogger.w(this.f16010i, "mOtaService is null");
            return false;
        }
        UUID uuid = com.realsil.sdk.dfu.q.g.f16265a;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.f16019r = characteristic;
        if (characteristic != null) {
            ZLogger.v(this.f16012k, "find OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC = " + uuid);
        } else if (this.f16010i) {
            ZLogger.d("OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC not found");
        }
        BluetoothGattService bluetoothGattService2 = this.f16018q;
        UUID uuid2 = com.realsil.sdk.dfu.n.h.f16233b;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.f16021t = characteristic2;
        if (characteristic2 == null) {
            ZLogger.d(this.f16010i, "OTA_DEVICE_MAC_CHARACTERISTIC_UUID not found");
        } else if (this.f16012k) {
            ZLogger.v("find OTA_DEVICE_MAC_CHARACTERISTIC_UUID = " + uuid2);
        }
        BluetoothGattService bluetoothGattService3 = this.f16018q;
        UUID uuid3 = com.realsil.sdk.dfu.n.h.f16238g;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.f16020s = characteristic3;
        if (characteristic3 == null) {
            if (!this.f16010i) {
                return true;
            }
            ZLogger.d("OTA_DEVICE_INFO_CHARACTERISTIC_UUID not found");
            return true;
        }
        if (!this.f16012k) {
            return true;
        }
        ZLogger.v("find OTA_DEVICE_INFO_CHARACTERISTIC_UUID = " + uuid3);
        return true;
    }

    public void g() {
    }

    public void h() {
        ZLogger.v(this.f16010i, "sync data ...");
        b bVar = new b(this, null);
        this.F = bVar;
        bVar.start();
    }

    public void i() {
        synchronized (this.M) {
            try {
                if (this.f16012k) {
                    ZLogger.v("trigger SyncLock");
                }
                this.L = true;
                this.M.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        synchronized (this.M) {
            try {
                try {
                    if (!this.L) {
                        if (this.f16012k) {
                            ZLogger.v("waitSyncLock");
                        }
                        this.M.wait(6000L);
                    }
                } catch (InterruptedException e8) {
                    ZLogger.d(this.f16010i, "wait sync data interrupted: " + e8.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(int i8) {
        ZLogger.d(String.format("syncState: 0x%04X >> 0x%04X", Integer.valueOf(this.K), Integer.valueOf(i8)));
        this.K = i8;
        c cVar = this.C;
        if (cVar != null) {
            cVar.a(i8);
        } else {
            ZLogger.v(this.f16011j, "no callback registered");
        }
    }

    public void a() {
        b bVar = this.F;
        if (bVar != null) {
            bVar.interrupt();
            this.F = null;
        }
        this.K = 0;
        GlobalGatt.getInstance().unRegisterCallback(this.B, this.H);
    }

    public final void b(BluetoothGatt bluetoothGatt) {
        UUID uuid = g.f16050a;
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        if (service == null) {
            ZLogger.v(this.f16010i, "DEVICE_INFORMATION_SERVICE not found");
            return;
        }
        ZLogger.d(this.f16012k, "find DEVICE_INFORMATION_SERVICE: " + uuid.toString());
        UUID uuid2 = g.f16054e;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.f16017p = characteristic;
        if (characteristic == null) {
            ZLogger.d(this.f16011j, "DIS_PNP_ID_CHARACTERISTIC not found");
            return;
        }
        ZLogger.d(this.f16012k, "find DIS_PNP_ID_CHARACTERISTIC: " + uuid2.toString());
    }

    public final void a(BluetoothGatt bluetoothGatt) {
        UUID uuid = com.realsil.sdk.dfu.m.b.f16030a;
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        if (service == null) {
            ZLogger.v(this.f16011j, "BATTERY_SERVICE not found");
            return;
        }
        if (this.f16012k) {
            ZLogger.v("find BATTERY_SERVICE: " + uuid.toString());
        }
        UUID uuid2 = com.realsil.sdk.dfu.m.b.f16031b;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.f16016o = characteristic;
        if (characteristic == null) {
            ZLogger.v(this.f16011j, "BAS_READ_CHARACTERITIC not found");
        } else if (this.f16012k) {
            ZLogger.v("find BAS_READ_CHARACTERITIC: " + uuid2.toString());
        }
    }

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
    }

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (r4.length > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r4.length > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r4 = r0.get();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(byte[] bArr) {
        short s7;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        if (this.E != 1) {
            if (bArr.length >= 2) {
                s7 = wrap.getShort();
            }
        }
        ZLogger.v(this.f16010i, "current battery: " + ((int) s7));
        b().setBatteryLevel(s7);
    }

    public boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z7) {
        StringBuilder sb;
        String str;
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) == 0) {
            ZLogger.w("check properties failed: " + properties);
            this.J = false;
            return false;
        }
        if (this.f16009h) {
            sb = new StringBuilder();
            sb.append("setCharacteristicNotification() - uuid: ");
            sb.append(bluetoothGattCharacteristic.getUuid());
            str = " enabled: ";
        } else {
            sb = new StringBuilder();
            str = "setCharacteristicNotification()  enabled: ";
        }
        sb.append(str);
        sb.append(z7);
        ZLogger.v(sb.toString());
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z7);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(o.f16092a);
        if (descriptor == null) {
            return false;
        }
        boolean z8 = descriptor.getValue() != null && descriptor.getValue().length == 2 && descriptor.getValue()[0] > 0 && descriptor.getValue()[1] == 0;
        ZLogger.v(this.f16011j, "current cccd state: " + z8);
        if (z7 && z8) {
            this.J = true;
            ZLogger.w("cccd already enabled");
            return true;
        }
        if (!z7 && !z8) {
            ZLogger.w("cccd already disable");
            this.J = true;
            return true;
        }
        if (!(z7 ? BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) : BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE))) {
            return false;
        }
        synchronized (this.I) {
            ZLogger.v(this.f16012k, "wait write Characteristic Notification 15000ms");
            try {
                this.J = false;
                this.I.wait(30000L);
            } catch (InterruptedException unused) {
            }
        }
        return this.J;
    }

    public boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return a(bluetoothGattCharacteristic, false);
    }

    public boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z7) {
        String str;
        if (this.f16015n == null) {
            str = "mBluetoothGatt is null maybe disconnected just now";
        } else {
            if (bluetoothGattCharacteristic != null) {
                if (this.f16009h) {
                    ZLogger.v(String.format(Locale.US, "readCharacteristic:(%d) %s", Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
                }
                this.L = false;
                if (this.f16014m.readCharacteristicSync(this.B, bluetoothGattCharacteristic)) {
                    j();
                    if (this.K != 2) {
                        return true;
                    }
                }
                return false;
            }
            str = "characteristic can not be null";
        }
        ZLogger.w(str);
        return false;
    }
}
