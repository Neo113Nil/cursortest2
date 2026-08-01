package q1;

import android.graphics.PathMeasure;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends wd.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final g f7866e;

    /* renamed from: i, reason: collision with root package name */
    public static final g f7867i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7868d;

    static {
        int i3 = 0;
        f7866e = new g(i3, 0);
        f7867i = new g(i3, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i10) {
        super(i3);
        this.f7868d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7868d) {
            case 0:
                return new k1.h(new PathMeasure());
            default:
                return Unit.f5554a;
        }
    }
}
