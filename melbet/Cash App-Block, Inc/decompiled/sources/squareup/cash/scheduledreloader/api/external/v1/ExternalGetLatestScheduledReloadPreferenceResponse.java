package squareup.cash.scheduledreloader.api.external.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lsquareup/cash/scheduledreloader/api/external/v1/ExternalGetLatestScheduledReloadPreferenceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/earnings/EarningTool$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExternalGetLatestScheduledReloadPreferenceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExternalGetLatestScheduledReloadPreferenceResponse> CREATOR;
    public final ScheduledReloadPreference scheduled_reload_preference;

    static {
        ExternalGetLatestScheduledReloadPreferenceResponse$Companion$ADAPTER$1 externalGetLatestScheduledReloadPreferenceResponse$Companion$ADAPTER$1 = new ExternalGetLatestScheduledReloadPreferenceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExternalGetLatestScheduledReloadPreferenceResponse.class), "type.googleapis.com/squareup.cash.scheduledreloader.api.external.v1.ExternalGetLatestScheduledReloadPreferenceResponse", Syntax.PROTO_2, null, "squareup/cash/scheduledreloader/api/external/v1/service.proto");
        ADAPTER = externalGetLatestScheduledReloadPreferenceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(externalGetLatestScheduledReloadPreferenceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalGetLatestScheduledReloadPreferenceResponse(ScheduledReloadPreference scheduledReloadPreference, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scheduled_reload_preference = scheduledReloadPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalGetLatestScheduledReloadPreferenceResponse)) {
            return false;
        }
        ExternalGetLatestScheduledReloadPreferenceResponse externalGetLatestScheduledReloadPreferenceResponse = (ExternalGetLatestScheduledReloadPreferenceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), externalGetLatestScheduledReloadPreferenceResponse.unknownFields()) && Intrinsics.areEqual(this.scheduled_reload_preference, externalGetLatestScheduledReloadPreferenceResponse.scheduled_reload_preference);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScheduledReloadPreference scheduledReloadPreference = this.scheduled_reload_preference;
        int hashCode2 = hashCode + (scheduledReloadPreference != null ? scheduledReloadPreference.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(29);
        builder.tool = this.scheduled_reload_preference;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScheduledReloadPreference scheduledReloadPreference = this.scheduled_reload_preference;
        if (scheduledReloadPreference != null) {
            arrayList.add("scheduled_reload_preference=" + scheduledReloadPreference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExternalGetLatestScheduledReloadPreferenceResponse{", "}", 0, null, null, 56);
    }
}
