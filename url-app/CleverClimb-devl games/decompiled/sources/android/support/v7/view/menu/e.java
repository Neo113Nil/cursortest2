package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class e implements l, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f1771a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f1772b;

    /* renamed from: c, reason: collision with root package name */
    MenuBuilder f1773c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f1774d;
    int e;
    int f;
    int g;
    a h;
    private l.a i;

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

    public e(Context context, int i) {
        this(i, 0);
        this.f1771a = context;
        this.f1772b = LayoutInflater.from(this.f1771a);
    }

    public e(int i, int i2) {
        this.g = i;
        this.f = i2;
    }

    @Override // android.support.v7.view.menu.l
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        if (this.f != 0) {
            this.f1771a = new ContextThemeWrapper(context, this.f);
            this.f1772b = LayoutInflater.from(this.f1771a);
        } else if (this.f1771a != null) {
            this.f1771a = context;
            if (this.f1772b == null) {
                this.f1772b = LayoutInflater.from(this.f1771a);
            }
        }
        this.f1773c = menuBuilder;
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    public m a(ViewGroup viewGroup) {
        if (this.f1774d == null) {
            this.f1774d = (ExpandedMenuView) this.f1772b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.h == null) {
                this.h = new a();
            }
            this.f1774d.setAdapter((ListAdapter) this.h);
            this.f1774d.setOnItemClickListener(this);
        }
        return this.f1774d;
    }

    public ListAdapter a() {
        if (this.h == null) {
            this.h = new a();
        }
        return this.h;
    }

    @Override // android.support.v7.view.menu.l
    public void updateMenuView(boolean z) {
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.l
    public void setCallback(l.a aVar) {
        this.i = aVar;
    }

    @Override // android.support.v7.view.menu.l
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new g(subMenuBuilder).a(null);
        if (this.i == null) {
            return true;
        }
        this.i.onOpenSubMenu(subMenuBuilder);
        return true;
    }

    @Override // android.support.v7.view.menu.l
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.i != null) {
            this.i.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1773c.a(this.h.getItem(i), this, 0);
    }

    /* compiled from: ListMenuPresenter.java */
    private class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        private int f1776b = -1;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public a() {
            a();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f1773c.l().size() - e.this.e;
            return this.f1776b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MenuItemImpl getItem(int i) {
            ArrayList<MenuItemImpl> l = e.this.f1773c.l();
            int i2 = i + e.this.e;
            if (this.f1776b >= 0 && i2 >= this.f1776b) {
                i2++;
            }
            return l.get(i2);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.f1772b.inflate(e.this.g, viewGroup, false);
            }
            ((m.a) view).a(getItem(i), 0);
            return view;
        }

        void a() {
            MenuItemImpl r = e.this.f1773c.r();
            if (r != null) {
                ArrayList<MenuItemImpl> l = e.this.f1773c.l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (l.get(i) == r) {
                        this.f1776b = i;
                        return;
                    }
                }
            }
            this.f1776b = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }
}
