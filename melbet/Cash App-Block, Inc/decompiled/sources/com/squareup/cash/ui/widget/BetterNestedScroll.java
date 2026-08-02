package com.squareup.cash.ui.widget;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewConfiguration;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;

/* loaded from: classes7.dex */
public final class BetterNestedScroll {
    public final WorkApplet$applet$1 childViewUnder;
    public final double horizontalScrollThreshold;
    public final CardAppletTile$$ExternalSyntheticLambda0 isChildSupported;
    public final PointF touchOriginatedAt;
    public View touchOriginatedOn;
    public final int touchSlopPx;

    public BetterNestedScroll(Context context, WorkApplet$applet$1 workApplet$applet$1) {
        context.getClass();
        this.childViewUnder = workApplet$applet$1;
        this.touchSlopPx = ViewConfiguration.get(context).getScaledTouchSlop();
        this.isChildSupported = new CardAppletTile$$ExternalSyntheticLambda0(1);
        this.horizontalScrollThreshold = 0.7853981633974483d;
        this.touchOriginatedAt = new PointF(-1.0f, -1.0f);
    }
}
