package com.squareup.protos.cash.composer.app;

import app.cash.sqldelight.db.QueryResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Asset$AssetType$VideoAsset extends QueryResult.DefaultImpls {
    public final VideoAsset value;

    public Asset$AssetType$VideoAsset(VideoAsset videoAsset) {
        videoAsset.getClass();
        this.value = videoAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Asset$AssetType$VideoAsset) && Intrinsics.areEqual(this.value, ((Asset$AssetType$VideoAsset) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VideoAsset(value=" + this.value + ")";
    }
}
