package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u0014\u0016\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$Builder;", "Lcom/squareup/protos/cash/ui/Image;", "header_image", "Lcom/squareup/protos/cash/ui/Image;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "primary_button_blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "faqs_section_title", "disclosure", "", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem;", "list_items", "Ljava/util/List;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem;", "faq_items", "Companion", "Builder", "ListItem", "FAQItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrepurchaseCashCardFAQBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PrepurchaseCashCardFAQBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 6, tag = 7)
    public final LocalizedString disclosure;

    @WireField(adapter = "com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker$FAQItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    public final List<FAQItem> faq_items;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
    public final LocalizedString faqs_section_title;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
    public final Image header_image;

    @WireField(adapter = "com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker$ListItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ListItem> list_items;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 3, tag = 4)
    public final BlockerAction primary_button_blocker_action;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString title;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker;", "<init>", "()V", "header_image", "Lcom/squareup/protos/cash/ui/Image;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "list_items", "", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem;", "primary_button_blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "faqs_section_title", "faq_items", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem;", "disclosure", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public LocalizedString disclosure;
        public List<FAQItem> faq_items;
        public LocalizedString faqs_section_title;
        public Image header_image;
        public List<ListItem> list_items;
        public BlockerAction primary_button_blocker_action;
        public LocalizedString title;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.list_items = emptyList;
            this.faq_items = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public PrepurchaseCashCardFAQBlocker build() {
            return new PrepurchaseCashCardFAQBlocker(this.header_image, this.title, this.list_items, this.primary_button_blocker_action, this.faqs_section_title, this.faq_items, this.disclosure, buildUnknownFields());
        }

        public final Builder disclosure(LocalizedString disclosure) {
            this.disclosure = disclosure;
            return this;
        }

        public final Builder faq_items(List<FAQItem> faq_items) {
            faq_items.getClass();
            TransactorKt.checkElementsNotNull(faq_items);
            this.faq_items = faq_items;
            return this;
        }

        public final Builder faqs_section_title(LocalizedString faqs_section_title) {
            this.faqs_section_title = faqs_section_title;
            return this;
        }

        public final Builder header_image(Image header_image) {
            this.header_image = header_image;
            return this;
        }

        public final Builder list_items(List<ListItem> list_items) {
            list_items.getClass();
            TransactorKt.checkElementsNotNull(list_items);
            this.list_items = list_items;
            return this;
        }

        public final Builder primary_button_blocker_action(BlockerAction primary_button_blocker_action) {
            this.primary_button_blocker_action = primary_button_blocker_action;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$Builder;", "item_type", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "ItemType", "Companion", "ExpandableItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FAQItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FAQItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final ItemType item_type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem;", "<init>", "()V", "item_type", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ItemType item_type;

            @Override // com.squareup.wire.Message.Builder
            public FAQItem build() {
                return new FAQItem(this.item_type, buildUnknownFields());
            }

            public final Builder item_type(ItemType item_type) {
                this.item_type = item_type;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FAQItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker$FAQItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PrepurchaseCashCardFAQBlocker.FAQItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PrepurchaseCashCardFAQBlocker.FAQItem(itemType, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            itemType = new PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText((LocalizedString) LocalizedString.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            itemType = new PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem((PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem) PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PrepurchaseCashCardFAQBlocker.FAQItem value) {
                    writer.getClass();
                    value.getClass();
                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType = value.item_type;
                    if (itemType instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) {
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, ((PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) itemType).getValue());
                    } else if (itemType instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) {
                        PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem.ADAPTER.encodeWithTag(writer, 2, ((PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) itemType).getValue());
                    } else if (itemType != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PrepurchaseCashCardFAQBlocker.FAQItem value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType = value.item_type;
                    if (itemType instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) {
                        encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, ((PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) itemType).getValue());
                    } else {
                        if (!(itemType instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem)) {
                            if (itemType == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem.ADAPTER.encodedSizeWithTag(2, ((PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) itemType).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PrepurchaseCashCardFAQBlocker.FAQItem redact(PrepurchaseCashCardFAQBlocker.FAQItem value) {
                    value.getClass();
                    return PrepurchaseCashCardFAQBlocker.FAQItem.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PrepurchaseCashCardFAQBlocker.FAQItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType = value.item_type;
                    if (itemType instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) {
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, ((PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) itemType).getValue());
                    } else if (itemType instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) {
                        PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem.ADAPTER.encodeWithTag(writer, 2, ((PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) itemType).getValue());
                    } else {
                        if (itemType == null) {
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

        public /* synthetic */ FAQItem(ItemType itemType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : itemType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ FAQItem copy$default(FAQItem fAQItem, ItemType itemType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                itemType = fAQItem.item_type;
            }
            if ((i & 2) != 0) {
                byteString = fAQItem.unknownFields();
            }
            return fAQItem.copy(itemType, byteString);
        }

        public final FAQItem copy(ItemType item_type, ByteString unknownFields) {
            unknownFields.getClass();
            return new FAQItem(item_type, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FAQItem)) {
                return false;
            }
            FAQItem fAQItem = (FAQItem) other;
            return Intrinsics.areEqual(unknownFields(), fAQItem.unknownFields()) && Intrinsics.areEqual(this.item_type, fAQItem.item_type);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ItemType itemType = this.item_type;
            int hashCode2 = hashCode + (itemType != null ? itemType.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.item_type = this.item_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            ItemType itemType = this.item_type;
            if (itemType != null) {
                arrayList.add("item_type=" + itemType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FAQItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem$Builder;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "expanded_body_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ExpandableItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ExpandableItem> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
            public final LocalizedString expanded_body_text;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString title_text;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem;", "<init>", "()V", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "expanded_body_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public LocalizedString expanded_body_text;
                public LocalizedString title_text;

                @Override // com.squareup.wire.Message.Builder
                public ExpandableItem build() {
                    return new ExpandableItem(this.title_text, this.expanded_body_text, buildUnknownFields());
                }

                public final Builder expanded_body_text(LocalizedString expanded_body_text) {
                    this.expanded_body_text = expanded_body_text;
                    return this;
                }

                public final Builder title_text(LocalizedString title_text) {
                    this.title_text = title_text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ExpandableItem.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem((LocalizedString) obj, (LocalizedString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                        protoAdapter2.encodeWithTag(writer, 2, value.expanded_body_text);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        return protoAdapter2.encodedSizeWithTag(2, value.expanded_body_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem redact(PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem value) {
                        value.getClass();
                        LocalizedString localizedString = value.title_text;
                        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                        LocalizedString localizedString3 = value.expanded_body_text;
                        return value.copy(localizedString2, localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 2, value.expanded_body_text);
                        protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ExpandableItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ExpandableItem copy$default(ExpandableItem expandableItem, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = expandableItem.title_text;
                }
                if ((i & 2) != 0) {
                    localizedString2 = expandableItem.expanded_body_text;
                }
                if ((i & 4) != 0) {
                    byteString = expandableItem.unknownFields();
                }
                return expandableItem.copy(localizedString, localizedString2, byteString);
            }

            public final ExpandableItem copy(LocalizedString title_text, LocalizedString expanded_body_text, ByteString unknownFields) {
                unknownFields.getClass();
                return new ExpandableItem(title_text, expanded_body_text, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ExpandableItem)) {
                    return false;
                }
                ExpandableItem expandableItem = (ExpandableItem) other;
                return Intrinsics.areEqual(unknownFields(), expandableItem.unknownFields()) && Intrinsics.areEqual(this.title_text, expandableItem.title_text) && Intrinsics.areEqual(this.expanded_body_text, expandableItem.expanded_body_text);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.expanded_body_text;
                int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title_text = this.title_text;
                builder.expanded_body_text = this.expanded_body_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.expanded_body_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("expanded_body_text=", localizedString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ExpandableItem{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ExpandableItem build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public ExpandableItem() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpandableItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title_text = localizedString;
                this.expanded_body_text = localizedString2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ FAQItem build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType;", "", "<init>", "()V", "HeaderText", "ExpandableItem", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType$ExpandableItem;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType$HeaderText;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class ItemType {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem#ADAPTER", declaredName = "expandable_item", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType$ExpandableItem;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType;", "value", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem;", "<init>", "(Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem;)V", "getValue", "()Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ExpandableItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ExpandableItem extends ItemType {
                private final ExpandableItem value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ExpandableItem(ExpandableItem expandableItem) {
                    super(null);
                    expandableItem.getClass();
                    this.value = expandableItem;
                }

                public static /* synthetic */ ExpandableItem copy$default(ExpandableItem expandableItem, ExpandableItem expandableItem2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        expandableItem2 = expandableItem.value;
                    }
                    return expandableItem.copy(expandableItem2);
                }

                /* renamed from: component1, reason: from getter */
                public final ExpandableItem getValue() {
                    return this.value;
                }

                public final ExpandableItem copy(ExpandableItem value) {
                    value.getClass();
                    return new ExpandableItem(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ExpandableItem) && Intrinsics.areEqual(this.value, ((ExpandableItem) other).value);
                }

                public final ExpandableItem getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ExpandableItem(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", declaredName = "header_text", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType$HeaderText;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$FAQItem$ItemType;", "value", "Lcom/squareup/protos/cash/localization/LocalizedString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;)V", "getValue", "()Lcom/squareup/protos/cash/localization/LocalizedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class HeaderText extends ItemType {
                private final LocalizedString value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HeaderText(LocalizedString localizedString) {
                    super(null);
                    localizedString.getClass();
                    this.value = localizedString;
                }

                public static /* synthetic */ HeaderText copy$default(HeaderText headerText, LocalizedString localizedString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        localizedString = headerText.value;
                    }
                    return headerText.copy(localizedString);
                }

                /* renamed from: component1, reason: from getter */
                public final LocalizedString getValue() {
                    return this.value;
                }

                public final HeaderText copy(LocalizedString value) {
                    value.getClass();
                    return new HeaderText(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof HeaderText) && Intrinsics.areEqual(this.value, ((HeaderText) other).value);
                }

                public final LocalizedString getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "HeaderText(value=" + this.value + ")";
                }
            }

            public /* synthetic */ ItemType(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ItemType() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FAQItem() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FAQItem(ItemType itemType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.item_type = itemType;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PrepurchaseCashCardFAQBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PrepurchaseCashCardFAQBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PrepurchaseCashCardFAQBlocker((Image) obj, (LocalizedString) obj2, m, (BlockerAction) obj3, (LocalizedString) obj4, arrayList, (LocalizedString) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            m.add(PrepurchaseCashCardFAQBlocker.ListItem.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj3 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj3);
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                            break;
                        case 6:
                            arrayList.add(PrepurchaseCashCardFAQBlocker.FAQItem.ADAPTER.decode(reader));
                            break;
                        case 7:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj5);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PrepurchaseCashCardFAQBlocker value) {
                writer.getClass();
                value.getClass();
                Image.ADAPTER.encodeWithTag(writer, 1, value.header_image);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                PrepurchaseCashCardFAQBlocker.ListItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.list_items);
                BlockerAction.ADAPTER.encodeWithTag(writer, 4, value.primary_button_blocker_action);
                protoAdapter2.encodeWithTag(writer, 5, value.faqs_section_title);
                PrepurchaseCashCardFAQBlocker.FAQItem.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.faq_items);
                protoAdapter2.encodeWithTag(writer, 7, value.disclosure);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PrepurchaseCashCardFAQBlocker value) {
                value.getClass();
                int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.header_image) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(7, value.disclosure) + PrepurchaseCashCardFAQBlocker.FAQItem.ADAPTER.asRepeated().encodedSizeWithTag(6, value.faq_items) + protoAdapter2.encodedSizeWithTag(5, value.faqs_section_title) + BlockerAction.ADAPTER.encodedSizeWithTag(4, value.primary_button_blocker_action) + PrepurchaseCashCardFAQBlocker.ListItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.list_items) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrepurchaseCashCardFAQBlocker redact(PrepurchaseCashCardFAQBlocker value) {
                value.getClass();
                Image image = value.header_image;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                LocalizedString localizedString = value.title;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.list_items, PrepurchaseCashCardFAQBlocker.ListItem.ADAPTER);
                BlockerAction blockerAction = value.primary_button_blocker_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                LocalizedString localizedString3 = value.faqs_section_title;
                LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.faq_items, PrepurchaseCashCardFAQBlocker.FAQItem.ADAPTER);
                LocalizedString localizedString5 = value.disclosure;
                LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new PrepurchaseCashCardFAQBlocker(image2, localizedString2, m1169redactElements, blockerAction2, localizedString4, m1169redactElements2, localizedString6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PrepurchaseCashCardFAQBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 7, value.disclosure);
                PrepurchaseCashCardFAQBlocker.FAQItem.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.faq_items);
                protoAdapter2.encodeWithTag(writer, 5, value.faqs_section_title);
                BlockerAction.ADAPTER.encodeWithTag(writer, 4, value.primary_button_blocker_action);
                PrepurchaseCashCardFAQBlocker.ListItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.list_items);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                Image.ADAPTER.encodeWithTag(writer, 1, value.header_image);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepurchaseCashCardFAQBlocker(Image image, LocalizedString localizedString, List list, BlockerAction blockerAction, LocalizedString localizedString2, List list2, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.header_image = image;
        this.title = localizedString;
        this.primary_button_blocker_action = blockerAction;
        this.faqs_section_title = localizedString2;
        this.disclosure = localizedString3;
        this.list_items = TransactorKt.immutableCopyOf("list_items", list);
        this.faq_items = TransactorKt.immutableCopyOf("faq_items", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCashCardFAQBlocker)) {
            return false;
        }
        PrepurchaseCashCardFAQBlocker prepurchaseCashCardFAQBlocker = (PrepurchaseCashCardFAQBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), prepurchaseCashCardFAQBlocker.unknownFields()) && Intrinsics.areEqual(this.header_image, prepurchaseCashCardFAQBlocker.header_image) && Intrinsics.areEqual(this.title, prepurchaseCashCardFAQBlocker.title) && Intrinsics.areEqual(this.list_items, prepurchaseCashCardFAQBlocker.list_items) && Intrinsics.areEqual(this.primary_button_blocker_action, prepurchaseCashCardFAQBlocker.primary_button_blocker_action) && Intrinsics.areEqual(this.faqs_section_title, prepurchaseCashCardFAQBlocker.faqs_section_title) && Intrinsics.areEqual(this.faq_items, prepurchaseCashCardFAQBlocker.faq_items) && Intrinsics.areEqual(this.disclosure, prepurchaseCashCardFAQBlocker.disclosure);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.header_image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.list_items);
        BlockerAction blockerAction = this.primary_button_blocker_action;
        int hashCode3 = (m + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.faqs_section_title;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.faq_items);
        LocalizedString localizedString3 = this.disclosure;
        int hashCode4 = m2 + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header_image = this.header_image;
        builder.title = this.title;
        builder.list_items = this.list_items;
        builder.primary_button_blocker_action = this.primary_button_blocker_action;
        builder.faqs_section_title = this.faqs_section_title;
        builder.faq_items = this.faq_items;
        builder.disclosure = this.disclosure;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.header_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("header_image=", image, arrayList);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        if (!this.list_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("list_items=", arrayList, this.list_items);
        }
        BlockerAction blockerAction = this.primary_button_blocker_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_button_blocker_action=", blockerAction, arrayList);
        }
        LocalizedString localizedString2 = this.faqs_section_title;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("faqs_section_title=", localizedString2, arrayList);
        }
        if (!this.faq_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("faq_items=", arrayList, this.faq_items);
        }
        LocalizedString localizedString3 = this.disclosure;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("disclosure=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepurchaseCashCardFAQBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ListItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ListItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString subtitle;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString subtitle;
            public LocalizedString title;

            @Override // com.squareup.wire.Message.Builder
            public ListItem build() {
                return new ListItem(this.title, this.subtitle, buildUnknownFields());
            }

            public final Builder subtitle(LocalizedString subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder title(LocalizedString title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker$ListItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PrepurchaseCashCardFAQBlocker.ListItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PrepurchaseCashCardFAQBlocker.ListItem((LocalizedString) obj, (LocalizedString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, PrepurchaseCashCardFAQBlocker.ListItem value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PrepurchaseCashCardFAQBlocker.ListItem value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PrepurchaseCashCardFAQBlocker.ListItem redact(PrepurchaseCashCardFAQBlocker.ListItem value) {
                    value.getClass();
                    LocalizedString localizedString = value.title;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.subtitle;
                    return value.copy(localizedString2, localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PrepurchaseCashCardFAQBlocker.ListItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
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
                localizedString = listItem.title;
            }
            if ((i & 2) != 0) {
                localizedString2 = listItem.subtitle;
            }
            if ((i & 4) != 0) {
                byteString = listItem.unknownFields();
            }
            return listItem.copy(localizedString, localizedString2, byteString);
        }

        public final ListItem copy(LocalizedString title, LocalizedString subtitle, ByteString unknownFields) {
            unknownFields.getClass();
            return new ListItem(title, subtitle, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ListItem)) {
                return false;
            }
            ListItem listItem = (ListItem) other;
            return Intrinsics.areEqual(unknownFields(), listItem.unknownFields()) && Intrinsics.areEqual(this.title, listItem.title) && Intrinsics.areEqual(this.subtitle, listItem.subtitle);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ListItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$ListItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            this.title = localizedString;
            this.subtitle = localizedString2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PrepurchaseCashCardFAQBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PrepurchaseCashCardFAQBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
