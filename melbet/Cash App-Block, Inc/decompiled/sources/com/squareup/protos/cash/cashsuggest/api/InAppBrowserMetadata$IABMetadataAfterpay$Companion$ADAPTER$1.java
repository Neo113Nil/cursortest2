package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$IABMetadataAfterpay$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppBrowserMetadata.IABMetadataAfterpay((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataAfterpay iABMetadataAfterpay = (InAppBrowserMetadata.IABMetadataAfterpay) obj;
        reverseProtoWriter.getClass();
        iABMetadataAfterpay.getClass();
        reverseProtoWriter.writeBytes(iABMetadataAfterpay.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, iABMetadataAfterpay.number_installments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserMetadata.IABMetadataAfterpay iABMetadataAfterpay = (InAppBrowserMetadata.IABMetadataAfterpay) obj;
        iABMetadataAfterpay.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, iABMetadataAfterpay.number_installments) + iABMetadataAfterpay.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserMetadata.IABMetadataAfterpay iABMetadataAfterpay = (InAppBrowserMetadata.IABMetadataAfterpay) obj;
        iABMetadataAfterpay.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = iABMetadataAfterpay.number_installments;
        byteString.getClass();
        return new InAppBrowserMetadata.IABMetadataAfterpay(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataAfterpay iABMetadataAfterpay = (InAppBrowserMetadata.IABMetadataAfterpay) obj;
        iABMetadataAfterpay.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, iABMetadataAfterpay.number_installments);
        protoWriter.writeBytes(iABMetadataAfterpay.unknownFields());
    }
}
