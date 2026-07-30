package e4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import com.crrepa.ble.scan.bean.CRPScanDevice;
import com.crrepa.ble.scan.callback.CRPScanCallback;
import com.crrepa.i0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f16646h = 10000;

    /* renamed from: a, reason: collision with root package name */
    private BluetoothAdapter f16647a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothLeScanner f16648b;

    /* renamed from: c, reason: collision with root package name */
    private CRPScanCallback f16649c;

    /* renamed from: d, reason: collision with root package name */
    private List<CRPScanDevice> f16650d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f16651e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private b f16652f;

    /* renamed from: g, reason: collision with root package name */
    private com.crrepa.i0.a f16653g;

    public a(BluetoothAdapter bluetoothAdapter) {
        this.f16647a = bluetoothAdapter;
    }

    public void a() {
        b bVar = this.f16652f;
        if (bVar != null) {
            bVar.d();
        }
        com.crrepa.i0.a aVar = this.f16653g;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void b() {
        this.f16649c.onScanComplete(this.f16650d);
    }

    public void c() {
        this.f16649c.onScanComplete(this.f16650d);
    }

    public void a(CRPScanDevice cRPScanDevice) {
        if (cRPScanDevice == null) {
            return;
        }
        synchronized (this) {
            try {
                this.f16651e.set(false);
                Iterator<CRPScanDevice> it = this.f16650d.iterator();
                while (it.hasNext()) {
                    if (it.next().getDevice().equals(cRPScanDevice.getDevice())) {
                        this.f16651e.set(true);
                    }
                }
                if (!this.f16651e.get()) {
                    this.f16650d.add(cRPScanDevice);
                    this.f16649c.onScanning(cRPScanDevice);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(long j8) {
        b bVar = new b(j8);
        this.f16652f = bVar;
        bVar.a(this).e();
        boolean startLeScan = this.f16647a.startLeScan(this.f16652f);
        if (!startLeScan) {
            this.f16652f.a();
        }
        return startLeScan;
    }

    public void a(com.crrepa.i0.a aVar) {
        if (this.f16648b == null) {
            return;
        }
        aVar.a();
        if (this.f16647a.isEnabled()) {
            this.f16648b.flushPendingScanResults(this.f16653g);
            this.f16648b.stopScan(aVar);
        }
    }

    public void a(b bVar) {
        bVar.a();
        this.f16647a.stopLeScan(bVar);
    }

    public boolean a(long j8) {
        if (this.f16653g == null) {
            this.f16653g = new com.crrepa.i0.a(j8);
        }
        this.f16653g.a(this).e();
        BluetoothLeScanner bluetoothLeScanner = this.f16647a.getBluetoothLeScanner();
        this.f16648b = bluetoothLeScanner;
        if (bluetoothLeScanner == null) {
            return false;
        }
        this.f16648b.startScan((List<ScanFilter>) null, new ScanSettings.Builder().setScanMode(2).build(), this.f16653g);
        return true;
    }

    public boolean a(CRPScanCallback cRPScanCallback, long j8) {
        this.f16649c = cRPScanCallback;
        boolean b8 = b(j8);
        this.f16650d.clear();
        return b8;
    }
}
