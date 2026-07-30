package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4681i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final l f38939a;

    /* renamed from: b, reason: collision with root package name */
    public int f38940b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38941c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38942d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f38943e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38944f;

    public C4681i(l lVar, LayoutInflater layoutInflater, boolean z8, int i) {
        this.f38942d = z8;
        this.f38943e = layoutInflater;
        this.f38939a = lVar;
        this.f38944f = i;
        a();
    }

    public final void a() {
        l lVar = this.f38939a;
        n nVar = lVar.f38959O;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f38948C;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n) arrayList.get(i)) == nVar) {
                    this.f38940b = i;
                    return;
                }
            }
        }
        this.f38940b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i) {
        ArrayList l9;
        l lVar = this.f38939a;
        if (this.f38942d) {
            lVar.i();
            l9 = lVar.f38948C;
        } else {
            l9 = lVar.l();
        }
        int i4 = this.f38940b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (n) l9.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l9;
        l lVar = this.f38939a;
        if (this.f38942d) {
            lVar.i();
            l9 = lVar.f38948C;
        } else {
            l9 = lVar.l();
        }
        return this.f38940b < 0 ? l9.size() : l9.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z8 = false;
        if (view == null) {
            view = this.f38943e.inflate(this.f38944f, viewGroup, false);
        }
        int i4 = getItem(i).f38994u;
        int i9 = i - 1;
        int i10 = i9 >= 0 ? getItem(i9).f38994u : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f38939a.m() && i4 != i10) {
            z8 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z8);
        y yVar = (y) view;
        if (this.f38941c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
