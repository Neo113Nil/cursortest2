package com.facebook.yoga;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: YogaNodeJNIFinalizer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0004J\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/facebook/yoga/YogaNodeJNIFinalizer;", "Lcom/facebook/yoga/YogaNodeJNIBase;", "<init>", "()V", "config", "Lcom/facebook/yoga/YogaConfig;", "(Lcom/facebook/yoga/YogaConfig;)V", "finalize", "", "freeNatives", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YogaNodeJNIFinalizer extends YogaNodeJNIBase {
    public Object clone() {
        return super.clone();
    }

    public YogaNodeJNIFinalizer() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YogaNodeJNIFinalizer(YogaConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
    }

    protected final void finalize() throws Throwable {
        freeNatives();
    }

    public final void freeNatives() {
        if (this.mNativePointer != 0) {
            long j = this.mNativePointer;
            this.mNativePointer = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }
}
