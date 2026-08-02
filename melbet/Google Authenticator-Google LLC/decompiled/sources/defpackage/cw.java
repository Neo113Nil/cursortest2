package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cw implements abw {
    public final boolean a = true;
    private final ct b;
    private final DrawerLayout c;
    private final eo d;
    private final int e;
    private final int f;

    public cw(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout) {
        if (toolbar != null) {
            this.b = new cv(toolbar);
            toolbar.r(new cx(this, 1));
        } else {
            this.b = activity instanceof di ? new dn((dy) ((di) activity).i()) : new cu(activity);
        }
        this.c = drawerLayout;
        this.e = R.string.nav_open;
        this.f = R.string.nav_close;
        this.d = new eo(this.b.a());
        this.b.c();
    }

    private final void g(float f) {
        if (f == 1.0f) {
            this.d.c(true);
        } else if (f == 0.0f) {
            this.d.c(false);
        }
        this.d.b(f);
    }

    @Override // defpackage.abw
    public final void a(View view) {
        g(0.0f);
        d(this.e);
    }

    @Override // defpackage.abw
    public final void b(View view) {
        g(1.0f);
        d(this.f);
    }

    @Override // defpackage.abw
    public final void c(View view, float f) {
        g(Math.min(1.0f, Math.max(0.0f, f)));
    }

    final void d(int i) {
        this.b.b(i);
    }

    public final void e() {
        DrawerLayout drawerLayout = this.c;
        int a = drawerLayout.a(8388611);
        View d = drawerLayout.d(8388611);
        if (d == null || !drawerLayout.s(d)) {
            if (a == 1) {
                return;
            }
        } else if (a != 2) {
            drawerLayout.t();
            return;
        }
        View d2 = drawerLayout.d(8388611);
        if (d2 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity ".concat(String.valueOf(DrawerLayout.g(8388611))));
        }
        drawerLayout.x(d2);
    }

    @Override // defpackage.abw
    public final void f() {
    }
}
