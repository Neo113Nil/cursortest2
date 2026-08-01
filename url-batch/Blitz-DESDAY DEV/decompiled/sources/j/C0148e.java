package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0159B;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2632a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0144a f2633b;

    public C0148e(Context context, AbstractC0144a abstractC0144a) {
        this.f2632a = context;
        this.f2633b = abstractC0144a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2633b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2633b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0159B(this.f2632a, this.f2633b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2633b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2633b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2633b.f2621a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2633b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2633b.f2622b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2633b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2633b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2633b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2633b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2633b.f2621a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2633b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2633b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2633b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2633b.l(i);
    }
}
