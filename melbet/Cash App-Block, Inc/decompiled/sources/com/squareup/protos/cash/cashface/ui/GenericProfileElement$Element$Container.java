package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$Container extends LocalTextsKt {
    public final ContainerElement value;

    public GenericProfileElement$Element$Container(ContainerElement containerElement) {
        containerElement.getClass();
        this.value = containerElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$Container) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$Container) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Container(value=" + this.value + ")";
    }
}
