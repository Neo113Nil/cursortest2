package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class it0 implements he1 {

    /* renamed from: a, reason: collision with root package name */
    private final he1 f6779a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6780b;

    /* renamed from: c, reason: collision with root package name */
    private final he1 f6781c;

    /* renamed from: d, reason: collision with root package name */
    private long f6782d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f6783e;

    it0(he1 he1Var, int i7, he1 he1Var2) {
        this.f6779a = he1Var;
        this.f6780b = i7;
        this.f6781c = he1Var2;
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        int i9;
        long j7 = this.f6782d;
        long j8 = this.f6780b;
        if (j7 < j8) {
            int a7 = this.f6779a.a(bArr, i7, (int) Math.min(i8, j8 - j7));
            long j9 = this.f6782d + a7;
            this.f6782d = j9;
            i9 = a7;
            j7 = j9;
        } else {
            i9 = 0;
        }
        if (j7 < this.f6780b) {
            return i9;
        }
        int a8 = this.f6781c.a(bArr, i7 + i9, i8 - i9);
        this.f6782d += a8;
        return i9 + a8;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f6783e;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        this.f6779a.i();
        this.f6781c.i();
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void j(vt1 vt1Var) {
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        li1 li1Var2;
        this.f6783e = li1Var.f7985a;
        long j7 = li1Var.f7990f;
        long j8 = this.f6780b;
        li1 li1Var3 = null;
        if (j7 >= j8) {
            li1Var2 = null;
        } else {
            long j9 = li1Var.f7991g;
            long j10 = j8 - j7;
            if (j9 != -1) {
                j10 = Math.min(j9, j10);
            }
            li1Var2 = new li1(li1Var.f7985a, null, j7, j7, j10, null, 0);
        }
        long j11 = li1Var.f7991g;
        if (j11 == -1 || li1Var.f7990f + j11 > this.f6780b) {
            long max = Math.max(this.f6780b, li1Var.f7990f);
            long j12 = li1Var.f7991g;
            li1Var3 = new li1(li1Var.f7985a, null, max, max, j12 != -1 ? Math.min(j12, (li1Var.f7990f + j12) - this.f6780b) : -1L, null, 0);
        }
        long k7 = li1Var2 != null ? this.f6779a.k(li1Var2) : 0L;
        long k8 = li1Var3 != null ? this.f6781c.k(li1Var3) : 0L;
        this.f6782d = li1Var.f7990f;
        if (k7 == -1 || k8 == -1) {
            return -1L;
        }
        return k7 + k8;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Map<String, List<String>> zza() {
        return i73.d();
    }
}
