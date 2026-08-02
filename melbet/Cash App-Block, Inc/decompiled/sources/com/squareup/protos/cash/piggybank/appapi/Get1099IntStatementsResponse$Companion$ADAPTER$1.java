package com.squareup.protos.cash.piggybank.appapi;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Get1099IntStatementsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Get1099IntStatementsResponse((ResponseContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Document.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Get1099IntStatementsResponse get1099IntStatementsResponse = (Get1099IntStatementsResponse) obj;
        reverseProtoWriter.getClass();
        get1099IntStatementsResponse.getClass();
        reverseProtoWriter.writeBytes(get1099IntStatementsResponse.unknownFields());
        Document.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, get1099IntStatementsResponse.documents);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, get1099IntStatementsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Get1099IntStatementsResponse get1099IntStatementsResponse = (Get1099IntStatementsResponse) obj;
        get1099IntStatementsResponse.getClass();
        return Document.ADAPTER.asRepeated().encodedSizeWithTag(2, get1099IntStatementsResponse.documents) + ResponseContext.ADAPTER.encodedSizeWithTag(1, get1099IntStatementsResponse.response_context) + get1099IntStatementsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Get1099IntStatementsResponse get1099IntStatementsResponse = (Get1099IntStatementsResponse) obj;
        get1099IntStatementsResponse.getClass();
        ResponseContext responseContext = get1099IntStatementsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(get1099IntStatementsResponse.documents, Document.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Get1099IntStatementsResponse(responseContext2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Get1099IntStatementsResponse get1099IntStatementsResponse = (Get1099IntStatementsResponse) obj;
        get1099IntStatementsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, get1099IntStatementsResponse.response_context);
        Document.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, get1099IntStatementsResponse.documents);
        protoWriter.writeBytes(get1099IntStatementsResponse.unknownFields());
    }
}
