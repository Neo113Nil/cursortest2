package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final j f13641a;

    /* renamed from: b, reason: collision with root package name */
    public int f13642b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13643c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13644d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f13645e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13646f;

    public h(j jVar, LayoutInflater layoutInflater, boolean z, int i4) {
        this.f13644d = z;
        this.f13645e = layoutInflater;
        this.f13641a = jVar;
        this.f13646f = i4;
        a();
    }

    public final void a() {
        j jVar = this.f13641a;
        k kVar = jVar.f13664t;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f13656j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((k) arrayList.get(i4)) == kVar) {
                    this.f13642b = i4;
                    return;
                }
            }
        }
        this.f13642b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i4) {
        ArrayList k4;
        boolean z = this.f13644d;
        j jVar = this.f13641a;
        if (z) {
            jVar.i();
            k4 = jVar.f13656j;
        } else {
            k4 = jVar.k();
        }
        int i5 = this.f13642b;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (k) k4.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k4;
        boolean z = this.f13644d;
        j jVar = this.f13641a;
        if (z) {
            jVar.i();
            k4 = jVar.f13656j;
        } else {
            k4 = jVar.k();
        }
        return this.f13642b < 0 ? k4.size() : k4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f13645e.inflate(this.f13646f, viewGroup, false);
        }
        int i5 = getItem(i4).f13669b;
        int i6 = i4 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f13669b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f13641a.l() && i5 != i7) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        q qVar = (q) view;
        if (this.f13643c) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
