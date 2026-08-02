package com.squareup.protos.cash.referly.api.incentives.client;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetPromotionControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetPromotionControlsResponse((PromotionControls) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PromotionControls.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetPromotionControlsResponse setPromotionControlsResponse = (SetPromotionControlsResponse) obj;
        reverseProtoWriter.getClass();
        setPromotionControlsResponse.getClass();
        reverseProtoWriter.writeBytes(setPromotionControlsResponse.unknownFields());
        PromotionControls.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setPromotionControlsResponse.controls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetPromotionControlsResponse setPromotionControlsResponse = (SetPromotionControlsResponse) obj;
        setPromotionControlsResponse.getClass();
        return PromotionControls.ADAPTER.encodedSizeWithTag(1, setPromotionControlsResponse.controls) + setPromotionControlsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetPromotionControlsResponse setPromotionControlsResponse = (SetPromotionControlsResponse) obj;
        setPromotionControlsResponse.getClass();
        PromotionControls promotionControls = setPromotionControlsResponse.controls;
        PromotionControls promotionControls2 = promotionControls != null ? (PromotionControls) PromotionControls.ADAPTER.redact(promotionControls) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetPromotionControlsResponse(promotionControls2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetPromotionControlsResponse setPromotionControlsResponse = (SetPromotionControlsResponse) obj;
        setPromotionControlsResponse.getClass();
        PromotionControls.ADAPTER.encodeWithTag(protoWriter, 1, setPromotionControlsResponse.controls);
        protoWriter.writeBytes(setPromotionControlsResponse.unknownFields());
    }
}
