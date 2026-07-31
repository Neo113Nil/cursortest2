package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class j54 implements he1 {

    /* renamed from: a, reason: collision with root package name */
    private final he1 f6982a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6983b;

    /* renamed from: c, reason: collision with root package name */
    private final i54 f6984c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f6985d;

    /* renamed from: e, reason: collision with root package name */
    private int f6986e;

    public j54(he1 he1Var, int i7, i54 i54Var) {
        wu1.d(i7 > 0);
        this.f6982a = he1Var;
        this.f6983b = i7;
        this.f6984c = i54Var;
        this.f6985d = new byte[1];
        this.f6986e = i7;
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        int i9 = this.f6986e;
        if (i9 == 0) {
            int i10 = 0;
            if (this.f6982a.a(this.f6985d, 0, 1) != -1) {
                int i11 = (this.f6985d[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr2 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int a7 = this.f6982a.a(bArr2, i10, i12);
                        if (a7 != -1) {
                            i10 += a7;
                            i12 -= a7;
                        }
                    }
                    while (i11 > 0) {
                        int i13 = i11 - 1;
                        if (bArr2[i13] != 0) {
                            break;
                        }
                        i11 = i13;
                    }
                    if (i11 > 0) {
                        this.f6984c.a(new dr2(bArr2, i11));
                    }
                }
                i9 = this.f6983b;
                this.f6986e = i9;
            }
            return -1;
        }
        int a8 = this.f6982a.a(bArr, i7, Math.min(i9, i8));
        if (a8 != -1) {
            this.f6986e -= a8;
        }
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f6982a.h();
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void j(vt1 vt1Var) {
        Objects.requireNonNull(vt1Var);
        this.f6982a.j(vt1Var);
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Map<String, List<String>> zza() {
        return this.f6982a.zza();
    }
}
