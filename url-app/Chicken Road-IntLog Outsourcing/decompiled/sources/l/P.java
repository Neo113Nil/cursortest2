package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class P implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f10813a;

    public P(SearchView searchView) {
        this.f10813a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i6) {
        SearchView searchView = this.f10813a;
        Editable text = searchView.f4203p.getText();
        searchView.f4196f0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i7 = 8;
        if (searchView.f4195e0 && !searchView.f4188U && isEmpty) {
            searchView.f4208u.setVisibility(8);
            i7 = 0;
        }
        searchView.f4210w.setVisibility(i7);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i6) {
    }
}
