package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$LabeledContainerElement extends LocalTextsKt {
    public final GenericProfileElement.LabeledContainerElement value;

    public GenericProfileElement$Element$LabeledContainerElement(GenericProfileElement.LabeledContainerElement labeledContainerElement) {
        labeledContainerElement.getClass();
        this.value = labeledContainerElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$LabeledContainerElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$LabeledContainerElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LabeledContainerElement(value=" + this.value + ")";
    }
}
