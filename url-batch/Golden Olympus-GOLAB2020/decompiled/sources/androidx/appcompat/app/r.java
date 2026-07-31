package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.AbstractC1319u;
import androidx.lifecycle.d0;
import e.AbstractC2405a;
import h0.AbstractC2438g;

/* loaded from: classes.dex */
public class r extends androidx.activity.r implements e {
    private g mDelegate;
    private final AbstractC1319u.a mKeyDispatcher;

    public r(Context context, int i4) {
        super(context, getThemeResId(context, i4));
        this.mKeyDispatcher = new AbstractC1319u.a() { // from class: androidx.appcompat.app.q
            @Override // androidx.core.view.AbstractC1319u.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return r.this.superDispatchKeyEvent(keyEvent);
            }
        };
        g delegate = getDelegate();
        delegate.M(getThemeResId(context, i4));
        delegate.x(null);
    }

    private void d() {
        d0.b(getWindow().getDecorView(), this);
        AbstractC2438g.a(getWindow().getDecorView(), this);
        androidx.activity.B.b(getWindow().getDecorView(), this);
    }

    private static int getThemeResId(Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC2405a.f36209w, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1319u.e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i4) {
        return (T) getDelegate().j(i4);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.i(this, this);
        }
        return this.mDelegate;
    }

    public AbstractC1250a getSupportActionBar() {
        return getDelegate().s();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    @Override // androidx.activity.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        getDelegate().t();
        super.onCreate(bundle);
        getDelegate().x(bundle);
    }

    @Override // androidx.activity.r, android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().D();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(int i4) {
        d();
        getDelegate().H(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().N(charSequence);
    }

    boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().G(i4);
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(View view) {
        d();
        getDelegate().I(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i4) {
        super.setTitle(i4);
        getDelegate().N(getContext().getString(i4));
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        getDelegate().J(view, layoutParams);
    }
}
