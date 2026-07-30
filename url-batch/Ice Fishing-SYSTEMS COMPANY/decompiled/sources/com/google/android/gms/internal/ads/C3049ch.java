package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ch, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3049ch implements InterfaceC3572mH {

    /* renamed from: n, reason: collision with root package name */
    public final SF f29727n;

    /* renamed from: u, reason: collision with root package name */
    public final long f29728u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3572mH f29729v;

    /* renamed from: w, reason: collision with root package name */
    public long f29730w;

    /* renamed from: x, reason: collision with root package name */
    public Uri f29731x;

    public C3049ch(SF sf, int i, InterfaceC3572mH interfaceC3572mH) {
        this.f29727n = sf;
        this.f29728u = i;
        this.f29729v = interfaceC3572mH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final long F(C3197fJ c3197fJ) {
        C3197fJ c3197fJ2;
        C3197fJ c3197fJ3;
        C3197fJ c3197fJ4;
        Uri uri = c3197fJ.f30686a;
        this.f29731x = uri;
        long j9 = c3197fJ.f30688c;
        long j10 = this.f29728u;
        long j11 = c3197fJ.f30689d;
        if (j9 >= j10) {
            c3197fJ2 = null;
        } else {
            long j12 = j10 - j9;
            if (j11 != -1) {
                j12 = Math.min(j11, j12);
            }
            c3197fJ2 = new C3197fJ(uri, j9, j12);
        }
        if (j11 == -1 || j9 + j11 > j10) {
            c3197fJ3 = c3197fJ2;
            c3197fJ4 = new C3197fJ(uri, Math.max(j10, j9), j11 != -1 ? Math.min(j11, (j9 + j11) - j10) : -1L);
        } else {
            c3197fJ3 = c3197fJ2;
            c3197fJ4 = null;
        }
        long F8 = c3197fJ3 != null ? this.f29727n.F(c3197fJ3) : 0L;
        long F9 = c3197fJ4 != null ? this.f29729v.F(c3197fJ4) : 0L;
        this.f29730w = j9;
        if (F8 == -1 || F9 == -1) {
            return -1L;
        }
        return F8 + F9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void a(DN dn) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH, com.google.android.gms.internal.ads.KM
    public final Map h() {
        return C3944tC.f34377z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final Uri i() {
        return this.f29731x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void o() {
        this.f29727n.o();
        this.f29729v.o();
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        int i9;
        long j9 = this.f29730w;
        long j10 = this.f29728u;
        if (j9 < j10) {
            int z8 = this.f29727n.z(bArr, i, (int) Math.min(i4, j10 - j9));
            long j11 = this.f29730w + z8;
            this.f29730w = j11;
            i9 = z8;
            j9 = j11;
        } else {
            i9 = 0;
        }
        if (j9 < j10) {
            return i9;
        }
        int z9 = this.f29729v.z(bArr, i + i9, i4 - i9);
        int i10 = i9 + z9;
        this.f29730w += z9;
        return i10;
    }
}
