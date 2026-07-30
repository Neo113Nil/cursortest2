package s0;

import M0.InterfaceC0062u;
import android.content.Context;
import u0.C0247g;

/* loaded from: classes.dex */
public final class H extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2865j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f2866k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2867l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(String str, J j2, long j3, w0.d dVar) {
        super(2, dVar);
        this.f2865j = str;
        this.f2866k = j2;
        this.f2867l = j3;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new H(this.f2865j, this.f2866k, this.f2867l, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((H) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2864i;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2865j);
            Context context = this.f2866k.f2872e;
            if (context == null) {
                F0.i.g("context");
                throw null;
            }
            A.j a2 = K.a(context);
            G g2 = new G(dVar, this.f2867l, null);
            this.f2864i = 1;
            if (a2.e(new G.h(g2, null), this) == aVar) {
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
