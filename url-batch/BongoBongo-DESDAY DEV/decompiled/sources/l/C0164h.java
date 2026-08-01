package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.winfour.winrandom.R;
import java.util.ArrayList;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2802a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0165i f2803b;

    public C0164h(C0165i c0165i) {
        this.f2803b = c0165i;
        a();
    }

    public final void a() {
        MenuC0169m menuC0169m = this.f2803b.f2806c;
        C0171o c0171o = menuC0169m.f2834v;
        if (c0171o != null) {
            menuC0169m.i();
            ArrayList arrayList = menuC0169m.f2822j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0171o) arrayList.get(i)) == c0171o) {
                    this.f2802a = i;
                    return;
                }
            }
        }
        this.f2802a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0171o getItem(int i) {
        C0165i c0165i = this.f2803b;
        MenuC0169m menuC0169m = c0165i.f2806c;
        menuC0169m.i();
        ArrayList arrayList = menuC0169m.f2822j;
        c0165i.getClass();
        int i2 = this.f2802a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0171o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0165i c0165i = this.f2803b;
        MenuC0169m menuC0169m = c0165i.f2806c;
        menuC0169m.i();
        int size = menuC0169m.f2822j.size();
        c0165i.getClass();
        return this.f2802a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2803b.f2805b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0182z) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
