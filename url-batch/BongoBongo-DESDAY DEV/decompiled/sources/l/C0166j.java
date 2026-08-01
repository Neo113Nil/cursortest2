package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0169m f2809a;

    /* renamed from: b, reason: collision with root package name */
    public int f2810b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2811c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2812e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2813f;

    public C0166j(MenuC0169m menuC0169m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2812e = layoutInflater;
        this.f2809a = menuC0169m;
        this.f2813f = i;
        a();
    }

    public final void a() {
        MenuC0169m menuC0169m = this.f2809a;
        C0171o c0171o = menuC0169m.f2834v;
        if (c0171o != null) {
            menuC0169m.i();
            ArrayList arrayList = menuC0169m.f2822j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0171o) arrayList.get(i)) == c0171o) {
                    this.f2810b = i;
                    return;
                }
            }
        }
        this.f2810b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0171o getItem(int i) {
        ArrayList l2;
        MenuC0169m menuC0169m = this.f2809a;
        if (this.d) {
            menuC0169m.i();
            l2 = menuC0169m.f2822j;
        } else {
            l2 = menuC0169m.l();
        }
        int i2 = this.f2810b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0171o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0169m menuC0169m = this.f2809a;
        if (this.d) {
            menuC0169m.i();
            l2 = menuC0169m.f2822j;
        } else {
            l2 = menuC0169m.l();
        }
        return this.f2810b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2812e.inflate(this.f2813f, viewGroup, false);
        }
        int i2 = getItem(i).f2844b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2844b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2809a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0182z interfaceC0182z = (InterfaceC0182z) view;
        if (this.f2811c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0182z.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
