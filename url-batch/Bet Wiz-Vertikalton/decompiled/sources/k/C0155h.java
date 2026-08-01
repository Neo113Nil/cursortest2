package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.neonpulse.gridlogic.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2648a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0156i f2649b;

    public C0155h(C0156i c0156i) {
        this.f2649b = c0156i;
        a();
    }

    public final void a() {
        MenuC0160m menuC0160m = this.f2649b.f2652c;
        C0162o c0162o = menuC0160m.f2679v;
        if (c0162o != null) {
            menuC0160m.i();
            ArrayList arrayList = menuC0160m.f2667j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0162o) arrayList.get(i)) == c0162o) {
                    this.f2648a = i;
                    return;
                }
            }
        }
        this.f2648a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0162o getItem(int i) {
        C0156i c0156i = this.f2649b;
        MenuC0160m menuC0160m = c0156i.f2652c;
        menuC0160m.i();
        ArrayList arrayList = menuC0160m.f2667j;
        c0156i.getClass();
        int i2 = this.f2648a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0162o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0156i c0156i = this.f2649b;
        MenuC0160m menuC0160m = c0156i.f2652c;
        menuC0160m.i();
        int size = menuC0160m.f2667j.size();
        c0156i.getClass();
        return this.f2648a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2649b.f2651b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0173z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
