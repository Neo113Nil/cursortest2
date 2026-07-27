package F0;

import A.C0028y;
import A.g0;
import W2.B;
import W2.C0299v;
import W2.s0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final E1.i f2604a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2605b;

    /* renamed from: c, reason: collision with root package name */
    public final y.t f2606c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2607d;

    /* renamed from: e, reason: collision with root package name */
    public final C1294c f2608e;

    public e(E1.i iVar, a aVar) {
        y.t tVar = f.f2609a;
        y.t tVar2 = f.f2609a;
        kotlin.coroutines.i iVar2 = kotlin.coroutines.i.f7498d;
        h hVar = new h();
        X2.d dVar = I0.h.f3371a;
        g gVar = h.f2610a;
        gVar.getClass();
        CoroutineContext s4 = kotlin.coroutines.f.c(dVar, gVar).s(iVar2);
        C0299v key = C0299v.f4296e;
        iVar2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        B.a(s4.s(new s0(null)));
        C1294c c1294c = new C1294c(4);
        this.f2604a = iVar;
        this.f2605b = aVar;
        this.f2606c = tVar;
        this.f2607d = hVar;
        this.f2608e = c1294c;
        new g0(2, this);
    }

    public final t a(s sVar) {
        t tVar;
        y.t tVar2 = this.f2606c;
        C0028y c0028y = new C0028y(this, 6, sVar);
        synchronized (((E1.i) tVar2.f11494e)) {
            tVar = (t) ((E0.b) tVar2.f11495i).a(sVar);
            if (tVar != null) {
                if (!tVar.f2633e) {
                }
            }
            try {
                tVar = (t) c0028y.invoke(new C0028y(tVar2, 7, sVar));
                synchronized (((E1.i) tVar2.f11494e)) {
                    try {
                        if (((E0.b) tVar2.f11495i).a(sVar) == null && tVar.f2633e) {
                            ((E0.b) tVar2.f11495i).b(sVar, tVar);
                        }
                        Unit unit = Unit.f7487a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e4) {
                throw new IllegalStateException("Could not load font", e4);
            }
        }
        return tVar;
    }

    public final t b(r rVar, k kVar, int i2, int i4) {
        p pVar = this.f2605b;
        pVar.getClass();
        k a4 = pVar.a(kVar);
        this.f2604a.getClass();
        return a(new s(rVar, a4, i2, i4, null));
    }
}
