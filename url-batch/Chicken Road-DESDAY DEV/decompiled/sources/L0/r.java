package L0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f560a;

    /* renamed from: b, reason: collision with root package name */
    public final q f561b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f562c;
    public final CheckableImageButton d;

    public r(q qVar) {
        this.f560a = qVar.f541a;
        this.f561b = qVar;
        this.f562c = qVar.getContext();
        this.d = qVar.f546g;
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
        this.f561b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
