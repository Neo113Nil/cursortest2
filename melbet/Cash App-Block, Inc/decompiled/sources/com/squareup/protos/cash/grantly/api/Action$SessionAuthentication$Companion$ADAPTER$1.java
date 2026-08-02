package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$SessionAuthentication$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.SessionAuthentication((String) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SessionScope.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.SessionAuthentication sessionAuthentication = (Action.SessionAuthentication) obj;
        reverseProtoWriter.getClass();
        sessionAuthentication.getClass();
        reverseProtoWriter.writeBytes(sessionAuthentication.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, sessionAuthentication.associated_client_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, sessionAuthentication.associated_redirect_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, sessionAuthentication.associated_request_id);
        SessionScope.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, sessionAuthentication.scopes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.SessionAuthentication sessionAuthentication = (Action.SessionAuthentication) obj;
        sessionAuthentication.getClass();
        int encodedSizeWithTag = SessionScope.ADAPTER.asRepeated().encodedSizeWithTag(1, sessionAuthentication.scopes) + sessionAuthentication.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, sessionAuthentication.associated_client_id) + protoAdapter.encodedSizeWithTag(3, sessionAuthentication.associated_redirect_url) + protoAdapter.encodedSizeWithTag(2, sessionAuthentication.associated_request_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.SessionAuthentication sessionAuthentication = (Action.SessionAuthentication) obj;
        sessionAuthentication.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(sessionAuthentication.scopes, SessionScope.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = sessionAuthentication.associated_request_id;
        String str2 = sessionAuthentication.associated_redirect_url;
        String str3 = sessionAuthentication.associated_client_id;
        byteString.getClass();
        return new Action.SessionAuthentication(str, str2, str3, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.SessionAuthentication sessionAuthentication = (Action.SessionAuthentication) obj;
        sessionAuthentication.getClass();
        SessionScope.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sessionAuthentication.scopes);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, sessionAuthentication.associated_request_id);
        protoAdapter.encodeWithTag(protoWriter, 3, sessionAuthentication.associated_redirect_url);
        protoAdapter.encodeWithTag(protoWriter, 4, sessionAuthentication.associated_client_id);
        protoWriter.writeBytes(sessionAuthentication.unknownFields());
    }
}
