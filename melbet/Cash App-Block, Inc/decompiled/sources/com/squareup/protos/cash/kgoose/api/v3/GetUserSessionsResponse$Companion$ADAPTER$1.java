package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetUserSessionsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetUserSessionsResponse((Long) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Session.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetUserSessionsResponse getUserSessionsResponse = (GetUserSessionsResponse) obj;
        reverseProtoWriter.getClass();
        getUserSessionsResponse.getClass();
        reverseProtoWriter.writeBytes(getUserSessionsResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, getUserSessionsResponse.next_cursor);
        Session.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getUserSessionsResponse.sessions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetUserSessionsResponse getUserSessionsResponse = (GetUserSessionsResponse) obj;
        getUserSessionsResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, getUserSessionsResponse.next_cursor) + Session.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserSessionsResponse.sessions) + getUserSessionsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetUserSessionsResponse getUserSessionsResponse = (GetUserSessionsResponse) obj;
        getUserSessionsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getUserSessionsResponse.sessions, Session.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = getUserSessionsResponse.next_cursor;
        byteString.getClass();
        return new GetUserSessionsResponse(l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetUserSessionsResponse getUserSessionsResponse = (GetUserSessionsResponse) obj;
        getUserSessionsResponse.getClass();
        Session.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUserSessionsResponse.sessions);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getUserSessionsResponse.next_cursor);
        protoWriter.writeBytes(getUserSessionsResponse.unknownFields());
    }
}
