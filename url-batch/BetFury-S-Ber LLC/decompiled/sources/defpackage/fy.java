package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fy extends BaseAdapter {
    public int f = -1;
    public final /* synthetic */ gy g;

    public fy(gy gyVar) {
        this.g = gyVar;
        a();
    }

    public final void a() {
        r10 r10Var = this.g.h;
        u10 u10Var = r10Var.v;
        if (u10Var != null) {
            r10Var.i();
            ArrayList arrayList = r10Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((u10) arrayList.get(i)) == u10Var) {
                    this.f = i;
                    return;
                }
            }
        }
        this.f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u10 getItem(int i) {
        gy gyVar = this.g;
        r10 r10Var = gyVar.h;
        r10Var.i();
        ArrayList arrayList = r10Var.j;
        gyVar.getClass();
        int i2 = this.f;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (u10) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        gy gyVar = this.g;
        r10 r10Var = gyVar.h;
        r10Var.i();
        int size = r10Var.j.size();
        gyVar.getClass();
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
        ((i20) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
