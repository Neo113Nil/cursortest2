package h;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class X implements AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f2152e;

    public X(SearchView searchView) {
        this.f2152e = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f2152e.l(i2);
    }
}
