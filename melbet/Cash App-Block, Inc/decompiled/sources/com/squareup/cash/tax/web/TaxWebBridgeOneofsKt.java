package com.squareup.cash.tax.web;

import com.squareup.protos.cash.tax.TaxWebBridgeEvent;
import com.squareup.protos.cash.tax.TaxWebBridgeResponse;
import okio.ByteString;

/* loaded from: classes7.dex */
public abstract class TaxWebBridgeOneofsKt {
    public static final TaxWebBridgeResponse taxWebBridgeResponse(TaxWebBridgeResponse.Status status, TaxWebBridgeResponse.Response response) {
        status.getClass();
        return new TaxWebBridgeResponse(status, response, ByteString.EMPTY);
    }

    public static final TaxWebBridgeEvent taxWebBridgeResponseEvent(String str, TaxWebBridgeResponse taxWebBridgeResponse) {
        str.getClass();
        return new TaxWebBridgeEvent(str, new TaxWebBridgeEvent.Event.Response(taxWebBridgeResponse));
    }
}
