package T0;

import W.J;
import a.AbstractC0124a;
import java.io.EOFException;
import java.io.IOException;
import y0.o;
import y0.y;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f f2906a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2907b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2908c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2909d;

    /* renamed from: e, reason: collision with root package name */
    public int f2910e;

    /* renamed from: f, reason: collision with root package name */
    public long f2911f;

    /* renamed from: g, reason: collision with root package name */
    public long f2912g;

    /* renamed from: h, reason: collision with root package name */
    public long f2913h;

    /* renamed from: i, reason: collision with root package name */
    public long f2914i;

    /* renamed from: j, reason: collision with root package name */
    public long f2915j;

    /* renamed from: k, reason: collision with root package name */
    public long f2916k;

    /* renamed from: l, reason: collision with root package name */
    public long f2917l;

    public b(i iVar, long j4, long j5, long j6, long j7, boolean z) {
        AbstractC0124a.h(j4 >= 0 && j5 > j4);
        this.f2909d = iVar;
        this.f2907b = j4;
        this.f2908c = j5;
        if (j6 == j5 - j4 || z) {
            this.f2911f = j7;
            this.f2910e = 4;
        } else {
            this.f2910e = 0;
        }
        this.f2906a = new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // T0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(o oVar) {
        long j4;
        long j5;
        long k4;
        int i4 = this.f2910e;
        long j6 = this.f2908c;
        f fVar = this.f2906a;
        if (i4 == 0) {
            j4 = 0;
            long position = oVar.getPosition();
            this.f2912g = position;
            this.f2910e = 1;
            long j7 = j6 - 65307;
            if (j7 > position) {
                return j7;
            }
        } else if (i4 != 1) {
            if (i4 == 2) {
                if (this.f2914i == this.f2915j) {
                    k4 = -1;
                } else {
                    long position2 = oVar.getPosition();
                    if (fVar.b(oVar, this.f2915j)) {
                        fVar.a(oVar, false);
                        oVar.u();
                        long j8 = this.f2913h;
                        long j9 = fVar.f2927b;
                        long j10 = j8 - j9;
                        j5 = 2;
                        int i5 = fVar.f2929d + fVar.f2930e;
                        if (0 > j10 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.f2915j = position2;
                                this.f2917l = j9;
                            } else {
                                this.f2914i = oVar.getPosition() + i5;
                                this.f2916k = fVar.f2927b;
                            }
                            long j11 = this.f2915j;
                            long j12 = this.f2914i;
                            if (j11 - j12 < 100000) {
                                this.f2915j = j12;
                                k4 = j12;
                            } else {
                                long position3 = oVar.getPosition() - (i5 * (j10 <= 0 ? 2L : 1L));
                                long j13 = this.f2915j;
                                long j14 = this.f2914i;
                                k4 = J.k((((j13 - j14) * j10) / (this.f2917l - this.f2916k)) + position3, j14, j13 - 1);
                            }
                        } else {
                            k4 = -1;
                        }
                        if (k4 == -1) {
                            return k4;
                        }
                        this.f2910e = 3;
                    } else {
                        k4 = this.f2914i;
                        if (k4 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j5 = 2;
                if (k4 == -1) {
                }
            } else {
                if (i4 != 3) {
                    if (i4 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j5 = 2;
            }
            while (true) {
                fVar.b(oVar, -1L);
                fVar.a(oVar, false);
                if (fVar.f2927b > this.f2913h) {
                    oVar.u();
                    this.f2910e = 4;
                    return -(this.f2916k + j5);
                }
                oVar.v(fVar.f2929d + fVar.f2930e);
                this.f2914i = oVar.getPosition();
                this.f2916k = fVar.f2927b;
            }
        } else {
            j4 = 0;
        }
        fVar.f2926a = 0;
        fVar.f2927b = j4;
        fVar.f2928c = 0;
        fVar.f2929d = 0;
        fVar.f2930e = 0;
        if (!fVar.b(oVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(oVar, false);
        oVar.v(fVar.f2929d + fVar.f2930e);
        long j15 = fVar.f2927b;
        while ((fVar.f2926a & 4) != 4 && fVar.b(oVar, -1L) && oVar.getPosition() < j6 && fVar.a(oVar, true)) {
            try {
                oVar.v(fVar.f2929d + fVar.f2930e);
                j15 = fVar.f2927b;
            } catch (EOFException unused) {
            }
        }
        this.f2911f = j15;
        this.f2910e = 4;
        return this.f2912g;
    }

    @Override // T0.g
    public final y d() {
        if (this.f2911f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // T0.g
    public final void e(long j4) {
        this.f2913h = J.k(j4, 0L, this.f2911f - 1);
        this.f2910e = 2;
        this.f2914i = this.f2907b;
        this.f2915j = this.f2908c;
        this.f2916k = 0L;
        this.f2917l = this.f2911f;
    }
}
