package com.realsil.sdk.dfu.u;

import android.content.Context;
import com.realsil.sdk.bbpro.core.peripheral.BluetoothSppPeripheral;
import com.realsil.sdk.bbpro.core.peripheral.Peripheral;
import com.realsil.sdk.bbpro.core.peripheral.PeripheralCallback;
import com.realsil.sdk.bbpro.core.peripheral.PeripheralManager;
import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.Command;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f16322l = true;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f16323m = false;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f16324n = false;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f16325o = false;

    /* renamed from: a, reason: collision with root package name */
    public int f16326a;

    /* renamed from: b, reason: collision with root package name */
    public ConnectParams f16327b;

    /* renamed from: c, reason: collision with root package name */
    public int f16328c;

    /* renamed from: d, reason: collision with root package name */
    public BluetoothSppPeripheral f16329d;

    /* renamed from: e, reason: collision with root package name */
    public OtaDeviceInfo f16330e;

    /* renamed from: g, reason: collision with root package name */
    public c f16332g;

    /* renamed from: h, reason: collision with root package name */
    public Context f16333h;

    /* renamed from: i, reason: collision with root package name */
    public b f16334i;

    /* renamed from: f, reason: collision with root package name */
    public List f16331f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final PeripheralCallback f16335j = new C0332a();

    /* renamed from: k, reason: collision with root package name */
    public Object f16336k = new Object();

    /* renamed from: com.realsil.sdk.dfu.u.a$a, reason: collision with other inner class name */
    public class C0332a extends PeripheralCallback {
        public C0332a() {
        }

        public void onAckReceive(Peripheral peripheral, AckPacket ackPacket) {
            super.onAckReceive(peripheral, ackPacket);
            a.this.a(ackPacket);
        }

        public void onDataReceive(Peripheral peripheral, TransportLayerPacket transportLayerPacket) {
            super.onDataReceive(peripheral, transportLayerPacket);
            try {
                a.this.a(transportLayerPacket);
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
            setName(String.format(Locale.US, "AdapterXS%04X-DeviceInfoThread", Integer.valueOf(a.this.f16326a)));
            ZLogger.v(getName());
            a.this.b(257);
            if (!a.this.d()) {
                ZLogger.v("already in idle state");
            } else if (a.this.f()) {
                if (a.f16324n) {
                    ZLogger.d(a.this.b().toString());
                }
                a.this.b(1);
            }
        }

        public /* synthetic */ b(a aVar, C0332a c0332a) {
            this();
        }
    }

    public interface c {
        void onStateChanged(int i8);
    }

    public OtaModeInfo a(int i8) {
        List list = this.f16331f;
        if (list == null || list.size() <= 0) {
            return new OtaModeInfo(i8);
        }
        for (OtaModeInfo otaModeInfo : this.f16331f) {
            if (otaModeInfo != null && otaModeInfo.getWorkmode() == i8) {
                return otaModeInfo;
            }
        }
        return (OtaModeInfo) this.f16331f.get(0);
    }

    public OtaDeviceInfo b() {
        if (this.f16330e == null) {
            this.f16330e = new OtaDeviceInfo(this.f16326a, 2);
        }
        return this.f16330e;
    }

    public List c() {
        return this.f16331f;
    }

    public boolean d() {
        return (this.f16328c & 256) == 256;
    }

    public void e() {
        this.f16331f = new ArrayList();
        b bVar = new b(this, null);
        this.f16334i = bVar;
        bVar.start();
    }

    public boolean f() {
        return true;
    }

    public void g() {
        synchronized (this.f16336k) {
            try {
                if (f16325o) {
                    ZLogger.v("triggleSyncLock");
                }
                this.f16336k.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        synchronized (this.f16336k) {
            try {
                try {
                    if (f16325o) {
                        ZLogger.v("waitSyncLock");
                    }
                    this.f16336k.wait(5000L);
                } catch (InterruptedException e8) {
                    ZLogger.v("wait sync data interrupted: " + e8.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        this.f16328c = 0;
        BluetoothSppPeripheral bluetoothSppPeripheral = this.f16329d;
        if (bluetoothSppPeripheral != null) {
            bluetoothSppPeripheral.unregisterPeripheralCallback(this.f16335j);
        }
        b bVar = this.f16334i;
        if (bVar != null) {
            bVar.interrupt();
            this.f16334i = null;
        }
    }

    public void b(int i8) {
        ZLogger.d(String.format("syncState 0x%04X >> 0x%04X", Integer.valueOf(this.f16328c), Integer.valueOf(i8)));
        this.f16328c = i8;
        c cVar = this.f16332g;
        if (cVar != null) {
            cVar.onStateChanged(i8);
        } else {
            ZLogger.v(f16324n, "no callback registered");
        }
    }

    public void a(Context context, ConnectParams connectParams, c cVar) {
        boolean z7 = RtkDfu.DEBUG_ENABLE;
        f16322l = z7;
        f16323m = z7;
        f16324n = RtkDfu.VDBG;
        f16325o = RtkDfu.TDBG;
        this.f16333h = context;
        this.f16327b = connectParams;
        this.f16332g = cVar;
        ZLogger.v(String.format("protocolType=0x%04X", Integer.valueOf(this.f16326a)));
        this.f16330e = new OtaDeviceInfo(this.f16326a, 2);
        this.f16331f = new ArrayList();
        this.f16329d = PeripheralManager.getInstance().registerPeripheral(this.f16333h, 1, connectParams.getAddress(), this.f16335j);
    }

    public void a(AckPacket ackPacket) {
    }

    public void a(TransportLayerPacket transportLayerPacket) {
        if (f16325o) {
            ZLogger.d(String.format(Locale.US, "[0x%04X >>] (S%04X)%s", Integer.valueOf(transportLayerPacket.getOpcode()), Integer.valueOf(this.f16326a), DataConverter.bytes2Hex(transportLayerPacket.getParameters())));
        }
    }

    public boolean a(int i8, byte[] bArr) {
        Command build = new Command.Builder().writeType(2).packet(i8, bArr).build();
        BluetoothSppPeripheral bluetoothSppPeripheral = this.f16329d;
        return bluetoothSppPeripheral != null && bluetoothSppPeripheral.sendVendorCommand(build).code == 0;
    }

    public boolean a(Command command) {
        BluetoothSppPeripheral bluetoothSppPeripheral = this.f16329d;
        return bluetoothSppPeripheral != null && bluetoothSppPeripheral.sendVendorCommand(command).code == 0;
    }

    public boolean a(OtaDeviceInfo otaDeviceInfo, DfuQcConfig dfuQcConfig) {
        return false;
    }

    public boolean a(byte[] bArr) {
        Command build = new Command.Builder().writeType(2).payload(bArr).build();
        BluetoothSppPeripheral bluetoothSppPeripheral = this.f16329d;
        return bluetoothSppPeripheral != null && bluetoothSppPeripheral.sendVendorCommand(build).code == 0;
    }
}
