package h;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class S implements TextWatcher {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f2146e;

    public S(SearchView searchView) {
        this.f2146e = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.f2146e;
        Editable text = searchView.f1210t.getText();
        searchView.f1203c0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i5 = 8;
        if (searchView.f1202b0 && !searchView.f1196R && isEmpty) {
            searchView.f1215y.setVisibility(8);
            i5 = 0;
        }
        searchView.f1179A.setVisibility(i5);
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
