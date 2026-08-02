package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fmz implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        InputMethodManager e;
        if (z || (e = fik.e(view)) == null) {
            return;
        }
        e.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
