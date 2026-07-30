package D;

import a.AbstractC0069a;
import java.util.List;
import u0.C0247g;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f178i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f179j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f180k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(List list, w0.d dVar) {
        super(2, dVar);
        this.f180k = list;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        C0004e c0004e = new C0004e(this.f180k, dVar);
        c0004e.f179j = obj;
        return c0004e;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0004e) b((C0011l) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f178i;
        if (i2 == 0) {
            o.g.z(obj);
            C0011l c0011l = (C0011l) this.f179j;
            this.f178i = 1;
            if (AbstractC0069a.a(this.f180k, c0011l, this) == aVar) {
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
