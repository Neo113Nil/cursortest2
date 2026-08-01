package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0142B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2479a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0138a f2480b;

    public e(Context context, AbstractC0138a abstractC0138a) {
        this.f2479a = context;
        this.f2480b = abstractC0138a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2480b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2480b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0142B(this.f2479a, this.f2480b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2480b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2480b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2480b.f2468a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2480b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2480b.f2469b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2480b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2480b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2480b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2480b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2480b.f2468a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2480b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2480b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2480b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2480b.n(i);
    }
}
