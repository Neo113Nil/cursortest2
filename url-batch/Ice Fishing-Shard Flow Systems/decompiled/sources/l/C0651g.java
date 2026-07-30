package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import m.MenuC0674C;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6216a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0646b f6217b;

    public C0651g(Context context, AbstractC0646b abstractC0646b) {
        this.f6216a = context;
        this.f6217b = abstractC0646b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f6217b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f6217b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0674C(this.f6216a, this.f6217b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f6217b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f6217b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f6217b.f6202d;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f6217b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f6217b.f6203e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f6217b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f6217b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f6217b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f6217b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f6217b.f6202d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f6217b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z7) {
        this.f6217b.p(z7);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f6217b.l(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f6217b.n(i2);
    }
}
