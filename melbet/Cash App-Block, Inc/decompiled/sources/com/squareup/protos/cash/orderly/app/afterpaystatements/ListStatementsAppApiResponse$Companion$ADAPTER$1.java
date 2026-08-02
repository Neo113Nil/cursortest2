package com.squareup.protos.cash.orderly.app.afterpaystatements;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListStatementsAppApiResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListStatementsAppApiResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Document.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListStatementsAppApiResponse listStatementsAppApiResponse = (ListStatementsAppApiResponse) obj;
        reverseProtoWriter.getClass();
        listStatementsAppApiResponse.getClass();
        reverseProtoWriter.writeBytes(listStatementsAppApiResponse.unknownFields());
        Document.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listStatementsAppApiResponse.statements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListStatementsAppApiResponse listStatementsAppApiResponse = (ListStatementsAppApiResponse) obj;
        listStatementsAppApiResponse.getClass();
        return Document.ADAPTER.asRepeated().encodedSizeWithTag(1, listStatementsAppApiResponse.statements) + listStatementsAppApiResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListStatementsAppApiResponse listStatementsAppApiResponse = (ListStatementsAppApiResponse) obj;
        listStatementsAppApiResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listStatementsAppApiResponse.statements, Document.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ListStatementsAppApiResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListStatementsAppApiResponse listStatementsAppApiResponse = (ListStatementsAppApiResponse) obj;
        listStatementsAppApiResponse.getClass();
        Document.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listStatementsAppApiResponse.statements);
        protoWriter.writeBytes(listStatementsAppApiResponse.unknownFields());
    }
}
