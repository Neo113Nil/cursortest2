package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus$Companion$ADAPTER$1", "Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientCardUpdateStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ClientCardUpdateStatus.INSTANCE.getClass();
        if (i == 0) {
            return ClientCardUpdateStatus.CLIENT_CARD_UPDATE_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return ClientCardUpdateStatus.CLIENT_CARD_UPDATE_STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ClientCardUpdateStatus.CLIENT_CARD_UPDATE_STATUS_FAILED;
    }
}
