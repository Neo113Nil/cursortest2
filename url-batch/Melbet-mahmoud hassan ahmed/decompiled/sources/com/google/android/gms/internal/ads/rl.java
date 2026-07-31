package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rl implements tl {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f11192a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f11193b;

    /* renamed from: c, reason: collision with root package name */
    private int f11194c;

    /* renamed from: d, reason: collision with root package name */
    private int f11195d;

    public rl(byte[] bArr) {
        Objects.requireNonNull(bArr);
        jm.c(bArr.length > 0);
        this.f11192a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final Uri c() {
        return this.f11193b;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final int d(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f11195d;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        System.arraycopy(this.f11192a, this.f11194c, bArr, i7, min);
        this.f11194c += min;
        this.f11195d -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final long e(vl vlVar) {
        this.f11193b = vlVar.f13430a;
        long j7 = vlVar.f13432c;
        int i7 = (int) j7;
        this.f11194c = i7;
        long j8 = vlVar.f13433d;
        int length = (int) (j8 == -1 ? this.f11192a.length - j7 : j8);
        this.f11195d = length;
        if (length > 0 && i7 + length <= this.f11192a.length) {
            return length;
        }
        int length2 = this.f11192a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i7);
        sb.append(", ");
        sb.append(j8);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final void g() {
        this.f11193b = null;
    }
}
