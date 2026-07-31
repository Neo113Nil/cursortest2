package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
final class bs0 implements tl {

    /* renamed from: a, reason: collision with root package name */
    private final tl f3509a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3510b;

    /* renamed from: c, reason: collision with root package name */
    private final tl f3511c;

    /* renamed from: d, reason: collision with root package name */
    private long f3512d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f3513e;

    bs0(tl tlVar, int i7, tl tlVar2) {
        this.f3509a = tlVar;
        this.f3510b = i7;
        this.f3511c = tlVar2;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final Uri c() {
        return this.f3513e;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final int d(byte[] bArr, int i7, int i8) {
        int i9;
        long j7 = this.f3512d;
        long j8 = this.f3510b;
        if (j7 < j8) {
            int d7 = this.f3509a.d(bArr, i7, (int) Math.min(i8, j8 - j7));
            long j9 = this.f3512d + d7;
            this.f3512d = j9;
            i9 = d7;
            j7 = j9;
        } else {
            i9 = 0;
        }
        if (j7 < this.f3510b) {
            return i9;
        }
        int d8 = this.f3511c.d(bArr, i7 + i9, i8 - i9);
        this.f3512d += d8;
        return i9 + d8;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final long e(vl vlVar) {
        vl vlVar2;
        this.f3513e = vlVar.f13430a;
        long j7 = vlVar.f13432c;
        long j8 = this.f3510b;
        vl vlVar3 = null;
        if (j7 >= j8) {
            vlVar2 = null;
        } else {
            long j9 = vlVar.f13433d;
            long j10 = j8 - j7;
            if (j9 != -1) {
                j10 = Math.min(j9, j10);
            }
            vlVar2 = new vl(vlVar.f13430a, null, j7, j7, j10, null, 0);
        }
        long j11 = vlVar.f13433d;
        if (j11 == -1 || vlVar.f13432c + j11 > this.f3510b) {
            long max = Math.max(this.f3510b, vlVar.f13432c);
            long j12 = vlVar.f13433d;
            vlVar3 = new vl(vlVar.f13430a, null, max, max, j12 != -1 ? Math.min(j12, (vlVar.f13432c + j12) - this.f3510b) : -1L, null, 0);
        }
        long e7 = vlVar2 != null ? this.f3509a.e(vlVar2) : 0L;
        long e8 = vlVar3 != null ? this.f3511c.e(vlVar3) : 0L;
        this.f3512d = vlVar.f13432c;
        if (e8 == -1) {
            return -1L;
        }
        return e7 + e8;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final void g() {
        this.f3509a.g();
        this.f3511c.g();
    }
}
