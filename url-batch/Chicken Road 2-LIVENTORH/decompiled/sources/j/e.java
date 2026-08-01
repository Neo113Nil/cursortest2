package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.b0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1843a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1844b;

    public e(Context context, a aVar) {
        this.f1843a = context;
        this.f1844b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f1844b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1844b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f1843a, this.f1844b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1844b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1844b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1844b.f1831f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1844b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1844b.f1832g;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1844b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1844b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f1844b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1844b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1844b.f1831f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1844b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f1844b.o(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f1844b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f1844b.m(i);
    }
}
