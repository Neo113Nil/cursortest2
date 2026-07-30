package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3017c3 implements InterfaceC3344i3 {

    /* renamed from: A, reason: collision with root package name */
    public long f29623A;

    /* renamed from: B, reason: collision with root package name */
    public long f29624B;

    /* renamed from: C, reason: collision with root package name */
    public long f29625C;

    /* renamed from: D, reason: collision with root package name */
    public long f29626D;

    /* renamed from: E, reason: collision with root package name */
    public long f29627E;

    /* renamed from: n, reason: collision with root package name */
    public final C3290h3 f29628n;

    /* renamed from: u, reason: collision with root package name */
    public final long f29629u;

    /* renamed from: v, reason: collision with root package name */
    public final long f29630v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC3450k3 f29631w;

    /* renamed from: x, reason: collision with root package name */
    public int f29632x;

    /* renamed from: y, reason: collision with root package name */
    public long f29633y;

    /* renamed from: z, reason: collision with root package name */
    public long f29634z;

    public C3017c3(AbstractC3450k3 abstractC3450k3, long j9, long j10, long j11, long j12, boolean z8) {
        PA.n(j9 >= 0 && j10 > j9);
        this.f29631w = abstractC3450k3;
        this.f29629u = j9;
        this.f29630v = j10;
        if (j11 == j10 - j9 || z8) {
            this.f29633y = j12;
            this.f29632x = 4;
        } else {
            this.f29632x = 0;
        }
        this.f29628n = new C3290h3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    public final void b(long j9) {
        long j10 = this.f29633y - 1;
        String str = AbstractC3548lu.f32613a;
        this.f29623A = Math.max(0L, Math.min(j9, j10));
        this.f29632x = 2;
        this.f29624B = this.f29629u;
        this.f29625C = this.f29630v;
        this.f29626D = 0L;
        this.f29627E = this.f29633y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(J0 j02) {
        C3290h3 c3290h3;
        long j9;
        ?? r42;
        long j10;
        long j11;
        C3290h3 c3290h32;
        long max;
        long j12;
        int i = this.f29632x;
        long j13 = this.f29630v;
        C3290h3 c3290h33 = this.f29628n;
        if (i == 0) {
            c3290h3 = c3290h33;
            j9 = 0;
            long j14 = j02.f25675w;
            this.f29634z = j14;
            this.f29632x = 1;
            long j15 = (-65307) + j13;
            if (j15 > j14) {
                return j15;
            }
            r42 = 0;
        } else if (i != 1) {
            if (i == 2) {
                j10 = 2;
                long j16 = this.f29624B;
                long j17 = this.f29625C;
                if (j16 != j17) {
                    long j18 = j02.f25675w;
                    if (c3290h33.a(j02, j17)) {
                        c3290h33.b(j02, false);
                        j02.f25677y = 0;
                        long j19 = this.f29623A;
                        long j20 = c3290h33.f31137b;
                        long j21 = j19 - j20;
                        int i4 = c3290h33.f31139d + c3290h33.f31140e;
                        if (j21 < 0 || j21 >= 72000) {
                            if (j21 < 0) {
                                this.f29625C = j18;
                                this.f29627E = j20;
                                j11 = -1;
                            } else {
                                j11 = -1;
                                this.f29624B = j02.f25675w + i4;
                                this.f29626D = j20;
                            }
                            long j22 = this.f29625C;
                            long j23 = this.f29624B;
                            long j24 = j22 - j23;
                            if (j24 < 100000) {
                                this.f29625C = j23;
                                c3290h32 = c3290h33;
                                max = j23;
                            } else {
                                c3290h32 = c3290h33;
                                long j25 = j02.f25675w - (i4 * (j21 <= 0 ? 2L : 1L));
                                String str = AbstractC3548lu.f32613a;
                                max = Math.max(j23, Math.min(((j21 * j24) / (this.f29627E - this.f29626D)) + j25, j22 + j11));
                            }
                        }
                    } else {
                        max = this.f29624B;
                        if (max == j18) {
                            throw new IOException("No ogg page can be found.");
                        }
                        c3290h32 = c3290h33;
                        j11 = -1;
                    }
                    if (max == j11) {
                        return max;
                    }
                    this.f29632x = 3;
                    j12 = j11;
                }
                c3290h32 = c3290h33;
                max = -1;
                j11 = -1;
                if (max == j11) {
                }
            } else {
                if (i != 3) {
                    return -1L;
                }
                c3290h32 = c3290h33;
                j12 = -1;
                j10 = 2;
            }
            while (true) {
                c3290h32.a(j02, j12);
                c3290h32.b(j02, false);
                if (c3290h32.f31137b > this.f29623A) {
                    j02.f25677y = 0;
                    this.f29632x = 4;
                    return -(this.f29626D + j10);
                }
                j02.b(c3290h32.f31139d + c3290h32.f31140e, false);
                this.f29624B = j02.f25675w;
                this.f29626D = c3290h32.f31137b;
                j12 = -1;
            }
        } else {
            c3290h3 = c3290h33;
            j9 = 0;
            r42 = 0;
        }
        c3290h3.f31136a = r42;
        c3290h3.f31137b = j9;
        c3290h3.f31138c = r42;
        c3290h3.f31139d = r42;
        c3290h3.f31140e = r42;
        if (!c3290h3.a(j02, -1L)) {
            throw new EOFException();
        }
        c3290h3.b(j02, r42);
        j02.b(c3290h3.f31139d + c3290h3.f31140e, r42);
        long j26 = c3290h3.f31137b;
        while ((c3290h3.f31136a & 4) != 4 && c3290h3.a(j02, -1L) && j02.f25675w < j13 && c3290h3.b(j02, true)) {
            try {
                j02.b(c3290h3.f31139d + c3290h3.f31140e, false);
                j26 = c3290h3.f31137b;
            } catch (EOFException unused) {
            }
        }
        this.f29633y = j26;
        this.f29632x = 4;
        return this.f29634z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3344i3
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3015c1 mo6i() {
        if (this.f29633y != 0) {
            return new C2963b3(this);
        }
        return null;
    }
}
