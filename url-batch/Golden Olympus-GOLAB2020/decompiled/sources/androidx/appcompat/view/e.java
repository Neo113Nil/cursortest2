package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f10232c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f10233d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f10234e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f10235f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10236g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10237h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f10238i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z4) {
        this.f10232c = context;
        this.f10233d = actionBarContextView;
        this.f10234e = aVar;
        androidx.appcompat.view.menu.e defaultShowAsAction = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f10238i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f10237h = z4;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f10234e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f10233d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f10236g) {
            return;
        }
        this.f10236g = true;
        this.f10234e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f10235f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f10238i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f10233d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f10233d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f10233d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f10234e.c(this, this.f10238i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f10233d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f10233d.setCustomView(view);
        this.f10235f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i4) {
        o(this.f10232c.getString(i4));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f10233d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i4) {
        r(this.f10232c.getString(i4));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f10233d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z4) {
        super.s(z4);
        this.f10233d.setTitleOptional(z4);
    }
}
