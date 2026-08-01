package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f2183a;

    /* renamed from: b, reason: collision with root package name */
    public int f2184b = -1;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2185d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2186e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2187f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z3, int i4) {
        this.f2185d = z3;
        this.f2186e = layoutInflater;
        this.f2183a = mVar;
        this.f2187f = i4;
        a();
    }

    public final void a() {
        m mVar = this.f2183a;
        o oVar = mVar.f2207v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2195j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f2184b = i4;
                    return;
                }
            }
        }
        this.f2184b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        ArrayList l4;
        boolean z3 = this.f2185d;
        m mVar = this.f2183a;
        if (z3) {
            mVar.i();
            l4 = mVar.f2195j;
        } else {
            l4 = mVar.l();
        }
        int i5 = this.f2184b;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (o) l4.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l4;
        boolean z3 = this.f2185d;
        m mVar = this.f2183a;
        if (z3) {
            mVar.i();
            l4 = mVar.f2195j;
        } else {
            l4 = mVar.l();
        }
        return this.f2184b < 0 ? l4.size() : l4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f2186e.inflate(this.f2187f, viewGroup, false);
        }
        int i5 = getItem(i4).f2212b;
        int i6 = i4 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f2212b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2183a.m() && i5 != i7) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        z zVar = (z) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.b(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
