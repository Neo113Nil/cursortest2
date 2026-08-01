package o0;

import U.g;
import Y.f;
import a.AbstractC0016a;
import d0.p;
import k0.AbstractC0058t;
import k0.r;
import m0.n;
import m0.q;
import n0.h;

/* loaded from: classes.dex */
public final class c extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1113f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.d f1115h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.b f1116i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n0.d dVar, n0.b bVar, W.d dVar2) {
        super(dVar2);
        this.f1115h = dVar;
        this.f1116i = bVar;
    }

    @Override // Y.b
    public final W.d b(Object obj, W.d dVar) {
        c cVar = new c(this.f1115h, this.f1116i, dVar);
        cVar.f1114g = obj;
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
        X.a aVar = X.a.f450b;
        int i2 = this.f1113f;
        g gVar = g.f433a;
        if (i2 == 0) {
            AbstractC0016a.D(obj);
            r rVar = (r) this.f1114g;
            n0.b bVar = this.f1116i;
            int i3 = bVar.f1087c;
            if (i3 == -3) {
                i3 = -2;
            }
            p dVar = new d(bVar, null);
            int i4 = bVar.f1088d;
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
                q qVar = new q(AbstractC0058t.f(rVar, bVar.f1086b), cVar);
                qVar.M(3, qVar, dVar);
                this.f1113f = 1;
                a2 = h.a(this.f1115h, qVar, true, this);
                if (a2 != aVar) {
                    a2 = gVar;
                }
                if (a2 != aVar) {
                    return aVar;
                }
            } else if (i4 == 1) {
                m0.g.f1065a.getClass();
                nVar = new m0.c(m0.f.f1064b, null);
            } else {
                nVar = new n(1, i4, null);
            }
            cVar = nVar;
            q qVar2 = new q(AbstractC0058t.f(rVar, bVar.f1086b), cVar);
            qVar2.M(3, qVar2, dVar);
            this.f1113f = 1;
            a2 = h.a(this.f1115h, qVar2, true, this);
            if (a2 != aVar) {
            }
            if (a2 != aVar) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0016a.D(obj);
        }
        return gVar;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        return ((c) b((r) obj, (W.d) obj2)).c(g.f433a);
    }
}
