package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198W implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f13967a;

    public C1198W(SearchView searchView) {
        this.f13967a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f13967a.l(i4);
    }
}
