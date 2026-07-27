package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: D.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185z0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G.X0 f2125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0185z0(G.X0 x02, int i2) {
        super(1);
        this.f2124d = i2;
        this.f2125e = x02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2124d) {
            case 0:
                ((Z.M) obj).a(((Number) this.f2125e.getValue()).floatValue());
                return Unit.f7487a;
            default:
                return new M0.h(j0.c.g(((M0.b) obj).l(((M0.e) this.f2125e.getValue()).f3545d), 0));
        }
    }
}
