package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0144B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2535a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0139a f2536b;

    public e(Context context, AbstractC0139a abstractC0139a) {
        this.f2535a = context;
        this.f2536b = abstractC0139a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2536b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2536b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0144B(this.f2535a, this.f2536b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2536b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2536b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2536b.f2524a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2536b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2536b.f2525b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2536b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2536b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2536b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2536b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2536b.f2524a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2536b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2536b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2536b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2536b.l(i);
    }
}
