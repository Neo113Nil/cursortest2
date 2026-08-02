package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AllowlistSearchResponse$AllowlistSuggestions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AllowlistSearchResponse.AllowlistSuggestions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AllowlistCustomer.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions = (AllowlistSearchResponse.AllowlistSuggestions) obj;
        reverseProtoWriter.getClass();
        allowlistSuggestions.getClass();
        reverseProtoWriter.writeBytes(allowlistSuggestions.unknownFields());
        AllowlistCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, allowlistSuggestions.customers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions = (AllowlistSearchResponse.AllowlistSuggestions) obj;
        allowlistSuggestions.getClass();
        return AllowlistCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, allowlistSuggestions.customers) + allowlistSuggestions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions = (AllowlistSearchResponse.AllowlistSuggestions) obj;
        allowlistSuggestions.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(allowlistSuggestions.customers, AllowlistCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AllowlistSearchResponse.AllowlistSuggestions(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions = (AllowlistSearchResponse.AllowlistSuggestions) obj;
        allowlistSuggestions.getClass();
        AllowlistCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, allowlistSuggestions.customers);
        protoWriter.writeBytes(allowlistSuggestions.unknownFields());
    }
}
