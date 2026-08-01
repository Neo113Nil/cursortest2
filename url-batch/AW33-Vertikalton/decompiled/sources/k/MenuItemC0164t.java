package k;

import X.AbstractC0038g;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC0164t extends AbstractC0038g implements MenuItem {

    /* renamed from: c, reason: collision with root package name */
    public final E.a f2739c;
    public Method d;

    public MenuItemC0164t(Context context, E.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2739c = aVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f2739c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f2739c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProviderVisibilityListenerC0160p a2 = this.f2739c.a();
        if (a2 != null) {
            return a2.f2732b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f2739c.getActionView();
        return actionView instanceof C0161q ? (View) ((C0161q) actionView).f2734a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2739c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2739c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2739c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2739c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f2739c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2739c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2739c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2739c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2739c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2739c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2739c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2739c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2739c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2739c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2739c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f2739c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2739c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2739c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2739c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f2739c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f2739c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f2739c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f2739c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = new ActionProviderVisibilityListenerC0160p(this, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC0160p = null;
        }
        this.f2739c.b(actionProviderVisibilityListenerC0160p);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0161q(view);
        }
        this.f2739c.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f2739c.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f2739c.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f2739c.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2739c.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f2739c.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2739c.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2739c.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2739c.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2739c.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f2739c.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2739c.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0162r(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2739c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC0163s(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2739c.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f2739c.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f2739c.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2739c.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2739c.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2739c.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return this.f2739c.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f2739c.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2739c.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f2739c.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f2739c.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f2739c.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        E.a aVar = this.f2739c;
        aVar.setActionView(i);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new C0161q(actionView));
        }
        return this;
    }
}
