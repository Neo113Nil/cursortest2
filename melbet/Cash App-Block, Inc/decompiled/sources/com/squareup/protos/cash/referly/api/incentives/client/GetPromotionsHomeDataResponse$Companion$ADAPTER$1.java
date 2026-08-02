package com.squareup.protos.cash.referly.api.incentives.client;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPromotionsHomeDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPromotionsHomeDataResponse((PromotionsHomeData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PromotionsHomeData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPromotionsHomeDataResponse getPromotionsHomeDataResponse = (GetPromotionsHomeDataResponse) obj;
        reverseProtoWriter.getClass();
        getPromotionsHomeDataResponse.getClass();
        reverseProtoWriter.writeBytes(getPromotionsHomeDataResponse.unknownFields());
        PromotionsHomeData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPromotionsHomeDataResponse.promotions_home_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPromotionsHomeDataResponse getPromotionsHomeDataResponse = (GetPromotionsHomeDataResponse) obj;
        getPromotionsHomeDataResponse.getClass();
        return PromotionsHomeData.ADAPTER.encodedSizeWithTag(1, getPromotionsHomeDataResponse.promotions_home_data) + getPromotionsHomeDataResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPromotionsHomeDataResponse getPromotionsHomeDataResponse = (GetPromotionsHomeDataResponse) obj;
        getPromotionsHomeDataResponse.getClass();
        PromotionsHomeData promotionsHomeData = getPromotionsHomeDataResponse.promotions_home_data;
        PromotionsHomeData promotionsHomeData2 = promotionsHomeData != null ? (PromotionsHomeData) PromotionsHomeData.ADAPTER.redact(promotionsHomeData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPromotionsHomeDataResponse(promotionsHomeData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPromotionsHomeDataResponse getPromotionsHomeDataResponse = (GetPromotionsHomeDataResponse) obj;
        getPromotionsHomeDataResponse.getClass();
        PromotionsHomeData.ADAPTER.encodeWithTag(protoWriter, 1, getPromotionsHomeDataResponse.promotions_home_data);
        protoWriter.writeBytes(getPromotionsHomeDataResponse.unknownFields());
    }
}
