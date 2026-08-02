package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$AchievementsWidgetElement extends LocalTextsKt {
    public final GenericProfileElement.AchievementsWidgetElement value;

    public GenericProfileElement$Element$AchievementsWidgetElement(GenericProfileElement.AchievementsWidgetElement achievementsWidgetElement) {
        achievementsWidgetElement.getClass();
        this.value = achievementsWidgetElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$AchievementsWidgetElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$AchievementsWidgetElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AchievementsWidgetElement(value=" + this.value + ")";
    }
}
