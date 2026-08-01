package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class x4 extends ae implements x3 {
    public v4 j;
    public final w4 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [w4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x4(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.k = new sw() { // from class: w4
            @Override // defpackage.sw
            public final boolean b(KeyEvent keyEvent) {
                return x4.this.g(keyEvent);
            }
        };
        h4 f = f();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((v4) f).Y = i;
        f.d();
    }

    @Override // defpackage.ae, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        v4 v4Var = (v4) f();
        v4Var.w();
        ((ViewGroup) v4Var.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        v4Var.r.a(v4Var.q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return gk0.o(this.k, getWindow().getDecorView(), this, keyEvent);
    }

    public final h4 f() {
        if (this.j == null) {
            f4 f4Var = h4.f;
            this.j = new v4(getContext(), getWindow(), this, this);
        }
        return this.j;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        v4 v4Var = (v4) f();
        v4Var.w();
        return v4Var.q.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().b();
    }

    @Override // defpackage.ae, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().d();
    }

    @Override // defpackage.ae, android.app.Dialog
    public final void onStop() {
        super.onStop();
        v4 v4Var = (v4) f();
        v4Var.A();
        n9 n9Var = v4Var.s;
        if (n9Var != null) {
            n9Var.O(false);
        }
    }

    @Override // defpackage.ae, android.app.Dialog
    public void setContentView(int i) {
        d();
        f().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().l(getContext().getString(i));
    }

    @Override // defpackage.ae, android.app.Dialog
    public void setContentView(View view) {
        d();
        f().j(view);
    }

    @Override // defpackage.ae, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        f().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().l(charSequence);
    }
}
