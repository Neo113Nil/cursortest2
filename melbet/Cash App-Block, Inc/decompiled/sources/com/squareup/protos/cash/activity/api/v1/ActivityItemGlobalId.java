package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId;", "activity_id", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "primary_activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "Companion", "Builder", "ActivityId", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityItemGlobalId extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityItemGlobalId> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final ActivityId activity_id;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityToken#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActivityToken primary_activity_token;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId;", "", "ActivityItemId", "ActivityRowId", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId$ActivityItemId;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId$ActivityRowId;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ActivityId {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityItemId#ADAPTER", declaredName = "activity_item_id", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId$ActivityItemId;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemId;", "value", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemId;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/ActivityItemId;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActivityItemId extends ActivityId {
            private final com.squareup.protos.cash.activity.api.v1.ActivityItemId value;

            public ActivityItemId(com.squareup.protos.cash.activity.api.v1.ActivityItemId activityItemId) {
                activityItemId.getClass();
                this.value = activityItemId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActivityItemId) && Intrinsics.areEqual(this.value, ((ActivityItemId) obj).value);
            }

            public final com.squareup.protos.cash.activity.api.v1.ActivityItemId getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ActivityItemId(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "activity_row_id", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId$ActivityRowId;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActivityRowId extends ActivityId {
            private final String value;

            public ActivityRowId(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActivityRowId) && Intrinsics.areEqual(this.value, ((ActivityRowId) obj).value);
            }

            public final String getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityRowId(value=", this.value, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "<init>", "()V", "activity_id", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$ActivityId;", "primary_activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityId activity_id;
        public ActivityToken primary_activity_token;

        public final Builder activity_id(ActivityId activity_id) {
            this.activity_id = activity_id;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityItemGlobalId build() {
            return new ActivityItemGlobalId(this.activity_id, this.primary_activity_token, buildUnknownFields());
        }

        public final Builder primary_activity_token(ActivityToken primary_activity_token) {
            this.primary_activity_token = primary_activity_token;
            return this;
        }
    }

    static {
        ActivityItemGlobalId$Companion$ADAPTER$1 activityItemGlobalId$Companion$ADAPTER$1 = new ActivityItemGlobalId$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityItemGlobalId.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivityItemGlobalId", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/models.proto");
        ADAPTER = activityItemGlobalId$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityItemGlobalId$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityItemGlobalId(ActivityId activityId, ActivityToken activityToken, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_id = activityId;
        this.primary_activity_token = activityToken;
    }

    public static ActivityItemGlobalId copy$default(ActivityItemGlobalId activityItemGlobalId, ActivityToken activityToken, ByteString byteString, int i) {
        ActivityId activityId = activityItemGlobalId.activity_id;
        if ((i & 4) != 0) {
            byteString = activityItemGlobalId.unknownFields();
        }
        activityItemGlobalId.getClass();
        byteString.getClass();
        return new ActivityItemGlobalId(activityId, activityToken, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityItemGlobalId)) {
            return false;
        }
        ActivityItemGlobalId activityItemGlobalId = (ActivityItemGlobalId) obj;
        return Intrinsics.areEqual(unknownFields(), activityItemGlobalId.unknownFields()) && Intrinsics.areEqual(this.activity_id, activityItemGlobalId.activity_id) && Intrinsics.areEqual(this.primary_activity_token, activityItemGlobalId.primary_activity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityId activityId = this.activity_id;
        int hashCode2 = (hashCode + (activityId != null ? activityId.hashCode() : 0)) * 37;
        ActivityToken activityToken = this.primary_activity_token;
        int hashCode3 = hashCode2 + (activityToken != null ? activityToken.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_id = this.activity_id;
        builder.primary_activity_token = this.primary_activity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityId activityId = this.activity_id;
        if (activityId != null) {
            arrayList.add("activity_id=" + activityId);
        }
        ActivityToken activityToken = this.primary_activity_token;
        if (activityToken != null) {
            arrayList.add("primary_activity_token=" + activityToken);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityItemGlobalId{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ActivityItemGlobalId(ActivityId activityId, ActivityToken activityToken, int i) {
        this(activityId, (i & 2) != 0 ? null : activityToken, ByteString.EMPTY);
    }
}
