package com.crrepa.q;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private BluetoothGattCharacteristic f13613a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothGattCharacteristic f13614b;

    /* renamed from: c, reason: collision with root package name */
    private BluetoothGattCharacteristic f13615c;

    /* renamed from: d, reason: collision with root package name */
    private BluetoothGattCharacteristic f13616d;

    /* renamed from: e, reason: collision with root package name */
    private BluetoothGattCharacteristic f13617e;

    /* renamed from: f, reason: collision with root package name */
    private BluetoothGattCharacteristic f13618f;

    /* renamed from: g, reason: collision with root package name */
    private BluetoothGattCharacteristic f13619g;

    /* renamed from: h, reason: collision with root package name */
    private BluetoothGattCharacteristic f13620h;

    /* renamed from: i, reason: collision with root package name */
    private BluetoothGattCharacteristic f13621i;

    /* renamed from: j, reason: collision with root package name */
    private BluetoothGattCharacteristic f13622j;

    /* renamed from: k, reason: collision with root package name */
    private BluetoothGattCharacteristic f13623k;

    /* renamed from: l, reason: collision with root package name */
    private BluetoothGattCharacteristic f13624l;

    /* renamed from: m, reason: collision with root package name */
    private BluetoothGattCharacteristic f13625m;

    /* renamed from: n, reason: collision with root package name */
    private BluetoothGattCharacteristic f13626n;

    /* renamed from: o, reason: collision with root package name */
    private BluetoothGattCharacteristic f13627o;

    public b(List<BluetoothGattService> list) {
        for (BluetoothGattService bluetoothGattService : list) {
            String lowerCase = bluetoothGattService.getUuid().toString().toLowerCase();
            BleLog.i("serviceUuid: " + lowerCase);
            List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
            if (lowerCase.contains("feea")) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                    String lowerCase2 = bluetoothGattCharacteristic.getUuid().toString().toLowerCase();
                    if (lowerCase2.contains(a4.a.f29e)) {
                        this.f13613a = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains(a4.a.f33f)) {
                        this.f13614b = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains(a4.a.f37g)) {
                        this.f13615c = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains(a4.a.f61m)) {
                        this.f13620h = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains(a4.a.f65n)) {
                        this.f13621i = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains(a4.a.f68o)) {
                        this.f13622j = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains(a4.a.f71p)) {
                        this.f13623k = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains(a4.a.f74q)) {
                        this.f13626n = bluetoothGattCharacteristic;
                    } else if (lowerCase2.contains("feea")) {
                        this.f13627o = bluetoothGattCharacteristic;
                    }
                }
            } else if (lowerCase.contains(a4.a.f17b)) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic2 : characteristics) {
                    String lowerCase3 = bluetoothGattCharacteristic2.getUuid().toString().toLowerCase();
                    if (lowerCase3.contains(a4.a.f45i)) {
                        this.f13617e = bluetoothGattCharacteristic2;
                    } else if (lowerCase3.contains(a4.a.f49j)) {
                        this.f13624l = bluetoothGattCharacteristic2;
                    } else if (lowerCase3.contains(a4.a.f53k)) {
                        this.f13618f = bluetoothGattCharacteristic2;
                    }
                }
            } else if (lowerCase.contains(a4.a.f21c)) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic3 : characteristics) {
                    if (bluetoothGattCharacteristic3.getUuid().toString().toLowerCase().contains(a4.a.f41h)) {
                        this.f13616d = bluetoothGattCharacteristic3;
                    }
                }
            } else if (lowerCase.contains(a4.a.f25d)) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic4 : characteristics) {
                    if (bluetoothGattCharacteristic4.getUuid().toString().contains(a4.a.f57l)) {
                        this.f13619g = bluetoothGattCharacteristic4;
                    }
                }
            } else if (lowerCase.contains(a4.a.f80s)) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic5 : characteristics) {
                    if (bluetoothGattCharacteristic5.getUuid().toString().contains(a4.a.f83t)) {
                        this.f13625m = bluetoothGattCharacteristic5;
                    }
                }
            }
        }
    }

    public BluetoothGattCharacteristic a() {
        return this.f13616d;
    }

    public BluetoothGattCharacteristic b() {
        return this.f13617e;
    }

    public BluetoothGattCharacteristic c() {
        return this.f13618f;
    }

    public BluetoothGattCharacteristic d() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f13622j;
        return bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic : this.f13623k;
    }

    public BluetoothGattCharacteristic e() {
        return this.f13619g;
    }

    public BluetoothGattCharacteristic f() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f13627o;
        return bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic : this.f13626n;
    }

    public BluetoothGattCharacteristic g() {
        return this.f13615c;
    }

    public List<BluetoothGattCharacteristic> h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f13615c);
        arrayList.add(this.f13619g);
        arrayList.add(this.f13622j);
        arrayList.add(this.f13623k);
        arrayList.add(this.f13613a);
        arrayList.add(this.f13625m);
        arrayList.add(this.f13626n);
        return arrayList;
    }

    public BluetoothGattCharacteristic i() {
        return this.f13624l;
    }

    public BluetoothGattCharacteristic j() {
        return this.f13613a;
    }

    public BluetoothGattCharacteristic k() {
        return this.f13621i;
    }

    public BluetoothGattCharacteristic l() {
        return this.f13620h;
    }

    public BluetoothGattCharacteristic m() {
        return this.f13625m;
    }

    public BluetoothGattCharacteristic n() {
        return this.f13614b;
    }

    public boolean o() {
        return this.f13623k != null;
    }

    public boolean p() {
        return (this.f13613a == null || this.f13614b == null || this.f13615c == null) ? false : true;
    }
}
