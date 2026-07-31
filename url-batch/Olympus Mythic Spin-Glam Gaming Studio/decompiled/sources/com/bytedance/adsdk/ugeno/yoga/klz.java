package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes5.dex */
public class klz extends YogaNodeJNIBase {
    protected void finalize() throws Throwable {
        try {
            mw();
        } finally {
            super.finalize();
        }
    }

    public void mw() {
        long j = this.zmn;
        if (j != 0) {
            this.zmn = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }
}
