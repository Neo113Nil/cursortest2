package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.SessionScope;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SessionScope$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                try {
                    obj = SessionScope.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                sessionScope$Details$RequestsDecideScopeDetails = new SessionScope$Details$RequestsDecideScopeDetails((SessionScope.RequestsDecideScopeDetails) SessionScope.RequestsDecideScopeDetails.ADAPTER.decode(protoReader));
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        SessionScope.Type type2 = (SessionScope.Type) obj;
        if (type2 != null) {
            return new SessionScope(type2, sessionScope$Details$RequestsDecideScopeDetails, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "type");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SessionScope sessionScope = (SessionScope) obj;
        reverseProtoWriter.getClass();
        sessionScope.getClass();
        reverseProtoWriter.writeBytes(sessionScope.unknownFields());
        SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails = sessionScope.details;
        if (sessionScope$Details$RequestsDecideScopeDetails != null) {
            SessionScope.RequestsDecideScopeDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sessionScope$Details$RequestsDecideScopeDetails.value);
        } else if (sessionScope$Details$RequestsDecideScopeDetails != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        SessionScope.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sessionScope.f1274type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SessionScope sessionScope = (SessionScope) obj;
        sessionScope.getClass();
        int encodedSizeWithTag = SessionScope.Type.ADAPTER.encodedSizeWithTag(1, sessionScope.f1274type) + sessionScope.unknownFields().getSize$okio();
        SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails = sessionScope.details;
        if (sessionScope$Details$RequestsDecideScopeDetails != null) {
            return SessionScope.RequestsDecideScopeDetails.ADAPTER.encodedSizeWithTag(2, sessionScope$Details$RequestsDecideScopeDetails.value) + encodedSizeWithTag;
        }
        if (sessionScope$Details$RequestsDecideScopeDetails == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SessionScope sessionScope = (SessionScope) obj;
        sessionScope.getClass();
        ByteString byteString = ByteString.EMPTY;
        SessionScope.Type type2 = sessionScope.f1274type;
        SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails = sessionScope.details;
        type2.getClass();
        byteString.getClass();
        return new SessionScope(type2, sessionScope$Details$RequestsDecideScopeDetails, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SessionScope sessionScope = (SessionScope) obj;
        sessionScope.getClass();
        SessionScope.Type.ADAPTER.encodeWithTag(protoWriter, 1, sessionScope.f1274type);
        SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails = sessionScope.details;
        if (sessionScope$Details$RequestsDecideScopeDetails != null) {
            SessionScope.RequestsDecideScopeDetails.ADAPTER.encodeWithTag(protoWriter, 2, sessionScope$Details$RequestsDecideScopeDetails.value);
        } else if (sessionScope$Details$RequestsDecideScopeDetails != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(sessionScope.unknownFields());
    }
}
