package o0;

import U.g;
import Y.f;
import d0.p;
import k0.AbstractC0060t;
import k0.r;
import m0.n;
import m0.q;
import n0.h;

/* loaded from: classes.dex */
public final class c extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1116f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.d f1118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.b f1119i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n0.d dVar, n0.b bVar, W.d dVar2) {
        super(dVar2);
        this.f1118h = dVar;
        this.f1119i = bVar;
    }

    @Override // Y.b
    public final W.d b(Object obj, W.d dVar) {
        c cVar = new c(this.f1118h, this.f1119i, dVar);
        cVar.f1117g = obj;
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[RETURN] */
    @Override // Y.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        m0.c nVar;
        m0.c cVar;
        Object a2;
        X.a aVar = X.a.f395b;
        int i2 = this.f1116f;
        g gVar = g.f378a;
        if (i2 == 0) {
            a.a.B(obj);
            r rVar = (r) this.f1117g;
            n0.b bVar = this.f1119i;
            int i3 = bVar.f1085c;
            if (i3 == -3) {
                i3 = -2;
            }
            p dVar = new d(bVar, null);
            int i4 = bVar.f1086d;
            if (i3 != -2) {
                if (i3 != -1) {
                    if (i3 == 0) {
                        nVar = i4 == 1 ? new m0.c(0, null) : new n(1, i4, null);
                    } else if (i3 != Integer.MAX_VALUE) {
                        cVar = i4 == 1 ? new m0.c(i3, null) : new n(i3, i4, null);
                    } else {
                        nVar = new m0.c(Integer.MAX_VALUE, null);
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                    }
                    cVar = new n(1, 2, null);
                }
                q qVar = new q(AbstractC0060t.f(rVar, bVar.f1084b), cVar);
                qVar.M(3, qVar, dVar);
                this.f1116f = 1;
                a2 = h.a(this.f1118h, qVar, true, this);
                if (a2 != aVar) {
                    a2 = gVar;
                }
                if (a2 != aVar) {
                    return aVar;
                }
            } else if (i4 == 1) {
                m0.g.f1022a.getClass();
                nVar = new m0.c(m0.f.f1021b, null);
            } else {
                nVar = new n(1, i4, null);
            }
            cVar = nVar;
            q qVar2 = new q(AbstractC0060t.f(rVar, bVar.f1084b), cVar);
            qVar2.M(3, qVar2, dVar);
            this.f1116f = 1;
            a2 = h.a(this.f1118h, qVar2, true, this);
            if (a2 != aVar) {
            }
            if (a2 != aVar) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a.B(obj);
        }
        return gVar;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        return ((c) b((r) obj, (W.d) obj2)).c(g.f378a);
    }
}
