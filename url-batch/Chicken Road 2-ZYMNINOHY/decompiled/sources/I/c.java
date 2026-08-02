package I;

import E.AbstractC0005f;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.ViewOnClickListenerC1209d0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1112a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1113b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f1114c;

    /* renamed from: d, reason: collision with root package name */
    public Context f1115d;

    /* renamed from: e, reason: collision with root package name */
    public int f1116e;

    /* renamed from: f, reason: collision with root package name */
    public a f1117f;

    /* renamed from: g, reason: collision with root package name */
    public b f1118g;

    /* renamed from: h, reason: collision with root package name */
    public d f1119h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1114c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1117f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f1118g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f1114c = cursor;
            if (cursor != null) {
                a aVar2 = this.f1117f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f1118g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f1116e = cursor.getColumnIndexOrThrow("_id");
                this.f1112a = true;
                notifyDataSetChanged();
            } else {
                this.f1116e = -1;
                this.f1112a = false;
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
        if (!this.f1112a || (cursor = this.f1114c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f1112a) {
            return null;
        }
        this.f1114c.moveToPosition(i4);
        if (view == null) {
            ViewOnClickListenerC1209d0 viewOnClickListenerC1209d0 = (ViewOnClickListenerC1209d0) this;
            view = viewOnClickListenerC1209d0.f13988k.inflate(viewOnClickListenerC1209d0.f13987j, viewGroup, false);
        }
        a(view, this.f1114c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1119h == null) {
            d dVar = new d();
            dVar.f1120a = this;
            this.f1119h = dVar;
        }
        return this.f1119h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (!this.f1112a || (cursor = this.f1114c) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f1114c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (this.f1112a && (cursor = this.f1114c) != null && cursor.moveToPosition(i4)) {
            return this.f1114c.getLong(this.f1116e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f1112a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1114c.moveToPosition(i4)) {
            throw new IllegalStateException(AbstractC0005f.j(i4, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f1114c);
        return view;
    }
}
