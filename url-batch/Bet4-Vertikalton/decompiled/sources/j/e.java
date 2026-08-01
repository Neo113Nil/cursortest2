package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0148B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2548a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0142a f2549b;

    public e(Context context, AbstractC0142a abstractC0142a) {
        this.f2548a = context;
        this.f2549b = abstractC0142a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2549b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2549b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0148B(this.f2548a, this.f2549b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2549b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2549b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2549b.f2537a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2549b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2549b.f2538b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2549b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2549b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2549b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2549b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2549b.f2537a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2549b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2549b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2549b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2549b.l(i);
    }
}
