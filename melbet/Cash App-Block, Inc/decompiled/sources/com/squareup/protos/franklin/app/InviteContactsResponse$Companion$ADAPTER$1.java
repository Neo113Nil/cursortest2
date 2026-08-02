package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InviteContactsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InviteContactsResponse((ResponseContext) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InviteContactsResponse inviteContactsResponse = (InviteContactsResponse) obj;
        reverseProtoWriter.getClass();
        inviteContactsResponse.getClass();
        reverseProtoWriter.writeBytes(inviteContactsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, inviteContactsResponse.invitation_tokens);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, inviteContactsResponse.unsent_email_addresses);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, inviteContactsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InviteContactsResponse inviteContactsResponse = (InviteContactsResponse) obj;
        inviteContactsResponse.getClass();
        int encodedSizeWithTag = ResponseContext.ADAPTER.encodedSizeWithTag(3, inviteContactsResponse.response_context) + inviteContactsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(4, inviteContactsResponse.invitation_tokens) + protoAdapter.asRepeated().encodedSizeWithTag(2, inviteContactsResponse.unsent_email_addresses) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InviteContactsResponse inviteContactsResponse = (InviteContactsResponse) obj;
        inviteContactsResponse.getClass();
        ResponseContext responseContext = inviteContactsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        EmptyList emptyList = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        List list = inviteContactsResponse.invitation_tokens;
        emptyList.getClass();
        list.getClass();
        byteString.getClass();
        return new InviteContactsResponse(responseContext2, emptyList, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InviteContactsResponse inviteContactsResponse = (InviteContactsResponse) obj;
        inviteContactsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, inviteContactsResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, inviteContactsResponse.unsent_email_addresses);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, inviteContactsResponse.invitation_tokens);
        protoWriter.writeBytes(inviteContactsResponse.unknownFields());
    }
}
