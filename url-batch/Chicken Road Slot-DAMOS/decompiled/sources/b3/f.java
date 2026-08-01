package b3;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends wd.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final f f1060e;

    /* renamed from: i, reason: collision with root package name */
    public static final f f1061i;

    /* renamed from: r, reason: collision with root package name */
    public static final f f1062r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1063d;

    static {
        int i3 = 0;
        f1060e = new f(i3, 0);
        f1061i = new f(i3, 1);
        f1062r = new f(i3, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i3, int i10) {
        super(i3);
        this.f1063d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1063d) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            default:
                return "DEFAULT_TEST_TAG";
        }
    }
}
