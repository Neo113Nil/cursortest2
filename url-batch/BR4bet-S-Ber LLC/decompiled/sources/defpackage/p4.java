package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class p4 extends yc implements p3 {
    public n4 j;
    public final o4 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [o4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p4(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.k = new yr() { // from class: o4
            @Override // defpackage.yr
            public final boolean b(KeyEvent keyEvent) {
                return p4.this.g(keyEvent);
            }
        };
        z3 f = f();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((n4) f).Y = i;
        f.c();
    }

    @Override // defpackage.yc, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        n4 n4Var = (n4) f();
        n4Var.v();
        ((ViewGroup) n4Var.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        n4Var.r.a(n4Var.q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b9.m(this.k, getWindow().getDecorView(), this, keyEvent);
    }

    public final z3 f() {
        if (this.j == null) {
            x3 x3Var = z3.f;
            this.j = new n4(getContext(), getWindow(), this, this);
        }
        return this.j;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        n4 n4Var = (n4) f();
        n4Var.v();
        return n4Var.q.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        n4 n4Var = (n4) f();
        if (n4Var.s != null) {
            n4Var.z();
            n4Var.s.getClass();
            n4Var.A(0);
        }
    }

    @Override // defpackage.yc, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    @Override // defpackage.yc, android.app.Dialog
    public final void onStop() {
        super.onStop();
        n4 n4Var = (n4) f();
        n4Var.z();
        xd0 xd0Var = n4Var.s;
        if (xd0Var != null) {
            xd0Var.t = false;
            xc0 xc0Var = xd0Var.s;
            if (xc0Var != null) {
                xc0Var.a();
            }
        }
    }

    @Override // defpackage.yc, android.app.Dialog
    public void setContentView(int i) {
        d();
        f().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().k(getContext().getString(i));
    }

    @Override // defpackage.yc, android.app.Dialog
    public void setContentView(View view) {
        d();
        f().i(view);
    }

    @Override // defpackage.yc, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        f().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().k(charSequence);
    }
}
