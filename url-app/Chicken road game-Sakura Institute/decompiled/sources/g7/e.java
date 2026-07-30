package g7;

import a0.e0;
import c7.g0;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e implements s {

    /* renamed from: f, reason: collision with root package name */
    public final h6.i f4483f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4484g;

    /* renamed from: h, reason: collision with root package name */
    public final e7.a f4485h;

    public e(h6.i iVar, int i7, e7.a aVar) {
        this.f4483f = iVar;
        this.f4484g = i7;
        this.f4485h = aVar;
    }

    @Override // g7.s
    public final f7.f a(h6.i iVar, int i7, e7.a aVar) {
        h6.i iVar2 = this.f4483f;
        h6.i z8 = iVar.z(iVar2);
        e7.a aVar2 = e7.a.f2833f;
        e7.a aVar3 = this.f4485h;
        int i8 = this.f4484g;
        if (aVar == aVar2) {
            if (i8 != -3) {
                if (i7 != -3) {
                    if (i8 != -2) {
                        if (i7 != -2) {
                            i7 += i8;
                            if (i7 < 0) {
                                i7 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i7 = i8;
            }
            aVar = aVar3;
        }
        return (r6.k.a(z8, iVar2) && i7 == i8 && aVar == aVar3) ? this : e(z8, i7, aVar);
    }

    @Override // f7.f
    public Object b(f7.g gVar, h6.d dVar) {
        Object d8 = c7.a0.d(new a0.a0(gVar, this, (h6.d) null, 10), dVar);
        return d8 == i6.a.f4956f ? d8 : d6.z.f2639a;
    }

    public String c() {
        return null;
    }

    public abstract Object d(e7.r rVar, e0 e0Var);

    public abstract e e(h6.i iVar, int i7, e7.a aVar);

    public f7.f f() {
        return null;
    }

    public e7.t g(c7.x xVar) {
        int i7 = this.f4484g;
        if (i7 == -3) {
            i7 = -2;
        }
        q6.e e0Var = new e0(this, (h6.d) null, 12);
        e7.e C = j1.c.C(i7, 4, this.f4485h);
        h6.i g9 = c7.a0.g(xVar.k(), this.f4483f, true);
        j7.e eVar = g0.f1696a;
        if (g9 != eVar && g9.u(h6.e.f4660f) == null) {
            g9 = g9.z(eVar);
        }
        e7.q qVar = new e7.q(g9, C);
        qVar.f0(c7.y.f1758h, qVar, e0Var);
        return qVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c4 = c();
        if (c4 != null) {
            arrayList.add(c4);
        }
        h6.j jVar = h6.j.f4661f;
        h6.i iVar = this.f4483f;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i7 = this.f4484g;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        e7.a aVar = e7.a.f2833f;
        e7.a aVar2 = this.f4485h;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + e6.l.m0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
