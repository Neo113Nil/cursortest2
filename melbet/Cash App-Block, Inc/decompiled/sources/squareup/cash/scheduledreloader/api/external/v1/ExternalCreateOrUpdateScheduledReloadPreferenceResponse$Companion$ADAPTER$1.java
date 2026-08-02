package squareup.cash.scheduledreloader.api.external.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ExternalCreateOrUpdateScheduledReloadPreferenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExternalCreateOrUpdateScheduledReloadPreferenceResponse((ScheduledReloadPreference) obj, (Instant) obj2, (SyncEntity) obj3, (ResponseContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScheduledReloadPreference.ADAPTER, protoReader, obj);
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
        ExternalCreateOrUpdateScheduledReloadPreferenceResponse externalCreateOrUpdateScheduledReloadPreferenceResponse = (ExternalCreateOrUpdateScheduledReloadPreferenceResponse) obj;
        reverseProtoWriter.getClass();
        externalCreateOrUpdateScheduledReloadPreferenceResponse.getClass();
        reverseProtoWriter.writeBytes(externalCreateOrUpdateScheduledReloadPreferenceResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, externalCreateOrUpdateScheduledReloadPreferenceResponse.response_context);
        SyncEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 3, externalCreateOrUpdateScheduledReloadPreferenceResponse.sync_entity);
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 2, externalCreateOrUpdateScheduledReloadPreferenceResponse.next_reload_at);
        ScheduledReloadPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, externalCreateOrUpdateScheduledReloadPreferenceResponse.scheduled_reload_preference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExternalCreateOrUpdateScheduledReloadPreferenceResponse externalCreateOrUpdateScheduledReloadPreferenceResponse = (ExternalCreateOrUpdateScheduledReloadPreferenceResponse) obj;
        externalCreateOrUpdateScheduledReloadPreferenceResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, externalCreateOrUpdateScheduledReloadPreferenceResponse.response_context) + SyncEntity.ADAPTER.encodedSizeWithTag(3, externalCreateOrUpdateScheduledReloadPreferenceResponse.sync_entity) + ProtoAdapter.INSTANT.encodedSizeWithTag(2, externalCreateOrUpdateScheduledReloadPreferenceResponse.next_reload_at) + ScheduledReloadPreference.ADAPTER.encodedSizeWithTag(1, externalCreateOrUpdateScheduledReloadPreferenceResponse.scheduled_reload_preference) + externalCreateOrUpdateScheduledReloadPreferenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExternalCreateOrUpdateScheduledReloadPreferenceResponse externalCreateOrUpdateScheduledReloadPreferenceResponse = (ExternalCreateOrUpdateScheduledReloadPreferenceResponse) obj;
        externalCreateOrUpdateScheduledReloadPreferenceResponse.getClass();
        ScheduledReloadPreference scheduledReloadPreference = externalCreateOrUpdateScheduledReloadPreferenceResponse.scheduled_reload_preference;
        ScheduledReloadPreference scheduledReloadPreference2 = scheduledReloadPreference != null ? (ScheduledReloadPreference) ScheduledReloadPreference.ADAPTER.redact(scheduledReloadPreference) : null;
        Instant instant = externalCreateOrUpdateScheduledReloadPreferenceResponse.next_reload_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        SyncEntity syncEntity = externalCreateOrUpdateScheduledReloadPreferenceResponse.sync_entity;
        SyncEntity syncEntity2 = syncEntity != null ? (SyncEntity) SyncEntity.ADAPTER.redact(syncEntity) : null;
        ResponseContext responseContext = externalCreateOrUpdateScheduledReloadPreferenceResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ExternalCreateOrUpdateScheduledReloadPreferenceResponse(scheduledReloadPreference2, instant2, syncEntity2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExternalCreateOrUpdateScheduledReloadPreferenceResponse externalCreateOrUpdateScheduledReloadPreferenceResponse = (ExternalCreateOrUpdateScheduledReloadPreferenceResponse) obj;
        externalCreateOrUpdateScheduledReloadPreferenceResponse.getClass();
        ScheduledReloadPreference.ADAPTER.encodeWithTag(protoWriter, 1, externalCreateOrUpdateScheduledReloadPreferenceResponse.scheduled_reload_preference);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 2, externalCreateOrUpdateScheduledReloadPreferenceResponse.next_reload_at);
        SyncEntity.ADAPTER.encodeWithTag(protoWriter, 3, externalCreateOrUpdateScheduledReloadPreferenceResponse.sync_entity);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, externalCreateOrUpdateScheduledReloadPreferenceResponse.response_context);
        protoWriter.writeBytes(externalCreateOrUpdateScheduledReloadPreferenceResponse.unknownFields());
    }
}
