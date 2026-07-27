package E;

import Z.M;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.j0;

/* loaded from: classes.dex */
public final class n extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f2215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(j0 j0Var, int i2) {
        super(1);
        this.f2214d = i2;
        this.f2215e = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2214d) {
            case 0:
                ((M) obj).a(((Number) this.f2215e.f7778p.getValue()).floatValue());
                break;
            case 1:
                ((M) obj).a(((Number) this.f2215e.f7778p.getValue()).floatValue());
                break;
            default:
                ((M) obj).a(((Number) this.f2215e.f7778p.getValue()).floatValue());
                break;
        }
        return Unit.f7487a;
    }
}
