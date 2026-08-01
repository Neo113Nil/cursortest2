package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2047a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2048b;

    public h(i iVar) {
        this.f2048b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f2048b.f2051h;
        o oVar = mVar.f2079v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2067j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f2047a = i;
                    return;
                }
            }
        }
        this.f2047a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        i iVar = this.f2048b;
        m mVar = iVar.f2051h;
        mVar.i();
        ArrayList arrayList = mVar.f2067j;
        iVar.getClass();
        int i4 = this.f2047a;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f2048b;
        m mVar = iVar.f2051h;
        mVar.i();
        int size = mVar.f2067j.size();
        iVar.getClass();
        return this.f2047a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2048b.f2050g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
