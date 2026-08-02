package com.squareup.protos.cash.papermate.app;

import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetPaperCashDepositBarcodeResponse$Result$Failure extends zzke {
    public final GetPaperCashDepositBarcodeResponse.Failure value;

    public GetPaperCashDepositBarcodeResponse$Result$Failure(GetPaperCashDepositBarcodeResponse.Failure failure) {
        failure.getClass();
        this.value = failure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPaperCashDepositBarcodeResponse$Result$Failure) && Intrinsics.areEqual(this.value, ((GetPaperCashDepositBarcodeResponse$Result$Failure) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Failure(value=" + this.value + ")";
    }
}
