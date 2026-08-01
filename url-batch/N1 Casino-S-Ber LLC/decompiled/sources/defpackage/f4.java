package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class f4 extends yb implements f3 {
    public d4 j;
    public final e4 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [e4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f4(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.k = new mp() { // from class: e4
            @Override // defpackage.mp
            public final boolean b(KeyEvent keyEvent) {
                return f4.this.g(keyEvent);
            }
        };
        p3 f = f();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((d4) f).X = i;
        f.d();
    }

    @Override // defpackage.yb, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        d4 d4Var = (d4) f();
        d4Var.w();
        ((ViewGroup) d4Var.E.findViewById(android.R.id.content)).addView(view, layoutParams);
        d4Var.r.a(d4Var.q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return zo.o(this.k, getWindow().getDecorView(), this, keyEvent);
    }

    public final p3 f() {
        if (this.j == null) {
            n3 n3Var = p3.f;
            this.j = new d4(getContext(), getWindow(), this, this);
        }
        return this.j;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        d4 d4Var = (d4) f();
        d4Var.w();
        return d4Var.q.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().b();
    }

    @Override // defpackage.yb, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().d();
    }

    @Override // defpackage.yb, android.app.Dialog
    public final void onStop() {
        super.onStop();
        d4 d4Var = (d4) f();
        d4Var.A();
        o8 o8Var = d4Var.s;
        if (o8Var != null) {
            o8Var.n0(false);
        }
    }

    @Override // defpackage.yb, android.app.Dialog
    public void setContentView(int i) {
        d();
        f().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().l(getContext().getString(i));
    }

    @Override // defpackage.yb, android.app.Dialog
    public void setContentView(View view) {
        d();
        f().j(view);
    }

    @Override // defpackage.yb, android.app.Dialog
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
