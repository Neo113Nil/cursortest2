package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.fortunequest.neontrack.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f3150a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0185i f3151b;

    public C0184h(C0185i c0185i) {
        this.f3151b = c0185i;
        a();
    }

    public final void a() {
        MenuC0189m menuC0189m = this.f3151b.f3154c;
        C0192p c0192p = menuC0189m.f3181v;
        if (c0192p != null) {
            menuC0189m.i();
            ArrayList arrayList = menuC0189m.f3169j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0192p) arrayList.get(i)) == c0192p) {
                    this.f3150a = i;
                    return;
                }
            }
        }
        this.f3150a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0192p getItem(int i) {
        C0185i c0185i = this.f3151b;
        MenuC0189m menuC0189m = c0185i.f3154c;
        menuC0189m.i();
        ArrayList arrayList = menuC0189m.f3169j;
        c0185i.getClass();
        int i2 = this.f3150a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0192p) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0185i c0185i = this.f3151b;
        MenuC0189m menuC0189m = c0185i.f3154c;
        menuC0189m.i();
        int size = menuC0189m.f3169j.size();
        c0185i.getClass();
        return this.f3150a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3151b.f3153b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0171A) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
