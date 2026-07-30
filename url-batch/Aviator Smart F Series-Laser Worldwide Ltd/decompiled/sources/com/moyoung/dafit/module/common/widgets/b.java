package com.moyoung.dafit.module.common.widgets;

import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes4.dex */
public class b {
    private static final float VERTICAL_OFFSET_PROPORTION = 0.7f;
    private final AppBarLayout appBarLayout;

    public b(AppBarLayout appBarLayout) {
        this.appBarLayout = appBarLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addTitleScrollEvent$0(TextView textView, TextView textView2, AppBarLayout appBarLayout, int i8) {
        setTitleOfVerticalOffset(textView, textView2, i8);
    }

    private void setTitleOfVerticalOffset(TextView textView, TextView textView2, int i8) {
        if (Math.abs(i8 / this.appBarLayout.getTotalScrollRange()) > 0.7f) {
            textView.setVisibility(0);
            textView2.setVisibility(4);
        } else {
            textView.setVisibility(4);
            textView2.setVisibility(0);
        }
    }

    public void addTitleScrollEvent(final TextView textView, final TextView textView2) {
        this.appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.moyoung.dafit.module.common.widgets.a
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i8) {
                b.this.lambda$addTitleScrollEvent$0(textView, textView2, appBarLayout, i8);
            }
        });
    }
}
