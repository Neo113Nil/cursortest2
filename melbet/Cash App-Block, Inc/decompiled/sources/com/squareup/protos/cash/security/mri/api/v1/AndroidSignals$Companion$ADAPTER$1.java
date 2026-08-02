package com.squareup.protos.cash.security.mri.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AndroidSignals$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AndroidSignals((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 9) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AndroidSignals androidSignals = (AndroidSignals) obj;
        reverseProtoWriter.getClass();
        androidSignals.getClass();
        reverseProtoWriter.writeBytes(androidSignals.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, androidSignals.is_phone_call_active);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AndroidSignals androidSignals = (AndroidSignals) obj;
        androidSignals.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(9, androidSignals.is_phone_call_active) + androidSignals.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AndroidSignals androidSignals = (AndroidSignals) obj;
        androidSignals.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = androidSignals.is_phone_call_active;
        byteString.getClass();
        return new AndroidSignals(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AndroidSignals androidSignals = (AndroidSignals) obj;
        androidSignals.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, androidSignals.is_phone_call_active);
        protoWriter.writeBytes(androidSignals.unknownFields());
    }
}
