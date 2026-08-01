package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0166m f2707a;

    /* renamed from: b, reason: collision with root package name */
    public int f2708b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2709c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2710e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2711f;

    public C0163j(MenuC0166m menuC0166m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2710e = layoutInflater;
        this.f2707a = menuC0166m;
        this.f2711f = i;
        a();
    }

    public final void a() {
        MenuC0166m menuC0166m = this.f2707a;
        C0168o c0168o = menuC0166m.f2731v;
        if (c0168o != null) {
            menuC0166m.i();
            ArrayList arrayList = menuC0166m.f2719j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0168o) arrayList.get(i)) == c0168o) {
                    this.f2708b = i;
                    return;
                }
            }
        }
        this.f2708b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0168o getItem(int i) {
        ArrayList l2;
        MenuC0166m menuC0166m = this.f2707a;
        if (this.d) {
            menuC0166m.i();
            l2 = menuC0166m.f2719j;
        } else {
            l2 = menuC0166m.l();
        }
        int i2 = this.f2708b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0168o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0166m menuC0166m = this.f2707a;
        if (this.d) {
            menuC0166m.i();
            l2 = menuC0166m.f2719j;
        } else {
            l2 = menuC0166m.l();
        }
        return this.f2708b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2710e.inflate(this.f2711f, viewGroup, false);
        }
        int i2 = getItem(i).f2741b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2741b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2707a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0179z interfaceC0179z = (InterfaceC0179z) view;
        if (this.f2709c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0179z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
