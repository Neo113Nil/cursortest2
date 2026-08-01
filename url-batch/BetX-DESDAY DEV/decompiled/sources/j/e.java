package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0200k;
import k.MenuC0202m;
import l.C0270k;

/* loaded from: classes.dex */
public final class e extends AbstractC0170b implements InterfaceC0200k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2819c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f2820d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2821e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2822f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2823g;
    public MenuC0202m h;

    @Override // j.AbstractC0170b
    public final void a() {
        if (this.f2823g) {
            return;
        }
        this.f2823g = true;
        this.f2821e.d(this);
    }

    @Override // j.AbstractC0170b
    public final View b() {
        WeakReference weakReference = this.f2822f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0170b
    public final MenuC0202m c() {
        return this.h;
    }

    @Override // j.AbstractC0170b
    public final MenuInflater d() {
        return new i(this.f2820d.getContext());
    }

    @Override // j.AbstractC0170b
    public final CharSequence e() {
        return this.f2820d.getSubtitle();
    }

    @Override // j.AbstractC0170b
    public final CharSequence f() {
        return this.f2820d.getTitle();
    }

    @Override // j.AbstractC0170b
    public final void g() {
        this.f2821e.e(this, this.h);
    }

    @Override // j.AbstractC0170b
    public final boolean h() {
        return this.f2820d.f1005s;
    }

    @Override // j.AbstractC0170b
    public final void i(View view) {
        this.f2820d.setCustomView(view);
        this.f2822f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0170b
    public final void j(int i) {
        k(this.f2819c.getString(i));
    }

    @Override // j.AbstractC0170b
    public final void k(CharSequence charSequence) {
        this.f2820d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0170b
    public final void l(int i) {
        m(this.f2819c.getString(i));
    }

    @Override // j.AbstractC0170b
    public final void m(CharSequence charSequence) {
        this.f2820d.setTitle(charSequence);
    }

    @Override // j.AbstractC0170b
    public final void n(boolean z2) {
        this.f2812b = z2;
        this.f2820d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0200k
    public final void p(MenuC0202m menuC0202m) {
        g();
        C0270k c0270k = this.f2820d.f992d;
        if (c0270k != null) {
            c0270k.l();
        }
    }

    @Override // k.InterfaceC0200k
    public final boolean r(MenuC0202m menuC0202m, MenuItem menuItem) {
        return ((InterfaceC0169a) this.f2821e.f36b).a(this, menuItem);
    }
}
