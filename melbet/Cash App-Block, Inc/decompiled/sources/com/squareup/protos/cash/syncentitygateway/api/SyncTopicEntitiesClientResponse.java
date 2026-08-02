package com.squareup.protos.cash.syncentitygateway.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncTopicEntitiesClientResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncTopicEntitiesClientResponse> CREATOR;
    public final List entities;
    public final Boolean has_more;
    public final SyncEntitiesResponse.RefreshAllEntitiesType refresh_all_entities;
    public final ByteString sync_range;
    public final Integer topic;

    static {
        SyncTopicEntitiesClientResponse$Companion$ADAPTER$1 syncTopicEntitiesClientResponse$Companion$ADAPTER$1 = new SyncTopicEntitiesClientResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncTopicEntitiesClientResponse.class), "type.googleapis.com/squareup.cash.syncentitygateway.api.v1.SyncTopicEntitiesClientResponse", Syntax.PROTO_2, null, "squareup/cash/syncentitygateway/api/v1/app.proto");
        ADAPTER = syncTopicEntitiesClientResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncTopicEntitiesClientResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncTopicEntitiesClientResponse(Integer num, List list, ByteString byteString, Boolean bool, SyncEntitiesResponse.RefreshAllEntitiesType refreshAllEntitiesType, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.topic = num;
        this.sync_range = byteString;
        this.has_more = bool;
        this.refresh_all_entities = refreshAllEntitiesType;
        this.entities = TransactorKt.immutableCopyOf("entities", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncTopicEntitiesClientResponse)) {
            return false;
        }
        SyncTopicEntitiesClientResponse syncTopicEntitiesClientResponse = (SyncTopicEntitiesClientResponse) obj;
        return Intrinsics.areEqual(unknownFields(), syncTopicEntitiesClientResponse.unknownFields()) && Intrinsics.areEqual(this.topic, syncTopicEntitiesClientResponse.topic) && Intrinsics.areEqual(this.entities, syncTopicEntitiesClientResponse.entities) && Intrinsics.areEqual(this.sync_range, syncTopicEntitiesClientResponse.sync_range) && Intrinsics.areEqual(this.has_more, syncTopicEntitiesClientResponse.has_more) && this.refresh_all_entities == syncTopicEntitiesClientResponse.refresh_all_entities;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.topic;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.entities);
        ByteString byteString = this.sync_range;
        int hashCode2 = (m + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Boolean bool = this.has_more;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        SyncEntitiesResponse.RefreshAllEntitiesType refreshAllEntitiesType = this.refresh_all_entities;
        int hashCode4 = hashCode3 + (refreshAllEntitiesType != null ? refreshAllEntitiesType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(19, false);
        builder.timezone_offset_min = this.topic;
        builder.tz_name = this.entities;
        builder.instant_usec = this.sync_range;
        builder.ordinal = this.has_more;
        builder.posix_tz = this.refresh_all_entities;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.topic;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("topic=", num, arrayList);
        }
        List list = this.entities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entities=", arrayList, list);
        }
        ByteString byteString = this.sync_range;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("sync_range=", byteString, arrayList);
        }
        Boolean bool = this.has_more;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_more=", bool, arrayList);
        }
        SyncEntitiesResponse.RefreshAllEntitiesType refreshAllEntitiesType = this.refresh_all_entities;
        if (refreshAllEntitiesType != null) {
            arrayList.add("refresh_all_entities=" + refreshAllEntitiesType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncTopicEntitiesClientResponse{", "}", 0, null, null, 56);
    }
}
