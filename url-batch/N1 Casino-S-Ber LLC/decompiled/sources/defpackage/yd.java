package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class yd extends BaseAdapter implements Filterable {
    public boolean f;
    public boolean g;
    public Cursor h;
    public int i;
    public wd j;
    public xd k;
    public zd l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                wd wdVar = this.j;
                if (wdVar != null) {
                    cursor2.unregisterContentObserver(wdVar);
                }
                xd xdVar = this.k;
                if (xdVar != null) {
                    cursor2.unregisterDataSetObserver(xdVar);
                }
            }
            this.h = cursor;
            if (cursor != null) {
                wd wdVar2 = this.j;
                if (wdVar2 != null) {
                    cursor.registerContentObserver(wdVar2);
                }
                xd xdVar2 = this.k;
                if (xdVar2 != null) {
                    cursor.registerDataSetObserver(xdVar2);
                }
                this.i = cursor.getColumnIndexOrThrow("_id");
                this.f = true;
                notifyDataSetChanged();
            } else {
                this.i = -1;
                this.f = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f || (cursor = this.h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f) {
            return null;
        }
        this.h.moveToPosition(i);
        if (view == null) {
            o40 o40Var = (o40) this;
            view = o40Var.o.inflate(o40Var.n, viewGroup, false);
        }
        a(view, this.h);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.l == null) {
            zd zdVar = new zd();
            zdVar.a = this;
            this.l = zdVar;
        }
        return this.l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f || (cursor = this.h) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f && (cursor = this.h) != null && cursor.moveToPosition(i)) {
            return this.h.getLong(this.i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f) {
            t8.t("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.h.moveToPosition(i)) {
            t8.t(d30.e("couldn't move cursor to position ", i));
            return null;
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.h);
        return view;
    }
}
