package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.protocol.host.NodeReuseKt;

/* loaded from: classes7.dex */
public final class CreditLineSectionHeader$Subtitle$CreditLine extends NodeReuseKt {
    public final CreditLineType value;

    public CreditLineSectionHeader$Subtitle$CreditLine(CreditLineType creditLineType) {
        creditLineType.getClass();
        this.value = creditLineType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditLineSectionHeader$Subtitle$CreditLine) && this.value == ((CreditLineSectionHeader$Subtitle$CreditLine) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CreditLine(value=" + this.value + ")";
    }
}
