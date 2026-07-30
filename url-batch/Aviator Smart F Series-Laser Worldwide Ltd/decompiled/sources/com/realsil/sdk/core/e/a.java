package com.realsil.sdk.core.e;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.d.j;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15674a = RtkCore.DEBUG;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15675b = RtkCore.VDBG;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15676c = RtkCore.TDBG;

    /* renamed from: d, reason: collision with root package name */
    public final BluetoothAdapter f15677d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15678e;

    /* renamed from: f, reason: collision with root package name */
    public ScannerParams f15679f;

    /* renamed from: g, reason: collision with root package name */
    public j f15680g;

    public a(Context context) {
        this.f15677d = BluetoothAdapterCompat.getBluetoothAdapter(context);
    }

    public final boolean a() {
        BluetoothAdapter bluetoothAdapter = this.f15677d;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.isEnabled();
    }

    public abstract boolean a(ScannerParams scannerParams);

    public abstract boolean b();
}
