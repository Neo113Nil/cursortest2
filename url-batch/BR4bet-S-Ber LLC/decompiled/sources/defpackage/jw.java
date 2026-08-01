package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jw extends BaseAdapter {
    public final mw a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public jw(mw mwVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = mwVar;
        this.f = i;
        a();
    }

    public final void a() {
        mw mwVar = this.a;
        qw qwVar = mwVar.v;
        if (qwVar != null) {
            mwVar.i();
            ArrayList arrayList = mwVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((qw) arrayList.get(i)) == qwVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qw getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        mw mwVar = this.a;
        if (z) {
            mwVar.i();
            l = mwVar.j;
        } else {
            l = mwVar.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (qw) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        mw mwVar = this.a;
        if (z) {
            mwVar.i();
            l = mwVar.j;
        } else {
            l = mwVar.l();
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
        ex exVar = (ex) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        exVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
