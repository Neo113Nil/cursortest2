package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstrumentLinkingOptions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentLinkingOptions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InstrumentLinkingOption.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentLinkingOptions instrumentLinkingOptions = (InstrumentLinkingOptions) obj;
        reverseProtoWriter.getClass();
        instrumentLinkingOptions.getClass();
        reverseProtoWriter.writeBytes(instrumentLinkingOptions.unknownFields());
        InstrumentLinkingOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, instrumentLinkingOptions.instrument_linking_option);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstrumentLinkingOptions instrumentLinkingOptions = (InstrumentLinkingOptions) obj;
        instrumentLinkingOptions.getClass();
        return InstrumentLinkingOption.ADAPTER.asRepeated().encodedSizeWithTag(1, instrumentLinkingOptions.instrument_linking_option) + instrumentLinkingOptions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstrumentLinkingOptions instrumentLinkingOptions = (InstrumentLinkingOptions) obj;
        instrumentLinkingOptions.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(instrumentLinkingOptions.instrument_linking_option, InstrumentLinkingOption.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InstrumentLinkingOptions(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentLinkingOptions instrumentLinkingOptions = (InstrumentLinkingOptions) obj;
        instrumentLinkingOptions.getClass();
        InstrumentLinkingOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, instrumentLinkingOptions.instrument_linking_option);
        protoWriter.writeBytes(instrumentLinkingOptions.unknownFields());
    }
}
