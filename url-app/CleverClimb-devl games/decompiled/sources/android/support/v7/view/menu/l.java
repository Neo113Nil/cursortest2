package android.support.v7.view.menu;

import android.content.Context;

/* compiled from: MenuPresenter.java */
/* loaded from: classes.dex */
public interface l {

    /* compiled from: MenuPresenter.java */
    public interface a {
        void onCloseMenu(MenuBuilder menuBuilder, boolean z);

        boolean onOpenSubMenu(MenuBuilder menuBuilder);
    }

    boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean flagActionItems();

    void initForMenu(Context context, MenuBuilder menuBuilder);

    void onCloseMenu(MenuBuilder menuBuilder, boolean z);

    boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder);

    void setCallback(a aVar);

    void updateMenuView(boolean z);
}
