package com.squareup.protos.cash.instantpay.api.serverpush;

import com.squareup.protos.cash.instantpay.api.InstantPayoutAttemptStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InstantPayoutAttempt$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstantPayoutAttempt((InstantPayoutAttemptStatus) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = InstantPayoutAttemptStatus.ADAPTER.decode(protoReader);
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
        InstantPayoutAttempt instantPayoutAttempt = (InstantPayoutAttempt) obj;
        reverseProtoWriter.getClass();
        instantPayoutAttempt.getClass();
        reverseProtoWriter.writeBytes(instantPayoutAttempt.unknownFields());
        InstantPayoutAttemptStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, instantPayoutAttempt.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstantPayoutAttempt instantPayoutAttempt = (InstantPayoutAttempt) obj;
        instantPayoutAttempt.getClass();
        return InstantPayoutAttemptStatus.ADAPTER.encodedSizeWithTag(1, instantPayoutAttempt.status) + instantPayoutAttempt.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantPayoutAttempt instantPayoutAttempt = (InstantPayoutAttempt) obj;
        instantPayoutAttempt.getClass();
        ByteString byteString = ByteString.EMPTY;
        InstantPayoutAttemptStatus instantPayoutAttemptStatus = instantPayoutAttempt.status;
        byteString.getClass();
        return new InstantPayoutAttempt(instantPayoutAttemptStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantPayoutAttempt instantPayoutAttempt = (InstantPayoutAttempt) obj;
        instantPayoutAttempt.getClass();
        InstantPayoutAttemptStatus.ADAPTER.encodeWithTag(protoWriter, 1, instantPayoutAttempt.status);
        protoWriter.writeBytes(instantPayoutAttempt.unknownFields());
    }
}
