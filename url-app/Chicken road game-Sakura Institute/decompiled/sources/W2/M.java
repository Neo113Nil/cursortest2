package W2;

import kotlin.jvm.functions.Function1;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class M extends g0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4227k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4228l;

    public /* synthetic */ M(int i2, Object obj) {
        this.f4227k = i2;
        this.f4228l = obj;
    }

    @Override // W2.g0
    public final boolean k() {
        switch (this.f4227k) {
        }
        return false;
    }

    @Override // W2.g0
    public final void l(Throwable th) {
        Object obj = this.f4228l;
        switch (this.f4227k) {
            case 0:
                ((L) obj).a();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                Object obj2 = k0.f4279d.get(j());
                h0 h0Var = (h0) obj;
                if (!(obj2 instanceof C0294p)) {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    h0Var.u(B.p(obj2));
                    break;
                } else {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    h0Var.u(AbstractC1343r.a(((C0294p) obj2).f4291a));
                    break;
                }
        }
    }
}
