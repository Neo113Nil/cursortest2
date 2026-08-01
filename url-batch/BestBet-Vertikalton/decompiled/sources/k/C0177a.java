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
public final class C0177a implements E.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f3105a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f3106b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f3107c;
    public char d;

    /* renamed from: e, reason: collision with root package name */
    public int f3108e;

    /* renamed from: f, reason: collision with root package name */
    public char f3109f;

    /* renamed from: g, reason: collision with root package name */
    public int f3110g;
    public Drawable h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3111j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3112k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3113l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f3114m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3115n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3116o;

    /* renamed from: p, reason: collision with root package name */
    public int f3117p;

    @Override // E.a
    public final ActionProviderVisibilityListenerC0193q a() {
        return null;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f3115n || this.f3116o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f3115n) {
                    D.a.h(mutate, this.f3113l);
                }
                if (this.f3116o) {
                    D.a.i(this.h, this.f3114m);
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
        return this.f3110g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3109f;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3111j;
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
        return this.f3113l;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3114m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3107c;
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
        return this.f3108e;
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
        return this.f3105a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3106b;
        return charSequence != null ? charSequence : this.f3105a;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3112k;
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
        return (this.f3117p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3117p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3117p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3117p & 8) == 0;
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
        this.f3109f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f3117p = (z2 ? 1 : 0) | (this.f3117p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f3117p = (z2 ? 2 : 0) | (this.f3117p & (-3));
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f3111j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f3117p = (z2 ? 16 : 0) | (this.f3117p & (-17));
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
        this.f3113l = colorStateList;
        this.f3115n = true;
        c();
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3114m = mode;
        this.f3116o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3107c = intent;
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
        this.f3109f = Character.toLowerCase(c3);
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
        this.f3105a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3106b = charSequence;
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f3112k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f3117p = (this.f3117p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f3109f = Character.toLowerCase(c2);
        this.f3110g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3111j = charSequence;
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.d = c2;
        this.f3108e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f3105a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3112k = charSequence;
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
        this.f3108e = KeyEvent.normalizeMetaState(i);
        this.f3109f = Character.toLowerCase(c3);
        this.f3110g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
