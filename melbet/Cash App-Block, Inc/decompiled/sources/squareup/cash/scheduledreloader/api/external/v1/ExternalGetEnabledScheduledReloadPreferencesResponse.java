package squareup.cash.scheduledreloader.api.external.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Collection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lsquareup/cash/scheduledreloader/api/external/v1/ExternalGetEnabledScheduledReloadPreferencesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Collection$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExternalGetEnabledScheduledReloadPreferencesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExternalGetEnabledScheduledReloadPreferencesResponse> CREATOR;
    public final List scheduled_reload_preferences;

    static {
        ExternalGetEnabledScheduledReloadPreferencesResponse$Companion$ADAPTER$1 externalGetEnabledScheduledReloadPreferencesResponse$Companion$ADAPTER$1 = new ExternalGetEnabledScheduledReloadPreferencesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExternalGetEnabledScheduledReloadPreferencesResponse.class), "type.googleapis.com/squareup.cash.scheduledreloader.api.external.v1.ExternalGetEnabledScheduledReloadPreferencesResponse", Syntax.PROTO_2, null, "squareup/cash/scheduledreloader/api/external/v1/service.proto");
        ADAPTER = externalGetEnabledScheduledReloadPreferencesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(externalGetEnabledScheduledReloadPreferencesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalGetEnabledScheduledReloadPreferencesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.scheduled_reload_preferences = TransactorKt.immutableCopyOf("scheduled_reload_preferences", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalGetEnabledScheduledReloadPreferencesResponse)) {
            return false;
        }
        ExternalGetEnabledScheduledReloadPreferencesResponse externalGetEnabledScheduledReloadPreferencesResponse = (ExternalGetEnabledScheduledReloadPreferencesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), externalGetEnabledScheduledReloadPreferencesResponse.unknownFields()) && Intrinsics.areEqual(this.scheduled_reload_preferences, externalGetEnabledScheduledReloadPreferencesResponse.scheduled_reload_preferences);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.scheduled_reload_preferences.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(27, false);
        builder.items = this.scheduled_reload_preferences;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.scheduled_reload_preferences;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("scheduled_reload_preferences=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExternalGetEnabledScheduledReloadPreferencesResponse{", "}", 0, null, null, 56);
    }
}
