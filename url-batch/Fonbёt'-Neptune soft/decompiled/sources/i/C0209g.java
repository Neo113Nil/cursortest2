package i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209g extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final MenuC0211i f2401e;

    /* renamed from: f, reason: collision with root package name */
    public int f2402f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2403g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2404h;

    /* renamed from: i, reason: collision with root package name */
    public final LayoutInflater f2405i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2406j;

    public C0209g(MenuC0211i menuC0211i, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f2404h = z2;
        this.f2405i = layoutInflater;
        this.f2401e = menuC0211i;
        this.f2406j = i2;
        a();
    }

    public final void a() {
        MenuC0211i menuC0211i = this.f2401e;
        MenuItemC0212j menuItemC0212j = menuC0211i.f2426s;
        if (menuItemC0212j != null) {
            menuC0211i.i();
            ArrayList arrayList = menuC0211i.f2417j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((MenuItemC0212j) arrayList.get(i2)) == menuItemC0212j) {
                    this.f2402f = i2;
                    return;
                }
            }
        }
        this.f2402f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC0212j getItem(int i2) {
        ArrayList k2;
        MenuC0211i menuC0211i = this.f2401e;
        if (this.f2404h) {
            menuC0211i.i();
            k2 = menuC0211i.f2417j;
        } else {
            k2 = menuC0211i.k();
        }
        int i3 = this.f2402f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (MenuItemC0212j) k2.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k2;
        MenuC0211i menuC0211i = this.f2401e;
        if (this.f2404h) {
            menuC0211i.i();
            k2 = menuC0211i.f2417j;
        } else {
            k2 = menuC0211i.k();
        }
        return this.f2402f < 0 ? k2.size() : k2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2405i.inflate(this.f2406j, viewGroup, false);
        }
        int i3 = getItem(i2).f2431b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2431b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2401e.l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0218p interfaceC0218p = (InterfaceC0218p) view;
        if (this.f2403g) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0218p.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
