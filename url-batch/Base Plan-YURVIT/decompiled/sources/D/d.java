package D;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import i.f0;

/* loaded from: classes.dex */
public final class d extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public c f198a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((f0) this.f198a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        f0 f0Var = (f0) this.f198a;
        SearchView searchView = f0Var.f2208p;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = f0Var.g(f0Var.f2209q, charSequence2);
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f198a;
        Cursor cursor = cVar.f192g;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((f0) cVar).b((Cursor) obj);
    }
}
