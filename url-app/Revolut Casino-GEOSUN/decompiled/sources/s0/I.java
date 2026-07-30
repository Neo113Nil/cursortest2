package s0;

import M0.InterfaceC0062u;
import u0.C0247g;

/* loaded from: classes.dex */
public final class I extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f2869j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2870k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2871l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j2, String str, String str2, w0.d dVar) {
        super(2, dVar);
        this.f2869j = j2;
        this.f2870k = str;
        this.f2871l = str2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new I(this.f2869j, this.f2870k, this.f2871l, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((I) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f2868i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f2868i = 1;
            if (J.d(this.f2869j, this.f2870k, this.f2871l, this) == aVar) {
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
