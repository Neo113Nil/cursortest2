package W;

import android.view.View;

/* loaded from: classes.dex */
public abstract class d {
    public abstract int clampViewPositionHorizontal(View view, int i, int i4);

    public abstract int clampViewPositionVertical(View view, int i, int i4);

    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i) {
        return false;
    }

    public abstract void onViewReleased(View view, float f6, float f9);

    public abstract boolean tryCaptureView(View view, int i);

    public int getOrderedChildIndex(int i) {
        return i;
    }

    public void onViewDragStateChanged(int i) {
    }

    public void onEdgeDragStarted(int i, int i4) {
    }

    public void onEdgeTouched(int i, int i4) {
    }

    public void onViewCaptured(View view, int i) {
    }

    public void onViewPositionChanged(View view, int i, int i4, int i9, int i10) {
    }
}
