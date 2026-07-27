package A1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import z1.C1372P;

/* renamed from: A1.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051d0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f583e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1372P f584i;

    public /* synthetic */ C0051d0(Function1 function1, C1372P c1372p, int i2) {
        this.f582d = i2;
        this.f583e = function1;
        this.f584i = c1372p;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f582d) {
            case 0:
                this.f583e.invoke(this.f584i.f11837a);
                break;
            default:
                this.f583e.invoke(this.f584i.f11837a);
                break;
        }
        return Unit.f7487a;
    }
}
