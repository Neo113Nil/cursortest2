package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b94 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f3290e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f3291f;

    /* renamed from: g, reason: collision with root package name */
    private int f3292g;

    /* renamed from: h, reason: collision with root package name */
    private int f3293h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3294i;

    public b94(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        wu1.d(bArr.length > 0);
        this.f3290e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f3293h;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        System.arraycopy(this.f3290e, this.f3292g, bArr, i7, min);
        this.f3292g += min;
        this.f3293h -= min;
        o(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f3291f;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        if (this.f3294i) {
            this.f3294i = false;
            p();
        }
        this.f3291f = null;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        this.f3291f = li1Var.f7985a;
        q(li1Var);
        long j7 = li1Var.f7990f;
        int length = this.f3290e.length;
        if (j7 > length) {
            throw new if1(2008);
        }
        int i7 = (int) j7;
        this.f3292g = i7;
        int i8 = length - i7;
        this.f3293h = i8;
        long j8 = li1Var.f7991g;
        if (j8 != -1) {
            this.f3293h = (int) Math.min(i8, j8);
        }
        this.f3294i = true;
        r(li1Var);
        long j9 = li1Var.f7991g;
        return j9 != -1 ? j9 : this.f3293h;
    }
}
