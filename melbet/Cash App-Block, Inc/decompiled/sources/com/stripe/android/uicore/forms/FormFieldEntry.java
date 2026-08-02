package com.stripe.android.uicore.forms;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FormFieldEntry {
    public final boolean isComplete;
    public final String value;

    public FormFieldEntry(String str, boolean z) {
        this.value = str;
        this.isComplete = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormFieldEntry)) {
            return false;
        }
        FormFieldEntry formFieldEntry = (FormFieldEntry) obj;
        return Intrinsics.areEqual(this.value, formFieldEntry.value) && this.isComplete == formFieldEntry.isComplete;
    }

    public final int hashCode() {
        String str = this.value;
        return Boolean.hashCode(this.isComplete) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("FormFieldEntry(value=", this.value, ", isComplete=", ")", this.isComplete);
    }
}
