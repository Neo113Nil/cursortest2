package m;

import I.C0156j0;
import R0.C0212a;
import android.os.Bundle;
import e2.InterfaceC0424c;
import p.C0775m;
import p.C0784q0;
import r0.C0901X;
import t.C0971A;
import t1.C1013A;
import t1.C1028h;
import x.C1199l;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616a extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6711h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6712i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0616a(f2.q qVar, C1013A c1013a, t1.u uVar, Bundle bundle) {
        super(1);
        this.f6708e = 3;
        this.f6712i = qVar;
        this.f6709f = c1013a;
        this.f6710g = uVar;
        this.f6711h = bundle;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r8v3, types: [e2.a, f2.k] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6708e) {
            case 0:
                C0626k c0626k = (C0626k) obj;
                C0619d c0619d = (C0619d) this.f6709f;
                AbstractC0620e.k(c0626k, c0619d.f6759c);
                C0156j0 c0156j0 = c0626k.f6830e;
                Object a3 = C0619d.a(c0619d, c0156j0.getValue());
                boolean a4 = f2.j.a(a3, c0156j0.getValue());
                InterfaceC0424c interfaceC0424c = (InterfaceC0424c) this.f6711h;
                if (!a4) {
                    c0619d.f6759c.f6849e.setValue(a3);
                    ((C0628m) this.f6710g).f6849e.setValue(a3);
                    if (interfaceC0424c != null) {
                        interfaceC0424c.n(c0619d);
                    }
                    c0626k.f6834i.setValue(Boolean.FALSE);
                    c0626k.f6829d.b();
                    ((f2.q) this.f6712i).f5828d = true;
                } else if (interfaceC0424c != null) {
                    interfaceC0424c.n(c0619d);
                }
                return R1.y.f4171a;
            case 1:
                C0626k c0626k2 = (C0626k) obj;
                float floatValue = ((Number) c0626k2.f6830e.getValue()).floatValue();
                f2.r rVar = (f2.r) this.f6709f;
                float f3 = floatValue - rVar.f5829d;
                float a5 = ((C0784q0) this.f6710g).a(f3);
                rVar.f5829d = ((Number) c0626k2.f6830e.getValue()).floatValue();
                ((f2.r) this.f6711h).f5829d = ((Number) c0626k2.f6826a.f6890b.n(c0626k2.f6831f)).floatValue();
                if (Math.abs(f3 - a5) > 0.5f) {
                    c0626k2.f6834i.setValue(Boolean.FALSE);
                    c0626k2.f6829d.b();
                }
                ((C0775m) this.f6712i).getClass();
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                G1.m mVar = new G1.m((t.r) this.f6710g, (C0901X) this.f6711h, (t.L) this.f6712i, 15);
                C0971A c0971a = (C0971A) this.f6709f;
                c0971a.f8421c = mVar;
                return new C0212a(4, c0971a);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C1028h c1028h = (C1028h) obj;
                f2.j.f(c1028h, "it");
                ((f2.q) this.f6712i).f5828d = true;
                S1.u uVar = S1.u.f4320d;
                ((C1013A) this.f6709f).a((t1.u) this.f6710g, (Bundle) this.f6711h, c1028h, uVar);
                return R1.y.f4171a;
            default:
                x.Q q3 = (x.Q) this.f6709f;
                if (q3.b()) {
                    f2.u uVar2 = new f2.u();
                    R.h hVar = new R.h(q3.f9978d, q3.f9994t, uVar2, 14);
                    I0.A a6 = (I0.A) this.f6710g;
                    I0.u uVar3 = a6.f3005a;
                    uVar3.d((I0.z) this.f6711h, (I0.m) this.f6712i, hVar, q3.f9995u);
                    I0.F f4 = new I0.F(a6, uVar3);
                    a6.f3006b.set(f4);
                    uVar2.f5832d = f4;
                    q3.f9979e = f4;
                }
                return new C1199l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0616a(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        super(1);
        this.f6708e = i3;
        this.f6709f = obj;
        this.f6710g = obj2;
        this.f6711h = obj3;
        this.f6712i = obj4;
    }
}
