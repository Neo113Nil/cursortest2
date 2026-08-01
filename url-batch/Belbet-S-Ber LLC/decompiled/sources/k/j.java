package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f2205a;

    /* renamed from: b, reason: collision with root package name */
    public int f2206b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2207c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2208e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2209f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z4, int i) {
        this.d = z4;
        this.f2208e = layoutInflater;
        this.f2205a = mVar;
        this.f2209f = i;
        a();
    }

    public final void a() {
        m mVar = this.f2205a;
        o oVar = mVar.f2229v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2217j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f2206b = i;
                    return;
                }
            }
        }
        this.f2206b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        ArrayList l4;
        boolean z4 = this.d;
        m mVar = this.f2205a;
        if (z4) {
            mVar.i();
            l4 = mVar.f2217j;
        } else {
            l4 = mVar.l();
        }
        int i4 = this.f2206b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) l4.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l4;
        boolean z4 = this.d;
        m mVar = this.f2205a;
        if (z4) {
            mVar.i();
            l4 = mVar.f2217j;
        } else {
            l4 = mVar.l();
        }
        return this.f2206b < 0 ? l4.size() : l4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f2208e.inflate(this.f2209f, viewGroup, false);
        }
        int i4 = getItem(i).f2235b;
        int i5 = i - 1;
        int i6 = i5 >= 0 ? getItem(i5).f2235b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2205a.m() && i4 != i6) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        z zVar = (z) view;
        if (this.f2207c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
