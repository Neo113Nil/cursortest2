package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class x2 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f14000e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f14001a;

    /* renamed from: b, reason: collision with root package name */
    public int f14002b;

    /* renamed from: c, reason: collision with root package name */
    public int f14003c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f14004d = new byte[128];

    public x2(int i7) {
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f14001a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f14004d;
            int length = bArr2.length;
            int i10 = this.f14002b + i9;
            if (length < i10) {
                this.f14004d = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.f14004d, this.f14002b, i9);
            this.f14002b += i9;
        }
    }

    public final void b() {
        this.f14001a = false;
        this.f14002b = 0;
        this.f14003c = 0;
    }

    public final boolean c(int i7, int i8) {
        if (this.f14001a) {
            int i9 = this.f14002b - i8;
            this.f14002b = i9;
            if (this.f14003c != 0 || i7 != 181) {
                this.f14001a = false;
                return true;
            }
            this.f14003c = i9;
        } else if (i7 == 179) {
            this.f14001a = true;
        }
        a(f14000e, 0, 3);
        return false;
    }
}
