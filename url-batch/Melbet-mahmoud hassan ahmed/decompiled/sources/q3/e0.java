package q3;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class e0<T> implements j4.d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final e f20261a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20262b;

    /* renamed from: c, reason: collision with root package name */
    private final b<?> f20263c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20264d;

    e0(e eVar, int i7, b<?> bVar, long j7, String str, String str2) {
        this.f20261a = eVar;
        this.f20262b = i7;
        this.f20263c = bVar;
        this.f20264d = j7;
    }

    static <T> e0<T> b(e eVar, int i7, b<?> bVar) {
        boolean z6;
        if (!eVar.s()) {
            return null;
        }
        r3.q a7 = r3.p.b().a();
        if (a7 == null) {
            z6 = true;
        } else {
            if (!a7.h()) {
                return null;
            }
            z6 = a7.i();
            z p7 = eVar.p(bVar);
            if (p7 != null) {
                if (!(p7.s() instanceof r3.c)) {
                    return null;
                }
                r3.c cVar = (r3.c) p7.s();
                if (cVar.I() && !cVar.k()) {
                    r3.e c7 = c(p7, cVar, i7);
                    if (c7 == null) {
                        return null;
                    }
                    p7.G();
                    z6 = c7.j();
                }
            }
        }
        return new e0<>(eVar, i7, bVar, z6 ? System.currentTimeMillis() : 0L, null, null);
    }

    private static r3.e c(z<?> zVar, r3.c<?> cVar, int i7) {
        int[] g7;
        int[] h7;
        r3.e G = cVar.G();
        if (G == null || !G.i() || ((g7 = G.g()) != null ? !v3.a.a(g7, i7) : !((h7 = G.h()) == null || !v3.a.a(h7, i7))) || zVar.F() >= G.c()) {
            return null;
        }
        return G;
    }

    @Override // j4.d
    public final void a(j4.h<T> hVar) {
        z p7;
        int i7;
        int i8;
        int i9;
        int i10;
        int c7;
        long j7;
        long j8;
        if (this.f20261a.s()) {
            r3.q a7 = r3.p.b().a();
            if ((a7 == null || a7.h()) && (p7 = this.f20261a.p(this.f20263c)) != null && (p7.s() instanceof r3.c)) {
                r3.c cVar = (r3.c) p7.s();
                boolean z6 = this.f20264d > 0;
                int y6 = cVar.y();
                if (a7 != null) {
                    z6 &= a7.i();
                    int c8 = a7.c();
                    int g7 = a7.g();
                    i7 = a7.j();
                    if (cVar.I() && !cVar.k()) {
                        r3.e c9 = c(p7, cVar, this.f20262b);
                        if (c9 == null) {
                            return;
                        }
                        boolean z7 = c9.j() && this.f20264d > 0;
                        g7 = c9.c();
                        z6 = z7;
                    }
                    i8 = c8;
                    i9 = g7;
                } else {
                    i7 = 0;
                    i8 = 5000;
                    i9 = 100;
                }
                e eVar = this.f20261a;
                if (hVar.m()) {
                    i10 = 0;
                    c7 = 0;
                } else {
                    if (hVar.k()) {
                        i10 = 100;
                    } else {
                        Exception i11 = hVar.i();
                        if (i11 instanceof p3.b) {
                            Status a8 = ((p3.b) i11).a();
                            int g8 = a8.g();
                            o3.b c10 = a8.c();
                            c7 = c10 == null ? -1 : c10.c();
                            i10 = g8;
                        } else {
                            i10 = 101;
                        }
                    }
                    c7 = -1;
                }
                if (z6) {
                    long j9 = this.f20264d;
                    j8 = System.currentTimeMillis();
                    j7 = j9;
                } else {
                    j7 = 0;
                    j8 = 0;
                }
                eVar.v(new r3.m(this.f20262b, i10, c7, j7, j8, null, null, y6), i7, i8, i9);
            }
        }
    }
}
