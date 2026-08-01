package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.b0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2087a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2088b;

    public e(Context context, a aVar) {
        this.f2087a = context;
        this.f2088b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2088b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2088b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f2087a, this.f2088b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2088b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2088b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2088b.f2076f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2088b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2088b.f2077g;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2088b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2088b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2088b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2088b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2088b.f2076f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2088b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f2088b.n(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2088b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2088b.l(i);
    }
}
