package h;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.MainActivity;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4545d implements a0.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4543b f38078a;

    /* renamed from: b, reason: collision with root package name */
    public final DrawerLayout f38079b;

    /* renamed from: c, reason: collision with root package name */
    public final j.a f38080c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38081d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38082e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38083f = false;

    public C4545d(MainActivity mainActivity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f38078a = new Y2.e(toolbar);
            toolbar.setNavigationOnClickListener(new com.google.android.material.datepicker.j(2, this));
        } else {
            this.f38078a = mainActivity.getDrawerToggleDelegate();
        }
        this.f38079b = drawerLayout;
        this.f38081d = C5284R.string.app_name;
        this.f38082e = C5284R.string.app_name;
        this.f38080c = new j.a(this.f38078a.k());
        this.f38078a.u();
    }

    public final void a(float f6) {
        j.a aVar = this.f38080c;
        if (f6 == 1.0f) {
            if (!aVar.i) {
                aVar.i = true;
                aVar.invalidateSelf();
            }
        } else if (f6 == 0.0f && aVar.i) {
            aVar.i = false;
            aVar.invalidateSelf();
        }
        aVar.setProgress(f6);
    }
}
