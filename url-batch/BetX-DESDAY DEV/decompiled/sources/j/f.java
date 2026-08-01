package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0186B;

/* loaded from: classes.dex */
public final class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0170b f2825b;

    public f(Context context, AbstractC0170b abstractC0170b) {
        this.f2824a = context;
        this.f2825b = abstractC0170b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2825b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2825b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0186B(this.f2824a, this.f2825b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2825b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2825b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2825b.f2811a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2825b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2825b.f2812b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2825b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2825b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2825b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2825b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2825b.f2811a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2825b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2825b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2825b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2825b.l(i);
    }
}
