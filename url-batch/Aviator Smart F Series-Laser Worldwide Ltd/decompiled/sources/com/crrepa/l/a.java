package com.crrepa.l;

import android.bluetooth.BluetoothGatt;
import androidx.annotation.NonNull;
import com.crrepa.ble.conn.type.CRPProtocolVersion;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f13141f = 250;

    /* renamed from: a, reason: collision with root package name */
    private BluetoothGatt f13142a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothGatt f13143b;

    /* renamed from: c, reason: collision with root package name */
    private BluetoothGatt f13144c;

    /* renamed from: d, reason: collision with root package name */
    private int f13145d;

    /* renamed from: e, reason: collision with root package name */
    private CRPProtocolVersion f13146e;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static a f13147a = new a();

        private b() {
        }
    }

    private a() {
        this.f13145d = 20;
    }

    public static a b() {
        return b.f13147a;
    }

    public BluetoothGatt a() {
        return this.f13142a;
    }

    public int c() {
        return this.f13145d;
    }

    public BluetoothGatt d() {
        return this.f13143b;
    }

    public CRPProtocolVersion e() {
        return this.f13146e;
    }

    public BluetoothGatt f() {
        return this.f13144c;
    }

    public boolean g() {
        return this.f13146e == CRPProtocolVersion.V1;
    }

    public boolean h() {
        return this.f13146e == CRPProtocolVersion.V2;
    }

    public boolean i() {
        return this.f13146e == CRPProtocolVersion.V3;
    }

    public void j() {
        this.f13145d = 20;
    }

    public void a(int i8) {
        if (250 < i8) {
            i8 = 250;
        }
        int i9 = i8 - 3;
        this.f13145d = i9 - (i9 % 4);
    }

    public void b(BluetoothGatt bluetoothGatt) {
        this.f13143b = bluetoothGatt;
    }

    public void c(BluetoothGatt bluetoothGatt) {
        this.f13144c = bluetoothGatt;
    }

    public void a(@NonNull BluetoothGatt bluetoothGatt) {
        this.f13142a = bluetoothGatt;
    }

    public void a(CRPProtocolVersion cRPProtocolVersion) {
        this.f13146e = cRPProtocolVersion;
    }
}
