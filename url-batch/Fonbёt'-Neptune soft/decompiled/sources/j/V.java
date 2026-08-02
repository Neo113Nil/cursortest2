package j;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class V implements TextWatcher {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f2922e;

    public V(SearchView searchView) {
        this.f2922e = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.f2922e;
        Editable text = searchView.f1459t.getText();
        searchView.f1452c0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i5 = 8;
        if (searchView.f1451b0 && !searchView.f1444R && isEmpty) {
            searchView.f1463y.setVisibility(8);
            i5 = 0;
        }
        searchView.f1428A.setVisibility(i5);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
