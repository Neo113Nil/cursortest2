package com.squareup.protos.cash.cryptosparky.api;

import app.cash.zipline.internal.LogAndroidKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination extends LogAndroidKt {
    public final String value;

    public InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) && Intrinsics.areEqual(this.value, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithdrawalDestination(value=", this.value, ")");
    }
}
