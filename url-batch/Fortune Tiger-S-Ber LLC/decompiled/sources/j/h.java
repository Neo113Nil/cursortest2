package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2177a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2178b;

    public h(i iVar) {
        this.f2178b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f2178b.h;
        o oVar = mVar.f2207v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2195j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f2177a = i4;
                    return;
                }
            }
        }
        this.f2177a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        i iVar = this.f2178b;
        m mVar = iVar.h;
        mVar.i();
        ArrayList arrayList = mVar.f2195j;
        iVar.getClass();
        int i5 = this.f2177a;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (o) arrayList.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f2178b;
        m mVar = iVar.h;
        mVar.i();
        int size = mVar.f2195j.size();
        iVar.getClass();
        return this.f2177a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2178b.g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).b(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
