package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.GetP2pProfileDetailsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetP2pProfileDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetP2pProfileDetailsResponse((GetP2pProfileDetailsResponse.HeaderData) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GetP2pProfileDetailsResponse.HeaderData.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GetP2pProfileDetailsResponse.TrustElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetP2pProfileDetailsResponse getP2pProfileDetailsResponse = (GetP2pProfileDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getP2pProfileDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getP2pProfileDetailsResponse.unknownFields());
        GetP2pProfileDetailsResponse.TrustElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, getP2pProfileDetailsResponse.trust_elements);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getP2pProfileDetailsResponse.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getP2pProfileDetailsResponse.title);
        GetP2pProfileDetailsResponse.HeaderData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getP2pProfileDetailsResponse.header_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetP2pProfileDetailsResponse getP2pProfileDetailsResponse = (GetP2pProfileDetailsResponse) obj;
        getP2pProfileDetailsResponse.getClass();
        int encodedSizeWithTag = GetP2pProfileDetailsResponse.HeaderData.ADAPTER.encodedSizeWithTag(1, getP2pProfileDetailsResponse.header_data) + getP2pProfileDetailsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return GetP2pProfileDetailsResponse.TrustElement.ADAPTER.asRepeated().encodedSizeWithTag(4, getP2pProfileDetailsResponse.trust_elements) + protoAdapter.encodedSizeWithTag(3, getP2pProfileDetailsResponse.subtitle) + protoAdapter.encodedSizeWithTag(2, getP2pProfileDetailsResponse.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetP2pProfileDetailsResponse getP2pProfileDetailsResponse = (GetP2pProfileDetailsResponse) obj;
        getP2pProfileDetailsResponse.getClass();
        GetP2pProfileDetailsResponse.HeaderData headerData = getP2pProfileDetailsResponse.header_data;
        GetP2pProfileDetailsResponse.HeaderData headerData2 = headerData != null ? (GetP2pProfileDetailsResponse.HeaderData) GetP2pProfileDetailsResponse.HeaderData.ADAPTER.redact(headerData) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getP2pProfileDetailsResponse.trust_elements, GetP2pProfileDetailsResponse.TrustElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getP2pProfileDetailsResponse.title;
        String str2 = getP2pProfileDetailsResponse.subtitle;
        byteString.getClass();
        return new GetP2pProfileDetailsResponse(headerData2, str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetP2pProfileDetailsResponse getP2pProfileDetailsResponse = (GetP2pProfileDetailsResponse) obj;
        getP2pProfileDetailsResponse.getClass();
        GetP2pProfileDetailsResponse.HeaderData.ADAPTER.encodeWithTag(protoWriter, 1, getP2pProfileDetailsResponse.header_data);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, getP2pProfileDetailsResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, getP2pProfileDetailsResponse.subtitle);
        GetP2pProfileDetailsResponse.TrustElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getP2pProfileDetailsResponse.trust_elements);
        protoWriter.writeBytes(getP2pProfileDetailsResponse.unknownFields());
    }
}
