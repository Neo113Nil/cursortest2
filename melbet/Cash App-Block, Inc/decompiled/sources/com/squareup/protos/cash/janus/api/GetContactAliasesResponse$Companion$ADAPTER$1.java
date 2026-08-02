package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetContactAliasesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetContactAliasesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ContactAlias.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetContactAliasesResponse getContactAliasesResponse = (GetContactAliasesResponse) obj;
        reverseProtoWriter.getClass();
        getContactAliasesResponse.getClass();
        reverseProtoWriter.writeBytes(getContactAliasesResponse.unknownFields());
        ContactAlias.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getContactAliasesResponse.aliases);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetContactAliasesResponse getContactAliasesResponse = (GetContactAliasesResponse) obj;
        getContactAliasesResponse.getClass();
        return ContactAlias.ADAPTER.asRepeated().encodedSizeWithTag(1, getContactAliasesResponse.aliases) + getContactAliasesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetContactAliasesResponse getContactAliasesResponse = (GetContactAliasesResponse) obj;
        getContactAliasesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getContactAliasesResponse.aliases, ContactAlias.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetContactAliasesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetContactAliasesResponse getContactAliasesResponse = (GetContactAliasesResponse) obj;
        getContactAliasesResponse.getClass();
        ContactAlias.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getContactAliasesResponse.aliases);
        protoWriter.writeBytes(getContactAliasesResponse.unknownFields());
    }
}
