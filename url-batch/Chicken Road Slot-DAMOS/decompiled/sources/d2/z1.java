package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z1 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f3607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2 f3608e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a2.r f3609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a aVar, a2 a2Var, a2.r rVar) {
        super(0);
        this.f3607d = aVar;
        this.f3608e = a2Var;
        this.f3609i = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a2 a2Var = this.f3608e;
        a aVar = this.f3607d;
        aVar.removeOnAttachStateChangeListener(a2Var);
        k7.e.u(aVar).f9608a.remove(this.f3609i);
        return Unit.f5554a;
    }
}
