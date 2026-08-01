package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0145B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0140a f2485b;

    public e(Context context, AbstractC0140a abstractC0140a) {
        this.f2484a = context;
        this.f2485b = abstractC0140a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2485b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2485b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0145B(this.f2484a, this.f2485b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2485b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2485b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2485b.f2473a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2485b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2485b.f2474b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2485b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2485b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2485b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2485b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2485b.f2473a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2485b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2485b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2485b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2485b.l(i);
    }
}
