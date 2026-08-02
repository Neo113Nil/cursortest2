package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$TextElement extends LocalTextsKt {
    public final GenericProfileElement.TextElement value;

    public GenericProfileElement$Element$TextElement(GenericProfileElement.TextElement textElement) {
        textElement.getClass();
        this.value = textElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$TextElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$TextElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextElement(value=" + this.value + ")";
    }
}
