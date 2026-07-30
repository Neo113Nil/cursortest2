package s0;

import D.InterfaceC0008i;
import M0.InterfaceC0062u;
import android.content.Context;
import u0.C0247g;

/* loaded from: classes.dex */
public final class t extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public F0.p f2934i;

    /* renamed from: j, reason: collision with root package name */
    public int f2935j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2936k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f2937l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F0.p f2938m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, J j2, F0.p pVar, w0.d dVar) {
        super(2, dVar);
        this.f2936k = str;
        this.f2937l = j2;
        this.f2938m = pVar;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new t(this.f2936k, this.f2937l, this.f2938m, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((t) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        F0.p pVar;
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2935j;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2936k);
            Context context = this.f2937l.f2872e;
            if (context == null) {
                F0.i.g("context");
                throw null;
            }
            o oVar = new o(((InterfaceC0008i) K.a(context).f30f).j(), dVar, 1);
            F0.p pVar2 = this.f2938m;
            this.f2934i = pVar2;
            this.f2935j = 1;
            Object c2 = P0.r.c(oVar, this);
            if (c2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2934i;
            o.g.z(obj);
        }
        pVar.f324e = obj;
        return C0247g.f3005a;
    }
}
