package I;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import k.ViewOnClickListenerC1209d0;

/* loaded from: classes.dex */
public final class d extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public c f1120a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC1209d0) this.f1120a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        ViewOnClickListenerC1209d0 viewOnClickListenerC1209d0 = (ViewOnClickListenerC1209d0) this.f1120a;
        SearchView searchView = viewOnClickListenerC1209d0.f13989l;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = viewOnClickListenerC1209d0.g(viewOnClickListenerC1209d0.f13990m, charSequence2);
            } catch (RuntimeException e4) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e4);
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
        c cVar = this.f1120a;
        Cursor cursor = cVar.f1114c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC1209d0) cVar).b((Cursor) obj);
    }
}
