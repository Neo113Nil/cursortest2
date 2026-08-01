package j2;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2355a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2356b;
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f2357d;

    public s(r rVar) {
        this.f2355a = rVar.f2336f;
        this.f2356b = rVar;
        this.c = rVar.getContext();
        this.f2357d = rVar.f2340l;
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

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i4) {
        return true;
    }

    public boolean j() {
        return this instanceof m;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f2356b.f(false);
    }

    public void l(EditText editText) {
    }

    public void m(l0.e eVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z3) {
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }
}
