package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f2164a;

    public b(SearchView searchView) {
        this.f2164a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        SearchView searchView = this.f2164a;
        if (searchView.f2074b0 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2079p;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i3 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f2074b0 != null && searchView.f2064O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i3 == 66 || i3 == 84 || i3 == 61) {
                    searchView.l(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i3 == 21 || i3 == 22) {
                    searchAutoComplete.setSelection(i3 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    Method method = SearchView.f2050g0.f4985c;
                    if (method != null) {
                        try {
                            method.invoke(searchAutoComplete, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
                if (i3 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
