package u;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f9489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f9490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z10, Function0 function0) {
        super(1);
        this.f9489d = z10;
        this.f9490e = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k1.d0 d0Var = (k1.d0) obj;
        boolean z10 = !this.f9489d && ((Boolean) this.f9490e.invoke()).booleanValue();
        if (d0Var.f5311x != z10) {
            d0Var.f5302d |= 16384;
            d0Var.f5311x = z10;
        }
        return Unit.f5554a;
    }
}
