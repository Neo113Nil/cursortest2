package com.squareup.protos.cash.aegis.sync_values;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class FamilyTileContent$Type$SponsorTileContent {
    public final SponsorTileContent value;

    public FamilyTileContent$Type$SponsorTileContent(SponsorTileContent sponsorTileContent) {
        sponsorTileContent.getClass();
        this.value = sponsorTileContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FamilyTileContent$Type$SponsorTileContent) && Intrinsics.areEqual(this.value, ((FamilyTileContent$Type$SponsorTileContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SponsorTileContent(value=" + this.value + ")";
    }
}
