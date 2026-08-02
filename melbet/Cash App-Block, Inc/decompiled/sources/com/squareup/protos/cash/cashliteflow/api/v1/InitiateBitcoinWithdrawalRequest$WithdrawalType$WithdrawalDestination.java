package com.squareup.protos.cash.cashliteflow.api.v1;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination {
    public final String value;

    public InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination) && Intrinsics.areEqual(this.value, ((InitiateBitcoinWithdrawalRequest$WithdrawalType$WithdrawalDestination) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithdrawalDestination(value=", this.value, ")");
    }
}
