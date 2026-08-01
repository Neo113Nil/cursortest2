package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0189m f3157a;

    /* renamed from: b, reason: collision with root package name */
    public int f3158b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3159c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f3160e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3161f;

    public C0186j(MenuC0189m menuC0189m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f3160e = layoutInflater;
        this.f3157a = menuC0189m;
        this.f3161f = i;
        a();
    }

    public final void a() {
        MenuC0189m menuC0189m = this.f3157a;
        C0192p c0192p = menuC0189m.f3181v;
        if (c0192p != null) {
            menuC0189m.i();
            ArrayList arrayList = menuC0189m.f3169j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0192p) arrayList.get(i)) == c0192p) {
                    this.f3158b = i;
                    return;
                }
            }
        }
        this.f3158b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0192p getItem(int i) {
        ArrayList l2;
        MenuC0189m menuC0189m = this.f3157a;
        if (this.d) {
            menuC0189m.i();
            l2 = menuC0189m.f3169j;
        } else {
            l2 = menuC0189m.l();
        }
        int i2 = this.f3158b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0192p) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0189m menuC0189m = this.f3157a;
        if (this.d) {
            menuC0189m.i();
            l2 = menuC0189m.f3169j;
        } else {
            l2 = menuC0189m.l();
        }
        return this.f3158b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f3160e.inflate(this.f3161f, viewGroup, false);
        }
        int i2 = getItem(i).f3192b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3192b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3157a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0171A interfaceC0171A = (InterfaceC0171A) view;
        if (this.f3159c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0171A.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
