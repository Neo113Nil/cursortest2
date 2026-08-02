package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedRequest$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "activity_offset", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "", "counterparty", "Ljava/lang/String;", "", "page_size", "Ljava/lang/Integer;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityPageThreadedFeedRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityPageThreadedFeedRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityOffset#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityOffset activity_offset;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityScope#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActivityScope activity_scope;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityToken#ADAPTER", schemaIndex = 2, tag = 3)
    public final ActivityToken activity_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String counterparty;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    public final Integer page_size;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedRequest;", "<init>", "()V", "activity_offset", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "counterparty", "", "page_size", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public ActivityOffset activity_offset;
        public ActivityScope activity_scope;
        public ActivityToken activity_token;
        public String counterparty;
        public Integer page_size;

        public final Builder activity_offset(ActivityOffset activity_offset) {
            this.activity_offset = activity_offset;
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
        public ActivityPageThreadedFeedRequest build() {
            return new ActivityPageThreadedFeedRequest(this.activity_offset, this.activity_scope, this.activity_token, this.counterparty, this.page_size, buildUnknownFields());
        }

        public final Builder counterparty(String counterparty) {
            this.counterparty = counterparty;
            return this;
        }

        public final Builder page_size(Integer page_size) {
            this.page_size = page_size;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActivityPageThreadedFeedRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.activity.api.v1.ActivityPageThreadedFeedRequest$Companion$ADAPTER$1
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
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ActivityPageThreadedFeedRequest((ActivityOffset) obj, (ActivityScope) obj2, (ActivityToken) obj3, (String) obj4, (Integer) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ActivityOffset.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = ActivityScope.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(ActivityToken.ADAPTER, protoReader, obj3);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest = (ActivityPageThreadedFeedRequest) obj;
                reverseProtoWriter.getClass();
                activityPageThreadedFeedRequest.getClass();
                reverseProtoWriter.writeBytes(activityPageThreadedFeedRequest.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, activityPageThreadedFeedRequest.page_size);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, activityPageThreadedFeedRequest.counterparty);
                ActivityToken.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activityPageThreadedFeedRequest.activity_token);
                ActivityScope.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityPageThreadedFeedRequest.activity_scope);
                ActivityOffset.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityPageThreadedFeedRequest.activity_offset);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest = (ActivityPageThreadedFeedRequest) obj;
                activityPageThreadedFeedRequest.getClass();
                return ProtoAdapter.INT32.encodedSizeWithTag(5, activityPageThreadedFeedRequest.page_size) + ProtoAdapter.STRING.encodedSizeWithTag(4, activityPageThreadedFeedRequest.counterparty) + ActivityToken.ADAPTER.encodedSizeWithTag(3, activityPageThreadedFeedRequest.activity_token) + ActivityScope.ADAPTER.encodedSizeWithTag(2, activityPageThreadedFeedRequest.activity_scope) + ActivityOffset.ADAPTER.encodedSizeWithTag(1, activityPageThreadedFeedRequest.activity_offset) + activityPageThreadedFeedRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest = (ActivityPageThreadedFeedRequest) obj;
                activityPageThreadedFeedRequest.getClass();
                ActivityOffset activityOffset = activityPageThreadedFeedRequest.activity_offset;
                ActivityOffset activityOffset2 = activityOffset != null ? (ActivityOffset) ActivityOffset.ADAPTER.redact(activityOffset) : null;
                ActivityToken activityToken = activityPageThreadedFeedRequest.activity_token;
                ActivityToken activityToken2 = activityToken != null ? (ActivityToken) ActivityToken.ADAPTER.redact(activityToken) : null;
                ByteString byteString = ByteString.EMPTY;
                ActivityScope activityScope = activityPageThreadedFeedRequest.activity_scope;
                String str = activityPageThreadedFeedRequest.counterparty;
                Integer num = activityPageThreadedFeedRequest.page_size;
                byteString.getClass();
                return new ActivityPageThreadedFeedRequest(activityOffset2, activityScope, activityToken2, str, num, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest = (ActivityPageThreadedFeedRequest) obj;
                activityPageThreadedFeedRequest.getClass();
                ActivityOffset.ADAPTER.encodeWithTag(protoWriter, 1, activityPageThreadedFeedRequest.activity_offset);
                ActivityScope.ADAPTER.encodeWithTag(protoWriter, 2, activityPageThreadedFeedRequest.activity_scope);
                ActivityToken.ADAPTER.encodeWithTag(protoWriter, 3, activityPageThreadedFeedRequest.activity_token);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, activityPageThreadedFeedRequest.counterparty);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, activityPageThreadedFeedRequest.page_size);
                protoWriter.writeBytes(activityPageThreadedFeedRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPageThreadedFeedRequest(ActivityOffset activityOffset, ActivityScope activityScope, ActivityToken activityToken, String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_offset = activityOffset;
        this.activity_scope = activityScope;
        this.activity_token = activityToken;
        this.counterparty = str;
        this.page_size = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityPageThreadedFeedRequest)) {
            return false;
        }
        ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest = (ActivityPageThreadedFeedRequest) obj;
        return Intrinsics.areEqual(unknownFields(), activityPageThreadedFeedRequest.unknownFields()) && Intrinsics.areEqual(this.activity_offset, activityPageThreadedFeedRequest.activity_offset) && this.activity_scope == activityPageThreadedFeedRequest.activity_scope && Intrinsics.areEqual(this.activity_token, activityPageThreadedFeedRequest.activity_token) && Intrinsics.areEqual(this.counterparty, activityPageThreadedFeedRequest.counterparty) && Intrinsics.areEqual(this.page_size, activityPageThreadedFeedRequest.page_size);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityOffset activityOffset = this.activity_offset;
        int hashCode2 = (hashCode + (activityOffset != null ? activityOffset.hashCode() : 0)) * 37;
        ActivityScope activityScope = this.activity_scope;
        int hashCode3 = (hashCode2 + (activityScope != null ? activityScope.hashCode() : 0)) * 37;
        ActivityToken activityToken = this.activity_token;
        int hashCode4 = (hashCode3 + (activityToken != null ? activityToken.hashCode() : 0)) * 37;
        String str = this.counterparty;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int hashCode6 = hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_offset = this.activity_offset;
        builder.activity_scope = this.activity_scope;
        builder.activity_token = this.activity_token;
        builder.counterparty = this.counterparty;
        builder.page_size = this.page_size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityOffset activityOffset = this.activity_offset;
        if (activityOffset != null) {
            arrayList.add("activity_offset=" + activityOffset);
        }
        ActivityScope activityScope = this.activity_scope;
        if (activityScope != null) {
            arrayList.add("activity_scope=" + activityScope);
        }
        ActivityToken activityToken = this.activity_token;
        if (activityToken != null) {
            arrayList.add("activity_token=" + activityToken);
        }
        String str = this.counterparty;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "counterparty=", arrayList);
        }
        Integer num = this.page_size;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("page_size=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityPageThreadedFeedRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ActivityPageThreadedFeedRequest(ActivityOffset activityOffset, ActivityScope activityScope, ActivityToken activityToken, String str, Integer num) {
        this(activityOffset, activityScope, activityToken, str, num, ByteString.EMPTY);
    }
}
