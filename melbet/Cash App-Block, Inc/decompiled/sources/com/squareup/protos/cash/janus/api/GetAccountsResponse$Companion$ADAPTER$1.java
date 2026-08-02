package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAccountsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAccountsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(FullAccount.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAccountsResponse getAccountsResponse = (GetAccountsResponse) obj;
        reverseProtoWriter.getClass();
        getAccountsResponse.getClass();
        reverseProtoWriter.writeBytes(getAccountsResponse.unknownFields());
        FullAccount.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAccountsResponse.accounts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAccountsResponse getAccountsResponse = (GetAccountsResponse) obj;
        getAccountsResponse.getClass();
        return FullAccount.ADAPTER.asRepeated().encodedSizeWithTag(1, getAccountsResponse.accounts) + getAccountsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAccountsResponse getAccountsResponse = (GetAccountsResponse) obj;
        getAccountsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAccountsResponse.accounts, FullAccount.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAccountsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAccountsResponse getAccountsResponse = (GetAccountsResponse) obj;
        getAccountsResponse.getClass();
        FullAccount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAccountsResponse.accounts);
        protoWriter.writeBytes(getAccountsResponse.unknownFields());
    }
}
