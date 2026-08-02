package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzit;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalMenuItemModifierList$InputType$FreeTextEntry extends zzit {
    public final LocalMenuItemModifierList.FreeTextEntry value;

    public LocalMenuItemModifierList$InputType$FreeTextEntry(LocalMenuItemModifierList.FreeTextEntry freeTextEntry) {
        freeTextEntry.getClass();
        this.value = freeTextEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalMenuItemModifierList$InputType$FreeTextEntry) && Intrinsics.areEqual(this.value, ((LocalMenuItemModifierList$InputType$FreeTextEntry) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FreeTextEntry(value=" + this.value + ")";
    }
}
