package com.squareup.protos.cash.security.mri.api.v1;

import androidx.tracing.Trace;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Signals$PlatformSignals$IosSignals extends Trace {
    public final IosSignals value;

    public Signals$PlatformSignals$IosSignals(IosSignals iosSignals) {
        iosSignals.getClass();
        this.value = iosSignals;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Signals$PlatformSignals$IosSignals) && Intrinsics.areEqual(this.value, ((Signals$PlatformSignals$IosSignals) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IosSignals(value=" + this.value + ")";
    }
}
