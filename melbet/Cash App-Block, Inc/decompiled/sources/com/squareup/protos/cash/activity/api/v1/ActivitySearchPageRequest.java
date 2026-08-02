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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchPageRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchPageRequest$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest;", "request", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityAggregationRequest;", "aggregation_request", "Lcom/squareup/protos/cash/activity/api/v1/ActivityAggregationRequest;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityCursor;", "cursor", "Lcom/squareup/protos/cash/activity/api/v1/ActivityCursor;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivitySearchPageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySearchPageRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityScope#ADAPTER", schemaIndex = 2, tag = 2)
    public final ActivityScope activity_scope;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityAggregationRequest#ADAPTER", schemaIndex = 1, tag = 3)
    public final ActivityAggregationRequest aggregation_request;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityCursor#ADAPTER", schemaIndex = 3, tag = 4)
    public final ActivityCursor cursor;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivitySearchRequest#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivitySearchRequest request;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchPageRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchPageRequest;", "<init>", "()V", "request", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest;", "aggregation_request", "Lcom/squareup/protos/cash/activity/api/v1/ActivityAggregationRequest;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "cursor", "Lcom/squareup/protos/cash/activity/api/v1/ActivityCursor;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public ActivityScope activity_scope;
        public ActivityAggregationRequest aggregation_request;
        public ActivityCursor cursor;
        public ActivitySearchRequest request;

        public final Builder activity_scope(ActivityScope activity_scope) {
            this.activity_scope = activity_scope;
            return this;
        }

        public final Builder aggregation_request(ActivityAggregationRequest aggregation_request) {
            this.aggregation_request = aggregation_request;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivitySearchPageRequest build() {
            return new ActivitySearchPageRequest(this.request, this.aggregation_request, this.activity_scope, this.cursor, buildUnknownFields());
        }

        public final Builder cursor(ActivityCursor cursor) {
            this.cursor = cursor;
            return this;
        }

        public final Builder request(ActivitySearchRequest request) {
            this.request = request;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActivitySearchPageRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.activity.api.v1.ActivitySearchPageRequest$Companion$ADAPTER$1
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
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ActivitySearchPageRequest((ActivitySearchRequest) obj, (ActivityAggregationRequest) obj2, (ActivityScope) obj3, (ActivityCursor) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ActivitySearchRequest.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        try {
                            obj3 = ActivityScope.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(ActivityAggregationRequest.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(ActivityCursor.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ActivitySearchPageRequest activitySearchPageRequest = (ActivitySearchPageRequest) obj;
                reverseProtoWriter.getClass();
                activitySearchPageRequest.getClass();
                reverseProtoWriter.writeBytes(activitySearchPageRequest.unknownFields());
                ActivityCursor.ADAPTER.encodeWithTag(reverseProtoWriter, 4, activitySearchPageRequest.cursor);
                ActivityScope.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activitySearchPageRequest.activity_scope);
                ActivityAggregationRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activitySearchPageRequest.aggregation_request);
                ActivitySearchRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activitySearchPageRequest.request);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ActivitySearchPageRequest activitySearchPageRequest = (ActivitySearchPageRequest) obj;
                activitySearchPageRequest.getClass();
                return ActivityCursor.ADAPTER.encodedSizeWithTag(4, activitySearchPageRequest.cursor) + ActivityScope.ADAPTER.encodedSizeWithTag(2, activitySearchPageRequest.activity_scope) + ActivityAggregationRequest.ADAPTER.encodedSizeWithTag(3, activitySearchPageRequest.aggregation_request) + ActivitySearchRequest.ADAPTER.encodedSizeWithTag(1, activitySearchPageRequest.request) + activitySearchPageRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ActivitySearchPageRequest activitySearchPageRequest = (ActivitySearchPageRequest) obj;
                activitySearchPageRequest.getClass();
                ActivitySearchRequest activitySearchRequest = activitySearchPageRequest.request;
                ActivitySearchRequest activitySearchRequest2 = activitySearchRequest != null ? (ActivitySearchRequest) ActivitySearchRequest.ADAPTER.redact(activitySearchRequest) : null;
                ActivityAggregationRequest activityAggregationRequest = activitySearchPageRequest.aggregation_request;
                ActivityAggregationRequest activityAggregationRequest2 = activityAggregationRequest != null ? (ActivityAggregationRequest) ActivityAggregationRequest.ADAPTER.redact(activityAggregationRequest) : null;
                ActivityCursor activityCursor = activitySearchPageRequest.cursor;
                ActivityCursor activityCursor2 = activityCursor != null ? (ActivityCursor) ActivityCursor.ADAPTER.redact(activityCursor) : null;
                ByteString byteString = ByteString.EMPTY;
                ActivityScope activityScope = activitySearchPageRequest.activity_scope;
                byteString.getClass();
                return new ActivitySearchPageRequest(activitySearchRequest2, activityAggregationRequest2, activityScope, activityCursor2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ActivitySearchPageRequest activitySearchPageRequest = (ActivitySearchPageRequest) obj;
                activitySearchPageRequest.getClass();
                ActivitySearchRequest.ADAPTER.encodeWithTag(protoWriter, 1, activitySearchPageRequest.request);
                ActivityAggregationRequest.ADAPTER.encodeWithTag(protoWriter, 3, activitySearchPageRequest.aggregation_request);
                ActivityScope.ADAPTER.encodeWithTag(protoWriter, 2, activitySearchPageRequest.activity_scope);
                ActivityCursor.ADAPTER.encodeWithTag(protoWriter, 4, activitySearchPageRequest.cursor);
                protoWriter.writeBytes(activitySearchPageRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySearchPageRequest(ActivitySearchRequest activitySearchRequest, ActivityAggregationRequest activityAggregationRequest, ActivityScope activityScope, ActivityCursor activityCursor, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request = activitySearchRequest;
        this.aggregation_request = activityAggregationRequest;
        this.activity_scope = activityScope;
        this.cursor = activityCursor;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySearchPageRequest)) {
            return false;
        }
        ActivitySearchPageRequest activitySearchPageRequest = (ActivitySearchPageRequest) obj;
        return Intrinsics.areEqual(unknownFields(), activitySearchPageRequest.unknownFields()) && Intrinsics.areEqual(this.request, activitySearchPageRequest.request) && Intrinsics.areEqual(this.aggregation_request, activitySearchPageRequest.aggregation_request) && this.activity_scope == activitySearchPageRequest.activity_scope && Intrinsics.areEqual(this.cursor, activitySearchPageRequest.cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivitySearchRequest activitySearchRequest = this.request;
        int hashCode2 = (hashCode + (activitySearchRequest != null ? activitySearchRequest.hashCode() : 0)) * 37;
        ActivityAggregationRequest activityAggregationRequest = this.aggregation_request;
        int hashCode3 = (hashCode2 + (activityAggregationRequest != null ? activityAggregationRequest.hashCode() : 0)) * 37;
        ActivityScope activityScope = this.activity_scope;
        int hashCode4 = (hashCode3 + (activityScope != null ? activityScope.hashCode() : 0)) * 37;
        ActivityCursor activityCursor = this.cursor;
        int hashCode5 = hashCode4 + (activityCursor != null ? activityCursor.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.request = this.request;
        builder.aggregation_request = this.aggregation_request;
        builder.activity_scope = this.activity_scope;
        builder.cursor = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivitySearchRequest activitySearchRequest = this.request;
        if (activitySearchRequest != null) {
            arrayList.add("request=" + activitySearchRequest);
        }
        ActivityAggregationRequest activityAggregationRequest = this.aggregation_request;
        if (activityAggregationRequest != null) {
            arrayList.add("aggregation_request=" + activityAggregationRequest);
        }
        ActivityScope activityScope = this.activity_scope;
        if (activityScope != null) {
            arrayList.add("activity_scope=" + activityScope);
        }
        ActivityCursor activityCursor = this.cursor;
        if (activityCursor != null) {
            arrayList.add("cursor=" + activityCursor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySearchPageRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ActivitySearchPageRequest(ActivitySearchRequest activitySearchRequest, ActivityScope activityScope, int i) {
        this(activitySearchRequest, null, activityScope, null, ByteString.EMPTY);
    }
}
