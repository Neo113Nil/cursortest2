package w;

import G.InterfaceC0191c0;
import kotlin.Unit;
import p.C0935k;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class g0 extends E2.j implements L2.c {

    /* renamed from: k, reason: collision with root package name */
    public int f11204k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ o.Q f11205l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f11206m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b3.c f11207n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f11208o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0935k f11209p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b3.c cVar, InterfaceC0191c0 interfaceC0191c0, C0935k c0935k, C2.a aVar) {
        super(3, aVar);
        this.f11207n = cVar;
        this.f11208o = interfaceC0191c0;
        this.f11209p = c0935k;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        long j4 = ((Y.c) obj2).f4372a;
        g0 g0Var = new g0(this.f11207n, this.f11208o, this.f11209p, (C2.a) obj3);
        g0Var.f11205l = (o.Q) obj;
        g0Var.f11206m = j4;
        return g0Var.l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11204k;
        b3.c cVar = this.f11207n;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            o.Q q2 = this.f11205l;
            W2.B.m(cVar, null, null, new e0(this.f11208o, this.f11206m, this.f11209p, null), 3);
            this.f11204k = 1;
            obj = q2.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        W2.B.m(cVar, null, null, new f0(this.f11208o, ((Boolean) obj).booleanValue(), this.f11209p, null), 3);
        return Unit.f7487a;
    }
}
