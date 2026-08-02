package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityPageRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageRequest$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "activity_offset", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "", "page_size", "Ljava/lang/Integer;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "activity_row_section", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityPageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityPageRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityOffset#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityOffset activity_offset;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityRowSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<ActivityRowSection> activity_row_section;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityScope#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActivityScope activity_scope;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityToken#ADAPTER", schemaIndex = 2, tag = 3)
    public final ActivityToken activity_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer page_size;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityPageRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageRequest;", "<init>", "()V", "activity_offset", "Lcom/squareup/protos/cash/activity/api/v1/ActivityOffset;", "activity_scope", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "activity_token", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "page_size", "", "Ljava/lang/Integer;", "activity_row_section", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRowSection;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/activity/api/v1/ActivityPageRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public ActivityOffset activity_offset;
        public List<? extends ActivityRowSection> activity_row_section = EmptyList.INSTANCE;
        public ActivityScope activity_scope;
        public ActivityToken activity_token;
        public Integer page_size;

        public final Builder activity_offset(ActivityOffset activity_offset) {
            this.activity_offset = activity_offset;
            return this;
        }

        public final Builder activity_row_section(List<? extends ActivityRowSection> activity_row_section) {
            activity_row_section.getClass();
            TransactorKt.checkElementsNotNull(activity_row_section);
            this.activity_row_section = activity_row_section;
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
        public ActivityPageRequest build() {
            return new ActivityPageRequest(this.activity_offset, this.activity_scope, this.activity_token, this.page_size, this.activity_row_section, buildUnknownFields());
        }

        public final Builder page_size(Integer page_size) {
            this.page_size = page_size;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActivityPageRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.activity.api.v1.ActivityPageRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ActivityPageRequest((ActivityOffset) obj, (ActivityScope) obj2, (ActivityToken) obj3, (Integer) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                        obj4 = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            ActivityRowSection.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ActivityPageRequest activityPageRequest = (ActivityPageRequest) obj;
                reverseProtoWriter.getClass();
                activityPageRequest.getClass();
                reverseProtoWriter.writeBytes(activityPageRequest.unknownFields());
                ActivityRowSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, activityPageRequest.activity_row_section);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, activityPageRequest.page_size);
                ActivityToken.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activityPageRequest.activity_token);
                ActivityScope.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityPageRequest.activity_scope);
                ActivityOffset.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityPageRequest.activity_offset);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ActivityPageRequest activityPageRequest = (ActivityPageRequest) obj;
                activityPageRequest.getClass();
                return ActivityRowSection.ADAPTER.asRepeated().encodedSizeWithTag(5, activityPageRequest.activity_row_section) + ProtoAdapter.INT32.encodedSizeWithTag(4, activityPageRequest.page_size) + ActivityToken.ADAPTER.encodedSizeWithTag(3, activityPageRequest.activity_token) + ActivityScope.ADAPTER.encodedSizeWithTag(2, activityPageRequest.activity_scope) + ActivityOffset.ADAPTER.encodedSizeWithTag(1, activityPageRequest.activity_offset) + activityPageRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ActivityPageRequest activityPageRequest = (ActivityPageRequest) obj;
                activityPageRequest.getClass();
                ActivityOffset activityOffset = activityPageRequest.activity_offset;
                ActivityOffset activityOffset2 = activityOffset != null ? (ActivityOffset) ActivityOffset.ADAPTER.redact(activityOffset) : null;
                ActivityToken activityToken = activityPageRequest.activity_token;
                ActivityToken activityToken2 = activityToken != null ? (ActivityToken) ActivityToken.ADAPTER.redact(activityToken) : null;
                ByteString byteString = ByteString.EMPTY;
                ActivityScope activityScope = activityPageRequest.activity_scope;
                Integer num = activityPageRequest.page_size;
                List<ActivityRowSection> list = activityPageRequest.activity_row_section;
                list.getClass();
                byteString.getClass();
                return new ActivityPageRequest(activityOffset2, activityScope, activityToken2, num, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ActivityPageRequest activityPageRequest = (ActivityPageRequest) obj;
                activityPageRequest.getClass();
                ActivityOffset.ADAPTER.encodeWithTag(protoWriter, 1, activityPageRequest.activity_offset);
                ActivityScope.ADAPTER.encodeWithTag(protoWriter, 2, activityPageRequest.activity_scope);
                ActivityToken.ADAPTER.encodeWithTag(protoWriter, 3, activityPageRequest.activity_token);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, activityPageRequest.page_size);
                ActivityRowSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, activityPageRequest.activity_row_section);
                protoWriter.writeBytes(activityPageRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPageRequest(ActivityOffset activityOffset, ActivityScope activityScope, ActivityToken activityToken, Integer num, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.activity_offset = activityOffset;
        this.activity_scope = activityScope;
        this.activity_token = activityToken;
        this.page_size = num;
        this.activity_row_section = TransactorKt.immutableCopyOf("activity_row_section", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityPageRequest)) {
            return false;
        }
        ActivityPageRequest activityPageRequest = (ActivityPageRequest) obj;
        return Intrinsics.areEqual(unknownFields(), activityPageRequest.unknownFields()) && Intrinsics.areEqual(this.activity_offset, activityPageRequest.activity_offset) && this.activity_scope == activityPageRequest.activity_scope && Intrinsics.areEqual(this.activity_token, activityPageRequest.activity_token) && Intrinsics.areEqual(this.page_size, activityPageRequest.page_size) && Intrinsics.areEqual(this.activity_row_section, activityPageRequest.activity_row_section);
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
        Integer num = this.page_size;
        int hashCode5 = this.activity_row_section.hashCode() + ((hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.activity_offset = this.activity_offset;
        builder.activity_scope = this.activity_scope;
        builder.activity_token = this.activity_token;
        builder.page_size = this.page_size;
        builder.activity_row_section = this.activity_row_section;
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
        Integer num = this.page_size;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("page_size=", num, arrayList);
        }
        if (!this.activity_row_section.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("activity_row_section=", arrayList, this.activity_row_section);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityPageRequest{", "}", 0, null, null, 56);
    }
}
