package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.playgen.securelock.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2599a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0157i f2600b;

    public C0156h(C0157i c0157i) {
        this.f2600b = c0157i;
        a();
    }

    public final void a() {
        MenuC0161m menuC0161m = this.f2600b.f2603c;
        C0163o c0163o = menuC0161m.f2630v;
        if (c0163o != null) {
            menuC0161m.i();
            ArrayList arrayList = menuC0161m.f2618j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0163o) arrayList.get(i)) == c0163o) {
                    this.f2599a = i;
                    return;
                }
            }
        }
        this.f2599a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0163o getItem(int i) {
        C0157i c0157i = this.f2600b;
        MenuC0161m menuC0161m = c0157i.f2603c;
        menuC0161m.i();
        ArrayList arrayList = menuC0161m.f2618j;
        c0157i.getClass();
        int i2 = this.f2599a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0163o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0157i c0157i = this.f2600b;
        MenuC0161m menuC0161m = c0157i.f2603c;
        menuC0161m.i();
        int size = menuC0161m.f2618j.size();
        c0157i.getClass();
        return this.f2599a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2600b.f2602b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0174z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
