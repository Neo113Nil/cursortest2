package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class e extends b implements MenuBuilder.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f1699a;

    /* renamed from: b, reason: collision with root package name */
    private ActionBarContextView f1700b;

    /* renamed from: c, reason: collision with root package name */
    private b.a f1701c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<View> f1702d;
    private boolean e;
    private boolean f;
    private MenuBuilder g;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f1699a = context;
        this.f1700b = actionBarContextView;
        this.f1701c = aVar;
        this.g = new MenuBuilder(actionBarContextView.getContext()).a(1);
        this.g.a(this);
        this.f = z;
    }

    @Override // android.support.v7.view.b
    public void b(CharSequence charSequence) {
        this.f1700b.setTitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public void a(CharSequence charSequence) {
        this.f1700b.setSubtitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public void a(int i) {
        b(this.f1699a.getString(i));
    }

    @Override // android.support.v7.view.b
    public void b(int i) {
        a((CharSequence) this.f1699a.getString(i));
    }

    @Override // android.support.v7.view.b
    public void a(boolean z) {
        super.a(z);
        this.f1700b.setTitleOptional(z);
    }

    @Override // android.support.v7.view.b
    public boolean h() {
        return this.f1700b.isTitleOptional();
    }

    @Override // android.support.v7.view.b
    public void a(View view) {
        this.f1700b.setCustomView(view);
        this.f1702d = view != null ? new WeakReference<>(view) : null;
    }

    @Override // android.support.v7.view.b
    public void d() {
        this.f1701c.b(this, this.g);
    }

    @Override // android.support.v7.view.b
    public void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f1700b.sendAccessibilityEvent(32);
        this.f1701c.a(this);
    }

    @Override // android.support.v7.view.b
    public Menu b() {
        return this.g;
    }

    @Override // android.support.v7.view.b
    public CharSequence f() {
        return this.f1700b.getTitle();
    }

    @Override // android.support.v7.view.b
    public CharSequence g() {
        return this.f1700b.getSubtitle();
    }

    @Override // android.support.v7.view.b
    public View i() {
        if (this.f1702d != null) {
            return this.f1702d.get();
        }
        return null;
    }

    @Override // android.support.v7.view.b
    public MenuInflater a() {
        return new g(this.f1700b.getContext());
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f1701c.a(this, menuItem);
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        d();
        this.f1700b.showOverflowMenu();
    }
}
