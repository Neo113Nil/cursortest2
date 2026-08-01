package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.derinko.gbini.n1casino.MainActivity2;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class m10 implements TextWatcher {
    public final /* synthetic */ SearchView f;

    public m10(SearchView searchView) {
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
            r10 r10Var = searchView.P;
            String charSequence2 = charSequence.toString();
            MainActivity2 mainActivity2 = (MainActivity2) ((mr) r10Var).f;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            mainActivity2.I = charSequence2;
            mainActivity2.q();
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
