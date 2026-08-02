package G;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import j.h0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: e, reason: collision with root package name */
    public boolean f474e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f475f;

    /* renamed from: g, reason: collision with root package name */
    public Cursor f476g;

    /* renamed from: h, reason: collision with root package name */
    public Context f477h;

    /* renamed from: i, reason: collision with root package name */
    public int f478i;

    /* renamed from: j, reason: collision with root package name */
    public a f479j;

    /* renamed from: k, reason: collision with root package name */
    public b f480k;

    /* renamed from: l, reason: collision with root package name */
    public d f481l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f476g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f479j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f480k;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f476g = cursor;
            if (cursor != null) {
                a aVar2 = this.f479j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f480k;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f478i = cursor.getColumnIndexOrThrow("_id");
                this.f474e = true;
                notifyDataSetChanged();
            } else {
                this.f478i = -1;
                this.f474e = false;
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
        if (!this.f474e || (cursor = this.f476g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f474e) {
            return null;
        }
        this.f476g.moveToPosition(i2);
        if (view == null) {
            h0 h0Var = (h0) this;
            view = h0Var.f2954o.inflate(h0Var.f2953n, viewGroup, false);
        }
        a(view, this.f476g);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f481l == null) {
            d dVar = new d();
            dVar.f482a = this;
            this.f481l = dVar;
        }
        return this.f481l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f474e || (cursor = this.f476g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f476g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f474e && (cursor = this.f476g) != null && cursor.moveToPosition(i2)) {
            return this.f476g.getLong(this.f478i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f474e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f476g.moveToPosition(i2)) {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f476g);
        return view;
    }
}
