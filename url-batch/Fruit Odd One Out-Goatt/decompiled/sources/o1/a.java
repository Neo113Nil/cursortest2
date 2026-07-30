package o1;

import android.app.Activity;
import c1.p;
import f0.l;
import k1.r;
import k1.t;
import m1.j;
import m1.n;
import m1.q;
import o.e;
import t0.g;
import v0.d;
import v0.h;
import w.i;
import x0.f;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1018f;

    /* renamed from: g, reason: collision with root package name */
    public int f1019g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1020h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1021i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1022j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, d dVar, int i2) {
        super(dVar);
        this.f1018f = i2;
        this.f1021i = obj;
        this.f1022j = obj2;
    }

    @Override // x0.b
    public final d e(Object obj, d dVar) {
        switch (this.f1018f) {
            case 0:
                a aVar = new a((n1.d) this.f1021i, (n1.b) this.f1022j, dVar, 0);
                aVar.f1020h = obj;
                return aVar;
            default:
                a aVar2 = new a((w.b) this.f1021i, (Activity) this.f1022j, dVar, 1);
                aVar2.f1020h = obj;
                return aVar2;
        }
    }

    @Override // c1.p
    public final Object g(Object obj, Object obj2) {
        switch (this.f1018f) {
            case 0:
                return ((a) e((r) obj, (d) obj2)).i(g.f1178a);
            default:
                return ((a) e((q) obj, (d) obj2)).i(g.f1178a);
        }
    }

    @Override // x0.b
    public final Object i(Object obj) {
        m1.c nVar;
        switch (this.f1018f) {
            case 0:
                int i2 = this.f1019g;
                g gVar = g.f1178a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        a.a.C(obj);
                        return gVar;
                    }
                    l.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.a.C(obj);
                r rVar = (r) this.f1020h;
                n1.d dVar = (n1.d) this.f1021i;
                n1.b bVar = (n1.b) this.f1022j;
                h hVar = bVar.f943a;
                int i3 = bVar.f944b;
                if (i3 == -3) {
                    i3 = -2;
                }
                int i4 = bVar.f945c;
                p bVar2 = new b(bVar, null);
                if (i3 != -2) {
                    if (i3 != -1) {
                        nVar = i3 != 0 ? i3 != Integer.MAX_VALUE ? i4 == 1 ? new m1.c(i3) : new n(i3, i4) : new m1.c(Integer.MAX_VALUE) : i4 == 1 ? new m1.c(0) : new n(1, i4);
                    } else {
                        if (i4 != 1) {
                            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                        }
                        nVar = new n(1, 2);
                    }
                } else if (i4 == 1) {
                    m1.g.f874a.getClass();
                    nVar = new m1.c(m1.f.f873b);
                } else {
                    nVar = new n(1, i4);
                }
                q qVar = new q(t.e(rVar, hVar), nVar);
                qVar.M(3, qVar, bVar2);
                this.f1019g = 1;
                Object a2 = n1.h.a(dVar, qVar, true, this);
                w0.a aVar = w0.a.f1227b;
                if (a2 != aVar) {
                    a2 = gVar;
                }
                return a2 == aVar ? aVar : gVar;
            default:
                w.b bVar3 = (w.b) this.f1021i;
                int i5 = this.f1019g;
                if (i5 == 0) {
                    a.a.C(obj);
                    q qVar2 = (q) this.f1020h;
                    e0.q qVar3 = new e0.q(1, qVar2);
                    ((x.a) bVar3.f1206c).b((Activity) this.f1022j, new e(), qVar3);
                    i iVar = new i(bVar3, qVar3);
                    this.f1019g = 1;
                    Object a3 = j.a(qVar2, iVar, this);
                    w0.a aVar2 = w0.a.f1227b;
                    if (a3 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        l.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a.a.C(obj);
                }
                return g.f1178a;
        }
    }
}
