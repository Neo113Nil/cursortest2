package d2;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i3, int i10) {
        super(1);
        this.f3536d = i10;
        this.f3537e = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3536d) {
            case 0:
                return Boolean.valueOf(((i1.t) obj).O(this.f3537e));
            case 1:
                return Boolean.valueOf(((i1.t) obj).O(this.f3537e));
            case 2:
                return Boolean.valueOf(((i1.t) obj).O(this.f3537e));
            default:
                return Boolean.valueOf(((i1.t) obj).I(this.f3537e));
        }
    }
}
