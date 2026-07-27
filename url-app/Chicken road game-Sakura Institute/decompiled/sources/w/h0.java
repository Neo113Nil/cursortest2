package w;

import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import o.B0;
import o.C0895k0;
import o.C0910s0;
import o.R0;
import p.C0935k;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class h0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11221k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11222l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b3.c f11223m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f11224n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0935k f11225o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f11226p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(b3.c cVar, InterfaceC0191c0 interfaceC0191c0, C0935k c0935k, InterfaceC0191c0 interfaceC0191c02, C2.a aVar) {
        super(2, aVar);
        this.f11223m = cVar;
        this.f11224n = interfaceC0191c0;
        this.f11225o = c0935k;
        this.f11226p = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((h0) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        h0 h0Var = new h0(this.f11223m, this.f11224n, this.f11225o, this.f11226p, aVar);
        h0Var.f11222l = obj;
        return h0Var;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f11221k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f11222l;
            g0 g0Var = new g0(this.f11223m, this.f11224n, this.f11225o, null);
            C0895k0 c0895k0 = new C0895k0(2, this.f11226p);
            this.f11221k = 1;
            C0910s0 c0910s0 = R0.f8710a;
            Object d4 = W2.B.d(new B0(c0802c, g0Var, c0895k0, new o.Q(c0802c), null), this);
            if (d4 != obj2) {
                d4 = Unit.f7487a;
            }
            if (d4 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
