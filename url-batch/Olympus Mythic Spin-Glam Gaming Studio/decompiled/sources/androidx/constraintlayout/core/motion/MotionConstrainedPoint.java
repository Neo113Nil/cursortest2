package androidx.constraintlayout.core.motion;

import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* loaded from: classes3.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static String[] names = {X3.i.L, VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height", "pathRotate"};
    private float position;

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }
}
