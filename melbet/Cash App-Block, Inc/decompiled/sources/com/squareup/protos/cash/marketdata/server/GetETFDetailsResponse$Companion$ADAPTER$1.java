package com.squareup.protos.cash.marketdata.server;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.protos.cash.marketdata.model.SectorsDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetETFDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetETFDetailsResponse((Long) obj, (HoldingsDetails) obj2, (SectorsDetails) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(HoldingsDetails.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(SectorsDetails.ADAPTER, protoReader, obj3);
            } else if (nextTag != 11) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getETFDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getETFDetailsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, getETFDetailsResponse.updated_at);
        SectorsDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getETFDetailsResponse.sectors_details);
        HoldingsDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getETFDetailsResponse.holdings_details);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getETFDetailsResponse.next_refresh_mins);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) obj;
        getETFDetailsResponse.getClass();
        int size$okio = getETFDetailsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(11, getETFDetailsResponse.updated_at) + SectorsDetails.ADAPTER.encodedSizeWithTag(3, getETFDetailsResponse.sectors_details) + HoldingsDetails.ADAPTER.encodedSizeWithTag(2, getETFDetailsResponse.holdings_details) + protoAdapter.encodedSizeWithTag(1, getETFDetailsResponse.next_refresh_mins) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) obj;
        getETFDetailsResponse.getClass();
        HoldingsDetails holdingsDetails = getETFDetailsResponse.holdings_details;
        HoldingsDetails holdingsDetails2 = holdingsDetails != null ? (HoldingsDetails) HoldingsDetails.ADAPTER.redact(holdingsDetails) : null;
        SectorsDetails sectorsDetails = getETFDetailsResponse.sectors_details;
        SectorsDetails sectorsDetails2 = sectorsDetails != null ? (SectorsDetails) SectorsDetails.ADAPTER.redact(sectorsDetails) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = getETFDetailsResponse.next_refresh_mins;
        Long l2 = getETFDetailsResponse.updated_at;
        byteString.getClass();
        return new GetETFDetailsResponse(l, holdingsDetails2, sectorsDetails2, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) obj;
        getETFDetailsResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, getETFDetailsResponse.next_refresh_mins);
        HoldingsDetails.ADAPTER.encodeWithTag(protoWriter, 2, getETFDetailsResponse.holdings_details);
        SectorsDetails.ADAPTER.encodeWithTag(protoWriter, 3, getETFDetailsResponse.sectors_details);
        protoAdapter.encodeWithTag(protoWriter, 11, getETFDetailsResponse.updated_at);
        protoWriter.writeBytes(getETFDetailsResponse.unknownFields());
    }
}
