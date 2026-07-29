package android.support.v7.app;

import android.support.v4.widget.DrawerLayout;
import android.view.View;

/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: a, reason: collision with root package name */
    boolean f1565a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1566b;

    /* renamed from: c, reason: collision with root package name */
    private android.support.v7.b.a.b f1567c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1568d;
    private final int e;
    private final int f;

    public interface a {
        void a(int i);
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        if (this.f1568d) {
            a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            a(0.0f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        a(1.0f);
        if (this.f1565a) {
            a(this.f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        a(0.0f);
        if (this.f1565a) {
            a(this.e);
        }
    }

    void a(int i) {
        this.f1566b.a(i);
    }

    private void a(float f) {
        if (f == 1.0f) {
            this.f1567c.a(true);
        } else if (f == 0.0f) {
            this.f1567c.a(false);
        }
        this.f1567c.a(f);
    }
}
