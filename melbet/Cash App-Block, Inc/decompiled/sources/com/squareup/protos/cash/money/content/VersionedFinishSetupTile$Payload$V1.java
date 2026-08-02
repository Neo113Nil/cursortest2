package com.squareup.protos.cash.money.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class VersionedFinishSetupTile$Payload$V1 {
    public final FinishSetupTileV1 value;

    public VersionedFinishSetupTile$Payload$V1(FinishSetupTileV1 finishSetupTileV1) {
        finishSetupTileV1.getClass();
        this.value = finishSetupTileV1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VersionedFinishSetupTile$Payload$V1) && Intrinsics.areEqual(this.value, ((VersionedFinishSetupTile$Payload$V1) obj).value);
    }

    public final FinishSetupTileV1 getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "V1(value=" + this.value + ")";
    }
}
