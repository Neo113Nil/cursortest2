package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0167m f2740a;

    /* renamed from: b, reason: collision with root package name */
    public int f2741b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2742c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2743e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2744f;

    public C0164j(MenuC0167m menuC0167m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2743e = layoutInflater;
        this.f2740a = menuC0167m;
        this.f2744f = i;
        a();
    }

    public final void a() {
        MenuC0167m menuC0167m = this.f2740a;
        C0169o c0169o = menuC0167m.f2764v;
        if (c0169o != null) {
            menuC0167m.i();
            ArrayList arrayList = menuC0167m.f2752j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0169o) arrayList.get(i)) == c0169o) {
                    this.f2741b = i;
                    return;
                }
            }
        }
        this.f2741b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0169o getItem(int i) {
        ArrayList l2;
        MenuC0167m menuC0167m = this.f2740a;
        if (this.d) {
            menuC0167m.i();
            l2 = menuC0167m.f2752j;
        } else {
            l2 = menuC0167m.l();
        }
        int i2 = this.f2741b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0169o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0167m menuC0167m = this.f2740a;
        if (this.d) {
            menuC0167m.i();
            l2 = menuC0167m.f2752j;
        } else {
            l2 = menuC0167m.l();
        }
        return this.f2741b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2743e.inflate(this.f2744f, viewGroup, false);
        }
        int i2 = getItem(i).f2774b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2774b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2740a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0180z interfaceC0180z = (InterfaceC0180z) view;
        if (this.f2742c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0180z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
