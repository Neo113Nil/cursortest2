package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$ListElement extends LocalTextsKt {
    public final GenericProfileElement.ListElement value;

    public GenericProfileElement$Element$ListElement(GenericProfileElement.ListElement listElement) {
        listElement.getClass();
        this.value = listElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$ListElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$ListElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ListElement(value=" + this.value + ")";
    }
}
