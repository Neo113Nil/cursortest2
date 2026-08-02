package com.squareup.protos.franklin.persona;

import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ResolvePersonaDidvBlockerRequest$InquiryResponse$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ResolvePersonaDidvBlockerRequest.InquiryResponse.Companion.getClass();
        if (i == 1) {
            return ResolvePersonaDidvBlockerRequest.InquiryResponse.ERROR;
        }
        if (i == 2) {
            return ResolvePersonaDidvBlockerRequest.InquiryResponse.CANCEL;
        }
        if (i != 3) {
            return null;
        }
        return ResolvePersonaDidvBlockerRequest.InquiryResponse.COMPLETE;
    }
}
