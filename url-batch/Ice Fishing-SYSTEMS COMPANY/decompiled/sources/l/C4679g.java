package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4679g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f38931a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4680h f38932b;

    public C4679g(C4680h c4680h) {
        this.f38932b = c4680h;
        a();
    }

    public final void a() {
        l lVar = this.f38932b.f38935v;
        n nVar = lVar.f38959O;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f38948C;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n) arrayList.get(i)) == nVar) {
                    this.f38931a = i;
                    return;
                }
            }
        }
        this.f38931a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i) {
        C4680h c4680h = this.f38932b;
        l lVar = c4680h.f38935v;
        lVar.i();
        ArrayList arrayList = lVar.f38948C;
        c4680h.getClass();
        int i4 = this.f38931a;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (n) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C4680h c4680h = this.f38932b;
        l lVar = c4680h.f38935v;
        lVar.i();
        int size = lVar.f38948C.size();
        c4680h.getClass();
        return this.f38931a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f38932b.f38934u.inflate(C5284R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
