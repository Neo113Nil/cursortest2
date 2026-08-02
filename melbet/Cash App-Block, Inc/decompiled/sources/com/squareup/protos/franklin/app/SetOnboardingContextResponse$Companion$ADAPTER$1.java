package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetOnboardingContextResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetOnboardingContextResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetOnboardingContextResponse setOnboardingContextResponse = (SetOnboardingContextResponse) obj;
        reverseProtoWriter.getClass();
        setOnboardingContextResponse.getClass();
        reverseProtoWriter.writeBytes(setOnboardingContextResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setOnboardingContextResponse.initiation_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetOnboardingContextResponse setOnboardingContextResponse = (SetOnboardingContextResponse) obj;
        setOnboardingContextResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, setOnboardingContextResponse.initiation_data) + setOnboardingContextResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetOnboardingContextResponse setOnboardingContextResponse = (SetOnboardingContextResponse) obj;
        setOnboardingContextResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = setOnboardingContextResponse.initiation_data;
        byteString.getClass();
        return new SetOnboardingContextResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetOnboardingContextResponse setOnboardingContextResponse = (SetOnboardingContextResponse) obj;
        setOnboardingContextResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setOnboardingContextResponse.initiation_data);
        protoWriter.writeBytes(setOnboardingContextResponse.unknownFields());
    }
}
