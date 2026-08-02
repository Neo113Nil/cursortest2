package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PendingRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PendingRequest((String) obj, (String) obj2, (String) obj3, (ViewRequestLink) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(ViewRequestLink.ADAPTER, protoReader, obj4);
            } else if (nextTag == 5) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PendingRequest pendingRequest = (PendingRequest) obj;
        reverseProtoWriter.getClass();
        pendingRequest.getClass();
        reverseProtoWriter.writeBytes(pendingRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, pendingRequest.activity_row_id);
        ViewRequestLink.ADAPTER.encodeWithTag(reverseProtoWriter, 4, pendingRequest.request_action_link);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pendingRequest.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, pendingRequest.requester_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, pendingRequest.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PendingRequest pendingRequest = (PendingRequest) obj;
        pendingRequest.getClass();
        int size$okio = pendingRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, pendingRequest.activity_row_id) + ViewRequestLink.ADAPTER.encodedSizeWithTag(4, pendingRequest.request_action_link) + protoAdapter.encodedSizeWithTag(3, pendingRequest.subtitle) + protoAdapter.encodedSizeWithTag(1, pendingRequest.requester_customer_token) + protoAdapter.encodedSizeWithTag(5, pendingRequest.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PendingRequest pendingRequest = (PendingRequest) obj;
        pendingRequest.getClass();
        ViewRequestLink viewRequestLink = pendingRequest.request_action_link;
        ViewRequestLink viewRequestLink2 = viewRequestLink != null ? (ViewRequestLink) ViewRequestLink.ADAPTER.redact(viewRequestLink) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = pendingRequest.requester_customer_token;
        String str2 = pendingRequest.activity_row_id;
        byteString.getClass();
        return new PendingRequest(null, str, null, viewRequestLink2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PendingRequest pendingRequest = (PendingRequest) obj;
        pendingRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 5, pendingRequest.title);
        protoAdapter.encodeWithTag(protoWriter, 1, pendingRequest.requester_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 3, pendingRequest.subtitle);
        ViewRequestLink.ADAPTER.encodeWithTag(protoWriter, 4, pendingRequest.request_action_link);
        protoAdapter.encodeWithTag(protoWriter, 6, pendingRequest.activity_row_id);
        protoWriter.writeBytes(pendingRequest.unknownFields());
    }
}
