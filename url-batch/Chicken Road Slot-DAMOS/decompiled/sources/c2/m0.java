package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f1613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1614e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1615i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s1 f1616r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, long j, long j3, s1 s1Var) {
        super(0);
        this.f1613d = o0Var;
        this.f1614e = j;
        this.f1615i = j3;
        this.f1616r = s1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o0 o0Var = this.f1613d;
        o0Var.o0().f1608d = false;
        o0Var.o0().f1609e = this.f1614e;
        o0Var.o0().f1610i = this.f1615i;
        Function1 d10 = this.f1616r.f1668d.d();
        if (d10 != null) {
            d10.invoke(o0Var.o0());
        }
        return Unit.f5554a;
    }
}
