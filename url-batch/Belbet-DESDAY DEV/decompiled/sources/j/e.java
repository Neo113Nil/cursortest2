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
    public final Context f2556a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0137a f2557b;

    public e(Context context, AbstractC0137a abstractC0137a) {
        this.f2556a = context;
        this.f2557b = abstractC0137a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2557b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2557b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0141B(this.f2556a, this.f2557b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2557b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2557b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2557b.f2545a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2557b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2557b.f2546b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2557b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2557b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2557b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2557b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2557b.f2545a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2557b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2557b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2557b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2557b.n(i);
    }
}
