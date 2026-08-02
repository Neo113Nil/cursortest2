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
public final class GetStatementTypesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetStatementTypesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(StatementTypeDetails.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetStatementTypesResponse getStatementTypesResponse = (GetStatementTypesResponse) obj;
        reverseProtoWriter.getClass();
        getStatementTypesResponse.getClass();
        reverseProtoWriter.writeBytes(getStatementTypesResponse.unknownFields());
        StatementTypeDetails.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getStatementTypesResponse.statement_type_details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetStatementTypesResponse getStatementTypesResponse = (GetStatementTypesResponse) obj;
        getStatementTypesResponse.getClass();
        return StatementTypeDetails.ADAPTER.asRepeated().encodedSizeWithTag(1, getStatementTypesResponse.statement_type_details) + getStatementTypesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetStatementTypesResponse getStatementTypesResponse = (GetStatementTypesResponse) obj;
        getStatementTypesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getStatementTypesResponse.statement_type_details, StatementTypeDetails.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetStatementTypesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetStatementTypesResponse getStatementTypesResponse = (GetStatementTypesResponse) obj;
        getStatementTypesResponse.getClass();
        StatementTypeDetails.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getStatementTypesResponse.statement_type_details);
        protoWriter.writeBytes(getStatementTypesResponse.unknownFields());
    }
}
