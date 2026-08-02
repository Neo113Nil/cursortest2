package com.squareup.protos.cash.registrar.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAvailableStatementsForStatementTypeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAvailableStatementsForStatementTypeResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(StatementDescriptor.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAvailableStatementsForStatementTypeResponse getAvailableStatementsForStatementTypeResponse = (GetAvailableStatementsForStatementTypeResponse) obj;
        reverseProtoWriter.getClass();
        getAvailableStatementsForStatementTypeResponse.getClass();
        reverseProtoWriter.writeBytes(getAvailableStatementsForStatementTypeResponse.unknownFields());
        StatementDescriptor.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAvailableStatementsForStatementTypeResponse.statements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAvailableStatementsForStatementTypeResponse getAvailableStatementsForStatementTypeResponse = (GetAvailableStatementsForStatementTypeResponse) obj;
        getAvailableStatementsForStatementTypeResponse.getClass();
        return StatementDescriptor.ADAPTER.asRepeated().encodedSizeWithTag(1, getAvailableStatementsForStatementTypeResponse.statements) + getAvailableStatementsForStatementTypeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAvailableStatementsForStatementTypeResponse getAvailableStatementsForStatementTypeResponse = (GetAvailableStatementsForStatementTypeResponse) obj;
        getAvailableStatementsForStatementTypeResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAvailableStatementsForStatementTypeResponse.statements, StatementDescriptor.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAvailableStatementsForStatementTypeResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAvailableStatementsForStatementTypeResponse getAvailableStatementsForStatementTypeResponse = (GetAvailableStatementsForStatementTypeResponse) obj;
        getAvailableStatementsForStatementTypeResponse.getClass();
        StatementDescriptor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAvailableStatementsForStatementTypeResponse.statements);
        protoWriter.writeBytes(getAvailableStatementsForStatementTypeResponse.unknownFields());
    }
}
