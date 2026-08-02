package k;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC1195T implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f13964a;

    public ViewOnFocusChangeListenerC1195T(SearchView searchView) {
        this.f13964a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f13964a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f4393K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
