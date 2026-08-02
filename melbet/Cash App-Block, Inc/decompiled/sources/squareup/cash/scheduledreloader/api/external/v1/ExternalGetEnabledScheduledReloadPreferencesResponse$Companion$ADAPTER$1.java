package squareup.cash.scheduledreloader.api.external.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ExternalGetEnabledScheduledReloadPreferencesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExternalGetEnabledScheduledReloadPreferencesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ScheduledReloadPreference.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExternalGetEnabledScheduledReloadPreferencesResponse externalGetEnabledScheduledReloadPreferencesResponse = (ExternalGetEnabledScheduledReloadPreferencesResponse) obj;
        reverseProtoWriter.getClass();
        externalGetEnabledScheduledReloadPreferencesResponse.getClass();
        reverseProtoWriter.writeBytes(externalGetEnabledScheduledReloadPreferencesResponse.unknownFields());
        ScheduledReloadPreference.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, externalGetEnabledScheduledReloadPreferencesResponse.scheduled_reload_preferences);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExternalGetEnabledScheduledReloadPreferencesResponse externalGetEnabledScheduledReloadPreferencesResponse = (ExternalGetEnabledScheduledReloadPreferencesResponse) obj;
        externalGetEnabledScheduledReloadPreferencesResponse.getClass();
        return ScheduledReloadPreference.ADAPTER.asRepeated().encodedSizeWithTag(1, externalGetEnabledScheduledReloadPreferencesResponse.scheduled_reload_preferences) + externalGetEnabledScheduledReloadPreferencesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExternalGetEnabledScheduledReloadPreferencesResponse externalGetEnabledScheduledReloadPreferencesResponse = (ExternalGetEnabledScheduledReloadPreferencesResponse) obj;
        externalGetEnabledScheduledReloadPreferencesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(externalGetEnabledScheduledReloadPreferencesResponse.scheduled_reload_preferences, ScheduledReloadPreference.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ExternalGetEnabledScheduledReloadPreferencesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExternalGetEnabledScheduledReloadPreferencesResponse externalGetEnabledScheduledReloadPreferencesResponse = (ExternalGetEnabledScheduledReloadPreferencesResponse) obj;
        externalGetEnabledScheduledReloadPreferencesResponse.getClass();
        ScheduledReloadPreference.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, externalGetEnabledScheduledReloadPreferencesResponse.scheduled_reload_preferences);
        protoWriter.writeBytes(externalGetEnabledScheduledReloadPreferencesResponse.unknownFields());
    }
}
