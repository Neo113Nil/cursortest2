package sqip.internal;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.search.SearchView;
import com.google.android.material.textfield.ClearTextEndIconDelegate;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class GiftCardEditor$$ExternalSyntheticLambda0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ GiftCardEditor$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        WindowInsetsControllerCompat windowInsetsController;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                GiftCardEditor.onHasFocus$lambda$1((Function0) obj, view, z);
                break;
            case 1:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
            case 2:
                SearchView searchView = (SearchView) obj;
                if (z) {
                    int i2 = SearchView.$r8$clinit;
                    break;
                } else if (!searchView.useWindowInsetsController || (windowInsetsController = ViewCompat.getWindowInsetsController(view)) == null) {
                    InputMethodManager inputMethodManager2 = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager2 != null) {
                        inputMethodManager2.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        break;
                    }
                } else {
                    windowInsetsController.mImpl.hide(8);
                    break;
                }
                break;
            case 3:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) obj;
                clearTextEndIconDelegate.animateIcon(clearTextEndIconDelegate.shouldBeVisible());
                break;
            case 4:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) obj;
                dropdownMenuEndIconDelegate.editTextHasFocus = z;
                dropdownMenuEndIconDelegate.refreshIconState();
                if (!z) {
                    dropdownMenuEndIconDelegate.setEndIconChecked(false);
                    dropdownMenuEndIconDelegate.dropdownPopupDirty = false;
                    break;
                }
                break;
            default:
                EditText editText2 = (EditText) obj;
                if (z) {
                    Editable text = editText2.getText();
                    editText2.setSelection(text != null ? text.length() : 0);
                    break;
                }
                break;
        }
    }
}
