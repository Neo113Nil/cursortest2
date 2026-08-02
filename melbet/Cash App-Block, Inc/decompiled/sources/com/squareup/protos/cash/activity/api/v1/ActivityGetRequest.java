package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "activityItemGlobalId", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityGetRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityGetRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityItemGlobalId activityItemGlobalId;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityScope#ADAPTER", schemaIndex = 2, tag = 3)
    public final ActivityScope activity_scope;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityToken#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActivityToken activity_token;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest;", "<init>", "()V", "activityItemGlobalId", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public ActivityItemGlobalId activityItemGlobalId;
        public ActivityScope activity_scope;
        public ActivityToken activity_token;

        public final Builder activityItemGlobalId(ActivityItemGlobalId activityItemGlobalId) {
            this.activityItemGlobalId = activityItemGlobalId;
            return this;
        }

        public final Builder activity_scope(ActivityScope activity_scope) {
            this.activity_scope = activity_scope;
            return this;
        }

        public final Builder activity_token(ActivityToken activity_token) {
            this.activity_token = activity_token;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityGetRequest build() {
            return new ActivityGetRequest(this.activityItemGlobalId, this.activity_token, this.activity_scope, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActivityGetRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.activity.api.v1.ActivityGetRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ActivityGetRequest((ActivityItemGlobalId) obj, (ActivityToken) obj2, (ActivityScope) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ActivityItemGlobalId.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(ActivityToken.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = ActivityScope.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ActivityGetRequest activityGetRequest = (ActivityGetRequest) obj;
                reverseProtoWriter.getClass();
                activityGetRequest.getClass();
                reverseProtoWriter.writeBytes(activityGetRequest.unknownFields());
                ActivityScope.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activityGetRequest.activity_scope);
                ActivityToken.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityGetRequest.activity_token);
                ActivityItemGlobalId.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityGetRequest.activityItemGlobalId);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ActivityGetRequest activityGetRequest = (ActivityGetRequest) obj;
                activityGetRequest.getClass();
                return ActivityScope.ADAPTER.encodedSizeWithTag(3, activityGetRequest.activity_scope) + ActivityToken.ADAPTER.encodedSizeWithTag(2, activityGetRequest.activity_token) + ActivityItemGlobalId.ADAPTER.encodedSizeWithTag(1, activityGetRequest.activityItemGlobalId) + activityGetRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ActivityGetRequest activityGetRequest = (ActivityGetRequest) obj;
                activityGetRequest.getClass();
                ActivityItemGlobalId activityItemGlobalId = activityGetRequest.activityItemGlobalId;
                ActivityItemGlobalId activityItemGlobalId2 = activityItemGlobalId != null ? (ActivityItemGlobalId) ActivityItemGlobalId.ADAPTER.redact(activityItemGlobalId) : null;
                ActivityToken activityToken = activityGetRequest.activity_token;
                ActivityToken activityToken2 = activityToken != null ? (ActivityToken) ActivityToken.ADAPTER.redact(activityToken) : null;
                ByteString byteString = ByteString.EMPTY;
                ActivityScope activityScope = activityGetRequest.activity_scope;
                byteString.getClass();
                return new ActivityGetRequest(activityItemGlobalId2, activityToken2, activityScope, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ActivityGetRequest activityGetRequest = (ActivityGetRequest) obj;
                activityGetRequest.getClass();
                ActivityItemGlobalId.ADAPTER.encodeWithTag(protoWriter, 1, activityGetRequest.activityItemGlobalId);
                ActivityToken.ADAPTER.encodeWithTag(protoWriter, 2, activityGetRequest.activity_token);
                ActivityScope.ADAPTER.encodeWithTag(protoWriter, 3, activityGetRequest.activity_scope);
                protoWriter.writeBytes(activityGetRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGetRequest(ActivityItemGlobalId activityItemGlobalId, ActivityToken activityToken, ActivityScope activityScope, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activityItemGlobalId = activityItemGlobalId;
        this.activity_token = activityToken;
        this.activity_scope = activityScope;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityGetRequest)) {
            return false;
        }
        ActivityGetRequest activityGetRequest = (ActivityGetRequest) obj;
        return Intrinsics.areEqual(unknownFields(), activityGetRequest.unknownFields()) && Intrinsics.areEqual(this.activityItemGlobalId, activityGetRequest.activityItemGlobalId) && Intrinsics.areEqual(this.activity_token, activityGetRequest.activity_token) && this.activity_scope == activityGetRequest.activity_scope;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityItemGlobalId activityItemGlobalId = this.activityItemGlobalId;
        int hashCode2 = (hashCode + (activityItemGlobalId != null ? activityItemGlobalId.hashCode() : 0)) * 37;
        ActivityToken activityToken = this.activity_token;
        int hashCode3 = (hashCode2 + (activityToken != null ? activityToken.hashCode() : 0)) * 37;
        ActivityScope activityScope = this.activity_scope;
        int hashCode4 = hashCode3 + (activityScope != null ? activityScope.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activityItemGlobalId = this.activityItemGlobalId;
        builder.activity_token = this.activity_token;
        builder.activity_scope = this.activity_scope;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityItemGlobalId activityItemGlobalId = this.activityItemGlobalId;
        if (activityItemGlobalId != null) {
            arrayList.add("activityItemGlobalId=" + activityItemGlobalId);
        }
        ActivityToken activityToken = this.activity_token;
        if (activityToken != null) {
            arrayList.add("activity_token=" + activityToken);
        }
        ActivityScope activityScope = this.activity_scope;
        if (activityScope != null) {
            arrayList.add("activity_scope=" + activityScope);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityGetRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ActivityGetRequest(ActivityItemGlobalId activityItemGlobalId, ActivityToken activityToken, ActivityScope activityScope) {
        this(activityItemGlobalId, activityToken, activityScope, ByteString.EMPTY);
    }
}
