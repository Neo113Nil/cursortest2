package com.squareup.cash.taptopay.presenters;

import com.squareup.cash.taptopay.backend.api.TapToPayNonFatalError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/taptopay/presenters/TapToPayPaymentError;", "Lcom/squareup/cash/taptopay/backend/api/TapToPayNonFatalError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapToPayPaymentError extends TapToPayNonFatalError {
    public TapToPayPaymentError(String str) {
        super("TapToPayPaymentError: ".concat(str));
    }
}
