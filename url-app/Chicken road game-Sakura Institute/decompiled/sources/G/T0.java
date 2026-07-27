package G;

import i.C0661B;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class T0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0661B f2761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T0(C0661B c0661b, int i2) {
        super(1);
        this.f2760d = i2;
        this.f2761e = c0661b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2760d) {
            case 0:
                if (obj instanceof Q.E) {
                    ((Q.E) obj).c(4);
                }
                this.f2761e.a(obj);
                return Unit.f7487a;
            default:
                return obj == this.f2761e ? "(this)" : String.valueOf(obj);
        }
    }
}
