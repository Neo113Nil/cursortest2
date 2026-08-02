package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo {
    public final VerifyPasscodeResponse.ProtectedData.CashCardInfo value;

    public VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo(VerifyPasscodeResponse.ProtectedData.CashCardInfo cashCardInfo) {
        cashCardInfo.getClass();
        this.value = cashCardInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo) && Intrinsics.areEqual(this.value, ((VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashCardInfo(value=" + this.value + ")";
    }
}
