package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import b7.k;
import com.appsflyer.R;
import m.n;
import m.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends n {

    /* renamed from: s, reason: collision with root package name */
    public int f438s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f439t;

    /* renamed from: u, reason: collision with root package name */
    public final k f440u;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f440u = new k(9, this);
        this.f438s = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i3 >= 960 && i10 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i3 < 600) {
            return (i3 < 640 || i10 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f438s <= 0 || super.enoughToFilter();
    }

    @Override // m.n, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f439t) {
            k kVar = this.f440u;
            removeCallbacks(kVar);
            post(kVar);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i3, Rect rect) {
        super.onFocusChanged(z10, i3, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
        if (i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i3, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            throw null;
        }
    }

    public void setImeVisibility(boolean z10) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        k kVar = this.f440u;
        if (!z10) {
            this.f439t = false;
            removeCallbacks(kVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f439t = true;
                return;
            }
            this.f439t = false;
            removeCallbacks(kVar);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i3) {
        super.setThreshold(i3);
        this.f438s = i3;
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public SearchView$SearchAutoComplete(Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setSearchView(n1 n1Var) {
    }
}
