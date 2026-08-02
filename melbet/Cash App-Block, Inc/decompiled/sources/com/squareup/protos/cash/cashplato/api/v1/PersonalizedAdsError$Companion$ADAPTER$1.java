package com.squareup.protos.cash.cashplato.api.v1;

import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsError;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PersonalizedAdsError$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PersonalizedAdsError((PersonalizedAdsError.ErrorType) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PersonalizedAdsError.ErrorType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PersonalizedAdsError personalizedAdsError = (PersonalizedAdsError) obj;
        reverseProtoWriter.getClass();
        personalizedAdsError.getClass();
        reverseProtoWriter.writeBytes(personalizedAdsError.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, personalizedAdsError.user_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, personalizedAdsError.error_details);
        PersonalizedAdsError.ErrorType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, personalizedAdsError.error_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PersonalizedAdsError personalizedAdsError = (PersonalizedAdsError) obj;
        personalizedAdsError.getClass();
        int encodedSizeWithTag = PersonalizedAdsError.ErrorType.ADAPTER.encodedSizeWithTag(1, personalizedAdsError.error_type) + personalizedAdsError.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, personalizedAdsError.user_message) + protoAdapter.encodedSizeWithTag(2, personalizedAdsError.error_details) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PersonalizedAdsError personalizedAdsError = (PersonalizedAdsError) obj;
        personalizedAdsError.getClass();
        ByteString byteString = ByteString.EMPTY;
        PersonalizedAdsError.ErrorType errorType = personalizedAdsError.error_type;
        String str = personalizedAdsError.error_details;
        String str2 = personalizedAdsError.user_message;
        byteString.getClass();
        return new PersonalizedAdsError(errorType, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PersonalizedAdsError personalizedAdsError = (PersonalizedAdsError) obj;
        personalizedAdsError.getClass();
        PersonalizedAdsError.ErrorType.ADAPTER.encodeWithTag(protoWriter, 1, personalizedAdsError.error_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, personalizedAdsError.error_details);
        protoAdapter.encodeWithTag(protoWriter, 3, personalizedAdsError.user_message);
        protoWriter.writeBytes(personalizedAdsError.unknownFields());
    }
}
