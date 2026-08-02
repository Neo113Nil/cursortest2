package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetProfileDetailsResponse$MerchantData$MerchantProfileImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetProfileDetailsResponse.MerchantData.MerchantProfileImage((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetProfileDetailsResponse.MerchantData.MerchantProfileImage merchantProfileImage = (GetProfileDetailsResponse.MerchantData.MerchantProfileImage) obj;
        reverseProtoWriter.getClass();
        merchantProfileImage.getClass();
        reverseProtoWriter.writeBytes(merchantProfileImage.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, merchantProfileImage.dark_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, merchantProfileImage.light_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetProfileDetailsResponse.MerchantData.MerchantProfileImage merchantProfileImage = (GetProfileDetailsResponse.MerchantData.MerchantProfileImage) obj;
        merchantProfileImage.getClass();
        int size$okio = merchantProfileImage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, merchantProfileImage.dark_url) + protoAdapter.encodedSizeWithTag(1, merchantProfileImage.light_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetProfileDetailsResponse.MerchantData.MerchantProfileImage) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetProfileDetailsResponse.MerchantData.MerchantProfileImage(null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetProfileDetailsResponse.MerchantData.MerchantProfileImage merchantProfileImage = (GetProfileDetailsResponse.MerchantData.MerchantProfileImage) obj;
        merchantProfileImage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, merchantProfileImage.light_url);
        protoAdapter.encodeWithTag(protoWriter, 2, merchantProfileImage.dark_url);
        protoWriter.writeBytes(merchantProfileImage.unknownFields());
    }
}
