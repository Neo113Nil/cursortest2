package a2;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d1 extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f77d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k[] f78e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(k[] kVarArr, int i3) {
        super(2);
        this.f77d = i3;
        this.f78e = kVarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f77d) {
            case 0:
                return Float.valueOf(q.d((n0) obj, true, this.f78e, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(q.d((n0) obj, false, this.f78e, ((Number) obj2).floatValue()));
        }
    }
}
