package com.squareup.protos.cash.syncentitygateway.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncTopicEntitiesClientRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncTopicEntitiesClientRequest> CREATOR;
    public final ByteString sync_range;
    public final Integer topic;
    public final Trigger trigger;

    static {
        SyncTopicEntitiesClientRequest$Companion$ADAPTER$1 syncTopicEntitiesClientRequest$Companion$ADAPTER$1 = new SyncTopicEntitiesClientRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncTopicEntitiesClientRequest.class), "type.googleapis.com/squareup.cash.syncentitygateway.api.v1.SyncTopicEntitiesClientRequest", Syntax.PROTO_2, null, "squareup/cash/syncentitygateway/api/v1/app.proto");
        ADAPTER = syncTopicEntitiesClientRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncTopicEntitiesClientRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncTopicEntitiesClientRequest(Integer num, ByteString byteString, Trigger trigger, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.topic = num;
        this.sync_range = byteString;
        this.trigger = trigger;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncTopicEntitiesClientRequest)) {
            return false;
        }
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = (SyncTopicEntitiesClientRequest) obj;
        return Intrinsics.areEqual(unknownFields(), syncTopicEntitiesClientRequest.unknownFields()) && Intrinsics.areEqual(this.topic, syncTopicEntitiesClientRequest.topic) && Intrinsics.areEqual(this.sync_range, syncTopicEntitiesClientRequest.sync_range) && this.trigger == syncTopicEntitiesClientRequest.trigger;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.topic;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ByteString byteString = this.sync_range;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Trigger trigger = this.trigger;
        int hashCode4 = hashCode3 + (trigger != null ? trigger.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(28);
        builder.modules = this.topic;
        builder.overflow_modules = this.sync_range;
        builder.card_home_actions = this.trigger;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.topic;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("topic=", num, arrayList);
        }
        ByteString byteString = this.sync_range;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("sync_range=", byteString, arrayList);
        }
        Trigger trigger = this.trigger;
        if (trigger != null) {
            arrayList.add("trigger=" + trigger);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncTopicEntitiesClientRequest{", "}", 0, null, null, 56);
    }
}
