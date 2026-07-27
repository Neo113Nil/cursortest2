package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class U extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f11089e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(Y y4, int i2) {
        super(0);
        this.f11088d = i2;
        this.f11089e = y4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11088d) {
            case 0:
                this.f11089e.a();
                break;
            default:
                this.f11089e.onCancel();
                break;
        }
        return Unit.f7487a;
    }
}
