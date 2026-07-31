package L;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f895a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f895a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f895a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d4 = this.f895a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d4 != null) {
            filterResults.count = d4.getCount();
            filterResults.values = d4;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b4 = this.f895a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b4) {
            return;
        }
        this.f895a.a((Cursor) obj);
    }
}
