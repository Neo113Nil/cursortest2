package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final m f12494a;

    private k(m mVar) {
        this.f12494a = mVar;
    }

    public static k b(m mVar) {
        return new k((m) A.h.g(mVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        m mVar = this.f12494a;
        mVar.f12500e.m(mVar, mVar, fragment);
    }

    public void c() {
        this.f12494a.f12500e.x();
    }

    public boolean d(MenuItem menuItem) {
        return this.f12494a.f12500e.A(menuItem);
    }

    public void e() {
        this.f12494a.f12500e.B();
    }

    public void f() {
        this.f12494a.f12500e.D();
    }

    public void g() {
        this.f12494a.f12500e.M();
    }

    public void h() {
        this.f12494a.f12500e.Q();
    }

    public void i() {
        this.f12494a.f12500e.R();
    }

    public void j() {
        this.f12494a.f12500e.T();
    }

    public boolean k() {
        return this.f12494a.f12500e.a0(true);
    }

    public FragmentManager l() {
        return this.f12494a.f12500e;
    }

    public void m() {
        this.f12494a.f12500e.S0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f12494a.f12500e.u0().onCreateView(view, str, context, attributeSet);
    }
}
