package com.squareup.cash.support.chat.viewmodels;

import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BodyViewModel$ActivityBodyViewModel extends ViewModelKt {
    public final String entityId;

    public BodyViewModel$ActivityBodyViewModel(String str) {
        str.getClass();
        this.entityId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BodyViewModel$ActivityBodyViewModel) && Intrinsics.areEqual(this.entityId, ((BodyViewModel$ActivityBodyViewModel) obj).entityId);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.entityId.hashCode() * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityBodyViewModel(entityId=", this.entityId, ", chatUiUpliftEnabled=false)");
    }
}
