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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "", "title", "Ljava/lang/String;", "description", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetCategory;", "category", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetCategory;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetTemplateInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WidgetTemplateInfo> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WidgetCategory#ADAPTER", schemaIndex = 3, tag = 4)
    public final WidgetCategory category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WidgetTemplateType#ADAPTER", schemaIndex = 0, tag = 1)
    public final WidgetTemplateType type;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateType;", "title", "", "description", "category", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetCategory;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public WidgetCategory category;
        public String description;
        public String title;
        public WidgetTemplateType type;

        @Override // com.squareup.wire.Message.Builder
        public WidgetTemplateInfo build() {
            return new WidgetTemplateInfo(this.type, this.title, this.description, this.category, buildUnknownFields());
        }

        public final Builder category(WidgetCategory category) {
            this.category = category;
            return this;
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder type(WidgetTemplateType type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        WidgetTemplateInfo$Companion$ADAPTER$1 widgetTemplateInfo$Companion$ADAPTER$1 = new WidgetTemplateInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WidgetTemplateInfo.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.WidgetTemplateInfo", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/widget_messages.proto");
        ADAPTER = widgetTemplateInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(widgetTemplateInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetTemplateInfo(WidgetTemplateType widgetTemplateType, String str, String str2, WidgetCategory widgetCategory, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = widgetTemplateType;
        this.title = str;
        this.description = str2;
        this.category = widgetCategory;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WidgetTemplateInfo)) {
            return false;
        }
        WidgetTemplateInfo widgetTemplateInfo = (WidgetTemplateInfo) obj;
        return Intrinsics.areEqual(unknownFields(), widgetTemplateInfo.unknownFields()) && this.type == widgetTemplateInfo.type && Intrinsics.areEqual(this.title, widgetTemplateInfo.title) && Intrinsics.areEqual(this.description, widgetTemplateInfo.description) && this.category == widgetTemplateInfo.category;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        WidgetTemplateType widgetTemplateType = this.type;
        int hashCode2 = (hashCode + (widgetTemplateType != null ? widgetTemplateType.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        WidgetCategory widgetCategory = this.category;
        int hashCode5 = hashCode4 + (widgetCategory != null ? widgetCategory.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.title = this.title;
        builder.description = this.description;
        builder.category = this.category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        WidgetTemplateType widgetTemplateType = this.type;
        if (widgetTemplateType != null) {
            arrayList.add("type=" + widgetTemplateType);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        WidgetCategory widgetCategory = this.category;
        if (widgetCategory != null) {
            arrayList.add("category=" + widgetCategory);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WidgetTemplateInfo{", "}", 0, null, null, 56);
    }
}
