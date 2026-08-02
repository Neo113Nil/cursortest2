package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ga extends BaseAdapter {
    public final gd a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public ga(gd gdVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = gdVar;
        this.f = i;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gf getItem(int i) {
        boolean z = this.d;
        gd gdVar = this.a;
        ArrayList e = z ? gdVar.e() : gdVar.f();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (gf) e.get(i);
    }

    final void b() {
        gd gdVar = this.a;
        gf gfVar = gdVar.j;
        if (gfVar != null) {
            ArrayList e = gdVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (((gf) e.get(i)) == gfVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z = this.d;
        gd gdVar = this.a;
        return this.c < 0 ? (z ? gdVar.e() : gdVar.f()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.w() && i2 != (i3 >= 0 ? getItem(i3).b : i2);
        ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.d || !z) ? 8 : 0);
        }
        gq gqVar = (gq) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        gqVar.f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
