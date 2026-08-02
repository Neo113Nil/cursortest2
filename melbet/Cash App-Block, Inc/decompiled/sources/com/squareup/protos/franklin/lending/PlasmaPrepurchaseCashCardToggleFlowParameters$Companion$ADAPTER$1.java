package com.squareup.protos.franklin.lending;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PlasmaPrepurchaseCashCardToggleFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PlasmaPrepurchaseCashCardToggleFlowParameters((String) obj2, (ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters = (PlasmaPrepurchaseCashCardToggleFlowParameters) obj;
        reverseProtoWriter.getClass();
        plasmaPrepurchaseCashCardToggleFlowParameters.getClass();
        reverseProtoWriter.writeBytes(plasmaPrepurchaseCashCardToggleFlowParameters.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, plasmaPrepurchaseCashCardToggleFlowParameters.selected_option);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, plasmaPrepurchaseCashCardToggleFlowParameters.opaque_request_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters = (PlasmaPrepurchaseCashCardToggleFlowParameters) obj;
        plasmaPrepurchaseCashCardToggleFlowParameters.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, plasmaPrepurchaseCashCardToggleFlowParameters.selected_option) + ProtoAdapter.BYTES.encodedSizeWithTag(1, plasmaPrepurchaseCashCardToggleFlowParameters.opaque_request_data) + plasmaPrepurchaseCashCardToggleFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters = (PlasmaPrepurchaseCashCardToggleFlowParameters) obj;
        plasmaPrepurchaseCashCardToggleFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = plasmaPrepurchaseCashCardToggleFlowParameters.opaque_request_data;
        String str = plasmaPrepurchaseCashCardToggleFlowParameters.selected_option;
        byteString.getClass();
        return new PlasmaPrepurchaseCashCardToggleFlowParameters(str, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters = (PlasmaPrepurchaseCashCardToggleFlowParameters) obj;
        plasmaPrepurchaseCashCardToggleFlowParameters.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, plasmaPrepurchaseCashCardToggleFlowParameters.opaque_request_data);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, plasmaPrepurchaseCashCardToggleFlowParameters.selected_option);
        protoWriter.writeBytes(plasmaPrepurchaseCashCardToggleFlowParameters.unknownFields());
    }
}
