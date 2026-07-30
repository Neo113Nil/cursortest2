package com.crrepa.y0;

import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.c;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f14048e = 65535;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f14049a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14050b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14051c;

    /* renamed from: d, reason: collision with root package name */
    private int f14052d;

    public a(byte[] bArr) {
        this.f14050b = false;
        this.f14051c = false;
        this.f14052d = -1;
        this.f14049a = bArr;
        c();
    }

    private void c() {
        byte[] bArr = this.f14049a;
        if (bArr == null || 2 > bArr.length) {
            return;
        }
        if (this.f14050b) {
            if (4 <= bArr.length) {
                this.f14052d = (int) c.f(bArr);
            }
        } else {
            int b8 = c.b(bArr[0], bArr[1]);
            this.f14052d = b8;
            this.f14051c = b8 == 65535;
        }
    }

    public int a() {
        byte b8;
        byte b9;
        byte[] bArr = this.f14049a;
        if (bArr.length == 4) {
            b8 = bArr[2];
            b9 = bArr[3];
        } else {
            b8 = bArr[1];
            b9 = bArr[0];
        }
        return c.b(b8, b9);
    }

    public int b() {
        BleLog.i("trans offset: " + this.f14052d);
        return this.f14052d;
    }

    public boolean d() {
        return this.f14051c;
    }

    public String toString() {
        return "BleFileTransEvent{bytes=" + Arrays.toString(this.f14049a) + ", isSifli=" + this.f14050b + ", trainComplete=" + this.f14051c + ", offset=" + this.f14052d + '}';
    }

    public a(byte[] bArr, boolean z7) {
        this.f14051c = false;
        this.f14052d = -1;
        this.f14049a = bArr;
        this.f14050b = z7;
        c();
    }

    public void a(boolean z7) {
        this.f14051c = z7;
    }
}
