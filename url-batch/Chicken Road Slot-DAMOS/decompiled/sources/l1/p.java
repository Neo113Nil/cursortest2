package l1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f5804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i3) {
        super(1);
        this.f5803d = i3;
        this.f5804e = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5803d) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f5804e.f5814n.a(be.f.a(doubleValue, r10.f5807e, r10.f5808f)));
            default:
                return Double.valueOf(be.f.a(this.f5804e.f5811k.a(((Number) obj).doubleValue()), r10.f5807e, r10.f5808f));
        }
    }
}
