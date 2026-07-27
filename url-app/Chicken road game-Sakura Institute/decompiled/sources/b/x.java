package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class x extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f5592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(D d4, int i2) {
        super(0);
        this.f5591d = i2;
        this.f5592e = d4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5591d) {
            case 0:
                this.f5592e.c();
                break;
            case 1:
                this.f5592e.b();
                break;
            default:
                this.f5592e.c();
                break;
        }
        return Unit.f7487a;
    }
}
