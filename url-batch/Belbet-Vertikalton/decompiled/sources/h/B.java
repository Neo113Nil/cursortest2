package h;

import M.InterfaceC0014j;
import a.AbstractC0058a;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.winpower.neonfit.R;

/* loaded from: classes.dex */
public abstract class B extends b.m implements InterfaceC0133j {

    /* renamed from: d, reason: collision with root package name */
    public z f2720d;
    public final A e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.e = new InterfaceC0014j() { // from class: h.A
            @Override // M.InterfaceC0014j
            public final boolean d(KeyEvent keyEvent) {
                return B.this.h(keyEvent);
            }
        };
        n f2 = f();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((z) f2).f2863U = i;
        f2.d();
    }

    @Override // b.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z zVar = (z) f();
        zVar.v();
        ((ViewGroup) zVar.f2845B.findViewById(android.R.id.content)).addView(view, layoutParams);
        zVar.f2879m.a(zVar.f2878l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0058a.r(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final n f() {
        if (this.f2720d == null) {
            androidx.room.D d2 = n.f2808a;
            this.f2720d = new z(getContext(), getWindow(), this, this);
        }
        return this.f2720d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        z zVar = (z) f();
        zVar.v();
        return zVar.f2878l.findViewById(i);
    }

    public final void g() {
        androidx.lifecycle.J.g(getWindow().getDecorView(), this);
        AbstractC0058a.Y(getWindow().getDecorView(), this);
        H1.d.b0(getWindow().getDecorView(), this);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        z zVar = (z) f();
        if (zVar.f2881o != null) {
            zVar.z();
            zVar.f2881o.getClass();
            zVar.A(0);
        }
    }

    @Override // b.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().d();
    }

    @Override // b.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        z zVar = (z) f();
        zVar.z();
        K k2 = zVar.f2881o;
        if (k2 != null) {
            k2.f2765x = false;
            l.j jVar = k2.f2764w;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // b.m, android.app.Dialog
    public void setContentView(int i) {
        g();
        f().i(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().l(charSequence);
    }

    @Override // b.m, android.app.Dialog
    public void setContentView(View view) {
        g();
        f().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().l(getContext().getString(i));
    }

    @Override // b.m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        f().k(view, layoutParams);
    }
}
