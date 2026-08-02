package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCardBlockedBusinessesUIConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCardBlockedBusinessesUIConfigResponse((CardBlockedBusinessesUIConfig) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardBlockedBusinessesUIConfig.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCardBlockedBusinessesUIConfigResponse getCardBlockedBusinessesUIConfigResponse = (GetCardBlockedBusinessesUIConfigResponse) obj;
        reverseProtoWriter.getClass();
        getCardBlockedBusinessesUIConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getCardBlockedBusinessesUIConfigResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCardBlockedBusinessesUIConfigResponse.response_context);
        CardBlockedBusinessesUIConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCardBlockedBusinessesUIConfigResponse.card_blocked_businesses_ui_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCardBlockedBusinessesUIConfigResponse getCardBlockedBusinessesUIConfigResponse = (GetCardBlockedBusinessesUIConfigResponse) obj;
        getCardBlockedBusinessesUIConfigResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, getCardBlockedBusinessesUIConfigResponse.response_context) + CardBlockedBusinessesUIConfig.ADAPTER.encodedSizeWithTag(1, getCardBlockedBusinessesUIConfigResponse.card_blocked_businesses_ui_config) + getCardBlockedBusinessesUIConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCardBlockedBusinessesUIConfigResponse getCardBlockedBusinessesUIConfigResponse = (GetCardBlockedBusinessesUIConfigResponse) obj;
        getCardBlockedBusinessesUIConfigResponse.getClass();
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = getCardBlockedBusinessesUIConfigResponse.card_blocked_businesses_ui_config;
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig2 = cardBlockedBusinessesUIConfig != null ? (CardBlockedBusinessesUIConfig) CardBlockedBusinessesUIConfig.ADAPTER.redact(cardBlockedBusinessesUIConfig) : null;
        ResponseContext responseContext = getCardBlockedBusinessesUIConfigResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCardBlockedBusinessesUIConfigResponse(cardBlockedBusinessesUIConfig2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCardBlockedBusinessesUIConfigResponse getCardBlockedBusinessesUIConfigResponse = (GetCardBlockedBusinessesUIConfigResponse) obj;
        getCardBlockedBusinessesUIConfigResponse.getClass();
        CardBlockedBusinessesUIConfig.ADAPTER.encodeWithTag(protoWriter, 1, getCardBlockedBusinessesUIConfigResponse.card_blocked_businesses_ui_config);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getCardBlockedBusinessesUIConfigResponse.response_context);
        protoWriter.writeBytes(getCardBlockedBusinessesUIConfigResponse.unknownFields());
    }
}
