package com.squareup.protos.cash.semaphore.api;

import com.squareup.protos.common.countries.Country;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetOnboardingConfigRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetOnboardingConfigRequest((Country) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Country.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetOnboardingConfigRequest getOnboardingConfigRequest = (GetOnboardingConfigRequest) obj;
        reverseProtoWriter.getClass();
        getOnboardingConfigRequest.getClass();
        reverseProtoWriter.writeBytes(getOnboardingConfigRequest.unknownFields());
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getOnboardingConfigRequest.device_locale_country);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetOnboardingConfigRequest getOnboardingConfigRequest = (GetOnboardingConfigRequest) obj;
        getOnboardingConfigRequest.getClass();
        return Country.ADAPTER.encodedSizeWithTag(1, getOnboardingConfigRequest.device_locale_country) + getOnboardingConfigRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetOnboardingConfigRequest getOnboardingConfigRequest = (GetOnboardingConfigRequest) obj;
        getOnboardingConfigRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        Country country = getOnboardingConfigRequest.device_locale_country;
        byteString.getClass();
        return new GetOnboardingConfigRequest(country, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetOnboardingConfigRequest getOnboardingConfigRequest = (GetOnboardingConfigRequest) obj;
        getOnboardingConfigRequest.getClass();
        Country.ADAPTER.encodeWithTag(protoWriter, 1, getOnboardingConfigRequest.device_locale_country);
        protoWriter.writeBytes(getOnboardingConfigRequest.unknownFields());
    }
}
