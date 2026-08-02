package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$ServerResults$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorSearchResponse.ServerResults(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RecipientSelectorCustomer.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorSearchResponse.ServerResults serverResults = (RecipientSelectorSearchResponse.ServerResults) obj;
        reverseProtoWriter.getClass();
        serverResults.getClass();
        reverseProtoWriter.writeBytes(serverResults.unknownFields());
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, serverResults.results);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorSearchResponse.ServerResults serverResults = (RecipientSelectorSearchResponse.ServerResults) obj;
        serverResults.getClass();
        return RecipientSelectorCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, serverResults.results) + serverResults.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorSearchResponse.ServerResults serverResults = (RecipientSelectorSearchResponse.ServerResults) obj;
        serverResults.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(serverResults.results, RecipientSelectorCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecipientSelectorSearchResponse.ServerResults(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorSearchResponse.ServerResults serverResults = (RecipientSelectorSearchResponse.ServerResults) obj;
        serverResults.getClass();
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, serverResults.results);
        protoWriter.writeBytes(serverResults.unknownFields());
    }
}
