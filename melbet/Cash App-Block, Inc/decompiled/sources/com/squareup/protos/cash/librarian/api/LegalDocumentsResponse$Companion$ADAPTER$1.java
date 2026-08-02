package com.squareup.protos.cash.librarian.api;

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
public final class LegalDocumentsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LegalDocumentsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LegalDocumentsResponse legalDocumentsResponse = (LegalDocumentsResponse) obj;
        reverseProtoWriter.getClass();
        legalDocumentsResponse.getClass();
        reverseProtoWriter.writeBytes(legalDocumentsResponse.unknownFields());
        Document.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, legalDocumentsResponse.documents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LegalDocumentsResponse legalDocumentsResponse = (LegalDocumentsResponse) obj;
        legalDocumentsResponse.getClass();
        return Document.ADAPTER.asRepeated().encodedSizeWithTag(1, legalDocumentsResponse.documents) + legalDocumentsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LegalDocumentsResponse legalDocumentsResponse = (LegalDocumentsResponse) obj;
        legalDocumentsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(legalDocumentsResponse.documents, Document.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LegalDocumentsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LegalDocumentsResponse legalDocumentsResponse = (LegalDocumentsResponse) obj;
        legalDocumentsResponse.getClass();
        Document.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, legalDocumentsResponse.documents);
        protoWriter.writeBytes(legalDocumentsResponse.unknownFields());
    }
}
