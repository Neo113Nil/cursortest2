package m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final m f6403d;

    /* renamed from: e, reason: collision with root package name */
    public int f6404e = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6405i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6406l;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutInflater f6407m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6408n;

    public j(m mVar, LayoutInflater layoutInflater, boolean z7, int i2) {
        this.f6406l = z7;
        this.f6407m = layoutInflater;
        this.f6403d = mVar;
        this.f6408n = i2;
        a();
    }

    public final void a() {
        m mVar = this.f6403d;
        o oVar = mVar.f6431w;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((o) arrayList.get(i2)) == oVar) {
                    this.f6404e = i2;
                    return;
                }
            }
        }
        this.f6404e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i2) {
        ArrayList l7;
        boolean z7 = this.f6406l;
        m mVar = this.f6403d;
        if (z7) {
            mVar.i();
            l7 = mVar.j;
        } else {
            l7 = mVar.l();
        }
        int i5 = this.f6404e;
        if (i5 >= 0 && i2 >= i5) {
            i2++;
        }
        return (o) l7.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l7;
        boolean z7 = this.f6406l;
        m mVar = this.f6403d;
        if (z7) {
            mVar.i();
            l7 = mVar.j;
        } else {
            l7 = mVar.l();
        }
        return this.f6404e < 0 ? l7.size() : l7.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z7 = false;
        if (view == null) {
            view = this.f6407m.inflate(this.f6408n, viewGroup, false);
        }
        int i5 = getItem(i2).f6441b;
        int i7 = i2 - 1;
        int i8 = i7 >= 0 ? getItem(i7).f6441b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f6403d.m() && i5 != i8) {
            z7 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z7);
        InterfaceC0672A interfaceC0672A = (InterfaceC0672A) view;
        if (this.f6405i) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0672A.a(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
