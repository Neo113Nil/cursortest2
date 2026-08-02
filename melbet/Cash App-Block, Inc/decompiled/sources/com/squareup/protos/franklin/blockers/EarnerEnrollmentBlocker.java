package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.earnings.EarnerCategory;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\r\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Builder;", "", "title", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category;", "default_category", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category;", "", "legal_texts", "Ljava/util/List;", "categories", "Companion", "Builder", "Category", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EarnerEnrollmentBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarnerEnrollmentBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker$Category#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<Category> categories;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker$Category#ADAPTER", schemaIndex = 1, tag = 2)
    public final Category default_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<String> legal_texts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker;", "<init>", "()V", "title", "", "default_category", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category;", "legal_texts", "", "categories", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public List<Category> categories;
        public Category default_category;
        public List<String> legal_texts;
        public String title;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.legal_texts = emptyList;
            this.categories = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public EarnerEnrollmentBlocker build() {
            return new EarnerEnrollmentBlocker(this.title, this.default_category, this.legal_texts, this.categories, buildUnknownFields());
        }

        public final Builder categories(List<Category> categories) {
            categories.getClass();
            TransactorKt.checkElementsNotNull(categories);
            this.categories = categories;
            return this;
        }

        public final Builder default_category(Category default_category) {
            this.default_category = default_category;
            return this;
        }

        public final Builder legal_texts(List<String> legal_texts) {
            legal_texts.getClass();
            TransactorKt.checkElementsNotNull(legal_texts);
            this.legal_texts = legal_texts;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EarnerEnrollmentBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public EarnerEnrollmentBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new EarnerEnrollmentBlocker((String) obj, (EarnerEnrollmentBlocker.Category) obj2, m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(EarnerEnrollmentBlocker.Category.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        m.add(ProtoAdapter.STRING.decode(reader));
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(EarnerEnrollmentBlocker.Category.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EarnerEnrollmentBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                ProtoAdapter protoAdapter3 = EarnerEnrollmentBlocker.Category.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.default_category);
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, value.legal_texts);
                protoAdapter3.asRepeated().encodeWithTag(writer, 4, value.categories);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EarnerEnrollmentBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = EarnerEnrollmentBlocker.Category.ADAPTER;
                return protoAdapter3.asRepeated().encodedSizeWithTag(4, value.categories) + protoAdapter2.asRepeated().encodedSizeWithTag(3, value.legal_texts) + protoAdapter3.encodedSizeWithTag(2, value.default_category) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EarnerEnrollmentBlocker redact(EarnerEnrollmentBlocker value) {
                value.getClass();
                EarnerEnrollmentBlocker.Category category = value.default_category;
                EarnerEnrollmentBlocker.Category category2 = category != null ? (EarnerEnrollmentBlocker.Category) EarnerEnrollmentBlocker.Category.ADAPTER.redact(category) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.categories, EarnerEnrollmentBlocker.Category.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                List<String> list = value.legal_texts;
                list.getClass();
                byteString.getClass();
                return new EarnerEnrollmentBlocker(str, category2, list, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EarnerEnrollmentBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = EarnerEnrollmentBlocker.Category.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 4, value.categories);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.asRepeated().encodeWithTag(writer, 3, value.legal_texts);
                protoAdapter2.encodeWithTag(writer, 2, value.default_category);
                protoAdapter3.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnerEnrollmentBlocker(String str, Category category, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title = str;
        this.default_category = category;
        this.legal_texts = TransactorKt.immutableCopyOf("legal_texts", list);
        this.categories = TransactorKt.immutableCopyOf("categories", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarnerEnrollmentBlocker)) {
            return false;
        }
        EarnerEnrollmentBlocker earnerEnrollmentBlocker = (EarnerEnrollmentBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), earnerEnrollmentBlocker.unknownFields()) && Intrinsics.areEqual(this.title, earnerEnrollmentBlocker.title) && Intrinsics.areEqual(this.default_category, earnerEnrollmentBlocker.default_category) && Intrinsics.areEqual(this.legal_texts, earnerEnrollmentBlocker.legal_texts) && Intrinsics.areEqual(this.categories, earnerEnrollmentBlocker.categories);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Category category = this.default_category;
        int hashCode3 = this.categories.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (category != null ? category.hashCode() : 0)) * 37, 37, this.legal_texts);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.default_category = this.default_category;
        builder.legal_texts = this.legal_texts;
        builder.categories = this.categories;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        Category category = this.default_category;
        if (category != null) {
            arrayList.add("default_category=" + category);
        }
        if (!this.legal_texts.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("legal_texts=", arrayList, this.legal_texts);
        }
        if (!this.categories.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("categories=", arrayList, this.categories);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarnerEnrollmentBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category$Builder;", "category", "Lsquareup/cash/earnings/EarnerCategory;", "display_name", "", "arcade_icon_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/earnings/EarnerCategory;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Category extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Category> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String arcade_icon_id;

        @WireField(adapter = "squareup.cash.earnings.EarnerCategory#ADAPTER", schemaIndex = 0, tag = 1)
        public final EarnerCategory category;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String display_name;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category;", "<init>", "()V", "category", "Lsquareup/cash/earnings/EarnerCategory;", "display_name", "", "arcade_icon_id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String arcade_icon_id;
            public EarnerCategory category;
            public String display_name;

            public final Builder arcade_icon_id(String arcade_icon_id) {
                this.arcade_icon_id = arcade_icon_id;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Category build() {
                return new Category(this.category, this.display_name, this.arcade_icon_id, buildUnknownFields());
            }

            public final Builder category(EarnerCategory category) {
                this.category = category;
                return this;
            }

            public final Builder display_name(String display_name) {
                this.display_name = display_name;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Category.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker$Category$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public EarnerEnrollmentBlocker.Category decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new EarnerEnrollmentBlocker.Category((EarnerCategory) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = EarnerCategory.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, EarnerEnrollmentBlocker.Category value) {
                    writer.getClass();
                    value.getClass();
                    EarnerCategory.ADAPTER.encodeWithTag(writer, 1, value.category);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.display_name);
                    protoAdapter2.encodeWithTag(writer, 3, value.arcade_icon_id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(EarnerEnrollmentBlocker.Category value) {
                    value.getClass();
                    int encodedSizeWithTag = EarnerCategory.ADAPTER.encodedSizeWithTag(1, value.category) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.arcade_icon_id) + protoAdapter2.encodedSizeWithTag(2, value.display_name) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public EarnerEnrollmentBlocker.Category redact(EarnerEnrollmentBlocker.Category value) {
                    value.getClass();
                    return EarnerEnrollmentBlocker.Category.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, EarnerEnrollmentBlocker.Category value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.arcade_icon_id);
                    protoAdapter2.encodeWithTag(writer, 2, value.display_name);
                    EarnerCategory.ADAPTER.encodeWithTag(writer, 1, value.category);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Category(EarnerCategory earnerCategory, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : earnerCategory, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Category copy$default(Category category, EarnerCategory earnerCategory, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                earnerCategory = category.category;
            }
            if ((i & 2) != 0) {
                str = category.display_name;
            }
            if ((i & 4) != 0) {
                str2 = category.arcade_icon_id;
            }
            if ((i & 8) != 0) {
                byteString = category.unknownFields();
            }
            return category.copy(earnerCategory, str, str2, byteString);
        }

        public final Category copy(EarnerCategory category, String display_name, String arcade_icon_id, ByteString unknownFields) {
            unknownFields.getClass();
            return new Category(category, display_name, arcade_icon_id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Category)) {
                return false;
            }
            Category category = (Category) other;
            return Intrinsics.areEqual(unknownFields(), category.unknownFields()) && this.category == category.category && Intrinsics.areEqual(this.display_name, category.display_name) && Intrinsics.areEqual(this.arcade_icon_id, category.arcade_icon_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            EarnerCategory earnerCategory = this.category;
            int hashCode2 = (hashCode + (earnerCategory != null ? earnerCategory.hashCode() : 0)) * 37;
            String str = this.display_name;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.arcade_icon_id;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.category = this.category;
            builder.display_name = this.display_name;
            builder.arcade_icon_id = this.arcade_icon_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            EarnerCategory earnerCategory = this.category;
            if (earnerCategory != null) {
                arrayList.add("category=" + earnerCategory);
            }
            String str = this.display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
            }
            String str2 = this.arcade_icon_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "arcade_icon_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Category{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Category;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Category build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Category() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Category(EarnerCategory earnerCategory, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.category = earnerCategory;
            this.display_name = str;
            this.arcade_icon_id = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ EarnerEnrollmentBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
