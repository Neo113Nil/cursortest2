package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0173C;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3030a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0164a f3031b;

    public e(Context context, AbstractC0164a abstractC0164a) {
        this.f3030a = context;
        this.f3031b = abstractC0164a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3031b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3031b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0173C(this.f3030a, this.f3031b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3031b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3031b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3031b.f3019a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3031b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3031b.f3020b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3031b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3031b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3031b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3031b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3031b.f3019a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3031b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3031b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f3031b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f3031b.n(i);
    }
}
