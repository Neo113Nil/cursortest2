package I;

import E1.AbstractC0033i;
import E1.q;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import l.f0;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f605a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f606b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f607c;

    /* renamed from: d, reason: collision with root package name */
    public Context f608d;

    /* renamed from: e, reason: collision with root package name */
    public int f609e;
    public q f;

    /* renamed from: g, reason: collision with root package name */
    public a f610g;

    /* renamed from: h, reason: collision with root package name */
    public c f611h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f607c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                q qVar = this.f;
                if (qVar != null) {
                    cursor2.unregisterContentObserver(qVar);
                }
                a aVar = this.f610g;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f607c = cursor;
            if (cursor != null) {
                q qVar2 = this.f;
                if (qVar2 != null) {
                    cursor.registerContentObserver(qVar2);
                }
                a aVar2 = this.f610g;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.f609e = cursor.getColumnIndexOrThrow("_id");
                this.f605a = true;
                notifyDataSetChanged();
            } else {
                this.f609e = -1;
                this.f605a = false;
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
        if (!this.f605a || (cursor = this.f607c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f605a) {
            return null;
        }
        this.f607c.moveToPosition(i3);
        if (view == null) {
            f0 f0Var = (f0) this;
            view = f0Var.f9797k.inflate(f0Var.f9796j, viewGroup, false);
        }
        a(view, this.f607c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f611h == null) {
            c cVar = new c();
            cVar.f612a = this;
            this.f611h = cVar;
        }
        return this.f611h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f605a || (cursor = this.f607c) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f607c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        Cursor cursor;
        if (this.f605a && (cursor = this.f607c) != null && cursor.moveToPosition(i3)) {
            return this.f607c.getLong(this.f609e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f605a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f607c.moveToPosition(i3)) {
            throw new IllegalStateException(AbstractC0033i.h(i3, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f607c);
        return view;
    }
}
