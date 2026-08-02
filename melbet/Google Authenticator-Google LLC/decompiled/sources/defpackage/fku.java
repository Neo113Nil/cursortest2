package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fku extends abz {
    final /* synthetic */ NavigationView a;
    private WeakReference b = null;

    public fku(NavigationView navigationView) {
        this.a = navigationView;
    }

    private final void e() {
        Activity a;
        if (this.b == null) {
            NavigationView navigationView = this.a;
            View view = null;
            if (!navigationView.hasFocus() && (a = fik.a(navigationView.getContext())) != null) {
                view = a.getCurrentFocus();
            }
            this.b = new WeakReference(view);
        }
    }

    private static final boolean g(View view) {
        return view.isAttachedToWindow() && !view.isInTouchMode();
    }

    @Override // defpackage.abz, defpackage.abw
    public final void a(View view) {
        WeakReference weakReference;
        if (view == this.a && (weakReference = this.b) != null) {
            View view2 = (View) weakReference.get();
            if (view2 == null || !g(view2)) {
                d();
            } else {
                view2.requestFocus();
                d();
            }
        }
    }

    @Override // defpackage.abz, defpackage.abw
    public final void b(View view) {
        if (view != this.a) {
            return;
        }
        e();
        if (g(view)) {
            view.requestFocus();
        }
    }

    @Override // defpackage.abz, defpackage.abw
    public final void c(View view, float f) {
        if (view != this.a) {
            return;
        }
        if ((view.getParent() instanceof DrawerLayout) && ((DrawerLayout) view.getParent()).r(view)) {
            return;
        }
        e();
    }

    public final void d() {
        this.b = null;
    }
}
