package squareup.cash.scheduledreloader.api.external.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ExternalSkipNextReloadResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExternalSkipNextReloadResponse((Boolean) obj, (Instant) obj2, (SyncEntity) obj3, (ResponseContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(SyncEntity.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExternalSkipNextReloadResponse externalSkipNextReloadResponse = (ExternalSkipNextReloadResponse) obj;
        reverseProtoWriter.getClass();
        externalSkipNextReloadResponse.getClass();
        reverseProtoWriter.writeBytes(externalSkipNextReloadResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, externalSkipNextReloadResponse.response_context);
        SyncEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 3, externalSkipNextReloadResponse.sync_entity);
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 2, externalSkipNextReloadResponse.next_reload_at);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, externalSkipNextReloadResponse.skipped);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExternalSkipNextReloadResponse externalSkipNextReloadResponse = (ExternalSkipNextReloadResponse) obj;
        externalSkipNextReloadResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, externalSkipNextReloadResponse.response_context) + SyncEntity.ADAPTER.encodedSizeWithTag(3, externalSkipNextReloadResponse.sync_entity) + ProtoAdapter.INSTANT.encodedSizeWithTag(2, externalSkipNextReloadResponse.next_reload_at) + ProtoAdapter.BOOL.encodedSizeWithTag(1, externalSkipNextReloadResponse.skipped) + externalSkipNextReloadResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExternalSkipNextReloadResponse externalSkipNextReloadResponse = (ExternalSkipNextReloadResponse) obj;
        externalSkipNextReloadResponse.getClass();
        Instant instant = externalSkipNextReloadResponse.next_reload_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        SyncEntity syncEntity = externalSkipNextReloadResponse.sync_entity;
        SyncEntity syncEntity2 = syncEntity != null ? (SyncEntity) SyncEntity.ADAPTER.redact(syncEntity) : null;
        ResponseContext responseContext = externalSkipNextReloadResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = externalSkipNextReloadResponse.skipped;
        byteString.getClass();
        return new ExternalSkipNextReloadResponse(bool, instant2, syncEntity2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExternalSkipNextReloadResponse externalSkipNextReloadResponse = (ExternalSkipNextReloadResponse) obj;
        externalSkipNextReloadResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, externalSkipNextReloadResponse.skipped);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 2, externalSkipNextReloadResponse.next_reload_at);
        SyncEntity.ADAPTER.encodeWithTag(protoWriter, 3, externalSkipNextReloadResponse.sync_entity);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, externalSkipNextReloadResponse.response_context);
        protoWriter.writeBytes(externalSkipNextReloadResponse.unknownFields());
    }
}
