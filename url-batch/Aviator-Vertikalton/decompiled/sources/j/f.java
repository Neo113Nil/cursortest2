package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0184B;

/* loaded from: classes.dex */
public final class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2820a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0169b f2821b;

    public f(Context context, AbstractC0169b abstractC0169b) {
        this.f2820a = context;
        this.f2821b = abstractC0169b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2821b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2821b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0184B(this.f2820a, this.f2821b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2821b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2821b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2821b.f2807a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2821b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2821b.f2808b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2821b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2821b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2821b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2821b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2821b.f2807a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2821b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2821b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2821b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2821b.n(i);
    }
}
