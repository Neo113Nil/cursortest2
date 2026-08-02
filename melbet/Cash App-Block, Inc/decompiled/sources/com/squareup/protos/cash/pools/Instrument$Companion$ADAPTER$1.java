package com.squareup.protos.cash.pools;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Instrument$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Instrument((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Instrument instrument = (Instrument) obj;
        reverseProtoWriter.getClass();
        instrument.getClass();
        reverseProtoWriter.writeBytes(instrument.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, instrument.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Instrument instrument = (Instrument) obj;
        instrument.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, instrument.token) + instrument.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Instrument instrument = (Instrument) obj;
        instrument.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = instrument.token;
        byteString.getClass();
        return new Instrument(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Instrument instrument = (Instrument) obj;
        instrument.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, instrument.token);
        protoWriter.writeBytes(instrument.unknownFields());
    }
}
