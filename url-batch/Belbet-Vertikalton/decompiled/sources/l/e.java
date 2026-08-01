package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import m.MenuC0213B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3200a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0204a f3201b;

    public e(Context context, AbstractC0204a abstractC0204a) {
        this.f3200a = context;
        this.f3201b = abstractC0204a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3201b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3201b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0213B(this.f3200a, this.f3201b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3201b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3201b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3201b.f3188a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3201b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3201b.f3189b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3201b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3201b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3201b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3201b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3201b.f3188a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3201b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3201b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f3201b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f3201b.n(i);
    }
}
