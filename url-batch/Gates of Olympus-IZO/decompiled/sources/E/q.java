package E;

import I.C0089d;
import I.C0102j0;
import I.X;
import k2.AbstractC0552y;
import k2.C0542n;
import m.AbstractC0595e;
import m.C0593d;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public a0.c f680a;

    /* renamed from: b, reason: collision with root package name */
    public final float f681b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f682c;

    /* renamed from: d, reason: collision with root package name */
    public Float f683d;

    /* renamed from: e, reason: collision with root package name */
    public a0.c f684e;

    /* renamed from: f, reason: collision with root package name */
    public final C0593d f685f = AbstractC0595e.a();

    /* renamed from: g, reason: collision with root package name */
    public final C0593d f686g = AbstractC0595e.a();

    /* renamed from: h, reason: collision with root package name */
    public final C0593d f687h = AbstractC0595e.a();

    /* renamed from: i, reason: collision with root package name */
    public final C0542n f688i;

    /* renamed from: j, reason: collision with root package name */
    public final C0102j0 f689j;

    /* renamed from: k, reason: collision with root package name */
    public final C0102j0 f690k;

    public q(a0.c cVar, float f3, boolean z3) {
        this.f680a = cVar;
        this.f681b = f3;
        this.f682c = z3;
        C0542n c0542n = new C0542n(true);
        c0542n.N(null);
        this.f688i = c0542n;
        Boolean bool = Boolean.FALSE;
        X x3 = X.f2228i;
        this.f689j = C0089d.J(bool, x3);
        this.f690k = C0089d.J(bool, x3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(R1.c cVar) {
        j jVar;
        Q1.a aVar;
        int i3;
        L1.z zVar;
        q qVar;
        Object d3;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i4 = jVar.f667g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jVar.f667g = i4 - Integer.MIN_VALUE;
                Object obj = jVar.f665e;
                aVar = Q1.a.f3113d;
                i3 = jVar.f667g;
                zVar = L1.z.f2729a;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    jVar.f664d = this;
                    jVar.f667g = 1;
                    Object d4 = AbstractC0552y.d(new n(this, null), jVar);
                    if (d4 != aVar) {
                        d4 = zVar;
                    }
                    if (d4 == aVar) {
                        return aVar;
                    }
                    qVar = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                I2.l.Q(obj);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qVar = jVar.f664d;
                        I2.l.Q(obj);
                        jVar.f664d = null;
                        jVar.f667g = 3;
                        qVar.getClass();
                        d3 = AbstractC0552y.d(new p(qVar, null), jVar);
                        if (d3 != aVar) {
                            d3 = zVar;
                        }
                        return d3 == aVar ? aVar : zVar;
                    }
                    qVar = jVar.f664d;
                    I2.l.Q(obj);
                }
                qVar.f689j.setValue(Boolean.TRUE);
                jVar.f664d = qVar;
                jVar.f667g = 2;
                if (qVar.f688i.e0(jVar) == aVar) {
                    return aVar;
                }
                jVar.f664d = null;
                jVar.f667g = 3;
                qVar.getClass();
                d3 = AbstractC0552y.d(new p(qVar, null), jVar);
                if (d3 != aVar) {
                }
                if (d3 == aVar) {
                }
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f665e;
        aVar = Q1.a.f3113d;
        i3 = jVar.f667g;
        zVar = L1.z.f2729a;
        if (i3 != 0) {
        }
        qVar.f689j.setValue(Boolean.TRUE);
        jVar.f664d = qVar;
        jVar.f667g = 2;
        if (qVar.f688i.e0(jVar) == aVar) {
        }
        jVar.f664d = null;
        jVar.f667g = 3;
        qVar.getClass();
        d3 = AbstractC0552y.d(new p(qVar, null), jVar);
        if (d3 != aVar) {
        }
        if (d3 == aVar) {
        }
    }
}
