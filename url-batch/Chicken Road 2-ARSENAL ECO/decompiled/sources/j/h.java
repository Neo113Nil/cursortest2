package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public final j f4788f;

    /* renamed from: g, reason: collision with root package name */
    public int f4789g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4790h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4791i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f4792j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4793k;

    public h(j jVar, LayoutInflater layoutInflater, boolean z5, int i7) {
        this.f4791i = z5;
        this.f4792j = layoutInflater;
        this.f4788f = jVar;
        this.f4793k = i7;
        a();
    }

    public final void a() {
        j jVar = this.f4788f;
        k kVar = jVar.f4813s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f4804j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((k) arrayList.get(i7)) == kVar) {
                    this.f4789g = i7;
                    return;
                }
            }
        }
        this.f4789g = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i7) {
        ArrayList k4;
        boolean z5 = this.f4791i;
        j jVar = this.f4788f;
        if (z5) {
            jVar.i();
            k4 = jVar.f4804j;
        } else {
            k4 = jVar.k();
        }
        int i8 = this.f4789g;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (k) k4.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k4;
        boolean z5 = this.f4791i;
        j jVar = this.f4788f;
        if (z5) {
            jVar.i();
            k4 = jVar.f4804j;
        } else {
            k4 = jVar.k();
        }
        return this.f4789g < 0 ? k4.size() : k4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z5 = false;
        if (view == null) {
            view = this.f4792j.inflate(this.f4793k, viewGroup, false);
        }
        int i8 = getItem(i7).f4818b;
        int i9 = i7 - 1;
        int i10 = i9 >= 0 ? getItem(i9).f4818b : i8;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4788f.l() && i8 != i10) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        q qVar = (q) view;
        if (this.f4790h) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
