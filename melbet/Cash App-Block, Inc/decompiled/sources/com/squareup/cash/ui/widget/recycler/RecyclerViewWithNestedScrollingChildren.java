package com.squareup.cash.ui.widget.recycler;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.NestedScrollingChild;
import com.squareup.cash.ui.widget.BetterNestedScroll;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public class RecyclerViewWithNestedScrollingChildren extends CashRecyclerView {
    public final BetterNestedScroll detector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewWithNestedScrollingChildren(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        context.getClass();
        this.detector = new BetterNestedScroll(context, new WorkApplet$applet$1(2, this, RecyclerViewWithNestedScrollingChildren.class, "findChildViewUnder", "findChildViewUnder(FF)Landroid/view/View;", 0, 21));
    }

    @Override // com.squareup.cash.ui.widget.recycler.CashRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        BetterNestedScroll betterNestedScroll = this.detector;
        PointF pointF = betterNestedScroll.touchOriginatedAt;
        if (motionEvent.getAction() == 0) {
            pointF.set(motionEvent.getX(), motionEvent.getY());
            betterNestedScroll.touchOriginatedOn = (View) betterNestedScroll.childViewUnder.invoke(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        }
        if (motionEvent.getAction() == 2) {
            CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda0 = betterNestedScroll.isChildSupported;
            View view = betterNestedScroll.touchOriginatedOn;
            cardAppletTile$$ExternalSyntheticLambda0.getClass();
            if (view instanceof NestedScrollingChild) {
                float abs = Math.abs(motionEvent.getX() - pointF.x);
                float abs2 = Math.abs(motionEvent.getY() - pointF.y);
                if (((float) Math.sqrt((abs2 * abs2) + (abs * abs))) >= betterNestedScroll.touchSlopPx && ((float) Math.atan2(abs2, abs)) <= betterNestedScroll.horizontalScrollThreshold) {
                    return false;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerViewWithNestedScrollingChildren(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ RecyclerViewWithNestedScrollingChildren(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
