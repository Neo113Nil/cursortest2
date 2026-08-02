package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class T implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f9770a;

    public T(SearchView searchView) {
        this.f9770a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        SearchView searchView = this.f9770a;
        Editable text = searchView.f2079p.getText();
        searchView.f2071V = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i6 = 8;
        if (searchView.f2070U && !searchView.f2063N && isEmpty) {
            searchView.f2084u.setVisibility(8);
            i6 = 0;
        }
        searchView.f2085w.setVisibility(i6);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
