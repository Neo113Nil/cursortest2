package com.squareup.protos.cash.money.elements;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0010\u000f\u0011\u0012\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/elements/BookletTile$Builder;", "", "tile_name", "Ljava/lang/String;", "Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent;", "static_content", "Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent;", "Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType;", "content_type", "Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType;", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent;", "grid_content", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent;", "Companion", "Builder", "ContentType", "StaticContent", "GridContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BookletTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BookletTile> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ContentType DEFAULT_CONTENT_TYPE = ContentType.CONTENT_TYPE_UNKNOWN;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.money.elements.BookletTile$ContentType#ADAPTER", schemaIndex = 2, tag = 3)
    public final ContentType content_type;

    @WireField(adapter = "com.squareup.protos.cash.money.elements.BookletTile$GridContent#ADAPTER", schemaIndex = 3, tag = 4)
    public final GridContent grid_content;

    @WireField(adapter = "com.squareup.protos.cash.money.elements.BookletTile$StaticContent#ADAPTER", schemaIndex = 1, tag = 2)
    public final StaticContent static_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String tile_name;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/money/elements/BookletTile;", "<init>", "()V", "tile_name", "", "static_content", "Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent;", "content_type", "Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType;", "grid_content", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ContentType content_type;
        public GridContent grid_content;
        public StaticContent static_content;
        public String tile_name;

        @Override // com.squareup.wire.Message.Builder
        public BookletTile build() {
            return new BookletTile(this.tile_name, this.static_content, this.content_type, this.grid_content, buildUnknownFields());
        }

        public final Builder content_type(ContentType content_type) {
            this.content_type = content_type;
            return this;
        }

        public final Builder grid_content(GridContent grid_content) {
            this.grid_content = grid_content;
            return this;
        }

        public final Builder static_content(StaticContent static_content) {
            this.static_content = static_content;
            return this;
        }

        public final Builder tile_name(String tile_name) {
            this.tile_name = tile_name;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J,\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$Builder;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "grid_items", "", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "GridItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GridContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GridContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.money.elements.BookletTile$GridContent$GridItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<GridItem> grid_items;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString title_text;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent;", "<init>", "()V", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "grid_items", "", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<GridItem> grid_items = EmptyList.INSTANCE;
            public LocalizedString title_text;

            @Override // com.squareup.wire.Message.Builder
            public GridContent build() {
                return new GridContent(this.title_text, this.grid_items, buildUnknownFields());
            }

            public final Builder grid_items(List<GridItem> grid_items) {
                grid_items.getClass();
                TransactorKt.checkElementsNotNull(grid_items);
                this.grid_items = grid_items;
                return this;
            }

            public final Builder title_text(LocalizedString title_text) {
                this.title_text = title_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GridContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.money.elements.BookletTile$GridContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BookletTile.GridContent decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BookletTile.GridContent((LocalizedString) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(BookletTile.GridContent.GridItem.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BookletTile.GridContent value) {
                    writer.getClass();
                    value.getClass();
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.title_text);
                    BookletTile.GridContent.GridItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.grid_items);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BookletTile.GridContent value) {
                    value.getClass();
                    return BookletTile.GridContent.GridItem.ADAPTER.asRepeated().encodedSizeWithTag(2, value.grid_items) + LocalizedString.ADAPTER.encodedSizeWithTag(1, value.title_text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BookletTile.GridContent redact(BookletTile.GridContent value) {
                    value.getClass();
                    LocalizedString localizedString = value.title_text;
                    return value.copy(localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, TransactorKt.m1169redactElements(value.grid_items, BookletTile.GridContent.GridItem.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BookletTile.GridContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BookletTile.GridContent.GridItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.grid_items);
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.title_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GridContent(LocalizedString localizedString, List<GridItem> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title_text = localizedString;
            this.grid_items = TransactorKt.immutableCopyOf("grid_items", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GridContent copy$default(GridContent gridContent, LocalizedString localizedString, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = gridContent.title_text;
            }
            if ((i & 2) != 0) {
                list = gridContent.grid_items;
            }
            if ((i & 4) != 0) {
                byteString = gridContent.unknownFields();
            }
            return gridContent.copy(localizedString, list, byteString);
        }

        public final GridContent copy(LocalizedString title_text, List<GridItem> grid_items, ByteString unknownFields) {
            grid_items.getClass();
            unknownFields.getClass();
            return new GridContent(title_text, grid_items, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof GridContent)) {
                return false;
            }
            GridContent gridContent = (GridContent) other;
            return Intrinsics.areEqual(unknownFields(), gridContent.unknownFields()) && Intrinsics.areEqual(this.title_text, gridContent.title_text) && Intrinsics.areEqual(this.grid_items, gridContent.grid_items);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title_text;
            int hashCode2 = this.grid_items.hashCode() + ((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title_text = this.title_text;
            builder.grid_items = this.grid_items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
            }
            if (!this.grid_items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("grid_items=", arrayList, this.grid_items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GridContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem$Builder;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "detail_text", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/ui/Icon;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class GridItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<GridItem> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
            public final LocalizedString detail_text;

            @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 2, tag = 3)
            public final Icon icon;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString title_text;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem;", "<init>", "()V", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "detail_text", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public LocalizedString detail_text;
                public Icon icon;
                public LocalizedString title_text;

                @Override // com.squareup.wire.Message.Builder
                public GridItem build() {
                    return new GridItem(this.title_text, this.detail_text, this.icon, buildUnknownFields());
                }

                public final Builder detail_text(LocalizedString detail_text) {
                    this.detail_text = detail_text;
                    return this;
                }

                public final Builder icon(Icon icon) {
                    this.icon = icon;
                    return this;
                }

                public final Builder title_text(LocalizedString title_text) {
                    this.title_text = title_text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GridItem.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.money.elements.BookletTile$GridContent$GridItem$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BookletTile.GridContent.GridItem decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BookletTile.GridContent.GridItem((LocalizedString) obj, (LocalizedString) obj2, (Icon) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj3);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BookletTile.GridContent.GridItem value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                        protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                        Icon.ADAPTER.encodeWithTag(writer, 3, value.icon);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BookletTile.GridContent.GridItem value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        return Icon.ADAPTER.encodedSizeWithTag(3, value.icon) + protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BookletTile.GridContent.GridItem redact(BookletTile.GridContent.GridItem value) {
                        value.getClass();
                        LocalizedString localizedString = value.title_text;
                        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                        LocalizedString localizedString3 = value.detail_text;
                        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                        Icon icon = value.icon;
                        return value.copy(localizedString2, localizedString4, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BookletTile.GridContent.GridItem value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        Icon.ADAPTER.encodeWithTag(writer, 3, value.icon);
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                        protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ GridItem(LocalizedString localizedString, LocalizedString localizedString2, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ GridItem copy$default(GridItem gridItem, LocalizedString localizedString, LocalizedString localizedString2, Icon icon, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = gridItem.title_text;
                }
                if ((i & 2) != 0) {
                    localizedString2 = gridItem.detail_text;
                }
                if ((i & 4) != 0) {
                    icon = gridItem.icon;
                }
                if ((i & 8) != 0) {
                    byteString = gridItem.unknownFields();
                }
                return gridItem.copy(localizedString, localizedString2, icon, byteString);
            }

            public final GridItem copy(LocalizedString title_text, LocalizedString detail_text, Icon icon, ByteString unknownFields) {
                unknownFields.getClass();
                return new GridItem(title_text, detail_text, icon, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof GridItem)) {
                    return false;
                }
                GridItem gridItem = (GridItem) other;
                return Intrinsics.areEqual(unknownFields(), gridItem.unknownFields()) && Intrinsics.areEqual(this.title_text, gridItem.title_text) && Intrinsics.areEqual(this.detail_text, gridItem.detail_text) && Intrinsics.areEqual(this.icon, gridItem.icon);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.detail_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode4 = hashCode3 + (icon != null ? icon.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title_text = this.title_text;
                builder.detail_text = this.detail_text;
                builder.icon = this.icon;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.detail_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("detail_text=", localizedString2, arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "GridItem{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem$Builder;", "", "body", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$GridItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ GridItem build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public GridItem() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GridItem(LocalizedString localizedString, LocalizedString localizedString2, Icon icon, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title_text = localizedString;
                this.detail_text = localizedString2;
                this.icon = icon;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent$Builder;", "", "body", "Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/money/elements/BookletTile$GridContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ GridContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public GridContent(LocalizedString localizedString, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public GridContent() {
            this(null, null, null, 7, null);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BookletTile.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.money.elements.BookletTile$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BookletTile decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BookletTile((String) obj, (BookletTile.StaticContent) obj2, (BookletTile.ContentType) obj3, (BookletTile.GridContent) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(BookletTile.StaticContent.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        try {
                            obj3 = BookletTile.ContentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(BookletTile.GridContent.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BookletTile value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.tile_name);
                BookletTile.StaticContent.ADAPTER.encodeWithTag(writer, 2, value.static_content);
                BookletTile.ContentType.ADAPTER.encodeWithTag(writer, 3, value.content_type);
                BookletTile.GridContent.ADAPTER.encodeWithTag(writer, 4, value.grid_content);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BookletTile value) {
                value.getClass();
                return BookletTile.GridContent.ADAPTER.encodedSizeWithTag(4, value.grid_content) + BookletTile.ContentType.ADAPTER.encodedSizeWithTag(3, value.content_type) + BookletTile.StaticContent.ADAPTER.encodedSizeWithTag(2, value.static_content) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.tile_name) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BookletTile redact(BookletTile value) {
                value.getClass();
                BookletTile.StaticContent staticContent = value.static_content;
                BookletTile.StaticContent staticContent2 = staticContent != null ? (BookletTile.StaticContent) BookletTile.StaticContent.ADAPTER.redact(staticContent) : null;
                BookletTile.GridContent gridContent = value.grid_content;
                BookletTile.GridContent gridContent2 = gridContent != null ? (BookletTile.GridContent) BookletTile.GridContent.ADAPTER.redact(gridContent) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.tile_name;
                BookletTile.ContentType contentType = value.content_type;
                byteString.getClass();
                return new BookletTile(str, staticContent2, contentType, gridContent2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BookletTile value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BookletTile.GridContent.ADAPTER.encodeWithTag(writer, 4, value.grid_content);
                BookletTile.ContentType.ADAPTER.encodeWithTag(writer, 3, value.content_type);
                BookletTile.StaticContent.ADAPTER.encodeWithTag(writer, 2, value.static_content);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.tile_name);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ BookletTile(StaticContent staticContent, ContentType contentType, GridContent gridContent, int i) {
        this(null, (i & 2) != 0 ? null : staticContent, contentType, (i & 8) != 0 ? null : gridContent, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BookletTile)) {
            return false;
        }
        BookletTile bookletTile = (BookletTile) obj;
        return Intrinsics.areEqual(unknownFields(), bookletTile.unknownFields()) && Intrinsics.areEqual(this.tile_name, bookletTile.tile_name) && Intrinsics.areEqual(this.static_content, bookletTile.static_content) && this.content_type == bookletTile.content_type && Intrinsics.areEqual(this.grid_content, bookletTile.grid_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.tile_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        StaticContent staticContent = this.static_content;
        int hashCode3 = (hashCode2 + (staticContent != null ? staticContent.hashCode() : 0)) * 37;
        ContentType contentType = this.content_type;
        int hashCode4 = (hashCode3 + (contentType != null ? contentType.hashCode() : 0)) * 37;
        GridContent gridContent = this.grid_content;
        int hashCode5 = hashCode4 + (gridContent != null ? gridContent.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.tile_name = this.tile_name;
        builder.static_content = this.static_content;
        builder.content_type = this.content_type;
        builder.grid_content = this.grid_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.tile_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tile_name=", arrayList);
        }
        StaticContent staticContent = this.static_content;
        if (staticContent != null) {
            arrayList.add("static_content=" + staticContent);
        }
        ContentType contentType = this.content_type;
        if (contentType != null) {
            arrayList.add("content_type=" + contentType);
        }
        GridContent gridContent = this.grid_content;
        if (gridContent != null) {
            arrayList.add("grid_content=" + gridContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BookletTile{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTENT_TYPE_UNKNOWN", "CONTENT_TYPE_STATIC_CONTENT", "CONTENT_TYPE_GRID", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContentType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final ContentType CONTENT_TYPE_GRID;
        public static final ContentType CONTENT_TYPE_STATIC_CONTENT;
        public static final ContentType CONTENT_TYPE_UNKNOWN;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{CONTENT_TYPE_UNKNOWN, CONTENT_TYPE_STATIC_CONTENT, CONTENT_TYPE_GRID};
        }

        static {
            final ContentType contentType = new ContentType("CONTENT_TYPE_UNKNOWN", 0, 0);
            CONTENT_TYPE_UNKNOWN = contentType;
            CONTENT_TYPE_STATIC_CONTENT = new ContentType("CONTENT_TYPE_STATIC_CONTENT", 1, 1);
            CONTENT_TYPE_GRID = new ContentType("CONTENT_TYPE_GRID", 2, 2);
            ContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ContentType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, contentType) { // from class: com.squareup.protos.cash.money.elements.BookletTile$ContentType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public BookletTile.ContentType fromValue(int value) {
                    return BookletTile.ContentType.INSTANCE.fromValue(value);
                }
            };
        }

        private ContentType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ContentType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ContentType fromValue(int value) {
                if (value == 0) {
                    return ContentType.CONTENT_TYPE_UNKNOWN;
                }
                if (value == 1) {
                    return ContentType.CONTENT_TYPE_STATIC_CONTENT;
                }
                if (value != 2) {
                    return null;
                }
                return ContentType.CONTENT_TYPE_GRID;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent$Builder;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "detail_text", "hero_image", "Lcom/squareup/protos/cash/ui/Image;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/ui/Image;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StaticContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StaticContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString detail_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
        public final Image hero_image;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString title_text;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent;", "<init>", "()V", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "detail_text", "hero_image", "Lcom/squareup/protos/cash/ui/Image;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString detail_text;
            public Image hero_image;
            public LocalizedString title_text;

            @Override // com.squareup.wire.Message.Builder
            public StaticContent build() {
                return new StaticContent(this.title_text, this.detail_text, this.hero_image, buildUnknownFields());
            }

            public final Builder detail_text(LocalizedString detail_text) {
                this.detail_text = detail_text;
                return this;
            }

            public final Builder hero_image(Image hero_image) {
                this.hero_image = hero_image;
                return this;
            }

            public final Builder title_text(LocalizedString title_text) {
                this.title_text = title_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StaticContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.money.elements.BookletTile$StaticContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BookletTile.StaticContent decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BookletTile.StaticContent((LocalizedString) obj, (LocalizedString) obj2, (Image) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BookletTile.StaticContent value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.hero_image);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BookletTile.StaticContent value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return Image.ADAPTER.encodedSizeWithTag(3, value.hero_image) + protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BookletTile.StaticContent redact(BookletTile.StaticContent value) {
                    value.getClass();
                    LocalizedString localizedString = value.title_text;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.detail_text;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    Image image = value.hero_image;
                    return value.copy(localizedString2, localizedString4, image != null ? (Image) Image.ADAPTER.redact(image) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BookletTile.StaticContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Image.ADAPTER.encodeWithTag(writer, 3, value.hero_image);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ StaticContent(LocalizedString localizedString, LocalizedString localizedString2, Image image, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ StaticContent copy$default(StaticContent staticContent, LocalizedString localizedString, LocalizedString localizedString2, Image image, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = staticContent.title_text;
            }
            if ((i & 2) != 0) {
                localizedString2 = staticContent.detail_text;
            }
            if ((i & 4) != 0) {
                image = staticContent.hero_image;
            }
            if ((i & 8) != 0) {
                byteString = staticContent.unknownFields();
            }
            return staticContent.copy(localizedString, localizedString2, image, byteString);
        }

        public final StaticContent copy(LocalizedString title_text, LocalizedString detail_text, Image hero_image, ByteString unknownFields) {
            unknownFields.getClass();
            return new StaticContent(title_text, detail_text, hero_image, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof StaticContent)) {
                return false;
            }
            StaticContent staticContent = (StaticContent) other;
            return Intrinsics.areEqual(unknownFields(), staticContent.unknownFields()) && Intrinsics.areEqual(this.title_text, staticContent.title_text) && Intrinsics.areEqual(this.detail_text, staticContent.detail_text) && Intrinsics.areEqual(this.hero_image, staticContent.hero_image);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.detail_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Image image = this.hero_image;
            int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title_text = this.title_text;
            builder.detail_text = this.detail_text;
            builder.hero_image = this.hero_image;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.detail_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("detail_text=", localizedString2, arrayList);
            }
            Image image = this.hero_image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("hero_image=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StaticContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent$Builder;", "", "body", "Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/money/elements/BookletTile$StaticContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ StaticContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public StaticContent() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StaticContent(LocalizedString localizedString, LocalizedString localizedString2, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title_text = localizedString;
            this.detail_text = localizedString2;
            this.hero_image = image;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/money/elements/BookletTile$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/money/elements/BookletTile$Builder;", "", "body", "Lcom/squareup/protos/cash/money/elements/BookletTile;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/money/elements/BookletTile;", "Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType;", "DEFAULT_CONTENT_TYPE", "Lcom/squareup/protos/cash/money/elements/BookletTile$ContentType;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BookletTile build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookletTile(String str, StaticContent staticContent, ContentType contentType, GridContent gridContent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tile_name = str;
        this.static_content = staticContent;
        this.content_type = contentType;
        this.grid_content = gridContent;
    }
}
