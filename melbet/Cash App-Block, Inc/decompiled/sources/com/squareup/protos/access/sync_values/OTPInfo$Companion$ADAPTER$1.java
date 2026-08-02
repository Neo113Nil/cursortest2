package com.squareup.protos.access.sync_values;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OTPInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OTPInfo((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OTPInfo oTPInfo = (OTPInfo) obj;
        reverseProtoWriter.getClass();
        oTPInfo.getClass();
        reverseProtoWriter.writeBytes(oTPInfo.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, oTPInfo.otp_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OTPInfo oTPInfo = (OTPInfo) obj;
        oTPInfo.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, oTPInfo.otp_enabled) + oTPInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OTPInfo oTPInfo = (OTPInfo) obj;
        oTPInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = oTPInfo.otp_enabled;
        byteString.getClass();
        return new OTPInfo(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OTPInfo oTPInfo = (OTPInfo) obj;
        oTPInfo.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, oTPInfo.otp_enabled);
        protoWriter.writeBytes(oTPInfo.unknownFields());
    }
}
