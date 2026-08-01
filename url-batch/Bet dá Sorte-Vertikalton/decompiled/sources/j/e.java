package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0141B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0137a f2524b;

    public e(Context context, AbstractC0137a abstractC0137a) {
        this.f2523a = context;
        this.f2524b = abstractC0137a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2524b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2524b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0141B(this.f2523a, this.f2524b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2524b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2524b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2524b.f2512a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2524b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2524b.f2513b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2524b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2524b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2524b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2524b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2524b.f2512a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2524b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2524b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2524b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2524b.l(i);
    }
}
