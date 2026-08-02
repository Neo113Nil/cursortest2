package com.squareup.cash.upsell.viewmodels;

import androidx.room.util.TableInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class NullStateViewEvent$TapActionButton extends TableInfo.Companion {
    public final int groupIndex;

    public NullStateViewEvent$TapActionButton(int i) {
        this.groupIndex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NullStateViewEvent$TapActionButton) && this.groupIndex == ((NullStateViewEvent$TapActionButton) obj).groupIndex;
    }

    public final int hashCode() {
        return Integer.hashCode(this.groupIndex) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.groupIndex, "TapActionButton(url=, treatment=, groupIndex=", ", groupTreatment=)");
    }
}
