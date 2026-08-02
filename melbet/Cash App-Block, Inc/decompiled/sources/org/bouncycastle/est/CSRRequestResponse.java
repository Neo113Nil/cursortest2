package org.bouncycastle.est;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class CSRRequestResponse {
    private final CSRAttributesResponse attributesResponse;
    private final Source source;

    public CSRRequestResponse(CSRAttributesResponse cSRAttributesResponse, Source source) {
        this.attributesResponse = cSRAttributesResponse;
        this.source = source;
    }

    public CSRAttributesResponse getAttributesResponse() {
        CSRAttributesResponse cSRAttributesResponse = this.attributesResponse;
        if (cSRAttributesResponse != null) {
            return cSRAttributesResponse;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Response has no CSRAttributesResponse.");
        return null;
    }

    public Object getSession() {
        return this.source.getSession();
    }

    public Source getSource() {
        return this.source;
    }

    public boolean hasAttributesResponse() {
        return this.attributesResponse != null;
    }
}
