package w0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7547a = new Object();

    public static final void a(int i, int i8) {
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i8 + ')');
        }
    }

    public static final boolean b(t tVar, int i, q0.c cVar, boolean z3) {
        boolean z7;
        synchronized (f7547a) {
            try {
                int i8 = tVar.f7569d;
                if (i8 == i) {
                    tVar.f7568c = cVar;
                    z7 = true;
                    if (z3) {
                        tVar.f7570e++;
                    }
                    tVar.f7569d = i8 + 1;
                } else {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    public static final int c(long[] jArr, long j7) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i8 = (i + length) >>> 1;
            long j8 = jArr[i8];
            if (j7 > j8) {
                i = i8 + 1;
            } else {
                if (j7 >= j8) {
                    return i8;
                }
                length = i8 - 1;
            }
        }
        return -(i + 1);
    }

    public static f e() {
        return (f) m.f7536b.l();
    }

    public static final t f(p pVar) {
        t tVar = pVar.f7546d;
        q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (t) m.t(tVar, pVar);
    }

    public static final int g(p pVar) {
        t tVar = pVar.f7546d;
        q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((t) m.i(tVar)).f7570e;
    }

    public static f h(f fVar) {
        if (fVar instanceof y) {
            y yVar = (y) fVar;
            if (yVar.f7583t == u0.h.b()) {
                yVar.f7581r = null;
                return fVar;
            }
        }
        if (fVar instanceof z) {
            z zVar = (z) fVar;
            if (zVar.i == u0.h.b()) {
                zVar.f7587h = null;
                return fVar;
            }
        }
        f h8 = m.h(fVar, null, false);
        h8.j();
        return h8;
    }

    public static final boolean i(p pVar, p6.c cVar) {
        int i;
        q0.c cVar2;
        Object i8;
        f k3;
        boolean b8;
        do {
            synchronized (f7547a) {
                t tVar = pVar.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i = tVar2.f7569d;
                cVar2 = tVar2.f7568c;
            }
            q6.i.b(cVar2);
            q0.g f6 = cVar2.f();
            i8 = cVar.i(f6);
            q0.c c8 = f6.c();
            if (q6.i.a(c8, cVar2)) {
                break;
            }
            t tVar3 = pVar.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = b((t) m.w(tVar3, pVar, k3), i, c8, true);
            }
            m.n(k3, pVar);
        } while (!b8);
        return ((Boolean) i8).booleanValue();
    }

    public static Object j(p6.c cVar, p6.a aVar) {
        f yVar;
        if (cVar == null) {
            return aVar.b();
        }
        f fVar = (f) m.f7536b.l();
        if (fVar instanceof y) {
            y yVar2 = (y) fVar;
            if (yVar2.f7583t == u0.h.b()) {
                p6.c cVar2 = yVar2.f7581r;
                p6.c cVar3 = yVar2.f7582s;
                try {
                    ((y) fVar).f7581r = m.l(cVar, cVar2, true);
                    ((y) fVar).f7582s = cVar3;
                    return aVar.b();
                } finally {
                    yVar2.f7581r = cVar2;
                    yVar2.f7582s = cVar3;
                }
            }
        }
        if (fVar == null || (fVar instanceof b)) {
            yVar = new y(fVar instanceof b ? (b) fVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.b();
            }
            yVar = fVar.u(cVar);
        }
        try {
            f j7 = yVar.j();
            try {
                Object b8 = aVar.b();
                f.q(j7);
                yVar.c();
                return b8;
            } catch (Throwable th) {
                f.q(j7);
                throw th;
            }
        } catch (Throwable th2) {
            yVar.c();
            throw th2;
        }
    }

    public static void k(f fVar, f fVar2, p6.c cVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof y) {
            ((y) fVar).f7581r = cVar;
        } else if (fVar instanceof z) {
            ((z) fVar).f7587h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    public static final void l() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
