package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ffi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean e;

    public SearchBar$ScrollingViewBehavior() {
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fff
    public final boolean P() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ffh, defpackage.tw
    public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.l(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.tw
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.q(coordinatorLayout, view, view2);
        if (this.e || !(view2 instanceof AppBarLayout)) {
            return;
        }
        this.e = true;
        AppBarLayout appBarLayout = (AppBarLayout) view2;
        appBarLayout.setTouchscreenBlocksFocus(false);
        appBarLayout.setBackgroundColor(0);
        ffi.a(appBarLayout, 0.0f);
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }
}
