package K0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f593a;

    /* renamed from: b, reason: collision with root package name */
    public final q f594b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f595c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f596d;

    public r(q qVar) {
        this.f593a = qVar.f573a;
        this.f594b = qVar;
        this.f595c = qVar.getContext();
        this.f596d = qVar.f579g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public k h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof l;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(L.j jVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z2) {
    }

    public final void q() {
        this.f594b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
