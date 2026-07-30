package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.lang.ref.SoftReference;
import javax.annotation.CheckForNull;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class FinalizableSoftReference<T> extends SoftReference<T> implements FinalizableReference {
    protected FinalizableSoftReference(@CheckForNull T t7, FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t7, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
