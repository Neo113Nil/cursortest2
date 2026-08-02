package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class C4bEligibilityState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new C4bEligibilityState((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        C4bEligibilityState c4bEligibilityState = (C4bEligibilityState) obj;
        reverseProtoWriter.getClass();
        c4bEligibilityState.getClass();
        reverseProtoWriter.writeBytes(c4bEligibilityState.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, c4bEligibilityState.is_eligible);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        C4bEligibilityState c4bEligibilityState = (C4bEligibilityState) obj;
        c4bEligibilityState.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, c4bEligibilityState.is_eligible) + c4bEligibilityState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        C4bEligibilityState c4bEligibilityState = (C4bEligibilityState) obj;
        c4bEligibilityState.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = c4bEligibilityState.is_eligible;
        byteString.getClass();
        return new C4bEligibilityState(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        C4bEligibilityState c4bEligibilityState = (C4bEligibilityState) obj;
        c4bEligibilityState.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c4bEligibilityState.is_eligible);
        protoWriter.writeBytes(c4bEligibilityState.unknownFields());
    }
}
