package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import squareup.cash.ui.arcade.elements.ListUnordered;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000b\n\f\r\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$Builder;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$Variant;", "variant", "Lsquareup/cash/ui/arcade/elements/ListUnordered$Variant;", "", "Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem;", "items", "Ljava/util/List;", "Companion", "Builder", "ListItem", "Variant", "Size", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ListUnordered extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListUnordered> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ListUnordered$ListItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ListItem> items;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ListUnordered$Variant#ADAPTER", schemaIndex = 1, tag = 2)
    public final Variant variant;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "<init>", "()V", "items", "", "Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem;", "variant", "Lsquareup/cash/ui/arcade/elements/ListUnordered$Variant;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ListItem> items = EmptyList.INSTANCE;
        public Variant variant;

        @Override // com.squareup.wire.Message.Builder
        public ListUnordered build() {
            return new ListUnordered(this.items, this.variant, buildUnknownFields());
        }

        public final Builder items(List<ListItem> items) {
            items.getClass();
            TransactorKt.checkElementsNotNull(items);
            this.items = items;
            return this;
        }

        public final Builder variant(Variant variant) {
            this.variant = variant;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListUnordered.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ListUnordered$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ListUnordered decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ListUnordered(m, (ListUnordered.Variant) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ListUnordered.ListItem.ADAPTER.decode(reader));
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj = ListUnordered.Variant.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListUnordered value) {
                writer.getClass();
                value.getClass();
                ListUnordered.ListItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
                ListUnordered.Variant.ADAPTER.encodeWithTag(writer, 2, value.variant);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListUnordered value) {
                value.getClass();
                return ListUnordered.Variant.ADAPTER.encodedSizeWithTag(2, value.variant) + ListUnordered.ListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.items) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListUnordered redact(ListUnordered value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.items, ListUnordered.ListItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                ListUnordered.Variant variant = value.variant;
                byteString.getClass();
                return new ListUnordered(m1169redactElements, variant, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListUnordered value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ListUnordered.Variant.ADAPTER.encodeWithTag(writer, 2, value.variant);
                ListUnordered.ListItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListUnordered(List list, Variant variant, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.variant = variant;
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListUnordered)) {
            return false;
        }
        ListUnordered listUnordered = (ListUnordered) obj;
        return Intrinsics.areEqual(unknownFields(), listUnordered.unknownFields()) && Intrinsics.areEqual(this.items, listUnordered.items) && this.variant == listUnordered.variant;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.items);
        Variant variant = this.variant;
        int hashCode = m + (variant != null ? variant.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.items = this.items;
        builder.variant = this.variant;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
        }
        Variant variant = this.variant;
        if (variant != null) {
            arrayList.add("variant=" + variant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListUnordered{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem$Builder;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "value", "body", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ListItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ListItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString body;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon icon;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString label;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizedString value;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem;", "<init>", "()V", "icon", "Lcom/squareup/protos/cash/ui/Icon;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "value", "body", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString body;
            public Icon icon;
            public LocalizedString label;
            public LocalizedString value;

            public final Builder body(LocalizedString body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ListItem build() {
                return new ListItem(this.icon, this.label, this.value, this.body, buildUnknownFields());
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder label(LocalizedString label) {
                this.label = label;
                return this;
            }

            public final Builder value(LocalizedString value) {
                this.value = value;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ListUnordered$ListItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ListUnordered.ListItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ListUnordered.ListItem((Icon) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ListUnordered.ListItem value) {
                    writer.getClass();
                    value.getClass();
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.label);
                    protoAdapter2.encodeWithTag(writer, 3, value.value);
                    protoAdapter2.encodeWithTag(writer, 4, value.body);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ListUnordered.ListItem value) {
                    value.getClass();
                    int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(4, value.body) + protoAdapter2.encodedSizeWithTag(3, value.value) + protoAdapter2.encodedSizeWithTag(2, value.label) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ListUnordered.ListItem redact(ListUnordered.ListItem value) {
                    value.getClass();
                    Icon icon = value.icon;
                    Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                    LocalizedString localizedString = value.label;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.value;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    LocalizedString localizedString5 = value.body;
                    return value.copy(icon2, localizedString2, localizedString4, localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ListUnordered.ListItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 4, value.body);
                    protoAdapter2.encodeWithTag(writer, 3, value.value);
                    protoAdapter2.encodeWithTag(writer, 2, value.label);
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ListItem(Icon icon, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? null : localizedString2, (i & 8) != 0 ? null : localizedString3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ListItem copy$default(ListItem listItem, Icon icon, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = listItem.icon;
            }
            if ((i & 2) != 0) {
                localizedString = listItem.label;
            }
            if ((i & 4) != 0) {
                localizedString2 = listItem.value;
            }
            if ((i & 8) != 0) {
                localizedString3 = listItem.body;
            }
            if ((i & 16) != 0) {
                byteString = listItem.unknownFields();
            }
            ByteString byteString2 = byteString;
            LocalizedString localizedString4 = localizedString2;
            return listItem.copy(icon, localizedString, localizedString4, localizedString3, byteString2);
        }

        public final ListItem copy(Icon icon, LocalizedString label, LocalizedString value, LocalizedString body, ByteString unknownFields) {
            unknownFields.getClass();
            return new ListItem(icon, label, value, body, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ListItem)) {
                return false;
            }
            ListItem listItem = (ListItem) other;
            return Intrinsics.areEqual(unknownFields(), listItem.unknownFields()) && Intrinsics.areEqual(this.icon, listItem.icon) && Intrinsics.areEqual(this.label, listItem.label) && Intrinsics.areEqual(this.value, listItem.value) && Intrinsics.areEqual(this.body, listItem.body);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.label;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.value;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.body;
            int hashCode5 = hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.label = this.label;
            builder.value = this.value;
            builder.body = this.body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            LocalizedString localizedString = this.label;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.value;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("value=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.body;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ListItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ListUnordered$ListItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ListItem build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ListItem() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListItem(Icon icon, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.label = localizedString;
            this.value = localizedString2;
            this.body = localizedString3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$Size;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_COULD_NOT_PARSE_LIST_UNORDERED_SIZE", "COMPACT", "LARGE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Size implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Size CLIENT_COULD_NOT_PARSE_LIST_UNORDERED_SIZE;
        public static final Size COMPACT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Size LARGE;
        private final int value;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{CLIENT_COULD_NOT_PARSE_LIST_UNORDERED_SIZE, COMPACT, LARGE};
        }

        static {
            final Size size = new Size("CLIENT_COULD_NOT_PARSE_LIST_UNORDERED_SIZE", 0, 0);
            CLIENT_COULD_NOT_PARSE_LIST_UNORDERED_SIZE = size;
            COMPACT = new Size("COMPACT", 1, 1);
            LARGE = new Size("LARGE", 2, 2);
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Size.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, size) { // from class: squareup.cash.ui.arcade.elements.ListUnordered$Size$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ListUnordered.Size fromValue(int value) {
                    return ListUnordered.Size.INSTANCE.fromValue(value);
                }
            };
        }

        private Size(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Size fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$Size$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$Size;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Size fromValue(int value) {
                if (value == 0) {
                    return Size.CLIENT_COULD_NOT_PARSE_LIST_UNORDERED_SIZE;
                }
                if (value == 1) {
                    return Size.COMPACT;
                }
                if (value != 2) {
                    return null;
                }
                return Size.LARGE;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$Variant;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT", "STANDARD", "SUBTLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Variant implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Variant CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Variant STANDARD;
        public static final Variant SUBTLE;
        private final int value;

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT, STANDARD, SUBTLE};
        }

        static {
            final Variant variant = new Variant("CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT", 0, 0);
            CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT = variant;
            STANDARD = new Variant("STANDARD", 1, 1);
            SUBTLE = new Variant("SUBTLE", 2, 2);
            Variant[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Variant.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, variant) { // from class: squareup.cash.ui.arcade.elements.ListUnordered$Variant$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ListUnordered.Variant fromValue(int value) {
                    return ListUnordered.Variant.INSTANCE.fromValue(value);
                }
            };
        }

        private Variant(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Variant fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$Variant$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$Variant;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Variant fromValue(int value) {
                if (value == 0) {
                    return Variant.CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT;
                }
                if (value == 1) {
                    return Variant.STANDARD;
                }
                if (value != 2) {
                    return null;
                }
                return Variant.SUBTLE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListUnordered$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ListUnordered$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ListUnordered;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ListUnordered build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public ListUnordered(List list, Variant variant, int i) {
        this(list, (i & 2) != 0 ? null : variant, ByteString.EMPTY);
    }
}
