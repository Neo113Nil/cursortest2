package s0;

import M0.InterfaceC0062u;
import android.content.Context;
import u0.C0247g;

/* loaded from: classes.dex */
public final class E extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2853i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2854j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f2855k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f2856l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String str, J j2, double d2, w0.d dVar) {
        super(2, dVar);
        this.f2854j = str;
        this.f2855k = j2;
        this.f2856l = d2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new E(this.f2854j, this.f2855k, this.f2856l, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((E) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2853i;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2854j);
            Context context = this.f2855k.f2872e;
            if (context == null) {
                F0.i.g("context");
                throw null;
            }
            A.j a2 = K.a(context);
            D d2 = new D(dVar, this.f2856l, null);
            this.f2853i = 1;
            if (a2.e(new G.h(d2, null), this) == aVar) {
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
