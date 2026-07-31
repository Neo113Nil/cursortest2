package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.C1301k0;

/* loaded from: classes.dex */
public interface A {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(S s4);

    boolean j();

    void k(int i4);

    Menu l();

    void m(int i4);

    int n();

    C1301k0 o(int i4, long j4);

    void p(j.a aVar, e.a aVar2);

    void q(int i4);

    ViewGroup r();

    void s(boolean z4);

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    int t();

    void u();

    void v();

    void w(boolean z4);
}
