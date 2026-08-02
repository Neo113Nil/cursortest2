package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aca extends abr {
    public final int a;
    public abs b;
    public final /* synthetic */ DrawerLayout c;
    private final Runnable d = new nc(this, 11);

    public aca(DrawerLayout drawerLayout, int i) {
        this.c = drawerLayout;
        this.a = i;
    }

    @Override // defpackage.abr
    public final int a(View view) {
        if (DrawerLayout.w(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.abr
    public final void b(int i, int i2) {
        int i3 = i & 1;
        DrawerLayout drawerLayout = this.c;
        View d = i3 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (d == null || this.c.b(d) != 0) {
            return;
        }
        this.b.d(d, i2);
    }

    @Override // defpackage.abr
    public final void c(View view, int i) {
        ((abx) view.getLayoutParams()).c = false;
        m();
    }

    @Override // defpackage.abr
    public final void d(int i) {
        this.c.p(i, this.b.k);
    }

    @Override // defpackage.abr
    public final void e(View view, float f, float f2) {
        int width;
        float u = DrawerLayout.u(view);
        DrawerLayout drawerLayout = this.c;
        int width2 = view.getWidth();
        if (drawerLayout.q(view, 3)) {
            width = 0;
            if (f <= 0.0f && (f != 0.0f || u <= 0.5f)) {
                width = -width2;
            }
        } else {
            width = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                width -= width2;
            }
        }
        this.b.h(width, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.abr
    public final boolean f(View view, int i) {
        if (!DrawerLayout.w(view)) {
            return false;
        }
        DrawerLayout drawerLayout = this.c;
        return drawerLayout.q(view, this.a) && drawerLayout.b(view) == 0;
    }

    @Override // defpackage.abr
    public final int g(View view, int i) {
        DrawerLayout drawerLayout = this.c;
        if (drawerLayout.q(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.abr
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.abr
    public final void k() {
        this.c.postDelayed(this.d, 160L);
    }

    @Override // defpackage.abr
    public final void l(View view, int i, int i2) {
        float width = view.getWidth();
        DrawerLayout drawerLayout = this.c;
        float width2 = (drawerLayout.q(view, 3) ? r5 + i : drawerLayout.getWidth() - i) / width;
        drawerLayout.m(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    public final void m() {
        int i = this.a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.c;
        View d = drawerLayout.d(i);
        if (d != null) {
            drawerLayout.i(d, true);
        }
    }

    public final void n() {
        this.c.removeCallbacks(this.d);
    }

    @Override // defpackage.abr
    public final void j() {
    }
}
