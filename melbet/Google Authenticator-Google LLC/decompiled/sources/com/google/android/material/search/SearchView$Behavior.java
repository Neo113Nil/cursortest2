package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.fmt;
import defpackage.fng;
import defpackage.tw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchView$Behavior extends tw {
    public SearchView$Behavior() {
    }

    @Override // defpackage.tw
    public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
        fng fngVar = (fng) view;
        if (fngVar.o == null && (view2 instanceof fmt)) {
            fngVar.g((fmt) view2);
        }
    }

    public SearchView$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
