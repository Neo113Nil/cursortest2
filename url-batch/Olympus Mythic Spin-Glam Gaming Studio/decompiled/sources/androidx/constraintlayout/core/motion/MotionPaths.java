package androidx.constraintlayout.core.motion;

import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* loaded from: classes13.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    static String[] names = {X3.i.L, VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height", "pathRotate"};
    float position;
    float x;
    float y;

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }
}
