package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7441a = new Object();

    public static final void a(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException("index (" + i7 + ") is out of bound of [0, " + i8 + ')');
        }
    }

    public static final int b(int[] iArr, int i7) {
        int length = iArr.length - 1;
        int i8 = 0;
        while (i8 <= length) {
            int i9 = (i8 + length) >>> 1;
            int i10 = iArr[i9];
            if (i7 > i10) {
                i8 = i9 + 1;
            } else {
                if (i7 >= i10) {
                    return i9;
                }
                length = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static g c() {
        return (g) n.f7426a.j();
    }

    public static g d(g gVar) {
        if (gVar instanceof y) {
            y yVar = (y) gVar;
            if (yVar.f7475t == g0.d.z()) {
                yVar.f7473r = null;
                return gVar;
            }
        }
        if (gVar instanceof z) {
            z zVar = (z) gVar;
            if (zVar.f7479h == g0.d.z()) {
                zVar.f7478g = null;
                return gVar;
            }
        }
        g h3 = n.h(gVar, null, false);
        h3.j();
        return h3;
    }

    public static Object e(q6.a aVar, q6.c cVar) {
        g yVar;
        if (cVar == null) {
            return aVar.a();
        }
        g gVar = (g) n.f7426a.j();
        if (gVar instanceof y) {
            y yVar2 = (y) gVar;
            if (yVar2.f7475t == g0.d.z()) {
                q6.c cVar2 = yVar2.f7473r;
                q6.c cVar3 = yVar2.f7474s;
                try {
                    ((y) gVar).f7473r = n.l(cVar, cVar2, true);
                    ((y) gVar).f7474s = cVar3;
                    return aVar.a();
                } finally {
                    yVar2.f7473r = cVar2;
                    yVar2.f7474s = cVar3;
                }
            }
        }
        if (gVar == null || (gVar instanceof c)) {
            yVar = new y(gVar instanceof c ? (c) gVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.a();
            }
            yVar = gVar.t(cVar);
        }
        try {
            g j8 = yVar.j();
            try {
                Object a3 = aVar.a();
                g.p(j8);
                yVar.c();
                return a3;
            } catch (Throwable th) {
                g.p(j8);
                throw th;
            }
        } catch (Throwable th2) {
            yVar.c();
            throw th2;
        }
    }

    public static void f(g gVar, g gVar2, q6.c cVar) {
        if (gVar != gVar2) {
            gVar2.getClass();
            g.p(gVar);
            gVar2.c();
        } else if (gVar instanceof y) {
            ((y) gVar).f7473r = cVar;
        } else if (gVar instanceof z) {
            ((z) gVar).f7478g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
