package K;

import c3.C0292d;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class A extends h3.g implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f1218a;

    /* renamed from: b, reason: collision with root package name */
    public int f1219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f1220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(M m4, InterfaceC0425c interfaceC0425c) {
        super(1, interfaceC0425c);
        this.f1220c = m4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(InterfaceC0425c interfaceC0425c) {
        return new A(this.f1220c, interfaceC0425c);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        return ((A) create((InterfaceC0425c) obj)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        h0 h0Var;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1219b;
        M m4 = this.f1220c;
        try {
        } catch (Throwable th2) {
            g0 g4 = m4.g();
            this.f1218a = th2;
            this.f1219b = 2;
            Integer a3 = g4.a();
            if (a3 != enumC0441a) {
                th = th2;
                obj = a3;
            }
        }
        if (i4 == 0) {
            O3.l.w(obj);
            this.f1219b = 1;
            obj = M.f(m4, true, this);
            if (obj == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f1218a;
                O3.l.w(obj);
                h0Var = new Z(th, ((Number) obj).intValue());
                return new C0292d(h0Var, Boolean.TRUE);
            }
            O3.l.w(obj);
        }
        h0Var = (h0) obj;
        return new C0292d(h0Var, Boolean.TRUE);
    }
}
