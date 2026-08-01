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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements h0.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f1983a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f1984b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f1985c;
    public char d;

    /* renamed from: e, reason: collision with root package name */
    public int f1986e;

    /* renamed from: f, reason: collision with root package name */
    public char f1987f;

    /* renamed from: g, reason: collision with root package name */
    public int f1988g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f1989h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1990j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1991k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1992l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1993m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1994n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1995o;

    /* renamed from: p, reason: collision with root package name */
    public int f1996p;

    @Override // h0.a
    public final h0.a a(p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.a
    public final p b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f1989h;
        if (drawable != null) {
            if (this.f1994n || this.f1995o) {
                this.f1989h = drawable;
                Drawable mutate = drawable.mutate();
                this.f1989h = mutate;
                if (this.f1994n) {
                    mutate.setTintList(this.f1992l);
                }
                if (this.f1995o) {
                    this.f1989h.setTintMode(this.f1993m);
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

    @Override // h0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1988g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1987f;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1990j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f1989h;
    }

    @Override // h0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1992l;
    }

    @Override // h0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1993m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1985c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1986e;
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
        return this.f1983a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1984b;
        return charSequence != null ? charSequence : this.f1983a;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f1991k;
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
        return (this.f1996p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f1996p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f1996p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f1996p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c4) {
        this.f1987f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f1996p = (z3 ? 1 : 0) | (this.f1996p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f1996p = (z3 ? 2 : 0) | (this.f1996p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f1990j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f1996p = (z3 ? 16 : 0) | (this.f1996p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1989h = drawable;
        c();
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1992l = colorStateList;
        this.f1994n = true;
        c();
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1993m = mode;
        this.f1995o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1985c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        this.d = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.d = c4;
        this.f1987f = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1983a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1984b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f1991k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f1996p = (this.f1996p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i) {
        this.f1987f = Character.toLowerCase(c4);
        this.f1988g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setContentDescription(CharSequence charSequence) {
        this.f1990j = charSequence;
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i) {
        this.d = c4;
        this.f1986e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f1983a = this.i.getResources().getString(i);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setTooltipText(CharSequence charSequence) {
        this.f1991k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f1989h = this.i.getDrawable(i);
        c();
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i, int i4) {
        this.d = c4;
        this.f1986e = KeyEvent.normalizeMetaState(i);
        this.f1987f = Character.toLowerCase(c5);
        this.f1988g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
