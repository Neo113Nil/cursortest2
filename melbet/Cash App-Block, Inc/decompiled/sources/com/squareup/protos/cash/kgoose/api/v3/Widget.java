package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Widget;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Widget$Builder;", "", "id", "Ljava/lang/String;", "creator", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "template_type", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "", "created_at", "Ljava/lang/Long;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "widget_config", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Widget extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Widget> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 3, tag = 4)
    public final Long created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String creator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WidgetTemplateType#ADAPTER", schemaIndex = 2, tag = 3)
    public final WidgetTemplateType template_type;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WidgetConfig#ADAPTER", schemaIndex = 4, tag = 5)
    public final WidgetConfig widget_config;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Widget$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Widget;", "<init>", "()V", "id", "", "creator", "template_type", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "created_at", "", "Ljava/lang/Long;", "widget_config", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetConfig;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/Widget$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long created_at;
        public String creator;
        public String id;
        public WidgetTemplateType template_type;
        public WidgetConfig widget_config;

        @Override // com.squareup.wire.Message.Builder
        public Widget build() {
            return new Widget(this.id, this.creator, this.template_type, this.created_at, this.widget_config, buildUnknownFields());
        }

        public final Builder created_at(Long created_at) {
            this.created_at = created_at;
            return this;
        }

        public final Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder template_type(WidgetTemplateType template_type) {
            this.template_type = template_type;
            return this;
        }

        public final Builder widget_config(WidgetConfig widget_config) {
            this.widget_config = widget_config;
            return this;
        }
    }

    static {
        Widget$Companion$ADAPTER$1 widget$Companion$ADAPTER$1 = new Widget$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Widget.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Widget", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/widget_messages.proto");
        ADAPTER = widget$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(widget$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Widget(String str, String str2, WidgetTemplateType widgetTemplateType, Long l, WidgetConfig widgetConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.creator = str2;
        this.template_type = widgetTemplateType;
        this.created_at = l;
        this.widget_config = widgetConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Widget)) {
            return false;
        }
        Widget widget = (Widget) obj;
        return Intrinsics.areEqual(unknownFields(), widget.unknownFields()) && Intrinsics.areEqual(this.id, widget.id) && Intrinsics.areEqual(this.creator, widget.creator) && this.template_type == widget.template_type && Intrinsics.areEqual(this.created_at, widget.created_at) && Intrinsics.areEqual(this.widget_config, widget.widget_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.creator;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        WidgetTemplateType widgetTemplateType = this.template_type;
        int hashCode4 = (hashCode3 + (widgetTemplateType != null ? widgetTemplateType.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        WidgetConfig widgetConfig = this.widget_config;
        int hashCode6 = hashCode5 + (widgetConfig != null ? widgetConfig.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.creator = this.creator;
        builder.template_type = this.template_type;
        builder.created_at = this.created_at;
        builder.widget_config = this.widget_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.creator;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "creator=", arrayList);
        }
        WidgetTemplateType widgetTemplateType = this.template_type;
        if (widgetTemplateType != null) {
            arrayList.add("template_type=" + widgetTemplateType);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        WidgetConfig widgetConfig = this.widget_config;
        if (widgetConfig != null) {
            arrayList.add("widget_config=" + widgetConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Widget{", "}", 0, null, null, 56);
    }
}
