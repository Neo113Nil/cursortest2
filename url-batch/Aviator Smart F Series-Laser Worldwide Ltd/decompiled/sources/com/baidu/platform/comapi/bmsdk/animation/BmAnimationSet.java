package com.baidu.platform.comapi.bmsdk.animation;

/* loaded from: classes2.dex */
public class BmAnimationSet extends BmAnimation {
    public BmAnimationSet() {
        super(86, nativeCreate());
    }

    private static native boolean nativeAddAnimation(long j8, long j9, int i8);

    private static native long nativeCreate();

    public boolean a(BmAnimation bmAnimation, int i8) {
        if (bmAnimation == null) {
            return false;
        }
        return nativeAddAnimation(this.nativeInstance, bmAnimation.getNativeInstance(), i8);
    }
}
