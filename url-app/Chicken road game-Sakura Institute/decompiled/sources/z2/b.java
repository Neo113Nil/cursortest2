package z2;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.chicken.road.whale.RootActivity;
import l1.x;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends x {

    /* renamed from: h, reason: collision with root package name */
    public final a f10068h;

    public b(RootActivity rootActivity) {
        super(22, rootActivity);
        this.f10068h = new a(this, rootActivity);
    }

    @Override // l1.x
    public final void o() {
        RootActivity rootActivity = (RootActivity) this.f5847g;
        Resources.Theme theme = rootActivity.getTheme();
        k.e(theme, "activity.theme");
        r(theme, new TypedValue());
        ((ViewGroup) rootActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f10068h);
    }
}
