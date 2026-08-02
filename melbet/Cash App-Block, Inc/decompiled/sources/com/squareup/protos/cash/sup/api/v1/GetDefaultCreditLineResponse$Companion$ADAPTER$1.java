package com.squareup.protos.cash.sup.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.lending.sync_values.SupOffersTabCreditLine;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetDefaultCreditLineResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDefaultCreditLineResponse((SupOffersTabCreditLine) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SupOffersTabCreditLine.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDefaultCreditLineResponse getDefaultCreditLineResponse = (GetDefaultCreditLineResponse) obj;
        reverseProtoWriter.getClass();
        getDefaultCreditLineResponse.getClass();
        reverseProtoWriter.writeBytes(getDefaultCreditLineResponse.unknownFields());
        SupOffersTabCreditLine.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getDefaultCreditLineResponse.credit_line);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDefaultCreditLineResponse getDefaultCreditLineResponse = (GetDefaultCreditLineResponse) obj;
        getDefaultCreditLineResponse.getClass();
        return SupOffersTabCreditLine.ADAPTER.encodedSizeWithTag(1, getDefaultCreditLineResponse.credit_line) + getDefaultCreditLineResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDefaultCreditLineResponse getDefaultCreditLineResponse = (GetDefaultCreditLineResponse) obj;
        getDefaultCreditLineResponse.getClass();
        SupOffersTabCreditLine supOffersTabCreditLine = getDefaultCreditLineResponse.credit_line;
        SupOffersTabCreditLine supOffersTabCreditLine2 = supOffersTabCreditLine != null ? (SupOffersTabCreditLine) SupOffersTabCreditLine.ADAPTER.redact(supOffersTabCreditLine) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetDefaultCreditLineResponse(supOffersTabCreditLine2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDefaultCreditLineResponse getDefaultCreditLineResponse = (GetDefaultCreditLineResponse) obj;
        getDefaultCreditLineResponse.getClass();
        SupOffersTabCreditLine.ADAPTER.encodeWithTag(protoWriter, 1, getDefaultCreditLineResponse.credit_line);
        protoWriter.writeBytes(getDefaultCreditLineResponse.unknownFields());
    }
}
