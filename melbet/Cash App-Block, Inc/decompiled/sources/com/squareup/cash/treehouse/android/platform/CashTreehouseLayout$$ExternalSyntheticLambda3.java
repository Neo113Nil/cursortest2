package com.squareup.cash.treehouse.android.platform;

import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import app.cash.redwood.treehouse.TreehouseLayout;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.CashInsetsListenerKt;
import com.squareup.cash.ui.InsetsCollector;

/* loaded from: classes7.dex */
public final /* synthetic */ class CashTreehouseLayout$$ExternalSyntheticLambda3 implements InsetsCollector.InsetsDispatcher {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CashTreehouseLayout$$ExternalSyntheticLambda3(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.squareup.cash.ui.InsetsCollector.InsetsDispatcher
    public void dispatch(WindowInsetsCompat windowInsetsCompat, CashInsets cashInsets) {
        CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) this.f$0;
        windowInsetsCompat.getClass();
        cashInsets.getClass();
        TreehouseLayout treehouseLayout = cashTreehouseLayout.treehouseLayout;
        if (treehouseLayout != null) {
            ViewCompat.onApplyWindowInsets(treehouseLayout, CashInsetsListenerKt.combine(windowInsetsCompat, cashInsets));
        } else {
            cashTreehouseLayout.deferredWindowInsets = CashInsetsListenerKt.combine(windowInsetsCompat, cashInsets);
        }
    }
}
