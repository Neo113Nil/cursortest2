package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.skydrop.fallring.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2656a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0154i f2657b;

    public C0153h(C0154i c0154i) {
        this.f2657b = c0154i;
        a();
    }

    public final void a() {
        MenuC0158m menuC0158m = this.f2657b.f2660c;
        C0160o c0160o = menuC0158m.f2687v;
        if (c0160o != null) {
            menuC0158m.i();
            ArrayList arrayList = menuC0158m.f2675j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0160o) arrayList.get(i)) == c0160o) {
                    this.f2656a = i;
                    return;
                }
            }
        }
        this.f2656a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0160o getItem(int i) {
        C0154i c0154i = this.f2657b;
        MenuC0158m menuC0158m = c0154i.f2660c;
        menuC0158m.i();
        ArrayList arrayList = menuC0158m.f2675j;
        c0154i.getClass();
        int i2 = this.f2656a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0160o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0154i c0154i = this.f2657b;
        MenuC0158m menuC0158m = c0154i.f2660c;
        menuC0158m.i();
        int size = menuC0158m.f2675j.size();
        c0154i.getClass();
        return this.f2656a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2657b.f2659b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0171z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
