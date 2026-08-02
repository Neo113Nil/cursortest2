package com.squareup.protos.cash.referly.api.incentives.client;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PromotionControls$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PromotionControls((String) obj, (Boolean) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PromotionControls promotionControls = (PromotionControls) obj;
        reverseProtoWriter.getClass();
        promotionControls.getClass();
        reverseProtoWriter.writeBytes(promotionControls.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, promotionControls.show_toggle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, promotionControls.enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, promotionControls.client_route_for_enablement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PromotionControls promotionControls = (PromotionControls) obj;
        promotionControls.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, promotionControls.client_route_for_enablement) + promotionControls.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(3, promotionControls.show_toggle) + protoAdapter.encodedSizeWithTag(2, promotionControls.enabled) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PromotionControls promotionControls = (PromotionControls) obj;
        promotionControls.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = promotionControls.client_route_for_enablement;
        Boolean bool = promotionControls.enabled;
        Boolean bool2 = promotionControls.show_toggle;
        byteString.getClass();
        return new PromotionControls(str, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PromotionControls promotionControls = (PromotionControls) obj;
        promotionControls.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, promotionControls.client_route_for_enablement);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, promotionControls.enabled);
        protoAdapter.encodeWithTag(protoWriter, 3, promotionControls.show_toggle);
        protoWriter.writeBytes(promotionControls.unknownFields());
    }
}
