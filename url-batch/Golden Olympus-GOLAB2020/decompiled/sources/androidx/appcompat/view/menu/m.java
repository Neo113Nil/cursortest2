package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public class m extends e implements SubMenu {
    private g mItem;
    private e mParentMenu;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.mParentMenu = eVar;
        this.mItem = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean collapseItemActionView(g gVar) {
        return this.mParentMenu.collapseItemActionView(gVar);
    }

    @Override // androidx.appcompat.view.menu.e
    boolean dispatchMenuItemSelected(e eVar, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(eVar, menuItem) || this.mParentMenu.dispatchMenuItemSelected(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean expandItemActionView(g gVar) {
        return this.mParentMenu.expandItemActionView(gVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public String getActionViewStatesKey() {
        g gVar = this.mItem;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + StringUtils.PROCESS_POSTFIX_DELIMITER + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.e
    public e getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.e
    public void setCallback(e.a aVar) {
        this.mParentMenu.setCallback(aVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.mParentMenu.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.mParentMenu.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        return (SubMenu) super.setHeaderIconInt(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        return (SubMenu) super.setHeaderTitleInt(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.mItem.setIcon(i4);
        return this;
    }
}
