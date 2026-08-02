package com.squareup.protos.wiremate;

import com.squareup.protos.wiremate.WiresEligibilityState;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class WiresEligibilityState$Ineligible$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WiresEligibilityState.Ineligible(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WiresEligibilityState.Ineligible ineligible = (WiresEligibilityState.Ineligible) obj;
        reverseProtoWriter.getClass();
        ineligible.getClass();
        reverseProtoWriter.writeBytes(ineligible.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WiresEligibilityState.Ineligible ineligible = (WiresEligibilityState.Ineligible) obj;
        ineligible.getClass();
        return ineligible.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((WiresEligibilityState.Ineligible) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new WiresEligibilityState.Ineligible(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WiresEligibilityState.Ineligible ineligible = (WiresEligibilityState.Ineligible) obj;
        ineligible.getClass();
        protoWriter.writeBytes(ineligible.unknownFields());
    }
}
