package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0151B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2601a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0147a f2602b;

    public e(Context context, AbstractC0147a abstractC0147a) {
        this.f2601a = context;
        this.f2602b = abstractC0147a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2602b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2602b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0151B(this.f2601a, this.f2602b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2602b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2602b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2602b.f2590a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2602b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2602b.f2591b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2602b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2602b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2602b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2602b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2602b.f2590a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2602b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2602b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2602b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2602b.l(i);
    }
}
