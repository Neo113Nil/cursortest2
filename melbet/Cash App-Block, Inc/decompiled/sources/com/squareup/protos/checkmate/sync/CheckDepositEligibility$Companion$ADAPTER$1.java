package com.squareup.protos.checkmate.sync;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CheckDepositEligibility$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CheckDepositEligibility((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CheckDepositEligibility checkDepositEligibility = (CheckDepositEligibility) obj;
        reverseProtoWriter.getClass();
        checkDepositEligibility.getClass();
        reverseProtoWriter.writeBytes(checkDepositEligibility.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, checkDepositEligibility.is_eligible);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CheckDepositEligibility checkDepositEligibility = (CheckDepositEligibility) obj;
        checkDepositEligibility.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, checkDepositEligibility.is_eligible) + checkDepositEligibility.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CheckDepositEligibility checkDepositEligibility = (CheckDepositEligibility) obj;
        checkDepositEligibility.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = checkDepositEligibility.is_eligible;
        byteString.getClass();
        return new CheckDepositEligibility(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CheckDepositEligibility checkDepositEligibility = (CheckDepositEligibility) obj;
        checkDepositEligibility.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, checkDepositEligibility.is_eligible);
        protoWriter.writeBytes(checkDepositEligibility.unknownFields());
    }
}
