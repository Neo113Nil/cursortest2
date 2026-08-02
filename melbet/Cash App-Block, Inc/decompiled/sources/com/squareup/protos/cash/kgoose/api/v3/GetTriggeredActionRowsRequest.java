package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionRowsRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionRowsRequest$Builder;", "", "cursor", "Ljava/lang/String;", "", "limit", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "status_filter", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetTriggeredActionRowsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetTriggeredActionRowsRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer limit;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionStatusFilter#ADAPTER", schemaIndex = 2, tag = 3)
    public final TriggeredActionStatusFilter status_filter;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionRowsRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionRowsRequest;", "<init>", "()V", "cursor", "", "limit", "", "Ljava/lang/Integer;", "status_filter", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionRowsRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String cursor;
        public Integer limit;
        public TriggeredActionStatusFilter status_filter;

        @Override // com.squareup.wire.Message.Builder
        public GetTriggeredActionRowsRequest build() {
            return new GetTriggeredActionRowsRequest(this.cursor, this.limit, this.status_filter, buildUnknownFields());
        }

        public final Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public final Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public final Builder status_filter(TriggeredActionStatusFilter status_filter) {
            this.status_filter = status_filter;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetTriggeredActionRowsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.GetTriggeredActionRowsRequest$Companion$ADAPTER$1
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
                        return new GetTriggeredActionRowsRequest((String) obj, (Integer) obj2, (TriggeredActionStatusFilter) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = TriggeredActionStatusFilter.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetTriggeredActionRowsRequest getTriggeredActionRowsRequest = (GetTriggeredActionRowsRequest) obj;
                reverseProtoWriter.getClass();
                getTriggeredActionRowsRequest.getClass();
                reverseProtoWriter.writeBytes(getTriggeredActionRowsRequest.unknownFields());
                TriggeredActionStatusFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getTriggeredActionRowsRequest.status_filter);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, getTriggeredActionRowsRequest.limit);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getTriggeredActionRowsRequest.cursor);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetTriggeredActionRowsRequest getTriggeredActionRowsRequest = (GetTriggeredActionRowsRequest) obj;
                getTriggeredActionRowsRequest.getClass();
                return TriggeredActionStatusFilter.ADAPTER.encodedSizeWithTag(3, getTriggeredActionRowsRequest.status_filter) + ProtoAdapter.INT32.encodedSizeWithTag(2, getTriggeredActionRowsRequest.limit) + ProtoAdapter.STRING.encodedSizeWithTag(1, getTriggeredActionRowsRequest.cursor) + getTriggeredActionRowsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetTriggeredActionRowsRequest getTriggeredActionRowsRequest = (GetTriggeredActionRowsRequest) obj;
                getTriggeredActionRowsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getTriggeredActionRowsRequest.cursor;
                Integer num = getTriggeredActionRowsRequest.limit;
                TriggeredActionStatusFilter triggeredActionStatusFilter = getTriggeredActionRowsRequest.status_filter;
                byteString.getClass();
                return new GetTriggeredActionRowsRequest(str, num, triggeredActionStatusFilter, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetTriggeredActionRowsRequest getTriggeredActionRowsRequest = (GetTriggeredActionRowsRequest) obj;
                getTriggeredActionRowsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTriggeredActionRowsRequest.cursor);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getTriggeredActionRowsRequest.limit);
                TriggeredActionStatusFilter.ADAPTER.encodeWithTag(protoWriter, 3, getTriggeredActionRowsRequest.status_filter);
                protoWriter.writeBytes(getTriggeredActionRowsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTriggeredActionRowsRequest(String str, Integer num, TriggeredActionStatusFilter triggeredActionStatusFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cursor = str;
        this.limit = num;
        this.status_filter = triggeredActionStatusFilter;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetTriggeredActionRowsRequest)) {
            return false;
        }
        GetTriggeredActionRowsRequest getTriggeredActionRowsRequest = (GetTriggeredActionRowsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getTriggeredActionRowsRequest.unknownFields()) && Intrinsics.areEqual(this.cursor, getTriggeredActionRowsRequest.cursor) && Intrinsics.areEqual(this.limit, getTriggeredActionRowsRequest.limit) && this.status_filter == getTriggeredActionRowsRequest.status_filter;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cursor;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.limit;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        TriggeredActionStatusFilter triggeredActionStatusFilter = this.status_filter;
        int hashCode4 = hashCode3 + (triggeredActionStatusFilter != null ? triggeredActionStatusFilter.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.status_filter = this.status_filter;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
        }
        Integer num = this.limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("limit=", num, arrayList);
        }
        TriggeredActionStatusFilter triggeredActionStatusFilter = this.status_filter;
        if (triggeredActionStatusFilter != null) {
            arrayList.add("status_filter=" + triggeredActionStatusFilter);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTriggeredActionRowsRequest{", "}", 0, null, null, 56);
    }
}
