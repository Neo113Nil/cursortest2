package com.squareup.protos.cash.security.mri.api.v1;

import androidx.tracing.Trace;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Signals$PlatformSignals$AndroidSignals extends Trace {
    public final AndroidSignals value;

    public Signals$PlatformSignals$AndroidSignals(AndroidSignals androidSignals) {
        androidSignals.getClass();
        this.value = androidSignals;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Signals$PlatformSignals$AndroidSignals) && Intrinsics.areEqual(this.value, ((Signals$PlatformSignals$AndroidSignals) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AndroidSignals(value=" + this.value + ")";
    }
}
