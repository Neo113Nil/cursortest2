package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RestrictedCashInTransferRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RestrictedCashInTransferRenderData((Long) obj, (Long) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RestrictedCashInTransferRenderData restrictedCashInTransferRenderData = (RestrictedCashInTransferRenderData) obj;
        reverseProtoWriter.getClass();
        restrictedCashInTransferRenderData.getClass();
        reverseProtoWriter.writeBytes(restrictedCashInTransferRenderData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, restrictedCashInTransferRenderData.is_for_bitcoin_purchase);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, restrictedCashInTransferRenderData.actual_restriction_lifted_at_epoch_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, restrictedCashInTransferRenderData.estimated_restriction_lifted_at_epoch_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RestrictedCashInTransferRenderData restrictedCashInTransferRenderData = (RestrictedCashInTransferRenderData) obj;
        restrictedCashInTransferRenderData.getClass();
        int size$okio = restrictedCashInTransferRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, restrictedCashInTransferRenderData.is_for_bitcoin_purchase) + protoAdapter.encodedSizeWithTag(2, restrictedCashInTransferRenderData.actual_restriction_lifted_at_epoch_ms) + protoAdapter.encodedSizeWithTag(1, restrictedCashInTransferRenderData.estimated_restriction_lifted_at_epoch_ms) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RestrictedCashInTransferRenderData restrictedCashInTransferRenderData = (RestrictedCashInTransferRenderData) obj;
        restrictedCashInTransferRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = restrictedCashInTransferRenderData.estimated_restriction_lifted_at_epoch_ms;
        Long l2 = restrictedCashInTransferRenderData.actual_restriction_lifted_at_epoch_ms;
        Boolean bool = restrictedCashInTransferRenderData.is_for_bitcoin_purchase;
        byteString.getClass();
        return new RestrictedCashInTransferRenderData(l, l2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RestrictedCashInTransferRenderData restrictedCashInTransferRenderData = (RestrictedCashInTransferRenderData) obj;
        restrictedCashInTransferRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, restrictedCashInTransferRenderData.estimated_restriction_lifted_at_epoch_ms);
        protoAdapter.encodeWithTag(protoWriter, 2, restrictedCashInTransferRenderData.actual_restriction_lifted_at_epoch_ms);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, restrictedCashInTransferRenderData.is_for_bitcoin_purchase);
        protoWriter.writeBytes(restrictedCashInTransferRenderData.unknownFields());
    }
}
