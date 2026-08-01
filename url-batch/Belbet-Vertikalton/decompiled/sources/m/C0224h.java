package m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.winpower.neonfit.R;
import java.util.ArrayList;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f3335a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0225i f3336b;

    public C0224h(C0225i c0225i) {
        this.f3336b = c0225i;
        a();
    }

    public final void a() {
        MenuC0229m menuC0229m = this.f3336b.f3339c;
        C0231o c0231o = menuC0229m.f3366v;
        if (c0231o != null) {
            menuC0229m.i();
            ArrayList arrayList = menuC0229m.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0231o) arrayList.get(i)) == c0231o) {
                    this.f3335a = i;
                    return;
                }
            }
        }
        this.f3335a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0231o getItem(int i) {
        C0225i c0225i = this.f3336b;
        MenuC0229m menuC0229m = c0225i.f3339c;
        menuC0229m.i();
        ArrayList arrayList = menuC0229m.j;
        c0225i.getClass();
        int i2 = this.f3335a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0231o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0225i c0225i = this.f3336b;
        MenuC0229m menuC0229m = c0225i.f3339c;
        menuC0229m.i();
        int size = menuC0229m.j.size();
        c0225i.getClass();
        return this.f3335a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3336b.f3338b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0242z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
