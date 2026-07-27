package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e0 extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n.o f130e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f131i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(n.o oVar, a0 a0Var, int i2) {
        super(0);
        this.f129d = i2;
        this.f130e = oVar;
        this.f131i = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f129d) {
            case 0:
                this.f131i.d();
                this.f130e.f8540a.setValue(n.l.f8538a);
                break;
            case 1:
                this.f131i.b(false);
                this.f130e.f8540a.setValue(n.l.f8538a);
                break;
            case 2:
                this.f131i.l();
                this.f130e.f8540a.setValue(n.l.f8538a);
                break;
            default:
                this.f131i.m();
                this.f130e.f8540a.setValue(n.l.f8538a);
                break;
        }
        return Unit.f7487a;
    }
}
