package z5;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f9238a;

    /* renamed from: b, reason: collision with root package name */
    public final o f9239b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9240c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f9241d;

    public p(o oVar) {
        this.f9238a = oVar.f9217d;
        this.f9239b = oVar;
        this.f9240c = oVar.getContext();
        this.f9241d = oVar.f9222j;
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

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof k;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f9239b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(r3.f fVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z3) {
    }
}
