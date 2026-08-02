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
public final class RecipientSelectorSearchResponse$LocalFavoriteResults$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorSearchResponse.LocalFavoriteResults(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RecipientSelectorSearchResponse.LocalFavoriteResults localFavoriteResults = (RecipientSelectorSearchResponse.LocalFavoriteResults) obj;
        reverseProtoWriter.getClass();
        localFavoriteResults.getClass();
        reverseProtoWriter.writeBytes(localFavoriteResults.unknownFields());
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localFavoriteResults.results);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorSearchResponse.LocalFavoriteResults localFavoriteResults = (RecipientSelectorSearchResponse.LocalFavoriteResults) obj;
        localFavoriteResults.getClass();
        return RecipientSelectorCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, localFavoriteResults.results) + localFavoriteResults.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorSearchResponse.LocalFavoriteResults localFavoriteResults = (RecipientSelectorSearchResponse.LocalFavoriteResults) obj;
        localFavoriteResults.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localFavoriteResults.results, RecipientSelectorCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecipientSelectorSearchResponse.LocalFavoriteResults(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorSearchResponse.LocalFavoriteResults localFavoriteResults = (RecipientSelectorSearchResponse.LocalFavoriteResults) obj;
        localFavoriteResults.getClass();
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localFavoriteResults.results);
        protoWriter.writeBytes(localFavoriteResults.unknownFields());
    }
}
