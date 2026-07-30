package s0;

import M0.InterfaceC0062u;
import android.content.Context;
import u0.C0247g;

/* loaded from: classes.dex */
public final class B extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2842i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2843j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f2844k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2845l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, J j2, boolean z2, w0.d dVar) {
        super(2, dVar);
        this.f2843j = str;
        this.f2844k = j2;
        this.f2845l = z2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new B(this.f2843j, this.f2844k, this.f2845l, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((B) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2842i;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2843j);
            Context context = this.f2844k.f2872e;
            if (context == null) {
                F0.i.g("context");
                throw null;
            }
            A.j a2 = K.a(context);
            A a3 = new A(dVar, this.f2845l, null);
            this.f2842i = 1;
            if (a2.e(new G.h(a3, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return C0247g.f3005a;
    }
}
