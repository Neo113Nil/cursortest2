package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.NetworkUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Grant$AppData$AppData$SandboxMetadata extends NetworkUtility {
    public final SandboxMetadata value;

    public Grant$AppData$AppData$SandboxMetadata(SandboxMetadata sandboxMetadata) {
        sandboxMetadata.getClass();
        this.value = sandboxMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Grant$AppData$AppData$SandboxMetadata) && Intrinsics.areEqual(this.value, ((Grant$AppData$AppData$SandboxMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SandboxMetadata(value=" + this.value + ")";
    }
}
