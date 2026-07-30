package c0;

import c7.a0;
import d6.z;
import g0.g1;
import g0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public y0.c f1468a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1469b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1470c;

    /* renamed from: d, reason: collision with root package name */
    public Float f1471d;

    /* renamed from: e, reason: collision with root package name */
    public y0.c f1472e;

    /* renamed from: f, reason: collision with root package name */
    public final l.d f1473f = l.e.a();

    /* renamed from: g, reason: collision with root package name */
    public final l.d f1474g = l.e.a();

    /* renamed from: h, reason: collision with root package name */
    public final l.d f1475h = l.e.a();

    /* renamed from: i, reason: collision with root package name */
    public final c7.n f1476i;

    /* renamed from: j, reason: collision with root package name */
    public final g1 f1477j;

    /* renamed from: k, reason: collision with root package name */
    public final g1 f1478k;

    public j(y0.c cVar, float f9, boolean z8) {
        this.f1468a = cVar;
        this.f1469b = f9;
        this.f1470c = z8;
        c7.n nVar = new c7.n(true);
        nVar.K(null);
        this.f1476i = nVar;
        Boolean bool = Boolean.FALSE;
        t0 t0Var = t0.f3903k;
        this.f1477j = g0.d.J(bool, t0Var);
        this.f1478k = g0.d.J(bool, t0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r9.d0(r0) != r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j6.c cVar) {
        g gVar;
        int i7;
        j jVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i8 = gVar.f1461i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f1461i = i8 - Integer.MIN_VALUE;
                Object obj = gVar.f1459g;
                i7 = gVar.f1461i;
                z zVar = z.f2639a;
                h6.d dVar = null;
                i6.a aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    gVar.f1458f = this;
                    gVar.f1461i = 1;
                    Object d8 = a0.d(new i(this, dVar, 0), gVar);
                    if (d8 != aVar) {
                        d8 = zVar;
                    }
                    if (d8 != aVar) {
                        jVar = this;
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return zVar;
                    }
                    jVar = gVar.f1458f;
                    d6.a.e(obj);
                    gVar.f1458f = null;
                    gVar.f1461i = 3;
                    jVar.getClass();
                    Object d9 = a0.d(new i(jVar, dVar, 1), gVar);
                    if (d9 != aVar) {
                        d9 = zVar;
                    }
                    return d9 == aVar ? aVar : zVar;
                }
                jVar = gVar.f1458f;
                d6.a.e(obj);
                jVar.f1477j.setValue(Boolean.TRUE);
                c7.n nVar = jVar.f1476i;
                gVar.f1458f = jVar;
                gVar.f1461i = 2;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f1459g;
        i7 = gVar.f1461i;
        z zVar2 = z.f2639a;
        h6.d dVar2 = null;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 != 0) {
        }
        jVar.f1477j.setValue(Boolean.TRUE);
        c7.n nVar2 = jVar.f1476i;
        gVar.f1458f = jVar;
        gVar.f1461i = 2;
    }
}
