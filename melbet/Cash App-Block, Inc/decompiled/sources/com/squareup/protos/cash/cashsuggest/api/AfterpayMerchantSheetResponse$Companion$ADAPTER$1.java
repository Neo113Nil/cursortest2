package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AfterpayMerchantSheetResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayMerchantSheetResponse((AfterpayMerchantSheet) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AfterpayMerchantSheet.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) obj;
        reverseProtoWriter.getClass();
        afterpayMerchantSheetResponse.getClass();
        reverseProtoWriter.writeBytes(afterpayMerchantSheetResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, afterpayMerchantSheetResponse.expire_at_ms);
        AfterpayMerchantSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayMerchantSheetResponse.sheet);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) obj;
        afterpayMerchantSheetResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, afterpayMerchantSheetResponse.expire_at_ms) + AfterpayMerchantSheet.ADAPTER.encodedSizeWithTag(1, afterpayMerchantSheetResponse.sheet) + afterpayMerchantSheetResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) obj;
        afterpayMerchantSheetResponse.getClass();
        AfterpayMerchantSheet afterpayMerchantSheet = afterpayMerchantSheetResponse.sheet;
        AfterpayMerchantSheet afterpayMerchantSheet2 = afterpayMerchantSheet != null ? (AfterpayMerchantSheet) AfterpayMerchantSheet.ADAPTER.redact(afterpayMerchantSheet) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = afterpayMerchantSheetResponse.expire_at_ms;
        byteString.getClass();
        return new AfterpayMerchantSheetResponse(afterpayMerchantSheet2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) obj;
        afterpayMerchantSheetResponse.getClass();
        AfterpayMerchantSheet.ADAPTER.encodeWithTag(protoWriter, 1, afterpayMerchantSheetResponse.sheet);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, afterpayMerchantSheetResponse.expire_at_ms);
        protoWriter.writeBytes(afterpayMerchantSheetResponse.unknownFields());
    }
}
