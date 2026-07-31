package L;

import L.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f885a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f886b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f887c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f888d;

    /* renamed from: e, reason: collision with root package name */
    protected int f889e;

    /* renamed from: f, reason: collision with root package name */
    protected C0017a f890f;

    /* renamed from: g, reason: collision with root package name */
    protected DataSetObserver f891g;

    /* renamed from: h, reason: collision with root package name */
    protected L.b f892h;

    /* renamed from: L.a$a, reason: collision with other inner class name */
    private class C0017a extends ContentObserver {
        C0017a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f885a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f885a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z4) {
        f(context, cursor, z4 ? 1 : 2);
    }

    @Override // L.b.a
    public void a(Cursor cursor) {
        Cursor j4 = j(cursor);
        if (j4 != null) {
            j4.close();
        }
    }

    @Override // L.b.a
    public Cursor b() {
        return this.f887c;
    }

    @Override // L.b.a
    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i4) {
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f886b = true;
        } else {
            this.f886b = false;
        }
        boolean z4 = cursor != null;
        this.f887c = cursor;
        this.f885a = z4;
        this.f888d = context;
        this.f889e = z4 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i4 & 2) == 2) {
            this.f890f = new C0017a();
            this.f891g = new b();
        } else {
            this.f890f = null;
            this.f891g = null;
        }
        if (z4) {
            C0017a c0017a = this.f890f;
            if (c0017a != null) {
                cursor.registerContentObserver(c0017a);
            }
            DataSetObserver dataSetObserver = this.f891g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f885a || (cursor = this.f887c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f885a) {
            return null;
        }
        this.f887c.moveToPosition(i4);
        if (view == null) {
            view = g(this.f888d, this.f887c, viewGroup);
        }
        e(view, this.f888d, this.f887c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f892h == null) {
            this.f892h = new L.b(this);
        }
        return this.f892h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        Cursor cursor;
        if (!this.f885a || (cursor = this.f887c) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f887c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        Cursor cursor;
        if (this.f885a && (cursor = this.f887c) != null && cursor.moveToPosition(i4)) {
            return this.f887c.getLong(this.f889e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f885a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f887c.moveToPosition(i4)) {
            if (view == null) {
                view = h(this.f888d, this.f887c, viewGroup);
            }
            e(view, this.f888d, this.f887c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i4);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f886b || (cursor = this.f887c) == null || cursor.isClosed()) {
            return;
        }
        this.f885a = this.f887c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f887c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0017a c0017a = this.f890f;
            if (c0017a != null) {
                cursor2.unregisterContentObserver(c0017a);
            }
            DataSetObserver dataSetObserver = this.f891g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f887c = cursor;
        if (cursor == null) {
            this.f889e = -1;
            this.f885a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0017a c0017a2 = this.f890f;
        if (c0017a2 != null) {
            cursor.registerContentObserver(c0017a2);
        }
        DataSetObserver dataSetObserver2 = this.f891g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f889e = cursor.getColumnIndexOrThrow("_id");
        this.f885a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
