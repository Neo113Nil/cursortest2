package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f2054a;

    /* renamed from: b, reason: collision with root package name */
    public int f2055b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2056c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2057e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2058f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z3, int i) {
        this.d = z3;
        this.f2057e = layoutInflater;
        this.f2054a = mVar;
        this.f2058f = i;
        a();
    }

    public final void a() {
        m mVar = this.f2054a;
        o oVar = mVar.f2079v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2067j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f2055b = i;
                    return;
                }
            }
        }
        this.f2055b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        ArrayList l4;
        boolean z3 = this.d;
        m mVar = this.f2054a;
        if (z3) {
            mVar.i();
            l4 = mVar.f2067j;
        } else {
            l4 = mVar.l();
        }
        int i4 = this.f2055b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) l4.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l4;
        boolean z3 = this.d;
        m mVar = this.f2054a;
        if (z3) {
            mVar.i();
            l4 = mVar.f2067j;
        } else {
            l4 = mVar.l();
        }
        return this.f2055b < 0 ? l4.size() : l4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f2057e.inflate(this.f2058f, viewGroup, false);
        }
        int i4 = getItem(i).f2086b;
        int i5 = i - 1;
        int i6 = i5 >= 0 ? getItem(i5).f2086b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2054a.m() && i4 != i6) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        z zVar = (z) view;
        if (this.f2056c) {
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
