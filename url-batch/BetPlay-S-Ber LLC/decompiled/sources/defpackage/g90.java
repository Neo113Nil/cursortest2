package defpackage;

import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class g90 {
    public abstract int clampViewPositionHorizontal(View view, int i, int i2);

    public abstract int clampViewPositionVertical(View view, int i, int i2);

    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i) {
        return false;
    }

    public abstract void onViewDragStateChanged(int i);

    public abstract void onViewPositionChanged(View view, int i, int i2, int i3, int i4);

    public abstract void onViewReleased(View view, float f, float f2);

    public abstract boolean tryCaptureView(View view, int i);

    public int getOrderedChildIndex(int i) {
        return i;
    }

    public void onEdgeDragStarted(int i, int i2) {
    }

    public void onEdgeTouched(int i, int i2) {
    }

    public void onViewCaptured(View view, int i) {
    }
}
