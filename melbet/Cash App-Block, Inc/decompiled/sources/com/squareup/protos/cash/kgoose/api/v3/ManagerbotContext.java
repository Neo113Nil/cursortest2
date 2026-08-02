package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\t\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$Builder;", "", "immediate_execution", "Ljava/lang/Boolean;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo;", "evergreen_metrics_info", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo;", "Companion", "Builder", "EvergreenMetricsInfo", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ManagerbotContext> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ManagerbotContext$EvergreenMetricsInfo#ADAPTER", schemaIndex = 1, tag = 2)
    public final EvergreenMetricsInfo evergreen_metrics_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean immediate_execution;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext;", "<init>", "()V", "immediate_execution", "", "Ljava/lang/Boolean;", "evergreen_metrics_info", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public EvergreenMetricsInfo evergreen_metrics_info;
        public Boolean immediate_execution;

        @Override // com.squareup.wire.Message.Builder
        public ManagerbotContext build() {
            return new ManagerbotContext(this.immediate_execution, this.evergreen_metrics_info, buildUnknownFields());
        }

        public final Builder evergreen_metrics_info(EvergreenMetricsInfo evergreen_metrics_info) {
            this.evergreen_metrics_info = evergreen_metrics_info;
            return this;
        }

        public final Builder immediate_execution(Boolean immediate_execution) {
            this.immediate_execution = immediate_execution;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo$Builder;", "", "id", "Ljava/lang/String;", "description", "", "Lcom/squareup/protos/cash/kgoose/api/v3/DataAttribute;", "data_attributes", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EvergreenMetricsInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EvergreenMetricsInfo> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.DataAttribute#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final Map<String, DataAttribute> data_attributes;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String description;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String id;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo;", "<init>", "()V", "id", "", "description", "data_attributes", "", "Lcom/squareup/protos/cash/kgoose/api/v3/DataAttribute;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Map<String, DataAttribute> data_attributes;
            public String description;
            public String id;

            public Builder() {
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.data_attributes = emptyMap;
            }

            @Override // com.squareup.wire.Message.Builder
            public EvergreenMetricsInfo build() {
                return new EvergreenMetricsInfo(this.id, this.description, this.data_attributes, buildUnknownFields());
            }

            public final Builder data_attributes(Map<String, DataAttribute> data_attributes) {
                data_attributes.getClass();
                this.data_attributes = data_attributes;
                return this;
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }
        }

        static {
            FieldEncoding fieldEncoding = FieldEncoding.VARINT;
            KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EvergreenMetricsInfo.class);
            Syntax syntax = Syntax.PROTO_2;
            ManagerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1 managerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1 = new ManagerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1(orCreateKotlinClass);
            ADAPTER = managerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(managerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EvergreenMetricsInfo(String str, String str2, Map map, ByteString byteString) {
            super(ADAPTER, byteString);
            map.getClass();
            byteString.getClass();
            this.id = str;
            this.description = str2;
            this.data_attributes = TransactorKt.immutableCopyOf("data_attributes", map);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvergreenMetricsInfo)) {
                return false;
            }
            EvergreenMetricsInfo evergreenMetricsInfo = (EvergreenMetricsInfo) obj;
            return Intrinsics.areEqual(unknownFields(), evergreenMetricsInfo.unknownFields()) && Intrinsics.areEqual(this.id, evergreenMetricsInfo.id) && Intrinsics.areEqual(this.description, evergreenMetricsInfo.description) && Intrinsics.areEqual(this.data_attributes, evergreenMetricsInfo.data_attributes);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = this.data_attributes.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.id = this.id;
            builder.description = this.description;
            builder.data_attributes = this.data_attributes;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            if (!this.data_attributes.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("data_attributes=", this.data_attributes, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EvergreenMetricsInfo{", "}", 0, null, null, 56);
        }
    }

    static {
        ManagerbotContext$Companion$ADAPTER$1 managerbotContext$Companion$ADAPTER$1 = new ManagerbotContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ManagerbotContext.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ManagerbotContext", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = managerbotContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(managerbotContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagerbotContext(Boolean bool, EvergreenMetricsInfo evergreenMetricsInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.immediate_execution = bool;
        this.evergreen_metrics_info = evergreenMetricsInfo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ManagerbotContext)) {
            return false;
        }
        ManagerbotContext managerbotContext = (ManagerbotContext) obj;
        return Intrinsics.areEqual(unknownFields(), managerbotContext.unknownFields()) && Intrinsics.areEqual(this.immediate_execution, managerbotContext.immediate_execution) && Intrinsics.areEqual(this.evergreen_metrics_info, managerbotContext.evergreen_metrics_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.immediate_execution;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        EvergreenMetricsInfo evergreenMetricsInfo = this.evergreen_metrics_info;
        int hashCode3 = hashCode2 + (evergreenMetricsInfo != null ? evergreenMetricsInfo.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.immediate_execution = this.immediate_execution;
        builder.evergreen_metrics_info = this.evergreen_metrics_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.immediate_execution;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("immediate_execution=", bool, arrayList);
        }
        EvergreenMetricsInfo evergreenMetricsInfo = this.evergreen_metrics_info;
        if (evergreenMetricsInfo != null) {
            arrayList.add("evergreen_metrics_info=" + evergreenMetricsInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagerbotContext{", "}", 0, null, null, 56);
    }
}
