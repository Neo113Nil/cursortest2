package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0161m f2606a;

    /* renamed from: b, reason: collision with root package name */
    public int f2607b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2608c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2609e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2610f;

    public C0158j(MenuC0161m menuC0161m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2609e = layoutInflater;
        this.f2606a = menuC0161m;
        this.f2610f = i;
        a();
    }

    public final void a() {
        MenuC0161m menuC0161m = this.f2606a;
        C0163o c0163o = menuC0161m.f2630v;
        if (c0163o != null) {
            menuC0161m.i();
            ArrayList arrayList = menuC0161m.f2618j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0163o) arrayList.get(i)) == c0163o) {
                    this.f2607b = i;
                    return;
                }
            }
        }
        this.f2607b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0163o getItem(int i) {
        ArrayList l2;
        MenuC0161m menuC0161m = this.f2606a;
        if (this.d) {
            menuC0161m.i();
            l2 = menuC0161m.f2618j;
        } else {
            l2 = menuC0161m.l();
        }
        int i2 = this.f2607b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0163o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0161m menuC0161m = this.f2606a;
        if (this.d) {
            menuC0161m.i();
            l2 = menuC0161m.f2618j;
        } else {
            l2 = menuC0161m.l();
        }
        return this.f2607b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2609e.inflate(this.f2610f, viewGroup, false);
        }
        int i2 = getItem(i).f2640b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2640b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2606a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0174z interfaceC0174z = (InterfaceC0174z) view;
        if (this.f2608c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0174z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
