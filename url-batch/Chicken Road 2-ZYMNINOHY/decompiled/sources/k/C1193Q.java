package k;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193Q implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f13961a;

    public C1193Q(SearchView searchView) {
        this.f13961a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        SearchView searchView = this.f13961a;
        Editable text = searchView.f4411p.getText();
        searchView.f4403V = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i7 = 8;
        if (searchView.f4402U && !searchView.f4395N && isEmpty) {
            searchView.f4416u.setVisibility(8);
            i7 = 0;
        }
        searchView.f4417w.setVisibility(i7);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}
