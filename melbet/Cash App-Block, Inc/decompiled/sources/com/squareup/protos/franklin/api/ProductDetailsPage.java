package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.ProductDetailsPage;
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
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000b\u000f\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Builder;", "", "title", "Ljava/lang/String;", "cta_label", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Action;", "action", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Action;", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section;", "sections", "Ljava/util/List;", "Companion", "Builder", "Action", "Section", "LabelsSection", "HeaderSection", "ImageCarouselSection", "CollapsibleDetailsSection", "TileCarouselSection", "DisclosureSection", "MarkdownTextSection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductDetailsPage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProductDetailsPage> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$Action#ADAPTER", schemaIndex = 3, tag = 4)
    public final Action action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String cta_label;

    @WireField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$Section#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<Section> sections;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage;", "<init>", "()V", "title", "", "sections", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section;", "cta_label", "action", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Action;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Action action;
        public String cta_label;
        public List<Section> sections = EmptyList.INSTANCE;
        public String title;

        public final Builder action(Action action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ProductDetailsPage build() {
            return new ProductDetailsPage(this.title, this.sections, this.cta_label, this.action, buildUnknownFields());
        }

        public final Builder cta_label(String cta_label) {
            this.cta_label = cta_label;
            return this;
        }

        public final Builder sections(List<Section> sections) {
            sections.getClass();
            TransactorKt.checkElementsNotNull(sections);
            this.sections = sections;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$Builder;", "collapsible_details", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "CollapsibleDetail", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CollapsibleDetailsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CollapsibleDetailsSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<CollapsibleDetail> collapsible_details;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection;", "<init>", "()V", "collapsible_details", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<CollapsibleDetail> collapsible_details = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public CollapsibleDetailsSection build() {
                return new CollapsibleDetailsSection(this.collapsible_details, buildUnknownFields());
            }

            public final Builder collapsible_details(List<CollapsibleDetail> collapsible_details) {
                collapsible_details.getClass();
                TransactorKt.checkElementsNotNull(collapsible_details);
                this.collapsible_details = collapsible_details;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CollapsibleDetailsSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$CollapsibleDetailsSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.CollapsibleDetailsSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.CollapsibleDetailsSection(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.CollapsibleDetailsSection value) {
                    writer.getClass();
                    value.getClass();
                    ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.collapsible_details);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.CollapsibleDetailsSection value) {
                    value.getClass();
                    return ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.asRepeated().encodedSizeWithTag(1, value.collapsible_details) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.CollapsibleDetailsSection redact(ProductDetailsPage.CollapsibleDetailsSection value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.collapsible_details, ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.CollapsibleDetailsSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.collapsible_details);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollapsibleDetailsSection(List<CollapsibleDetail> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.collapsible_details = TransactorKt.immutableCopyOf("collapsible_details", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CollapsibleDetailsSection copy$default(CollapsibleDetailsSection collapsibleDetailsSection, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = collapsibleDetailsSection.collapsible_details;
            }
            if ((i & 2) != 0) {
                byteString = collapsibleDetailsSection.unknownFields();
            }
            return collapsibleDetailsSection.copy(list, byteString);
        }

        public final CollapsibleDetailsSection copy(List<CollapsibleDetail> collapsible_details, ByteString unknownFields) {
            collapsible_details.getClass();
            unknownFields.getClass();
            return new CollapsibleDetailsSection(collapsible_details, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CollapsibleDetailsSection)) {
                return false;
            }
            CollapsibleDetailsSection collapsibleDetailsSection = (CollapsibleDetailsSection) other;
            return Intrinsics.areEqual(unknownFields(), collapsibleDetailsSection.unknownFields()) && Intrinsics.areEqual(this.collapsible_details, collapsibleDetailsSection.collapsible_details);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.collapsible_details.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.collapsible_details = this.collapsible_details;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.collapsible_details.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("collapsible_details=", arrayList, this.collapsible_details);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CollapsibleDetailsSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail$Builder;", "title", "", "content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CollapsibleDetail extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CollapsibleDetail> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String content;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail;", "<init>", "()V", "title", "", "content", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String content;
                public String title;

                @Override // com.squareup.wire.Message.Builder
                public CollapsibleDetail build() {
                    return new CollapsibleDetail(this.title, this.content, buildUnknownFields());
                }

                public final Builder content(String content) {
                    this.content = content;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CollapsibleDetail.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.content);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(2, value.content) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail redact(ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail value) {
                        value.getClass();
                        return ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.content);
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ CollapsibleDetail(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ CollapsibleDetail copy$default(CollapsibleDetail collapsibleDetail, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = collapsibleDetail.title;
                }
                if ((i & 2) != 0) {
                    str2 = collapsibleDetail.content;
                }
                if ((i & 4) != 0) {
                    byteString = collapsibleDetail.unknownFields();
                }
                return collapsibleDetail.copy(str, str2, byteString);
            }

            public final CollapsibleDetail copy(String title, String content, ByteString unknownFields) {
                unknownFields.getClass();
                return new CollapsibleDetail(title, content, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof CollapsibleDetail)) {
                    return false;
                }
                CollapsibleDetail collapsibleDetail = (CollapsibleDetail) other;
                return Intrinsics.areEqual(unknownFields(), collapsibleDetail.unknownFields()) && Intrinsics.areEqual(this.title, collapsibleDetail.title) && Intrinsics.areEqual(this.content, collapsibleDetail.content);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.content;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title = this.title;
                builder.content = this.content;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.content;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "content=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CollapsibleDetail{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$CollapsibleDetail;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ CollapsibleDetail build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public CollapsibleDetail() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CollapsibleDetail(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.content = str2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CollapsibleDetailsSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CollapsibleDetailsSection(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public CollapsibleDetailsSection() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Builder;", "labels", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Label", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LabelsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LabelsSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$LabelsSection$Label#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Label> labels;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection;", "<init>", "()V", "labels", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Label> labels = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public LabelsSection build() {
                return new LabelsSection(this.labels, buildUnknownFields());
            }

            public final Builder labels(List<Label> labels) {
                labels.getClass();
                TransactorKt.checkElementsNotNull(labels);
                this.labels = labels;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LabelsSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$LabelsSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.LabelsSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.LabelsSection(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(ProductDetailsPage.LabelsSection.Label.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.LabelsSection value) {
                    writer.getClass();
                    value.getClass();
                    ProductDetailsPage.LabelsSection.Label.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.labels);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.LabelsSection value) {
                    value.getClass();
                    return ProductDetailsPage.LabelsSection.Label.ADAPTER.asRepeated().encodedSizeWithTag(1, value.labels) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.LabelsSection redact(ProductDetailsPage.LabelsSection value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.labels, ProductDetailsPage.LabelsSection.Label.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.LabelsSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProductDetailsPage.LabelsSection.Label.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.labels);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelsSection(List<Label> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.labels = TransactorKt.immutableCopyOf("labels", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LabelsSection copy$default(LabelsSection labelsSection, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = labelsSection.labels;
            }
            if ((i & 2) != 0) {
                byteString = labelsSection.unknownFields();
            }
            return labelsSection.copy(list, byteString);
        }

        public final LabelsSection copy(List<Label> labels, ByteString unknownFields) {
            labels.getClass();
            unknownFields.getClass();
            return new LabelsSection(labels, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LabelsSection)) {
                return false;
            }
            LabelsSection labelsSection = (LabelsSection) other;
            return Intrinsics.areEqual(unknownFields(), labelsSection.unknownFields()) && Intrinsics.areEqual(this.labels, labelsSection.labels);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.labels.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.labels = this.labels;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.labels.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("labels=", arrayList, this.labels);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LabelsSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label$Builder;", AnnotatedPrivateKey.LABEL, "", "treatment", "Lcom/squareup/protos/franklin/api/LabelTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/LabelTreatment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Label extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Label> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String label;

            @WireField(adapter = "com.squareup.protos.franklin.api.LabelTreatment#ADAPTER", schemaIndex = 1, tag = 2)
            public final LabelTreatment treatment;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "treatment", "Lcom/squareup/protos/franklin/api/LabelTreatment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String label;
                public LabelTreatment treatment;

                @Override // com.squareup.wire.Message.Builder
                public Label build() {
                    return new Label(this.label, this.treatment, buildUnknownFields());
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }

                public final Builder treatment(LabelTreatment treatment) {
                    this.treatment = treatment;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Label.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$LabelsSection$Label$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public ProductDetailsPage.LabelsSection.Label decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new ProductDetailsPage.LabelsSection.Label((String) obj, (LabelTreatment) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = TransactorKt.decodeMessageOrMerge(LabelTreatment.ADAPTER, reader, obj2);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ProductDetailsPage.LabelsSection.Label value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
                        LabelTreatment.ADAPTER.encodeWithTag(writer, 2, value.treatment);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ProductDetailsPage.LabelsSection.Label value) {
                        value.getClass();
                        return LabelTreatment.ADAPTER.encodedSizeWithTag(2, value.treatment) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.label) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ProductDetailsPage.LabelsSection.Label redact(ProductDetailsPage.LabelsSection.Label value) {
                        value.getClass();
                        LabelTreatment labelTreatment = value.treatment;
                        return ProductDetailsPage.LabelsSection.Label.copy$default(value, null, labelTreatment != null ? (LabelTreatment) LabelTreatment.ADAPTER.redact(labelTreatment) : null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ProductDetailsPage.LabelsSection.Label value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        LabelTreatment.ADAPTER.encodeWithTag(writer, 2, value.treatment);
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Label(String str, LabelTreatment labelTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : labelTreatment, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Label copy$default(Label label, String str, LabelTreatment labelTreatment, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = label.label;
                }
                if ((i & 2) != 0) {
                    labelTreatment = label.treatment;
                }
                if ((i & 4) != 0) {
                    byteString = label.unknownFields();
                }
                return label.copy(str, labelTreatment, byteString);
            }

            public final Label copy(String label, LabelTreatment treatment, ByteString unknownFields) {
                unknownFields.getClass();
                return new Label(label, treatment, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Label)) {
                    return false;
                }
                Label label = (Label) other;
                return Intrinsics.areEqual(unknownFields(), label.unknownFields()) && Intrinsics.areEqual(this.label, label.label) && Intrinsics.areEqual(this.treatment, label.treatment);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LabelTreatment labelTreatment = this.treatment;
                int hashCode3 = hashCode2 + (labelTreatment != null ? labelTreatment.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.treatment = this.treatment;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                }
                LabelTreatment labelTreatment = this.treatment;
                if (labelTreatment != null) {
                    arrayList.add("treatment=" + labelTreatment);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Label{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Label;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Label build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Label() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Label(String str, LabelTreatment labelTreatment, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.treatment = labelTreatment;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LabelsSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public LabelsSection(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public LabelsSection() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Builder;", "tiles", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Tile", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TileCarouselSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TileCarouselSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$TileCarouselSection$Tile#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Tile> tiles;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection;", "<init>", "()V", "tiles", "", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Tile> tiles = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public TileCarouselSection build() {
                return new TileCarouselSection(this.tiles, buildUnknownFields());
            }

            public final Builder tiles(List<Tile> tiles) {
                tiles.getClass();
                TransactorKt.checkElementsNotNull(tiles);
                this.tiles = tiles;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TileCarouselSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$TileCarouselSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.TileCarouselSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.TileCarouselSection(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(ProductDetailsPage.TileCarouselSection.Tile.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.TileCarouselSection value) {
                    writer.getClass();
                    value.getClass();
                    ProductDetailsPage.TileCarouselSection.Tile.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.tiles);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.TileCarouselSection value) {
                    value.getClass();
                    return ProductDetailsPage.TileCarouselSection.Tile.ADAPTER.asRepeated().encodedSizeWithTag(1, value.tiles) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.TileCarouselSection redact(ProductDetailsPage.TileCarouselSection value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.tiles, ProductDetailsPage.TileCarouselSection.Tile.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.TileCarouselSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProductDetailsPage.TileCarouselSection.Tile.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.tiles);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TileCarouselSection(List<Tile> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.tiles = TransactorKt.immutableCopyOf("tiles", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TileCarouselSection copy$default(TileCarouselSection tileCarouselSection, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tileCarouselSection.tiles;
            }
            if ((i & 2) != 0) {
                byteString = tileCarouselSection.unknownFields();
            }
            return tileCarouselSection.copy(list, byteString);
        }

        public final TileCarouselSection copy(List<Tile> tiles, ByteString unknownFields) {
            tiles.getClass();
            unknownFields.getClass();
            return new TileCarouselSection(tiles, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TileCarouselSection)) {
                return false;
            }
            TileCarouselSection tileCarouselSection = (TileCarouselSection) other;
            return Intrinsics.areEqual(unknownFields(), tileCarouselSection.unknownFields()) && Intrinsics.areEqual(this.tiles, tileCarouselSection.tiles);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.tiles.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.tiles = this.tiles;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.tiles.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("tiles=", arrayList, this.tiles);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TileCarouselSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "title", "", "description", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Tile extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Tile> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String description;

            @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
            public final Image image;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String title;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "title", "", "description", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String description;
                public Image image;
                public String title;

                @Override // com.squareup.wire.Message.Builder
                public Tile build() {
                    return new Tile(this.image, this.title, this.description, buildUnknownFields());
                }

                public final Builder description(String description) {
                    this.description = description;
                    return this;
                }

                public final Builder image(Image image) {
                    this.image = image;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Tile.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$TileCarouselSection$Tile$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public ProductDetailsPage.TileCarouselSection.Tile decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new ProductDetailsPage.TileCarouselSection.Tile((Image) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
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
                    public void encode(ProtoWriter writer, ProductDetailsPage.TileCarouselSection.Tile value) {
                        writer.getClass();
                        value.getClass();
                        Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        protoAdapter2.encodeWithTag(writer, 3, value.description);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ProductDetailsPage.TileCarouselSection.Tile value) {
                        value.getClass();
                        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(3, value.description) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ProductDetailsPage.TileCarouselSection.Tile redact(ProductDetailsPage.TileCarouselSection.Tile value) {
                        value.getClass();
                        Image image = value.image;
                        return ProductDetailsPage.TileCarouselSection.Tile.copy$default(value, image != null ? (Image) Image.ADAPTER.redact(image) : null, null, null, ByteString.EMPTY, 6, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ProductDetailsPage.TileCarouselSection.Tile value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.description);
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Tile(Image image, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Tile copy$default(Tile tile, Image image, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    image = tile.image;
                }
                if ((i & 2) != 0) {
                    str = tile.title;
                }
                if ((i & 4) != 0) {
                    str2 = tile.description;
                }
                if ((i & 8) != 0) {
                    byteString = tile.unknownFields();
                }
                return tile.copy(image, str, str2, byteString);
            }

            public final Tile copy(Image image, String title, String description, ByteString unknownFields) {
                unknownFields.getClass();
                return new Tile(image, title, description, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Tile)) {
                    return false;
                }
                Tile tile = (Tile) other;
                return Intrinsics.areEqual(unknownFields(), tile.unknownFields()) && Intrinsics.areEqual(this.image, tile.image) && Intrinsics.areEqual(this.title, tile.title) && Intrinsics.areEqual(this.description, tile.description);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Image image = this.image;
                int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
                String str = this.title;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.description;
                int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.image = this.image;
                builder.title = this.title;
                builder.description = this.description;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.description;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Tile{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Tile;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Tile build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Tile() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tile(Image image, String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.image = image;
                this.title = str;
                this.description = str2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TileCarouselSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TileCarouselSection(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public TileCarouselSection() {
            this(null, null, 3, null);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ProductDetailsPage.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ProductDetailsPage decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ProductDetailsPage((String) obj, m, (String) obj2, (ProductDetailsPage.Action) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        m.add(ProductDetailsPage.Section.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = ProductDetailsPage.Action.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ProductDetailsPage value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                ProductDetailsPage.Section.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.sections);
                protoAdapter2.encodeWithTag(writer, 3, value.cta_label);
                ProductDetailsPage.Action.ADAPTER.encodeWithTag(writer, 4, value.action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ProductDetailsPage value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProductDetailsPage.Action.ADAPTER.encodedSizeWithTag(4, value.action) + protoAdapter2.encodedSizeWithTag(3, value.cta_label) + ProductDetailsPage.Section.ADAPTER.asRepeated().encodedSizeWithTag(2, value.sections) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ProductDetailsPage redact(ProductDetailsPage value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.sections, ProductDetailsPage.Section.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.cta_label;
                ProductDetailsPage.Action action = value.action;
                byteString.getClass();
                return new ProductDetailsPage(str, m1169redactElements, str2, action, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ProductDetailsPage value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProductDetailsPage.Action.ADAPTER.encodeWithTag(writer, 4, value.action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.cta_label);
                ProductDetailsPage.Section.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.sections);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsPage(String str, List list, String str2, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.cta_label = str2;
        this.action = action;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductDetailsPage)) {
            return false;
        }
        ProductDetailsPage productDetailsPage = (ProductDetailsPage) obj;
        return Intrinsics.areEqual(unknownFields(), productDetailsPage.unknownFields()) && Intrinsics.areEqual(this.title, productDetailsPage.title) && Intrinsics.areEqual(this.sections, productDetailsPage.sections) && Intrinsics.areEqual(this.cta_label, productDetailsPage.cta_label) && this.action == productDetailsPage.action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.sections);
        String str2 = this.cta_label;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.sections = this.sections;
        builder.cta_label = this.cta_label;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        if (!this.sections.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, this.sections);
        }
        String str2 = this.cta_label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cta_label=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProductDetailsPage{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Action;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTION_UNSPECIFIED", "SUBMIT", "HYPE", "DISABLED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ACTION_UNSPECIFIED;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Action DISABLED;
        public static final Action HYPE;
        public static final Action SUBMIT;
        private final int value;

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{ACTION_UNSPECIFIED, SUBMIT, HYPE, DISABLED};
        }

        static {
            final Action action = new Action("ACTION_UNSPECIFIED", 0, 0);
            ACTION_UNSPECIFIED = action;
            SUBMIT = new Action("SUBMIT", 1, 1);
            HYPE = new Action("HYPE", 2, 2);
            DISABLED = new Action("DISABLED", 3, 3);
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Action.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, action) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$Action$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ProductDetailsPage.Action fromValue(int value) {
                    return ProductDetailsPage.Action.INSTANCE.fromValue(value);
                }
            };
        }

        private Action(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Action fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Action$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Action;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Action fromValue(int value) {
                if (value == 0) {
                    return Action.ACTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return Action.SUBMIT;
                }
                if (value == 2) {
                    return Action.HYPE;
                }
                if (value != 3) {
                    return null;
                }
                return Action.DISABLED;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection$Builder;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisclosureSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DisclosureSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection;", "<init>", "()V", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public DisclosureSection build() {
                return new DisclosureSection(this.text, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DisclosureSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$DisclosureSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.DisclosureSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.DisclosureSection((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.DisclosureSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.DisclosureSection value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.DisclosureSection redact(ProductDetailsPage.DisclosureSection value) {
                    value.getClass();
                    return ProductDetailsPage.DisclosureSection.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.DisclosureSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DisclosureSection(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DisclosureSection copy$default(DisclosureSection disclosureSection, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disclosureSection.text;
            }
            if ((i & 2) != 0) {
                byteString = disclosureSection.unknownFields();
            }
            return disclosureSection.copy(str, byteString);
        }

        public final DisclosureSection copy(String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new DisclosureSection(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DisclosureSection)) {
                return false;
            }
            DisclosureSection disclosureSection = (DisclosureSection) other;
            return Intrinsics.areEqual(unknownFields(), disclosureSection.unknownFields()) && Intrinsics.areEqual(this.text, disclosureSection.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DisclosureSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DisclosureSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DisclosureSection() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisclosureSection(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection$Builder;", "title", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HeaderSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeaderSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection;", "<init>", "()V", "title", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public HeaderSection build() {
                return new HeaderSection(this.title, buildUnknownFields());
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HeaderSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$HeaderSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.HeaderSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.HeaderSection((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.HeaderSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.HeaderSection value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.HeaderSection redact(ProductDetailsPage.HeaderSection value) {
                    value.getClass();
                    return ProductDetailsPage.HeaderSection.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.HeaderSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ HeaderSection(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ HeaderSection copy$default(HeaderSection headerSection, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = headerSection.title;
            }
            if ((i & 2) != 0) {
                byteString = headerSection.unknownFields();
            }
            return headerSection.copy(str, byteString);
        }

        public final HeaderSection copy(String title, ByteString unknownFields) {
            unknownFields.getClass();
            return new HeaderSection(title, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HeaderSection)) {
                return false;
            }
            HeaderSection headerSection = (HeaderSection) other;
            return Intrinsics.areEqual(unknownFields(), headerSection.unknownFields()) && Intrinsics.areEqual(this.title, headerSection.title);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeaderSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ HeaderSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HeaderSection() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderSection(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J1\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection$Builder;", "images", "", "Lcom/squareup/protos/cash/ui/Image;", "image_aspect_ratio", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/util/List;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ImageCarouselSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ImageCarouselSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float image_aspect_ratio;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Image> images;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;", "<init>", "()V", "images", "", "Lcom/squareup/protos/cash/ui/Image;", "image_aspect_ratio", "", "Ljava/lang/Float;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Float image_aspect_ratio;
            public List<Image> images = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public ImageCarouselSection build() {
                return new ImageCarouselSection(this.images, this.image_aspect_ratio, buildUnknownFields());
            }

            public final Builder image_aspect_ratio(Float image_aspect_ratio) {
                this.image_aspect_ratio = image_aspect_ratio;
                return this;
            }

            public final Builder images(List<Image> images) {
                images.getClass();
                TransactorKt.checkElementsNotNull(images);
                this.images = images;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ImageCarouselSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$ImageCarouselSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.ImageCarouselSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.ImageCarouselSection(m, (Float) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(Image.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj = ProtoAdapter.FLOAT.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.ImageCarouselSection value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.images);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.image_aspect_ratio);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.ImageCarouselSection value) {
                    value.getClass();
                    return ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.image_aspect_ratio) + Image.ADAPTER.asRepeated().encodedSizeWithTag(1, value.images) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.ImageCarouselSection redact(ProductDetailsPage.ImageCarouselSection value) {
                    value.getClass();
                    return ProductDetailsPage.ImageCarouselSection.copy$default(value, TransactorKt.m1169redactElements(value.images, Image.ADAPTER), null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.ImageCarouselSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.image_aspect_ratio);
                    Image.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.images);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageCarouselSection(List<Image> list, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.image_aspect_ratio = f;
            this.images = TransactorKt.immutableCopyOf("images", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageCarouselSection copy$default(ImageCarouselSection imageCarouselSection, List list, Float f, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = imageCarouselSection.images;
            }
            if ((i & 2) != 0) {
                f = imageCarouselSection.image_aspect_ratio;
            }
            if ((i & 4) != 0) {
                byteString = imageCarouselSection.unknownFields();
            }
            return imageCarouselSection.copy(list, f, byteString);
        }

        public final ImageCarouselSection copy(List<Image> images, Float image_aspect_ratio, ByteString unknownFields) {
            images.getClass();
            unknownFields.getClass();
            return new ImageCarouselSection(images, image_aspect_ratio, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ImageCarouselSection)) {
                return false;
            }
            ImageCarouselSection imageCarouselSection = (ImageCarouselSection) other;
            return Intrinsics.areEqual(unknownFields(), imageCarouselSection.unknownFields()) && Intrinsics.areEqual(this.images, imageCarouselSection.images) && Intrinsics.areEqual(this.image_aspect_ratio, imageCarouselSection.image_aspect_ratio);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.images);
            Float f = this.image_aspect_ratio;
            int hashCode = m + (f != null ? Float.hashCode(f.floatValue()) : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.images = this.images;
            builder.image_aspect_ratio = this.image_aspect_ratio;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.images.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("images=", arrayList, this.images);
            }
            Float f = this.image_aspect_ratio;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("image_aspect_ratio=", f, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ImageCarouselSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ImageCarouselSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ImageCarouselSection(List list, Float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : f, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public ImageCarouselSection() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection$Builder;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MarkdownTextSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MarkdownTextSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection;", "<init>", "()V", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public MarkdownTextSection build() {
                return new MarkdownTextSection(this.text, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MarkdownTextSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$MarkdownTextSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.MarkdownTextSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.MarkdownTextSection((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.MarkdownTextSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.MarkdownTextSection value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.MarkdownTextSection redact(ProductDetailsPage.MarkdownTextSection value) {
                    value.getClass();
                    return ProductDetailsPage.MarkdownTextSection.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.MarkdownTextSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ MarkdownTextSection(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ MarkdownTextSection copy$default(MarkdownTextSection markdownTextSection, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = markdownTextSection.text;
            }
            if ((i & 2) != 0) {
                byteString = markdownTextSection.unknownFields();
            }
            return markdownTextSection.copy(str, byteString);
        }

        public final MarkdownTextSection copy(String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new MarkdownTextSection(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MarkdownTextSection)) {
                return false;
            }
            MarkdownTextSection markdownTextSection = (MarkdownTextSection) other;
            return Intrinsics.areEqual(unknownFields(), markdownTextSection.unknownFields()) && Intrinsics.areEqual(this.text, markdownTextSection.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MarkdownTextSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ MarkdownTextSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MarkdownTextSection() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarkdownTextSection(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Builder;", "type", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Type", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Section extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Section> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Type type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section;", "<init>", "()V", "type", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Type type;

            @Override // com.squareup.wire.Message.Builder
            public Section build() {
                return new Section(this.type, buildUnknownFields());
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Section.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ProductDetailsPage$Section$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.Section decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    ProductDetailsPage.Section.Type type2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ProductDetailsPage.Section(type2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                type2 = new ProductDetailsPage.Section.Type.Labels((ProductDetailsPage.LabelsSection) ProductDetailsPage.LabelsSection.ADAPTER.decode(reader));
                                break;
                            case 2:
                                type2 = new ProductDetailsPage.Section.Type.Header((ProductDetailsPage.HeaderSection) ProductDetailsPage.HeaderSection.ADAPTER.decode(reader));
                                break;
                            case 3:
                                type2 = new ProductDetailsPage.Section.Type.ImageCarousel((ProductDetailsPage.ImageCarouselSection) ProductDetailsPage.ImageCarouselSection.ADAPTER.decode(reader));
                                break;
                            case 4:
                                type2 = new ProductDetailsPage.Section.Type.CollapsibleDetails((ProductDetailsPage.CollapsibleDetailsSection) ProductDetailsPage.CollapsibleDetailsSection.ADAPTER.decode(reader));
                                break;
                            case 5:
                                type2 = new ProductDetailsPage.Section.Type.TileCarousel((ProductDetailsPage.TileCarouselSection) ProductDetailsPage.TileCarouselSection.ADAPTER.decode(reader));
                                break;
                            case 6:
                                type2 = new ProductDetailsPage.Section.Type.IconGrid((BookletTile) BookletTile.ADAPTER.decode(reader));
                                break;
                            case 7:
                                type2 = new ProductDetailsPage.Section.Type.Disclosure((ProductDetailsPage.DisclosureSection) ProductDetailsPage.DisclosureSection.ADAPTER.decode(reader));
                                break;
                            case 8:
                                type2 = new ProductDetailsPage.Section.Type.MarkdownText((ProductDetailsPage.MarkdownTextSection) ProductDetailsPage.MarkdownTextSection.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ProductDetailsPage.Section value) {
                    writer.getClass();
                    value.getClass();
                    ProductDetailsPage.Section.Type type2 = value.type;
                    if (type2 instanceof ProductDetailsPage.Section.Type.Labels) {
                        ProductDetailsPage.LabelsSection.ADAPTER.encodeWithTag(writer, 1, ((ProductDetailsPage.Section.Type.Labels) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.Header) {
                        ProductDetailsPage.HeaderSection.ADAPTER.encodeWithTag(writer, 2, ((ProductDetailsPage.Section.Type.Header) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.ImageCarousel) {
                        ProductDetailsPage.ImageCarouselSection.ADAPTER.encodeWithTag(writer, 3, ((ProductDetailsPage.Section.Type.ImageCarousel) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.CollapsibleDetails) {
                        ProductDetailsPage.CollapsibleDetailsSection.ADAPTER.encodeWithTag(writer, 4, ((ProductDetailsPage.Section.Type.CollapsibleDetails) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.TileCarousel) {
                        ProductDetailsPage.TileCarouselSection.ADAPTER.encodeWithTag(writer, 5, ((ProductDetailsPage.Section.Type.TileCarousel) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.IconGrid) {
                        BookletTile.ADAPTER.encodeWithTag(writer, 6, ((ProductDetailsPage.Section.Type.IconGrid) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.Disclosure) {
                        ProductDetailsPage.DisclosureSection.ADAPTER.encodeWithTag(writer, 7, ((ProductDetailsPage.Section.Type.Disclosure) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.MarkdownText) {
                        ProductDetailsPage.MarkdownTextSection.ADAPTER.encodeWithTag(writer, 8, ((ProductDetailsPage.Section.Type.MarkdownText) type2).getValue());
                    } else if (type2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ProductDetailsPage.Section value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProductDetailsPage.Section.Type type2 = value.type;
                    if (type2 instanceof ProductDetailsPage.Section.Type.Labels) {
                        encodedSizeWithTag = ProductDetailsPage.LabelsSection.ADAPTER.encodedSizeWithTag(1, ((ProductDetailsPage.Section.Type.Labels) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.Header) {
                        encodedSizeWithTag = ProductDetailsPage.HeaderSection.ADAPTER.encodedSizeWithTag(2, ((ProductDetailsPage.Section.Type.Header) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.ImageCarousel) {
                        encodedSizeWithTag = ProductDetailsPage.ImageCarouselSection.ADAPTER.encodedSizeWithTag(3, ((ProductDetailsPage.Section.Type.ImageCarousel) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.CollapsibleDetails) {
                        encodedSizeWithTag = ProductDetailsPage.CollapsibleDetailsSection.ADAPTER.encodedSizeWithTag(4, ((ProductDetailsPage.Section.Type.CollapsibleDetails) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.TileCarousel) {
                        encodedSizeWithTag = ProductDetailsPage.TileCarouselSection.ADAPTER.encodedSizeWithTag(5, ((ProductDetailsPage.Section.Type.TileCarousel) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.IconGrid) {
                        encodedSizeWithTag = BookletTile.ADAPTER.encodedSizeWithTag(6, ((ProductDetailsPage.Section.Type.IconGrid) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.Disclosure) {
                        encodedSizeWithTag = ProductDetailsPage.DisclosureSection.ADAPTER.encodedSizeWithTag(7, ((ProductDetailsPage.Section.Type.Disclosure) type2).getValue());
                    } else {
                        if (!(type2 instanceof ProductDetailsPage.Section.Type.MarkdownText)) {
                            if (type2 == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = ProductDetailsPage.MarkdownTextSection.ADAPTER.encodedSizeWithTag(8, ((ProductDetailsPage.Section.Type.MarkdownText) type2).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ProductDetailsPage.Section redact(ProductDetailsPage.Section value) {
                    value.getClass();
                    return ProductDetailsPage.Section.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ProductDetailsPage.Section value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProductDetailsPage.Section.Type type2 = value.type;
                    if (type2 instanceof ProductDetailsPage.Section.Type.Labels) {
                        ProductDetailsPage.LabelsSection.ADAPTER.encodeWithTag(writer, 1, ((ProductDetailsPage.Section.Type.Labels) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ProductDetailsPage.Section.Type.Header) {
                        ProductDetailsPage.HeaderSection.ADAPTER.encodeWithTag(writer, 2, ((ProductDetailsPage.Section.Type.Header) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ProductDetailsPage.Section.Type.ImageCarousel) {
                        ProductDetailsPage.ImageCarouselSection.ADAPTER.encodeWithTag(writer, 3, ((ProductDetailsPage.Section.Type.ImageCarousel) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ProductDetailsPage.Section.Type.CollapsibleDetails) {
                        ProductDetailsPage.CollapsibleDetailsSection.ADAPTER.encodeWithTag(writer, 4, ((ProductDetailsPage.Section.Type.CollapsibleDetails) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ProductDetailsPage.Section.Type.TileCarousel) {
                        ProductDetailsPage.TileCarouselSection.ADAPTER.encodeWithTag(writer, 5, ((ProductDetailsPage.Section.Type.TileCarousel) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ProductDetailsPage.Section.Type.IconGrid) {
                        BookletTile.ADAPTER.encodeWithTag(writer, 6, ((ProductDetailsPage.Section.Type.IconGrid) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ProductDetailsPage.Section.Type.Disclosure) {
                        ProductDetailsPage.DisclosureSection.ADAPTER.encodeWithTag(writer, 7, ((ProductDetailsPage.Section.Type.Disclosure) type2).getValue());
                    } else if (type2 instanceof ProductDetailsPage.Section.Type.MarkdownText) {
                        ProductDetailsPage.MarkdownTextSection.ADAPTER.encodeWithTag(writer, 8, ((ProductDetailsPage.Section.Type.MarkdownText) type2).getValue());
                    } else {
                        if (type2 == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Section(Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Section copy$default(Section section, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = section.type;
            }
            if ((i & 2) != 0) {
                byteString = section.unknownFields();
            }
            return section.copy(type2, byteString);
        }

        public final Section copy(Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new Section(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.type, section.type);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.type;
            int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
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
            Type type2 = this.type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Section build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "", "<init>", "()V", "Labels", "Header", "ImageCarousel", "CollapsibleDetails", "TileCarousel", "IconGrid", "Disclosure", "MarkdownText", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$CollapsibleDetails;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$Disclosure;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$Header;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$IconGrid;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$ImageCarousel;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$Labels;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$MarkdownText;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$TileCarousel;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Type {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$CollapsibleDetailsSection#ADAPTER", declaredName = "collapsible_details", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$CollapsibleDetails;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ProductDetailsPage$CollapsibleDetailsSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class CollapsibleDetails extends Type {
                private final CollapsibleDetailsSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CollapsibleDetails(CollapsibleDetailsSection collapsibleDetailsSection) {
                    super(null);
                    collapsibleDetailsSection.getClass();
                    this.value = collapsibleDetailsSection;
                }

                public static /* synthetic */ CollapsibleDetails copy$default(CollapsibleDetails collapsibleDetails, CollapsibleDetailsSection collapsibleDetailsSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        collapsibleDetailsSection = collapsibleDetails.value;
                    }
                    return collapsibleDetails.copy(collapsibleDetailsSection);
                }

                /* renamed from: component1, reason: from getter */
                public final CollapsibleDetailsSection getValue() {
                    return this.value;
                }

                public final CollapsibleDetails copy(CollapsibleDetailsSection value) {
                    value.getClass();
                    return new CollapsibleDetails(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CollapsibleDetails) && Intrinsics.areEqual(this.value, ((CollapsibleDetails) other).value);
                }

                public final CollapsibleDetailsSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "CollapsibleDetails(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$DisclosureSection#ADAPTER", declaredName = "disclosure", tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$Disclosure;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ProductDetailsPage$DisclosureSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Disclosure extends Type {
                private final DisclosureSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Disclosure(DisclosureSection disclosureSection) {
                    super(null);
                    disclosureSection.getClass();
                    this.value = disclosureSection;
                }

                public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, DisclosureSection disclosureSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        disclosureSection = disclosure.value;
                    }
                    return disclosure.copy(disclosureSection);
                }

                /* renamed from: component1, reason: from getter */
                public final DisclosureSection getValue() {
                    return this.value;
                }

                public final Disclosure copy(DisclosureSection value) {
                    value.getClass();
                    return new Disclosure(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Disclosure) && Intrinsics.areEqual(this.value, ((Disclosure) other).value);
                }

                public final DisclosureSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Disclosure(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$HeaderSection#ADAPTER", declaredName = "header", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$Header;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ProductDetailsPage$HeaderSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Header extends Type {
                private final HeaderSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Header(HeaderSection headerSection) {
                    super(null);
                    headerSection.getClass();
                    this.value = headerSection;
                }

                public static /* synthetic */ Header copy$default(Header header, HeaderSection headerSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        headerSection = header.value;
                    }
                    return header.copy(headerSection);
                }

                /* renamed from: component1, reason: from getter */
                public final HeaderSection getValue() {
                    return this.value;
                }

                public final Header copy(HeaderSection value) {
                    value.getClass();
                    return new Header(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Header) && Intrinsics.areEqual(this.value, ((Header) other).value);
                }

                public final HeaderSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Header(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.money.elements.BookletTile#ADAPTER", declaredName = "icon_grid", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$IconGrid;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/cash/money/elements/BookletTile;", "<init>", "(Lcom/squareup/protos/cash/money/elements/BookletTile;)V", "getValue", "()Lcom/squareup/protos/cash/money/elements/BookletTile;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class IconGrid extends Type {
                private final BookletTile value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IconGrid(BookletTile bookletTile) {
                    super(null);
                    bookletTile.getClass();
                    this.value = bookletTile;
                }

                public static /* synthetic */ IconGrid copy$default(IconGrid iconGrid, BookletTile bookletTile, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bookletTile = iconGrid.value;
                    }
                    return iconGrid.copy(bookletTile);
                }

                /* renamed from: component1, reason: from getter */
                public final BookletTile getValue() {
                    return this.value;
                }

                public final IconGrid copy(BookletTile value) {
                    value.getClass();
                    return new IconGrid(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof IconGrid) && Intrinsics.areEqual(this.value, ((IconGrid) other).value);
                }

                public final BookletTile getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "IconGrid(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$ImageCarouselSection#ADAPTER", declaredName = "image_carousel", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$ImageCarousel;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ProductDetailsPage$ImageCarouselSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ImageCarousel extends Type {
                private final ImageCarouselSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ImageCarousel(ImageCarouselSection imageCarouselSection) {
                    super(null);
                    imageCarouselSection.getClass();
                    this.value = imageCarouselSection;
                }

                public static /* synthetic */ ImageCarousel copy$default(ImageCarousel imageCarousel, ImageCarouselSection imageCarouselSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        imageCarouselSection = imageCarousel.value;
                    }
                    return imageCarousel.copy(imageCarouselSection);
                }

                /* renamed from: component1, reason: from getter */
                public final ImageCarouselSection getValue() {
                    return this.value;
                }

                public final ImageCarousel copy(ImageCarouselSection value) {
                    value.getClass();
                    return new ImageCarousel(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ImageCarousel) && Intrinsics.areEqual(this.value, ((ImageCarousel) other).value);
                }

                public final ImageCarouselSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ImageCarousel(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$LabelsSection#ADAPTER", declaredName = "labels", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$Labels;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ProductDetailsPage$LabelsSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Labels extends Type {
                private final LabelsSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Labels(LabelsSection labelsSection) {
                    super(null);
                    labelsSection.getClass();
                    this.value = labelsSection;
                }

                public static /* synthetic */ Labels copy$default(Labels labels, LabelsSection labelsSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        labelsSection = labels.value;
                    }
                    return labels.copy(labelsSection);
                }

                /* renamed from: component1, reason: from getter */
                public final LabelsSection getValue() {
                    return this.value;
                }

                public final Labels copy(LabelsSection value) {
                    value.getClass();
                    return new Labels(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Labels) && Intrinsics.areEqual(this.value, ((Labels) other).value);
                }

                public final LabelsSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Labels(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$MarkdownTextSection#ADAPTER", declaredName = "markdown_text", tag = 8)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$MarkdownText;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ProductDetailsPage$MarkdownTextSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class MarkdownText extends Type {
                private final MarkdownTextSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MarkdownText(MarkdownTextSection markdownTextSection) {
                    super(null);
                    markdownTextSection.getClass();
                    this.value = markdownTextSection;
                }

                public static /* synthetic */ MarkdownText copy$default(MarkdownText markdownText, MarkdownTextSection markdownTextSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        markdownTextSection = markdownText.value;
                    }
                    return markdownText.copy(markdownTextSection);
                }

                /* renamed from: component1, reason: from getter */
                public final MarkdownTextSection getValue() {
                    return this.value;
                }

                public final MarkdownText copy(MarkdownTextSection value) {
                    value.getClass();
                    return new MarkdownText(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof MarkdownText) && Intrinsics.areEqual(this.value, ((MarkdownText) other).value);
                }

                public final MarkdownTextSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "MarkdownText(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage$TileCarouselSection#ADAPTER", declaredName = "tile_carousel", tag = 5)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type$TileCarousel;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Section$Type;", "value", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection;", "<init>", "(Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ProductDetailsPage$TileCarouselSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class TileCarousel extends Type {
                private final TileCarouselSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TileCarousel(TileCarouselSection tileCarouselSection) {
                    super(null);
                    tileCarouselSection.getClass();
                    this.value = tileCarouselSection;
                }

                public static /* synthetic */ TileCarousel copy$default(TileCarousel tileCarousel, TileCarouselSection tileCarouselSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        tileCarouselSection = tileCarousel.value;
                    }
                    return tileCarousel.copy(tileCarouselSection);
                }

                /* renamed from: component1, reason: from getter */
                public final TileCarouselSection getValue() {
                    return this.value;
                }

                public final TileCarousel copy(TileCarouselSection value) {
                    value.getClass();
                    return new TileCarousel(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TileCarousel) && Intrinsics.areEqual(this.value, ((TileCarousel) other).value);
                }

                public final TileCarouselSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TileCarousel(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Type() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Section() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Section(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = type2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ProductDetailsPage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ProductDetailsPage;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ProductDetailsPage;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ProductDetailsPage build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
