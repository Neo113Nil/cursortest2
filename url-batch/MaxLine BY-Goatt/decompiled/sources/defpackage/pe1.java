package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.majelw.libystne.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pe1 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ qe1 b;

    public pe1(qe1 qe1Var) {
        this.b = qe1Var;
        a();
    }

    public final void a() {
        fk1 fk1Var = this.b.o;
        lk1 lk1Var = fk1Var.v;
        if (lk1Var != null) {
            fk1Var.i();
            ArrayList arrayList = fk1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((lk1) arrayList.get(i)) == lk1Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lk1 getItem(int i) {
        qe1 qe1Var = this.b;
        fk1 fk1Var = qe1Var.o;
        fk1Var.i();
        ArrayList arrayList = fk1Var.j;
        qe1Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (lk1) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        qe1 qe1Var = this.b;
        fk1 fk1Var = qe1Var.o;
        fk1Var.i();
        int size = fk1Var.j.size();
        qe1Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.n.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((bl1) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
