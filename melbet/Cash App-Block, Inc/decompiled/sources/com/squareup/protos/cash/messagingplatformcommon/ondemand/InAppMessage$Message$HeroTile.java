package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.HeroTileView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$HeroTile extends zzjx {
    public final HeroTileView value;

    public InAppMessage$Message$HeroTile(HeroTileView heroTileView) {
        heroTileView.getClass();
        this.value = heroTileView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$HeroTile) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$HeroTile) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroTile(value=" + this.value + ")";
    }
}
