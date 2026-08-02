package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$ActivityElement extends LocalTextsKt {
    public final GenericProfileElement.ActivityElement value;

    public GenericProfileElement$Element$ActivityElement(GenericProfileElement.ActivityElement activityElement) {
        activityElement.getClass();
        this.value = activityElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$ActivityElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$ActivityElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActivityElement(value=" + this.value + ")";
    }
}
