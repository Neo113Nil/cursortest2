package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import defpackage.fmt;
import defpackage.frj;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class OpenSearchBar extends fmt {

    /* compiled from: PG */
    @Deprecated
    public class ScrollingViewBehavior extends SearchBar$ScrollingViewBehavior {
        @Override // com.google.android.material.search.SearchBar$ScrollingViewBehavior, com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ffh, defpackage.tw
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.l(coordinatorLayout, view, i);
            return true;
        }
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_GoogleMaterial_OpenSearchBar), attributeSet, i);
    }

    @Override // defpackage.fmt
    protected final int B() {
        return R.dimen.google_opensearchbar_margin_vertical;
    }

    @Override // defpackage.fmt
    protected final int C() {
        return R.drawable.quantum_gm_ic_search_vd_theme_24;
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchBarStyle);
    }

    public OpenSearchBar(Context context) {
        this(context, null);
    }
}
