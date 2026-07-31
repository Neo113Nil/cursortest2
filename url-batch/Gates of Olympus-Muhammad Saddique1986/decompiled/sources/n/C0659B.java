package n;

import q.C0808d;
import q.C0809e;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import q2.InterfaceC0835w;
import t0.AbstractC0993f;
import t2.InterfaceC1054g;

/* renamed from: n.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659B implements InterfaceC1054g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7023h;

    public /* synthetic */ C0659B(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f7019d = i3;
        this.f7020e = obj;
        this.f7021f = obj2;
        this.f7022g = obj3;
        this.f7023h = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // t2.InterfaceC1054g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, V1.d dVar) {
        u2.l lVar;
        int i3;
        C0659B c0659b;
        switch (this.f7019d) {
            case 0:
                q.i iVar = (q.i) obj;
                boolean z3 = iVar instanceof q.m;
                f2.s sVar = (f2.s) this.f7022g;
                f2.s sVar2 = (f2.s) this.f7021f;
                f2.s sVar3 = (f2.s) this.f7020e;
                boolean z4 = true;
                if (z3) {
                    sVar3.f5830d++;
                } else if (iVar instanceof q.n) {
                    sVar3.f5830d--;
                } else if (iVar instanceof q.l) {
                    sVar3.f5830d--;
                } else if (iVar instanceof q.g) {
                    sVar2.f5830d++;
                } else if (iVar instanceof q.h) {
                    sVar2.f5830d--;
                } else if (iVar instanceof C0808d) {
                    sVar.f5830d++;
                } else if (iVar instanceof C0809e) {
                    sVar.f5830d--;
                }
                boolean z5 = false;
                boolean z6 = sVar3.f5830d > 0;
                boolean z7 = sVar2.f5830d > 0;
                boolean z8 = sVar.f5830d > 0;
                C0661D c0661d = (C0661D) this.f7023h;
                if (c0661d.f7027r != z6) {
                    c0661d.f7027r = z6;
                    z5 = true;
                }
                if (c0661d.f7028s != z7) {
                    c0661d.f7028s = z7;
                    z5 = true;
                }
                if (c0661d.f7029t != z8) {
                    c0661d.f7029t = z8;
                } else {
                    z4 = z5;
                }
                if (z4) {
                    AbstractC0993f.m(c0661d);
                }
                return R1.y.f4171a;
            case 1:
                if (dVar instanceof u2.l) {
                    lVar = (u2.l) dVar;
                    int i4 = lVar.f9706k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        lVar.f9706k = i4 - Integer.MIN_VALUE;
                        Object obj2 = lVar.f9704i;
                        W1.a aVar = W1.a.f4608d;
                        i3 = lVar.f9706k;
                        if (i3 != 0) {
                            R1.a.e(obj2);
                            q2.X x3 = (q2.X) ((f2.u) this.f7020e).f5832d;
                            if (x3 != null) {
                                x3.a(new u2.o("Child of the scoped flow was cancelled"));
                                lVar.f9702g = this;
                                lVar.f9703h = obj;
                                lVar.f9706k = 1;
                                if (x3.r(lVar) == aVar) {
                                    return aVar;
                                }
                            }
                            c0659b = this;
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = lVar.f9703h;
                            c0659b = lVar.f9702g;
                            R1.a.e(obj2);
                        }
                        ((f2.u) c0659b.f7020e).f5832d = AbstractC0837y.r((InterfaceC0835w) c0659b.f7021f, null, EnumC0836x.f7937g, new u2.k((u2.n) c0659b.f7022g, (InterfaceC1054g) c0659b.f7023h, obj, null), 1);
                        return R1.y.f4171a;
                    }
                }
                lVar = new u2.l(this, dVar);
                Object obj22 = lVar.f9704i;
                W1.a aVar2 = W1.a.f4608d;
                i3 = lVar.f9706k;
                if (i3 != 0) {
                }
                ((f2.u) c0659b.f7020e).f5832d = AbstractC0837y.r((InterfaceC0835w) c0659b.f7021f, null, EnumC0836x.f7937g, new u2.k((u2.n) c0659b.f7022g, (InterfaceC1054g) c0659b.f7023h, obj, null), 1);
                return R1.y.f4171a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x.Q q3 = (x.Q) this.f7020e;
                if (booleanValue && q3.b()) {
                    B.a0 a0Var = (B.a0) this.f7022g;
                    x.N.j((I0.A) this.f7021f, q3, a0Var.j(), (I0.m) this.f7023h, a0Var.f343b);
                } else {
                    x.N.g(q3);
                }
                return R1.y.f4171a;
        }
    }
}
