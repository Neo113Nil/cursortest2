package k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145a implements E.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2623a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2624b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f2625c;
    public char d;

    /* renamed from: e, reason: collision with root package name */
    public int f2626e;

    /* renamed from: f, reason: collision with root package name */
    public char f2627f;

    /* renamed from: g, reason: collision with root package name */
    public int f2628g;
    public Drawable h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2629j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2630k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2631l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2632m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2633n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2634o;

    /* renamed from: p, reason: collision with root package name */
    public int f2635p;

    @Override // E.a
    public final ActionProviderVisibilityListenerC0160p a() {
        return null;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f2633n || this.f2634o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f2633n) {
                    D.a.h(mutate, this.f2631l);
                }
                if (this.f2634o) {
                    D.a.i(this.h, this.f2632m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2628g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2627f;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2629j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2631l;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2632m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2625c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2626e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2623a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2624b;
        return charSequence != null ? charSequence : this.f2623a;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2630k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2635p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2635p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2635p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2635p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f2627f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f2635p = (z2 ? 1 : 0) | (this.f2635p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f2635p = (z2 ? 2 : 0) | (this.f2635p & (-3));
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2629j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f2635p = (z2 ? 16 : 0) | (this.f2635p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2631l = colorStateList;
        this.f2633n = true;
        c();
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2632m = mode;
        this.f2634o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2625c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f2627f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2623a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2624b = charSequence;
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2630k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f2635p = (this.f2635p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f2627f = Character.toLowerCase(c2);
        this.f2628g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2629j = charSequence;
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.d = c2;
        this.f2626e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f2623a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2630k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.h = A.a.b(this.i, i);
        c();
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.d = c2;
        this.f2626e = KeyEvent.normalizeMetaState(i);
        this.f2627f = Character.toLowerCase(c3);
        this.f2628g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
