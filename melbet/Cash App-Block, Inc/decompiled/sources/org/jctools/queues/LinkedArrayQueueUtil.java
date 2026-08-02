package org.jctools.queues;

import org.jctools.util.UnsafeRefArrayAccess;

/* loaded from: classes10.dex */
public abstract class LinkedArrayQueueUtil {
    public static long modifiedCalcCircularRefElementOffset(long j, long j2) {
        return UnsafeRefArrayAccess.REF_ARRAY_BASE + ((j & j2) << (UnsafeRefArrayAccess.REF_ELEMENT_SHIFT - 1));
    }
}
