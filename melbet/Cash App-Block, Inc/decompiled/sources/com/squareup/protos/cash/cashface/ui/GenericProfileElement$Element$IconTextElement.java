package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$IconTextElement extends LocalTextsKt {
    public final GenericProfileElement.IconTextElement value;

    public GenericProfileElement$Element$IconTextElement(GenericProfileElement.IconTextElement iconTextElement) {
        iconTextElement.getClass();
        this.value = iconTextElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$IconTextElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$IconTextElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IconTextElement(value=" + this.value + ")";
    }
}
