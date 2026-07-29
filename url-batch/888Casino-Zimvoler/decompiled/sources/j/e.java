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
    public final Context f2534a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0137a f2535b;

    public e(Context context, AbstractC0137a abstractC0137a) {
        this.f2534a = context;
        this.f2535b = abstractC0137a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2535b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2535b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0141B(this.f2534a, this.f2535b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2535b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2535b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2535b.f2523a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2535b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2535b.f2524b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2535b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2535b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2535b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2535b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2535b.f2523a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2535b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2535b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2535b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2535b.n(i);
    }
}
