package a2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(o0 o0Var, int i3) {
        super(1);
        this.f144d = i3;
        this.f145e = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f144d) {
            case 0:
                n0.q((n0) obj, this.f145e);
                break;
            case 1:
                ((n0) obj).h(this.f145e, 0, 0, 0.0f);
                break;
            case 2:
                n0.p((n0) obj, this.f145e, 0, 0);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((n0) obj).h(this.f145e, 0, 0, 0.0f);
                break;
            default:
                ((n0) obj).h(this.f145e, 0, 0, 0.0f);
                break;
        }
        return Unit.f5554a;
    }
}
