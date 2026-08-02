package com.squareup.protos.cash.papermate.app;

import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetPaperCashDepositBarcodeResponse$Result$Success extends zzke {
    public final GetPaperCashDepositBarcodeResponse.Success value;

    public GetPaperCashDepositBarcodeResponse$Result$Success(GetPaperCashDepositBarcodeResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPaperCashDepositBarcodeResponse$Result$Success) && Intrinsics.areEqual(this.value, ((GetPaperCashDepositBarcodeResponse$Result$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
