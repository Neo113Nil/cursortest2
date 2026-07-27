package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q0.InterfaceC1050c;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1061b extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1062c f9772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1061b(C1062c c1062c, int i2) {
        super(0);
        this.f9771d = i2;
        this.f9772e = c1062c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9771d) {
            case 0:
                this.f9772e.D0();
                break;
            default:
                C1062c c1062c = this.f9772e;
                S.m mVar = c1062c.f9774t;
                Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC1050c) mVar).k(c1062c);
                break;
        }
        return Unit.f7487a;
    }
}
