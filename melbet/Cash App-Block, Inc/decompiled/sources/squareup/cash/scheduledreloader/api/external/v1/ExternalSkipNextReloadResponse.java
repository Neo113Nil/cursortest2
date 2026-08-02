package squareup.cash.scheduledreloader.api.external.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.Deduction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lsquareup/cash/scheduledreloader/api/external/v1/ExternalSkipNextReloadResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/Deduction$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExternalSkipNextReloadResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExternalSkipNextReloadResponse> CREATOR;
    public final Instant next_reload_at;
    public final ResponseContext response_context;
    public final Boolean skipped;
    public final SyncEntity sync_entity;

    static {
        ExternalSkipNextReloadResponse$Companion$ADAPTER$1 externalSkipNextReloadResponse$Companion$ADAPTER$1 = new ExternalSkipNextReloadResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExternalSkipNextReloadResponse.class), "type.googleapis.com/squareup.cash.scheduledreloader.api.external.v1.ExternalSkipNextReloadResponse", Syntax.PROTO_2, null, "squareup/cash/scheduledreloader/api/external/v1/service.proto");
        ADAPTER = externalSkipNextReloadResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(externalSkipNextReloadResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalSkipNextReloadResponse(Boolean bool, Instant instant, SyncEntity syncEntity, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.skipped = bool;
        this.next_reload_at = instant;
        this.sync_entity = syncEntity;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalSkipNextReloadResponse)) {
            return false;
        }
        ExternalSkipNextReloadResponse externalSkipNextReloadResponse = (ExternalSkipNextReloadResponse) obj;
        return Intrinsics.areEqual(unknownFields(), externalSkipNextReloadResponse.unknownFields()) && Intrinsics.areEqual(this.skipped, externalSkipNextReloadResponse.skipped) && Intrinsics.areEqual(this.next_reload_at, externalSkipNextReloadResponse.next_reload_at) && Intrinsics.areEqual(this.sync_entity, externalSkipNextReloadResponse.sync_entity) && Intrinsics.areEqual(this.response_context, externalSkipNextReloadResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.skipped;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Instant instant = this.next_reload_at;
        int hashCode3 = (hashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        SyncEntity syncEntity = this.sync_entity;
        int hashCode4 = (hashCode3 + (syncEntity != null ? syncEntity.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode5 = hashCode4 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(24);
        builder.amount = this.skipped;
        builder.description = this.next_reload_at;
        builder.note = this.sync_entity;
        builder.tint_color = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.skipped;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skipped=", bool, arrayList);
        }
        Instant instant = this.next_reload_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("next_reload_at=", instant, arrayList);
        }
        SyncEntity syncEntity = this.sync_entity;
        if (syncEntity != null) {
            arrayList.add("sync_entity=" + syncEntity);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExternalSkipNextReloadResponse{", "}", 0, null, null, 56);
    }
}
