package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCommerceProfileResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCommerceProfileResponse((CommerceProfileData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CommerceProfileData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCommerceProfileResponse getCommerceProfileResponse = (GetCommerceProfileResponse) obj;
        reverseProtoWriter.getClass();
        getCommerceProfileResponse.getClass();
        reverseProtoWriter.writeBytes(getCommerceProfileResponse.unknownFields());
        CommerceProfileData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCommerceProfileResponse.profile_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCommerceProfileResponse getCommerceProfileResponse = (GetCommerceProfileResponse) obj;
        getCommerceProfileResponse.getClass();
        return CommerceProfileData.ADAPTER.encodedSizeWithTag(1, getCommerceProfileResponse.profile_data) + getCommerceProfileResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCommerceProfileResponse getCommerceProfileResponse = (GetCommerceProfileResponse) obj;
        getCommerceProfileResponse.getClass();
        CommerceProfileData commerceProfileData = getCommerceProfileResponse.profile_data;
        CommerceProfileData commerceProfileData2 = commerceProfileData != null ? (CommerceProfileData) CommerceProfileData.ADAPTER.redact(commerceProfileData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCommerceProfileResponse(commerceProfileData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCommerceProfileResponse getCommerceProfileResponse = (GetCommerceProfileResponse) obj;
        getCommerceProfileResponse.getClass();
        CommerceProfileData.ADAPTER.encodeWithTag(protoWriter, 1, getCommerceProfileResponse.profile_data);
        protoWriter.writeBytes(getCommerceProfileResponse.unknownFields());
    }
}
