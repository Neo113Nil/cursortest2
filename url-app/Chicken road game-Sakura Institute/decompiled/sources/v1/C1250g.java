package v1;

import M2.p;
import android.view.View;
import com.chicken.road.kedro.laqer.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250g extends p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1250g f10985e = new C1250g(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1250g f10986i = new C1250g(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1250g(int i2, int i4) {
        super(i2);
        this.f10987d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10987d) {
            case 0:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof InterfaceC1249f) {
                    return (InterfaceC1249f) tag;
                }
                return null;
        }
    }
}
