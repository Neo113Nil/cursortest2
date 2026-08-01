package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class kh extends BaseAdapter implements Filterable {
    public boolean f;
    public boolean g;
    public Cursor h;
    public int i;
    public ih j;
    public jh k;
    public lh l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                ih ihVar = this.j;
                if (ihVar != null) {
                    cursor2.unregisterContentObserver(ihVar);
                }
                jh jhVar = this.k;
                if (jhVar != null) {
                    cursor2.unregisterDataSetObserver(jhVar);
                }
            }
            this.h = cursor;
            if (cursor != null) {
                ih ihVar2 = this.j;
                if (ihVar2 != null) {
                    cursor.registerContentObserver(ihVar2);
                }
                jh jhVar2 = this.k;
                if (jhVar2 != null) {
                    cursor.registerDataSetObserver(jhVar2);
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
            yf0 yf0Var = (yf0) this;
            view = yf0Var.o.inflate(yf0Var.n, viewGroup, false);
        }
        a(view, this.h);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.l == null) {
            lh lhVar = new lh();
            lhVar.a = this;
            this.l = lhVar;
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
            s9.u("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.h.moveToPosition(i)) {
            s9.u(r7.b("couldn't move cursor to position ", i));
            return null;
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.h);
        return view;
    }
}
