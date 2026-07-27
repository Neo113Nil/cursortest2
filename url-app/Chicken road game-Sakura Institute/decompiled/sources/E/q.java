package E;

import kotlin.jvm.functions.Function0;
import l.j0;

/* loaded from: classes.dex */
public final class q extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f2226e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(j0 j0Var, int i2) {
        super(0);
        this.f2225d = i2;
        this.f2226e = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2225d) {
            case 0:
                return Boolean.valueOf(((Number) this.f2226e.f7778p.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) this.f2226e.f7778p.getValue()).floatValue() > 0.0f);
        }
    }
}
