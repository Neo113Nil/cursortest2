package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.awerser.monnit.betplay.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cr extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ dr b;

    public cr(dr drVar) {
        this.b = drVar;
        a();
    }

    public final void a() {
        au auVar = this.b.h;
        eu euVar = auVar.v;
        if (euVar != null) {
            auVar.i();
            ArrayList arrayList = auVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((eu) arrayList.get(i)) == euVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eu getItem(int i) {
        dr drVar = this.b;
        au auVar = drVar.h;
        auVar.i();
        ArrayList arrayList = auVar.j;
        drVar.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (eu) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        dr drVar = this.b;
        au auVar = drVar.h;
        auVar.i();
        int size = auVar.j.size();
        drVar.getClass();
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
        ((su) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
