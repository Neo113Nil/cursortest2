package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.playbag.tripgear.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2672a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0160i f2673b;

    public C0159h(C0160i c0160i) {
        this.f2673b = c0160i;
        a();
    }

    public final void a() {
        MenuC0164m menuC0164m = this.f2673b.f2676c;
        C0166o c0166o = menuC0164m.f2703v;
        if (c0166o != null) {
            menuC0164m.i();
            ArrayList arrayList = menuC0164m.f2691j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0166o) arrayList.get(i)) == c0166o) {
                    this.f2672a = i;
                    return;
                }
            }
        }
        this.f2672a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0166o getItem(int i) {
        C0160i c0160i = this.f2673b;
        MenuC0164m menuC0164m = c0160i.f2676c;
        menuC0164m.i();
        ArrayList arrayList = menuC0164m.f2691j;
        c0160i.getClass();
        int i2 = this.f2672a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0166o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0160i c0160i = this.f2673b;
        MenuC0164m menuC0164m = c0160i.f2676c;
        menuC0164m.i();
        int size = menuC0164m.f2691j.size();
        c0160i.getClass();
        return this.f2672a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2673b.f2675b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0177z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
