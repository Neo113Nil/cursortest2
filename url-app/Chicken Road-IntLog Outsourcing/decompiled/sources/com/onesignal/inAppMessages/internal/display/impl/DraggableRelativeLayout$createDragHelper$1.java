package com.onesignal.inAppMessages.internal.display.impl;

import E.G;
import L.c;
import android.view.View;
import com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout;
import java.lang.reflect.Field;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class DraggableRelativeLayout$createDragHelper$1 extends L.b {
    private int lastYPos;
    final /* synthetic */ DraggableRelativeLayout this$0;

    public DraggableRelativeLayout$createDragHelper$1(DraggableRelativeLayout draggableRelativeLayout) {
        this.this$0 = draggableRelativeLayout;
    }

    public int clampViewPositionHorizontal(View child, int i2, int i3) {
        DraggableRelativeLayout.Params params;
        i.e(child, "child");
        params = this.this$0.params;
        i.b(params);
        return params.getMaxXPos();
    }

    public int clampViewPositionVertical(View child, int i2, int i3) {
        DraggableRelativeLayout.Params params;
        DraggableRelativeLayout.Params params2;
        DraggableRelativeLayout.Params params3;
        DraggableRelativeLayout.Params params4;
        DraggableRelativeLayout.Params params5;
        DraggableRelativeLayout.DraggableListener draggableListener;
        DraggableRelativeLayout.DraggableListener draggableListener2;
        DraggableRelativeLayout.Params params6;
        DraggableRelativeLayout.Params params7;
        DraggableRelativeLayout.Params params8;
        DraggableRelativeLayout.DraggableListener draggableListener3;
        DraggableRelativeLayout.DraggableListener draggableListener4;
        DraggableRelativeLayout.Params params9;
        i.e(child, "child");
        params = this.this$0.params;
        i.b(params);
        if (params.getDraggingDisabled()) {
            params9 = this.this$0.params;
            i.b(params9);
            return params9.getMaxYPos();
        }
        this.lastYPos = i2;
        params2 = this.this$0.params;
        i.b(params2);
        if (params2.getDragDirection() == 1) {
            params6 = this.this$0.params;
            i.b(params6);
            if (i2 >= params6.getDragThresholdY()) {
                draggableListener3 = this.this$0.mListener;
                if (draggableListener3 != null) {
                    draggableListener4 = this.this$0.mListener;
                    i.b(draggableListener4);
                    draggableListener4.onDragStart();
                }
            }
            params7 = this.this$0.params;
            i.b(params7);
            if (i2 < params7.getMaxYPos()) {
                params8 = this.this$0.params;
                i.b(params8);
                return params8.getMaxYPos();
            }
        } else {
            params3 = this.this$0.params;
            i.b(params3);
            if (i2 <= params3.getDragThresholdY()) {
                draggableListener = this.this$0.mListener;
                if (draggableListener != null) {
                    draggableListener2 = this.this$0.mListener;
                    i.b(draggableListener2);
                    draggableListener2.onDragStart();
                }
            }
            params4 = this.this$0.params;
            i.b(params4);
            if (i2 > params4.getMaxYPos()) {
                params5 = this.this$0.params;
                i.b(params5);
                return params5.getMaxYPos();
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (r6 < r5.getDismissingYVelocity()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r6 > r5.getDismissingYVelocity()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewReleased(View releasedChild, float f3, float f6) {
        DraggableRelativeLayout.Params params;
        boolean z;
        c cVar;
        DraggableRelativeLayout.Params params2;
        DraggableRelativeLayout.Params params3;
        DraggableRelativeLayout.Params params4;
        DraggableRelativeLayout.Params params5;
        DraggableRelativeLayout.DraggableListener draggableListener;
        DraggableRelativeLayout.DraggableListener draggableListener2;
        DraggableRelativeLayout.Params params6;
        DraggableRelativeLayout.Params params7;
        DraggableRelativeLayout.Params params8;
        DraggableRelativeLayout.DraggableListener draggableListener3;
        DraggableRelativeLayout.DraggableListener draggableListener4;
        DraggableRelativeLayout.Params params9;
        i.e(releasedChild, "releasedChild");
        params = this.this$0.params;
        i.b(params);
        int maxYPos = params.getMaxYPos();
        z = this.this$0.dismissing;
        if (!z) {
            params3 = this.this$0.params;
            i.b(params3);
            if (params3.getDragDirection() == 1) {
                int i2 = this.lastYPos;
                params7 = this.this$0.params;
                i.b(params7);
                if (i2 <= params7.getDismissingYPos()) {
                    params9 = this.this$0.params;
                    i.b(params9);
                }
                params8 = this.this$0.params;
                i.b(params8);
                maxYPos = params8.getOffScreenYPos();
                this.this$0.dismissing = true;
                draggableListener3 = this.this$0.mListener;
                if (draggableListener3 != null) {
                    draggableListener4 = this.this$0.mListener;
                    i.b(draggableListener4);
                    draggableListener4.onDismiss();
                }
            } else {
                int i3 = this.lastYPos;
                params4 = this.this$0.params;
                i.b(params4);
                if (i3 >= params4.getDismissingYPos()) {
                    params6 = this.this$0.params;
                    i.b(params6);
                }
                params5 = this.this$0.params;
                i.b(params5);
                maxYPos = params5.getOffScreenYPos();
                this.this$0.dismissing = true;
                draggableListener = this.this$0.mListener;
                if (draggableListener != null) {
                    draggableListener2 = this.this$0.mListener;
                    i.b(draggableListener2);
                    draggableListener2.onDismiss();
                }
            }
        }
        cVar = this.this$0.mDragHelper;
        i.b(cVar);
        params2 = this.this$0.params;
        i.b(params2);
        int maxXPos = params2.getMaxXPos();
        if (!cVar.f1479s) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        if (cVar.d(maxXPos, maxYPos, (int) cVar.f1472l.getXVelocity(cVar.f1463c), (int) cVar.f1472l.getYVelocity(cVar.f1463c))) {
            DraggableRelativeLayout draggableRelativeLayout = this.this$0;
            Field field = G.f566a;
            draggableRelativeLayout.postInvalidateOnAnimation();
        }
    }

    public boolean tryCaptureView(View child, int i2) {
        i.e(child, "child");
        return true;
    }
}
