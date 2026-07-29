package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zzwl extends WeakReference<Throwable> {
    private final int zzbne;

    public zzwl(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzbne = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzwl zzwlVar = (zzwl) obj;
            if (this.zzbne == zzwlVar.zzbne && get() == zzwlVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbne;
    }
}
