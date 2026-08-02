package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0016\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/MenuItem;", "menu_item_bank_account", "Lcom/squareup/protos/franklin/common/scenarios/MenuItem;", "menu_item_skip", "", "main_text", "Ljava/lang/String;", "card_number_hint_text", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig;", "bank_account_linking_config", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig;", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$LinkedCardInputVariant;", "linked_card_input_variant", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$LinkedCardInputVariant;", "", "should_upload_ocr_payload", "Ljava/lang/Boolean;", "treatment", "should_upload_ocr_scan_image", "Companion", "Builder", "LinkedCardInputVariant", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig#ADAPTER", schemaIndex = 4, tag = 6)
    public final BankAccountLinkingConfig bank_account_linking_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String card_number_hint_text;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement$LinkedCardInputVariant#ADAPTER", schemaIndex = 5, tag = 7)
    public final LinkedCardInputVariant linked_card_input_variant;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String main_text;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.MenuItem#ADAPTER", schemaIndex = 0, tag = 1)
    public final MenuItem menu_item_bank_account;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.MenuItem#ADAPTER", schemaIndex = 1, tag = 2)
    public final MenuItem menu_item_skip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 8)
    public final Boolean should_upload_ocr_payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 10)
    public final Boolean should_upload_ocr_scan_image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 9)
    public final String treatment;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement;", "<init>", "()V", "menu_item_bank_account", "Lcom/squareup/protos/franklin/common/scenarios/MenuItem;", "menu_item_skip", "main_text", "", "card_number_hint_text", "bank_account_linking_config", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig;", "linked_card_input_variant", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$LinkedCardInputVariant;", "should_upload_ocr_payload", "", "Ljava/lang/Boolean;", "treatment", "should_upload_ocr_scan_image", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public BankAccountLinkingConfig bank_account_linking_config;
        public String card_number_hint_text;
        public LinkedCardInputVariant linked_card_input_variant;
        public String main_text;
        public MenuItem menu_item_bank_account;
        public MenuItem menu_item_skip;
        public Boolean should_upload_ocr_payload;
        public Boolean should_upload_ocr_scan_image;
        public String treatment;

        public final Builder bank_account_linking_config(BankAccountLinkingConfig bank_account_linking_config) {
            this.bank_account_linking_config = bank_account_linking_config;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CardBlockerSupplement build() {
            return new CardBlockerSupplement(this.menu_item_bank_account, this.menu_item_skip, this.main_text, this.card_number_hint_text, this.bank_account_linking_config, this.linked_card_input_variant, this.should_upload_ocr_payload, this.treatment, this.should_upload_ocr_scan_image, buildUnknownFields());
        }

        public final Builder card_number_hint_text(String card_number_hint_text) {
            this.card_number_hint_text = card_number_hint_text;
            return this;
        }

        public final Builder linked_card_input_variant(LinkedCardInputVariant linked_card_input_variant) {
            this.linked_card_input_variant = linked_card_input_variant;
            return this;
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder menu_item_bank_account(MenuItem menu_item_bank_account) {
            this.menu_item_bank_account = menu_item_bank_account;
            return this;
        }

        public final Builder menu_item_skip(MenuItem menu_item_skip) {
            this.menu_item_skip = menu_item_skip;
            return this;
        }

        public final Builder should_upload_ocr_payload(Boolean should_upload_ocr_payload) {
            this.should_upload_ocr_payload = should_upload_ocr_payload;
            return this;
        }

        public final Builder should_upload_ocr_scan_image(Boolean should_upload_ocr_scan_image) {
            this.should_upload_ocr_scan_image = should_upload_ocr_scan_image;
            return this;
        }

        public final Builder treatment(String treatment) {
            this.treatment = treatment;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CardBlockerSupplement decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CardBlockerSupplement((MenuItem) obj3, (MenuItem) obj4, (String) obj5, (String) obj6, (BankAccountLinkingConfig) obj7, (CardBlockerSupplement.LinkedCardInputVariant) obj8, (Boolean) obj9, (String) obj10, (Boolean) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, reader, obj3);
                            continue;
                        case 2:
                            obj4 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, reader, obj4);
                            continue;
                        case 3:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 4:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 5:
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj5;
                            obj2 = obj6;
                            break;
                        case 6:
                            obj7 = TransactorKt.decodeMessageOrMerge(BankAccountLinkingConfig.ADAPTER, reader, obj7);
                            continue;
                        case 7:
                            try {
                                obj8 = CardBlockerSupplement.LinkedCardInputVariant.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj5;
                                obj2 = obj6;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            obj9 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 9:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 10:
                            obj11 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                    }
                    obj5 = obj;
                    obj6 = obj2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CardBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = MenuItem.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.menu_item_bank_account);
                protoAdapter2.encodeWithTag(writer, 2, value.menu_item_skip);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 3, value.main_text);
                protoAdapter3.encodeWithTag(writer, 4, value.card_number_hint_text);
                BankAccountLinkingConfig.ADAPTER.encodeWithTag(writer, 6, value.bank_account_linking_config);
                CardBlockerSupplement.LinkedCardInputVariant.ADAPTER.encodeWithTag(writer, 7, value.linked_card_input_variant);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 8, value.should_upload_ocr_payload);
                protoAdapter3.encodeWithTag(writer, 9, value.treatment);
                protoAdapter4.encodeWithTag(writer, 10, value.should_upload_ocr_scan_image);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CardBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = MenuItem.ADAPTER;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.menu_item_skip) + protoAdapter2.encodedSizeWithTag(1, value.menu_item_bank_account) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = CardBlockerSupplement.LinkedCardInputVariant.ADAPTER.encodedSizeWithTag(7, value.linked_card_input_variant) + BankAccountLinkingConfig.ADAPTER.encodedSizeWithTag(6, value.bank_account_linking_config) + protoAdapter3.encodedSizeWithTag(4, value.card_number_hint_text) + protoAdapter3.encodedSizeWithTag(3, value.main_text) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                return protoAdapter4.encodedSizeWithTag(10, value.should_upload_ocr_scan_image) + protoAdapter3.encodedSizeWithTag(9, value.treatment) + protoAdapter4.encodedSizeWithTag(8, value.should_upload_ocr_payload) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CardBlockerSupplement redact(CardBlockerSupplement value) {
                value.getClass();
                MenuItem menuItem = value.menu_item_bank_account;
                MenuItem menuItem2 = menuItem != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem) : null;
                MenuItem menuItem3 = value.menu_item_skip;
                MenuItem menuItem4 = menuItem3 != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem3) : null;
                BankAccountLinkingConfig bankAccountLinkingConfig = value.bank_account_linking_config;
                BankAccountLinkingConfig bankAccountLinkingConfig2 = bankAccountLinkingConfig != null ? (BankAccountLinkingConfig) BankAccountLinkingConfig.ADAPTER.redact(bankAccountLinkingConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.main_text;
                String str2 = value.card_number_hint_text;
                CardBlockerSupplement.LinkedCardInputVariant linkedCardInputVariant = value.linked_card_input_variant;
                Boolean bool = value.should_upload_ocr_payload;
                String str3 = value.treatment;
                Boolean bool2 = value.should_upload_ocr_scan_image;
                byteString.getClass();
                return new CardBlockerSupplement(menuItem2, menuItem4, str, str2, bankAccountLinkingConfig2, linkedCardInputVariant, bool, str3, bool2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CardBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 10, value.should_upload_ocr_scan_image);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 9, value.treatment);
                protoAdapter2.encodeWithTag(writer, 8, value.should_upload_ocr_payload);
                CardBlockerSupplement.LinkedCardInputVariant.ADAPTER.encodeWithTag(writer, 7, value.linked_card_input_variant);
                BankAccountLinkingConfig.ADAPTER.encodeWithTag(writer, 6, value.bank_account_linking_config);
                protoAdapter3.encodeWithTag(writer, 4, value.card_number_hint_text);
                protoAdapter3.encodeWithTag(writer, 3, value.main_text);
                ProtoAdapter protoAdapter4 = MenuItem.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 2, value.menu_item_skip);
                protoAdapter4.encodeWithTag(writer, 1, value.menu_item_bank_account);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBlockerSupplement(MenuItem menuItem, MenuItem menuItem2, String str, String str2, BankAccountLinkingConfig bankAccountLinkingConfig, LinkedCardInputVariant linkedCardInputVariant, Boolean bool, String str3, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.menu_item_bank_account = menuItem;
        this.menu_item_skip = menuItem2;
        this.main_text = str;
        this.card_number_hint_text = str2;
        this.bank_account_linking_config = bankAccountLinkingConfig;
        this.linked_card_input_variant = linkedCardInputVariant;
        this.should_upload_ocr_payload = bool;
        this.treatment = str3;
        this.should_upload_ocr_scan_image = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardBlockerSupplement)) {
            return false;
        }
        CardBlockerSupplement cardBlockerSupplement = (CardBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), cardBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.menu_item_bank_account, cardBlockerSupplement.menu_item_bank_account) && Intrinsics.areEqual(this.menu_item_skip, cardBlockerSupplement.menu_item_skip) && Intrinsics.areEqual(this.main_text, cardBlockerSupplement.main_text) && Intrinsics.areEqual(this.card_number_hint_text, cardBlockerSupplement.card_number_hint_text) && Intrinsics.areEqual(this.bank_account_linking_config, cardBlockerSupplement.bank_account_linking_config) && this.linked_card_input_variant == cardBlockerSupplement.linked_card_input_variant && Intrinsics.areEqual(this.should_upload_ocr_payload, cardBlockerSupplement.should_upload_ocr_payload) && Intrinsics.areEqual(this.treatment, cardBlockerSupplement.treatment) && Intrinsics.areEqual(this.should_upload_ocr_scan_image, cardBlockerSupplement.should_upload_ocr_scan_image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MenuItem menuItem = this.menu_item_bank_account;
        int hashCode2 = (hashCode + (menuItem != null ? menuItem.hashCode() : 0)) * 37;
        MenuItem menuItem2 = this.menu_item_skip;
        int hashCode3 = (hashCode2 + (menuItem2 != null ? menuItem2.hashCode() : 0)) * 37;
        String str = this.main_text;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.card_number_hint_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BankAccountLinkingConfig bankAccountLinkingConfig = this.bank_account_linking_config;
        int hashCode6 = (hashCode5 + (bankAccountLinkingConfig != null ? bankAccountLinkingConfig.hashCode() : 0)) * 37;
        LinkedCardInputVariant linkedCardInputVariant = this.linked_card_input_variant;
        int hashCode7 = (hashCode6 + (linkedCardInputVariant != null ? linkedCardInputVariant.hashCode() : 0)) * 37;
        Boolean bool = this.should_upload_ocr_payload;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.treatment;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool2 = this.should_upload_ocr_scan_image;
        int hashCode10 = hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.menu_item_bank_account = this.menu_item_bank_account;
        builder.menu_item_skip = this.menu_item_skip;
        builder.main_text = this.main_text;
        builder.card_number_hint_text = this.card_number_hint_text;
        builder.bank_account_linking_config = this.bank_account_linking_config;
        builder.linked_card_input_variant = this.linked_card_input_variant;
        builder.should_upload_ocr_payload = this.should_upload_ocr_payload;
        builder.treatment = this.treatment;
        builder.should_upload_ocr_scan_image = this.should_upload_ocr_scan_image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MenuItem menuItem = this.menu_item_bank_account;
        if (menuItem != null) {
            arrayList.add("menu_item_bank_account=" + menuItem);
        }
        MenuItem menuItem2 = this.menu_item_skip;
        if (menuItem2 != null) {
            arrayList.add("menu_item_skip=" + menuItem2);
        }
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        String str2 = this.card_number_hint_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "card_number_hint_text=", arrayList);
        }
        BankAccountLinkingConfig bankAccountLinkingConfig = this.bank_account_linking_config;
        if (bankAccountLinkingConfig != null) {
            arrayList.add("bank_account_linking_config=" + bankAccountLinkingConfig);
        }
        LinkedCardInputVariant linkedCardInputVariant = this.linked_card_input_variant;
        if (linkedCardInputVariant != null) {
            arrayList.add("linked_card_input_variant=" + linkedCardInputVariant);
        }
        Boolean bool = this.should_upload_ocr_payload;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_upload_ocr_payload=", bool, arrayList);
        }
        String str3 = this.treatment;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "treatment=", arrayList);
        }
        Boolean bool2 = this.should_upload_ocr_scan_image;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_upload_ocr_scan_image=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardBlockerSupplement{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$LinkedCardInputVariant;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LEGACY", "MANUAL_ENTRY_ONLY", "MANUAL_ENTRY_WITH_SCAN_OPTION", "SCAN_FIRST", "SCAN_FIRST_MULTI_SCREEN", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LinkedCardInputVariant implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LinkedCardInputVariant[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final LinkedCardInputVariant LEGACY;
        public static final LinkedCardInputVariant MANUAL_ENTRY_ONLY;
        public static final LinkedCardInputVariant MANUAL_ENTRY_WITH_SCAN_OPTION;
        public static final LinkedCardInputVariant SCAN_FIRST;
        public static final LinkedCardInputVariant SCAN_FIRST_MULTI_SCREEN;
        private final int value;

        private static final /* synthetic */ LinkedCardInputVariant[] $values() {
            return new LinkedCardInputVariant[]{LEGACY, MANUAL_ENTRY_ONLY, MANUAL_ENTRY_WITH_SCAN_OPTION, SCAN_FIRST, SCAN_FIRST_MULTI_SCREEN};
        }

        static {
            final LinkedCardInputVariant linkedCardInputVariant = new LinkedCardInputVariant("LEGACY", 0, 0);
            LEGACY = linkedCardInputVariant;
            MANUAL_ENTRY_ONLY = new LinkedCardInputVariant("MANUAL_ENTRY_ONLY", 1, 1);
            MANUAL_ENTRY_WITH_SCAN_OPTION = new LinkedCardInputVariant("MANUAL_ENTRY_WITH_SCAN_OPTION", 2, 2);
            SCAN_FIRST = new LinkedCardInputVariant("SCAN_FIRST", 3, 3);
            SCAN_FIRST_MULTI_SCREEN = new LinkedCardInputVariant("SCAN_FIRST_MULTI_SCREEN", 4, 4);
            LinkedCardInputVariant[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LinkedCardInputVariant.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, linkedCardInputVariant) { // from class: com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement$LinkedCardInputVariant$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CardBlockerSupplement.LinkedCardInputVariant fromValue(int value) {
                    return CardBlockerSupplement.LinkedCardInputVariant.INSTANCE.fromValue(value);
                }
            };
        }

        private LinkedCardInputVariant(String str, int i, int i2) {
            this.value = i2;
        }

        public static final LinkedCardInputVariant fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static LinkedCardInputVariant valueOf(String str) {
            return (LinkedCardInputVariant) Enum.valueOf(LinkedCardInputVariant.class, str);
        }

        public static LinkedCardInputVariant[] values() {
            return (LinkedCardInputVariant[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$LinkedCardInputVariant$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$LinkedCardInputVariant;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LinkedCardInputVariant fromValue(int value) {
                if (value == 0) {
                    return LinkedCardInputVariant.LEGACY;
                }
                if (value == 1) {
                    return LinkedCardInputVariant.MANUAL_ENTRY_ONLY;
                }
                if (value == 2) {
                    return LinkedCardInputVariant.MANUAL_ENTRY_WITH_SCAN_OPTION;
                }
                if (value == 3) {
                    return LinkedCardInputVariant.SCAN_FIRST;
                }
                if (value != 4) {
                    return null;
                }
                return LinkedCardInputVariant.SCAN_FIRST_MULTI_SCREEN;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
