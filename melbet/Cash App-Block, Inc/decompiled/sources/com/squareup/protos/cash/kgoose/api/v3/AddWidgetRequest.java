package com.squareup.protos.cash.kgoose.api.v3;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetRequest$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "widget_config", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddWidgetRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddWidgetRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WidgetConfig#ADAPTER", schemaIndex = 0, tag = 1)
    public final WidgetConfig widget_config;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/AddWidgetRequest;", "<init>", "()V", "widget_config", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public WidgetConfig widget_config;

        @Override // com.squareup.wire.Message.Builder
        public AddWidgetRequest build() {
            return new AddWidgetRequest(this.widget_config, buildUnknownFields());
        }

        public final Builder widget_config(WidgetConfig widget_config) {
            this.widget_config = widget_config;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddWidgetRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.AddWidgetRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AddWidgetRequest((WidgetConfig) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(WidgetConfig.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddWidgetRequest addWidgetRequest = (AddWidgetRequest) obj;
                reverseProtoWriter.getClass();
                addWidgetRequest.getClass();
                reverseProtoWriter.writeBytes(addWidgetRequest.unknownFields());
                WidgetConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addWidgetRequest.widget_config);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddWidgetRequest addWidgetRequest = (AddWidgetRequest) obj;
                addWidgetRequest.getClass();
                return WidgetConfig.ADAPTER.encodedSizeWithTag(1, addWidgetRequest.widget_config) + addWidgetRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddWidgetRequest addWidgetRequest = (AddWidgetRequest) obj;
                addWidgetRequest.getClass();
                WidgetConfig widgetConfig = addWidgetRequest.widget_config;
                WidgetConfig widgetConfig2 = widgetConfig != null ? (WidgetConfig) WidgetConfig.ADAPTER.redact(widgetConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new AddWidgetRequest(widgetConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddWidgetRequest addWidgetRequest = (AddWidgetRequest) obj;
                addWidgetRequest.getClass();
                WidgetConfig.ADAPTER.encodeWithTag(protoWriter, 1, addWidgetRequest.widget_config);
                protoWriter.writeBytes(addWidgetRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWidgetRequest(WidgetConfig widgetConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.widget_config = widgetConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddWidgetRequest)) {
            return false;
        }
        AddWidgetRequest addWidgetRequest = (AddWidgetRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addWidgetRequest.unknownFields()) && Intrinsics.areEqual(this.widget_config, addWidgetRequest.widget_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        WidgetConfig widgetConfig = this.widget_config;
        int hashCode2 = hashCode + (widgetConfig != null ? widgetConfig.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.widget_config = this.widget_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        WidgetConfig widgetConfig = this.widget_config;
        if (widgetConfig != null) {
            arrayList.add("widget_config=" + widgetConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddWidgetRequest{", "}", 0, null, null, 56);
    }
}
