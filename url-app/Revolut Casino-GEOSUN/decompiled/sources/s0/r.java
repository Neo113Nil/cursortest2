package s0;

import D.InterfaceC0008i;
import L.C0026b;
import M0.InterfaceC0062u;
import android.content.Context;
import u0.C0247g;

/* loaded from: classes.dex */
public final class r extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public F0.p f2926i;

    /* renamed from: j, reason: collision with root package name */
    public int f2927j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2928k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f2929l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F0.p f2930m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, J j2, F0.p pVar, w0.d dVar) {
        super(2, dVar);
        this.f2928k = str;
        this.f2929l = j2;
        this.f2930m = pVar;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new r(this.f2928k, this.f2929l, this.f2930m, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((r) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        F0.p pVar;
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2927j;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2928k);
            J j2 = this.f2929l;
            Context context = j2.f2872e;
            if (context == null) {
                F0.i.g("context");
                throw null;
            }
            C0026b c0026b = new C0026b(((InterfaceC0008i) K.a(context).f30f).j(), dVar, j2, 10);
            F0.p pVar2 = this.f2930m;
            this.f2926i = pVar2;
            this.f2927j = 1;
            Object c2 = P0.r.c(c0026b, this);
            if (c2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2926i;
            o.g.z(obj);
        }
        pVar.f324e = obj;
        return C0247g.f3005a;
    }
}
