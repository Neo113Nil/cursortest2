package androidx.appcompat.widget;

import C0.i;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import l.C0250o;
import l.P0;

/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C0250o {

    /* renamed from: e, reason: collision with root package name */
    public int f1728e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1729f;

    /* renamed from: g, reason: collision with root package name */
    public final i f1730g;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1730g = new i(13, this);
        this.f1728e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f1728e <= 0 || super.enoughToFilter();
    }

    @Override // l.C0250o, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f1729f) {
            i iVar = this.f1730g;
            removeCallbacks(iVar);
            post(iVar);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
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
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z2) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        i iVar = this.f1730g;
        if (!z2) {
            this.f1729f = false;
            removeCallbacks(iVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f1729f = true;
                return;
            }
            this.f1729f = false;
            removeCallbacks(iVar);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(P0 p02) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.f1728e = i;
    }
}
