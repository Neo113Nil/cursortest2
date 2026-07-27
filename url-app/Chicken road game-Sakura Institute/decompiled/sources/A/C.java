package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l0.AbstractC0819q;

/* loaded from: classes.dex */
public final class C extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w.Y f10e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(w.Y y4, int i2) {
        super(1);
        this.f9d = i2;
        this.f10e = y4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9d) {
            case 0:
                l0.s sVar = (l0.s) obj;
                this.f10e.d(AbstractC0819q.h(sVar, false));
                sVar.a();
                break;
            default:
                this.f10e.c(((Y.c) obj).f4372a);
                break;
        }
        return Unit.f7487a;
    }
}
