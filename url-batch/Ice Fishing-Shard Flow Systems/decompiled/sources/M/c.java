package M;

import C4.p;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import n.f1;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1711d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1712e;

    /* renamed from: i, reason: collision with root package name */
    public Cursor f1713i;

    /* renamed from: l, reason: collision with root package name */
    public int f1714l;

    /* renamed from: m, reason: collision with root package name */
    public a f1715m;

    /* renamed from: n, reason: collision with root package name */
    public b f1716n;

    /* renamed from: o, reason: collision with root package name */
    public d f1717o;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1713i;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1715m;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f1716n;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f1713i = cursor;
            if (cursor != null) {
                a aVar2 = this.f1715m;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f1716n;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f1714l = cursor.getColumnIndexOrThrow("_id");
                this.f1711d = true;
                notifyDataSetChanged();
            } else {
                this.f1714l = -1;
                this.f1711d = false;
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
        if (!this.f1711d || (cursor = this.f1713i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1711d) {
            return null;
        }
        this.f1713i.moveToPosition(i2);
        if (view == null) {
            f1 f1Var = (f1) this;
            view = f1Var.f6773r.inflate(f1Var.f6772q, viewGroup, false);
        }
        a(view, this.f1713i);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1717o == null) {
            d dVar = new d();
            dVar.f1718a = this;
            this.f1717o = dVar;
        }
        return this.f1717o;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f1711d || (cursor = this.f1713i) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f1713i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f1711d && (cursor = this.f1713i) != null && cursor.moveToPosition(i2)) {
            return this.f1713i.getLong(this.f1714l);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1711d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1713i.moveToPosition(i2)) {
            throw new IllegalStateException(p.g(i2, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f1713i);
        return view;
    }
}
