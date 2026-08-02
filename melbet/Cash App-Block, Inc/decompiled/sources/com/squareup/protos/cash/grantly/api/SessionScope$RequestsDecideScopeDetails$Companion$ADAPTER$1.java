package com.squareup.protos.cash.grantly.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SessionScope;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SessionScope$RequestsDecideScopeDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SessionScope.RequestsDecideScopeDetails(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    SessionScope.RequestsDecideScopeDetails.ActionType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SessionScope.RequestsDecideScopeDetails requestsDecideScopeDetails = (SessionScope.RequestsDecideScopeDetails) obj;
        reverseProtoWriter.getClass();
        requestsDecideScopeDetails.getClass();
        reverseProtoWriter.writeBytes(requestsDecideScopeDetails.unknownFields());
        SessionScope.RequestsDecideScopeDetails.ActionType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, requestsDecideScopeDetails.action_types);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SessionScope.RequestsDecideScopeDetails requestsDecideScopeDetails = (SessionScope.RequestsDecideScopeDetails) obj;
        requestsDecideScopeDetails.getClass();
        return SessionScope.RequestsDecideScopeDetails.ActionType.ADAPTER.asRepeated().encodedSizeWithTag(1, requestsDecideScopeDetails.action_types) + requestsDecideScopeDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SessionScope.RequestsDecideScopeDetails requestsDecideScopeDetails = (SessionScope.RequestsDecideScopeDetails) obj;
        requestsDecideScopeDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = requestsDecideScopeDetails.action_types;
        list.getClass();
        byteString.getClass();
        return new SessionScope.RequestsDecideScopeDetails(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SessionScope.RequestsDecideScopeDetails requestsDecideScopeDetails = (SessionScope.RequestsDecideScopeDetails) obj;
        requestsDecideScopeDetails.getClass();
        SessionScope.RequestsDecideScopeDetails.ActionType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, requestsDecideScopeDetails.action_types);
        protoWriter.writeBytes(requestsDecideScopeDetails.unknownFields());
    }
}
