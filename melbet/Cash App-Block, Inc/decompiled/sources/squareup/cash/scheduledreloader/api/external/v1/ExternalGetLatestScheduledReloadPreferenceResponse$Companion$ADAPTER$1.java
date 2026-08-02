package squareup.cash.scheduledreloader.api.external.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ExternalGetLatestScheduledReloadPreferenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExternalGetLatestScheduledReloadPreferenceResponse((ScheduledReloadPreference) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScheduledReloadPreference.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExternalGetLatestScheduledReloadPreferenceResponse externalGetLatestScheduledReloadPreferenceResponse = (ExternalGetLatestScheduledReloadPreferenceResponse) obj;
        reverseProtoWriter.getClass();
        externalGetLatestScheduledReloadPreferenceResponse.getClass();
        reverseProtoWriter.writeBytes(externalGetLatestScheduledReloadPreferenceResponse.unknownFields());
        ScheduledReloadPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, externalGetLatestScheduledReloadPreferenceResponse.scheduled_reload_preference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExternalGetLatestScheduledReloadPreferenceResponse externalGetLatestScheduledReloadPreferenceResponse = (ExternalGetLatestScheduledReloadPreferenceResponse) obj;
        externalGetLatestScheduledReloadPreferenceResponse.getClass();
        return ScheduledReloadPreference.ADAPTER.encodedSizeWithTag(1, externalGetLatestScheduledReloadPreferenceResponse.scheduled_reload_preference) + externalGetLatestScheduledReloadPreferenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExternalGetLatestScheduledReloadPreferenceResponse externalGetLatestScheduledReloadPreferenceResponse = (ExternalGetLatestScheduledReloadPreferenceResponse) obj;
        externalGetLatestScheduledReloadPreferenceResponse.getClass();
        ScheduledReloadPreference scheduledReloadPreference = externalGetLatestScheduledReloadPreferenceResponse.scheduled_reload_preference;
        ScheduledReloadPreference scheduledReloadPreference2 = scheduledReloadPreference != null ? (ScheduledReloadPreference) ScheduledReloadPreference.ADAPTER.redact(scheduledReloadPreference) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ExternalGetLatestScheduledReloadPreferenceResponse(scheduledReloadPreference2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExternalGetLatestScheduledReloadPreferenceResponse externalGetLatestScheduledReloadPreferenceResponse = (ExternalGetLatestScheduledReloadPreferenceResponse) obj;
        externalGetLatestScheduledReloadPreferenceResponse.getClass();
        ScheduledReloadPreference.ADAPTER.encodeWithTag(protoWriter, 1, externalGetLatestScheduledReloadPreferenceResponse.scheduled_reload_preference);
        protoWriter.writeBytes(externalGetLatestScheduledReloadPreferenceResponse.unknownFields());
    }
}
