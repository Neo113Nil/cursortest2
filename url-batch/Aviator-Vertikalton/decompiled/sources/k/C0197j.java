package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0200m f3050a;

    /* renamed from: b, reason: collision with root package name */
    public int f3051b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3052c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3053d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f3054e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3055f;

    public C0197j(MenuC0200m menuC0200m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f3053d = z2;
        this.f3054e = layoutInflater;
        this.f3050a = menuC0200m;
        this.f3055f = i;
        a();
    }

    public final void a() {
        MenuC0200m menuC0200m = this.f3050a;
        C0202o c0202o = menuC0200m.f3076v;
        if (c0202o != null) {
            menuC0200m.i();
            ArrayList arrayList = menuC0200m.f3064j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0202o) arrayList.get(i)) == c0202o) {
                    this.f3051b = i;
                    return;
                }
            }
        }
        this.f3051b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0202o getItem(int i) {
        ArrayList l2;
        MenuC0200m menuC0200m = this.f3050a;
        if (this.f3053d) {
            menuC0200m.i();
            l2 = menuC0200m.f3064j;
        } else {
            l2 = menuC0200m.l();
        }
        int i2 = this.f3051b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0202o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0200m menuC0200m = this.f3050a;
        if (this.f3053d) {
            menuC0200m.i();
            l2 = menuC0200m.f3064j;
        } else {
            l2 = menuC0200m.l();
        }
        return this.f3051b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f3054e.inflate(this.f3055f, viewGroup, false);
        }
        int i2 = getItem(i).f3086b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3086b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3050a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0213z interfaceC0213z = (InterfaceC0213z) view;
        if (this.f3052c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0213z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
