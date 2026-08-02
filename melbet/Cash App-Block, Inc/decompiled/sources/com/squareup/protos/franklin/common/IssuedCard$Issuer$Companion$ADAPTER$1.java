package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class IssuedCard$Issuer$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        IssuedCard.Issuer.Companion.getClass();
        if (i == 1) {
            return IssuedCard.Issuer.SHAZAM;
        }
        if (i == 2) {
            return IssuedCard.Issuer.MARQETA;
        }
        if (i != 3) {
            return null;
        }
        return IssuedCard.Issuer.VISA_DPS;
    }
}
