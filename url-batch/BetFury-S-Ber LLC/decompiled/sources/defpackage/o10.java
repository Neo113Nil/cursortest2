package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o10 extends BaseAdapter {
    public final r10 f;
    public int g = -1;
    public boolean h;
    public final boolean i;
    public final LayoutInflater j;
    public final int k;

    public o10(r10 r10Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.i = z;
        this.j = layoutInflater;
        this.f = r10Var;
        this.k = i;
        a();
    }

    public final void a() {
        r10 r10Var = this.f;
        u10 u10Var = r10Var.v;
        if (u10Var != null) {
            r10Var.i();
            ArrayList arrayList = r10Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((u10) arrayList.get(i)) == u10Var) {
                    this.g = i;
                    return;
                }
            }
        }
        this.g = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u10 getItem(int i) {
        ArrayList l;
        boolean z = this.i;
        r10 r10Var = this.f;
        if (z) {
            r10Var.i();
            l = r10Var.j;
        } else {
            l = r10Var.l();
        }
        int i2 = this.g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (u10) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.i;
        r10 r10Var = this.f;
        if (z) {
            r10Var.i();
            l = r10Var.j;
        } else {
            l = r10Var.l();
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
        i20 i20Var = (i20) view;
        if (this.h) {
            listMenuItemView.setForceShowIcon(true);
        }
        i20Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
