package L;

import android.view.View;

/* loaded from: classes.dex */
public abstract class b {
    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i7) {
        return false;
    }

    public int getOrderedChildIndex(int i7) {
        return i7;
    }

    public void onViewDragStateChanged(int i7) {
    }

    public void onEdgeDragStarted(int i7, int i8) {
    }

    public void onEdgeTouched(int i7, int i8) {
    }

    public void onViewCaptured(View view, int i7) {
    }

    public void onViewPositionChanged(View view, int i7, int i8, int i9, int i10) {
    }
}
