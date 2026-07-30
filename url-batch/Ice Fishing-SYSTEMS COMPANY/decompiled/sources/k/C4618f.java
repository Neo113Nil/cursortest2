package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC4669A;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4618f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38619a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4614b f38620b;

    public C4618f(Context context, AbstractC4614b abstractC4614b) {
        this.f38619a = context;
        this.f38620b = abstractC4614b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f38620b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f38620b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC4669A(this.f38619a, this.f38620b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f38620b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f38620b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f38620b.f38605n;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f38620b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f38620b.f38606u;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f38620b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f38620b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f38620b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f38620b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f38620b.f38605n = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f38620b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z8) {
        this.f38620b.p(z8);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f38620b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f38620b.m(i);
    }
}
