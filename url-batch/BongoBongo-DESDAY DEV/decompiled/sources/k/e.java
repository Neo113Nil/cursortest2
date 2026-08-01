package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC0153B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2684a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0147a f2685b;

    public e(Context context, AbstractC0147a abstractC0147a) {
        this.f2684a = context;
        this.f2685b = abstractC0147a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2685b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2685b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0153B(this.f2684a, this.f2685b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2685b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2685b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2685b.f2672a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2685b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2685b.f2673b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2685b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2685b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2685b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2685b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2685b.f2672a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2685b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2685b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2685b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2685b.l(i);
    }
}
