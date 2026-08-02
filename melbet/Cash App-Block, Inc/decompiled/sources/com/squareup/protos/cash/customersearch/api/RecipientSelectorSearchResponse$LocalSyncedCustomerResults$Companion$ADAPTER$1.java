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
public final class RecipientSelectorSearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorSearchResponse.LocalSyncedCustomerResults(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RecipientSelectorSearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (RecipientSelectorSearchResponse.LocalSyncedCustomerResults) obj;
        reverseProtoWriter.getClass();
        localSyncedCustomerResults.getClass();
        reverseProtoWriter.writeBytes(localSyncedCustomerResults.unknownFields());
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localSyncedCustomerResults.results);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorSearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (RecipientSelectorSearchResponse.LocalSyncedCustomerResults) obj;
        localSyncedCustomerResults.getClass();
        return RecipientSelectorCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, localSyncedCustomerResults.results) + localSyncedCustomerResults.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorSearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (RecipientSelectorSearchResponse.LocalSyncedCustomerResults) obj;
        localSyncedCustomerResults.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localSyncedCustomerResults.results, RecipientSelectorCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecipientSelectorSearchResponse.LocalSyncedCustomerResults(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorSearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (RecipientSelectorSearchResponse.LocalSyncedCustomerResults) obj;
        localSyncedCustomerResults.getClass();
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localSyncedCustomerResults.results);
        protoWriter.writeBytes(localSyncedCustomerResults.unknownFields());
    }
}
