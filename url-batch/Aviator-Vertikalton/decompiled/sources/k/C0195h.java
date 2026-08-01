package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.fortuneink.neonpad.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f3042a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0196i f3043b;

    public C0195h(C0196i c0196i) {
        this.f3043b = c0196i;
        a();
    }

    public final void a() {
        MenuC0200m menuC0200m = this.f3043b.f3046c;
        C0202o c0202o = menuC0200m.f3076v;
        if (c0202o != null) {
            menuC0200m.i();
            ArrayList arrayList = menuC0200m.f3064j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0202o) arrayList.get(i)) == c0202o) {
                    this.f3042a = i;
                    return;
                }
            }
        }
        this.f3042a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0202o getItem(int i) {
        C0196i c0196i = this.f3043b;
        MenuC0200m menuC0200m = c0196i.f3046c;
        menuC0200m.i();
        ArrayList arrayList = menuC0200m.f3064j;
        c0196i.getClass();
        int i2 = this.f3042a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0202o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0196i c0196i = this.f3043b;
        MenuC0200m menuC0200m = c0196i.f3046c;
        menuC0200m.i();
        int size = menuC0200m.f3064j.size();
        c0196i.getClass();
        return this.f3042a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3043b.f3045b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0213z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
