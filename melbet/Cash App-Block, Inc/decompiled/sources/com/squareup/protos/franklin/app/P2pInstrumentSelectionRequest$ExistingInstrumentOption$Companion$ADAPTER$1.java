package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pInstrumentSelectionRequest$ExistingInstrumentOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2pInstrumentSelectionRequest.ExistingInstrumentOption((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        P2pInstrumentSelectionRequest.ExistingInstrumentOption existingInstrumentOption = (P2pInstrumentSelectionRequest.ExistingInstrumentOption) obj;
        reverseProtoWriter.getClass();
        existingInstrumentOption.getClass();
        reverseProtoWriter.writeBytes(existingInstrumentOption.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, existingInstrumentOption.instrument_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pInstrumentSelectionRequest.ExistingInstrumentOption existingInstrumentOption = (P2pInstrumentSelectionRequest.ExistingInstrumentOption) obj;
        existingInstrumentOption.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, existingInstrumentOption.instrument_token) + existingInstrumentOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pInstrumentSelectionRequest.ExistingInstrumentOption existingInstrumentOption = (P2pInstrumentSelectionRequest.ExistingInstrumentOption) obj;
        existingInstrumentOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = existingInstrumentOption.instrument_token;
        byteString.getClass();
        return new P2pInstrumentSelectionRequest.ExistingInstrumentOption(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pInstrumentSelectionRequest.ExistingInstrumentOption existingInstrumentOption = (P2pInstrumentSelectionRequest.ExistingInstrumentOption) obj;
        existingInstrumentOption.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, existingInstrumentOption.instrument_token);
        protoWriter.writeBytes(existingInstrumentOption.unknownFields());
    }
}
