package com.squareup.protos.cash.referly.api.incentives.client;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPromotionControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPromotionControlsResponse((PromotionControls) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 4) {
                obj = TransactorKt.decodeMessageOrMerge(PromotionControls.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPromotionControlsResponse getPromotionControlsResponse = (GetPromotionControlsResponse) obj;
        reverseProtoWriter.getClass();
        getPromotionControlsResponse.getClass();
        reverseProtoWriter.writeBytes(getPromotionControlsResponse.unknownFields());
        PromotionControls.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getPromotionControlsResponse.controls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPromotionControlsResponse getPromotionControlsResponse = (GetPromotionControlsResponse) obj;
        getPromotionControlsResponse.getClass();
        return PromotionControls.ADAPTER.encodedSizeWithTag(4, getPromotionControlsResponse.controls) + getPromotionControlsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPromotionControlsResponse getPromotionControlsResponse = (GetPromotionControlsResponse) obj;
        getPromotionControlsResponse.getClass();
        PromotionControls promotionControls = getPromotionControlsResponse.controls;
        PromotionControls promotionControls2 = promotionControls != null ? (PromotionControls) PromotionControls.ADAPTER.redact(promotionControls) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPromotionControlsResponse(promotionControls2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPromotionControlsResponse getPromotionControlsResponse = (GetPromotionControlsResponse) obj;
        getPromotionControlsResponse.getClass();
        PromotionControls.ADAPTER.encodeWithTag(protoWriter, 4, getPromotionControlsResponse.controls);
        protoWriter.writeBytes(getPromotionControlsResponse.unknownFields());
    }
}
