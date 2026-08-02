package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MarkWidgetAsUsedRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/MarkWidgetAsUsedRequest$Builder;", "", "widget_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "widget_type", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MarkWidgetAsUsedRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarkWidgetAsUsedRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String widget_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WidgetTemplateType#ADAPTER", schemaIndex = 1, tag = 2)
    public final WidgetTemplateType widget_type;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MarkWidgetAsUsedRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/MarkWidgetAsUsedRequest;", "<init>", "()V", "widget_id", "", "widget_type", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String widget_id;
        public WidgetTemplateType widget_type;

        @Override // com.squareup.wire.Message.Builder
        public MarkWidgetAsUsedRequest build() {
            return new MarkWidgetAsUsedRequest(this.widget_id, this.widget_type, buildUnknownFields());
        }

        public final Builder widget_id(String widget_id) {
            this.widget_id = widget_id;
            return this;
        }

        public final Builder widget_type(WidgetTemplateType widget_type) {
            this.widget_type = widget_type;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MarkWidgetAsUsedRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.MarkWidgetAsUsedRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new MarkWidgetAsUsedRequest((String) obj, (WidgetTemplateType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = WidgetTemplateType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                MarkWidgetAsUsedRequest markWidgetAsUsedRequest = (MarkWidgetAsUsedRequest) obj;
                reverseProtoWriter.getClass();
                markWidgetAsUsedRequest.getClass();
                reverseProtoWriter.writeBytes(markWidgetAsUsedRequest.unknownFields());
                WidgetTemplateType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, markWidgetAsUsedRequest.widget_type);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, markWidgetAsUsedRequest.widget_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                MarkWidgetAsUsedRequest markWidgetAsUsedRequest = (MarkWidgetAsUsedRequest) obj;
                markWidgetAsUsedRequest.getClass();
                return WidgetTemplateType.ADAPTER.encodedSizeWithTag(2, markWidgetAsUsedRequest.widget_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, markWidgetAsUsedRequest.widget_id) + markWidgetAsUsedRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                MarkWidgetAsUsedRequest markWidgetAsUsedRequest = (MarkWidgetAsUsedRequest) obj;
                markWidgetAsUsedRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = markWidgetAsUsedRequest.widget_id;
                WidgetTemplateType widgetTemplateType = markWidgetAsUsedRequest.widget_type;
                byteString.getClass();
                return new MarkWidgetAsUsedRequest(str, widgetTemplateType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                MarkWidgetAsUsedRequest markWidgetAsUsedRequest = (MarkWidgetAsUsedRequest) obj;
                markWidgetAsUsedRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markWidgetAsUsedRequest.widget_id);
                WidgetTemplateType.ADAPTER.encodeWithTag(protoWriter, 2, markWidgetAsUsedRequest.widget_type);
                protoWriter.writeBytes(markWidgetAsUsedRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkWidgetAsUsedRequest(String str, WidgetTemplateType widgetTemplateType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.widget_id = str;
        this.widget_type = widgetTemplateType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarkWidgetAsUsedRequest)) {
            return false;
        }
        MarkWidgetAsUsedRequest markWidgetAsUsedRequest = (MarkWidgetAsUsedRequest) obj;
        return Intrinsics.areEqual(unknownFields(), markWidgetAsUsedRequest.unknownFields()) && Intrinsics.areEqual(this.widget_id, markWidgetAsUsedRequest.widget_id) && this.widget_type == markWidgetAsUsedRequest.widget_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.widget_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        WidgetTemplateType widgetTemplateType = this.widget_type;
        int hashCode3 = hashCode2 + (widgetTemplateType != null ? widgetTemplateType.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.widget_id = this.widget_id;
        builder.widget_type = this.widget_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.widget_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "widget_id=", arrayList);
        }
        WidgetTemplateType widgetTemplateType = this.widget_type;
        if (widgetTemplateType != null) {
            arrayList.add("widget_type=" + widgetTemplateType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarkWidgetAsUsedRequest{", "}", 0, null, null, 56);
    }
}
