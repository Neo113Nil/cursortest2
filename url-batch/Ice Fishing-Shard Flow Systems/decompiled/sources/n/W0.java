package n;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class W0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f6722a;

    public W0(SearchView searchView) {
        this.f6722a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        SearchView searchView = this.f6722a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f3237S;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z7);
        }
    }
}
