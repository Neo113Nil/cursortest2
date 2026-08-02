package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class HalfSheetMessage$SecondaryNavigationAction$DetailsPage extends zzjr {
    public final DetailsPage value;

    public HalfSheetMessage$SecondaryNavigationAction$DetailsPage(DetailsPage detailsPage) {
        detailsPage.getClass();
        this.value = detailsPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPage) && Intrinsics.areEqual(this.value, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPage) obj).value);
    }

    public final DetailsPage getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DetailsPage(value=" + this.value + ")";
    }
}
