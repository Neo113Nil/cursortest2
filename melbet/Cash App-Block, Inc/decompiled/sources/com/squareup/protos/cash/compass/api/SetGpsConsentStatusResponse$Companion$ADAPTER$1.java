package com.squareup.protos.cash.compass.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetGpsConsentStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetGpsConsentStatusResponse((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetGpsConsentStatusResponse setGpsConsentStatusResponse = (SetGpsConsentStatusResponse) obj;
        reverseProtoWriter.getClass();
        setGpsConsentStatusResponse.getClass();
        reverseProtoWriter.writeBytes(setGpsConsentStatusResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, setGpsConsentStatusResponse.consent_changed);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetGpsConsentStatusResponse setGpsConsentStatusResponse = (SetGpsConsentStatusResponse) obj;
        setGpsConsentStatusResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, setGpsConsentStatusResponse.consent_changed) + setGpsConsentStatusResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetGpsConsentStatusResponse setGpsConsentStatusResponse = (SetGpsConsentStatusResponse) obj;
        setGpsConsentStatusResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = setGpsConsentStatusResponse.consent_changed;
        byteString.getClass();
        return new SetGpsConsentStatusResponse(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetGpsConsentStatusResponse setGpsConsentStatusResponse = (SetGpsConsentStatusResponse) obj;
        setGpsConsentStatusResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setGpsConsentStatusResponse.consent_changed);
        protoWriter.writeBytes(setGpsConsentStatusResponse.unknownFields());
    }
}
