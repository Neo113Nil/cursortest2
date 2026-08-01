package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0164m f2679a;

    /* renamed from: b, reason: collision with root package name */
    public int f2680b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2681c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2682e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2683f;

    public C0161j(MenuC0164m menuC0164m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2682e = layoutInflater;
        this.f2679a = menuC0164m;
        this.f2683f = i;
        a();
    }

    public final void a() {
        MenuC0164m menuC0164m = this.f2679a;
        C0166o c0166o = menuC0164m.f2703v;
        if (c0166o != null) {
            menuC0164m.i();
            ArrayList arrayList = menuC0164m.f2691j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0166o) arrayList.get(i)) == c0166o) {
                    this.f2680b = i;
                    return;
                }
            }
        }
        this.f2680b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0166o getItem(int i) {
        ArrayList l2;
        MenuC0164m menuC0164m = this.f2679a;
        if (this.d) {
            menuC0164m.i();
            l2 = menuC0164m.f2691j;
        } else {
            l2 = menuC0164m.l();
        }
        int i2 = this.f2680b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0166o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0164m menuC0164m = this.f2679a;
        if (this.d) {
            menuC0164m.i();
            l2 = menuC0164m.f2691j;
        } else {
            l2 = menuC0164m.l();
        }
        return this.f2680b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2682e.inflate(this.f2683f, viewGroup, false);
        }
        int i2 = getItem(i).f2713b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2713b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2679a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0177z interfaceC0177z = (InterfaceC0177z) view;
        if (this.f2681c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0177z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
