package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.winworm.neongrid.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2700a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162i f2701b;

    public C0161h(C0162i c0162i) {
        this.f2701b = c0162i;
        a();
    }

    public final void a() {
        MenuC0166m menuC0166m = this.f2701b.f2704c;
        C0168o c0168o = menuC0166m.f2731v;
        if (c0168o != null) {
            menuC0166m.i();
            ArrayList arrayList = menuC0166m.f2719j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0168o) arrayList.get(i)) == c0168o) {
                    this.f2700a = i;
                    return;
                }
            }
        }
        this.f2700a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0168o getItem(int i) {
        C0162i c0162i = this.f2701b;
        MenuC0166m menuC0166m = c0162i.f2704c;
        menuC0166m.i();
        ArrayList arrayList = menuC0166m.f2719j;
        c0162i.getClass();
        int i2 = this.f2700a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0168o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0162i c0162i = this.f2701b;
        MenuC0166m menuC0166m = c0162i.f2704c;
        menuC0166m.i();
        int size = menuC0166m.f2719j.size();
        c0162i.getClass();
        return this.f2700a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2701b.f2703b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0179z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
