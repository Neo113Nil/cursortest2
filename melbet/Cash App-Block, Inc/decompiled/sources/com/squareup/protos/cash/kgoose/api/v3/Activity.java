package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "activity_type", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "", "id", "Ljava/lang/String;", "", "created", "Ljava/lang/Long;", "Companion", "Builder", "ActivityType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Activity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Activity> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final ActivityType activity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 102)
    public final Long created;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 101)
    public final String id;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "", "TileCreation", "PlasmaFlowCompletion", "ClientCardUpdate", "ClientRenderingUpdate", "MemoryUpdate", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$ClientCardUpdate;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$ClientRenderingUpdate;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$MemoryUpdate;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$PlasmaFlowCompletion;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$TileCreation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ActivityType {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientCardUpdateActivity#ADAPTER", declaredName = "client_card_update", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$ClientCardUpdate;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClientCardUpdate extends ActivityType {
            private final ClientCardUpdateActivity value;

            public ClientCardUpdate(ClientCardUpdateActivity clientCardUpdateActivity) {
                clientCardUpdateActivity.getClass();
                this.value = clientCardUpdateActivity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientCardUpdate) && Intrinsics.areEqual(this.value, ((ClientCardUpdate) obj).value);
            }

            public final ClientCardUpdateActivity getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ClientCardUpdate(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientRenderingUpdateActivity#ADAPTER", declaredName = "client_rendering_update", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$ClientRenderingUpdate;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderingUpdateActivity;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderingUpdateActivity;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderingUpdateActivity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClientRenderingUpdate extends ActivityType {
            private final ClientRenderingUpdateActivity value;

            public ClientRenderingUpdate(ClientRenderingUpdateActivity clientRenderingUpdateActivity) {
                clientRenderingUpdateActivity.getClass();
                this.value = clientRenderingUpdateActivity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRenderingUpdate) && Intrinsics.areEqual(this.value, ((ClientRenderingUpdate) obj).value);
            }

            public final ClientRenderingUpdateActivity getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ClientRenderingUpdate(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MemoryUpdateActivity#ADAPTER", declaredName = "memory_update", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$MemoryUpdate;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "Lcom/squareup/protos/cash/kgoose/api/v3/MemoryUpdateActivity;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/MemoryUpdateActivity;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/MemoryUpdateActivity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MemoryUpdate extends ActivityType {
            private final MemoryUpdateActivity value;

            public MemoryUpdate(MemoryUpdateActivity memoryUpdateActivity) {
                memoryUpdateActivity.getClass();
                this.value = memoryUpdateActivity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MemoryUpdate) && Intrinsics.areEqual(this.value, ((MemoryUpdate) obj).value);
            }

            public final MemoryUpdateActivity getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MemoryUpdate(value=" + this.value + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$PlasmaFlowCompletion;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "Lcom/squareup/protos/cash/kgoose/api/v3/PlasmaFlowCompletionActivity;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/PlasmaFlowCompletionActivity;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/PlasmaFlowCompletionActivity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PlasmaFlowCompletionActivity#ADAPTER", declaredName = "plasma_flow_completion", tag = 2)
        @Deprecated
        public static final /* data */ class PlasmaFlowCompletion extends ActivityType {
            private final PlasmaFlowCompletionActivity value;

            public PlasmaFlowCompletion(PlasmaFlowCompletionActivity plasmaFlowCompletionActivity) {
                plasmaFlowCompletionActivity.getClass();
                this.value = plasmaFlowCompletionActivity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PlasmaFlowCompletion) && Intrinsics.areEqual(this.value, ((PlasmaFlowCompletion) obj).value);
            }

            public final PlasmaFlowCompletionActivity getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PlasmaFlowCompletion(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TileCreationActivity#ADAPTER", declaredName = "tile_creation", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType$TileCreation;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "Lcom/squareup/protos/cash/kgoose/api/v3/TileCreationActivity;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TileCreationActivity;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TileCreationActivity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TileCreation extends ActivityType {
            private final TileCreationActivity value;

            public TileCreation(TileCreationActivity tileCreationActivity) {
                tileCreationActivity.getClass();
                this.value = tileCreationActivity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TileCreation) && Intrinsics.areEqual(this.value, ((TileCreation) obj).value);
            }

            public final TileCreationActivity getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TileCreation(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Activity$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity;", "<init>", "()V", "activity_type", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity$ActivityType;", "id", "", "created", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/Activity$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActivityType activity_type;
        public Long created;
        public String id;

        public final Builder activity_type(ActivityType activity_type) {
            this.activity_type = activity_type;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Activity build() {
            return new Activity(this.activity_type, this.id, this.created, buildUnknownFields());
        }

        public final Builder created(Long created) {
            this.created = created;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }
    }

    static {
        Activity$Companion$ADAPTER$1 activity$Companion$ADAPTER$1 = new Activity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Activity.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Activity", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/activity_messages.proto");
        ADAPTER = activity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Activity(ActivityType activityType, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_type = activityType;
        this.id = str;
        this.created = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) obj;
        return Intrinsics.areEqual(unknownFields(), activity.unknownFields()) && Intrinsics.areEqual(this.activity_type, activity.activity_type) && Intrinsics.areEqual(this.id, activity.id) && Intrinsics.areEqual(this.created, activity.created);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityType activityType = this.activity_type;
        int hashCode2 = (hashCode + (activityType != null ? activityType.hashCode() : 0)) * 37;
        String str = this.id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_type = this.activity_type;
        builder.id = this.id;
        builder.created = this.created;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityType activityType = this.activity_type;
        if (activityType != null) {
            arrayList.add("activity_type=" + activityType);
        }
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Long l = this.created;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Activity{", "}", 0, null, null, 56);
    }
}
