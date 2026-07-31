package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes4.dex */
public class Motion implements TypedValues {
    private MotionPaths mEndMotionPath;
    private MotionPaths mStartMotionPath;

    /* renamed from: androidx.constraintlayout.core.motion.Motion$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass1 implements DifferentialInterpolator {
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.x + " y: " + this.mStartMotionPath.y + " end: x: " + this.mEndMotionPath.x + " y: " + this.mEndMotionPath.y;
    }
}
