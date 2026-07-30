package z2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import b2.l;
import com.chicken.road.whale.RootActivity;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RootActivity f10067f;

    public a(b bVar, RootActivity rootActivity) {
        this.f10067f = rootActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        if (l.w(view2)) {
            SplashScreenView l8 = l.l(view2);
            k.f(l8, "child");
            build = z0.b.f().build();
            k.e(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = l8.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.f10067f.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
