package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyMagicLinkResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class VerifyMagicLinkResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyMagicLinkResponse.Status.Companion.getClass();
        switch (i) {
            case 0:
                return VerifyMagicLinkResponse.Status.INVALID;
            case 1:
                return VerifyMagicLinkResponse.Status.SUCCESS;
            case 2:
                return VerifyMagicLinkResponse.Status.INVALID_APP_TOKEN;
            case 3:
                return VerifyMagicLinkResponse.Status.INVALID_VERIFICATION_TOKEN;
            case 4:
                return VerifyMagicLinkResponse.Status.EXPIRED_VERIFICATION_TOKEN;
            case 5:
                return VerifyMagicLinkResponse.Status.TOO_MANY_FAILED_ATTEMPTS;
            case 6:
                return VerifyMagicLinkResponse.Status.NOT_ELIGIBLE;
            default:
                return null;
        }
    }
}
