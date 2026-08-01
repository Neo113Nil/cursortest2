package k;

import Y.AbstractC0040g;
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

/* renamed from: k.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC0197u extends AbstractC0040g implements MenuItem {

    /* renamed from: c, reason: collision with root package name */
    public final E.a f3222c;
    public Method d;

    public MenuItemC0197u(Context context, E.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f3222c = aVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f3222c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f3222c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProviderVisibilityListenerC0193q a2 = this.f3222c.a();
        if (a2 != null) {
            return a2.f3215b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f3222c.getActionView();
        return actionView instanceof C0194r ? (View) ((C0194r) actionView).f3217a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3222c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3222c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3222c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3222c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3222c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3222c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3222c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3222c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3222c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f3222c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3222c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3222c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3222c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3222c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3222c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f3222c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3222c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3222c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3222c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f3222c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f3222c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f3222c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f3222c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q = new ActionProviderVisibilityListenerC0193q(this, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC0193q = null;
        }
        this.f3222c.b(actionProviderVisibilityListenerC0193q);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0194r(view);
        }
        this.f3222c.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f3222c.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f3222c.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f3222c.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3222c.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f3222c.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3222c.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3222c.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3222c.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3222c.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f3222c.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3222c.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0195s(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3222c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC0196t(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3222c.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f3222c.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f3222c.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3222c.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3222c.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3222c.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return this.f3222c.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f3222c.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3222c.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f3222c.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f3222c.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f3222c.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        E.a aVar = this.f3222c;
        aVar.setActionView(i);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new C0194r(actionView));
        }
        return this;
    }
}
