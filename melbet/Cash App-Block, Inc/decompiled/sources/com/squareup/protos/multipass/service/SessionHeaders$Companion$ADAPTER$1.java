package com.squareup.protos.multipass.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SessionHeaders$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SessionHeaders((Headers) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Headers.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SessionHeaders sessionHeaders = (SessionHeaders) obj;
        reverseProtoWriter.getClass();
        sessionHeaders.getClass();
        reverseProtoWriter.writeBytes(sessionHeaders.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, sessionHeaders.acceptable_scopes);
        Headers.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sessionHeaders.headers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SessionHeaders sessionHeaders = (SessionHeaders) obj;
        sessionHeaders.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, sessionHeaders.acceptable_scopes) + Headers.ADAPTER.encodedSizeWithTag(1, sessionHeaders.headers) + sessionHeaders.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SessionHeaders sessionHeaders = (SessionHeaders) obj;
        sessionHeaders.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = sessionHeaders.acceptable_scopes;
        list.getClass();
        byteString.getClass();
        return new SessionHeaders(null, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SessionHeaders sessionHeaders = (SessionHeaders) obj;
        sessionHeaders.getClass();
        Headers.ADAPTER.encodeWithTag(protoWriter, 1, sessionHeaders.headers);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, sessionHeaders.acceptable_scopes);
        protoWriter.writeBytes(sessionHeaders.unknownFields());
    }
}
