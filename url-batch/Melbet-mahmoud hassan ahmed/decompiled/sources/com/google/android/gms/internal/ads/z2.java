package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
final class z2 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f14894f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f14895a;

    /* renamed from: b, reason: collision with root package name */
    private int f14896b;

    /* renamed from: c, reason: collision with root package name */
    public int f14897c;

    /* renamed from: d, reason: collision with root package name */
    public int f14898d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f14899e = new byte[128];

    public z2(int i7) {
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f14895a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f14899e;
            int length = bArr2.length;
            int i10 = this.f14897c + i9;
            if (length < i10) {
                this.f14899e = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.f14899e, this.f14897c, i9);
            this.f14897c += i9;
        }
    }

    public final void b() {
        this.f14895a = false;
        this.f14897c = 0;
        this.f14896b = 0;
    }

    public final boolean c(int i7, int i8) {
        int i9 = this.f14896b;
        if (i9 != 0) {
            if (i9 == 1) {
                if (i7 == 181) {
                    this.f14896b = 2;
                }
                Log.w("H263Reader", "Unexpected start code value");
                b();
            } else if (i9 == 2) {
                if (i7 <= 31) {
                    this.f14896b = 3;
                }
                Log.w("H263Reader", "Unexpected start code value");
                b();
            } else if (i9 == 3) {
                if ((i7 & 240) == 32) {
                    this.f14898d = this.f14897c;
                    this.f14896b = 4;
                }
                Log.w("H263Reader", "Unexpected start code value");
                b();
            } else if (i7 == 179 || i7 == 181) {
                this.f14897c -= i8;
                this.f14895a = false;
                return true;
            }
        } else if (i7 == 176) {
            this.f14896b = 1;
            this.f14895a = true;
        }
        a(f14894f, 0, 3);
        return false;
    }
}
