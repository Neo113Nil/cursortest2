package com.squareup.protos.cash.cryptoinvestflow.service;

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
public final class GetCryptoTaxStatementsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCryptoTaxStatementsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetCryptoTaxStatementsResponse getCryptoTaxStatementsResponse = (GetCryptoTaxStatementsResponse) obj;
        reverseProtoWriter.getClass();
        getCryptoTaxStatementsResponse.getClass();
        reverseProtoWriter.writeBytes(getCryptoTaxStatementsResponse.unknownFields());
        Document.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getCryptoTaxStatementsResponse.tax_documents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCryptoTaxStatementsResponse getCryptoTaxStatementsResponse = (GetCryptoTaxStatementsResponse) obj;
        getCryptoTaxStatementsResponse.getClass();
        return Document.ADAPTER.asRepeated().encodedSizeWithTag(1, getCryptoTaxStatementsResponse.tax_documents) + getCryptoTaxStatementsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCryptoTaxStatementsResponse getCryptoTaxStatementsResponse = (GetCryptoTaxStatementsResponse) obj;
        getCryptoTaxStatementsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getCryptoTaxStatementsResponse.tax_documents, Document.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCryptoTaxStatementsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCryptoTaxStatementsResponse getCryptoTaxStatementsResponse = (GetCryptoTaxStatementsResponse) obj;
        getCryptoTaxStatementsResponse.getClass();
        Document.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCryptoTaxStatementsResponse.tax_documents);
        protoWriter.writeBytes(getCryptoTaxStatementsResponse.unknownFields());
    }
}
