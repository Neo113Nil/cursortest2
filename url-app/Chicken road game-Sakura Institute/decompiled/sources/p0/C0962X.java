package p0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: p0.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962X extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0963Y f9025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0962X(C0963Y c0963y, int i2) {
        super(2);
        this.f9024d = i2;
        this.f9025e = c0963y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f9024d) {
            case 0:
                this.f9025e.a().f8979e = (G.r) obj2;
                break;
            case 1:
                C0941B a4 = this.f9025e.a();
                ((r0.E) obj).Y(new C0989y(a4, (Function2) obj2, a4.f8993v));
                break;
            default:
                r0.E e4 = (r0.E) obj;
                C0941B c0941b = e4.f9585D;
                C0963Y c0963y = this.f9025e;
                if (c0941b == null) {
                    c0941b = new C0941B(e4, c0963y.f9026a);
                    e4.f9585D = c0941b;
                }
                c0963y.f9027b = c0941b;
                c0963y.a().e();
                C0941B a5 = c0963y.a();
                b0 b0Var = a5.f8980i;
                b0 b0Var2 = c0963y.f9026a;
                if (b0Var != b0Var2) {
                    a5.f8980i = b0Var2;
                    a5.f(false);
                    r0.E.T(a5.f8978d, false, 7);
                }
                break;
        }
        return Unit.f7487a;
    }
}
