package com.squareup.protos.cash.registrar.api;

import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StatementCoverage$Monthly$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatementCoverage.Monthly((Integer) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatementCoverage.Monthly monthly = (StatementCoverage.Monthly) obj;
        reverseProtoWriter.getClass();
        monthly.getClass();
        reverseProtoWriter.writeBytes(monthly.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, monthly.month);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, monthly.year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatementCoverage.Monthly monthly = (StatementCoverage.Monthly) obj;
        monthly.getClass();
        int size$okio = monthly.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(2, monthly.month) + protoAdapter.encodedSizeWithTag(1, monthly.year) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatementCoverage.Monthly monthly = (StatementCoverage.Monthly) obj;
        monthly.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = monthly.year;
        Integer num2 = monthly.month;
        byteString.getClass();
        return new StatementCoverage.Monthly(num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatementCoverage.Monthly monthly = (StatementCoverage.Monthly) obj;
        monthly.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, monthly.year);
        protoAdapter.encodeWithTag(protoWriter, 2, monthly.month);
        protoWriter.writeBytes(monthly.unknownFields());
    }
}
