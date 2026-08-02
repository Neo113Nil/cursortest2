package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.MoneyTabBookletBlocker;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\n\u0010\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$Builder;", "", "title", "Ljava/lang/String;", "cta_label", "cta_destination", "Lcom/squareup/protos/franklin/api/BlockerAction;", "cta_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection;", "sections", "Ljava/util/List;", "Companion", "Builder", "MoneyTabBookletSection", "HeroSection", "HeaderSection", "CardSection", "CollapsibleDetailsSection", "ListUnorderedSection", "ListUnorderedCardSection", "DisclosureSection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MoneyTabBookletBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneyTabBookletBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 4, tag = 5)
    public final BlockerAction cta_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String cta_destination;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String cta_label;

    @WireField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$MoneyTabBookletSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<MoneyTabBookletSection> sections;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker;", "<init>", "()V", "title", "", "sections", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection;", "cta_label", "cta_destination", "cta_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public BlockerAction cta_action;
        public String cta_destination;
        public String cta_label;
        public List<MoneyTabBookletSection> sections = EmptyList.INSTANCE;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public MoneyTabBookletBlocker build() {
            return new MoneyTabBookletBlocker(this.title, this.sections, this.cta_label, this.cta_destination, this.cta_action, buildUnknownFields());
        }

        public final Builder cta_action(BlockerAction cta_action) {
            this.cta_action = cta_action;
            return this;
        }

        public final Builder cta_destination(String cta_destination) {
            this.cta_destination = cta_destination;
            return this;
        }

        public final Builder cta_label(String cta_label) {
            this.cta_label = cta_label;
            return this;
        }

        public final Builder sections(List<MoneyTabBookletSection> sections) {
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$Builder;", "collapsible_details", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "CollapsibleDetail", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CollapsibleDetailsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CollapsibleDetailsSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<CollapsibleDetail> collapsible_details;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection;", "<init>", "()V", "collapsible_details", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$CollapsibleDetailsSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.CollapsibleDetailsSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.CollapsibleDetailsSection(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.CollapsibleDetailsSection value) {
                    writer.getClass();
                    value.getClass();
                    MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.collapsible_details);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.CollapsibleDetailsSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.asRepeated().encodedSizeWithTag(1, value.collapsible_details) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.CollapsibleDetailsSection redact(MoneyTabBookletBlocker.CollapsibleDetailsSection value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.collapsible_details, MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.CollapsibleDetailsSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.collapsible_details);
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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail$Builder;", "title", "", "content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail;", "<init>", "()V", "title", "", "content", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.content);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(2, value.content) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail redact(MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail value) {
                        value.getClass();
                        return MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail value) {
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

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$CollapsibleDetail;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Builder;", AnnotatedPrivateKey.LABEL, "", "size", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Size;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Size;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Size", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class HeaderSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeaderSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String label;

        @WireField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$HeaderSection$Size#ADAPTER", schemaIndex = 1, tag = 2)
        public final Size size;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "size", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Size;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String label;
            public Size size;

            @Override // com.squareup.wire.Message.Builder
            public HeaderSection build() {
                return new HeaderSection(this.label, this.size, buildUnknownFields());
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder size(Size size) {
                this.size = size;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HeaderSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$HeaderSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.HeaderSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.HeaderSection((String) obj, (MoneyTabBookletBlocker.HeaderSection.Size) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj2 = MoneyTabBookletBlocker.HeaderSection.Size.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.HeaderSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
                    MoneyTabBookletBlocker.HeaderSection.Size.ADAPTER.encodeWithTag(writer, 2, value.size);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.HeaderSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.HeaderSection.Size.ADAPTER.encodedSizeWithTag(2, value.size) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.label) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.HeaderSection redact(MoneyTabBookletBlocker.HeaderSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.HeaderSection.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.HeaderSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    MoneyTabBookletBlocker.HeaderSection.Size.ADAPTER.encodeWithTag(writer, 2, value.size);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ HeaderSection(String str, Size size, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : size, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ HeaderSection copy$default(HeaderSection headerSection, String str, Size size, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = headerSection.label;
            }
            if ((i & 2) != 0) {
                size = headerSection.size;
            }
            if ((i & 4) != 0) {
                byteString = headerSection.unknownFields();
            }
            return headerSection.copy(str, size, byteString);
        }

        public final HeaderSection copy(String label, Size size, ByteString unknownFields) {
            unknownFields.getClass();
            return new HeaderSection(label, size, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HeaderSection)) {
                return false;
            }
            HeaderSection headerSection = (HeaderSection) other;
            return Intrinsics.areEqual(unknownFields(), headerSection.unknownFields()) && Intrinsics.areEqual(this.label, headerSection.label) && this.size == headerSection.size;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Size size = this.size;
            int hashCode3 = hashCode2 + (size != null ? size.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.size = this.size;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            Size size = this.size;
            if (size != null) {
                arrayList.add("size=" + size);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeaderSection{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Size;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DO_NOT_USE", "SMALL", "LARGE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Size implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Size[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Size DO_NOT_USE;
            public static final Size LARGE;
            public static final Size SMALL;
            private final int value;

            private static final /* synthetic */ Size[] $values() {
                return new Size[]{DO_NOT_USE, SMALL, LARGE};
            }

            static {
                final Size size = new Size("DO_NOT_USE", 0, 0);
                DO_NOT_USE = size;
                SMALL = new Size("SMALL", 1, 1);
                LARGE = new Size("LARGE", 2, 2);
                Size[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Size.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, size) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$HeaderSection$Size$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public MoneyTabBookletBlocker.HeaderSection.Size fromValue(int value) {
                        return MoneyTabBookletBlocker.HeaderSection.Size.INSTANCE.fromValue(value);
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Size$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Size;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Size fromValue(int value) {
                    if (value == 0) {
                        return Size.DO_NOT_USE;
                    }
                    if (value == 1) {
                        return Size.SMALL;
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        public HeaderSection() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderSection(String str, Size size, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.size = size;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$Builder;", "list_unordered_items", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "ListUnorderedItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ListUnorderedSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ListUnorderedSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<ListUnorderedItem> list_unordered_items;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection;", "<init>", "()V", "list_unordered_items", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<ListUnorderedItem> list_unordered_items = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public ListUnorderedSection build() {
                return new ListUnorderedSection(this.list_unordered_items, buildUnknownFields());
            }

            public final Builder list_unordered_items(List<ListUnorderedItem> list_unordered_items) {
                list_unordered_items.getClass();
                TransactorKt.checkElementsNotNull(list_unordered_items);
                this.list_unordered_items = list_unordered_items;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListUnorderedSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$ListUnorderedSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.ListUnorderedSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.ListUnorderedSection(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.ListUnorderedSection value) {
                    writer.getClass();
                    value.getClass();
                    MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.list_unordered_items);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.ListUnorderedSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.list_unordered_items) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.ListUnorderedSection redact(MoneyTabBookletBlocker.ListUnorderedSection value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.list_unordered_items, MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.ListUnorderedSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.list_unordered_items);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListUnorderedSection(List<ListUnorderedItem> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.list_unordered_items = TransactorKt.immutableCopyOf("list_unordered_items", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListUnorderedSection copy$default(ListUnorderedSection listUnorderedSection, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = listUnorderedSection.list_unordered_items;
            }
            if ((i & 2) != 0) {
                byteString = listUnorderedSection.unknownFields();
            }
            return listUnorderedSection.copy(list, byteString);
        }

        public final ListUnorderedSection copy(List<ListUnorderedItem> list_unordered_items, ByteString unknownFields) {
            list_unordered_items.getClass();
            unknownFields.getClass();
            return new ListUnorderedSection(list_unordered_items, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ListUnorderedSection)) {
                return false;
            }
            ListUnorderedSection listUnorderedSection = (ListUnorderedSection) other;
            return Intrinsics.areEqual(unknownFields(), listUnorderedSection.unknownFields()) && Intrinsics.areEqual(this.list_unordered_items, listUnorderedSection.list_unordered_items);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.list_unordered_items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.list_unordered_items = this.list_unordered_items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.list_unordered_items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("list_unordered_items=", arrayList, this.list_unordered_items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ListUnorderedSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem$Builder;", "icon_id", "", AnnotatedPrivateKey.LABEL, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ListUnorderedItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ListUnorderedItem> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String icon_id;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String label;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "<init>", "()V", "icon_id", "", AnnotatedPrivateKey.LABEL, "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String icon_id;
                public String label;

                @Override // com.squareup.wire.Message.Builder
                public ListUnorderedItem build() {
                    return new ListUnorderedItem(this.icon_id, this.label, buildUnknownFields());
                }

                public final Builder icon_id(String icon_id) {
                    this.icon_id = icon_id;
                    return this;
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListUnorderedItem.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.icon_id);
                        protoAdapter2.encodeWithTag(writer, 2, value.label);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(2, value.label) + protoAdapter2.encodedSizeWithTag(1, value.icon_id) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem redact(MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem value) {
                        value.getClass();
                        return MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.label);
                        protoAdapter2.encodeWithTag(writer, 1, value.icon_id);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ListUnorderedItem(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ListUnorderedItem copy$default(ListUnorderedItem listUnorderedItem, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = listUnorderedItem.icon_id;
                }
                if ((i & 2) != 0) {
                    str2 = listUnorderedItem.label;
                }
                if ((i & 4) != 0) {
                    byteString = listUnorderedItem.unknownFields();
                }
                return listUnorderedItem.copy(str, str2, byteString);
            }

            public final ListUnorderedItem copy(String icon_id, String label, ByteString unknownFields) {
                unknownFields.getClass();
                return new ListUnorderedItem(icon_id, label, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ListUnorderedItem)) {
                    return false;
                }
                ListUnorderedItem listUnorderedItem = (ListUnorderedItem) other;
                return Intrinsics.areEqual(unknownFields(), listUnorderedItem.unknownFields()) && Intrinsics.areEqual(this.icon_id, listUnorderedItem.icon_id) && Intrinsics.areEqual(this.label, listUnorderedItem.label);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.icon_id;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.label;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.icon_id = this.icon_id;
                builder.label = this.label;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.icon_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
                }
                String str2 = this.label;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "label=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ListUnorderedItem{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ListUnorderedItem build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public ListUnorderedItem() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListUnorderedItem(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon_id = str;
                this.label = str2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ListUnorderedSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ListUnorderedSection(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public ListUnorderedSection() {
            this(null, null, 3, null);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MoneyTabBookletBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public MoneyTabBookletBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new MoneyTabBookletBlocker((String) obj, m, (String) obj2, (String) obj3, (BlockerAction) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        m.add(MoneyTabBookletBlocker.MoneyTabBookletSection.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MoneyTabBookletBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                MoneyTabBookletBlocker.MoneyTabBookletSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.sections);
                protoAdapter2.encodeWithTag(writer, 3, value.cta_label);
                protoAdapter2.encodeWithTag(writer, 4, value.cta_destination);
                BlockerAction.ADAPTER.encodeWithTag(writer, 5, value.cta_action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MoneyTabBookletBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return BlockerAction.ADAPTER.encodedSizeWithTag(5, value.cta_action) + protoAdapter2.encodedSizeWithTag(4, value.cta_destination) + protoAdapter2.encodedSizeWithTag(3, value.cta_label) + MoneyTabBookletBlocker.MoneyTabBookletSection.ADAPTER.asRepeated().encodedSizeWithTag(2, value.sections) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MoneyTabBookletBlocker redact(MoneyTabBookletBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.sections, MoneyTabBookletBlocker.MoneyTabBookletSection.ADAPTER);
                BlockerAction blockerAction = value.cta_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.cta_label;
                String str3 = value.cta_destination;
                byteString.getClass();
                return new MoneyTabBookletBlocker(str, m1169redactElements, str2, str3, blockerAction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerAction.ADAPTER.encodeWithTag(writer, 5, value.cta_action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.cta_destination);
                protoAdapter2.encodeWithTag(writer, 3, value.cta_label);
                MoneyTabBookletBlocker.MoneyTabBookletSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.sections);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabBookletBlocker(String str, List list, String str2, String str3, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.cta_label = str2;
        this.cta_destination = str3;
        this.cta_action = blockerAction;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneyTabBookletBlocker)) {
            return false;
        }
        MoneyTabBookletBlocker moneyTabBookletBlocker = (MoneyTabBookletBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), moneyTabBookletBlocker.unknownFields()) && Intrinsics.areEqual(this.title, moneyTabBookletBlocker.title) && Intrinsics.areEqual(this.sections, moneyTabBookletBlocker.sections) && Intrinsics.areEqual(this.cta_label, moneyTabBookletBlocker.cta_label) && Intrinsics.areEqual(this.cta_destination, moneyTabBookletBlocker.cta_destination) && Intrinsics.areEqual(this.cta_action, moneyTabBookletBlocker.cta_action);
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
        String str3 = this.cta_destination;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.cta_action;
        int hashCode4 = hashCode3 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.sections = this.sections;
        builder.cta_label = this.cta_label;
        builder.cta_destination = this.cta_destination;
        builder.cta_action = this.cta_action;
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
        String str3 = this.cta_destination;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cta_destination=", arrayList);
        }
        BlockerAction blockerAction = this.cta_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cta_action=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyTabBookletBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\bH\u0016JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0018R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "image_aspect_ratio", "", "title", "", "content", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CardSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String content;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float image_aspect_ratio;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "image_aspect_ratio", "", "Ljava/lang/Float;", "title", "", "content", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String content;
            public Image image;
            public Float image_aspect_ratio;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public CardSection build() {
                return new CardSection(this.image, this.image_aspect_ratio, this.title, this.content, buildUnknownFields());
            }

            public final Builder content(String content) {
                this.content = content;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder image_aspect_ratio(Float image_aspect_ratio) {
                this.image_aspect_ratio = image_aspect_ratio;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$CardSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.CardSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.CardSection((Image) obj, (Float) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.CardSection value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.image_aspect_ratio);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.title);
                    protoAdapter2.encodeWithTag(writer, 4, value.content);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.CardSection value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.image_aspect_ratio) + Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.content) + protoAdapter2.encodedSizeWithTag(3, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.CardSection redact(MoneyTabBookletBlocker.CardSection value) {
                    value.getClass();
                    Image image = value.image;
                    return MoneyTabBookletBlocker.CardSection.copy$default(value, image != null ? (Image) Image.ADAPTER.redact(image) : null, null, null, null, ByteString.EMPTY, 14, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.CardSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.content);
                    protoAdapter2.encodeWithTag(writer, 3, value.title);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.image_aspect_ratio);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CardSection(Image image, Float f, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CardSection copy$default(CardSection cardSection, Image image, Float f, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = cardSection.image;
            }
            if ((i & 2) != 0) {
                f = cardSection.image_aspect_ratio;
            }
            if ((i & 4) != 0) {
                str = cardSection.title;
            }
            if ((i & 8) != 0) {
                str2 = cardSection.content;
            }
            if ((i & 16) != 0) {
                byteString = cardSection.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str3 = str;
            return cardSection.copy(image, f, str3, str2, byteString2);
        }

        public final CardSection copy(Image image, Float image_aspect_ratio, String title, String content, ByteString unknownFields) {
            unknownFields.getClass();
            return new CardSection(image, image_aspect_ratio, title, content, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CardSection)) {
                return false;
            }
            CardSection cardSection = (CardSection) other;
            return Intrinsics.areEqual(unknownFields(), cardSection.unknownFields()) && Intrinsics.areEqual(this.image, cardSection.image) && Intrinsics.areEqual(this.image_aspect_ratio, cardSection.image_aspect_ratio) && Intrinsics.areEqual(this.title, cardSection.title) && Intrinsics.areEqual(this.content, cardSection.content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Float f = this.image_aspect_ratio;
            int hashCode3 = (hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            String str = this.title;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.content;
            int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.image_aspect_ratio = this.image_aspect_ratio;
            builder.title = this.title;
            builder.content = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Float f = this.image_aspect_ratio;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("image_aspect_ratio=", f, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.content;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "content=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CardSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CardSection() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardSection(Image image, Float f, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.image_aspect_ratio = f;
            this.title = str;
            this.content = str2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection$Builder;", "content", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DisclosureSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DisclosureSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String content;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection;", "<init>", "()V", "content", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String content;

            @Override // com.squareup.wire.Message.Builder
            public DisclosureSection build() {
                return new DisclosureSection(this.content, buildUnknownFields());
            }

            public final Builder content(String content) {
                this.content = content;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DisclosureSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$DisclosureSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.DisclosureSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.DisclosureSection((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.DisclosureSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.content);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.DisclosureSection value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.content) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.DisclosureSection redact(MoneyTabBookletBlocker.DisclosureSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.DisclosureSection.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.DisclosureSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.content);
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
                str = disclosureSection.content;
            }
            if ((i & 2) != 0) {
                byteString = disclosureSection.unknownFields();
            }
            return disclosureSection.copy(str, byteString);
        }

        public final DisclosureSection copy(String content, ByteString unknownFields) {
            unknownFields.getClass();
            return new DisclosureSection(content, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DisclosureSection)) {
                return false;
            }
            DisclosureSection disclosureSection = (DisclosureSection) other;
            return Intrinsics.areEqual(unknownFields(), disclosureSection.unknownFields()) && Intrinsics.areEqual(this.content, disclosureSection.content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.content;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.content = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.content;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "content=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DisclosureSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            this.content = str;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "image_aspect_ratio", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class HeroSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeroSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float image_aspect_ratio;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "image_aspect_ratio", "", "Ljava/lang/Float;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Image image;
            public Float image_aspect_ratio;

            @Override // com.squareup.wire.Message.Builder
            public HeroSection build() {
                return new HeroSection(this.image, this.image_aspect_ratio, buildUnknownFields());
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder image_aspect_ratio(Float image_aspect_ratio) {
                this.image_aspect_ratio = image_aspect_ratio;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HeroSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$HeroSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.HeroSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.HeroSection((Image) obj, (Float) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.FLOAT.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.HeroSection value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.image_aspect_ratio);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.HeroSection value) {
                    value.getClass();
                    return ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.image_aspect_ratio) + Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.HeroSection redact(MoneyTabBookletBlocker.HeroSection value) {
                    value.getClass();
                    Image image = value.image;
                    return MoneyTabBookletBlocker.HeroSection.copy$default(value, image != null ? (Image) Image.ADAPTER.redact(image) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.HeroSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.image_aspect_ratio);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ HeroSection(Image image, Float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : f, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ HeroSection copy$default(HeroSection heroSection, Image image, Float f, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = heroSection.image;
            }
            if ((i & 2) != 0) {
                f = heroSection.image_aspect_ratio;
            }
            if ((i & 4) != 0) {
                byteString = heroSection.unknownFields();
            }
            return heroSection.copy(image, f, byteString);
        }

        public final HeroSection copy(Image image, Float image_aspect_ratio, ByteString unknownFields) {
            unknownFields.getClass();
            return new HeroSection(image, image_aspect_ratio, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HeroSection)) {
                return false;
            }
            HeroSection heroSection = (HeroSection) other;
            return Intrinsics.areEqual(unknownFields(), heroSection.unknownFields()) && Intrinsics.areEqual(this.image, heroSection.image) && Intrinsics.areEqual(this.image_aspect_ratio, heroSection.image_aspect_ratio);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Float f = this.image_aspect_ratio;
            int hashCode3 = hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.image_aspect_ratio = this.image_aspect_ratio;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Float f = this.image_aspect_ratio;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("image_aspect_ratio=", f, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeroSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ HeroSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public HeroSection() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeroSection(Image image, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.image_aspect_ratio = f;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J,\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection$Builder;", "title", "", "list_unordered_items", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ListUnorderedCardSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ListUnorderedCardSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<ListUnorderedSection.ListUnorderedItem> list_unordered_items;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection;", "<init>", "()V", "title", "", "list_unordered_items", "", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection$ListUnorderedItem;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<ListUnorderedSection.ListUnorderedItem> list_unordered_items = EmptyList.INSTANCE;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public ListUnorderedCardSection build() {
                return new ListUnorderedCardSection(this.title, this.list_unordered_items, buildUnknownFields());
            }

            public final Builder list_unordered_items(List<ListUnorderedSection.ListUnorderedItem> list_unordered_items) {
                list_unordered_items.getClass();
                TransactorKt.checkElementsNotNull(list_unordered_items);
                this.list_unordered_items = list_unordered_items;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListUnorderedCardSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$ListUnorderedCardSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.ListUnorderedCardSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.ListUnorderedCardSection((String) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.ListUnorderedCardSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                    MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.list_unordered_items);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.ListUnorderedCardSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.asRepeated().encodedSizeWithTag(2, value.list_unordered_items) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.ListUnorderedCardSection redact(MoneyTabBookletBlocker.ListUnorderedCardSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.ListUnorderedCardSection.copy$default(value, null, TransactorKt.m1169redactElements(value.list_unordered_items, MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER), ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.ListUnorderedCardSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.list_unordered_items);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListUnorderedCardSection(String str, List<ListUnorderedSection.ListUnorderedItem> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.list_unordered_items = TransactorKt.immutableCopyOf("list_unordered_items", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListUnorderedCardSection copy$default(ListUnorderedCardSection listUnorderedCardSection, String str, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = listUnorderedCardSection.title;
            }
            if ((i & 2) != 0) {
                list = listUnorderedCardSection.list_unordered_items;
            }
            if ((i & 4) != 0) {
                byteString = listUnorderedCardSection.unknownFields();
            }
            return listUnorderedCardSection.copy(str, list, byteString);
        }

        public final ListUnorderedCardSection copy(String title, List<ListUnorderedSection.ListUnorderedItem> list_unordered_items, ByteString unknownFields) {
            list_unordered_items.getClass();
            unknownFields.getClass();
            return new ListUnorderedCardSection(title, list_unordered_items, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ListUnorderedCardSection)) {
                return false;
            }
            ListUnorderedCardSection listUnorderedCardSection = (ListUnorderedCardSection) other;
            return Intrinsics.areEqual(unknownFields(), listUnorderedCardSection.unknownFields()) && Intrinsics.areEqual(this.title, listUnorderedCardSection.title) && Intrinsics.areEqual(this.list_unordered_items, listUnorderedCardSection.list_unordered_items);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = this.list_unordered_items.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.list_unordered_items = this.list_unordered_items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            if (!this.list_unordered_items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("list_unordered_items=", arrayList, this.list_unordered_items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ListUnorderedCardSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ListUnorderedCardSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ListUnorderedCardSection(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public ListUnorderedCardSection() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Builder;", "type", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Type", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class MoneyTabBookletSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MoneyTabBookletSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Type type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection;", "<init>", "()V", "type", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Type type;

            @Override // com.squareup.wire.Message.Builder
            public MoneyTabBookletSection build() {
                return new MoneyTabBookletSection(this.type, buildUnknownFields());
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MoneyTabBookletSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MoneyTabBookletBlocker$MoneyTabBookletSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.MoneyTabBookletSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    MoneyTabBookletBlocker.MoneyTabBookletSection.Type type2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MoneyTabBookletBlocker.MoneyTabBookletSection(type2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                type2 = new MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero((MoneyTabBookletBlocker.HeroSection) MoneyTabBookletBlocker.HeroSection.ADAPTER.decode(reader));
                                break;
                            case 2:
                                type2 = new MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header((MoneyTabBookletBlocker.HeaderSection) MoneyTabBookletBlocker.HeaderSection.ADAPTER.decode(reader));
                                break;
                            case 3:
                                type2 = new MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card((MoneyTabBookletBlocker.CardSection) MoneyTabBookletBlocker.CardSection.ADAPTER.decode(reader));
                                break;
                            case 4:
                                type2 = new MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails((MoneyTabBookletBlocker.CollapsibleDetailsSection) MoneyTabBookletBlocker.CollapsibleDetailsSection.ADAPTER.decode(reader));
                                break;
                            case 5:
                                type2 = new MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered((MoneyTabBookletBlocker.ListUnorderedSection) MoneyTabBookletBlocker.ListUnorderedSection.ADAPTER.decode(reader));
                                break;
                            case 6:
                                type2 = new MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard((MoneyTabBookletBlocker.ListUnorderedCardSection) MoneyTabBookletBlocker.ListUnorderedCardSection.ADAPTER.decode(reader));
                                break;
                            case 7:
                                type2 = new MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure((MoneyTabBookletBlocker.DisclosureSection) MoneyTabBookletBlocker.DisclosureSection.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MoneyTabBookletBlocker.MoneyTabBookletSection value) {
                    writer.getClass();
                    value.getClass();
                    MoneyTabBookletBlocker.MoneyTabBookletSection.Type type2 = value.type;
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) {
                        MoneyTabBookletBlocker.HeroSection.ADAPTER.encodeWithTag(writer, 1, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) {
                        MoneyTabBookletBlocker.HeaderSection.ADAPTER.encodeWithTag(writer, 2, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) {
                        MoneyTabBookletBlocker.CardSection.ADAPTER.encodeWithTag(writer, 3, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) {
                        MoneyTabBookletBlocker.CollapsibleDetailsSection.ADAPTER.encodeWithTag(writer, 4, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) {
                        MoneyTabBookletBlocker.ListUnorderedSection.ADAPTER.encodeWithTag(writer, 5, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) {
                        MoneyTabBookletBlocker.ListUnorderedCardSection.ADAPTER.encodeWithTag(writer, 6, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure) {
                        MoneyTabBookletBlocker.DisclosureSection.ADAPTER.encodeWithTag(writer, 7, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure) type2).getValue());
                    } else if (type2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MoneyTabBookletBlocker.MoneyTabBookletSection value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    MoneyTabBookletBlocker.MoneyTabBookletSection.Type type2 = value.type;
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) {
                        encodedSizeWithTag = MoneyTabBookletBlocker.HeroSection.ADAPTER.encodedSizeWithTag(1, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) {
                        encodedSizeWithTag = MoneyTabBookletBlocker.HeaderSection.ADAPTER.encodedSizeWithTag(2, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) {
                        encodedSizeWithTag = MoneyTabBookletBlocker.CardSection.ADAPTER.encodedSizeWithTag(3, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) {
                        encodedSizeWithTag = MoneyTabBookletBlocker.CollapsibleDetailsSection.ADAPTER.encodedSizeWithTag(4, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) {
                        encodedSizeWithTag = MoneyTabBookletBlocker.ListUnorderedSection.ADAPTER.encodedSizeWithTag(5, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) {
                        encodedSizeWithTag = MoneyTabBookletBlocker.ListUnorderedCardSection.ADAPTER.encodedSizeWithTag(6, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) type2).getValue());
                    } else {
                        if (!(type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure)) {
                            if (type2 == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = MoneyTabBookletBlocker.DisclosureSection.ADAPTER.encodedSizeWithTag(7, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure) type2).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MoneyTabBookletBlocker.MoneyTabBookletSection redact(MoneyTabBookletBlocker.MoneyTabBookletSection value) {
                    value.getClass();
                    return MoneyTabBookletBlocker.MoneyTabBookletSection.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MoneyTabBookletBlocker.MoneyTabBookletSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    MoneyTabBookletBlocker.MoneyTabBookletSection.Type type2 = value.type;
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) {
                        MoneyTabBookletBlocker.HeroSection.ADAPTER.encodeWithTag(writer, 1, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) type2).getValue());
                        return;
                    }
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) {
                        MoneyTabBookletBlocker.HeaderSection.ADAPTER.encodeWithTag(writer, 2, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) type2).getValue());
                        return;
                    }
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) {
                        MoneyTabBookletBlocker.CardSection.ADAPTER.encodeWithTag(writer, 3, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) type2).getValue());
                        return;
                    }
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) {
                        MoneyTabBookletBlocker.CollapsibleDetailsSection.ADAPTER.encodeWithTag(writer, 4, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) type2).getValue());
                        return;
                    }
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) {
                        MoneyTabBookletBlocker.ListUnorderedSection.ADAPTER.encodeWithTag(writer, 5, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) type2).getValue());
                        return;
                    }
                    if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) {
                        MoneyTabBookletBlocker.ListUnorderedCardSection.ADAPTER.encodeWithTag(writer, 6, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) type2).getValue());
                    } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure) {
                        MoneyTabBookletBlocker.DisclosureSection.ADAPTER.encodeWithTag(writer, 7, ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure) type2).getValue());
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

        public /* synthetic */ MoneyTabBookletSection(Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ MoneyTabBookletSection copy$default(MoneyTabBookletSection moneyTabBookletSection, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = moneyTabBookletSection.type;
            }
            if ((i & 2) != 0) {
                byteString = moneyTabBookletSection.unknownFields();
            }
            return moneyTabBookletSection.copy(type2, byteString);
        }

        public final MoneyTabBookletSection copy(Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new MoneyTabBookletSection(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MoneyTabBookletSection)) {
                return false;
            }
            MoneyTabBookletSection moneyTabBookletSection = (MoneyTabBookletSection) other;
            return Intrinsics.areEqual(unknownFields(), moneyTabBookletSection.unknownFields()) && Intrinsics.areEqual(this.type, moneyTabBookletSection.type);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyTabBookletSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ MoneyTabBookletSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "", "<init>", "()V", "Hero", "Header", "Card", "CollapsibleDetails", "ListUnordered", "ListUnorderedCard", "Disclosure", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Card;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$CollapsibleDetails;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Disclosure;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Header;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Hero;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$ListUnordered;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$ListUnorderedCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Type {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$CardSection#ADAPTER", declaredName = "card", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Card;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "value", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CardSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Card extends Type {
                private final CardSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Card(CardSection cardSection) {
                    super(null);
                    cardSection.getClass();
                    this.value = cardSection;
                }

                public static /* synthetic */ Card copy$default(Card card, CardSection cardSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        cardSection = card.value;
                    }
                    return card.copy(cardSection);
                }

                /* renamed from: component1, reason: from getter */
                public final CardSection getValue() {
                    return this.value;
                }

                public final Card copy(CardSection value) {
                    value.getClass();
                    return new Card(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Card) && Intrinsics.areEqual(this.value, ((Card) other).value);
                }

                public final CardSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Card(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$CollapsibleDetailsSection#ADAPTER", declaredName = "collapsible_details", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$CollapsibleDetails;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "value", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$CollapsibleDetailsSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$DisclosureSection#ADAPTER", declaredName = "disclosure", tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Disclosure;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "value", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$DisclosureSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$HeaderSection#ADAPTER", declaredName = "header", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Header;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "value", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeaderSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$HeroSection#ADAPTER", declaredName = "hero", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$Hero;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "value", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$HeroSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Hero extends Type {
                private final HeroSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Hero(HeroSection heroSection) {
                    super(null);
                    heroSection.getClass();
                    this.value = heroSection;
                }

                public static /* synthetic */ Hero copy$default(Hero hero, HeroSection heroSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        heroSection = hero.value;
                    }
                    return hero.copy(heroSection);
                }

                /* renamed from: component1, reason: from getter */
                public final HeroSection getValue() {
                    return this.value;
                }

                public final Hero copy(HeroSection value) {
                    value.getClass();
                    return new Hero(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Hero) && Intrinsics.areEqual(this.value, ((Hero) other).value);
                }

                public final HeroSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Hero(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$ListUnorderedSection#ADAPTER", declaredName = "list_unordered", tag = 5)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$ListUnordered;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "value", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ListUnordered extends Type {
                private final ListUnorderedSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ListUnordered(ListUnorderedSection listUnorderedSection) {
                    super(null);
                    listUnorderedSection.getClass();
                    this.value = listUnorderedSection;
                }

                public static /* synthetic */ ListUnordered copy$default(ListUnordered listUnordered, ListUnorderedSection listUnorderedSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        listUnorderedSection = listUnordered.value;
                    }
                    return listUnordered.copy(listUnorderedSection);
                }

                /* renamed from: component1, reason: from getter */
                public final ListUnorderedSection getValue() {
                    return this.value;
                }

                public final ListUnordered copy(ListUnorderedSection value) {
                    value.getClass();
                    return new ListUnordered(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ListUnordered) && Intrinsics.areEqual(this.value, ((ListUnordered) other).value);
                }

                public final ListUnorderedSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ListUnordered(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.MoneyTabBookletBlocker$ListUnorderedCardSection#ADAPTER", declaredName = "list_unordered_card", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type$ListUnorderedCard;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$MoneyTabBookletSection$Type;", "value", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection;", "<init>", "(Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection;)V", "getValue", "()Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$ListUnorderedCardSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ListUnorderedCard extends Type {
                private final ListUnorderedCardSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ListUnorderedCard(ListUnorderedCardSection listUnorderedCardSection) {
                    super(null);
                    listUnorderedCardSection.getClass();
                    this.value = listUnorderedCardSection;
                }

                public static /* synthetic */ ListUnorderedCard copy$default(ListUnorderedCard listUnorderedCard, ListUnorderedCardSection listUnorderedCardSection, int i, Object obj) {
                    if ((i & 1) != 0) {
                        listUnorderedCardSection = listUnorderedCard.value;
                    }
                    return listUnorderedCard.copy(listUnorderedCardSection);
                }

                /* renamed from: component1, reason: from getter */
                public final ListUnorderedCardSection getValue() {
                    return this.value;
                }

                public final ListUnorderedCard copy(ListUnorderedCardSection value) {
                    value.getClass();
                    return new ListUnorderedCard(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ListUnorderedCard) && Intrinsics.areEqual(this.value, ((ListUnorderedCard) other).value);
                }

                public final ListUnorderedCardSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ListUnorderedCard(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Type() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MoneyTabBookletSection() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoneyTabBookletSection(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = type2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MoneyTabBookletBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MoneyTabBookletBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
