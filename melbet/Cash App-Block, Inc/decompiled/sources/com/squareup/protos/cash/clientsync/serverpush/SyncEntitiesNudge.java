package com.squareup.protos.cash.clientsync.serverpush;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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

/* loaded from: classes.dex */
public final class SyncEntitiesNudge extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncEntitiesNudge> CREATOR;
    public final Long timestamp;
    public final String topic;
    public final Integer topicVal;

    static {
        SyncEntitiesNudge$Companion$ADAPTER$1 syncEntitiesNudge$Companion$ADAPTER$1 = new SyncEntitiesNudge$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncEntitiesNudge.class), "type.googleapis.com/squareup.cash.clientsync.serverpush.SyncEntitiesNudge", Syntax.PROTO_2, null, "squareup/cash/clientsync/serverpush.proto");
        ADAPTER = syncEntitiesNudge$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncEntitiesNudge$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntitiesNudge(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.topic = str;
        this.timestamp = l;
        this.topicVal = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncEntitiesNudge)) {
            return false;
        }
        SyncEntitiesNudge syncEntitiesNudge = (SyncEntitiesNudge) obj;
        return Intrinsics.areEqual(unknownFields(), syncEntitiesNudge.unknownFields()) && Intrinsics.areEqual(this.topic, syncEntitiesNudge.topic) && Intrinsics.areEqual(this.timestamp, syncEntitiesNudge.timestamp) && Intrinsics.areEqual(this.topicVal, syncEntitiesNudge.topicVal);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.topic;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.timestamp;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Integer num = this.topicVal;
        int hashCode4 = hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(29);
        builder.title = this.topic;
        builder.subtitle = this.timestamp;
        builder.action = this.topicVal;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.topic;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "topic=", arrayList);
        }
        Long l = this.timestamp;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp=", l, arrayList);
        }
        Integer num = this.topicVal;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("topicVal=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncEntitiesNudge{", "}", 0, null, null, 56);
    }
}
