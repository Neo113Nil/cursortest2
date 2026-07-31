package e7;

import a7.d0;
import a7.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class e implements n {

    /* renamed from: d, reason: collision with root package name */
    public final g6.h f2545d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2546e;

    /* renamed from: f, reason: collision with root package name */
    public final c7.a f2547f;

    public e(g6.h hVar, int i, c7.a aVar) {
        this.f2545d = hVar;
        this.f2546e = i;
        this.f2547f = aVar;
    }

    public String a() {
        return null;
    }

    @Override // e7.n
    public final d7.f b(g6.h hVar, int i, c7.a aVar) {
        g6.h hVar2 = this.f2545d;
        g6.h c8 = hVar.c(hVar2);
        c7.a aVar2 = c7.a.f1760d;
        c7.a aVar3 = this.f2547f;
        int i8 = this.f2546e;
        if (aVar == aVar2) {
            if (i8 != -3) {
                if (i != -3) {
                    if (i8 != -2) {
                        if (i != -2) {
                            i += i8;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i8;
            }
            aVar = aVar3;
        }
        return (q6.i.a(c8, hVar2) && i == i8 && aVar == aVar3) ? this : e(c8, i, aVar);
    }

    public abstract Object d(c7.p pVar, b0.d dVar);

    public abstract e e(g6.h hVar, int i, c7.a aVar);

    public d7.f f() {
        return null;
    }

    public c7.q g(a7.u uVar) {
        int i = this.f2546e;
        if (i == -3) {
            i = -2;
        }
        p6.e dVar = new b0.d(this, (g6.c) null, 3);
        c7.c a8 = c7.j.a(i, this.f2547f, 4);
        g6.h e8 = x.e(uVar.h(), this.f2545d, true);
        h7.e eVar = d0.f249a;
        if (e8 != eVar && e8.l(g6.d.f3045d) == null) {
            e8 = e8.c(eVar);
        }
        c7.o oVar = new c7.o(e8, a8);
        oVar.h0(a7.v.f305f, oVar, dVar);
        return oVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String a8 = a();
        if (a8 != null) {
            arrayList.add(a8);
        }
        g6.i iVar = g6.i.f3046d;
        g6.h hVar = this.f2545d;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i = this.f2546e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        c7.a aVar = c7.a.f1760d;
        c7.a aVar2 = this.f2547f;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + d6.m.W(arrayList, ", ", null, null, null, 62) + ']';
    }
}
