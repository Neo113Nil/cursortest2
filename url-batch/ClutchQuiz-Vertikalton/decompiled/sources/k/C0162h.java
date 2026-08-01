package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.clutchquizarena.app.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2733a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0163i f2734b;

    public C0162h(C0163i c0163i) {
        this.f2734b = c0163i;
        a();
    }

    public final void a() {
        MenuC0167m menuC0167m = this.f2734b.f2737c;
        C0169o c0169o = menuC0167m.f2764v;
        if (c0169o != null) {
            menuC0167m.i();
            ArrayList arrayList = menuC0167m.f2752j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0169o) arrayList.get(i)) == c0169o) {
                    this.f2733a = i;
                    return;
                }
            }
        }
        this.f2733a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0169o getItem(int i) {
        C0163i c0163i = this.f2734b;
        MenuC0167m menuC0167m = c0163i.f2737c;
        menuC0167m.i();
        ArrayList arrayList = menuC0167m.f2752j;
        c0163i.getClass();
        int i2 = this.f2733a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0169o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0163i c0163i = this.f2734b;
        MenuC0167m menuC0167m = c0163i.f2737c;
        menuC0167m.i();
        int size = menuC0167m.f2752j.size();
        c0163i.getClass();
        return this.f2733a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2734b.f2736b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0180z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
