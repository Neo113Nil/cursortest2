package j;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements e0.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2119a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2120b;
    public Intent c;

    /* renamed from: d, reason: collision with root package name */
    public char f2121d;

    /* renamed from: e, reason: collision with root package name */
    public int f2122e;

    /* renamed from: f, reason: collision with root package name */
    public char f2123f;
    public int g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public Context f2124i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2125j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2126k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2127l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2128m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2129n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2130o;

    /* renamed from: p, reason: collision with root package name */
    public int f2131p;

    @Override // e0.a
    public final p a() {
        return null;
    }

    @Override // e0.a
    public final e0.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f2129n || this.f2130o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f2129n) {
                    mutate.setTintList(this.f2127l);
                }
                if (this.f2130o) {
                    this.h.setTintMode(this.f2128m);
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

    @Override // e0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2123f;
    }

    @Override // e0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2125j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // e0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2127l;
    }

    @Override // e0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2128m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // e0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2122e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2121d;
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
        return this.f2119a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2120b;
        return charSequence != null ? charSequence : this.f2119a;
    }

    @Override // e0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2126k;
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
        return (this.f2131p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2131p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2131p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2131p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f2123f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f2131p = (z3 ? 1 : 0) | (this.f2131p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f2131p = (z3 ? 2 : 0) | (this.f2131p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2125j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f2131p = (z3 ? 16 : 0) | (this.f2131p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2127l = colorStateList;
        this.f2129n = true;
        c();
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2128m = mode;
        this.f2130o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f2121d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c4) {
        this.f2121d = c;
        this.f2123f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2119a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2120b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2126k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f2131p = (this.f2131p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i4) {
        this.f2123f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final e0.a setContentDescription(CharSequence charSequence) {
        this.f2125j = charSequence;
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i4) {
        this.f2121d = c;
        this.f2122e = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.f2119a = this.f2124i.getResources().getString(i4);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final e0.a setTooltipText(CharSequence charSequence) {
        this.f2126k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.h = this.f2124i.getDrawable(i4);
        c();
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c4, int i4, int i5) {
        this.f2121d = c;
        this.f2122e = KeyEvent.normalizeMetaState(i4);
        this.f2123f = Character.toLowerCase(c4);
        this.g = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        return this;
    }
}
