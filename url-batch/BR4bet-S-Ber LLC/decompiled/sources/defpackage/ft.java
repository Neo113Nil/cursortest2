package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ft extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ gt b;

    public ft(gt gtVar) {
        this.b = gtVar;
        a();
    }

    public final void a() {
        mw mwVar = this.b.h;
        qw qwVar = mwVar.v;
        if (qwVar != null) {
            mwVar.i();
            ArrayList arrayList = mwVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((qw) arrayList.get(i)) == qwVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qw getItem(int i) {
        gt gtVar = this.b;
        mw mwVar = gtVar.h;
        mwVar.i();
        ArrayList arrayList = mwVar.j;
        gtVar.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (qw) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        gt gtVar = this.b;
        mw mwVar = gtVar.h;
        mwVar.i();
        int size = mwVar.j.size();
        gtVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((ex) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
