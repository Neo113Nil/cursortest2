package k;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class W implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f4978f;

    public W(SearchView searchView) {
        this.f4978f = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        SearchView searchView = this.f4978f;
        Editable text = searchView.f3346u.getText();
        searchView.f3340d0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i10 = 8;
        if (searchView.f3339c0 && !searchView.f3332S && isEmpty) {
            searchView.f3350z.setVisibility(8);
            i10 = 0;
        }
        searchView.f3315B.setVisibility(i10);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
