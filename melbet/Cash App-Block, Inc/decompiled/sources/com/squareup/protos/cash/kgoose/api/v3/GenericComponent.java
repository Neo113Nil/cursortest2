package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$ComponentId;", "component_id", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$ComponentId;", "getComponent_id$annotations", "()V", "Lcom/squareup/wire/AnyMessage;", "metadata", "Lcom/squareup/wire/AnyMessage;", "getMetadata$annotations", "Companion", "Builder", "ComponentId", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GenericComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenericComponent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.GenericComponent$ComponentId#ADAPTER", schemaIndex = 0, tag = 1)
    public final ComponentId component_id;

    @WireField(adapter = "com.squareup.wire.AnyMessage#ADAPTER", schemaIndex = 1, tag = 2)
    public final AnyMessage metadata;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent;", "<init>", "()V", "component_id", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$ComponentId;", "metadata", "Lcom/squareup/wire/AnyMessage;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ComponentId component_id;
        public AnyMessage metadata;

        @Override // com.squareup.wire.Message.Builder
        public GenericComponent build() {
            return new GenericComponent(this.component_id, this.metadata, buildUnknownFields());
        }

        @Deprecated
        public final Builder component_id(ComponentId component_id) {
            this.component_id = component_id;
            return this;
        }

        @Deprecated
        public final Builder metadata(AnyMessage metadata) {
            this.metadata = metadata;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$ComponentId;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "COMPONENT_UNDEFINED", "COMPONENT_ACTION_CARD", "COMPONENT_BRIEF", "COMPONENT_TEXT_CARD", "COMPONENT_CELL_ACTION_CARD", "COMPONENT_TEMPLATE_CARD", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ComponentId implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ComponentId[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final ComponentId COMPONENT_ACTION_CARD;
        public static final ComponentId COMPONENT_BRIEF;
        public static final ComponentId COMPONENT_CELL_ACTION_CARD;
        public static final ComponentId COMPONENT_TEMPLATE_CARD;
        public static final ComponentId COMPONENT_TEXT_CARD;
        public static final ComponentId COMPONENT_UNDEFINED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$ComponentId$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent$ComponentId;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public static ComponentId fromValue(int i) {
                if (i == 0) {
                    return ComponentId.COMPONENT_UNDEFINED;
                }
                if (i == 1) {
                    return ComponentId.COMPONENT_ACTION_CARD;
                }
                if (i == 2) {
                    return ComponentId.COMPONENT_BRIEF;
                }
                if (i == 3) {
                    return ComponentId.COMPONENT_TEXT_CARD;
                }
                if (i == 4) {
                    return ComponentId.COMPONENT_CELL_ACTION_CARD;
                }
                if (i != 5) {
                    return null;
                }
                return ComponentId.COMPONENT_TEMPLATE_CARD;
            }
        }

        static {
            ComponentId componentId = new ComponentId("COMPONENT_UNDEFINED", 0, 0);
            COMPONENT_UNDEFINED = componentId;
            ComponentId componentId2 = new ComponentId("COMPONENT_ACTION_CARD", 1, 1);
            COMPONENT_ACTION_CARD = componentId2;
            ComponentId componentId3 = new ComponentId("COMPONENT_BRIEF", 2, 2);
            COMPONENT_BRIEF = componentId3;
            ComponentId componentId4 = new ComponentId("COMPONENT_TEXT_CARD", 3, 3);
            COMPONENT_TEXT_CARD = componentId4;
            ComponentId componentId5 = new ComponentId("COMPONENT_CELL_ACTION_CARD", 4, 4);
            COMPONENT_CELL_ACTION_CARD = componentId5;
            ComponentId componentId6 = new ComponentId("COMPONENT_TEMPLATE_CARD", 5, 5);
            COMPONENT_TEMPLATE_CARD = componentId6;
            ComponentId[] componentIdArr = {componentId, componentId2, componentId3, componentId4, componentId5, componentId6};
            $VALUES = componentIdArr;
            $ENTRIES = new EnumEntriesList(componentIdArr);
            INSTANCE = new Companion();
            ADAPTER = new GenericComponent$ComponentId$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ComponentId.class), Syntax.PROTO_2, componentId);
        }

        public ComponentId(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ComponentId fromValue(int i) {
            INSTANCE.getClass();
            return Companion.fromValue(i);
        }

        public static ComponentId valueOf(String str) {
            return (ComponentId) Enum.valueOf(ComponentId.class, str);
        }

        public static ComponentId[] values() {
            return (ComponentId[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GenericComponent$Companion$ADAPTER$1 genericComponent$Companion$ADAPTER$1 = new GenericComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GenericComponent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GenericComponent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = genericComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(genericComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericComponent(ComponentId componentId, AnyMessage anyMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.component_id = componentId;
        this.metadata = anyMessage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenericComponent)) {
            return false;
        }
        GenericComponent genericComponent = (GenericComponent) obj;
        return Intrinsics.areEqual(unknownFields(), genericComponent.unknownFields()) && this.component_id == genericComponent.component_id && Intrinsics.areEqual(this.metadata, genericComponent.metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ComponentId componentId = this.component_id;
        int hashCode2 = (hashCode + (componentId != null ? componentId.hashCode() : 0)) * 37;
        AnyMessage anyMessage = this.metadata;
        int hashCode3 = hashCode2 + (anyMessage != null ? anyMessage.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.component_id = this.component_id;
        builder.metadata = this.metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ComponentId componentId = this.component_id;
        if (componentId != null) {
            arrayList.add("component_id=" + componentId);
        }
        AnyMessage anyMessage = this.metadata;
        if (anyMessage != null) {
            arrayList.add("metadata=" + anyMessage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenericComponent{", "}", 0, null, null, 56);
    }
}
