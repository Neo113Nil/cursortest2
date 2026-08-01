package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.winfour.neondrop.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2752a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2753b;

    public C0170h(i iVar) {
        this.f2753b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f2753b.f2756c;
        o oVar = mVar.f2783v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2771j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f2752a = i;
                    return;
                }
            }
        }
        this.f2752a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        i iVar = this.f2753b;
        m mVar = iVar.f2756c;
        mVar.i();
        ArrayList arrayList = mVar.f2771j;
        iVar.getClass();
        int i2 = this.f2752a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f2753b;
        m mVar = iVar.f2756c;
        mVar.i();
        int size = mVar.f2771j.size();
        iVar.getClass();
        return this.f2752a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2753b.f2755b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
