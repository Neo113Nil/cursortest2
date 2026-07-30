package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ck1 extends BaseAdapter {
    public final fk1 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public ck1(fk1 fk1Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = fk1Var;
        this.f = i;
        a();
    }

    public final void a() {
        fk1 fk1Var = this.a;
        lk1 lk1Var = fk1Var.v;
        if (lk1Var != null) {
            fk1Var.i();
            ArrayList arrayList = fk1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((lk1) arrayList.get(i)) == lk1Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lk1 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        fk1 fk1Var = this.a;
        if (z) {
            fk1Var.i();
            l = fk1Var.j;
        } else {
            l = fk1Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (lk1) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        fk1 fk1Var = this.a;
        if (z) {
            fk1Var.i();
            l = fk1Var.j;
        } else {
            l = fk1Var.l();
        }
        return this.b < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        bl1 bl1Var = (bl1) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        bl1Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
