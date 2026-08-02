package d0;

import e0.C0392b;
import q0.C1360b;
import r0.C1394e;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final C1394e f8161a;

    /* renamed from: b, reason: collision with root package name */
    public final e0.m f8162b;

    /* renamed from: c, reason: collision with root package name */
    public final C0392b f8163c;

    /* renamed from: d, reason: collision with root package name */
    public final i f8164d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8165e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8166f;

    public j(long j4, e0.m mVar, C0392b c0392b, C1394e c1394e, long j5, i iVar) {
        this.f8165e = j4;
        this.f8162b = mVar;
        this.f8163c = c0392b;
        this.f8166f = j5;
        this.f8161a = c1394e;
        this.f8164d = iVar;
    }

    public final j a(long j4, e0.m mVar) {
        long p2;
        long p4;
        i c4 = this.f8162b.c();
        i c5 = mVar.c();
        if (c4 == null) {
            return new j(j4, mVar, this.f8163c, this.f8161a, this.f8166f, c4);
        }
        if (!c4.w()) {
            return new j(j4, mVar, this.f8163c, this.f8161a, this.f8166f, c5);
        }
        long C4 = c4.C(j4);
        if (C4 == 0) {
            return new j(j4, mVar, this.f8163c, this.f8161a, this.f8166f, c5);
        }
        c5.getClass();
        long A4 = c4.A();
        long a3 = c4.a(A4);
        long j5 = C4 + A4;
        long j6 = j5 - 1;
        long f4 = c4.f(j6, j4) + c4.a(j6);
        long A5 = c5.A();
        long a4 = c5.a(A5);
        long j7 = this.f8166f;
        if (f4 == a4) {
            p2 = j5 - A5;
        } else {
            if (f4 < a4) {
                throw new C1360b();
            }
            if (a4 < a3) {
                p4 = j7 - (c5.p(a3, j4) - A4);
                return new j(j4, mVar, this.f8163c, this.f8161a, p4, c5);
            }
            p2 = c4.p(a4, j4) - A5;
        }
        p4 = p2 + j7;
        return new j(j4, mVar, this.f8163c, this.f8161a, p4, c5);
    }

    public final long b(long j4) {
        i iVar = this.f8164d;
        iVar.getClass();
        long j5 = this.f8165e;
        long g4 = iVar.g(j5, j4) + this.f8166f;
        iVar.getClass();
        return (iVar.D(j5, j4) + g4) - 1;
    }

    public final long c() {
        i iVar = this.f8164d;
        iVar.getClass();
        return iVar.C(this.f8165e);
    }

    public final long d(long j4) {
        long e4 = e(j4);
        i iVar = this.f8164d;
        iVar.getClass();
        return iVar.f(j4 - this.f8166f, this.f8165e) + e4;
    }

    public final long e(long j4) {
        i iVar = this.f8164d;
        iVar.getClass();
        return iVar.a(j4 - this.f8166f);
    }

    public final boolean f(long j4, long j5) {
        i iVar = this.f8164d;
        iVar.getClass();
        return iVar.w() || j5 == -9223372036854775807L || d(j4) <= j5;
    }
}
