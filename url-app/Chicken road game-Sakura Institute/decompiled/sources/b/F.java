package b;

import android.content.res.Resources;
import android.view.View;
import com.chicken.road.kedro.laqer.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final F f5521e = new F(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final F f5522i = new F(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final F f5523j = new F(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i2, int i4) {
        super(i2);
        this.f5524d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5524d) {
            case 0:
                Resources resources = (Resources) obj;
                Intrinsics.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Object tag = it2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof E) {
                    return (E) tag;
                }
                return null;
        }
    }
}
