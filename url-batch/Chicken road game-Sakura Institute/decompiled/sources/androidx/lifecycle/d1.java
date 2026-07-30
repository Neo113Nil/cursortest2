package androidx.lifecycle;

import android.view.View;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d1 extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final d1 f957h;

    /* renamed from: i, reason: collision with root package name */
    public static final d1 f958i;

    /* renamed from: j, reason: collision with root package name */
    public static final d1 f959j;

    /* renamed from: k, reason: collision with root package name */
    public static final d1 f960k;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f961g;

    static {
        int i7 = 1;
        f957h = new d1(i7, 0);
        f958i = new d1(i7, 1);
        f959j = new d1(i7, 2);
        f960k = new d1(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i7, int i8) {
        super(i7);
        this.f961g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f961g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = (View) obj;
                r6.k.f(view, "currentView");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View view2 = (View) obj;
                r6.k.f(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof v) {
                    return (v) tag;
                }
                return null;
            case 2:
                View view3 = (View) obj;
                r6.k.f(view3, "view");
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view4 = (View) obj;
                r6.k.f(view4, "view");
                Object tag2 = view4.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof c1) {
                    return (c1) tag2;
                }
                return null;
        }
    }
}
