package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f3396f;

    public b(SearchView searchView) {
        this.f3396f = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        SearchView searchView = this.f3396f;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3346u;
        if (searchView.f3342g0 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i7 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f3342g0 != null && searchView.f3333T != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i7 == 66 || i7 == 84 || i7 == 61) {
                    searchView.l(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i7 == 21 || i7 == 22) {
                    searchAutoComplete.setSelection(i7 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                if (i7 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
