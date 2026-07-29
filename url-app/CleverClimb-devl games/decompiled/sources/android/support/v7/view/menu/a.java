package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class a implements l {
    private l.a mCallback;
    protected Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected MenuBuilder mMenu;
    private int mMenuLayoutRes;
    protected m mMenuView;
    protected Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public abstract void bindItemView(MenuItemImpl menuItemImpl, m.a aVar);

    @Override // android.support.v7.view.menu.l
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean flagActionItems() {
        return false;
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuItemImpl) {
        return true;
    }

    public a(Context context, int i, int i2) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = i;
        this.mItemLayoutRes = i2;
    }

    @Override // android.support.v7.view.menu.l
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
        this.mMenu = menuBuilder;
    }

    public m getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (m) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.l
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return;
        }
        int i = 0;
        if (this.mMenu != null) {
            this.mMenu.j();
            ArrayList<MenuItemImpl> i2 = this.mMenu.i();
            int size = i2.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MenuItemImpl menuItemImpl = i2.get(i4);
                if (shouldIncludeItem(i3, menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i3);
                    MenuItemImpl itemData = childAt instanceof m.a ? ((m.a) childAt).getItemData() : null;
                    View itemView = getItemView(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        addItemView(itemView, i3);
                    }
                    i3++;
                }
            }
            i = i3;
        }
        while (i < viewGroup.getChildCount()) {
            if (!filterLeftoverView(viewGroup, i)) {
                i++;
            }
        }
    }

    protected void addItemView(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.mMenuView).addView(view, i);
    }

    protected boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // android.support.v7.view.menu.l
    public void setCallback(l.a aVar) {
        this.mCallback = aVar;
    }

    public l.a getCallback() {
        return this.mCallback;
    }

    public m.a createItemView(ViewGroup viewGroup) {
        return (m.a) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        m.a aVar;
        if (view instanceof m.a) {
            aVar = (m.a) view;
        } else {
            aVar = createItemView(viewGroup);
        }
        bindItemView(menuItemImpl, aVar);
        return (View) aVar;
    }

    @Override // android.support.v7.view.menu.l
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.support.v7.view.menu.l
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (this.mCallback != null) {
            return this.mCallback.onOpenSubMenu(subMenuBuilder);
        }
        return false;
    }

    public int getId() {
        return this.mId;
    }

    public void setId(int i) {
        this.mId = i;
    }
}
