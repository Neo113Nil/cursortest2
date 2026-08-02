package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u000e\r\u000f\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$Builder;", "", "title", "Ljava/lang/String;", "", "hidden", "Ljava/lang/Boolean;", "", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem;", "items", "Ljava/util/List;", "Companion", "Builder", "ToolbarItemType", "ToolbarItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxWebBridgeConfigureToolbarEventRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TaxWebBridgeConfigureToolbarEventRequest> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean hidden;

    @WireField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ToolbarItem> items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest;", "<init>", "()V", "items", "", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem;", "title", "", "hidden", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean hidden;
        public List<ToolbarItem> items = EmptyList.INSTANCE;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public TaxWebBridgeConfigureToolbarEventRequest build() {
            List<ToolbarItem> list = this.items;
            return new TaxWebBridgeConfigureToolbarEventRequest(this.hidden, this.title, list, buildUnknownFields());
        }

        public final Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public final Builder items(List<ToolbarItem> items) {
            items.getClass();
            TransactorKt.checkElementsNotNull(items);
            this.items = items;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxWebBridgeConfigureToolbarEventRequest.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeConfigureToolbarEventRequest decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TaxWebBridgeConfigureToolbarEventRequest((Boolean) obj2, (String) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxWebBridgeConfigureToolbarEventRequest value) {
                writer.getClass();
                value.getClass();
                TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.title);
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.hidden);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxWebBridgeConfigureToolbarEventRequest value) {
                value.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, value.hidden) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.title) + TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.items) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeConfigureToolbarEventRequest redact(TaxWebBridgeConfigureToolbarEventRequest value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.items, TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                Boolean bool = value.hidden;
                byteString.getClass();
                return new TaxWebBridgeConfigureToolbarEventRequest(bool, str, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxWebBridgeConfigureToolbarEventRequest value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.hidden);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.title);
                TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeConfigureToolbarEventRequest(Boolean bool, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.hidden = bool;
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxWebBridgeConfigureToolbarEventRequest)) {
            return false;
        }
        TaxWebBridgeConfigureToolbarEventRequest taxWebBridgeConfigureToolbarEventRequest = (TaxWebBridgeConfigureToolbarEventRequest) obj;
        return Intrinsics.areEqual(unknownFields(), taxWebBridgeConfigureToolbarEventRequest.unknownFields()) && Intrinsics.areEqual(this.items, taxWebBridgeConfigureToolbarEventRequest.items) && Intrinsics.areEqual(this.title, taxWebBridgeConfigureToolbarEventRequest.title) && Intrinsics.areEqual(this.hidden, taxWebBridgeConfigureToolbarEventRequest.hidden);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.items);
        String str = this.title;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.hidden;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.items = this.items;
        builder.title = this.title;
        builder.hidden = this.hidden;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        Boolean bool = this.hidden;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hidden=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxWebBridgeConfigureToolbarEventRequest{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem$Builder;", "type", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ToolbarItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ToolbarItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType#ADAPTER", schemaIndex = 0, tag = 1)
        public final ToolbarItemType type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ToolbarItemType type;

            @Override // com.squareup.wire.Message.Builder
            public ToolbarItem build() {
                return new ToolbarItem(this.type, buildUnknownFields());
            }

            public final Builder type(ToolbarItemType type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ToolbarItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem((TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem value) {
                    writer.getClass();
                    value.getClass();
                    TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.encodeWithTag(writer, 1, value.type);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem value) {
                    value.getClass();
                    return TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.encodedSizeWithTag(1, value.type) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem redact(TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem value) {
                    value.getClass();
                    return TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TaxWebBridgeConfigureToolbarEventRequest.ToolbarItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.encodeWithTag(writer, 1, value.type);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ToolbarItem(ToolbarItemType toolbarItemType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : toolbarItemType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ToolbarItem copy$default(ToolbarItem toolbarItem, ToolbarItemType toolbarItemType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                toolbarItemType = toolbarItem.type;
            }
            if ((i & 2) != 0) {
                byteString = toolbarItem.unknownFields();
            }
            return toolbarItem.copy(toolbarItemType, byteString);
        }

        public final ToolbarItem copy(ToolbarItemType type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new ToolbarItem(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ToolbarItem)) {
                return false;
            }
            ToolbarItem toolbarItem = (ToolbarItem) other;
            return Intrinsics.areEqual(unknownFields(), toolbarItem.unknownFields()) && this.type == toolbarItem.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ToolbarItemType toolbarItemType = this.type;
            int hashCode2 = hashCode + (toolbarItemType != null ? toolbarItemType.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            ToolbarItemType toolbarItemType = this.type;
            if (toolbarItemType != null) {
                arrayList.add("type=" + toolbarItemType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ToolbarItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem$Builder;", "", "body", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ToolbarItem build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ToolbarItem() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToolbarItem(ToolbarItemType toolbarItemType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = toolbarItemType;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BACK", "HELP", "MENU", "CLOSE", "DESKTOP", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ToolbarItemType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ToolbarItemType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final ToolbarItemType BACK = new ToolbarItemType("BACK", 0, 1);
        public static final ToolbarItemType HELP = new ToolbarItemType("HELP", 1, 2);
        public static final ToolbarItemType MENU = new ToolbarItemType("MENU", 2, 3);
        public static final ToolbarItemType CLOSE = new ToolbarItemType("CLOSE", 3, 4);
        public static final ToolbarItemType DESKTOP = new ToolbarItemType("DESKTOP", 4, 5);

        private static final /* synthetic */ ToolbarItemType[] $values() {
            return new ToolbarItemType[]{BACK, HELP, MENU, CLOSE, DESKTOP};
        }

        static {
            ToolbarItemType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ToolbarItemType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType fromValue(int value) {
                    return TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.INSTANCE.fromValue(value);
                }
            };
        }

        private ToolbarItemType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ToolbarItemType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ToolbarItemType valueOf(String str) {
            return (ToolbarItemType) Enum.valueOf(ToolbarItemType.class, str);
        }

        public static ToolbarItemType[] values() {
            return (ToolbarItemType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ToolbarItemType fromValue(int value) {
                if (value == 1) {
                    return ToolbarItemType.BACK;
                }
                if (value == 2) {
                    return ToolbarItemType.HELP;
                }
                if (value == 3) {
                    return ToolbarItemType.MENU;
                }
                if (value == 4) {
                    return ToolbarItemType.CLOSE;
                }
                if (value != 5) {
                    return null;
                }
                return ToolbarItemType.DESKTOP;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$Builder;", "", "body", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TaxWebBridgeConfigureToolbarEventRequest build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
