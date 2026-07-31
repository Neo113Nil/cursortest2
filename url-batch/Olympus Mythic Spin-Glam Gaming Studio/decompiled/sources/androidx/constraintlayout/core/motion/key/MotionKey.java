package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;

/* loaded from: classes5.dex */
public abstract class MotionKey implements TypedValues {
    public static int UNSET = -1;
    public HashMap mCustom;
    public int mFramePosition;
    int mTargetId;
    String mTargetString;
    public int mType;

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract MotionKey mo2630clone();

    public MotionKey() {
        int i = UNSET;
        this.mFramePosition = i;
        this.mTargetId = i;
        this.mTargetString = null;
    }

    public MotionKey copy(MotionKey motionKey) {
        this.mFramePosition = motionKey.mFramePosition;
        this.mTargetId = motionKey.mTargetId;
        this.mTargetString = motionKey.mTargetString;
        this.mType = motionKey.mType;
        return this;
    }
}
