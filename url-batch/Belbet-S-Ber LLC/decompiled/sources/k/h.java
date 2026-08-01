package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2199a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2200b;

    public h(i iVar) {
        this.f2200b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f2200b.h;
        o oVar = mVar.f2229v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2217j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f2199a = i;
                    return;
                }
            }
        }
        this.f2199a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        i iVar = this.f2200b;
        m mVar = iVar.h;
        mVar.i();
        ArrayList arrayList = mVar.f2217j;
        iVar.getClass();
        int i4 = this.f2199a;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f2200b;
        m mVar = iVar.h;
        mVar.i();
        int size = mVar.f2217j.size();
        iVar.getClass();
        return this.f2199a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2200b.f2202g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
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
