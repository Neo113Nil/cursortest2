package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class v4 extends cc implements v3 {
    private f4 mDelegate;
    private final xp mKeyDispatcher;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v4(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.mKeyDispatcher = new xp() { // from class: u4
            @Override // defpackage.xp
            public final boolean b(KeyEvent keyEvent) {
                return v4.this.superDispatchKeyEvent(keyEvent);
            }
        };
        f4 delegate = getDelegate();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((t4) delegate).Z = i;
        delegate.c();
    }

    @Override // defpackage.cc, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        t4 t4Var = (t4) getDelegate();
        t4Var.v();
        ((ViewGroup) t4Var.G.findViewById(android.R.id.content)).addView(view, layoutParams);
        t4Var.r.a(t4Var.q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return l70.n(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        t4 t4Var = (t4) getDelegate();
        t4Var.v();
        return (T) t4Var.q.findViewById(i);
    }

    public f4 getDelegate() {
        if (this.mDelegate == null) {
            d4 d4Var = f4.f;
            this.mDelegate = new t4(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public u0 getSupportActionBar() {
        t4 t4Var = (t4) getDelegate();
        t4Var.z();
        return t4Var.t;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        t4 t4Var = (t4) getDelegate();
        if (t4Var.t != null) {
            t4Var.z();
            t4Var.t.getClass();
            t4Var.A(0);
        }
    }

    @Override // defpackage.cc, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().a();
        super.onCreate(bundle);
        getDelegate().c();
    }

    @Override // defpackage.cc, android.app.Dialog
    public void onStop() {
        super.onStop();
        t4 t4Var = (t4) getDelegate();
        t4Var.z();
        xa0 xa0Var = t4Var.t;
        if (xa0Var != null) {
            xa0Var.t = false;
            u90 u90Var = xa0Var.s;
            if (u90Var != null) {
                u90Var.a();
            }
        }
    }

    @Override // defpackage.v3
    public p1 onWindowStartingSupportActionMode(o1 o1Var) {
        return null;
    }

    @Override // defpackage.cc, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().h(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().k(getContext().getString(i));
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().g(i);
    }

    @Override // defpackage.cc, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().i(view);
    }

    @Override // defpackage.cc, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().k(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, 0);
        context.getClass();
        this.mKeyDispatcher = new xp() { // from class: u4
            @Override // defpackage.xp
            public final boolean b(KeyEvent keyEvent) {
                return v4.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // defpackage.v3
    public void onSupportActionModeFinished(p1 p1Var) {
    }

    @Override // defpackage.v3
    public void onSupportActionModeStarted(p1 p1Var) {
    }
}
