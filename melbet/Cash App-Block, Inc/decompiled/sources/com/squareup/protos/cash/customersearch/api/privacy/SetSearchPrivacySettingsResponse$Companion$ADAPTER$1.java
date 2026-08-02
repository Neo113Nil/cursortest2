package com.squareup.protos.cash.customersearch.api.privacy;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetSearchPrivacySettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetSearchPrivacySettingsResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetSearchPrivacySettingsResponse setSearchPrivacySettingsResponse = (SetSearchPrivacySettingsResponse) obj;
        reverseProtoWriter.getClass();
        setSearchPrivacySettingsResponse.getClass();
        reverseProtoWriter.writeBytes(setSearchPrivacySettingsResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetSearchPrivacySettingsResponse setSearchPrivacySettingsResponse = (SetSearchPrivacySettingsResponse) obj;
        setSearchPrivacySettingsResponse.getClass();
        return setSearchPrivacySettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SetSearchPrivacySettingsResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetSearchPrivacySettingsResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetSearchPrivacySettingsResponse setSearchPrivacySettingsResponse = (SetSearchPrivacySettingsResponse) obj;
        setSearchPrivacySettingsResponse.getClass();
        protoWriter.writeBytes(setSearchPrivacySettingsResponse.unknownFields());
    }
}
