package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.b0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2039a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2040b;

    public e(Context context, a aVar) {
        this.f2039a = context;
        this.f2040b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2040b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2040b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f2039a, this.f2040b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2040b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2040b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2040b.f2028f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2040b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2040b.g;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2040b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2040b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2040b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2040b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2040b.f2028f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2040b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f2040b.p(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i4) {
        this.f2040b.k(i4);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i4) {
        this.f2040b.n(i4);
    }
}
