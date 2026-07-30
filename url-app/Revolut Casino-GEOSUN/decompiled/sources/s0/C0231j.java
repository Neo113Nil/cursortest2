package s0;

import M0.InterfaceC0062u;
import android.content.Context;
import java.util.List;
import u0.C0247g;

/* renamed from: s0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231j extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2900i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f2901j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2902k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231j(J j2, List list, w0.d dVar) {
        super(2, dVar);
        this.f2901j = j2;
        this.f2902k = list;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new C0231j(this.f2901j, this.f2902k, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0231j) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2900i;
        if (i2 == 0) {
            o.g.z(obj);
            Context context = this.f2901j.f2872e;
            if (context == null) {
                F0.i.g("context");
                throw null;
            }
            A.j a2 = K.a(context);
            C0230i c0230i = new C0230i(this.f2902k, null);
            this.f2900i = 1;
            obj = a2.e(new G.h(c0230i, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
