package com.squareup.protos.cash.cashidv.flows;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DisplayNameFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisplayNameFlowParameters((Boolean) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisplayNameFlowParameters displayNameFlowParameters = (DisplayNameFlowParameters) obj;
        reverseProtoWriter.getClass();
        displayNameFlowParameters.getClass();
        reverseProtoWriter.writeBytes(displayNameFlowParameters.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, displayNameFlowParameters.numChangesRemaining);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, displayNameFlowParameters.isBusiness);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisplayNameFlowParameters displayNameFlowParameters = (DisplayNameFlowParameters) obj;
        displayNameFlowParameters.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(2, displayNameFlowParameters.numChangesRemaining) + ProtoAdapter.BOOL.encodedSizeWithTag(1, displayNameFlowParameters.isBusiness) + displayNameFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisplayNameFlowParameters displayNameFlowParameters = (DisplayNameFlowParameters) obj;
        displayNameFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = displayNameFlowParameters.isBusiness;
        Integer num = displayNameFlowParameters.numChangesRemaining;
        byteString.getClass();
        return new DisplayNameFlowParameters(bool, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisplayNameFlowParameters displayNameFlowParameters = (DisplayNameFlowParameters) obj;
        displayNameFlowParameters.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, displayNameFlowParameters.isBusiness);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, displayNameFlowParameters.numChangesRemaining);
        protoWriter.writeBytes(displayNameFlowParameters.unknownFields());
    }
}
