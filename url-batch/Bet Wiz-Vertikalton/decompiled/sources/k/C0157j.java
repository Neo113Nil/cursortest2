package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0160m f2655a;

    /* renamed from: b, reason: collision with root package name */
    public int f2656b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2657c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2659f;

    public C0157j(MenuC0160m menuC0160m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2658e = layoutInflater;
        this.f2655a = menuC0160m;
        this.f2659f = i;
        a();
    }

    public final void a() {
        MenuC0160m menuC0160m = this.f2655a;
        C0162o c0162o = menuC0160m.f2679v;
        if (c0162o != null) {
            menuC0160m.i();
            ArrayList arrayList = menuC0160m.f2667j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0162o) arrayList.get(i)) == c0162o) {
                    this.f2656b = i;
                    return;
                }
            }
        }
        this.f2656b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0162o getItem(int i) {
        ArrayList l2;
        MenuC0160m menuC0160m = this.f2655a;
        if (this.d) {
            menuC0160m.i();
            l2 = menuC0160m.f2667j;
        } else {
            l2 = menuC0160m.l();
        }
        int i2 = this.f2656b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0162o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0160m menuC0160m = this.f2655a;
        if (this.d) {
            menuC0160m.i();
            l2 = menuC0160m.f2667j;
        } else {
            l2 = menuC0160m.l();
        }
        return this.f2656b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2658e.inflate(this.f2659f, viewGroup, false);
        }
        int i2 = getItem(i).f2689b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2689b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2655a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0173z interfaceC0173z = (InterfaceC0173z) view;
        if (this.f2657c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0173z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
