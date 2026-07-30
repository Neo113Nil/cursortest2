package n;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class U0 implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f6719d;

    public U0(SearchView searchView) {
        this.f6719d = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
        SearchView searchView = this.f6719d;
        Editable text = searchView.f3256x.getText();
        searchView.f3248g0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.u(!isEmpty);
        int i8 = 8;
        if (searchView.f3247f0 && !searchView.f3240V && isEmpty) {
            searchView.f3222C.setVisibility(8);
            i8 = 0;
        }
        searchView.f3224E.setVisibility(i8);
        searchView.q();
        searchView.t();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
    }
}
