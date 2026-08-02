package com.squareup.protos.cash.cashplato.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleRequest;
import com.squareup.protos.consentsys.service.CopyParameters;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PersonalizedAdsToggleRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PersonalizedAdsToggleRequest((CopyParameters) obj, (PersonalizedAdsToggleRequest.OptType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CopyParameters.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = PersonalizedAdsToggleRequest.OptType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PersonalizedAdsToggleRequest personalizedAdsToggleRequest = (PersonalizedAdsToggleRequest) obj;
        reverseProtoWriter.getClass();
        personalizedAdsToggleRequest.getClass();
        reverseProtoWriter.writeBytes(personalizedAdsToggleRequest.unknownFields());
        PersonalizedAdsToggleRequest.OptType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, personalizedAdsToggleRequest.opt_type);
        CopyParameters.ADAPTER.encodeWithTag(reverseProtoWriter, 1, personalizedAdsToggleRequest.copy_parameters);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PersonalizedAdsToggleRequest personalizedAdsToggleRequest = (PersonalizedAdsToggleRequest) obj;
        personalizedAdsToggleRequest.getClass();
        return PersonalizedAdsToggleRequest.OptType.ADAPTER.encodedSizeWithTag(3, personalizedAdsToggleRequest.opt_type) + CopyParameters.ADAPTER.encodedSizeWithTag(1, personalizedAdsToggleRequest.copy_parameters) + personalizedAdsToggleRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PersonalizedAdsToggleRequest personalizedAdsToggleRequest = (PersonalizedAdsToggleRequest) obj;
        personalizedAdsToggleRequest.getClass();
        CopyParameters copyParameters = personalizedAdsToggleRequest.copy_parameters;
        CopyParameters copyParameters2 = copyParameters != null ? (CopyParameters) CopyParameters.ADAPTER.redact(copyParameters) : null;
        ByteString byteString = ByteString.EMPTY;
        PersonalizedAdsToggleRequest.OptType optType = personalizedAdsToggleRequest.opt_type;
        byteString.getClass();
        return new PersonalizedAdsToggleRequest(copyParameters2, optType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PersonalizedAdsToggleRequest personalizedAdsToggleRequest = (PersonalizedAdsToggleRequest) obj;
        personalizedAdsToggleRequest.getClass();
        CopyParameters.ADAPTER.encodeWithTag(protoWriter, 1, personalizedAdsToggleRequest.copy_parameters);
        PersonalizedAdsToggleRequest.OptType.ADAPTER.encodeWithTag(protoWriter, 3, personalizedAdsToggleRequest.opt_type);
        protoWriter.writeBytes(personalizedAdsToggleRequest.unknownFields());
    }
}
