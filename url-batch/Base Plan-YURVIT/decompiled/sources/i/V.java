package i;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class V implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f2180a;

    public V(SearchView searchView) {
        this.f2180a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f2180a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f1282O;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
