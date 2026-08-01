package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.derinko.gbini.n1casino.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qq extends BaseAdapter {
    public int f = -1;
    public final /* synthetic */ rq g;

    public qq(rq rqVar) {
        this.g = rqVar;
        a();
    }

    public final void a() {
        mt mtVar = this.g.h;
        pt ptVar = mtVar.v;
        if (ptVar != null) {
            mtVar.i();
            ArrayList arrayList = mtVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((pt) arrayList.get(i)) == ptVar) {
                    this.f = i;
                    return;
                }
            }
        }
        this.f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pt getItem(int i) {
        rq rqVar = this.g;
        mt mtVar = rqVar.h;
        mtVar.i();
        ArrayList arrayList = mtVar.j;
        rqVar.getClass();
        int i2 = this.f;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (pt) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        rq rqVar = this.g;
        mt mtVar = rqVar.h;
        mtVar.i();
        int size = mtVar.j.size();
        rqVar.getClass();
        return this.f < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.g.g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((du) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
