package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final i f5658a;

    /* renamed from: b, reason: collision with root package name */
    public int f5659b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5660c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5661d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f5662e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5663f;

    public g(i iVar, LayoutInflater layoutInflater, boolean z10, int i3) {
        this.f5661d = z10;
        this.f5662e = layoutInflater;
        this.f5658a = iVar;
        this.f5663f = i3;
        a();
    }

    public final void a() {
        i iVar = this.f5658a;
        j jVar = iVar.f5681s;
        if (jVar != null) {
            iVar.i();
            ArrayList arrayList = iVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((j) arrayList.get(i3)) == jVar) {
                    this.f5659b = i3;
                    return;
                }
            }
        }
        this.f5659b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i3) {
        ArrayList k10;
        boolean z10 = this.f5661d;
        i iVar = this.f5658a;
        if (z10) {
            iVar.i();
            k10 = iVar.j;
        } else {
            k10 = iVar.k();
        }
        int i10 = this.f5659b;
        if (i10 >= 0 && i3 >= i10) {
            i3++;
        }
        return (j) k10.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k10;
        boolean z10 = this.f5661d;
        i iVar = this.f5658a;
        if (z10) {
            iVar.i();
            k10 = iVar.j;
        } else {
            k10 = iVar.k();
        }
        return this.f5659b < 0 ? k10.size() : k10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f5662e.inflate(this.f5663f, viewGroup, false);
        }
        int i10 = getItem(i3).f5684b;
        int i11 = i3 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f5684b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f5658a.l() && i10 != i12) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        p pVar = (p) view;
        if (this.f5660c) {
            listMenuItemView.setForceShowIcon(true);
        }
        pVar.b(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
