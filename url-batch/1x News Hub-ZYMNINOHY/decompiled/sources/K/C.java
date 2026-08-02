package K;

import b2.C0190d;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class C extends f2.i implements l2.l {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f655e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(N n3, InterfaceC0300c interfaceC0300c) {
        super(1, interfaceC0300c);
        this.f656g = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        Throwable th;
        i0 i0Var;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f;
        N n3 = this.f656g;
        try {
        } catch (Throwable th2) {
            h0 g3 = n3.g();
            this.f655e = th2;
            this.f = 2;
            Integer a3 = g3.a();
            if (a3 != enumC0317a) {
                th = th2;
                obj = a3;
            }
        }
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            this.f = 1;
            obj = N.f(n3, true, this);
            if (obj == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f655e;
                android.support.v4.media.session.a.T(obj);
                i0Var = new b0(th, ((Number) obj).intValue());
                return new C0190d(i0Var, Boolean.TRUE);
            }
            android.support.v4.media.session.a.T(obj);
        }
        i0Var = (i0) obj;
        return new C0190d(i0Var, Boolean.TRUE);
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        return new C(this.f656g, (InterfaceC0300c) obj).g(C0195i.f2555a);
    }
}
