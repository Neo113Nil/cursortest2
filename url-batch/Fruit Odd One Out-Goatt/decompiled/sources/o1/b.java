package o1;

import c1.p;
import f0.l;
import k1.r;
import m1.q;
import t0.g;
import v0.d;
import x0.f;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1023f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1024g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n1.c cVar, k.a aVar, d dVar) {
        super(dVar);
        this.f1025h = cVar;
        this.f1026i = aVar;
    }

    @Override // x0.b
    public final d e(Object obj, d dVar) {
        switch (this.f1023f) {
            case 0:
                b bVar = new b((n1.b) this.f1026i, dVar);
                bVar.f1025h = obj;
                return bVar;
            default:
                return new b((n1.c) this.f1025h, (k.a) this.f1026i, dVar);
        }
    }

    @Override // c1.p
    public final Object g(Object obj, Object obj2) {
        switch (this.f1023f) {
            case 0:
                return ((b) e((q) obj, (d) obj2)).i(g.f1178a);
            default:
                return ((b) e((r) obj, (d) obj2)).i(g.f1178a);
        }
    }

    @Override // x0.b
    public final Object i(Object obj) {
        switch (this.f1023f) {
            case 0:
                int i2 = this.f1024g;
                if (i2 == 0) {
                    a.a.C(obj);
                    q qVar = (q) this.f1025h;
                    n1.b bVar = (n1.b) this.f1026i;
                    this.f1024g = 1;
                    Object b2 = bVar.b(qVar, this);
                    w0.a aVar = w0.a.f1227b;
                    if (b2 == aVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    l.b("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    a.a.C(obj);
                }
                break;
            default:
                int i3 = this.f1024g;
                if (i3 == 0) {
                    a.a.C(obj);
                    n1.c cVar = (n1.c) this.f1025h;
                    o0.a aVar2 = new o0.a(3, (k.a) this.f1026i);
                    this.f1024g = 1;
                    Object a2 = cVar.a(aVar2, this);
                    w0.a aVar3 = w0.a.f1227b;
                    if (a2 == aVar3) {
                        break;
                    }
                } else if (i3 != 1) {
                    l.b("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    a.a.C(obj);
                }
                break;
        }
        return g.f1178a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n1.b bVar, d dVar) {
        super(dVar);
        this.f1026i = bVar;
    }
}
