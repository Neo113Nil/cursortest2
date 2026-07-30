package O;

import android.view.View;

/* loaded from: classes.dex */
public abstract class b {
    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i2) {
        return false;
    }

    public int getOrderedChildIndex(int i2) {
        return i2;
    }

    public void onViewDragStateChanged(int i2) {
    }

    public void onEdgeDragStarted(int i2, int i5) {
    }

    public void onEdgeTouched(int i2, int i5) {
    }

    public void onViewCaptured(View view, int i2) {
    }

    public void onViewPositionChanged(View view, int i2, int i5, int i7, int i8) {
    }
}
