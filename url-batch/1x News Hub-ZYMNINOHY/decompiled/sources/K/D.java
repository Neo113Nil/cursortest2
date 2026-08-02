package K;

import b2.C0190d;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class D extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f657e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f658g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f659h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f660i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(N n3, int i3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f659h = n3;
        this.f660i = i3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        D d3 = new D(this.f659h, this.f660i, interfaceC0300c);
        d3.f658g = ((Boolean) obj).booleanValue();
        return d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        Throwable th;
        int i3;
        boolean z;
        i0 i0Var;
        boolean z2;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        boolean z3 = this.f;
        N n3 = this.f659h;
        try {
        } catch (Throwable th2) {
            if (z3 != 0) {
                h0 g3 = n3.g();
                this.f657e = th2;
                this.f658g = z3;
                this.f = 2;
                Integer a3 = g3.a();
                if (a3 != enumC0317a) {
                    z = z3;
                    th = th2;
                    obj = a3;
                }
            } else {
                boolean z4 = z3;
                th = th2;
                i3 = this.f660i;
                z = z4;
            }
        }
        if (z3 == 0) {
            android.support.v4.media.session.a.T(obj);
            boolean z5 = this.f658g;
            this.f658g = z5;
            this.f = 1;
            obj = N.f(n3, z5, this);
            z3 = z5;
            if (obj == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (z3 != 1) {
                if (z3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.f658g;
                th = this.f657e;
                android.support.v4.media.session.a.T(obj);
                i3 = ((Number) obj).intValue();
                b0 b0Var = new b0(th, i3);
                z2 = z;
                i0Var = b0Var;
                return new C0190d(i0Var, Boolean.valueOf(z2));
            }
            boolean z6 = this.f658g;
            android.support.v4.media.session.a.T(obj);
            z3 = z6;
        }
        i0Var = (i0) obj;
        z2 = z3;
        return new C0190d(i0Var, Boolean.valueOf(z2));
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((D) b((InterfaceC0300c) obj2, bool)).g(C0195i.f2555a);
    }
}
