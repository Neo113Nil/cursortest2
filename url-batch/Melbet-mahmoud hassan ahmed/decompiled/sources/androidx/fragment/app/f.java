package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.x;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final h<?> f679a;

    private f(h<?> hVar) {
        this.f679a = hVar;
    }

    public static f b(h<?> hVar) {
        return new f((h) q.f.b(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f679a;
        hVar.f685j.n(hVar, hVar, fragment);
    }

    public void c() {
        this.f679a.f685j.w();
    }

    public void d(Configuration configuration) {
        this.f679a.f685j.x(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f679a.f685j.y(menuItem);
    }

    public void f() {
        this.f679a.f685j.z();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f679a.f685j.A(menu, menuInflater);
    }

    public void h() {
        this.f679a.f685j.B();
    }

    public void i() {
        this.f679a.f685j.D();
    }

    public void j(boolean z6) {
        this.f679a.f685j.E(z6);
    }

    public boolean k(MenuItem menuItem) {
        return this.f679a.f685j.T(menuItem);
    }

    public void l(Menu menu) {
        this.f679a.f685j.U(menu);
    }

    public void m() {
        this.f679a.f685j.W();
    }

    public void n(boolean z6) {
        this.f679a.f685j.X(z6);
    }

    public boolean o(Menu menu) {
        return this.f679a.f685j.Y(menu);
    }

    public void p() {
        this.f679a.f685j.a0();
    }

    public void q() {
        this.f679a.f685j.b0();
    }

    public void r() {
        this.f679a.f685j.d0();
    }

    public boolean s() {
        return this.f679a.f685j.j0();
    }

    public Fragment t(String str) {
        return this.f679a.f685j.p0(str);
    }

    public i u() {
        return this.f679a.f685j;
    }

    public void v() {
        this.f679a.f685j.R0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f679a.f685j.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.f679a;
        if (!(hVar instanceof x)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        hVar.f685j.b1(parcelable);
    }

    public Parcelable y() {
        return this.f679a.f685j.d1();
    }
}
