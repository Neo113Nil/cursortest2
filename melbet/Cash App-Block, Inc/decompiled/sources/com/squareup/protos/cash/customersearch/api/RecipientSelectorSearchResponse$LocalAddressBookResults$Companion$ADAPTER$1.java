package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$LocalAddressBookResults$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorSearchResponse.LocalAddressBookResults(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorSearchResponse.LocalAddressBookResults localAddressBookResults = (RecipientSelectorSearchResponse.LocalAddressBookResults) obj;
        reverseProtoWriter.getClass();
        localAddressBookResults.getClass();
        reverseProtoWriter.writeBytes(localAddressBookResults.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorSearchResponse.LocalAddressBookResults localAddressBookResults = (RecipientSelectorSearchResponse.LocalAddressBookResults) obj;
        localAddressBookResults.getClass();
        return localAddressBookResults.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((RecipientSelectorSearchResponse.LocalAddressBookResults) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecipientSelectorSearchResponse.LocalAddressBookResults(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorSearchResponse.LocalAddressBookResults localAddressBookResults = (RecipientSelectorSearchResponse.LocalAddressBookResults) obj;
        localAddressBookResults.getClass();
        protoWriter.writeBytes(localAddressBookResults.unknownFields());
    }
}
