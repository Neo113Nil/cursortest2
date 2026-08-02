package com.squareup.protos.cash.composer.app;

import app.cash.sqldelight.db.QueryResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Asset$AssetType$LottieAsset extends QueryResult.DefaultImpls {
    public final LottieAsset value;

    public Asset$AssetType$LottieAsset(LottieAsset lottieAsset) {
        lottieAsset.getClass();
        this.value = lottieAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Asset$AssetType$LottieAsset) && Intrinsics.areEqual(this.value, ((Asset$AssetType$LottieAsset) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LottieAsset(value=" + this.value + ")";
    }
}
