package K;

import c3.C0292d;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class B extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f1221a;

    /* renamed from: b, reason: collision with root package name */
    public int f1222b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f1223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(M m4, int i4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1224d = m4;
        this.f1225e = i4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        B b4 = new B(this.f1224d, this.f1225e, interfaceC0425c);
        b4.f1223c = ((Boolean) obj).booleanValue();
        return b4;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((B) create(bool, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i4;
        boolean z;
        h0 h0Var;
        boolean z4;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        boolean z5 = this.f1222b;
        M m4 = this.f1224d;
        try {
        } catch (Throwable th2) {
            if (z5 != 0) {
                g0 g4 = m4.g();
                this.f1221a = th2;
                this.f1223c = z5;
                this.f1222b = 2;
                Integer a3 = g4.a();
                if (a3 != enumC0441a) {
                    z = z5;
                    th = th2;
                    obj = a3;
                }
            } else {
                boolean z6 = z5;
                th = th2;
                i4 = this.f1225e;
                z = z6;
            }
        }
        if (z5 == 0) {
            O3.l.w(obj);
            boolean z7 = this.f1223c;
            this.f1223c = z7;
            this.f1222b = 1;
            obj = M.f(m4, z7, this);
            z5 = z7;
            if (obj == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (z5 != 1) {
                if (z5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.f1223c;
                th = this.f1221a;
                O3.l.w(obj);
                i4 = ((Number) obj).intValue();
                Z z8 = new Z(th, i4);
                z4 = z;
                h0Var = z8;
                return new C0292d(h0Var, Boolean.valueOf(z4));
            }
            boolean z9 = this.f1223c;
            O3.l.w(obj);
            z5 = z9;
        }
        h0Var = (h0) obj;
        z4 = z5;
        return new C0292d(h0Var, Boolean.valueOf(z4));
    }
}
