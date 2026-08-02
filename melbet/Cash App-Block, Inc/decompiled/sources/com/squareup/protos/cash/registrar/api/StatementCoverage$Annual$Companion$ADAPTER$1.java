package com.squareup.protos.cash.registrar.api;

import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StatementCoverage$Annual$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatementCoverage.Annual((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatementCoverage.Annual annual = (StatementCoverage.Annual) obj;
        reverseProtoWriter.getClass();
        annual.getClass();
        reverseProtoWriter.writeBytes(annual.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, annual.year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatementCoverage.Annual annual = (StatementCoverage.Annual) obj;
        annual.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, annual.year) + annual.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatementCoverage.Annual annual = (StatementCoverage.Annual) obj;
        annual.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = annual.year;
        byteString.getClass();
        return new StatementCoverage.Annual(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatementCoverage.Annual annual = (StatementCoverage.Annual) obj;
        annual.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, annual.year);
        protoWriter.writeBytes(annual.unknownFields());
    }
}
