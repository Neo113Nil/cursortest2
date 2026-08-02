package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC1065j f9592a;

    /* renamed from: b, reason: collision with root package name */
    public int f9593b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9594c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9595d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f9596e;
    public final int f;

    public C1063h(MenuC1065j menuC1065j, LayoutInflater layoutInflater, boolean z, int i3) {
        this.f9595d = z;
        this.f9596e = layoutInflater;
        this.f9592a = menuC1065j;
        this.f = i3;
        a();
    }

    public final void a() {
        MenuC1065j menuC1065j = this.f9592a;
        MenuItemC1066k menuItemC1066k = menuC1065j.f9614t;
        if (menuItemC1066k != null) {
            menuC1065j.i();
            ArrayList arrayList = menuC1065j.f9605j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((MenuItemC1066k) arrayList.get(i3)) == menuItemC1066k) {
                    this.f9593b = i3;
                    return;
                }
            }
        }
        this.f9593b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC1066k getItem(int i3) {
        ArrayList k3;
        MenuC1065j menuC1065j = this.f9592a;
        if (this.f9595d) {
            menuC1065j.i();
            k3 = menuC1065j.f9605j;
        } else {
            k3 = menuC1065j.k();
        }
        int i4 = this.f9593b;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (MenuItemC1066k) k3.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        MenuC1065j menuC1065j = this.f9592a;
        if (this.f9595d) {
            menuC1065j.i();
            k3 = menuC1065j.f9605j;
        } else {
            k3 = menuC1065j.k();
        }
        return this.f9593b < 0 ? k3.size() : k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f9596e.inflate(this.f, viewGroup, false);
        }
        int i4 = getItem(i3).f9619b;
        int i5 = i3 - 1;
        int i6 = i5 >= 0 ? getItem(i5).f9619b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9592a.l() && i4 != i6) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC1072q interfaceC1072q = (InterfaceC1072q) view;
        if (this.f9594c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1072q.a(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
