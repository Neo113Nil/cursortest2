package x3;

import android.view.View;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import r6.k;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final g f9681h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f9682i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9683g;

    static {
        int i7 = 1;
        f9681h = new g(i7, 0);
        f9682i = new g(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, int i8) {
        super(i7);
        this.f9683g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f9683g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = (View) obj;
                k.f(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                k.f(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof f) {
                    return (f) tag;
                }
                return null;
        }
    }
}
