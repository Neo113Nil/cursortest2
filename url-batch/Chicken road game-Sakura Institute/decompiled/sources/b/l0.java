package b;

import android.content.res.Resources;
import android.view.View;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final l0 f1179h;

    /* renamed from: i, reason: collision with root package name */
    public static final l0 f1180i;

    /* renamed from: j, reason: collision with root package name */
    public static final l0 f1181j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1182g;

    static {
        int i7 = 1;
        f1179h = new l0(i7, 0);
        f1180i = new l0(i7, 1);
        f1181j = new l0(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i7, int i8) {
        super(i7);
        this.f1182g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f1182g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Resources resources = (Resources) obj;
                r6.k.f(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View view = (View) obj;
                r6.k.f(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                r6.k.f(view2, "it");
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof k0) {
                    return (k0) tag;
                }
                return null;
        }
    }
}
