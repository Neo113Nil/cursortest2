package D;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import i.f0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: e, reason: collision with root package name */
    public boolean f190e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f191f;

    /* renamed from: g, reason: collision with root package name */
    public Cursor f192g;

    /* renamed from: h, reason: collision with root package name */
    public Context f193h;

    /* renamed from: i, reason: collision with root package name */
    public int f194i;

    /* renamed from: j, reason: collision with root package name */
    public a f195j;

    /* renamed from: k, reason: collision with root package name */
    public b f196k;

    /* renamed from: l, reason: collision with root package name */
    public d f197l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f192g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f195j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f196k;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f192g = cursor;
            if (cursor != null) {
                a aVar2 = this.f195j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f196k;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f194i = cursor.getColumnIndexOrThrow("_id");
                this.f190e = true;
                notifyDataSetChanged();
            } else {
                this.f194i = -1;
                this.f190e = false;
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
        if (!this.f190e || (cursor = this.f192g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f190e) {
            return null;
        }
        this.f192g.moveToPosition(i2);
        if (view == null) {
            f0 f0Var = (f0) this;
            view = f0Var.f2207o.inflate(f0Var.f2206n, viewGroup, false);
        }
        a(view, this.f192g);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f197l == null) {
            d dVar = new d();
            dVar.f198a = this;
            this.f197l = dVar;
        }
        return this.f197l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f190e || (cursor = this.f192g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f192g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f190e && (cursor = this.f192g) != null && cursor.moveToPosition(i2)) {
            return this.f192g.getLong(this.f194i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f190e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f192g.moveToPosition(i2)) {
            throw new IllegalStateException(L.d.e("couldn't move cursor to position ", i2));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f192g);
        return view;
    }
}
