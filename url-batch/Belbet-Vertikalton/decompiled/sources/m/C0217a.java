package m;

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

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217a implements G.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f3290a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f3291b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f3292c;

    /* renamed from: d, reason: collision with root package name */
    public char f3293d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public char f3294f;

    /* renamed from: g, reason: collision with root package name */
    public int f3295g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f3296h;
    public Context i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3297k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3298l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f3299m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3300n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3301o;

    /* renamed from: p, reason: collision with root package name */
    public int f3302p;

    @Override // G.a
    public final G.a a(ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p) {
        throw new UnsupportedOperationException();
    }

    @Override // G.a
    public final ActionProviderVisibilityListenerC0232p b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f3296h;
        if (drawable != null) {
            if (this.f3300n || this.f3301o) {
                this.f3296h = drawable;
                Drawable mutate = drawable.mutate();
                this.f3296h = mutate;
                if (this.f3300n) {
                    F.a.h(mutate, this.f3298l);
                }
                if (this.f3301o) {
                    F.a.i(this.f3296h, this.f3299m);
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

    @Override // G.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3295g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3294f;
    }

    @Override // G.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3296h;
    }

    @Override // G.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3298l;
    }

    @Override // G.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3299m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3292c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // G.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3293d;
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
        return this.f3290a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3291b;
        return charSequence != null ? charSequence : this.f3290a;
    }

    @Override // G.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3297k;
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
        return (this.f3302p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3302p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3302p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3302p & 8) == 0;
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
        this.f3294f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f3302p = (z2 ? 1 : 0) | (this.f3302p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f3302p = (z2 ? 2 : 0) | (this.f3302p & (-3));
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final G.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f3302p = (z2 ? 16 : 0) | (this.f3302p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3296h = drawable;
        c();
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3298l = colorStateList;
        this.f3300n = true;
        c();
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3299m = mode;
        this.f3301o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3292c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f3293d = c2;
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
        this.f3293d = c2;
        this.f3294f = Character.toLowerCase(c3);
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
        this.f3290a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3291b = charSequence;
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final G.a setTooltipText(CharSequence charSequence) {
        this.f3297k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f3302p = (this.f3302p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f3294f = Character.toLowerCase(c2);
        this.f3295g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f3293d = c2;
        this.e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f3290a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3297k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3296h = C.a.b(this.i, i);
        c();
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f3293d = c2;
        this.e = KeyEvent.normalizeMetaState(i);
        this.f3294f = Character.toLowerCase(c3);
        this.f3295g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
