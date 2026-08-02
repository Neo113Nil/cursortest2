package com.squareup.cash.ui;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes6.dex */
public final class InsetsCollector implements View.OnApplyWindowInsetsListener, CashInsetsListener {
    public static final WindowInsets CONSUMED;
    public CashInsets cashInsets;
    public InsetsDispatcher insetsDispatcher;
    public WindowInsetsCompat windowInsets;

    public interface InsetsDispatcher {
        void dispatch(WindowInsetsCompat windowInsetsCompat, CashInsets cashInsets);
    }

    static {
        WindowInsets windowInsets = WindowInsetsCompat.CONSUMED.toWindowInsets();
        windowInsets.getClass();
        CONSUMED = windowInsets;
    }

    @Override // com.squareup.cash.ui.CashInsetsListener
    public final void onApplyCashInsets(CashInsets cashInsets) {
        this.cashInsets = cashInsets;
        InsetsDispatcher insetsDispatcher = this.insetsDispatcher;
        if (insetsDispatcher != null) {
            insetsDispatcher.dispatch(this.windowInsets, cashInsets);
        }
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
        this.windowInsets = windowInsetsCompat;
        InsetsDispatcher insetsDispatcher = this.insetsDispatcher;
        if (insetsDispatcher == null) {
            return windowInsets;
        }
        insetsDispatcher.dispatch(windowInsetsCompat, this.cashInsets);
        return CONSUMED;
    }

    public final void setInsetsDispatcher(InsetsDispatcher insetsDispatcher) {
        this.insetsDispatcher = insetsDispatcher;
        insetsDispatcher.dispatch(this.windowInsets, this.cashInsets);
    }
}
