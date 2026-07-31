package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i, float f6);

    private final native void destroyInternalPathIterator(long j7);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j7);

    @FastNative
    private final native int internalPathIteratorNext(long j7, float[] fArr, int i);

    @FastNative
    private final native int internalPathIteratorPeek(long j7);

    @FastNative
    private final native int internalPathIteratorRawSize(long j7);

    @FastNative
    private final native int internalPathIteratorSize(long j7);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
