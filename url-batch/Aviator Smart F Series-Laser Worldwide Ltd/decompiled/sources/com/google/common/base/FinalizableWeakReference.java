package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.lang.ref.WeakReference;
import javax.annotation.CheckForNull;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class FinalizableWeakReference<T> extends WeakReference<T> implements FinalizableReference {
    protected FinalizableWeakReference(@CheckForNull T t7, FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t7, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
