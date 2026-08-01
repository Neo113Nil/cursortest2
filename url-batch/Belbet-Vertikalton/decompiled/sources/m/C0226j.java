package m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0229m f3342a;

    /* renamed from: b, reason: collision with root package name */
    public int f3343b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3344c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3345d;
    public final LayoutInflater e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3346f;

    public C0226j(MenuC0229m menuC0229m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f3345d = z2;
        this.e = layoutInflater;
        this.f3342a = menuC0229m;
        this.f3346f = i;
        a();
    }

    public final void a() {
        MenuC0229m menuC0229m = this.f3342a;
        C0231o c0231o = menuC0229m.f3366v;
        if (c0231o != null) {
            menuC0229m.i();
            ArrayList arrayList = menuC0229m.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0231o) arrayList.get(i)) == c0231o) {
                    this.f3343b = i;
                    return;
                }
            }
        }
        this.f3343b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0231o getItem(int i) {
        ArrayList l2;
        MenuC0229m menuC0229m = this.f3342a;
        if (this.f3345d) {
            menuC0229m.i();
            l2 = menuC0229m.j;
        } else {
            l2 = menuC0229m.l();
        }
        int i2 = this.f3343b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0231o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0229m menuC0229m = this.f3342a;
        if (this.f3345d) {
            menuC0229m.i();
            l2 = menuC0229m.j;
        } else {
            l2 = menuC0229m.l();
        }
        return this.f3343b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.e.inflate(this.f3346f, viewGroup, false);
        }
        int i2 = getItem(i).f3376b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3376b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3342a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0242z interfaceC0242z = (InterfaceC0242z) view;
        if (this.f3344c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0242z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
