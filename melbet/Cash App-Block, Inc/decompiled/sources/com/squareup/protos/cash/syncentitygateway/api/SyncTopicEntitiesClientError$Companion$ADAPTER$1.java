package com.squareup.protos.cash.syncentitygateway.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncTopicEntitiesClientError$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncTopicEntitiesClientError((SyncTopicEntitiesClientRequest) obj, (Integer) obj2, (String) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SyncTopicEntitiesClientRequest.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncTopicEntitiesClientError syncTopicEntitiesClientError = (SyncTopicEntitiesClientError) obj;
        reverseProtoWriter.getClass();
        syncTopicEntitiesClientError.getClass();
        reverseProtoWriter.writeBytes(syncTopicEntitiesClientError.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, syncTopicEntitiesClientError.retry_after_secs);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, syncTopicEntitiesClientError.error_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, syncTopicEntitiesClientError.error_code);
        SyncTopicEntitiesClientRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncTopicEntitiesClientError.request);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncTopicEntitiesClientError syncTopicEntitiesClientError = (SyncTopicEntitiesClientError) obj;
        syncTopicEntitiesClientError.getClass();
        int encodedSizeWithTag = SyncTopicEntitiesClientRequest.ADAPTER.encodedSizeWithTag(1, syncTopicEntitiesClientError.request) + syncTopicEntitiesClientError.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(4, syncTopicEntitiesClientError.retry_after_secs) + ProtoAdapter.STRING.encodedSizeWithTag(3, syncTopicEntitiesClientError.error_message) + protoAdapter.encodedSizeWithTag(2, syncTopicEntitiesClientError.error_code) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncTopicEntitiesClientError syncTopicEntitiesClientError = (SyncTopicEntitiesClientError) obj;
        syncTopicEntitiesClientError.getClass();
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = syncTopicEntitiesClientError.request;
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest2 = syncTopicEntitiesClientRequest != null ? (SyncTopicEntitiesClientRequest) SyncTopicEntitiesClientRequest.ADAPTER.redact(syncTopicEntitiesClientRequest) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = syncTopicEntitiesClientError.error_code;
        String str = syncTopicEntitiesClientError.error_message;
        Integer num2 = syncTopicEntitiesClientError.retry_after_secs;
        byteString.getClass();
        return new SyncTopicEntitiesClientError(syncTopicEntitiesClientRequest2, num, str, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncTopicEntitiesClientError syncTopicEntitiesClientError = (SyncTopicEntitiesClientError) obj;
        syncTopicEntitiesClientError.getClass();
        SyncTopicEntitiesClientRequest.ADAPTER.encodeWithTag(protoWriter, 1, syncTopicEntitiesClientError.request);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, syncTopicEntitiesClientError.error_code);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, syncTopicEntitiesClientError.error_message);
        protoAdapter.encodeWithTag(protoWriter, 4, syncTopicEntitiesClientError.retry_after_secs);
        protoWriter.writeBytes(syncTopicEntitiesClientError.unknownFields());
    }
}
