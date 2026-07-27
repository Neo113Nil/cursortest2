package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.C0788n;

/* loaded from: classes.dex */
public final class I extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0788n f29e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(C0788n c0788n, int i2) {
        super(0);
        this.f28d = i2;
        this.f29e = c0788n;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28d) {
            case 0:
                break;
            case 1:
                this.f29e.f7817l = false;
                break;
            default:
                this.f29e.f7817l = false;
                break;
        }
        return Unit.f7487a;
    }
}
