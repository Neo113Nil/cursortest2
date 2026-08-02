package com.squareup.protos.cash.cashvoice.syncentity.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupportPhoneConfirmation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportPhoneConfirmation((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportPhoneConfirmation supportPhoneConfirmation = (SupportPhoneConfirmation) obj;
        reverseProtoWriter.getClass();
        supportPhoneConfirmation.getClass();
        reverseProtoWriter.writeBytes(supportPhoneConfirmation.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, supportPhoneConfirmation.verification_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportPhoneConfirmation supportPhoneConfirmation = (SupportPhoneConfirmation) obj;
        supportPhoneConfirmation.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, supportPhoneConfirmation.verification_id) + supportPhoneConfirmation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportPhoneConfirmation supportPhoneConfirmation = (SupportPhoneConfirmation) obj;
        supportPhoneConfirmation.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = supportPhoneConfirmation.verification_id;
        byteString.getClass();
        return new SupportPhoneConfirmation(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportPhoneConfirmation supportPhoneConfirmation = (SupportPhoneConfirmation) obj;
        supportPhoneConfirmation.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, supportPhoneConfirmation.verification_id);
        protoWriter.writeBytes(supportPhoneConfirmation.unknownFields());
    }
}
