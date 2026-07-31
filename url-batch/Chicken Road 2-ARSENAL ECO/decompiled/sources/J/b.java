package J;

import D3.q;
import W4.o;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.j0;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f1230f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1231g;

    /* renamed from: h, reason: collision with root package name */
    public Cursor f1232h;

    /* renamed from: i, reason: collision with root package name */
    public int f1233i;

    /* renamed from: j, reason: collision with root package name */
    public q f1234j;

    /* renamed from: k, reason: collision with root package name */
    public a f1235k;

    /* renamed from: l, reason: collision with root package name */
    public c f1236l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1232h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                q qVar = this.f1234j;
                if (qVar != null) {
                    cursor2.unregisterContentObserver(qVar);
                }
                a aVar = this.f1235k;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f1232h = cursor;
            if (cursor != null) {
                q qVar2 = this.f1234j;
                if (qVar2 != null) {
                    cursor.registerContentObserver(qVar2);
                }
                a aVar2 = this.f1235k;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.f1233i = cursor.getColumnIndexOrThrow("_id");
                this.f1230f = true;
                notifyDataSetChanged();
            } else {
                this.f1233i = -1;
                this.f1230f = false;
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
        if (!this.f1230f || (cursor = this.f1232h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f1230f) {
            return null;
        }
        this.f1232h.moveToPosition(i7);
        if (view == null) {
            j0 j0Var = (j0) this;
            view = j0Var.f5034o.inflate(j0Var.f5033n, viewGroup, false);
        }
        a(view, this.f1232h);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1236l == null) {
            c cVar = new c();
            cVar.f1237a = this;
            this.f1236l = cVar;
        }
        return this.f1236l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        Cursor cursor;
        if (!this.f1230f || (cursor = this.f1232h) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f1232h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        Cursor cursor;
        if (this.f1230f && (cursor = this.f1232h) != null && cursor.moveToPosition(i7)) {
            return this.f1232h.getLong(this.f1233i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f1230f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1232h.moveToPosition(i7)) {
            throw new IllegalStateException(o.c("couldn't move cursor to position ", i7));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f1232h);
        return view;
    }
}
