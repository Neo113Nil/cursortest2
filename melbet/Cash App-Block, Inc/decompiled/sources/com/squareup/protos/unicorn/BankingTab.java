package com.squareup.protos.unicorn;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.unicorn.BankingTab;
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
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0010\u0017\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006&"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$Disclosure;", "disclosure", "Lcom/squareup/protos/unicorn/BankingTab$Disclosure;", "balance_home_disclosure", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet;", "add_money_bottom_sheet", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet;", "Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction;", "balance_home_call_to_action", "Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction;", "direct_deposit_action", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction;", "", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection;", "banking_tab_sections", "Ljava/util/List;", "balance_home_sections", "add_money_sheet_sections", "Companion", "Builder", "Appearance", "ClientScenarioAction", "ClientRouteAction", "Dialog", "Text", "UpsellOption", "BankingOption", "BorrowOption", "TaxesOption", "Options", "BankingTabSection", "BalanceHomeCallToAction", "Disclosure", "DirectDepositAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BankingTab extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BankingTab> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet#ADAPTER", schemaIndex = 4, tag = 5)
    public final AddMoneyBottomSheet add_money_bottom_sheet;

    @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$BankingTabSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    public final List<BankingTabSection> add_money_sheet_sections;

    @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$BalanceHomeCallToAction#ADAPTER", schemaIndex = 5, tag = 6)
    public final BalanceHomeCallToAction balance_home_call_to_action;

    @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Disclosure#ADAPTER", schemaIndex = 3, tag = 4)
    public final Disclosure balance_home_disclosure;

    @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$BankingTabSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<BankingTabSection> balance_home_sections;

    @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$BankingTabSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<BankingTabSection> banking_tab_sections;

    @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$DirectDepositAction#ADAPTER", schemaIndex = 6, tag = 7)
    public final DirectDepositAction direct_deposit_action;

    @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Disclosure#ADAPTER", schemaIndex = 1, tag = 2)
    public final Disclosure disclosure;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J,\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$Builder;", "header_block", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock;", "banking_options", "", "Lcom/squareup/protos/unicorn/BankingTab$Options;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "HeaderBlock", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BankingTabSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BankingTabSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Options#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<Options> banking_options;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$BankingTabSection$HeaderBlock#ADAPTER", schemaIndex = 0, tag = 1)
        public final HeaderBlock header_block;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection;", "<init>", "()V", "header_block", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock;", "banking_options", "", "Lcom/squareup/protos/unicorn/BankingTab$Options;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Options> banking_options = EmptyList.INSTANCE;
            public HeaderBlock header_block;

            public final Builder banking_options(List<Options> banking_options) {
                banking_options.getClass();
                TransactorKt.checkElementsNotNull(banking_options);
                this.banking_options = banking_options;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public BankingTabSection build() {
                return new BankingTabSection(this.header_block, this.banking_options, buildUnknownFields());
            }

            public final Builder header_block(HeaderBlock header_block) {
                this.header_block = header_block;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BankingTabSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$BankingTabSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BankingTabSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.BankingTabSection((BankingTab.BankingTabSection.HeaderBlock) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(BankingTab.BankingTabSection.HeaderBlock.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(BankingTab.Options.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.BankingTabSection value) {
                    writer.getClass();
                    value.getClass();
                    BankingTab.BankingTabSection.HeaderBlock.ADAPTER.encodeWithTag(writer, 1, value.header_block);
                    BankingTab.Options.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.banking_options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.BankingTabSection value) {
                    value.getClass();
                    return BankingTab.Options.ADAPTER.asRepeated().encodedSizeWithTag(2, value.banking_options) + BankingTab.BankingTabSection.HeaderBlock.ADAPTER.encodedSizeWithTag(1, value.header_block) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BankingTabSection redact(BankingTab.BankingTabSection value) {
                    value.getClass();
                    BankingTab.BankingTabSection.HeaderBlock headerBlock = value.header_block;
                    return value.copy(headerBlock != null ? (BankingTab.BankingTabSection.HeaderBlock) BankingTab.BankingTabSection.HeaderBlock.ADAPTER.redact(headerBlock) : null, TransactorKt.m1169redactElements(value.banking_options, BankingTab.Options.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.BankingTabSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BankingTab.Options.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.banking_options);
                    BankingTab.BankingTabSection.HeaderBlock.ADAPTER.encodeWithTag(writer, 1, value.header_block);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankingTabSection(HeaderBlock headerBlock, List<Options> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header_block = headerBlock;
            this.banking_options = TransactorKt.immutableCopyOf("banking_options", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BankingTabSection copy$default(BankingTabSection bankingTabSection, HeaderBlock headerBlock, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                headerBlock = bankingTabSection.header_block;
            }
            if ((i & 2) != 0) {
                list = bankingTabSection.banking_options;
            }
            if ((i & 4) != 0) {
                byteString = bankingTabSection.unknownFields();
            }
            return bankingTabSection.copy(headerBlock, list, byteString);
        }

        public final BankingTabSection copy(HeaderBlock header_block, List<Options> banking_options, ByteString unknownFields) {
            banking_options.getClass();
            unknownFields.getClass();
            return new BankingTabSection(header_block, banking_options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BankingTabSection)) {
                return false;
            }
            BankingTabSection bankingTabSection = (BankingTabSection) other;
            return Intrinsics.areEqual(unknownFields(), bankingTabSection.unknownFields()) && Intrinsics.areEqual(this.header_block, bankingTabSection.header_block) && Intrinsics.areEqual(this.banking_options, bankingTabSection.banking_options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            HeaderBlock headerBlock = this.header_block;
            int hashCode2 = this.banking_options.hashCode() + ((hashCode + (headerBlock != null ? headerBlock.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header_block = this.header_block;
            builder.banking_options = this.banking_options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            HeaderBlock headerBlock = this.header_block;
            if (headerBlock != null) {
                arrayList.add("header_block=" + headerBlock);
            }
            if (!this.banking_options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("banking_options=", arrayList, this.banking_options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BankingTabSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock$Builder;", "heading", "", "localizable_heading", "Lcom/squareup/protos/cash/localization/LocalizableString;", "subheading", "localizable_subheading", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HeaderBlock extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<HeaderBlock> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String heading;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 2)
            public final LocalizableString localizable_heading;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 4)
            public final LocalizableString localizable_subheading;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String subheading;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock;", "<init>", "()V", "heading", "", "localizable_heading", "Lcom/squareup/protos/cash/localization/LocalizableString;", "subheading", "localizable_subheading", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String heading;
                public LocalizableString localizable_heading;
                public LocalizableString localizable_subheading;
                public String subheading;

                @Override // com.squareup.wire.Message.Builder
                public HeaderBlock build() {
                    return new HeaderBlock(this.heading, this.localizable_heading, this.subheading, this.localizable_subheading, buildUnknownFields());
                }

                public final Builder heading(String heading) {
                    this.heading = heading;
                    return this;
                }

                public final Builder localizable_heading(LocalizableString localizable_heading) {
                    this.localizable_heading = localizable_heading;
                    return this;
                }

                public final Builder localizable_subheading(LocalizableString localizable_subheading) {
                    this.localizable_subheading = localizable_subheading;
                    return this;
                }

                public final Builder subheading(String subheading) {
                    this.subheading = subheading;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HeaderBlock.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$BankingTabSection$HeaderBlock$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BankingTab.BankingTabSection.HeaderBlock decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BankingTab.BankingTabSection.HeaderBlock((String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                            } else if (nextTag == 3) {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BankingTab.BankingTabSection.HeaderBlock value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.heading);
                        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                        protoAdapter3.encodeWithTag(writer, 2, value.localizable_heading);
                        protoAdapter2.encodeWithTag(writer, 3, value.subheading);
                        protoAdapter3.encodeWithTag(writer, 4, value.localizable_subheading);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BankingTab.BankingTabSection.HeaderBlock value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.heading) + size$okio;
                        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                        return protoAdapter3.encodedSizeWithTag(4, value.localizable_subheading) + protoAdapter2.encodedSizeWithTag(3, value.subheading) + protoAdapter3.encodedSizeWithTag(2, value.localizable_heading) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BankingTab.BankingTabSection.HeaderBlock redact(BankingTab.BankingTabSection.HeaderBlock value) {
                        value.getClass();
                        LocalizableString localizableString = value.localizable_heading;
                        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                        LocalizableString localizableString3 = value.localizable_subheading;
                        return BankingTab.BankingTabSection.HeaderBlock.copy$default(value, null, localizableString2, null, localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null, ByteString.EMPTY, 5, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BankingTab.BankingTabSection.HeaderBlock value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 4, value.localizable_subheading);
                        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                        protoAdapter3.encodeWithTag(writer, 3, value.subheading);
                        protoAdapter2.encodeWithTag(writer, 2, value.localizable_heading);
                        protoAdapter3.encodeWithTag(writer, 1, value.heading);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ HeaderBlock(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : localizableString2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ HeaderBlock copy$default(HeaderBlock headerBlock, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = headerBlock.heading;
                }
                if ((i & 2) != 0) {
                    localizableString = headerBlock.localizable_heading;
                }
                if ((i & 4) != 0) {
                    str2 = headerBlock.subheading;
                }
                if ((i & 8) != 0) {
                    localizableString2 = headerBlock.localizable_subheading;
                }
                if ((i & 16) != 0) {
                    byteString = headerBlock.unknownFields();
                }
                ByteString byteString2 = byteString;
                String str3 = str2;
                return headerBlock.copy(str, localizableString, str3, localizableString2, byteString2);
            }

            public final HeaderBlock copy(String heading, LocalizableString localizable_heading, String subheading, LocalizableString localizable_subheading, ByteString unknownFields) {
                unknownFields.getClass();
                return new HeaderBlock(heading, localizable_heading, subheading, localizable_subheading, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof HeaderBlock)) {
                    return false;
                }
                HeaderBlock headerBlock = (HeaderBlock) other;
                return Intrinsics.areEqual(unknownFields(), headerBlock.unknownFields()) && Intrinsics.areEqual(this.heading, headerBlock.heading) && Intrinsics.areEqual(this.localizable_heading, headerBlock.localizable_heading) && Intrinsics.areEqual(this.subheading, headerBlock.subheading) && Intrinsics.areEqual(this.localizable_subheading, headerBlock.localizable_subheading);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.heading;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_heading;
                int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                String str2 = this.subheading;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                LocalizableString localizableString2 = this.localizable_subheading;
                int hashCode5 = hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.heading = this.heading;
                builder.localizable_heading = this.localizable_heading;
                builder.subheading = this.subheading;
                builder.localizable_subheading = this.localizable_subheading;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.heading;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "heading=", arrayList);
                }
                LocalizableString localizableString = this.localizable_heading;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_heading=", localizableString, arrayList);
                }
                String str2 = this.subheading;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subheading=", arrayList);
                }
                LocalizableString localizableString2 = this.localizable_subheading;
                if (localizableString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_subheading=", localizableString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "HeaderBlock{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$HeaderBlock;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ HeaderBlock build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public HeaderBlock() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HeaderBlock(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.heading = str;
                this.localizable_heading = localizableString;
                this.subheading = str2;
                this.localizable_subheading = localizableString2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BankingTabSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public BankingTabSection(HeaderBlock headerBlock, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : headerBlock, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public BankingTabSection() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab;", "<init>", "()V", "banking_tab_sections", "", "Lcom/squareup/protos/unicorn/BankingTab$BankingTabSection;", "disclosure", "Lcom/squareup/protos/unicorn/BankingTab$Disclosure;", "balance_home_sections", "balance_home_disclosure", "add_money_bottom_sheet", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet;", "balance_home_call_to_action", "Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction;", "direct_deposit_action", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction;", "add_money_sheet_sections", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AddMoneyBottomSheet add_money_bottom_sheet;
        public List<BankingTabSection> add_money_sheet_sections;
        public BalanceHomeCallToAction balance_home_call_to_action;
        public Disclosure balance_home_disclosure;
        public List<BankingTabSection> balance_home_sections;
        public List<BankingTabSection> banking_tab_sections;
        public DirectDepositAction direct_deposit_action;
        public Disclosure disclosure;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.banking_tab_sections = emptyList;
            this.balance_home_sections = emptyList;
            this.add_money_sheet_sections = emptyList;
        }

        public final Builder add_money_bottom_sheet(AddMoneyBottomSheet add_money_bottom_sheet) {
            this.add_money_bottom_sheet = add_money_bottom_sheet;
            return this;
        }

        public final Builder add_money_sheet_sections(List<BankingTabSection> add_money_sheet_sections) {
            add_money_sheet_sections.getClass();
            TransactorKt.checkElementsNotNull(add_money_sheet_sections);
            this.add_money_sheet_sections = add_money_sheet_sections;
            return this;
        }

        public final Builder balance_home_call_to_action(BalanceHomeCallToAction balance_home_call_to_action) {
            this.balance_home_call_to_action = balance_home_call_to_action;
            return this;
        }

        public final Builder balance_home_disclosure(Disclosure balance_home_disclosure) {
            this.balance_home_disclosure = balance_home_disclosure;
            return this;
        }

        public final Builder balance_home_sections(List<BankingTabSection> balance_home_sections) {
            balance_home_sections.getClass();
            TransactorKt.checkElementsNotNull(balance_home_sections);
            this.balance_home_sections = balance_home_sections;
            return this;
        }

        public final Builder banking_tab_sections(List<BankingTabSection> banking_tab_sections) {
            banking_tab_sections.getClass();
            TransactorKt.checkElementsNotNull(banking_tab_sections);
            this.banking_tab_sections = banking_tab_sections;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BankingTab build() {
            return new BankingTab(this.banking_tab_sections, this.disclosure, this.balance_home_sections, this.balance_home_disclosure, this.add_money_bottom_sheet, this.balance_home_call_to_action, this.direct_deposit_action, this.add_money_sheet_sections, buildUnknownFields());
        }

        public final Builder direct_deposit_action(DirectDepositAction direct_deposit_action) {
            this.direct_deposit_action = direct_deposit_action;
            return this;
        }

        public final Builder disclosure(Disclosure disclosure) {
            this.disclosure = disclosure;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Text;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$Text$Builder;", "text", "", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "alignment", "Lcom/squareup/protos/unicorn/BankingTab$Text$Alignment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/unicorn/BankingTab$Text$Alignment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Alignment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Text extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Text> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Text$Alignment#ADAPTER", schemaIndex = 2, tag = 2)
        public final Alignment alignment;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 3)
        public final LocalizableString localizable_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Text$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$Text;", "<init>", "()V", "text", "", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "alignment", "Lcom/squareup/protos/unicorn/BankingTab$Text$Alignment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Alignment alignment;
            public LocalizableString localizable_text;
            public String text;

            public final Builder alignment(Alignment alignment) {
                this.alignment = alignment;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Text build() {
                return new Text(this.text, this.localizable_text, this.alignment, buildUnknownFields());
            }

            public final Builder localizable_text(LocalizableString localizable_text) {
                this.localizable_text = localizable_text;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Text.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Text$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Text decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.Text((String) obj, (LocalizableString) obj2, (BankingTab.Text.Alignment) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            try {
                                obj3 = BankingTab.Text.Alignment.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.Text value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    LocalizableString.ADAPTER.encodeWithTag(writer, 3, value.localizable_text);
                    BankingTab.Text.Alignment.ADAPTER.encodeWithTag(writer, 2, value.alignment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.Text value) {
                    value.getClass();
                    return BankingTab.Text.Alignment.ADAPTER.encodedSizeWithTag(2, value.alignment) + LocalizableString.ADAPTER.encodedSizeWithTag(3, value.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Text redact(BankingTab.Text value) {
                    value.getClass();
                    LocalizableString localizableString = value.localizable_text;
                    return BankingTab.Text.copy$default(value, null, localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null, null, ByteString.EMPTY, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.Text value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BankingTab.Text.Alignment.ADAPTER.encodeWithTag(writer, 2, value.alignment);
                    LocalizableString.ADAPTER.encodeWithTag(writer, 3, value.localizable_text);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Text(String str, LocalizableString localizableString, Alignment alignment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? null : alignment, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Text copy$default(Text text, String str, LocalizableString localizableString, Alignment alignment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            if ((i & 2) != 0) {
                localizableString = text.localizable_text;
            }
            if ((i & 4) != 0) {
                alignment = text.alignment;
            }
            if ((i & 8) != 0) {
                byteString = text.unknownFields();
            }
            return text.copy(str, localizableString, alignment, byteString);
        }

        public final Text copy(String text, LocalizableString localizable_text, Alignment alignment, ByteString unknownFields) {
            unknownFields.getClass();
            return new Text(text, localizable_text, alignment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.localizable_text, text.localizable_text) && this.alignment == text.alignment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            Alignment alignment = this.alignment;
            int hashCode4 = hashCode3 + (alignment != null ? alignment.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.localizable_text = this.localizable_text;
            builder.alignment = this.alignment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            Alignment alignment = this.alignment;
            if (alignment != null) {
                arrayList.add("alignment=" + alignment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Text$Alignment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LEFT", "RIGHT", "CENTER", "JUSTIFIED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Alignment implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Alignment[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final Alignment LEFT = new Alignment("LEFT", 0, 1);
            public static final Alignment RIGHT = new Alignment("RIGHT", 1, 2);
            public static final Alignment CENTER = new Alignment("CENTER", 2, 3);
            public static final Alignment JUSTIFIED = new Alignment("JUSTIFIED", 3, 4);

            private static final /* synthetic */ Alignment[] $values() {
                return new Alignment[]{LEFT, RIGHT, CENTER, JUSTIFIED};
            }

            static {
                Alignment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Alignment.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Text$Alignment$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BankingTab.Text.Alignment fromValue(int value) {
                        return BankingTab.Text.Alignment.INSTANCE.fromValue(value);
                    }
                };
            }

            private Alignment(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Alignment fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Text$Alignment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/unicorn/BankingTab$Text$Alignment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Alignment fromValue(int value) {
                    if (value == 1) {
                        return Alignment.LEFT;
                    }
                    if (value == 2) {
                        return Alignment.RIGHT;
                    }
                    if (value == 3) {
                        return Alignment.CENTER;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return Alignment.JUSTIFIED;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Text$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$Text$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$Text;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$Text;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Text build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Text() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String str, LocalizableString localizableString, Alignment alignment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.localizable_text = localizableString;
            this.alignment = alignment;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$UpsellOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "header", "Lcom/squareup/protos/unicorn/BankingTab$Text;", "description", "button", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/unicorn/BankingTab$Text;Lcom/squareup/protos/unicorn/BankingTab$Text;Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Button", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpsellOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UpsellOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$UpsellOption$Button#ADAPTER", schemaIndex = 3, tag = 4)
        public final Button button;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Text#ADAPTER", schemaIndex = 2, tag = 3)
        public final Text description;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Text#ADAPTER", schemaIndex = 1, tag = 2)
        public final Text header;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image image;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "header", "Lcom/squareup/protos/unicorn/BankingTab$Text;", "description", "button", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Button button;
            public Text description;
            public Text header;
            public Image image;

            @Override // com.squareup.wire.Message.Builder
            public UpsellOption build() {
                return new UpsellOption(this.image, this.header, this.description, this.button, buildUnknownFields());
            }

            public final Builder button(Button button) {
                this.button = button;
                return this;
            }

            public final Builder description(Text description) {
                this.description = description;
                return this;
            }

            public final Builder header(Text header) {
                this.header = header;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpsellOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$UpsellOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.UpsellOption decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.UpsellOption((Image) obj, (BankingTab.Text) obj2, (BankingTab.Text) obj3, (BankingTab.UpsellOption.Button) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(BankingTab.Text.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(BankingTab.Text.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(BankingTab.UpsellOption.Button.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.UpsellOption value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter protoAdapter2 = BankingTab.Text.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.header);
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    BankingTab.UpsellOption.Button.ADAPTER.encodeWithTag(writer, 4, value.button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.UpsellOption value) {
                    value.getClass();
                    int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = BankingTab.Text.ADAPTER;
                    return BankingTab.UpsellOption.Button.ADAPTER.encodedSizeWithTag(4, value.button) + protoAdapter2.encodedSizeWithTag(3, value.description) + protoAdapter2.encodedSizeWithTag(2, value.header) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.UpsellOption redact(BankingTab.UpsellOption value) {
                    value.getClass();
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    BankingTab.Text text = value.header;
                    BankingTab.Text text2 = text != null ? (BankingTab.Text) BankingTab.Text.ADAPTER.redact(text) : null;
                    BankingTab.Text text3 = value.description;
                    BankingTab.Text text4 = text3 != null ? (BankingTab.Text) BankingTab.Text.ADAPTER.redact(text3) : null;
                    BankingTab.UpsellOption.Button button = value.button;
                    return value.copy(image2, text2, text4, button != null ? (BankingTab.UpsellOption.Button) BankingTab.UpsellOption.Button.ADAPTER.redact(button) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.UpsellOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BankingTab.UpsellOption.Button.ADAPTER.encodeWithTag(writer, 4, value.button);
                    ProtoAdapter protoAdapter2 = BankingTab.Text.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    protoAdapter2.encodeWithTag(writer, 2, value.header);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ UpsellOption(Image image, Text text, Text text2, Button button, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : text, (i & 4) != 0 ? null : text2, (i & 8) != 0 ? null : button, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ UpsellOption copy$default(UpsellOption upsellOption, Image image, Text text, Text text2, Button button, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = upsellOption.image;
            }
            if ((i & 2) != 0) {
                text = upsellOption.header;
            }
            if ((i & 4) != 0) {
                text2 = upsellOption.description;
            }
            if ((i & 8) != 0) {
                button = upsellOption.button;
            }
            if ((i & 16) != 0) {
                byteString = upsellOption.unknownFields();
            }
            ByteString byteString2 = byteString;
            Text text3 = text2;
            return upsellOption.copy(image, text, text3, button, byteString2);
        }

        public final UpsellOption copy(Image image, Text header, Text description, Button button, ByteString unknownFields) {
            unknownFields.getClass();
            return new UpsellOption(image, header, description, button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof UpsellOption)) {
                return false;
            }
            UpsellOption upsellOption = (UpsellOption) other;
            return Intrinsics.areEqual(unknownFields(), upsellOption.unknownFields()) && Intrinsics.areEqual(this.image, upsellOption.image) && Intrinsics.areEqual(this.header, upsellOption.header) && Intrinsics.areEqual(this.description, upsellOption.description) && Intrinsics.areEqual(this.button, upsellOption.button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Text text = this.header;
            int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.description;
            int hashCode4 = (hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode5 = hashCode4 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.header = this.header;
            builder.description = this.description;
            builder.button = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Text text = this.header;
            if (text != null) {
                arrayList.add("header=" + text);
            }
            Text text2 = this.description;
            if (text2 != null) {
                arrayList.add("description=" + text2);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button$Builder;", "button_text", "", "localizable_button_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "client_route_action", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String button_text;

            @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientRouteAction#ADAPTER", schemaIndex = 2, tag = 2)
            public final ClientRouteAction client_route_action;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 3)
            public final LocalizableString localizable_button_text;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button;", "<init>", "()V", "button_text", "", "localizable_button_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "client_route_action", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String button_text;
                public ClientRouteAction client_route_action;
                public LocalizableString localizable_button_text;

                @Override // com.squareup.wire.Message.Builder
                public Button build() {
                    return new Button(this.button_text, this.localizable_button_text, this.client_route_action, buildUnknownFields());
                }

                public final Builder button_text(String button_text) {
                    this.button_text = button_text;
                    return this;
                }

                public final Builder client_route_action(ClientRouteAction client_route_action) {
                    this.client_route_action = client_route_action;
                    return this;
                }

                public final Builder localizable_button_text(LocalizableString localizable_button_text) {
                    this.localizable_button_text = localizable_button_text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$UpsellOption$Button$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BankingTab.UpsellOption.Button decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BankingTab.UpsellOption.Button((String) obj, (LocalizableString) obj2, (BankingTab.ClientRouteAction) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj3 = TransactorKt.decodeMessageOrMerge(BankingTab.ClientRouteAction.ADAPTER, reader, obj3);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BankingTab.UpsellOption.Button value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.button_text);
                        LocalizableString.ADAPTER.encodeWithTag(writer, 3, value.localizable_button_text);
                        BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 2, value.client_route_action);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BankingTab.UpsellOption.Button value) {
                        value.getClass();
                        return BankingTab.ClientRouteAction.ADAPTER.encodedSizeWithTag(2, value.client_route_action) + LocalizableString.ADAPTER.encodedSizeWithTag(3, value.localizable_button_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.button_text) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BankingTab.UpsellOption.Button redact(BankingTab.UpsellOption.Button value) {
                        value.getClass();
                        LocalizableString localizableString = value.localizable_button_text;
                        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                        BankingTab.ClientRouteAction clientRouteAction = value.client_route_action;
                        return BankingTab.UpsellOption.Button.copy$default(value, null, localizableString2, clientRouteAction != null ? (BankingTab.ClientRouteAction) BankingTab.ClientRouteAction.ADAPTER.redact(clientRouteAction) : null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BankingTab.UpsellOption.Button value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 2, value.client_route_action);
                        LocalizableString.ADAPTER.encodeWithTag(writer, 3, value.localizable_button_text);
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.button_text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Button(String str, LocalizableString localizableString, ClientRouteAction clientRouteAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? null : clientRouteAction, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Button copy$default(Button button, String str, LocalizableString localizableString, ClientRouteAction clientRouteAction, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = button.button_text;
                }
                if ((i & 2) != 0) {
                    localizableString = button.localizable_button_text;
                }
                if ((i & 4) != 0) {
                    clientRouteAction = button.client_route_action;
                }
                if ((i & 8) != 0) {
                    byteString = button.unknownFields();
                }
                return button.copy(str, localizableString, clientRouteAction, byteString);
            }

            public final Button copy(String button_text, LocalizableString localizable_button_text, ClientRouteAction client_route_action, ByteString unknownFields) {
                unknownFields.getClass();
                return new Button(button_text, localizable_button_text, client_route_action, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.button_text, button.button_text) && Intrinsics.areEqual(this.localizable_button_text, button.localizable_button_text) && Intrinsics.areEqual(this.client_route_action, button.client_route_action);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.button_text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_button_text;
                int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                ClientRouteAction clientRouteAction = this.client_route_action;
                int hashCode4 = hashCode3 + (clientRouteAction != null ? clientRouteAction.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.button_text = this.button_text;
                builder.localizable_button_text = this.localizable_button_text;
                builder.client_route_action = this.client_route_action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.button_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_text=", arrayList);
                }
                LocalizableString localizableString = this.localizable_button_text;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_button_text=", localizableString, arrayList);
                }
                ClientRouteAction clientRouteAction = this.client_route_action;
                if (clientRouteAction != null) {
                    arrayList.add("client_route_action=" + clientRouteAction);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Button build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Button() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, LocalizableString localizableString, ClientRouteAction clientRouteAction, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.button_text = str;
                this.localizable_button_text = localizableString;
                this.client_route_action = clientRouteAction;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$UpsellOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ UpsellOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public UpsellOption() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellOption(Image image, Text text, Text text2, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.header = text;
            this.description = text2;
            this.button = button;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BankingTab.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BankingTab decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BankingTab(m, (BankingTab.Disclosure) obj, arrayList, (BankingTab.Disclosure) obj2, (AddMoneyBottomSheet) obj3, (BankingTab.BalanceHomeCallToAction) obj4, (BankingTab.DirectDepositAction) obj5, arrayList2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(BankingTab.BankingTabSection.ADAPTER.decode(reader));
                            break;
                        case 2:
                            obj = TransactorKt.decodeMessageOrMerge(BankingTab.Disclosure.ADAPTER, reader, obj);
                            break;
                        case 3:
                            arrayList.add(BankingTab.BankingTabSection.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj2 = TransactorKt.decodeMessageOrMerge(BankingTab.Disclosure.ADAPTER, reader, obj2);
                            break;
                        case 5:
                            obj3 = TransactorKt.decodeMessageOrMerge(AddMoneyBottomSheet.ADAPTER, reader, obj3);
                            break;
                        case 6:
                            obj4 = TransactorKt.decodeMessageOrMerge(BankingTab.BalanceHomeCallToAction.ADAPTER, reader, obj4);
                            break;
                        case 7:
                            obj5 = TransactorKt.decodeMessageOrMerge(BankingTab.DirectDepositAction.ADAPTER, reader, obj5);
                            break;
                        case 8:
                            arrayList2.add(BankingTab.BankingTabSection.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BankingTab value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = BankingTab.BankingTabSection.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.banking_tab_sections);
                ProtoAdapter protoAdapter3 = BankingTab.Disclosure.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.disclosure);
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, value.balance_home_sections);
                protoAdapter3.encodeWithTag(writer, 4, value.balance_home_disclosure);
                AddMoneyBottomSheet.ADAPTER.encodeWithTag(writer, 5, value.add_money_bottom_sheet);
                BankingTab.BalanceHomeCallToAction.ADAPTER.encodeWithTag(writer, 6, value.balance_home_call_to_action);
                BankingTab.DirectDepositAction.ADAPTER.encodeWithTag(writer, 7, value.direct_deposit_action);
                protoAdapter2.asRepeated().encodeWithTag(writer, 8, value.add_money_sheet_sections);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BankingTab value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = BankingTab.BankingTabSection.ADAPTER;
                int encodedSizeWithTag = protoAdapter2.asRepeated().encodedSizeWithTag(1, value.banking_tab_sections) + size$okio;
                ProtoAdapter protoAdapter3 = BankingTab.Disclosure.ADAPTER;
                return protoAdapter2.asRepeated().encodedSizeWithTag(8, value.add_money_sheet_sections) + BankingTab.DirectDepositAction.ADAPTER.encodedSizeWithTag(7, value.direct_deposit_action) + BankingTab.BalanceHomeCallToAction.ADAPTER.encodedSizeWithTag(6, value.balance_home_call_to_action) + AddMoneyBottomSheet.ADAPTER.encodedSizeWithTag(5, value.add_money_bottom_sheet) + protoAdapter3.encodedSizeWithTag(4, value.balance_home_disclosure) + protoAdapter2.asRepeated().encodedSizeWithTag(3, value.balance_home_sections) + protoAdapter3.encodedSizeWithTag(2, value.disclosure) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BankingTab redact(BankingTab value) {
                value.getClass();
                List<BankingTab.BankingTabSection> list = value.banking_tab_sections;
                ProtoAdapter protoAdapter2 = BankingTab.BankingTabSection.ADAPTER;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                BankingTab.Disclosure disclosure = value.disclosure;
                BankingTab.Disclosure disclosure2 = disclosure != null ? (BankingTab.Disclosure) BankingTab.Disclosure.ADAPTER.redact(disclosure) : null;
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.balance_home_sections, protoAdapter2);
                BankingTab.Disclosure disclosure3 = value.balance_home_disclosure;
                BankingTab.Disclosure disclosure4 = disclosure3 != null ? (BankingTab.Disclosure) BankingTab.Disclosure.ADAPTER.redact(disclosure3) : null;
                AddMoneyBottomSheet addMoneyBottomSheet = value.add_money_bottom_sheet;
                AddMoneyBottomSheet addMoneyBottomSheet2 = addMoneyBottomSheet != null ? (AddMoneyBottomSheet) AddMoneyBottomSheet.ADAPTER.redact(addMoneyBottomSheet) : null;
                BankingTab.BalanceHomeCallToAction balanceHomeCallToAction = value.balance_home_call_to_action;
                BankingTab.BalanceHomeCallToAction balanceHomeCallToAction2 = balanceHomeCallToAction != null ? (BankingTab.BalanceHomeCallToAction) BankingTab.BalanceHomeCallToAction.ADAPTER.redact(balanceHomeCallToAction) : null;
                BankingTab.DirectDepositAction directDepositAction = value.direct_deposit_action;
                BankingTab.DirectDepositAction directDepositAction2 = directDepositAction != null ? (BankingTab.DirectDepositAction) BankingTab.DirectDepositAction.ADAPTER.redact(directDepositAction) : null;
                ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(value.add_money_sheet_sections, protoAdapter2);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BankingTab(m1169redactElements, disclosure2, m1169redactElements2, disclosure4, addMoneyBottomSheet2, balanceHomeCallToAction2, directDepositAction2, m1169redactElements3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BankingTab value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = BankingTab.BankingTabSection.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 8, value.add_money_sheet_sections);
                BankingTab.DirectDepositAction.ADAPTER.encodeWithTag(writer, 7, value.direct_deposit_action);
                BankingTab.BalanceHomeCallToAction.ADAPTER.encodeWithTag(writer, 6, value.balance_home_call_to_action);
                AddMoneyBottomSheet.ADAPTER.encodeWithTag(writer, 5, value.add_money_bottom_sheet);
                ProtoAdapter protoAdapter3 = BankingTab.Disclosure.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 4, value.balance_home_disclosure);
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, value.balance_home_sections);
                protoAdapter3.encodeWithTag(writer, 2, value.disclosure);
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.banking_tab_sections);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankingTab(List list, Disclosure disclosure, List list2, Disclosure disclosure2, AddMoneyBottomSheet addMoneyBottomSheet, BalanceHomeCallToAction balanceHomeCallToAction, DirectDepositAction directDepositAction, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.disclosure = disclosure;
        this.balance_home_disclosure = disclosure2;
        this.add_money_bottom_sheet = addMoneyBottomSheet;
        this.balance_home_call_to_action = balanceHomeCallToAction;
        this.direct_deposit_action = directDepositAction;
        this.banking_tab_sections = TransactorKt.immutableCopyOf("banking_tab_sections", list);
        this.balance_home_sections = TransactorKt.immutableCopyOf("balance_home_sections", list2);
        this.add_money_sheet_sections = TransactorKt.immutableCopyOf("add_money_sheet_sections", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BankingTab)) {
            return false;
        }
        BankingTab bankingTab = (BankingTab) obj;
        return Intrinsics.areEqual(unknownFields(), bankingTab.unknownFields()) && Intrinsics.areEqual(this.banking_tab_sections, bankingTab.banking_tab_sections) && Intrinsics.areEqual(this.disclosure, bankingTab.disclosure) && Intrinsics.areEqual(this.balance_home_sections, bankingTab.balance_home_sections) && Intrinsics.areEqual(this.balance_home_disclosure, bankingTab.balance_home_disclosure) && Intrinsics.areEqual(this.add_money_bottom_sheet, bankingTab.add_money_bottom_sheet) && Intrinsics.areEqual(this.balance_home_call_to_action, bankingTab.balance_home_call_to_action) && Intrinsics.areEqual(this.direct_deposit_action, bankingTab.direct_deposit_action) && Intrinsics.areEqual(this.add_money_sheet_sections, bankingTab.add_money_sheet_sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.banking_tab_sections);
        Disclosure disclosure = this.disclosure;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (disclosure != null ? disclosure.hashCode() : 0)) * 37, 37, this.balance_home_sections);
        Disclosure disclosure2 = this.balance_home_disclosure;
        int hashCode = (m2 + (disclosure2 != null ? disclosure2.hashCode() : 0)) * 37;
        AddMoneyBottomSheet addMoneyBottomSheet = this.add_money_bottom_sheet;
        int hashCode2 = (hashCode + (addMoneyBottomSheet != null ? addMoneyBottomSheet.hashCode() : 0)) * 37;
        BalanceHomeCallToAction balanceHomeCallToAction = this.balance_home_call_to_action;
        int hashCode3 = (hashCode2 + (balanceHomeCallToAction != null ? balanceHomeCallToAction.hashCode() : 0)) * 37;
        DirectDepositAction directDepositAction = this.direct_deposit_action;
        int hashCode4 = this.add_money_sheet_sections.hashCode() + ((hashCode3 + (directDepositAction != null ? directDepositAction.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.banking_tab_sections = this.banking_tab_sections;
        builder.disclosure = this.disclosure;
        builder.balance_home_sections = this.balance_home_sections;
        builder.balance_home_disclosure = this.balance_home_disclosure;
        builder.add_money_bottom_sheet = this.add_money_bottom_sheet;
        builder.balance_home_call_to_action = this.balance_home_call_to_action;
        builder.direct_deposit_action = this.direct_deposit_action;
        builder.add_money_sheet_sections = this.add_money_sheet_sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.banking_tab_sections.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("banking_tab_sections=", arrayList, this.banking_tab_sections);
        }
        Disclosure disclosure = this.disclosure;
        if (disclosure != null) {
            arrayList.add("disclosure=" + disclosure);
        }
        if (!this.balance_home_sections.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("balance_home_sections=", arrayList, this.balance_home_sections);
        }
        Disclosure disclosure2 = this.balance_home_disclosure;
        if (disclosure2 != null) {
            arrayList.add("balance_home_disclosure=" + disclosure2);
        }
        AddMoneyBottomSheet addMoneyBottomSheet = this.add_money_bottom_sheet;
        if (addMoneyBottomSheet != null) {
            arrayList.add("add_money_bottom_sheet=" + addMoneyBottomSheet);
        }
        BalanceHomeCallToAction balanceHomeCallToAction = this.balance_home_call_to_action;
        if (balanceHomeCallToAction != null) {
            arrayList.add("balance_home_call_to_action=" + balanceHomeCallToAction);
        }
        DirectDepositAction directDepositAction = this.direct_deposit_action;
        if (directDepositAction != null) {
            arrayList.add("direct_deposit_action=" + directDepositAction);
        }
        if (!this.add_money_sheet_sections.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("add_money_sheet_sections=", arrayList, this.add_money_sheet_sections);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankingTab{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Appearance;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTIVE", "INACTIVE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Appearance implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Appearance ACTIVE = new Appearance("ACTIVE", 0, 1);
        public static final Appearance INACTIVE = new Appearance("INACTIVE", 1, 2);

        private static final /* synthetic */ Appearance[] $values() {
            return new Appearance[]{ACTIVE, INACTIVE};
        }

        static {
            Appearance[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Appearance.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Appearance$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public BankingTab.Appearance fromValue(int value) {
                    return BankingTab.Appearance.INSTANCE.fromValue(value);
                }
            };
        }

        private Appearance(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Appearance fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Appearance$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/unicorn/BankingTab$Appearance;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Appearance fromValue(int value) {
                if (value == 1) {
                    return Appearance.ACTIVE;
                }
                if (value != 2) {
                    return null;
                }
                return Appearance.INACTIVE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "button_text", "button_client_route_action", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceHomeCallToAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BalanceHomeCallToAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientRouteAction#ADAPTER", schemaIndex = 4, tag = 5)
        public final ClientRouteAction button_client_route_action;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString button_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image image;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizedString subtitle;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "button_text", "button_client_route_action", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ClientRouteAction button_client_route_action;
            public LocalizedString button_text;
            public Image image;
            public LocalizedString subtitle;
            public LocalizedString title;

            @Override // com.squareup.wire.Message.Builder
            public BalanceHomeCallToAction build() {
                return new BalanceHomeCallToAction(this.image, this.title, this.subtitle, this.button_text, this.button_client_route_action, buildUnknownFields());
            }

            public final Builder button_client_route_action(ClientRouteAction button_client_route_action) {
                this.button_client_route_action = button_client_route_action;
                return this;
            }

            public final Builder button_text(LocalizedString button_text) {
                this.button_text = button_text;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
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
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BalanceHomeCallToAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$BalanceHomeCallToAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BalanceHomeCallToAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.BalanceHomeCallToAction((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (BankingTab.ClientRouteAction) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = TransactorKt.decodeMessageOrMerge(BankingTab.ClientRouteAction.ADAPTER, reader, obj5);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.BalanceHomeCallToAction value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 4, value.button_text);
                    BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 5, value.button_client_route_action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.BalanceHomeCallToAction value) {
                    value.getClass();
                    int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return BankingTab.ClientRouteAction.ADAPTER.encodedSizeWithTag(5, value.button_client_route_action) + protoAdapter2.encodedSizeWithTag(4, value.button_text) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BalanceHomeCallToAction redact(BankingTab.BalanceHomeCallToAction value) {
                    value.getClass();
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    LocalizedString localizedString = value.title;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.subtitle;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    LocalizedString localizedString5 = value.button_text;
                    LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                    BankingTab.ClientRouteAction clientRouteAction = value.button_client_route_action;
                    return value.copy(image2, localizedString2, localizedString4, localizedString6, clientRouteAction != null ? (BankingTab.ClientRouteAction) BankingTab.ClientRouteAction.ADAPTER.redact(clientRouteAction) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.BalanceHomeCallToAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 5, value.button_client_route_action);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 4, value.button_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BalanceHomeCallToAction(Image image, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ClientRouteAction clientRouteAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? null : localizedString2, (i & 8) != 0 ? null : localizedString3, (i & 16) != 0 ? null : clientRouteAction, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BalanceHomeCallToAction copy$default(BalanceHomeCallToAction balanceHomeCallToAction, Image image, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ClientRouteAction clientRouteAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = balanceHomeCallToAction.image;
            }
            if ((i & 2) != 0) {
                localizedString = balanceHomeCallToAction.title;
            }
            if ((i & 4) != 0) {
                localizedString2 = balanceHomeCallToAction.subtitle;
            }
            if ((i & 8) != 0) {
                localizedString3 = balanceHomeCallToAction.button_text;
            }
            if ((i & 16) != 0) {
                clientRouteAction = balanceHomeCallToAction.button_client_route_action;
            }
            if ((i & 32) != 0) {
                byteString = balanceHomeCallToAction.unknownFields();
            }
            ClientRouteAction clientRouteAction2 = clientRouteAction;
            ByteString byteString2 = byteString;
            return balanceHomeCallToAction.copy(image, localizedString, localizedString2, localizedString3, clientRouteAction2, byteString2);
        }

        public final BalanceHomeCallToAction copy(Image image, LocalizedString title, LocalizedString subtitle, LocalizedString button_text, ClientRouteAction button_client_route_action, ByteString unknownFields) {
            unknownFields.getClass();
            return new BalanceHomeCallToAction(image, title, subtitle, button_text, button_client_route_action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BalanceHomeCallToAction)) {
                return false;
            }
            BalanceHomeCallToAction balanceHomeCallToAction = (BalanceHomeCallToAction) other;
            return Intrinsics.areEqual(unknownFields(), balanceHomeCallToAction.unknownFields()) && Intrinsics.areEqual(this.image, balanceHomeCallToAction.image) && Intrinsics.areEqual(this.title, balanceHomeCallToAction.title) && Intrinsics.areEqual(this.subtitle, balanceHomeCallToAction.subtitle) && Intrinsics.areEqual(this.button_text, balanceHomeCallToAction.button_text) && Intrinsics.areEqual(this.button_client_route_action, balanceHomeCallToAction.button_client_route_action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.button_text;
            int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            ClientRouteAction clientRouteAction = this.button_client_route_action;
            int hashCode6 = hashCode5 + (clientRouteAction != null ? clientRouteAction.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.button_text = this.button_text;
            builder.button_client_route_action = this.button_client_route_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.button_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString3, arrayList);
            }
            ClientRouteAction clientRouteAction = this.button_client_route_action;
            if (clientRouteAction != null) {
                arrayList.add("button_client_route_action=" + clientRouteAction);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceHomeCallToAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$BalanceHomeCallToAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BalanceHomeCallToAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public BalanceHomeCallToAction() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceHomeCallToAction(Image image, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ClientRouteAction clientRouteAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.button_text = localizedString3;
            this.button_client_route_action = clientRouteAction;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#$%B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0014\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0082\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u0096\u0080\u0004J\b\u0010 \u001a\u00020\u0004H\u0016J\u0099\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\"R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0019¨\u0006&"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$Builder;", "id", "", "main_text", "localizable_main_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "secondary_text", "localizable_secondary_text", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "image", "Lcom/squareup/protos/cash/ui/Image;", "appearance", "Lcom/squareup/protos/unicorn/BankingTab$Appearance;", "NavigationAction", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;", "is_badged", "", "has_new_pill", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/cash/ui/Icon;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/unicorn/BankingTab$Appearance;Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/cash/ui/Icon;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/unicorn/BankingTab$Appearance;Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/unicorn/BankingTab$BankingOption;", "Builder", "NavigationAction_", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BankingOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BankingOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 8)
        public final NavigationAction_ NavigationAction;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Appearance#ADAPTER", schemaIndex = 7, tag = 5)
        public final Appearance appearance;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 10)
        public final Boolean has_new_pill;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 5, tag = 13)
        public final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String id;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 6, tag = 4)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 9)
        public final Boolean is_badged;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 2, tag = 11)
        public final LocalizableString localizable_main_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 4, tag = 12)
        public final LocalizableString localizable_secondary_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String main_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 3)
        public final String secondary_text;

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption;", "<init>", "()V", "id", "", "main_text", "localizable_main_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "secondary_text", "localizable_secondary_text", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "image", "Lcom/squareup/protos/cash/ui/Image;", "appearance", "Lcom/squareup/protos/unicorn/BankingTab$Appearance;", "NavigationAction", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;", "is_badged", "", "Ljava/lang/Boolean;", "has_new_pill", "(Ljava/lang/Boolean;)Lcom/squareup/protos/unicorn/BankingTab$BankingOption$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public NavigationAction_ NavigationAction;
            public Appearance appearance;
            public Boolean has_new_pill;
            public Icon icon;
            public String id;
            public Image image;
            public Boolean is_badged;
            public LocalizableString localizable_main_text;
            public LocalizableString localizable_secondary_text;
            public String main_text;
            public String secondary_text;

            public final Builder NavigationAction(NavigationAction_ NavigationAction) {
                this.NavigationAction = NavigationAction;
                return this;
            }

            public final Builder appearance(Appearance appearance) {
                this.appearance = appearance;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public BankingOption build() {
                return new BankingOption(this.id, this.main_text, this.localizable_main_text, this.secondary_text, this.localizable_secondary_text, this.icon, this.image, this.appearance, this.NavigationAction, this.is_badged, this.has_new_pill, buildUnknownFields());
            }

            public final Builder has_new_pill(Boolean has_new_pill) {
                this.has_new_pill = has_new_pill;
                return this;
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder is_badged(Boolean is_badged) {
                this.is_badged = is_badged;
                return this;
            }

            public final Builder localizable_main_text(LocalizableString localizable_main_text) {
                this.localizable_main_text = localizable_main_text;
                return this;
            }

            public final Builder localizable_secondary_text(LocalizableString localizable_secondary_text) {
                this.localizable_secondary_text = localizable_secondary_text;
                return this;
            }

            public final Builder main_text(String main_text) {
                this.main_text = main_text;
                return this;
            }

            public final Builder secondary_text(String secondary_text) {
                this.secondary_text = secondary_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BankingOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$BankingOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BankingOption decode(ProtoReader reader) {
                    Object obj;
                    Object obj2;
                    BankingTab.BankingOption.NavigationAction_ clientScenarioAction;
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
                    Object obj12 = null;
                    BankingTab.BankingOption.NavigationAction_ navigationAction_ = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.BankingOption((String) obj3, (String) obj4, (LocalizableString) obj5, (String) obj6, (LocalizableString) obj7, (Icon) obj8, (Image) obj9, (BankingTab.Appearance) obj10, navigationAction_, (Boolean) obj11, (Boolean) obj12, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj9 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj9);
                                break;
                            case 5:
                                try {
                                    obj10 = BankingTab.Appearance.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    obj = obj3;
                                    obj2 = obj4;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                clientScenarioAction = new BankingTab.BankingOption.NavigationAction_.ClientScenarioAction((BankingTab.ClientScenarioAction) BankingTab.ClientScenarioAction.ADAPTER.decode(reader));
                                navigationAction_ = clientScenarioAction;
                                break;
                            case 7:
                                clientScenarioAction = new BankingTab.BankingOption.NavigationAction_.Dialog((BankingTab.Dialog) BankingTab.Dialog.ADAPTER.decode(reader));
                                navigationAction_ = clientScenarioAction;
                                break;
                            case 8:
                                clientScenarioAction = new BankingTab.BankingOption.NavigationAction_.ClientRouteAction((BankingTab.ClientRouteAction) BankingTab.ClientRouteAction.ADAPTER.decode(reader));
                                navigationAction_ = clientScenarioAction;
                                break;
                            case 9:
                                obj11 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 10:
                                obj12 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 11:
                                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj5);
                                break;
                            case 12:
                                obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj7);
                                break;
                            case 13:
                                obj8 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj8);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj3;
                                obj2 = obj4;
                                obj3 = obj;
                                obj4 = obj2;
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.BankingOption value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.id);
                    protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 11, value.localizable_main_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.secondary_text);
                    protoAdapter3.encodeWithTag(writer, 12, value.localizable_secondary_text);
                    Icon.ADAPTER.encodeWithTag(writer, 13, value.icon);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    BankingTab.Appearance.ADAPTER.encodeWithTag(writer, 5, value.appearance);
                    ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                    protoAdapter4.encodeWithTag(writer, 9, value.is_badged);
                    protoAdapter4.encodeWithTag(writer, 10, value.has_new_pill);
                    BankingTab.BankingOption.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) {
                        BankingTab.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 6, ((BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.Dialog) {
                        BankingTab.Dialog.ADAPTER.encodeWithTag(writer, 7, ((BankingTab.BankingOption.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientRouteAction) {
                        BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 8, ((BankingTab.BankingOption.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    } else if (navigationAction_ != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.BankingOption value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value.main_text) + protoAdapter2.encodedSizeWithTag(1, value.id) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    int encodedSizeWithTag3 = BankingTab.Appearance.ADAPTER.encodedSizeWithTag(5, value.appearance) + Image.ADAPTER.encodedSizeWithTag(4, value.image) + Icon.ADAPTER.encodedSizeWithTag(13, value.icon) + protoAdapter3.encodedSizeWithTag(12, value.localizable_secondary_text) + protoAdapter2.encodedSizeWithTag(3, value.secondary_text) + protoAdapter3.encodedSizeWithTag(11, value.localizable_main_text) + encodedSizeWithTag2;
                    BankingTab.BankingOption.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) {
                        encodedSizeWithTag = BankingTab.ClientScenarioAction.ADAPTER.encodedSizeWithTag(6, ((BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.Dialog) {
                        encodedSizeWithTag = BankingTab.Dialog.ADAPTER.encodedSizeWithTag(7, ((BankingTab.BankingOption.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else {
                        if (!(navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientRouteAction)) {
                            if (navigationAction_ != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                            return protoAdapter4.encodedSizeWithTag(10, value.has_new_pill) + protoAdapter4.encodedSizeWithTag(9, value.is_badged) + encodedSizeWithTag3;
                        }
                        encodedSizeWithTag = BankingTab.ClientRouteAction.ADAPTER.encodedSizeWithTag(8, ((BankingTab.BankingOption.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    }
                    encodedSizeWithTag3 += encodedSizeWithTag;
                    ProtoAdapter protoAdapter42 = ProtoAdapter.BOOL;
                    return protoAdapter42.encodedSizeWithTag(10, value.has_new_pill) + protoAdapter42.encodedSizeWithTag(9, value.is_badged) + encodedSizeWithTag3;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BankingOption redact(BankingTab.BankingOption value) {
                    value.getClass();
                    LocalizableString localizableString = value.localizable_main_text;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.localizable_secondary_text;
                    LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                    Icon icon = value.icon;
                    Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                    Image image = value.image;
                    return BankingTab.BankingOption.copy$default(value, null, null, localizableString2, null, localizableString4, icon2, image != null ? (Image) Image.ADAPTER.redact(image) : null, null, null, null, null, ByteString.EMPTY, 1931, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.BankingOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BankingTab.BankingOption.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) {
                        BankingTab.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 6, ((BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.Dialog) {
                        BankingTab.Dialog.ADAPTER.encodeWithTag(writer, 7, ((BankingTab.BankingOption.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientRouteAction) {
                        BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 8, ((BankingTab.BankingOption.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    } else if (navigationAction_ != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                    protoAdapter2.encodeWithTag(writer, 10, value.has_new_pill);
                    protoAdapter2.encodeWithTag(writer, 9, value.is_badged);
                    BankingTab.Appearance.ADAPTER.encodeWithTag(writer, 5, value.appearance);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    Icon.ADAPTER.encodeWithTag(writer, 13, value.icon);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 12, value.localizable_secondary_text);
                    ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
                    protoAdapter4.encodeWithTag(writer, 3, value.secondary_text);
                    protoAdapter3.encodeWithTag(writer, 11, value.localizable_main_text);
                    protoAdapter4.encodeWithTag(writer, 2, value.main_text);
                    protoAdapter4.encodeWithTag(writer, 1, value.id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BankingOption(String str, String str2, LocalizableString localizableString, String str3, LocalizableString localizableString2, Icon icon, Image image, Appearance appearance, NavigationAction_ navigationAction_, Boolean bool, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : localizableString, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : localizableString2, (i & 32) != 0 ? null : icon, (i & 64) != 0 ? null : image, (i & 128) != 0 ? null : appearance, (i & 256) != 0 ? null : navigationAction_, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BankingOption copy$default(BankingOption bankingOption, String str, String str2, LocalizableString localizableString, String str3, LocalizableString localizableString2, Icon icon, Image image, Appearance appearance, NavigationAction_ navigationAction_, Boolean bool, Boolean bool2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bankingOption.id;
            }
            if ((i & 2) != 0) {
                str2 = bankingOption.main_text;
            }
            if ((i & 4) != 0) {
                localizableString = bankingOption.localizable_main_text;
            }
            if ((i & 8) != 0) {
                str3 = bankingOption.secondary_text;
            }
            if ((i & 16) != 0) {
                localizableString2 = bankingOption.localizable_secondary_text;
            }
            if ((i & 32) != 0) {
                icon = bankingOption.icon;
            }
            if ((i & 64) != 0) {
                image = bankingOption.image;
            }
            if ((i & 128) != 0) {
                appearance = bankingOption.appearance;
            }
            if ((i & 256) != 0) {
                navigationAction_ = bankingOption.NavigationAction;
            }
            if ((i & 512) != 0) {
                bool = bankingOption.is_badged;
            }
            if ((i & 1024) != 0) {
                bool2 = bankingOption.has_new_pill;
            }
            if ((i & 2048) != 0) {
                byteString = bankingOption.unknownFields();
            }
            Boolean bool3 = bool2;
            ByteString byteString2 = byteString;
            NavigationAction_ navigationAction_2 = navigationAction_;
            Boolean bool4 = bool;
            Image image2 = image;
            Appearance appearance2 = appearance;
            LocalizableString localizableString3 = localizableString2;
            Icon icon2 = icon;
            return bankingOption.copy(str, str2, localizableString, str3, localizableString3, icon2, image2, appearance2, navigationAction_2, bool4, bool3, byteString2);
        }

        public final BankingOption copy(String id, String main_text, LocalizableString localizable_main_text, String secondary_text, LocalizableString localizable_secondary_text, Icon icon, Image image, Appearance appearance, NavigationAction_ NavigationAction, Boolean is_badged, Boolean has_new_pill, ByteString unknownFields) {
            unknownFields.getClass();
            return new BankingOption(id, main_text, localizable_main_text, secondary_text, localizable_secondary_text, icon, image, appearance, NavigationAction, is_badged, has_new_pill, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BankingOption)) {
                return false;
            }
            BankingOption bankingOption = (BankingOption) other;
            return Intrinsics.areEqual(unknownFields(), bankingOption.unknownFields()) && Intrinsics.areEqual(this.id, bankingOption.id) && Intrinsics.areEqual(this.main_text, bankingOption.main_text) && Intrinsics.areEqual(this.localizable_main_text, bankingOption.localizable_main_text) && Intrinsics.areEqual(this.secondary_text, bankingOption.secondary_text) && Intrinsics.areEqual(this.localizable_secondary_text, bankingOption.localizable_secondary_text) && Intrinsics.areEqual(this.icon, bankingOption.icon) && Intrinsics.areEqual(this.image, bankingOption.image) && this.appearance == bankingOption.appearance && Intrinsics.areEqual(this.NavigationAction, bankingOption.NavigationAction) && Intrinsics.areEqual(this.is_badged, bankingOption.is_badged) && Intrinsics.areEqual(this.has_new_pill, bankingOption.has_new_pill);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.main_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_main_text;
            int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str3 = this.secondary_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_secondary_text;
            int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode7 = (hashCode6 + (icon != null ? icon.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode8 = (hashCode7 + (image != null ? image.hashCode() : 0)) * 37;
            Appearance appearance = this.appearance;
            int hashCode9 = (hashCode8 + (appearance != null ? appearance.hashCode() : 0)) * 37;
            NavigationAction_ navigationAction_ = this.NavigationAction;
            int hashCode10 = (hashCode9 + (navigationAction_ != null ? navigationAction_.hashCode() : 0)) * 37;
            Boolean bool = this.is_badged;
            int hashCode11 = (hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.has_new_pill;
            int hashCode12 = hashCode11 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.id = this.id;
            builder.main_text = this.main_text;
            builder.localizable_main_text = this.localizable_main_text;
            builder.secondary_text = this.secondary_text;
            builder.localizable_secondary_text = this.localizable_secondary_text;
            builder.icon = this.icon;
            builder.image = this.image;
            builder.appearance = this.appearance;
            builder.NavigationAction = this.NavigationAction;
            builder.is_badged = this.is_badged;
            builder.has_new_pill = this.has_new_pill;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            String str2 = this.main_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_main_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString, arrayList);
            }
            String str3 = this.secondary_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "secondary_text=", arrayList);
            }
            LocalizableString localizableString2 = this.localizable_secondary_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_secondary_text=", localizableString2, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Appearance appearance = this.appearance;
            if (appearance != null) {
                arrayList.add("appearance=" + appearance);
            }
            NavigationAction_ navigationAction_ = this.NavigationAction;
            if (navigationAction_ != null) {
                arrayList.add("NavigationAction=" + navigationAction_);
            }
            Boolean bool = this.is_badged;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
            }
            Boolean bool2 = this.has_new_pill;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("has_new_pill=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BankingOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$BankingOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BankingOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;", "", "<init>", "()V", "ClientScenarioAction", "Dialog", "ClientRouteAction", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_$Dialog;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class NavigationAction_ {

            @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientRouteAction#ADAPTER", declaredName = "client_route_action", tag = 8)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ClientRouteAction extends NavigationAction_ {
                private final ClientRouteAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ClientRouteAction(ClientRouteAction clientRouteAction) {
                    super(null);
                    clientRouteAction.getClass();
                    this.value = clientRouteAction;
                }

                public static /* synthetic */ ClientRouteAction copy$default(ClientRouteAction clientRouteAction, ClientRouteAction clientRouteAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        clientRouteAction2 = clientRouteAction.value;
                    }
                    return clientRouteAction.copy(clientRouteAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final ClientRouteAction getValue() {
                    return this.value;
                }

                public final ClientRouteAction copy(ClientRouteAction value) {
                    value.getClass();
                    return new ClientRouteAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ClientRouteAction) && Intrinsics.areEqual(this.value, ((ClientRouteAction) other).value);
                }

                public final ClientRouteAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ClientRouteAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientScenarioAction#ADAPTER", declaredName = "client_scenario_action", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ClientScenarioAction extends NavigationAction_ {
                private final ClientScenarioAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ClientScenarioAction(ClientScenarioAction clientScenarioAction) {
                    super(null);
                    clientScenarioAction.getClass();
                    this.value = clientScenarioAction;
                }

                public static /* synthetic */ ClientScenarioAction copy$default(ClientScenarioAction clientScenarioAction, ClientScenarioAction clientScenarioAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        clientScenarioAction2 = clientScenarioAction.value;
                    }
                    return clientScenarioAction.copy(clientScenarioAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final ClientScenarioAction getValue() {
                    return this.value;
                }

                public final ClientScenarioAction copy(ClientScenarioAction value) {
                    value.getClass();
                    return new ClientScenarioAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ClientScenarioAction) && Intrinsics.areEqual(this.value, ((ClientScenarioAction) other).value);
                }

                public final ClientScenarioAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ClientScenarioAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$Dialog#ADAPTER", declaredName = "dialog", tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_$Dialog;", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$Dialog;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Dialog extends NavigationAction_ {
                private final Dialog value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Dialog(Dialog dialog) {
                    super(null);
                    dialog.getClass();
                    this.value = dialog;
                }

                public static /* synthetic */ Dialog copy$default(Dialog dialog, Dialog dialog2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        dialog2 = dialog.value;
                    }
                    return dialog.copy(dialog2);
                }

                /* renamed from: component1, reason: from getter */
                public final Dialog getValue() {
                    return this.value;
                }

                public final Dialog copy(Dialog value) {
                    value.getClass();
                    return new Dialog(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Dialog) && Intrinsics.areEqual(this.value, ((Dialog) other).value);
                }

                public final Dialog getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Dialog(value=" + this.value + ")";
                }
            }

            public /* synthetic */ NavigationAction_(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private NavigationAction_() {
            }
        }

        public BankingOption() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankingOption(String str, String str2, LocalizableString localizableString, String str3, LocalizableString localizableString2, Icon icon, Image image, Appearance appearance, NavigationAction_ navigationAction_, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.main_text = str2;
            this.localizable_main_text = localizableString;
            this.secondary_text = str3;
            this.localizable_secondary_text = localizableString2;
            this.icon = icon;
            this.image = image;
            this.appearance = appearance;
            this.NavigationAction = navigationAction_;
            this.is_badged = bool;
            this.has_new_pill = bool2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BorrowOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$BorrowOption$Builder;", "id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BorrowOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BorrowOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BorrowOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$BorrowOption;", "<init>", "()V", "id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String id;

            @Override // com.squareup.wire.Message.Builder
            public BorrowOption build() {
                return new BorrowOption(this.id, buildUnknownFields());
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BorrowOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$BorrowOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BorrowOption decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.BorrowOption((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.BorrowOption value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.BorrowOption value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.BorrowOption redact(BankingTab.BorrowOption value) {
                    value.getClass();
                    return BankingTab.BorrowOption.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.BorrowOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BorrowOption(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BorrowOption copy$default(BorrowOption borrowOption, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = borrowOption.id;
            }
            if ((i & 2) != 0) {
                byteString = borrowOption.unknownFields();
            }
            return borrowOption.copy(str, byteString);
        }

        public final BorrowOption copy(String id, ByteString unknownFields) {
            unknownFields.getClass();
            return new BorrowOption(id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BorrowOption)) {
                return false;
            }
            BorrowOption borrowOption = (BorrowOption) other;
            return Intrinsics.areEqual(unknownFields(), borrowOption.unknownFields()) && Intrinsics.areEqual(this.id, borrowOption.id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.id = this.id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$BorrowOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$BorrowOption$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$BorrowOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$BorrowOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BorrowOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BorrowOption() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BorrowOption(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction$Builder;", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientRouteAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "<init>", "()V", "url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String url;

            @Override // com.squareup.wire.Message.Builder
            public ClientRouteAction build() {
                return new ClientRouteAction(this.url, buildUnknownFields());
            }

            public final Builder url(String url) {
                this.url = url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientRouteAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$ClientRouteAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.ClientRouteAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.ClientRouteAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.ClientRouteAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.ClientRouteAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.url) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.ClientRouteAction redact(BankingTab.ClientRouteAction value) {
                    value.getClass();
                    return BankingTab.ClientRouteAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.ClientRouteAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ClientRouteAction(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ClientRouteAction copy$default(ClientRouteAction clientRouteAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientRouteAction.url;
            }
            if ((i & 2) != 0) {
                byteString = clientRouteAction.unknownFields();
            }
            return clientRouteAction.copy(str, byteString);
        }

        public final ClientRouteAction copy(String url, ByteString unknownFields) {
            unknownFields.getClass();
            return new ClientRouteAction(url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ClientRouteAction)) {
                return false;
            }
            ClientRouteAction clientRouteAction = (ClientRouteAction) other;
            return Intrinsics.areEqual(unknownFields(), clientRouteAction.unknownFields()) && Intrinsics.areEqual(this.url, clientRouteAction.url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.url = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ClientRouteAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ClientRouteAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction$Builder;", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/ClientScenario;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientScenarioAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientScenarioAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.ClientScenario#ADAPTER", schemaIndex = 0, tag = 1)
        public final ClientScenario client_scenario;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "<init>", "()V", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ClientScenario client_scenario;

            @Override // com.squareup.wire.Message.Builder
            public ClientScenarioAction build() {
                return new ClientScenarioAction(this.client_scenario, buildUnknownFields());
            }

            public final Builder client_scenario(ClientScenario client_scenario) {
                this.client_scenario = client_scenario;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientScenarioAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$ClientScenarioAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.ClientScenarioAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.ClientScenarioAction((ClientScenario) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = ClientScenario.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.ClientScenarioAction value) {
                    writer.getClass();
                    value.getClass();
                    ClientScenario.ADAPTER.encodeWithTag(writer, 1, value.client_scenario);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.ClientScenarioAction value) {
                    value.getClass();
                    return ClientScenario.ADAPTER.encodedSizeWithTag(1, value.client_scenario) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.ClientScenarioAction redact(BankingTab.ClientScenarioAction value) {
                    value.getClass();
                    return BankingTab.ClientScenarioAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.ClientScenarioAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ClientScenario.ADAPTER.encodeWithTag(writer, 1, value.client_scenario);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ClientScenarioAction(ClientScenario clientScenario, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : clientScenario, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ClientScenarioAction copy$default(ClientScenarioAction clientScenarioAction, ClientScenario clientScenario, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                clientScenario = clientScenarioAction.client_scenario;
            }
            if ((i & 2) != 0) {
                byteString = clientScenarioAction.unknownFields();
            }
            return clientScenarioAction.copy(clientScenario, byteString);
        }

        public final ClientScenarioAction copy(ClientScenario client_scenario, ByteString unknownFields) {
            unknownFields.getClass();
            return new ClientScenarioAction(client_scenario, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ClientScenarioAction)) {
                return false;
            }
            ClientScenarioAction clientScenarioAction = (ClientScenarioAction) other;
            return Intrinsics.areEqual(unknownFields(), clientScenarioAction.unknownFields()) && this.client_scenario == clientScenarioAction.client_scenario;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ClientScenario clientScenario = this.client_scenario;
            int hashCode2 = hashCode + (clientScenario != null ? clientScenario.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.client_scenario = this.client_scenario;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            ClientScenario clientScenario = this.client_scenario;
            if (clientScenario != null) {
                Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientScenarioAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ClientScenarioAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ClientScenarioAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientScenarioAction(ClientScenario clientScenario, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_scenario = clientScenario;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016Jd\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Builder;", "title", "", "localizable_title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "main_text", "localizable_main_text", "primary_button", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;", "secondary_button", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Button", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Dialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Dialog> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 6)
        public final String id;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 8)
        public final LocalizableString localizable_main_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 7)
        public final LocalizableString localizable_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 1)
        public final String main_text;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Dialog$Button#ADAPTER", schemaIndex = 4, tag = 2)
        public final Button primary_button;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Dialog$Button#ADAPTER", schemaIndex = 5, tag = 3)
        public final Button secondary_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 5)
        public final String title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "<init>", "()V", "title", "", "localizable_title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "main_text", "localizable_main_text", "primary_button", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;", "secondary_button", "id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String id;
            public LocalizableString localizable_main_text;
            public LocalizableString localizable_title;
            public String main_text;
            public Button primary_button;
            public Button secondary_button;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public Dialog build() {
                return new Dialog(this.title, this.localizable_title, this.main_text, this.localizable_main_text, this.primary_button, this.secondary_button, this.id, buildUnknownFields());
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }

            public final Builder localizable_main_text(LocalizableString localizable_main_text) {
                this.localizable_main_text = localizable_main_text;
                return this;
            }

            public final Builder localizable_title(LocalizableString localizable_title) {
                this.localizable_title = localizable_title;
                return this;
            }

            public final Builder main_text(String main_text) {
                this.main_text = main_text;
                return this;
            }

            public final Builder primary_button(Button primary_button) {
                this.primary_button = primary_button;
                return this;
            }

            public final Builder secondary_button(Button secondary_button) {
                this.secondary_button = secondary_button;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0017\u0018\u0019\u001aBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Builder;", "text", "", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "Action", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_;", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Action_", "Companion", "DismissAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireSealedOneof(schemaIndex = 2)
            public final Action_ Action;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String id;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 5)
            public final LocalizableString localizable_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String text;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;", "<init>", "()V", "text", "", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "Action", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_;", "id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Action_ Action;
                public String id;
                public LocalizableString localizable_text;
                public String text;

                public final Builder Action(Action_ Action) {
                    this.Action = Action;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public Button build() {
                    return new Button(this.text, this.localizable_text, this.Action, this.id, buildUnknownFields());
                }

                public final Builder id(String id) {
                    this.id = id;
                    return this;
                }

                public final Builder localizable_text(LocalizableString localizable_text) {
                    this.localizable_text = localizable_text;
                    return this;
                }

                public final Builder text(String text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Dialog$Button$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BankingTab.Dialog.Button decode(ProtoReader reader) {
                        BankingTab.Dialog.Button.Action_ clientScenarioAction;
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        BankingTab.Dialog.Button.Action_ action_ = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BankingTab.Dialog.Button((String) obj, (LocalizableString) obj2, action_, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag != 1) {
                                if (nextTag == 2) {
                                    clientScenarioAction = new BankingTab.Dialog.Button.Action_.ClientScenarioAction((BankingTab.ClientScenarioAction) BankingTab.ClientScenarioAction.ADAPTER.decode(reader));
                                } else if (nextTag == 3) {
                                    clientScenarioAction = new BankingTab.Dialog.Button.Action_.DismissAction((BankingTab.Dialog.Button.DismissAction) BankingTab.Dialog.Button.DismissAction.ADAPTER.decode(reader));
                                } else if (nextTag == 4) {
                                    obj3 = ProtoAdapter.STRING.decode(reader);
                                } else if (nextTag != 5) {
                                    reader.readUnknownField(nextTag);
                                } else {
                                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                                }
                                action_ = clientScenarioAction;
                            } else {
                                obj = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BankingTab.Dialog.Button value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.text);
                        LocalizableString.ADAPTER.encodeWithTag(writer, 5, value.localizable_text);
                        protoAdapter2.encodeWithTag(writer, 4, value.id);
                        BankingTab.Dialog.Button.Action_ action_ = value.Action;
                        if (action_ instanceof BankingTab.Dialog.Button.Action_.ClientScenarioAction) {
                            BankingTab.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 2, ((BankingTab.Dialog.Button.Action_.ClientScenarioAction) action_).getValue());
                        } else if (action_ instanceof BankingTab.Dialog.Button.Action_.DismissAction) {
                            BankingTab.Dialog.Button.DismissAction.ADAPTER.encodeWithTag(writer, 3, ((BankingTab.Dialog.Button.Action_.DismissAction) action_).getValue());
                        } else if (action_ != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BankingTab.Dialog.Button value) {
                        int encodedSizeWithTag;
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag2 = LocalizableString.ADAPTER.encodedSizeWithTag(5, value.localizable_text) + protoAdapter2.encodedSizeWithTag(1, value.text) + size$okio;
                        BankingTab.Dialog.Button.Action_ action_ = value.Action;
                        if (action_ instanceof BankingTab.Dialog.Button.Action_.ClientScenarioAction) {
                            encodedSizeWithTag = BankingTab.ClientScenarioAction.ADAPTER.encodedSizeWithTag(2, ((BankingTab.Dialog.Button.Action_.ClientScenarioAction) action_).getValue());
                        } else {
                            if (!(action_ instanceof BankingTab.Dialog.Button.Action_.DismissAction)) {
                                if (action_ != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return 0;
                                }
                                return protoAdapter2.encodedSizeWithTag(4, value.id) + encodedSizeWithTag2;
                            }
                            encodedSizeWithTag = BankingTab.Dialog.Button.DismissAction.ADAPTER.encodedSizeWithTag(3, ((BankingTab.Dialog.Button.Action_.DismissAction) action_).getValue());
                        }
                        encodedSizeWithTag2 += encodedSizeWithTag;
                        return protoAdapter2.encodedSizeWithTag(4, value.id) + encodedSizeWithTag2;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BankingTab.Dialog.Button redact(BankingTab.Dialog.Button value) {
                        value.getClass();
                        LocalizableString localizableString = value.localizable_text;
                        return BankingTab.Dialog.Button.copy$default(value, null, localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null, null, null, ByteString.EMPTY, 13, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BankingTab.Dialog.Button value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        BankingTab.Dialog.Button.Action_ action_ = value.Action;
                        if (action_ instanceof BankingTab.Dialog.Button.Action_.ClientScenarioAction) {
                            BankingTab.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 2, ((BankingTab.Dialog.Button.Action_.ClientScenarioAction) action_).getValue());
                        } else if (action_ instanceof BankingTab.Dialog.Button.Action_.DismissAction) {
                            BankingTab.Dialog.Button.DismissAction.ADAPTER.encodeWithTag(writer, 3, ((BankingTab.Dialog.Button.Action_.DismissAction) action_).getValue());
                        } else if (action_ != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 4, value.id);
                        LocalizableString.ADAPTER.encodeWithTag(writer, 5, value.localizable_text);
                        protoAdapter2.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Button(String str, LocalizableString localizableString, Action_ action_, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? null : action_, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Button copy$default(Button button, String str, LocalizableString localizableString, Action_ action_, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = button.text;
                }
                if ((i & 2) != 0) {
                    localizableString = button.localizable_text;
                }
                if ((i & 4) != 0) {
                    action_ = button.Action;
                }
                if ((i & 8) != 0) {
                    str2 = button.id;
                }
                if ((i & 16) != 0) {
                    byteString = button.unknownFields();
                }
                ByteString byteString2 = byteString;
                Action_ action_2 = action_;
                return button.copy(str, localizableString, action_2, str2, byteString2);
            }

            public final Button copy(String text, LocalizableString localizable_text, Action_ Action, String id, ByteString unknownFields) {
                unknownFields.getClass();
                return new Button(text, localizable_text, Action, id, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.localizable_text, button.localizable_text) && Intrinsics.areEqual(this.Action, button.Action) && Intrinsics.areEqual(this.id, button.id);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_text;
                int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                Action_ action_ = this.Action;
                int hashCode4 = (hashCode3 + (action_ != null ? action_.hashCode() : 0)) * 37;
                String str2 = this.id;
                int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.localizable_text = this.localizable_text;
                builder.Action = this.Action;
                builder.id = this.id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                LocalizableString localizableString = this.localizable_text;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
                }
                Action_ action_ = this.Action;
                if (action_ != null) {
                    arrayList.add("Action=" + action_);
                }
                String str2 = this.id;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class DismissAction extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<DismissAction> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    @Override // com.squareup.wire.Message.Builder
                    public DismissAction build() {
                        return new DismissAction(buildUnknownFields());
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DismissAction.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Dialog$Button$DismissAction$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public BankingTab.Dialog.Button.DismissAction decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new BankingTab.Dialog.Button.DismissAction(reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                reader.readUnknownField(nextTag);
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, BankingTab.Dialog.Button.DismissAction value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(BankingTab.Dialog.Button.DismissAction value) {
                            value.getClass();
                            return value.unknownFields().getSize$okio();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public BankingTab.Dialog.Button.DismissAction redact(BankingTab.Dialog.Button.DismissAction value) {
                            value.getClass();
                            return value.copy(ByteString.EMPTY);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, BankingTab.Dialog.Button.DismissAction value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ DismissAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ DismissAction copy$default(DismissAction dismissAction, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        byteString = dismissAction.unknownFields();
                    }
                    return dismissAction.copy(byteString);
                }

                public final DismissAction copy(ByteString unknownFields) {
                    unknownFields.getClass();
                    return new DismissAction(unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof DismissAction) && Intrinsics.areEqual(unknownFields(), ((DismissAction) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    return "DismissAction{}";
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ DismissAction build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public DismissAction() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DismissAction(ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_;", "", "<init>", "()V", "ClientScenarioAction", "DismissAction", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_$DismissAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static abstract class Action_ {

                @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientScenarioAction#ADAPTER", declaredName = "client_scenario_action", tag = 2)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class ClientScenarioAction extends Action_ {
                    private final ClientScenarioAction value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ClientScenarioAction(ClientScenarioAction clientScenarioAction) {
                        super(null);
                        clientScenarioAction.getClass();
                        this.value = clientScenarioAction;
                    }

                    public static /* synthetic */ ClientScenarioAction copy$default(ClientScenarioAction clientScenarioAction, ClientScenarioAction clientScenarioAction2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            clientScenarioAction2 = clientScenarioAction.value;
                        }
                        return clientScenarioAction.copy(clientScenarioAction2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ClientScenarioAction getValue() {
                        return this.value;
                    }

                    public final ClientScenarioAction copy(ClientScenarioAction value) {
                        value.getClass();
                        return new ClientScenarioAction(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof ClientScenarioAction) && Intrinsics.areEqual(this.value, ((ClientScenarioAction) other).value);
                    }

                    public final ClientScenarioAction getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "ClientScenarioAction(value=" + this.value + ")";
                    }
                }

                @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$Dialog$Button$DismissAction#ADAPTER", declaredName = "dismiss_action", tag = 3)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_$DismissAction;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Action_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$DismissAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class DismissAction extends Action_ {
                    private final DismissAction value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public DismissAction(DismissAction dismissAction) {
                        super(null);
                        dismissAction.getClass();
                        this.value = dismissAction;
                    }

                    public static /* synthetic */ DismissAction copy$default(DismissAction dismissAction, DismissAction dismissAction2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            dismissAction2 = dismissAction.value;
                        }
                        return dismissAction.copy(dismissAction2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final DismissAction getValue() {
                        return this.value;
                    }

                    public final DismissAction copy(DismissAction value) {
                        value.getClass();
                        return new DismissAction(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof DismissAction) && Intrinsics.areEqual(this.value, ((DismissAction) other).value);
                    }

                    public final DismissAction getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "DismissAction(value=" + this.value + ")";
                    }
                }

                public /* synthetic */ Action_(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Action_() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$Dialog$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Button build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Button() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, LocalizableString localizableString, Action_ action_, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.localizable_text = localizableString;
                this.Action = action_;
                this.id = str2;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Dialog.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Dialog$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Dialog decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.Dialog((String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, (BankingTab.Dialog.Button) obj5, (BankingTab.Dialog.Button) obj6, (String) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj5 = TransactorKt.decodeMessageOrMerge(BankingTab.Dialog.Button.ADAPTER, reader, obj5);
                                break;
                            case 3:
                                obj6 = TransactorKt.decodeMessageOrMerge(BankingTab.Dialog.Button.ADAPTER, reader, obj6);
                                break;
                            case 4:
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                            case 5:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                                break;
                            case 8:
                                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.Dialog value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.title);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 7, value.localizable_title);
                    protoAdapter2.encodeWithTag(writer, 1, value.main_text);
                    protoAdapter3.encodeWithTag(writer, 8, value.localizable_main_text);
                    ProtoAdapter protoAdapter4 = BankingTab.Dialog.Button.ADAPTER;
                    protoAdapter4.encodeWithTag(writer, 2, value.primary_button);
                    protoAdapter4.encodeWithTag(writer, 3, value.secondary_button);
                    protoAdapter2.encodeWithTag(writer, 6, value.id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.Dialog value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    int encodedSizeWithTag2 = protoAdapter3.encodedSizeWithTag(8, value.localizable_main_text) + protoAdapter2.encodedSizeWithTag(1, value.main_text) + protoAdapter3.encodedSizeWithTag(7, value.localizable_title) + encodedSizeWithTag;
                    ProtoAdapter protoAdapter4 = BankingTab.Dialog.Button.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(6, value.id) + protoAdapter4.encodedSizeWithTag(3, value.secondary_button) + protoAdapter4.encodedSizeWithTag(2, value.primary_button) + encodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Dialog redact(BankingTab.Dialog value) {
                    value.getClass();
                    LocalizableString localizableString = value.localizable_title;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.localizable_main_text;
                    LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                    BankingTab.Dialog.Button button = value.primary_button;
                    BankingTab.Dialog.Button button2 = button != null ? (BankingTab.Dialog.Button) BankingTab.Dialog.Button.ADAPTER.redact(button) : null;
                    BankingTab.Dialog.Button button3 = value.secondary_button;
                    return BankingTab.Dialog.copy$default(value, null, localizableString2, null, localizableString4, button2, button3 != null ? (BankingTab.Dialog.Button) BankingTab.Dialog.Button.ADAPTER.redact(button3) : null, null, ByteString.EMPTY, 69, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.Dialog value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 6, value.id);
                    ProtoAdapter protoAdapter3 = BankingTab.Dialog.Button.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.secondary_button);
                    protoAdapter3.encodeWithTag(writer, 2, value.primary_button);
                    ProtoAdapter protoAdapter4 = LocalizableString.ADAPTER;
                    protoAdapter4.encodeWithTag(writer, 8, value.localizable_main_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.main_text);
                    protoAdapter4.encodeWithTag(writer, 7, value.localizable_title);
                    protoAdapter2.encodeWithTag(writer, 5, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Dialog(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, Button button, Button button2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : localizableString2, (i & 16) != 0 ? null : button, (i & 32) != 0 ? null : button2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Dialog copy$default(Dialog dialog, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, Button button, Button button2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dialog.title;
            }
            if ((i & 2) != 0) {
                localizableString = dialog.localizable_title;
            }
            if ((i & 4) != 0) {
                str2 = dialog.main_text;
            }
            if ((i & 8) != 0) {
                localizableString2 = dialog.localizable_main_text;
            }
            if ((i & 16) != 0) {
                button = dialog.primary_button;
            }
            if ((i & 32) != 0) {
                button2 = dialog.secondary_button;
            }
            if ((i & 64) != 0) {
                str3 = dialog.id;
            }
            if ((i & 128) != 0) {
                byteString = dialog.unknownFields();
            }
            String str4 = str3;
            ByteString byteString2 = byteString;
            Button button3 = button;
            Button button4 = button2;
            return dialog.copy(str, localizableString, str2, localizableString2, button3, button4, str4, byteString2);
        }

        public final Dialog copy(String title, LocalizableString localizable_title, String main_text, LocalizableString localizable_main_text, Button primary_button, Button secondary_button, String id, ByteString unknownFields) {
            unknownFields.getClass();
            return new Dialog(title, localizable_title, main_text, localizable_main_text, primary_button, secondary_button, id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return Intrinsics.areEqual(unknownFields(), dialog.unknownFields()) && Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.localizable_title, dialog.localizable_title) && Intrinsics.areEqual(this.main_text, dialog.main_text) && Intrinsics.areEqual(this.localizable_main_text, dialog.localizable_main_text) && Intrinsics.areEqual(this.primary_button, dialog.primary_button) && Intrinsics.areEqual(this.secondary_button, dialog.secondary_button) && Intrinsics.areEqual(this.id, dialog.id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str2 = this.main_text;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_main_text;
            int hashCode5 = (hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode6 = (hashCode5 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode7 = (hashCode6 + (button2 != null ? button2.hashCode() : 0)) * 37;
            String str3 = this.id;
            int hashCode8 = hashCode7 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.localizable_title = this.localizable_title;
            builder.main_text = this.main_text;
            builder.localizable_main_text = this.localizable_main_text;
            builder.primary_button = this.primary_button;
            builder.secondary_button = this.secondary_button;
            builder.id = this.id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            String str2 = this.main_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_text=", arrayList);
            }
            LocalizableString localizableString2 = this.localizable_main_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString2, arrayList);
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            String str3 = this.id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Dialog{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Dialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$Dialog$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dialog build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Dialog() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, Button button, Button button2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.localizable_title = localizableString;
            this.main_text = str2;
            this.localizable_main_text = localizableString2;
            this.primary_button = button;
            this.secondary_button = button2;
            this.id = str3;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$Builder;", "NavigationAction", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "NavigationAction_", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DirectDepositAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DirectDepositAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final NavigationAction_ NavigationAction;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction;", "<init>", "()V", "NavigationAction", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public NavigationAction_ NavigationAction;

            public final Builder NavigationAction(NavigationAction_ NavigationAction) {
                this.NavigationAction = NavigationAction;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public DirectDepositAction build() {
                return new DirectDepositAction(this.NavigationAction, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DirectDepositAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$DirectDepositAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.DirectDepositAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    BankingTab.DirectDepositAction.NavigationAction_ navigationAction_ = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.DirectDepositAction(navigationAction_, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            navigationAction_ = new BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction((BankingTab.ClientScenarioAction) BankingTab.ClientScenarioAction.ADAPTER.decode(reader));
                        } else if (nextTag == 2) {
                            navigationAction_ = new BankingTab.DirectDepositAction.NavigationAction_.Dialog((BankingTab.Dialog) BankingTab.Dialog.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            navigationAction_ = new BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction((BankingTab.ClientRouteAction) BankingTab.ClientRouteAction.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.DirectDepositAction value) {
                    writer.getClass();
                    value.getClass();
                    BankingTab.DirectDepositAction.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) {
                        BankingTab.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 1, ((BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.Dialog) {
                        BankingTab.Dialog.ADAPTER.encodeWithTag(writer, 2, ((BankingTab.DirectDepositAction.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction) {
                        BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 3, ((BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    } else if (navigationAction_ != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.DirectDepositAction value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    BankingTab.DirectDepositAction.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) {
                        encodedSizeWithTag = BankingTab.ClientScenarioAction.ADAPTER.encodedSizeWithTag(1, ((BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.Dialog) {
                        encodedSizeWithTag = BankingTab.Dialog.ADAPTER.encodedSizeWithTag(2, ((BankingTab.DirectDepositAction.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else {
                        if (!(navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction)) {
                            if (navigationAction_ == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = BankingTab.ClientRouteAction.ADAPTER.encodedSizeWithTag(3, ((BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.DirectDepositAction redact(BankingTab.DirectDepositAction value) {
                    value.getClass();
                    return BankingTab.DirectDepositAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.DirectDepositAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BankingTab.DirectDepositAction.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) {
                        BankingTab.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 1, ((BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                        return;
                    }
                    if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.Dialog) {
                        BankingTab.Dialog.ADAPTER.encodeWithTag(writer, 2, ((BankingTab.DirectDepositAction.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction) {
                        BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 3, ((BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    } else {
                        if (navigationAction_ == null) {
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

        public /* synthetic */ DirectDepositAction(NavigationAction_ navigationAction_, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : navigationAction_, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DirectDepositAction copy$default(DirectDepositAction directDepositAction, NavigationAction_ navigationAction_, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                navigationAction_ = directDepositAction.NavigationAction;
            }
            if ((i & 2) != 0) {
                byteString = directDepositAction.unknownFields();
            }
            return directDepositAction.copy(navigationAction_, byteString);
        }

        public final DirectDepositAction copy(NavigationAction_ NavigationAction, ByteString unknownFields) {
            unknownFields.getClass();
            return new DirectDepositAction(NavigationAction, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DirectDepositAction)) {
                return false;
            }
            DirectDepositAction directDepositAction = (DirectDepositAction) other;
            return Intrinsics.areEqual(unknownFields(), directDepositAction.unknownFields()) && Intrinsics.areEqual(this.NavigationAction, directDepositAction.NavigationAction);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            NavigationAction_ navigationAction_ = this.NavigationAction;
            int hashCode2 = hashCode + (navigationAction_ != null ? navigationAction_.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.NavigationAction = this.NavigationAction;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            NavigationAction_ navigationAction_ = this.NavigationAction;
            if (navigationAction_ != null) {
                arrayList.add("NavigationAction=" + navigationAction_);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DirectDepositAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DirectDepositAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_;", "", "<init>", "()V", "ClientScenarioAction", "Dialog", "ClientRouteAction", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_$Dialog;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class NavigationAction_ {

            @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientRouteAction#ADAPTER", declaredName = "client_route_action", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ClientRouteAction extends NavigationAction_ {
                private final ClientRouteAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ClientRouteAction(ClientRouteAction clientRouteAction) {
                    super(null);
                    clientRouteAction.getClass();
                    this.value = clientRouteAction;
                }

                public static /* synthetic */ ClientRouteAction copy$default(ClientRouteAction clientRouteAction, ClientRouteAction clientRouteAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        clientRouteAction2 = clientRouteAction.value;
                    }
                    return clientRouteAction.copy(clientRouteAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final ClientRouteAction getValue() {
                    return this.value;
                }

                public final ClientRouteAction copy(ClientRouteAction value) {
                    value.getClass();
                    return new ClientRouteAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ClientRouteAction) && Intrinsics.areEqual(this.value, ((ClientRouteAction) other).value);
                }

                public final ClientRouteAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ClientRouteAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientScenarioAction#ADAPTER", declaredName = "client_scenario_action", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$ClientScenarioAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ClientScenarioAction extends NavigationAction_ {
                private final ClientScenarioAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ClientScenarioAction(ClientScenarioAction clientScenarioAction) {
                    super(null);
                    clientScenarioAction.getClass();
                    this.value = clientScenarioAction;
                }

                public static /* synthetic */ ClientScenarioAction copy$default(ClientScenarioAction clientScenarioAction, ClientScenarioAction clientScenarioAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        clientScenarioAction2 = clientScenarioAction.value;
                    }
                    return clientScenarioAction.copy(clientScenarioAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final ClientScenarioAction getValue() {
                    return this.value;
                }

                public final ClientScenarioAction copy(ClientScenarioAction value) {
                    value.getClass();
                    return new ClientScenarioAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ClientScenarioAction) && Intrinsics.areEqual(this.value, ((ClientScenarioAction) other).value);
                }

                public final ClientScenarioAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ClientScenarioAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.unicorn.BankingTab$Dialog#ADAPTER", declaredName = "dialog", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_$Dialog;", "Lcom/squareup/protos/unicorn/BankingTab$DirectDepositAction$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$Dialog;)V", "getValue", "()Lcom/squareup/protos/unicorn/BankingTab$Dialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Dialog extends NavigationAction_ {
                private final Dialog value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Dialog(Dialog dialog) {
                    super(null);
                    dialog.getClass();
                    this.value = dialog;
                }

                public static /* synthetic */ Dialog copy$default(Dialog dialog, Dialog dialog2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        dialog2 = dialog.value;
                    }
                    return dialog.copy(dialog2);
                }

                /* renamed from: component1, reason: from getter */
                public final Dialog getValue() {
                    return this.value;
                }

                public final Dialog copy(Dialog value) {
                    value.getClass();
                    return new Dialog(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Dialog) && Intrinsics.areEqual(this.value, ((Dialog) other).value);
                }

                public final Dialog getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Dialog(value=" + this.value + ")";
                }
            }

            public /* synthetic */ NavigationAction_(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private NavigationAction_() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DirectDepositAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectDepositAction(NavigationAction_ navigationAction_, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.NavigationAction = navigationAction_;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Disclosure;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$Disclosure$Builder;", "text", "", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Disclosure extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disclosure> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizableString localizable_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Disclosure$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$Disclosure;", "<init>", "()V", "text", "", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizableString localizable_text;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public Disclosure build() {
                return new Disclosure(this.text, this.localizable_text, buildUnknownFields());
            }

            public final Builder localizable_text(LocalizableString localizable_text) {
                this.localizable_text = localizable_text;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Disclosure.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Disclosure$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Disclosure decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.Disclosure((String) obj, (LocalizableString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.Disclosure value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    LocalizableString.ADAPTER.encodeWithTag(writer, 2, value.localizable_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.Disclosure value) {
                    value.getClass();
                    return LocalizableString.ADAPTER.encodedSizeWithTag(2, value.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Disclosure redact(BankingTab.Disclosure value) {
                    value.getClass();
                    LocalizableString localizableString = value.localizable_text;
                    return BankingTab.Disclosure.copy$default(value, null, localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.Disclosure value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalizableString.ADAPTER.encodeWithTag(writer, 2, value.localizable_text);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Disclosure(String str, LocalizableString localizableString, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, String str, LocalizableString localizableString, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disclosure.text;
            }
            if ((i & 2) != 0) {
                localizableString = disclosure.localizable_text;
            }
            if ((i & 4) != 0) {
                byteString = disclosure.unknownFields();
            }
            return disclosure.copy(str, localizableString, byteString);
        }

        public final Disclosure copy(String text, LocalizableString localizable_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new Disclosure(text, localizable_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Disclosure)) {
                return false;
            }
            Disclosure disclosure = (Disclosure) other;
            return Intrinsics.areEqual(unknownFields(), disclosure.unknownFields()) && Intrinsics.areEqual(this.text, disclosure.text) && Intrinsics.areEqual(this.localizable_text, disclosure.localizable_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode3 = hashCode2 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.localizable_text = this.localizable_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Disclosure{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Disclosure$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$Disclosure$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$Disclosure;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$Disclosure;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Disclosure build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Disclosure() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disclosure(String str, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.localizable_text = localizableString;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J@\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Options;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$Options$Builder;", "banking_option", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption;", "borrow_option", "Lcom/squareup/protos/unicorn/BankingTab$BorrowOption;", "upsell_option", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption;", "taxes_option", "Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/unicorn/BankingTab$BankingOption;Lcom/squareup/protos/unicorn/BankingTab$BorrowOption;Lcom/squareup/protos/unicorn/BankingTab$UpsellOption;Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Options extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Options> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$BankingOption#ADAPTER", schemaIndex = 0, tag = 1)
        public final BankingOption banking_option;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$BorrowOption#ADAPTER", schemaIndex = 1, tag = 2)
        public final BorrowOption borrow_option;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$TaxesOption#ADAPTER", schemaIndex = 3, tag = 4)
        public final TaxesOption taxes_option;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$UpsellOption#ADAPTER", schemaIndex = 2, tag = 3)
        public final UpsellOption upsell_option;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Options$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$Options;", "<init>", "()V", "banking_option", "Lcom/squareup/protos/unicorn/BankingTab$BankingOption;", "borrow_option", "Lcom/squareup/protos/unicorn/BankingTab$BorrowOption;", "upsell_option", "Lcom/squareup/protos/unicorn/BankingTab$UpsellOption;", "taxes_option", "Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public BankingOption banking_option;
            public BorrowOption borrow_option;
            public TaxesOption taxes_option;
            public UpsellOption upsell_option;

            public final Builder banking_option(BankingOption banking_option) {
                this.banking_option = banking_option;
                return this;
            }

            public final Builder borrow_option(BorrowOption borrow_option) {
                this.borrow_option = borrow_option;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Options build() {
                return new Options(this.banking_option, this.borrow_option, this.upsell_option, this.taxes_option, buildUnknownFields());
            }

            public final Builder taxes_option(TaxesOption taxes_option) {
                this.taxes_option = taxes_option;
                return this;
            }

            public final Builder upsell_option(UpsellOption upsell_option) {
                this.upsell_option = upsell_option;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Options.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$Options$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Options decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BankingTab.Options((BankingTab.BankingOption) obj, (BankingTab.BorrowOption) obj2, (BankingTab.UpsellOption) obj3, (BankingTab.TaxesOption) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(BankingTab.BankingOption.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(BankingTab.BorrowOption.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(BankingTab.UpsellOption.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(BankingTab.TaxesOption.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.Options value) {
                    writer.getClass();
                    value.getClass();
                    BankingTab.BankingOption.ADAPTER.encodeWithTag(writer, 1, value.banking_option);
                    BankingTab.BorrowOption.ADAPTER.encodeWithTag(writer, 2, value.borrow_option);
                    BankingTab.UpsellOption.ADAPTER.encodeWithTag(writer, 3, value.upsell_option);
                    BankingTab.TaxesOption.ADAPTER.encodeWithTag(writer, 4, value.taxes_option);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.Options value) {
                    value.getClass();
                    return BankingTab.TaxesOption.ADAPTER.encodedSizeWithTag(4, value.taxes_option) + BankingTab.UpsellOption.ADAPTER.encodedSizeWithTag(3, value.upsell_option) + BankingTab.BorrowOption.ADAPTER.encodedSizeWithTag(2, value.borrow_option) + BankingTab.BankingOption.ADAPTER.encodedSizeWithTag(1, value.banking_option) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.Options redact(BankingTab.Options value) {
                    value.getClass();
                    BankingTab.BankingOption bankingOption = value.banking_option;
                    BankingTab.BankingOption bankingOption2 = bankingOption != null ? (BankingTab.BankingOption) BankingTab.BankingOption.ADAPTER.redact(bankingOption) : null;
                    BankingTab.BorrowOption borrowOption = value.borrow_option;
                    BankingTab.BorrowOption borrowOption2 = borrowOption != null ? (BankingTab.BorrowOption) BankingTab.BorrowOption.ADAPTER.redact(borrowOption) : null;
                    BankingTab.UpsellOption upsellOption = value.upsell_option;
                    BankingTab.UpsellOption upsellOption2 = upsellOption != null ? (BankingTab.UpsellOption) BankingTab.UpsellOption.ADAPTER.redact(upsellOption) : null;
                    BankingTab.TaxesOption taxesOption = value.taxes_option;
                    return value.copy(bankingOption2, borrowOption2, upsellOption2, taxesOption != null ? (BankingTab.TaxesOption) BankingTab.TaxesOption.ADAPTER.redact(taxesOption) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.Options value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BankingTab.TaxesOption.ADAPTER.encodeWithTag(writer, 4, value.taxes_option);
                    BankingTab.UpsellOption.ADAPTER.encodeWithTag(writer, 3, value.upsell_option);
                    BankingTab.BorrowOption.ADAPTER.encodeWithTag(writer, 2, value.borrow_option);
                    BankingTab.BankingOption.ADAPTER.encodeWithTag(writer, 1, value.banking_option);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Options(BankingOption bankingOption, BorrowOption borrowOption, UpsellOption upsellOption, TaxesOption taxesOption, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bankingOption, (i & 2) != 0 ? null : borrowOption, (i & 4) != 0 ? null : upsellOption, (i & 8) != 0 ? null : taxesOption, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Options copy$default(Options options, BankingOption bankingOption, BorrowOption borrowOption, UpsellOption upsellOption, TaxesOption taxesOption, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                bankingOption = options.banking_option;
            }
            if ((i & 2) != 0) {
                borrowOption = options.borrow_option;
            }
            if ((i & 4) != 0) {
                upsellOption = options.upsell_option;
            }
            if ((i & 8) != 0) {
                taxesOption = options.taxes_option;
            }
            if ((i & 16) != 0) {
                byteString = options.unknownFields();
            }
            ByteString byteString2 = byteString;
            UpsellOption upsellOption2 = upsellOption;
            return options.copy(bankingOption, borrowOption, upsellOption2, taxesOption, byteString2);
        }

        public final Options copy(BankingOption banking_option, BorrowOption borrow_option, UpsellOption upsell_option, TaxesOption taxes_option, ByteString unknownFields) {
            unknownFields.getClass();
            return new Options(banking_option, borrow_option, upsell_option, taxes_option, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.areEqual(unknownFields(), options.unknownFields()) && Intrinsics.areEqual(this.banking_option, options.banking_option) && Intrinsics.areEqual(this.borrow_option, options.borrow_option) && Intrinsics.areEqual(this.upsell_option, options.upsell_option) && Intrinsics.areEqual(this.taxes_option, options.taxes_option);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            BankingOption bankingOption = this.banking_option;
            int hashCode2 = (hashCode + (bankingOption != null ? bankingOption.hashCode() : 0)) * 37;
            BorrowOption borrowOption = this.borrow_option;
            int hashCode3 = (hashCode2 + (borrowOption != null ? borrowOption.hashCode() : 0)) * 37;
            UpsellOption upsellOption = this.upsell_option;
            int hashCode4 = (hashCode3 + (upsellOption != null ? upsellOption.hashCode() : 0)) * 37;
            TaxesOption taxesOption = this.taxes_option;
            int hashCode5 = hashCode4 + (taxesOption != null ? taxesOption.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.banking_option = this.banking_option;
            builder.borrow_option = this.borrow_option;
            builder.upsell_option = this.upsell_option;
            builder.taxes_option = this.taxes_option;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            BankingOption bankingOption = this.banking_option;
            if (bankingOption != null) {
                arrayList.add("banking_option=" + bankingOption);
            }
            BorrowOption borrowOption = this.borrow_option;
            if (borrowOption != null) {
                arrayList.add("borrow_option=" + borrowOption);
            }
            UpsellOption upsellOption = this.upsell_option;
            if (upsellOption != null) {
                arrayList.add("upsell_option=" + upsellOption);
            }
            TaxesOption taxesOption = this.taxes_option;
            if (taxesOption != null) {
                arrayList.add("taxes_option=" + taxesOption);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Options{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Options$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$Options$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$Options;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$Options;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Options build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Options() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Options(BankingOption bankingOption, BorrowOption borrowOption, UpsellOption upsellOption, TaxesOption taxesOption, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.banking_option = bankingOption;
            this.borrow_option = borrowOption;
            this.upsell_option = upsellOption;
            this.taxes_option = taxesOption;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0081\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u001fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\""}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/BankingTab$TaxesOption$Builder;", "id", "", "main_text", "localizable_main_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "secondary_text", "localizable_secondary_text", "image", "Lcom/squareup/protos/cash/ui/Image;", "appearance", "Lcom/squareup/protos/unicorn/BankingTab$Appearance;", "client_route_action", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "is_badged", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/unicorn/BankingTab$Appearance;Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/unicorn/BankingTab$Appearance;Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TaxesOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TaxesOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$Appearance#ADAPTER", schemaIndex = 6, tag = 5)
        public final Appearance appearance;

        @WireField(adapter = "com.squareup.protos.unicorn.BankingTab$ClientRouteAction#ADAPTER", schemaIndex = 7, tag = 6)
        public final ClientRouteAction client_route_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String id;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 5, tag = 4)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 7)
        public final Boolean is_badged;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 2, tag = 8)
        public final LocalizableString localizable_main_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 4, tag = 9)
        public final LocalizableString localizable_secondary_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String main_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 3)
        public final String secondary_text;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$TaxesOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;", "<init>", "()V", "id", "", "main_text", "localizable_main_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "secondary_text", "localizable_secondary_text", "image", "Lcom/squareup/protos/cash/ui/Image;", "appearance", "Lcom/squareup/protos/unicorn/BankingTab$Appearance;", "client_route_action", "Lcom/squareup/protos/unicorn/BankingTab$ClientRouteAction;", "is_badged", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/unicorn/BankingTab$TaxesOption$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Appearance appearance;
            public ClientRouteAction client_route_action;
            public String id;
            public Image image;
            public Boolean is_badged;
            public LocalizableString localizable_main_text;
            public LocalizableString localizable_secondary_text;
            public String main_text;
            public String secondary_text;

            public final Builder appearance(Appearance appearance) {
                this.appearance = appearance;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public TaxesOption build() {
                return new TaxesOption(this.id, this.main_text, this.localizable_main_text, this.secondary_text, this.localizable_secondary_text, this.image, this.appearance, this.client_route_action, this.is_badged, buildUnknownFields());
            }

            public final Builder client_route_action(ClientRouteAction client_route_action) {
                this.client_route_action = client_route_action;
                return this;
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder is_badged(Boolean is_badged) {
                this.is_badged = is_badged;
                return this;
            }

            public final Builder localizable_main_text(LocalizableString localizable_main_text) {
                this.localizable_main_text = localizable_main_text;
                return this;
            }

            public final Builder localizable_secondary_text(LocalizableString localizable_secondary_text) {
                this.localizable_secondary_text = localizable_secondary_text;
                return this;
            }

            public final Builder main_text(String main_text) {
                this.main_text = main_text;
                return this;
            }

            public final Builder secondary_text(String secondary_text) {
                this.secondary_text = secondary_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxesOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.BankingTab$TaxesOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.TaxesOption decode(ProtoReader reader) {
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
                            return new BankingTab.TaxesOption((String) obj3, (String) obj4, (LocalizableString) obj5, (String) obj6, (LocalizableString) obj7, (Image) obj8, (BankingTab.Appearance) obj9, (BankingTab.ClientRouteAction) obj10, (Boolean) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj8);
                                continue;
                            case 5:
                                try {
                                    obj9 = BankingTab.Appearance.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    obj = obj3;
                                    obj2 = obj4;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                obj10 = TransactorKt.decodeMessageOrMerge(BankingTab.ClientRouteAction.ADAPTER, reader, obj10);
                                continue;
                            case 7:
                                obj11 = ProtoAdapter.BOOL.decode(reader);
                                continue;
                            case 8:
                                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj5);
                                continue;
                            case 9:
                                obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj7);
                                continue;
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj3;
                                obj2 = obj4;
                                break;
                        }
                        obj3 = obj;
                        obj4 = obj2;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BankingTab.TaxesOption value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.id);
                    protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 8, value.localizable_main_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.secondary_text);
                    protoAdapter3.encodeWithTag(writer, 9, value.localizable_secondary_text);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    BankingTab.Appearance.ADAPTER.encodeWithTag(writer, 5, value.appearance);
                    BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 6, value.client_route_action);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.is_badged);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BankingTab.TaxesOption value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.main_text) + protoAdapter2.encodedSizeWithTag(1, value.id) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    return ProtoAdapter.BOOL.encodedSizeWithTag(7, value.is_badged) + BankingTab.ClientRouteAction.ADAPTER.encodedSizeWithTag(6, value.client_route_action) + BankingTab.Appearance.ADAPTER.encodedSizeWithTag(5, value.appearance) + Image.ADAPTER.encodedSizeWithTag(4, value.image) + protoAdapter3.encodedSizeWithTag(9, value.localizable_secondary_text) + protoAdapter2.encodedSizeWithTag(3, value.secondary_text) + protoAdapter3.encodedSizeWithTag(8, value.localizable_main_text) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BankingTab.TaxesOption redact(BankingTab.TaxesOption value) {
                    value.getClass();
                    LocalizableString localizableString = value.localizable_main_text;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.localizable_secondary_text;
                    LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    BankingTab.ClientRouteAction clientRouteAction = value.client_route_action;
                    return BankingTab.TaxesOption.copy$default(value, null, null, localizableString2, null, localizableString4, image2, null, clientRouteAction != null ? (BankingTab.ClientRouteAction) BankingTab.ClientRouteAction.ADAPTER.redact(clientRouteAction) : null, null, ByteString.EMPTY, 331, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BankingTab.TaxesOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.is_badged);
                    BankingTab.ClientRouteAction.ADAPTER.encodeWithTag(writer, 6, value.client_route_action);
                    BankingTab.Appearance.ADAPTER.encodeWithTag(writer, 5, value.appearance);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 9, value.localizable_secondary_text);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 3, value.secondary_text);
                    protoAdapter2.encodeWithTag(writer, 8, value.localizable_main_text);
                    protoAdapter3.encodeWithTag(writer, 2, value.main_text);
                    protoAdapter3.encodeWithTag(writer, 1, value.id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ TaxesOption(String str, String str2, LocalizableString localizableString, String str3, LocalizableString localizableString2, Image image, Appearance appearance, ClientRouteAction clientRouteAction, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : localizableString, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : localizableString2, (i & 32) != 0 ? null : image, (i & 64) != 0 ? null : appearance, (i & 128) != 0 ? null : clientRouteAction, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ TaxesOption copy$default(TaxesOption taxesOption, String str, String str2, LocalizableString localizableString, String str3, LocalizableString localizableString2, Image image, Appearance appearance, ClientRouteAction clientRouteAction, Boolean bool, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taxesOption.id;
            }
            if ((i & 2) != 0) {
                str2 = taxesOption.main_text;
            }
            if ((i & 4) != 0) {
                localizableString = taxesOption.localizable_main_text;
            }
            if ((i & 8) != 0) {
                str3 = taxesOption.secondary_text;
            }
            if ((i & 16) != 0) {
                localizableString2 = taxesOption.localizable_secondary_text;
            }
            if ((i & 32) != 0) {
                image = taxesOption.image;
            }
            if ((i & 64) != 0) {
                appearance = taxesOption.appearance;
            }
            if ((i & 128) != 0) {
                clientRouteAction = taxesOption.client_route_action;
            }
            if ((i & 256) != 0) {
                bool = taxesOption.is_badged;
            }
            if ((i & 512) != 0) {
                byteString = taxesOption.unknownFields();
            }
            Boolean bool2 = bool;
            ByteString byteString2 = byteString;
            Appearance appearance2 = appearance;
            ClientRouteAction clientRouteAction2 = clientRouteAction;
            LocalizableString localizableString3 = localizableString2;
            Image image2 = image;
            return taxesOption.copy(str, str2, localizableString, str3, localizableString3, image2, appearance2, clientRouteAction2, bool2, byteString2);
        }

        public final TaxesOption copy(String id, String main_text, LocalizableString localizable_main_text, String secondary_text, LocalizableString localizable_secondary_text, Image image, Appearance appearance, ClientRouteAction client_route_action, Boolean is_badged, ByteString unknownFields) {
            unknownFields.getClass();
            return new TaxesOption(id, main_text, localizable_main_text, secondary_text, localizable_secondary_text, image, appearance, client_route_action, is_badged, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TaxesOption)) {
                return false;
            }
            TaxesOption taxesOption = (TaxesOption) other;
            return Intrinsics.areEqual(unknownFields(), taxesOption.unknownFields()) && Intrinsics.areEqual(this.id, taxesOption.id) && Intrinsics.areEqual(this.main_text, taxesOption.main_text) && Intrinsics.areEqual(this.localizable_main_text, taxesOption.localizable_main_text) && Intrinsics.areEqual(this.secondary_text, taxesOption.secondary_text) && Intrinsics.areEqual(this.localizable_secondary_text, taxesOption.localizable_secondary_text) && Intrinsics.areEqual(this.image, taxesOption.image) && this.appearance == taxesOption.appearance && Intrinsics.areEqual(this.client_route_action, taxesOption.client_route_action) && Intrinsics.areEqual(this.is_badged, taxesOption.is_badged);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.main_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_main_text;
            int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str3 = this.secondary_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_secondary_text;
            int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode7 = (hashCode6 + (image != null ? image.hashCode() : 0)) * 37;
            Appearance appearance = this.appearance;
            int hashCode8 = (hashCode7 + (appearance != null ? appearance.hashCode() : 0)) * 37;
            ClientRouteAction clientRouteAction = this.client_route_action;
            int hashCode9 = (hashCode8 + (clientRouteAction != null ? clientRouteAction.hashCode() : 0)) * 37;
            Boolean bool = this.is_badged;
            int hashCode10 = hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.id = this.id;
            builder.main_text = this.main_text;
            builder.localizable_main_text = this.localizable_main_text;
            builder.secondary_text = this.secondary_text;
            builder.localizable_secondary_text = this.localizable_secondary_text;
            builder.image = this.image;
            builder.appearance = this.appearance;
            builder.client_route_action = this.client_route_action;
            builder.is_badged = this.is_badged;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            String str2 = this.main_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_main_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString, arrayList);
            }
            String str3 = this.secondary_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "secondary_text=", arrayList);
            }
            LocalizableString localizableString2 = this.localizable_secondary_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_secondary_text=", localizableString2, arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Appearance appearance = this.appearance;
            if (appearance != null) {
                arrayList.add("appearance=" + appearance);
            }
            ClientRouteAction clientRouteAction = this.client_route_action;
            if (clientRouteAction != null) {
                arrayList.add("client_route_action=" + clientRouteAction);
            }
            Boolean bool = this.is_badged;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TaxesOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$TaxesOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$TaxesOption$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab$TaxesOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TaxesOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TaxesOption() {
            this(null, null, null, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxesOption(String str, String str2, LocalizableString localizableString, String str3, LocalizableString localizableString2, Image image, Appearance appearance, ClientRouteAction clientRouteAction, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.main_text = str2;
            this.localizable_main_text = localizableString;
            this.secondary_text = str3;
            this.localizable_secondary_text = localizableString2;
            this.image = image;
            this.appearance = appearance;
            this.client_route_action = clientRouteAction;
            this.is_badged = bool;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/BankingTab$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/BankingTab$Builder;", "", "body", "Lcom/squareup/protos/unicorn/BankingTab;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/BankingTab;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BankingTab build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
