package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.lang.ref.PhantomReference;
import javax.annotation.CheckForNull;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class FinalizablePhantomReference<T> extends PhantomReference<T> implements FinalizableReference {
    protected FinalizablePhantomReference(@CheckForNull T t7, FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t7, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
