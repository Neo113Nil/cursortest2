package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(t tVar, int i2) {
        super(0);
        this.f4355d = i2;
        this.f4356e = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4355d) {
            case 0:
                this.f4356e.B0();
                break;
            default:
                t tVar = this.f4356e;
                if (tVar.f3978d.f3990s) {
                    d.A(tVar);
                }
                break;
        }
        return Unit.f7487a;
    }
}
