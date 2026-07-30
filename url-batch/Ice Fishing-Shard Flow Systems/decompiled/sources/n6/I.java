package n6;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class I extends b0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7014m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f7015n;

    public /* synthetic */ I(int i2, Object obj) {
        this.f7014m = i2;
        this.f7015n = obj;
    }

    @Override // n6.b0
    public final boolean j() {
        switch (this.f7014m) {
        }
        return false;
    }

    @Override // n6.b0
    public final void k(Throwable th) {
        int i2 = this.f7014m;
        Object obj = this.f7015n;
        switch (i2) {
            case 0:
                ((H) obj).dispose();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                c0 c0Var = (c0) obj;
                Object obj2 = f0.f7054d.get(i());
                if (!(obj2 instanceof C0784q)) {
                    R5.l lVar = R5.n.f2421d;
                    c0Var.resumeWith(AbstractC0792z.s(obj2));
                    break;
                } else {
                    R5.l lVar2 = R5.n.f2421d;
                    c0Var.resumeWith(V6.b.n(((C0784q) obj2).f7076a));
                    break;
                }
        }
    }
}
