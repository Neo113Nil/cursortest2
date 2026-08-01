package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pairspot.fortunetiles.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2650a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0153i f2651b;

    public C0152h(C0153i c0153i) {
        this.f2651b = c0153i;
        a();
    }

    public final void a() {
        MenuC0157m menuC0157m = this.f2651b.f2654c;
        C0159o c0159o = menuC0157m.f2681v;
        if (c0159o != null) {
            menuC0157m.i();
            ArrayList arrayList = menuC0157m.f2669j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0159o) arrayList.get(i)) == c0159o) {
                    this.f2650a = i;
                    return;
                }
            }
        }
        this.f2650a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0159o getItem(int i) {
        C0153i c0153i = this.f2651b;
        MenuC0157m menuC0157m = c0153i.f2654c;
        menuC0157m.i();
        ArrayList arrayList = menuC0157m.f2669j;
        c0153i.getClass();
        int i2 = this.f2650a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0159o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0153i c0153i = this.f2651b;
        MenuC0157m menuC0157m = c0153i.f2654c;
        menuC0157m.i();
        int size = menuC0157m.f2669j.size();
        c0153i.getClass();
        return this.f2650a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2651b.f2653b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0170z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
