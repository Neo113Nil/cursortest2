package n0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 extends o {

    /* renamed from: a, reason: collision with root package name */
    public final long f6690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6692c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f6693d;

    /* renamed from: e, reason: collision with root package name */
    public final s.i0 f6694e;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f6695f;
    public final /* synthetic */ i0 g;

    public h0(i0 i0Var, long j, boolean z10, boolean z11, l.d dVar) {
        this.g = i0Var;
        this.f6690a = j;
        this.f6691b = z10;
        this.f6692c = z11;
        int i3 = s.q0.f8360a;
        this.f6694e = new s.i0();
        this.f6695f = new j1(x0.h.f10234u, e.f6661s);
    }

    @Override // n0.o
    public final void a(q qVar, Function2 function2) {
        this.g.f6699b.a(qVar, function2);
    }

    @Override // n0.o
    public final void b() {
        i0 i0Var = this.g;
        i0Var.A--;
    }

    @Override // n0.o
    public final boolean c() {
        return this.g.f6699b.c();
    }

    @Override // n0.o
    public final boolean d() {
        return this.f6691b;
    }

    @Override // n0.o
    public final boolean e() {
        return this.f6692c;
    }

    @Override // n0.o
    public final long f() {
        return this.f6690a;
    }

    @Override // n0.o
    public final n g() {
        return this.g.f6704h;
    }

    @Override // n0.o
    public final x0.h h() {
        return (x0.h) this.f6695f.getValue();
    }

    @Override // n0.o
    public final CoroutineContext i() {
        return this.g.f6699b.i();
    }

    @Override // n0.o
    public final boolean j() {
        return this.g.f6699b.j();
    }

    @Override // n0.o
    public final void k(q qVar) {
        i0 i0Var = this.g;
        i0Var.f6699b.k(i0Var.f6704h);
        i0Var.f6699b.k(qVar);
    }

    @Override // n0.o
    public final t0 l(u0 u0Var) {
        return this.g.f6699b.l(u0Var);
    }

    @Override // n0.o
    public final void m(Set set) {
        HashSet hashSet = this.f6693d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f6693d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // n0.o
    public final void n(i0 i0Var) {
        this.f6694e.a(i0Var);
    }

    @Override // n0.o
    public final void o(q qVar) {
        this.g.f6699b.o(qVar);
    }

    @Override // n0.o
    public final f p(a2.a0 a0Var) {
        return this.g.f6699b.p(a0Var);
    }

    @Override // n0.o
    public final void q() {
        this.g.A++;
    }

    @Override // n0.o
    public final void r(i0 i0Var) {
        HashSet hashSet = this.f6693d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                i0Var.getClass();
                set.remove(i0Var.w());
            }
        }
        if (i0Var != null) {
            this.f6694e.k(i0Var);
        }
    }

    @Override // n0.o
    public final void s(q qVar) {
        this.g.f6699b.s(qVar);
    }

    public final void t() {
        s.i0 i0Var = this.f6694e;
        if (i0Var.h()) {
            HashSet hashSet = this.f6693d;
            if (hashSet != null) {
                Object[] objArr = i0Var.f8320b;
                long[] jArr = i0Var.f8319a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    i0 i0Var2 = (i0) objArr[(i3 << 3) + i11];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(i0Var2.w());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            i0Var.b();
        }
    }
}
