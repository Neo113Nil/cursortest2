package h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141h extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final MenuC0143j f2002e;

    /* renamed from: f, reason: collision with root package name */
    public int f2003f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2004g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2005h;

    /* renamed from: i, reason: collision with root package name */
    public final LayoutInflater f2006i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2007j;

    public C0141h(MenuC0143j menuC0143j, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f2005h = z2;
        this.f2006i = layoutInflater;
        this.f2002e = menuC0143j;
        this.f2007j = i2;
        a();
    }

    public final void a() {
        MenuC0143j menuC0143j = this.f2002e;
        MenuItemC0144k menuItemC0144k = menuC0143j.f2027s;
        if (menuItemC0144k != null) {
            menuC0143j.i();
            ArrayList arrayList = menuC0143j.f2018j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((MenuItemC0144k) arrayList.get(i2)) == menuItemC0144k) {
                    this.f2003f = i2;
                    return;
                }
            }
        }
        this.f2003f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC0144k getItem(int i2) {
        ArrayList k2;
        boolean z2 = this.f2005h;
        MenuC0143j menuC0143j = this.f2002e;
        if (z2) {
            menuC0143j.i();
            k2 = menuC0143j.f2018j;
        } else {
            k2 = menuC0143j.k();
        }
        int i3 = this.f2003f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (MenuItemC0144k) k2.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k2;
        boolean z2 = this.f2005h;
        MenuC0143j menuC0143j = this.f2002e;
        if (z2) {
            menuC0143j.i();
            k2 = menuC0143j.f2018j;
        } else {
            k2 = menuC0143j.k();
        }
        return this.f2003f < 0 ? k2.size() : k2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2006i.inflate(this.f2007j, viewGroup, false);
        }
        int i3 = getItem(i2).f2031b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2031b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2002e.l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        q qVar = (q) view;
        if (this.f2004g) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.a(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
