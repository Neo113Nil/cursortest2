package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final i f4063a;

    /* renamed from: b, reason: collision with root package name */
    public int f4064b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4065c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4066d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f4067e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4068f;

    public g(i iVar, LayoutInflater layoutInflater, boolean z3, int i) {
        this.f4066d = z3;
        this.f4067e = layoutInflater;
        this.f4063a = iVar;
        this.f4068f = i;
        a();
    }

    public final void a() {
        i iVar = this.f4063a;
        j jVar = iVar.f4087s;
        if (jVar != null) {
            iVar.i();
            ArrayList arrayList = iVar.f4078j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((j) arrayList.get(i)) == jVar) {
                    this.f4064b = i;
                    return;
                }
            }
        }
        this.f4064b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i) {
        ArrayList k3;
        boolean z3 = this.f4066d;
        i iVar = this.f4063a;
        if (z3) {
            iVar.i();
            k3 = iVar.f4078j;
        } else {
            k3 = iVar.k();
        }
        int i8 = this.f4064b;
        if (i8 >= 0 && i >= i8) {
            i++;
        }
        return (j) k3.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        boolean z3 = this.f4066d;
        i iVar = this.f4063a;
        if (z3) {
            iVar.i();
            k3 = iVar.f4078j;
        } else {
            k3 = iVar.k();
        }
        return this.f4064b < 0 ? k3.size() : k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f4067e.inflate(this.f4068f, viewGroup, false);
        }
        int i8 = getItem(i).f4090b;
        int i9 = i - 1;
        int i10 = i9 >= 0 ? getItem(i9).f4090b : i8;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4063a.l() && i8 != i10) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        p pVar = (p) view;
        if (this.f4065c) {
            listMenuItemView.setForceShowIcon(true);
        }
        pVar.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
