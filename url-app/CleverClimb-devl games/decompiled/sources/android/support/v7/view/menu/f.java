package android.support.v7.view.menu;

import android.support.v7.appcompat.R;
import android.support.v7.view.menu.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    static final int f1777a = R.layout.abc_popup_menu_item_layout;

    /* renamed from: b, reason: collision with root package name */
    MenuBuilder f1778b;

    /* renamed from: c, reason: collision with root package name */
    private int f1779c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1780d;
    private final boolean e;
    private final LayoutInflater f;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public f(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z) {
        this.e = z;
        this.f = layoutInflater;
        this.f1778b = menuBuilder;
        b();
    }

    public void a(boolean z) {
        this.f1780d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<MenuItemImpl> l = this.e ? this.f1778b.l() : this.f1778b.i();
        if (this.f1779c < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    public MenuBuilder a() {
        return this.f1778b;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public MenuItemImpl getItem(int i) {
        ArrayList<MenuItemImpl> l = this.e ? this.f1778b.l() : this.f1778b.i();
        if (this.f1779c >= 0 && i >= this.f1779c) {
            i++;
        }
        return l.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(f1777a, viewGroup, false);
        }
        m.a aVar = (m.a) view;
        if (this.f1780d) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    void b() {
        MenuItemImpl r = this.f1778b.r();
        if (r != null) {
            ArrayList<MenuItemImpl> l = this.f1778b.l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                if (l.get(i) == r) {
                    this.f1779c = i;
                    return;
                }
            }
        }
        this.f1779c = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
