package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.support.v7.view.b;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class i extends Dialog implements c {

    /* renamed from: a, reason: collision with root package name */
    private d f1649a;

    @Override // android.support.v7.app.c
    public void onSupportActionModeFinished(android.support.v7.view.b bVar) {
    }

    @Override // android.support.v7.app.c
    public void onSupportActionModeStarted(android.support.v7.view.b bVar) {
    }

    @Override // android.support.v7.app.c
    public android.support.v7.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public i(Context context, int i) {
        super(context, a(context, i));
        a().a((Bundle) null);
        a().j();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().a(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().d();
    }

    public boolean a(int i) {
        return a().c(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().f();
    }

    public d a() {
        if (this.f1649a == null) {
            this.f1649a = d.a(this, this);
        }
        return this.f1649a;
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }
}
