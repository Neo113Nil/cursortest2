package com.squareup.protos.cash.discover.api.app.v2.model;

import coil3.decode.StaticImageDecoderKt;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RowSection$Item$Item$ActivityRow extends StaticImageDecoderKt {
    public final ActivityRow value;

    public RowSection$Item$Item$ActivityRow(ActivityRow activityRow) {
        activityRow.getClass();
        this.value = activityRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$Item$Item$ActivityRow) && Intrinsics.areEqual(this.value, ((RowSection$Item$Item$ActivityRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActivityRow(value=" + this.value + ")";
    }
}
