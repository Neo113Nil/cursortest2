package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import squareup.cash.ui.arcade.elements.ListOrdered;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u000b\n\f\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ListOrdered$Builder;", "Lsquareup/cash/ui/arcade/elements/ListOrdered$Variant;", "variant", "Lsquareup/cash/ui/arcade/elements/ListOrdered$Variant;", "", "Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem;", "items", "Ljava/util/List;", "Companion", "Builder", "ListItem", "Variant", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ListOrdered extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListOrdered> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ListOrdered$ListItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ListItem> items;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ListOrdered$Variant#ADAPTER", schemaIndex = 1, tag = 2)
    public final Variant variant;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ListOrdered;", "<init>", "()V", "items", "", "Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem;", "variant", "Lsquareup/cash/ui/arcade/elements/ListOrdered$Variant;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ListItem> items = EmptyList.INSTANCE;
        public Variant variant;

        @Override // com.squareup.wire.Message.Builder
        public ListOrdered build() {
            return new ListOrdered(this.items, this.variant, buildUnknownFields());
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
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListOrdered.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ListOrdered$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ListOrdered decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ListOrdered(m, (ListOrdered.Variant) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ListOrdered.ListItem.ADAPTER.decode(reader));
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj = ListOrdered.Variant.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListOrdered value) {
                writer.getClass();
                value.getClass();
                ListOrdered.ListItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
                ListOrdered.Variant.ADAPTER.encodeWithTag(writer, 2, value.variant);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListOrdered value) {
                value.getClass();
                return ListOrdered.Variant.ADAPTER.encodedSizeWithTag(2, value.variant) + ListOrdered.ListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.items) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListOrdered redact(ListOrdered value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.items, ListOrdered.ListItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                ListOrdered.Variant variant = value.variant;
                byteString.getClass();
                return new ListOrdered(m1169redactElements, variant, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListOrdered value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ListOrdered.Variant.ADAPTER.encodeWithTag(writer, 2, value.variant);
                ListOrdered.ListItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListOrdered(List list, Variant variant, ByteString byteString) {
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
        if (!(obj instanceof ListOrdered)) {
            return false;
        }
        ListOrdered listOrdered = (ListOrdered) obj;
        return Intrinsics.areEqual(unknownFields(), listOrdered.unknownFields()) && Intrinsics.areEqual(this.items, listOrdered.items) && this.variant == listOrdered.variant;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListOrdered{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem$Builder;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "body", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ListItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ListItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString body;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString label;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "body", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString body;
            public LocalizedString label;

            public final Builder body(LocalizedString body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ListItem build() {
                return new ListItem(this.label, this.body, buildUnknownFields());
            }

            public final Builder label(LocalizedString label) {
                this.label = label;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ListOrdered$ListItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ListOrdered.ListItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ListOrdered.ListItem((LocalizedString) obj, (LocalizedString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ListOrdered.ListItem value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ListOrdered.ListItem value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ListOrdered.ListItem redact(ListOrdered.ListItem value) {
                    value.getClass();
                    LocalizedString localizedString = value.label;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.body;
                    return value.copy(localizedString2, localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ListOrdered.ListItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ListItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ListItem copy$default(ListItem listItem, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = listItem.label;
            }
            if ((i & 2) != 0) {
                localizedString2 = listItem.body;
            }
            if ((i & 4) != 0) {
                byteString = listItem.unknownFields();
            }
            return listItem.copy(localizedString, localizedString2, byteString);
        }

        public final ListItem copy(LocalizedString label, LocalizedString body, ByteString unknownFields) {
            unknownFields.getClass();
            return new ListItem(label, body, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ListItem)) {
                return false;
            }
            ListItem listItem = (ListItem) other;
            return Intrinsics.areEqual(unknownFields(), listItem.unknownFields()) && Intrinsics.areEqual(this.label, listItem.label) && Intrinsics.areEqual(this.body, listItem.body);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.label;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.body;
            int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.body = this.body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.label;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.body;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ListItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ListOrdered$ListItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = localizedString;
            this.body = localizedString2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered$Variant;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_COULD_NOT_PARSE_LIST_ORDERED_VARIANT", "STANDARD", "SUBTLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, variant) { // from class: squareup.cash.ui.arcade.elements.ListOrdered$Variant$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ListOrdered.Variant fromValue(int value) {
                    return ListOrdered.Variant.INSTANCE.fromValue(value);
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

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered$Variant$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/ui/arcade/elements/ListOrdered$Variant;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ListOrdered$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ListOrdered$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ListOrdered;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ListOrdered;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ListOrdered build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
