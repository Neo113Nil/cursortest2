package d2;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l1 extends wd.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final l1 f3466e;

    /* renamed from: i, reason: collision with root package name */
    public static final l1 f3467i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3468d;

    static {
        int i3 = 0;
        f3466e = new l1(i3, 0);
        f3467i = new l1(i3, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i3, int i10) {
        super(i3);
        this.f3468d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3468d) {
            case 0:
                return Boolean.FALSE;
            default:
                d1.b("LocalWindowInfo");
                throw null;
        }
    }
}
