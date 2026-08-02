package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$ActivityStatsElement extends LocalTextsKt {
    public final GenericProfileElement.ActivityStatsElement value;

    public GenericProfileElement$Element$ActivityStatsElement(GenericProfileElement.ActivityStatsElement activityStatsElement) {
        activityStatsElement.getClass();
        this.value = activityStatsElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$ActivityStatsElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$ActivityStatsElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActivityStatsElement(value=" + this.value + ")";
    }
}
