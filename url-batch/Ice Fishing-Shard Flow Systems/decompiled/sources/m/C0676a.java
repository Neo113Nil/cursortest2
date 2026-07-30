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
public final class C0676a implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f6346a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f6347b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f6348c;

    /* renamed from: d, reason: collision with root package name */
    public char f6349d;

    /* renamed from: e, reason: collision with root package name */
    public int f6350e;

    /* renamed from: f, reason: collision with root package name */
    public char f6351f;

    /* renamed from: g, reason: collision with root package name */
    public int f6352g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f6353h;

    /* renamed from: i, reason: collision with root package name */
    public Context f6354i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f6355k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f6356l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f6357m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6358n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6359o;

    /* renamed from: p, reason: collision with root package name */
    public int f6360p;

    @Override // D.a
    public final D.a a(p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // D.a
    public final p b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f6353h;
        if (drawable != null) {
            if (this.f6358n || this.f6359o) {
                this.f6353h = drawable;
                Drawable mutate = drawable.mutate();
                this.f6353h = mutate;
                if (this.f6358n) {
                    mutate.setTintList(this.f6356l);
                }
                if (this.f6359o) {
                    this.f6353h.setTintMode(this.f6357m);
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

    @Override // D.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6352g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6351f;
    }

    @Override // D.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f6353h;
    }

    @Override // D.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6356l;
    }

    @Override // D.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6357m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6348c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // D.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6350e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6349d;
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
        return this.f6346a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6347b;
        return charSequence != null ? charSequence : this.f6346a;
    }

    @Override // D.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6355k;
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
        return (this.f6360p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6360p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6360p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6360p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c7) {
        this.f6351f = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        this.f6360p = (z7 ? 1 : 0) | (this.f6360p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        this.f6360p = (z7 ? 2 : 0) | (this.f6360p & (-3));
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final D.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z7) {
        this.f6360p = (z7 ? 16 : 0) | (this.f6360p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6353h = drawable;
        c();
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6356l = colorStateList;
        this.f6358n = true;
        c();
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6357m = mode;
        this.f6359o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6348c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        this.f6349d = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f6349d = c7;
        this.f6351f = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6346a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6347b = charSequence;
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final D.a setTooltipText(CharSequence charSequence) {
        this.f6355k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        this.f6360p = (this.f6360p & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i2) {
        this.f6351f = Character.toLowerCase(c7);
        this.f6352g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i2) {
        this.f6349d = c7;
        this.f6350e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f6346a = this.f6354i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f6355k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f6353h = this.f6354i.getDrawable(i2);
        c();
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i2, int i5) {
        this.f6349d = c7;
        this.f6350e = KeyEvent.normalizeMetaState(i2);
        this.f6351f = Character.toLowerCase(c8);
        this.f6352g = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
