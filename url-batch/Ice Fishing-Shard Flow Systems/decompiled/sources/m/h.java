package m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f6395d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f6396e;

    public h(i iVar) {
        this.f6396e = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f6396e.f6399i;
        o oVar = mVar.f6431w;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((o) arrayList.get(i2)) == oVar) {
                    this.f6395d = i2;
                    return;
                }
            }
        }
        this.f6395d = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i2) {
        i iVar = this.f6396e;
        m mVar = iVar.f6399i;
        mVar.i();
        ArrayList arrayList = mVar.j;
        iVar.getClass();
        int i5 = this.f6395d;
        if (i5 >= 0 && i2 >= i5) {
            i2++;
        }
        return (o) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f6396e;
        m mVar = iVar.f6399i;
        mVar.i();
        int size = mVar.j.size();
        iVar.getClass();
        return this.f6395d < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f6396e.f6398e.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0672A) view).a(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
