package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0150B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2586a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0144a f2587b;

    public e(Context context, AbstractC0144a abstractC0144a) {
        this.f2586a = context;
        this.f2587b = abstractC0144a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2587b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2587b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0150B(this.f2586a, this.f2587b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2587b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2587b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2587b.f2575a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2587b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2587b.f2576b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2587b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2587b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2587b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2587b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2587b.f2575a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2587b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2587b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2587b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2587b.l(i);
    }
}
