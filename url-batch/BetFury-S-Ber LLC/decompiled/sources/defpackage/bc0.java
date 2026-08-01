package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.trembin.nirefon.betfury.MainActivity2;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bc0 implements TextWatcher {
    public final /* synthetic */ SearchView f;

    public bc0(SearchView searchView) {
        this.f = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.f;
        Editable text = searchView.u.getText();
        searchView.f0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.v(!isEmpty);
        int i4 = 8;
        if (searchView.d0 && !searchView.T && isEmpty) {
            searchView.z.setVisibility(8);
            i4 = 0;
        }
        searchView.B.setVisibility(i4);
        searchView.r();
        searchView.u();
        if (searchView.P != null && !TextUtils.equals(charSequence, searchView.e0)) {
            gc0 gc0Var = searchView.P;
            String charSequence2 = charSequence.toString();
            NotesViewModel l = ((MainActivity2) ((kz) gc0Var).f).l();
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            l.setSearchQuery(charSequence2);
        }
        searchView.e0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
