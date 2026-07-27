package androidx.lifecycle;

import android.view.View;
import com.chicken.road.kedro.laqer.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f5463e = new a0(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final a0 f5464i = new a0(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f5465j = new a0(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f5466k = new a0(1, 3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i2, int i4) {
        super(i2);
        this.f5467d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5467d) {
            case 0:
                View currentView = (View) obj;
                Intrinsics.checkNotNullParameter(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View viewParent = (View) obj;
                Intrinsics.checkNotNullParameter(viewParent, "viewParent");
                Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC0481v) {
                    return (InterfaceC0481v) tag;
                }
                return null;
            case 2:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view2 = (View) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Object tag2 = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof Z) {
                    return (Z) tag2;
                }
                return null;
        }
    }
}
