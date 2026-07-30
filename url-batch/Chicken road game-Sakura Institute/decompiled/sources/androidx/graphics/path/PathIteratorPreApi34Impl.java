package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i7, float f9);

    private final native void destroyInternalPathIterator(long j8);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j8);

    @FastNative
    private final native int internalPathIteratorNext(long j8, float[] fArr, int i7);

    @FastNative
    private final native int internalPathIteratorPeek(long j8);

    @FastNative
    private final native int internalPathIteratorRawSize(long j8);

    @FastNative
    private final native int internalPathIteratorSize(long j8);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
