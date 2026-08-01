package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class jt extends BaseAdapter {
    public final mt f;
    public int g = -1;
    public boolean h;
    public final boolean i;
    public final LayoutInflater j;
    public final int k;

    public jt(mt mtVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.i = z;
        this.j = layoutInflater;
        this.f = mtVar;
        this.k = i;
        a();
    }

    public final void a() {
        mt mtVar = this.f;
        pt ptVar = mtVar.v;
        if (ptVar != null) {
            mtVar.i();
            ArrayList arrayList = mtVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((pt) arrayList.get(i)) == ptVar) {
                    this.g = i;
                    return;
                }
            }
        }
        this.g = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pt getItem(int i) {
        ArrayList l;
        boolean z = this.i;
        mt mtVar = this.f;
        if (z) {
            mtVar.i();
            l = mtVar.j;
        } else {
            l = mtVar.l();
        }
        int i2 = this.g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (pt) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.i;
        mt mtVar = this.f;
        if (z) {
            mtVar.i();
            l = mtVar.j;
        } else {
            l = mtVar.l();
        }
        return this.g < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.j.inflate(this.k, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        du duVar = (du) view;
        if (this.h) {
            listMenuItemView.setForceShowIcon(true);
        }
        duVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
