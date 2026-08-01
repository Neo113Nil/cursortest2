package w3;

import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i3) {
        return false;
    }

    public int getOrderedChildIndex(int i3) {
        return i3;
    }

    public void onViewDragStateChanged(int i3) {
    }

    public void onEdgeDragStarted(int i3, int i10) {
    }

    public void onEdgeTouched(int i3, int i10) {
    }

    public void onViewCaptured(View view, int i3) {
    }

    public void onViewPositionChanged(View view, int i3, int i10, int i11, int i12) {
    }
}
