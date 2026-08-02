package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Denied$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportPhoneStatusResponse.Denied((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SupportPhoneStatusResponse.Denied denied = (SupportPhoneStatusResponse.Denied) obj;
        reverseProtoWriter.getClass();
        denied.getClass();
        reverseProtoWriter.writeBytes(denied.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, denied.reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportPhoneStatusResponse.Denied denied = (SupportPhoneStatusResponse.Denied) obj;
        denied.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, denied.reason) + denied.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportPhoneStatusResponse.Denied denied = (SupportPhoneStatusResponse.Denied) obj;
        denied.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = denied.reason;
        byteString.getClass();
        return new SupportPhoneStatusResponse.Denied(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportPhoneStatusResponse.Denied denied = (SupportPhoneStatusResponse.Denied) obj;
        denied.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, denied.reason);
        protoWriter.writeBytes(denied.unknownFields());
    }
}
