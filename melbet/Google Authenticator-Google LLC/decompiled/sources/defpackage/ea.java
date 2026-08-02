package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ea extends nh implements dj {
    private dk a;
    private final xj b;

    public ea(Context context, int i) {
        super(context, a(context, i));
        this.b = new xj() { // from class: dz
            @Override // defpackage.xj
            public final boolean g(KeyEvent keyEvent) {
                return ea.this.c(keyEvent);
            }
        };
        dk b = b();
        ((dy) b).H = a(context, i);
        b.o();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.nh, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        b().d(view, layoutParams);
    }

    public final dk b() {
        if (this.a == null) {
            int i = dk.a;
            this.a = new dy(getContext(), getWindow(), this, this);
        }
        return this.a;
    }

    final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void d() {
        b().p(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return yg.f(this.b, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return b().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().f();
    }

    @Override // defpackage.nh, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        b().e();
        super.onCreate(bundle);
        b().o();
    }

    @Override // defpackage.nh, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        b().h();
    }

    @Override // defpackage.nh, android.app.Dialog
    public final void setContentView(int i) {
        e();
        b().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        b().m(getContext().getString(i));
    }

    @Override // defpackage.nh, android.app.Dialog
    public final void setContentView(View view) {
        e();
        b().k(view);
    }

    @Override // defpackage.nh, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        b().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().m(charSequence);
    }

    @Override // defpackage.dj
    public final void o() {
    }

    @Override // defpackage.dj
    public final void j(fg fgVar) {
    }
}
