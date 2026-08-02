package com.squareup.protos.cash.kgoose.api.v3.cash;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.Message;
import com.squareup.protos.cash.kgoose.api.v3.Session;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSessionAndMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSessionAndMessagesResponse((Session) obj, m, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Session.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(Message.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSessionAndMessagesResponse getSessionAndMessagesResponse = (GetSessionAndMessagesResponse) obj;
        reverseProtoWriter.getClass();
        getSessionAndMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(getSessionAndMessagesResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getSessionAndMessagesResponse.customer_token);
        Message.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getSessionAndMessagesResponse.messages);
        Session.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getSessionAndMessagesResponse.session);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSessionAndMessagesResponse getSessionAndMessagesResponse = (GetSessionAndMessagesResponse) obj;
        getSessionAndMessagesResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, getSessionAndMessagesResponse.customer_token) + Message.ADAPTER.asRepeated().encodedSizeWithTag(2, getSessionAndMessagesResponse.messages) + Session.ADAPTER.encodedSizeWithTag(1, getSessionAndMessagesResponse.session) + getSessionAndMessagesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSessionAndMessagesResponse getSessionAndMessagesResponse = (GetSessionAndMessagesResponse) obj;
        getSessionAndMessagesResponse.getClass();
        Session session = getSessionAndMessagesResponse.session;
        Session session2 = session != null ? (Session) Session.ADAPTER.redact(session) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getSessionAndMessagesResponse.messages, Message.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getSessionAndMessagesResponse.customer_token;
        byteString.getClass();
        return new GetSessionAndMessagesResponse(session2, m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSessionAndMessagesResponse getSessionAndMessagesResponse = (GetSessionAndMessagesResponse) obj;
        getSessionAndMessagesResponse.getClass();
        Session.ADAPTER.encodeWithTag(protoWriter, 1, getSessionAndMessagesResponse.session);
        Message.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getSessionAndMessagesResponse.messages);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getSessionAndMessagesResponse.customer_token);
        protoWriter.writeBytes(getSessionAndMessagesResponse.unknownFields());
    }
}
