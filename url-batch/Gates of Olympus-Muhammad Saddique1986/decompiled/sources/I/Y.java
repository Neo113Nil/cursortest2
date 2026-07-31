package I;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import m.C0626k;

/* loaded from: classes.dex */
public final class Y extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2.k f2786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y(int i3, InterfaceC0424c interfaceC0424c) {
        super(1);
        this.f2785e = i3;
        switch (i3) {
            case 1:
                this.f2786f = (f2.k) interfaceC0424c;
                super(1);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                this.f2786f = (f2.k) interfaceC0424c;
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f2786f = (f2.k) interfaceC0424c;
                super(1);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r0v4, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r0v9, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r1v4, types: [e2.e, f2.k] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f2785e) {
            case 0:
                return this.f2786f.n(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                S.i iVar = (S.i) this.f2786f.n((S.n) obj);
                synchronized (S.p.f4241b) {
                    S.p.f4242c = S.p.f4242c.j(iVar.d());
                }
                return iVar;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0626k c0626k = (C0626k) obj;
                Object value = c0626k.f6830e.getValue();
                m.u0 u0Var = m.v0.f6899a;
                this.f2786f.h(value, m.c0.f6743n.n(c0626k.f6831f));
                return R1.y.f4171a;
            default:
                return this.f2786f.n(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y(InterfaceC0426e interfaceC0426e) {
        super(1);
        this.f2785e = 2;
        m.u0 u0Var = m.v0.f6899a;
        this.f2786f = (f2.k) interfaceC0426e;
    }
}
