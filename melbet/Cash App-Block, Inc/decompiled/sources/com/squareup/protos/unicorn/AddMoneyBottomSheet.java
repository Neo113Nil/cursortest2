package com.squareup.protos.unicorn;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.unicorn.AddMoneyBottomSheet;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\f\n\u000b\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_;", "BottomSheetType", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_;", "Companion", "Builder", "BottomSheetType_", "ClickBottomSheet", "RadioBottomSheet", "ClientPoweredBottomSheet", "AddMoneyRow", "NavigationRow", "BalancePickerRow", "Dialog", "ClientScenarioAction", "ClientRouteAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddMoneyBottomSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddMoneyBottomSheet> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final BottomSheetType_ BottomSheetType;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString title;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "BottomSheetType", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public BottomSheetType_ BottomSheetType;
        public LocalizedString title;

        public final Builder BottomSheetType(BottomSheetType_ BottomSheetType) {
            this.BottomSheetType = BottomSheetType;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddMoneyBottomSheet build() {
            return new AddMoneyBottomSheet(this.title, this.BottomSheetType, buildUnknownFields());
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$Builder;", "click_bottom_sheet_sections", "", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "ClickBottomSheetSection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClickBottomSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClickBottomSheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<ClickBottomSheetSection> click_bottom_sheet_sections;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet;", "<init>", "()V", "click_bottom_sheet_sections", "", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<ClickBottomSheetSection> click_bottom_sheet_sections = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public ClickBottomSheet build() {
                return new ClickBottomSheet(this.click_bottom_sheet_sections, buildUnknownFields());
            }

            public final Builder click_bottom_sheet_sections(List<ClickBottomSheetSection> click_bottom_sheet_sections) {
                click_bottom_sheet_sections.getClass();
                TransactorKt.checkElementsNotNull(click_bottom_sheet_sections);
                this.click_bottom_sheet_sections = click_bottom_sheet_sections;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClickBottomSheet.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$ClickBottomSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClickBottomSheet decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AddMoneyBottomSheet.ClickBottomSheet(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.ClickBottomSheet value) {
                    writer.getClass();
                    value.getClass();
                    AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.click_bottom_sheet_sections);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.ClickBottomSheet value) {
                    value.getClass();
                    return AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection.ADAPTER.asRepeated().encodedSizeWithTag(1, value.click_bottom_sheet_sections) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClickBottomSheet redact(AddMoneyBottomSheet.ClickBottomSheet value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.click_bottom_sheet_sections, AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.ClickBottomSheet value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.click_bottom_sheet_sections);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClickBottomSheet(List<ClickBottomSheetSection> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.click_bottom_sheet_sections = TransactorKt.immutableCopyOf("click_bottom_sheet_sections", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClickBottomSheet copy$default(ClickBottomSheet clickBottomSheet, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = clickBottomSheet.click_bottom_sheet_sections;
            }
            if ((i & 2) != 0) {
                byteString = clickBottomSheet.unknownFields();
            }
            return clickBottomSheet.copy(list, byteString);
        }

        public final ClickBottomSheet copy(List<ClickBottomSheetSection> click_bottom_sheet_sections, ByteString unknownFields) {
            click_bottom_sheet_sections.getClass();
            unknownFields.getClass();
            return new ClickBottomSheet(click_bottom_sheet_sections, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ClickBottomSheet)) {
                return false;
            }
            ClickBottomSheet clickBottomSheet = (ClickBottomSheet) other;
            return Intrinsics.areEqual(unknownFields(), clickBottomSheet.unknownFields()) && Intrinsics.areEqual(this.click_bottom_sheet_sections, clickBottomSheet.click_bottom_sheet_sections);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.click_bottom_sheet_sections.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.click_bottom_sheet_sections = this.click_bottom_sheet_sections;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.click_bottom_sheet_sections.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("click_bottom_sheet_sections=", arrayList, this.click_bottom_sheet_sections);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClickBottomSheet{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection$Builder;", "add_money_rows", "", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ClickBottomSheetSection extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ClickBottomSheetSection> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$AddMoneyRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
            public final List<AddMoneyRow> add_money_rows;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection;", "<init>", "()V", "add_money_rows", "", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public List<AddMoneyRow> add_money_rows = EmptyList.INSTANCE;

                public final Builder add_money_rows(List<AddMoneyRow> add_money_rows) {
                    add_money_rows.getClass();
                    TransactorKt.checkElementsNotNull(add_money_rows);
                    this.add_money_rows = add_money_rows;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public ClickBottomSheetSection build() {
                    return new ClickBottomSheetSection(this.add_money_rows, buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClickBottomSheetSection.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection(m, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                m.add(AddMoneyBottomSheet.AddMoneyRow.ADAPTER.decode(reader));
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection value) {
                        writer.getClass();
                        value.getClass();
                        AddMoneyBottomSheet.AddMoneyRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.add_money_rows);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection value) {
                        value.getClass();
                        return AddMoneyBottomSheet.AddMoneyRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.add_money_rows) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection redact(AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection value) {
                        value.getClass();
                        return value.copy(TransactorKt.m1169redactElements(value.add_money_rows, AddMoneyBottomSheet.AddMoneyRow.ADAPTER), ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.ClickBottomSheet.ClickBottomSheetSection value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        AddMoneyBottomSheet.AddMoneyRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.add_money_rows);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClickBottomSheetSection(List<AddMoneyRow> list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.add_money_rows = TransactorKt.immutableCopyOf("add_money_rows", list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ClickBottomSheetSection copy$default(ClickBottomSheetSection clickBottomSheetSection, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = clickBottomSheetSection.add_money_rows;
                }
                if ((i & 2) != 0) {
                    byteString = clickBottomSheetSection.unknownFields();
                }
                return clickBottomSheetSection.copy(list, byteString);
            }

            public final ClickBottomSheetSection copy(List<AddMoneyRow> add_money_rows, ByteString unknownFields) {
                add_money_rows.getClass();
                unknownFields.getClass();
                return new ClickBottomSheetSection(add_money_rows, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ClickBottomSheetSection)) {
                    return false;
                }
                ClickBottomSheetSection clickBottomSheetSection = (ClickBottomSheetSection) other;
                return Intrinsics.areEqual(unknownFields(), clickBottomSheetSection.unknownFields()) && Intrinsics.areEqual(this.add_money_rows, clickBottomSheetSection.add_money_rows);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.add_money_rows.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.add_money_rows = this.add_money_rows;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (!this.add_money_rows.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("add_money_rows=", arrayList, this.add_money_rows);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ClickBottomSheetSection{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$ClickBottomSheetSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ClickBottomSheetSection build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public ClickBottomSheetSection(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public ClickBottomSheetSection() {
                this(null, null, 3, null);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ClickBottomSheet build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ClickBottomSheet(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public ClickBottomSheet() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001c\u001d\u001e\u001fBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0082\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u0096\u0080\u0004J\b\u0010\u001a\u001a\u00020\nH\u0016Jd\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "main_text", "primary_button", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;", "secondary_button", "id", "", "dialog_icon", "Lcom/squareup/protos/cash/ui/Image;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/ui/Icon;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "DismissDialogAction", "Button", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Dialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Dialog> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 5, tag = 6)
        public final Image dialog_icon;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 6, tag = 7)
        public final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String id;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString main_text;

        @WireField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$Dialog$Button#ADAPTER", schemaIndex = 2, tag = 3)
        public final Button primary_button;

        @WireField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$Dialog$Button#ADAPTER", schemaIndex = 3, tag = 4)
        public final Button secondary_button;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString title;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "main_text", "primary_button", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;", "secondary_button", "id", "", "dialog_icon", "Lcom/squareup/protos/cash/ui/Image;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Image dialog_icon;
            public Icon icon;
            public String id;
            public LocalizedString main_text;
            public Button primary_button;
            public Button secondary_button;
            public LocalizedString title;

            @Override // com.squareup.wire.Message.Builder
            public Dialog build() {
                return new Dialog(this.title, this.main_text, this.primary_button, this.secondary_button, this.id, this.dialog_icon, this.icon, buildUnknownFields());
            }

            public final Builder dialog_icon(Image dialog_icon) {
                this.dialog_icon = dialog_icon;
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

            public final Builder main_text(LocalizedString main_text) {
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

            public final Builder title(LocalizedString title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Dialog.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$Dialog$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.Dialog decode(ProtoReader reader) {
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
                            return new AddMoneyBottomSheet.Dialog((LocalizedString) obj, (LocalizedString) obj2, (AddMoneyBottomSheet.Dialog.Button) obj3, (AddMoneyBottomSheet.Dialog.Button) obj4, (String) obj5, (Image) obj6, (Icon) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(AddMoneyBottomSheet.Dialog.Button.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                obj4 = TransactorKt.decodeMessageOrMerge(AddMoneyBottomSheet.Dialog.Button.ADAPTER, reader, obj4);
                                break;
                            case 5:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj6);
                                break;
                            case 7:
                                obj7 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj7);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.Dialog value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                    ProtoAdapter protoAdapter3 = AddMoneyBottomSheet.Dialog.Button.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.primary_button);
                    protoAdapter3.encodeWithTag(writer, 4, value.secondary_button);
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, value.id);
                    Image.ADAPTER.encodeWithTag(writer, 6, value.dialog_icon);
                    Icon.ADAPTER.encodeWithTag(writer, 7, value.icon);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.Dialog value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.main_text) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = AddMoneyBottomSheet.Dialog.Button.ADAPTER;
                    return Icon.ADAPTER.encodedSizeWithTag(7, value.icon) + Image.ADAPTER.encodedSizeWithTag(6, value.dialog_icon) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.id) + protoAdapter3.encodedSizeWithTag(4, value.secondary_button) + protoAdapter3.encodedSizeWithTag(3, value.primary_button) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.Dialog redact(AddMoneyBottomSheet.Dialog value) {
                    value.getClass();
                    LocalizedString localizedString = value.title;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.main_text;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    AddMoneyBottomSheet.Dialog.Button button = value.primary_button;
                    AddMoneyBottomSheet.Dialog.Button button2 = button != null ? (AddMoneyBottomSheet.Dialog.Button) AddMoneyBottomSheet.Dialog.Button.ADAPTER.redact(button) : null;
                    AddMoneyBottomSheet.Dialog.Button button3 = value.secondary_button;
                    AddMoneyBottomSheet.Dialog.Button button4 = button3 != null ? (AddMoneyBottomSheet.Dialog.Button) AddMoneyBottomSheet.Dialog.Button.ADAPTER.redact(button3) : null;
                    Image image = value.dialog_icon;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    Icon icon = value.icon;
                    return AddMoneyBottomSheet.Dialog.copy$default(value, localizedString2, localizedString4, button2, button4, null, image2, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, ByteString.EMPTY, 16, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.Dialog value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Icon.ADAPTER.encodeWithTag(writer, 7, value.icon);
                    Image.ADAPTER.encodeWithTag(writer, 6, value.dialog_icon);
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, value.id);
                    ProtoAdapter protoAdapter2 = AddMoneyBottomSheet.Dialog.Button.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 4, value.secondary_button);
                    protoAdapter2.encodeWithTag(writer, 3, value.primary_button);
                    ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 2, value.main_text);
                    protoAdapter3.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Dialog(LocalizedString localizedString, LocalizedString localizedString2, Button button, Button button2, String str, Image image, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? null : button, (i & 8) != 0 ? null : button2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : image, (i & 64) != 0 ? null : icon, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Dialog copy$default(Dialog dialog, LocalizedString localizedString, LocalizedString localizedString2, Button button, Button button2, String str, Image image, Icon icon, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = dialog.title;
            }
            if ((i & 2) != 0) {
                localizedString2 = dialog.main_text;
            }
            if ((i & 4) != 0) {
                button = dialog.primary_button;
            }
            if ((i & 8) != 0) {
                button2 = dialog.secondary_button;
            }
            if ((i & 16) != 0) {
                str = dialog.id;
            }
            if ((i & 32) != 0) {
                image = dialog.dialog_icon;
            }
            if ((i & 64) != 0) {
                icon = dialog.icon;
            }
            if ((i & 128) != 0) {
                byteString = dialog.unknownFields();
            }
            Icon icon2 = icon;
            ByteString byteString2 = byteString;
            String str2 = str;
            Image image2 = image;
            return dialog.copy(localizedString, localizedString2, button, button2, str2, image2, icon2, byteString2);
        }

        public final Dialog copy(LocalizedString title, LocalizedString main_text, Button primary_button, Button secondary_button, String id, Image dialog_icon, Icon icon, ByteString unknownFields) {
            unknownFields.getClass();
            return new Dialog(title, main_text, primary_button, secondary_button, id, dialog_icon, icon, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return Intrinsics.areEqual(unknownFields(), dialog.unknownFields()) && Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.main_text, dialog.main_text) && Intrinsics.areEqual(this.primary_button, dialog.primary_button) && Intrinsics.areEqual(this.secondary_button, dialog.secondary_button) && Intrinsics.areEqual(this.id, dialog.id) && Intrinsics.areEqual(this.dialog_icon, dialog.dialog_icon) && Intrinsics.areEqual(this.icon, dialog.icon);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.main_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode5 = (hashCode4 + (button2 != null ? button2.hashCode() : 0)) * 37;
            String str = this.id;
            int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
            Image image = this.dialog_icon;
            int hashCode7 = (hashCode6 + (image != null ? image.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode8 = hashCode7 + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.main_text = this.main_text;
            builder.primary_button = this.primary_button;
            builder.secondary_button = this.secondary_button;
            builder.id = this.id;
            builder.dialog_icon = this.dialog_icon;
            builder.icon = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.main_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("main_text=", localizedString2, arrayList);
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            Image image = this.dialog_icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("dialog_icon=", image, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Dialog{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\bH\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Builder;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Action", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_;", "id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Action_", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireSealedOneof(schemaIndex = 1)
            public final Action_ Action;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 5)
            public final String id;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString text;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;", "<init>", "()V", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Action", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_;", "id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Action_ Action;
                public String id;
                public LocalizedString text;

                public final Builder Action(Action_ Action) {
                    this.Action = Action;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public Button build() {
                    return new Button(this.text, this.Action, this.id, buildUnknownFields());
                }

                public final Builder id(String id) {
                    this.id = id;
                    return this;
                }

                public final Builder text(LocalizedString text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$Dialog$Button$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public AddMoneyBottomSheet.Dialog.Button decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        AddMoneyBottomSheet.Dialog.Button.Action_ action_ = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new AddMoneyBottomSheet.Dialog.Button((LocalizedString) obj, action_, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                action_ = new AddMoneyBottomSheet.Dialog.Button.Action_.ClientScenarioAction((AddMoneyBottomSheet.ClientScenarioAction) AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.decode(reader));
                            } else if (nextTag == 3) {
                                action_ = new AddMoneyBottomSheet.Dialog.Button.Action_.ClientRouteAction((AddMoneyBottomSheet.ClientRouteAction) AddMoneyBottomSheet.ClientRouteAction.ADAPTER.decode(reader));
                            } else if (nextTag == 4) {
                                action_ = new AddMoneyBottomSheet.Dialog.Button.Action_.DismissAction((AddMoneyBottomSheet.Dialog.DismissDialogAction) AddMoneyBottomSheet.Dialog.DismissDialogAction.ADAPTER.decode(reader));
                            } else if (nextTag != 5) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, AddMoneyBottomSheet.Dialog.Button value) {
                        writer.getClass();
                        value.getClass();
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, value.id);
                        AddMoneyBottomSheet.Dialog.Button.Action_ action_ = value.Action;
                        if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.ClientScenarioAction) {
                            AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 2, ((AddMoneyBottomSheet.Dialog.Button.Action_.ClientScenarioAction) action_).getValue());
                        } else if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.ClientRouteAction) {
                            AddMoneyBottomSheet.ClientRouteAction.ADAPTER.encodeWithTag(writer, 3, ((AddMoneyBottomSheet.Dialog.Button.Action_.ClientRouteAction) action_).getValue());
                        } else if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.DismissAction) {
                            AddMoneyBottomSheet.Dialog.DismissDialogAction.ADAPTER.encodeWithTag(writer, 4, ((AddMoneyBottomSheet.Dialog.Button.Action_.DismissAction) action_).getValue());
                        } else if (action_ != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(AddMoneyBottomSheet.Dialog.Button value) {
                        int encodedSizeWithTag;
                        value.getClass();
                        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                        AddMoneyBottomSheet.Dialog.Button.Action_ action_ = value.Action;
                        if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.ClientScenarioAction) {
                            encodedSizeWithTag = AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.encodedSizeWithTag(2, ((AddMoneyBottomSheet.Dialog.Button.Action_.ClientScenarioAction) action_).getValue());
                        } else if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.ClientRouteAction) {
                            encodedSizeWithTag = AddMoneyBottomSheet.ClientRouteAction.ADAPTER.encodedSizeWithTag(3, ((AddMoneyBottomSheet.Dialog.Button.Action_.ClientRouteAction) action_).getValue());
                        } else {
                            if (!(action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.DismissAction)) {
                                if (action_ != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return 0;
                                }
                                return ProtoAdapter.STRING.encodedSizeWithTag(5, value.id) + encodedSizeWithTag2;
                            }
                            encodedSizeWithTag = AddMoneyBottomSheet.Dialog.DismissDialogAction.ADAPTER.encodedSizeWithTag(4, ((AddMoneyBottomSheet.Dialog.Button.Action_.DismissAction) action_).getValue());
                        }
                        encodedSizeWithTag2 += encodedSizeWithTag;
                        return ProtoAdapter.STRING.encodedSizeWithTag(5, value.id) + encodedSizeWithTag2;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public AddMoneyBottomSheet.Dialog.Button redact(AddMoneyBottomSheet.Dialog.Button value) {
                        value.getClass();
                        LocalizedString localizedString = value.text;
                        return AddMoneyBottomSheet.Dialog.Button.copy$default(value, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, null, null, ByteString.EMPTY, 6, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.Dialog.Button value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        AddMoneyBottomSheet.Dialog.Button.Action_ action_ = value.Action;
                        if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.ClientScenarioAction) {
                            AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 2, ((AddMoneyBottomSheet.Dialog.Button.Action_.ClientScenarioAction) action_).getValue());
                        } else if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.ClientRouteAction) {
                            AddMoneyBottomSheet.ClientRouteAction.ADAPTER.encodeWithTag(writer, 3, ((AddMoneyBottomSheet.Dialog.Button.Action_.ClientRouteAction) action_).getValue());
                        } else if (action_ instanceof AddMoneyBottomSheet.Dialog.Button.Action_.DismissAction) {
                            AddMoneyBottomSheet.Dialog.DismissDialogAction.ADAPTER.encodeWithTag(writer, 4, ((AddMoneyBottomSheet.Dialog.Button.Action_.DismissAction) action_).getValue());
                        } else if (action_ != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, value.id);
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Button(LocalizedString localizedString, Action_ action_, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : action_, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Button copy$default(Button button, LocalizedString localizedString, Action_ action_, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = button.text;
                }
                if ((i & 2) != 0) {
                    action_ = button.Action;
                }
                if ((i & 4) != 0) {
                    str = button.id;
                }
                if ((i & 8) != 0) {
                    byteString = button.unknownFields();
                }
                return button.copy(localizedString, action_, str, byteString);
            }

            public final Button copy(LocalizedString text, Action_ Action, String id, ByteString unknownFields) {
                unknownFields.getClass();
                return new Button(text, Action, id, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.Action, button.Action) && Intrinsics.areEqual(this.id, button.id);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Action_ action_ = this.Action;
                int hashCode3 = (hashCode2 + (action_ != null ? action_.hashCode() : 0)) * 37;
                String str = this.id;
                int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.Action = this.Action;
                builder.id = this.id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                Action_ action_ = this.Action;
                if (action_ != null) {
                    arrayList.add("Action=" + action_);
                }
                String str = this.id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_;", "", "<init>", "()V", "ClientScenarioAction", "ClientRouteAction", "DismissAction", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_$DismissAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static abstract class Action_ {

                @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientRouteAction#ADAPTER", declaredName = "client_route_action", tag = 3)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class ClientRouteAction extends Action_ {
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

                @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientScenarioAction#ADAPTER", declaredName = "client_scenario_action", tag = 2)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

                @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$Dialog$DismissDialogAction#ADAPTER", declaredName = "dismiss_action", tag = 4)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_$DismissAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Action_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class DismissAction extends Action_ {
                    private final DismissDialogAction value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public DismissAction(DismissDialogAction dismissDialogAction) {
                        super(null);
                        dismissDialogAction.getClass();
                        this.value = dismissDialogAction;
                    }

                    public static /* synthetic */ DismissAction copy$default(DismissAction dismissAction, DismissDialogAction dismissDialogAction, int i, Object obj) {
                        if ((i & 1) != 0) {
                            dismissDialogAction = dismissAction.value;
                        }
                        return dismissAction.copy(dismissDialogAction);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final DismissDialogAction getValue() {
                        return this.value;
                    }

                    public final DismissAction copy(DismissDialogAction value) {
                        value.getClass();
                        return new DismissAction(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof DismissAction) && Intrinsics.areEqual(this.value, ((DismissAction) other).value);
                    }

                    public final DismissDialogAction getValue() {
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

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            public Button(LocalizedString localizedString, Action_ action_, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = localizedString;
                this.Action = action_;
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DismissDialogAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DismissDialogAction> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public DismissDialogAction build() {
                    return new DismissDialogAction(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DismissDialogAction.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$Dialog$DismissDialogAction$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public AddMoneyBottomSheet.Dialog.DismissDialogAction decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new AddMoneyBottomSheet.Dialog.DismissDialogAction(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, AddMoneyBottomSheet.Dialog.DismissDialogAction value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(AddMoneyBottomSheet.Dialog.DismissDialogAction value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public AddMoneyBottomSheet.Dialog.DismissDialogAction redact(AddMoneyBottomSheet.Dialog.DismissDialogAction value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.Dialog.DismissDialogAction value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ DismissDialogAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ DismissDialogAction copy$default(DismissDialogAction dismissDialogAction, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = dismissDialogAction.unknownFields();
                }
                return dismissDialogAction.copy(byteString);
            }

            public final DismissDialogAction copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new DismissDialogAction(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof DismissDialogAction) && Intrinsics.areEqual(unknownFields(), ((DismissDialogAction) other).unknownFields());
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
                return "DismissDialogAction{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$DismissDialogAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ DismissDialogAction build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DismissDialogAction() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DismissDialogAction(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
        public Dialog(LocalizedString localizedString, LocalizedString localizedString2, Button button, Button button2, String str, Image image, Icon icon, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.main_text = localizedString2;
            this.primary_button = button;
            this.secondary_button = button2;
            this.id = str;
            this.dialog_icon = image;
            this.icon = icon;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddMoneyBottomSheet.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AddMoneyBottomSheet decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                AddMoneyBottomSheet.BottomSheetType_ bottomSheetType_ = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AddMoneyBottomSheet((LocalizedString) obj, bottomSheetType_, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        bottomSheetType_ = new AddMoneyBottomSheet.BottomSheetType_.RadioBottomSheet((AddMoneyBottomSheet.RadioBottomSheet) AddMoneyBottomSheet.RadioBottomSheet.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        bottomSheetType_ = new AddMoneyBottomSheet.BottomSheetType_.ClickBottomSheet((AddMoneyBottomSheet.ClickBottomSheet) AddMoneyBottomSheet.ClickBottomSheet.ADAPTER.decode(reader));
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        bottomSheetType_ = new AddMoneyBottomSheet.BottomSheetType_.ClientPoweredBottomSheet((AddMoneyBottomSheet.ClientPoweredBottomSheet) AddMoneyBottomSheet.ClientPoweredBottomSheet.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AddMoneyBottomSheet value) {
                writer.getClass();
                value.getClass();
                LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.title);
                AddMoneyBottomSheet.BottomSheetType_ bottomSheetType_ = value.BottomSheetType;
                if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.RadioBottomSheet) {
                    AddMoneyBottomSheet.RadioBottomSheet.ADAPTER.encodeWithTag(writer, 2, ((AddMoneyBottomSheet.BottomSheetType_.RadioBottomSheet) bottomSheetType_).getValue());
                } else if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.ClickBottomSheet) {
                    AddMoneyBottomSheet.ClickBottomSheet.ADAPTER.encodeWithTag(writer, 3, ((AddMoneyBottomSheet.BottomSheetType_.ClickBottomSheet) bottomSheetType_).getValue());
                } else if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.ClientPoweredBottomSheet) {
                    AddMoneyBottomSheet.ClientPoweredBottomSheet.ADAPTER.encodeWithTag(writer, 4, ((AddMoneyBottomSheet.BottomSheetType_.ClientPoweredBottomSheet) bottomSheetType_).getValue());
                } else if (bottomSheetType_ != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AddMoneyBottomSheet value) {
                value.getClass();
                int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
                AddMoneyBottomSheet.BottomSheetType_ bottomSheetType_ = value.BottomSheetType;
                if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.RadioBottomSheet) {
                    return AddMoneyBottomSheet.RadioBottomSheet.ADAPTER.encodedSizeWithTag(2, ((AddMoneyBottomSheet.BottomSheetType_.RadioBottomSheet) bottomSheetType_).getValue()) + encodedSizeWithTag;
                }
                if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.ClickBottomSheet) {
                    return AddMoneyBottomSheet.ClickBottomSheet.ADAPTER.encodedSizeWithTag(3, ((AddMoneyBottomSheet.BottomSheetType_.ClickBottomSheet) bottomSheetType_).getValue()) + encodedSizeWithTag;
                }
                if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.ClientPoweredBottomSheet) {
                    return AddMoneyBottomSheet.ClientPoweredBottomSheet.ADAPTER.encodedSizeWithTag(4, ((AddMoneyBottomSheet.BottomSheetType_.ClientPoweredBottomSheet) bottomSheetType_).getValue()) + encodedSizeWithTag;
                }
                if (bottomSheetType_ == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AddMoneyBottomSheet redact(AddMoneyBottomSheet value) {
                value.getClass();
                LocalizedString localizedString = value.title;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                ByteString byteString = ByteString.EMPTY;
                AddMoneyBottomSheet.BottomSheetType_ bottomSheetType_ = value.BottomSheetType;
                byteString.getClass();
                return new AddMoneyBottomSheet(localizedString2, bottomSheetType_, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AddMoneyBottomSheet.BottomSheetType_ bottomSheetType_ = value.BottomSheetType;
                if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.RadioBottomSheet) {
                    AddMoneyBottomSheet.RadioBottomSheet.ADAPTER.encodeWithTag(writer, 2, ((AddMoneyBottomSheet.BottomSheetType_.RadioBottomSheet) bottomSheetType_).getValue());
                } else if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.ClickBottomSheet) {
                    AddMoneyBottomSheet.ClickBottomSheet.ADAPTER.encodeWithTag(writer, 3, ((AddMoneyBottomSheet.BottomSheetType_.ClickBottomSheet) bottomSheetType_).getValue());
                } else if (bottomSheetType_ instanceof AddMoneyBottomSheet.BottomSheetType_.ClientPoweredBottomSheet) {
                    AddMoneyBottomSheet.ClientPoweredBottomSheet.ADAPTER.encodeWithTag(writer, 4, ((AddMoneyBottomSheet.BottomSheetType_.ClientPoweredBottomSheet) bottomSheetType_).getValue());
                } else if (bottomSheetType_ != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyBottomSheet(LocalizedString localizedString, BottomSheetType_ bottomSheetType_, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.BottomSheetType = bottomSheetType_;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddMoneyBottomSheet)) {
            return false;
        }
        AddMoneyBottomSheet addMoneyBottomSheet = (AddMoneyBottomSheet) obj;
        return Intrinsics.areEqual(unknownFields(), addMoneyBottomSheet.unknownFields()) && Intrinsics.areEqual(this.title, addMoneyBottomSheet.title) && Intrinsics.areEqual(this.BottomSheetType, addMoneyBottomSheet.BottomSheetType);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        BottomSheetType_ bottomSheetType_ = this.BottomSheetType;
        int hashCode3 = hashCode2 + (bottomSheetType_ != null ? bottomSheetType_.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.BottomSheetType = this.BottomSheetType;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        BottomSheetType_ bottomSheetType_ = this.BottomSheetType;
        if (bottomSheetType_ != null) {
            arrayList.add("BottomSheetType=" + bottomSheetType_);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddMoneyBottomSheet{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$Builder;", "RowType", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "RowType_", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AddMoneyRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AddMoneyRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final RowType_ RowType;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "<init>", "()V", "RowType", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public RowType_ RowType;

            public final Builder RowType(RowType_ RowType) {
                this.RowType = RowType;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AddMoneyRow build() {
                return new AddMoneyRow(this.RowType, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddMoneyRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$AddMoneyRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.AddMoneyRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    AddMoneyBottomSheet.AddMoneyRow.RowType_ rowType_ = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AddMoneyBottomSheet.AddMoneyRow(rowType_, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            rowType_ = new AddMoneyBottomSheet.AddMoneyRow.RowType_.NavigationRow((AddMoneyBottomSheet.NavigationRow) AddMoneyBottomSheet.NavigationRow.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            rowType_ = new AddMoneyBottomSheet.AddMoneyRow.RowType_.BalancePickerRow((AddMoneyBottomSheet.BalancePickerRow) AddMoneyBottomSheet.BalancePickerRow.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.AddMoneyRow value) {
                    writer.getClass();
                    value.getClass();
                    AddMoneyBottomSheet.AddMoneyRow.RowType_ rowType_ = value.RowType;
                    if (rowType_ instanceof AddMoneyBottomSheet.AddMoneyRow.RowType_.NavigationRow) {
                        AddMoneyBottomSheet.NavigationRow.ADAPTER.encodeWithTag(writer, 1, ((AddMoneyBottomSheet.AddMoneyRow.RowType_.NavigationRow) rowType_).getValue());
                    } else if (rowType_ instanceof AddMoneyBottomSheet.AddMoneyRow.RowType_.BalancePickerRow) {
                        AddMoneyBottomSheet.BalancePickerRow.ADAPTER.encodeWithTag(writer, 2, ((AddMoneyBottomSheet.AddMoneyRow.RowType_.BalancePickerRow) rowType_).getValue());
                    } else if (rowType_ != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.AddMoneyRow value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    AddMoneyBottomSheet.AddMoneyRow.RowType_ rowType_ = value.RowType;
                    if (rowType_ instanceof AddMoneyBottomSheet.AddMoneyRow.RowType_.NavigationRow) {
                        encodedSizeWithTag = AddMoneyBottomSheet.NavigationRow.ADAPTER.encodedSizeWithTag(1, ((AddMoneyBottomSheet.AddMoneyRow.RowType_.NavigationRow) rowType_).getValue());
                    } else {
                        if (!(rowType_ instanceof AddMoneyBottomSheet.AddMoneyRow.RowType_.BalancePickerRow)) {
                            if (rowType_ == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = AddMoneyBottomSheet.BalancePickerRow.ADAPTER.encodedSizeWithTag(2, ((AddMoneyBottomSheet.AddMoneyRow.RowType_.BalancePickerRow) rowType_).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.AddMoneyRow redact(AddMoneyBottomSheet.AddMoneyRow value) {
                    value.getClass();
                    return AddMoneyBottomSheet.AddMoneyRow.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.AddMoneyRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    AddMoneyBottomSheet.AddMoneyRow.RowType_ rowType_ = value.RowType;
                    if (rowType_ instanceof AddMoneyBottomSheet.AddMoneyRow.RowType_.NavigationRow) {
                        AddMoneyBottomSheet.NavigationRow.ADAPTER.encodeWithTag(writer, 1, ((AddMoneyBottomSheet.AddMoneyRow.RowType_.NavigationRow) rowType_).getValue());
                    } else if (rowType_ instanceof AddMoneyBottomSheet.AddMoneyRow.RowType_.BalancePickerRow) {
                        AddMoneyBottomSheet.BalancePickerRow.ADAPTER.encodeWithTag(writer, 2, ((AddMoneyBottomSheet.AddMoneyRow.RowType_.BalancePickerRow) rowType_).getValue());
                    } else {
                        if (rowType_ == null) {
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

        public /* synthetic */ AddMoneyRow(RowType_ rowType_, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : rowType_, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AddMoneyRow copy$default(AddMoneyRow addMoneyRow, RowType_ rowType_, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                rowType_ = addMoneyRow.RowType;
            }
            if ((i & 2) != 0) {
                byteString = addMoneyRow.unknownFields();
            }
            return addMoneyRow.copy(rowType_, byteString);
        }

        public final AddMoneyRow copy(RowType_ RowType, ByteString unknownFields) {
            unknownFields.getClass();
            return new AddMoneyRow(RowType, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AddMoneyRow)) {
                return false;
            }
            AddMoneyRow addMoneyRow = (AddMoneyRow) other;
            return Intrinsics.areEqual(unknownFields(), addMoneyRow.unknownFields()) && Intrinsics.areEqual(this.RowType, addMoneyRow.RowType);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RowType_ rowType_ = this.RowType;
            int hashCode2 = hashCode + (rowType_ != null ? rowType_.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.RowType = this.RowType;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            RowType_ rowType_ = this.RowType;
            if (rowType_ != null) {
                arrayList.add("RowType=" + rowType_);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AddMoneyRow{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AddMoneyRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_;", "", "<init>", "()V", "NavigationRow", "BalancePickerRow", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_$BalancePickerRow;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_$NavigationRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class RowType_ {

            @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$BalancePickerRow#ADAPTER", declaredName = "balance_picker_row", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_$BalancePickerRow;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class BalancePickerRow extends RowType_ {
                private final BalancePickerRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BalancePickerRow(BalancePickerRow balancePickerRow) {
                    super(null);
                    balancePickerRow.getClass();
                    this.value = balancePickerRow;
                }

                public static /* synthetic */ BalancePickerRow copy$default(BalancePickerRow balancePickerRow, BalancePickerRow balancePickerRow2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        balancePickerRow2 = balancePickerRow.value;
                    }
                    return balancePickerRow.copy(balancePickerRow2);
                }

                /* renamed from: component1, reason: from getter */
                public final BalancePickerRow getValue() {
                    return this.value;
                }

                public final BalancePickerRow copy(BalancePickerRow value) {
                    value.getClass();
                    return new BalancePickerRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BalancePickerRow) && Intrinsics.areEqual(this.value, ((BalancePickerRow) other).value);
                }

                public final BalancePickerRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "BalancePickerRow(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$NavigationRow#ADAPTER", declaredName = "navigation_row", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_$NavigationRow;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow$RowType_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class NavigationRow extends RowType_ {
                private final NavigationRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NavigationRow(NavigationRow navigationRow) {
                    super(null);
                    navigationRow.getClass();
                    this.value = navigationRow;
                }

                public static /* synthetic */ NavigationRow copy$default(NavigationRow navigationRow, NavigationRow navigationRow2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        navigationRow2 = navigationRow.value;
                    }
                    return navigationRow.copy(navigationRow2);
                }

                /* renamed from: component1, reason: from getter */
                public final NavigationRow getValue() {
                    return this.value;
                }

                public final NavigationRow copy(NavigationRow value) {
                    value.getClass();
                    return new NavigationRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NavigationRow) && Intrinsics.areEqual(this.value, ((NavigationRow) other).value);
                }

                public final NavigationRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "NavigationRow(value=" + this.value + ")";
                }
            }

            public /* synthetic */ RowType_(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private RowType_() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddMoneyRow() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMoneyRow(RowType_ rowType_, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.RowType = rowType_;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JJ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow$Builder;", "row_id", "", "header_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subheader_text", "image", "Lcom/squareup/protos/cash/ui/Image;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/ui/Icon;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalancePickerRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BalancePickerRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString header_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 4, tag = 5)
        public final Icon icon;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 3, tag = 4)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 0, tag = 1)
        public final String row_id;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizedString subheader_text;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow;", "<init>", "()V", "row_id", "", "header_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subheader_text", "image", "Lcom/squareup/protos/cash/ui/Image;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString header_text;
            public Icon icon;
            public Image image;
            public String row_id;
            public LocalizedString subheader_text;

            @Override // com.squareup.wire.Message.Builder
            public BalancePickerRow build() {
                String str = this.row_id;
                if (str != null) {
                    return new BalancePickerRow(str, this.header_text, this.subheader_text, this.image, this.icon, buildUnknownFields());
                }
                TransactorKt.missingRequiredFields(str, "row_id");
                throw null;
            }

            public final Builder header_text(LocalizedString header_text) {
                this.header_text = header_text;
                return this;
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder row_id(String row_id) {
                row_id.getClass();
                this.row_id = row_id;
                return this;
            }

            public final Builder subheader_text(LocalizedString subheader_text) {
                this.subheader_text = subheader_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BalancePickerRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$BalancePickerRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.BalancePickerRow decode(ProtoReader reader) {
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
                            break;
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj5);
                        }
                    }
                    ByteString endMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(beginMessage);
                    String str = (String) obj;
                    if (str != null) {
                        return new AddMoneyBottomSheet.BalancePickerRow(str, (LocalizedString) obj2, (LocalizedString) obj3, (Image) obj4, (Icon) obj5, endMessageAndGetUnknownFields);
                    }
                    TransactorKt.missingRequiredFields(obj, "row_id");
                    throw null;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.BalancePickerRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.row_id);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.header_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.subheader_text);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    Icon.ADAPTER.encodeWithTag(writer, 5, value.icon);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.BalancePickerRow value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.row_id) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return Icon.ADAPTER.encodedSizeWithTag(5, value.icon) + Image.ADAPTER.encodedSizeWithTag(4, value.image) + protoAdapter2.encodedSizeWithTag(3, value.subheader_text) + protoAdapter2.encodedSizeWithTag(2, value.header_text) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.BalancePickerRow redact(AddMoneyBottomSheet.BalancePickerRow value) {
                    value.getClass();
                    LocalizedString localizedString = value.header_text;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.subheader_text;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    Icon icon = value.icon;
                    return AddMoneyBottomSheet.BalancePickerRow.copy$default(value, null, localizedString2, localizedString4, image2, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.BalancePickerRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Icon.ADAPTER.encodeWithTag(writer, 5, value.icon);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 3, value.subheader_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.header_text);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.row_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BalancePickerRow(String str, LocalizedString localizedString, LocalizedString localizedString2, Image image, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? null : localizedString2, (i & 8) != 0 ? null : image, (i & 16) != 0 ? null : icon, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BalancePickerRow copy$default(BalancePickerRow balancePickerRow, String str, LocalizedString localizedString, LocalizedString localizedString2, Image image, Icon icon, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = balancePickerRow.row_id;
            }
            if ((i & 2) != 0) {
                localizedString = balancePickerRow.header_text;
            }
            if ((i & 4) != 0) {
                localizedString2 = balancePickerRow.subheader_text;
            }
            if ((i & 8) != 0) {
                image = balancePickerRow.image;
            }
            if ((i & 16) != 0) {
                icon = balancePickerRow.icon;
            }
            if ((i & 32) != 0) {
                byteString = balancePickerRow.unknownFields();
            }
            Icon icon2 = icon;
            ByteString byteString2 = byteString;
            return balancePickerRow.copy(str, localizedString, localizedString2, image, icon2, byteString2);
        }

        public final BalancePickerRow copy(String row_id, LocalizedString header_text, LocalizedString subheader_text, Image image, Icon icon, ByteString unknownFields) {
            row_id.getClass();
            unknownFields.getClass();
            return new BalancePickerRow(row_id, header_text, subheader_text, image, icon, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BalancePickerRow)) {
                return false;
            }
            BalancePickerRow balancePickerRow = (BalancePickerRow) other;
            return Intrinsics.areEqual(unknownFields(), balancePickerRow.unknownFields()) && Intrinsics.areEqual(this.row_id, balancePickerRow.row_id) && Intrinsics.areEqual(this.header_text, balancePickerRow.header_text) && Intrinsics.areEqual(this.subheader_text, balancePickerRow.subheader_text) && Intrinsics.areEqual(this.image, balancePickerRow.image) && Intrinsics.areEqual(this.icon, balancePickerRow.icon);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.row_id);
            LocalizedString localizedString = this.header_text;
            int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subheader_text;
            int hashCode2 = (hashCode + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode4 = hashCode3 + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.row_id = this.row_id;
            builder.header_text = this.header_text;
            builder.subheader_text = this.subheader_text;
            builder.image = this.image;
            builder.icon = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.row_id, "row_id=", arrayList);
            LocalizedString localizedString = this.header_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("header_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subheader_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subheader_text=", localizedString2, arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BalancePickerRow{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BalancePickerRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BalancePickerRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalancePickerRow(String str, LocalizedString localizedString, LocalizedString localizedString2, Image image, Icon icon, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.row_id = str;
            this.header_text = localizedString;
            this.subheader_text = localizedString2;
            this.image = image;
            this.icon = icon;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet$Builder;", "id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientPoweredBottomSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientPoweredBottomSheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 0, tag = 1)
        public final String id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet;", "<init>", "()V", "id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String id;

            @Override // com.squareup.wire.Message.Builder
            public ClientPoweredBottomSheet build() {
                String str = this.id;
                if (str != null) {
                    return new ClientPoweredBottomSheet(str, buildUnknownFields());
                }
                TransactorKt.missingRequiredFields(str, "id");
                throw null;
            }

            public final Builder id(String id) {
                id.getClass();
                this.id = id;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientPoweredBottomSheet.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientPoweredBottomSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClientPoweredBottomSheet decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            break;
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                    ByteString endMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(beginMessage);
                    String str = (String) obj;
                    if (str != null) {
                        return new AddMoneyBottomSheet.ClientPoweredBottomSheet(str, endMessageAndGetUnknownFields);
                    }
                    TransactorKt.missingRequiredFields(obj, "id");
                    throw null;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.ClientPoweredBottomSheet value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.ClientPoweredBottomSheet value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClientPoweredBottomSheet redact(AddMoneyBottomSheet.ClientPoweredBottomSheet value) {
                    value.getClass();
                    return AddMoneyBottomSheet.ClientPoweredBottomSheet.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.ClientPoweredBottomSheet value) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientPoweredBottomSheet(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.id = str;
        }

        public static /* synthetic */ ClientPoweredBottomSheet copy$default(ClientPoweredBottomSheet clientPoweredBottomSheet, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientPoweredBottomSheet.id;
            }
            if ((i & 2) != 0) {
                byteString = clientPoweredBottomSheet.unknownFields();
            }
            return clientPoweredBottomSheet.copy(str, byteString);
        }

        public final ClientPoweredBottomSheet copy(String id, ByteString unknownFields) {
            id.getClass();
            unknownFields.getClass();
            return new ClientPoweredBottomSheet(id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ClientPoweredBottomSheet)) {
                return false;
            }
            ClientPoweredBottomSheet clientPoweredBottomSheet = (ClientPoweredBottomSheet) other;
            return Intrinsics.areEqual(unknownFields(), clientPoweredBottomSheet.unknownFields()) && Intrinsics.areEqual(this.id, clientPoweredBottomSheet.id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.id.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
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
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.id, "id=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientPoweredBottomSheet{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ClientPoweredBottomSheet build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public /* synthetic */ ClientPoweredBottomSheet(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction$Builder;", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientRouteAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "<init>", "()V", "url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientRouteAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClientRouteAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AddMoneyBottomSheet.ClientRouteAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.ClientRouteAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.ClientRouteAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.url) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClientRouteAction redact(AddMoneyBottomSheet.ClientRouteAction value) {
                    value.getClass();
                    return AddMoneyBottomSheet.ClientRouteAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.ClientRouteAction value) {
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction$Builder;", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/ClientScenario;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientScenarioAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientScenarioAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.ClientScenario#ADAPTER", schemaIndex = 0, tag = 1)
        public final ClientScenario client_scenario;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "<init>", "()V", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientScenarioAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClientScenarioAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AddMoneyBottomSheet.ClientScenarioAction((ClientScenario) obj, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.ClientScenarioAction value) {
                    writer.getClass();
                    value.getClass();
                    ClientScenario.ADAPTER.encodeWithTag(writer, 1, value.client_scenario);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.ClientScenarioAction value) {
                    value.getClass();
                    return ClientScenario.ADAPTER.encodedSizeWithTag(1, value.client_scenario) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.ClientScenarioAction redact(AddMoneyBottomSheet.ClientScenarioAction value) {
                    value.getClass();
                    return AddMoneyBottomSheet.ClientScenarioAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.ClientScenarioAction value) {
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dBU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0016JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$Builder;", "row_id", "", "header_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subheader_text", "image", "Lcom/squareup/protos/cash/ui/Image;", "NavigationAction", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_;Lcom/squareup/protos/cash/ui/Icon;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "NavigationAction_", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigationRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NavigationRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 4)
        public final NavigationAction_ NavigationAction;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString header_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 5, tag = 8)
        public final Icon icon;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 3, tag = 4)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 0, tag = 1)
        public final String row_id;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizedString subheader_text;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow;", "<init>", "()V", "row_id", "", "header_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subheader_text", "image", "Lcom/squareup/protos/cash/ui/Image;", "NavigationAction", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public NavigationAction_ NavigationAction;
            public LocalizedString header_text;
            public Icon icon;
            public Image image;
            public String row_id;
            public LocalizedString subheader_text;

            public final Builder NavigationAction(NavigationAction_ NavigationAction) {
                this.NavigationAction = NavigationAction;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public NavigationRow build() {
                String str = this.row_id;
                if (str != null) {
                    return new NavigationRow(str, this.header_text, this.subheader_text, this.image, this.NavigationAction, this.icon, buildUnknownFields());
                }
                TransactorKt.missingRequiredFields(str, "row_id");
                throw null;
            }

            public final Builder header_text(LocalizedString header_text) {
                this.header_text = header_text;
                return this;
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder row_id(String row_id) {
                row_id.getClass();
                this.row_id = row_id;
                return this;
            }

            public final Builder subheader_text(LocalizedString subheader_text) {
                this.subheader_text = subheader_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NavigationRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$NavigationRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.NavigationRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    AddMoneyBottomSheet.NavigationRow.NavigationAction_ navigationAction_ = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            ByteString endMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(beginMessage);
                            Object obj6 = obj5;
                            String str = (String) obj;
                            if (str != null) {
                                return new AddMoneyBottomSheet.NavigationRow(str, (LocalizedString) obj2, (LocalizedString) obj3, (Image) obj4, navigationAction_, (Icon) obj6, endMessageAndGetUnknownFields);
                            }
                            TransactorKt.missingRequiredFields(obj, "row_id");
                            throw null;
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                                break;
                            case 5:
                                navigationAction_ = new AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientScenarioAction((AddMoneyBottomSheet.ClientScenarioAction) AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.decode(reader));
                                break;
                            case 6:
                                navigationAction_ = new AddMoneyBottomSheet.NavigationRow.NavigationAction_.Dialog((AddMoneyBottomSheet.Dialog) AddMoneyBottomSheet.Dialog.ADAPTER.decode(reader));
                                break;
                            case 7:
                                navigationAction_ = new AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientRouteAction((AddMoneyBottomSheet.ClientRouteAction) AddMoneyBottomSheet.ClientRouteAction.ADAPTER.decode(reader));
                                break;
                            case 8:
                                obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj5);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.NavigationRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.row_id);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.header_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.subheader_text);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    Icon.ADAPTER.encodeWithTag(writer, 8, value.icon);
                    AddMoneyBottomSheet.NavigationRow.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientScenarioAction) {
                        AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 5, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.Dialog) {
                        AddMoneyBottomSheet.Dialog.ADAPTER.encodeWithTag(writer, 6, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientRouteAction) {
                        AddMoneyBottomSheet.ClientRouteAction.ADAPTER.encodeWithTag(writer, 7, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    } else if (navigationAction_ != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.NavigationRow value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int encodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(1, value.row_id) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    int encodedSizeWithTag3 = Image.ADAPTER.encodedSizeWithTag(4, value.image) + protoAdapter2.encodedSizeWithTag(3, value.subheader_text) + protoAdapter2.encodedSizeWithTag(2, value.header_text) + encodedSizeWithTag2;
                    AddMoneyBottomSheet.NavigationRow.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientScenarioAction) {
                        encodedSizeWithTag = AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.encodedSizeWithTag(5, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.Dialog) {
                        encodedSizeWithTag = AddMoneyBottomSheet.Dialog.ADAPTER.encodedSizeWithTag(6, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else {
                        if (!(navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientRouteAction)) {
                            if (navigationAction_ != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            return Icon.ADAPTER.encodedSizeWithTag(8, value.icon) + encodedSizeWithTag3;
                        }
                        encodedSizeWithTag = AddMoneyBottomSheet.ClientRouteAction.ADAPTER.encodedSizeWithTag(7, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    }
                    encodedSizeWithTag3 += encodedSizeWithTag;
                    return Icon.ADAPTER.encodedSizeWithTag(8, value.icon) + encodedSizeWithTag3;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.NavigationRow redact(AddMoneyBottomSheet.NavigationRow value) {
                    value.getClass();
                    LocalizedString localizedString = value.header_text;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.subheader_text;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    Icon icon = value.icon;
                    return AddMoneyBottomSheet.NavigationRow.copy$default(value, null, localizedString2, localizedString4, image2, null, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, ByteString.EMPTY, 17, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.NavigationRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    AddMoneyBottomSheet.NavigationRow.NavigationAction_ navigationAction_ = value.NavigationAction;
                    if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientScenarioAction) {
                        AddMoneyBottomSheet.ClientScenarioAction.ADAPTER.encodeWithTag(writer, 5, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientScenarioAction) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.Dialog) {
                        AddMoneyBottomSheet.Dialog.ADAPTER.encodeWithTag(writer, 6, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.Dialog) navigationAction_).getValue());
                    } else if (navigationAction_ instanceof AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientRouteAction) {
                        AddMoneyBottomSheet.ClientRouteAction.ADAPTER.encodeWithTag(writer, 7, ((AddMoneyBottomSheet.NavigationRow.NavigationAction_.ClientRouteAction) navigationAction_).getValue());
                    } else if (navigationAction_ != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    Icon.ADAPTER.encodeWithTag(writer, 8, value.icon);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.image);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 3, value.subheader_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.header_text);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.row_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ NavigationRow(String str, LocalizedString localizedString, LocalizedString localizedString2, Image image, NavigationAction_ navigationAction_, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? null : localizedString2, (i & 8) != 0 ? null : image, (i & 16) != 0 ? null : navigationAction_, (i & 32) != 0 ? null : icon, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ NavigationRow copy$default(NavigationRow navigationRow, String str, LocalizedString localizedString, LocalizedString localizedString2, Image image, NavigationAction_ navigationAction_, Icon icon, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigationRow.row_id;
            }
            if ((i & 2) != 0) {
                localizedString = navigationRow.header_text;
            }
            if ((i & 4) != 0) {
                localizedString2 = navigationRow.subheader_text;
            }
            if ((i & 8) != 0) {
                image = navigationRow.image;
            }
            if ((i & 16) != 0) {
                navigationAction_ = navigationRow.NavigationAction;
            }
            if ((i & 32) != 0) {
                icon = navigationRow.icon;
            }
            if ((i & 64) != 0) {
                byteString = navigationRow.unknownFields();
            }
            Icon icon2 = icon;
            ByteString byteString2 = byteString;
            NavigationAction_ navigationAction_2 = navigationAction_;
            LocalizedString localizedString3 = localizedString2;
            return navigationRow.copy(str, localizedString, localizedString3, image, navigationAction_2, icon2, byteString2);
        }

        public final NavigationRow copy(String row_id, LocalizedString header_text, LocalizedString subheader_text, Image image, NavigationAction_ NavigationAction, Icon icon, ByteString unknownFields) {
            row_id.getClass();
            unknownFields.getClass();
            return new NavigationRow(row_id, header_text, subheader_text, image, NavigationAction, icon, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof NavigationRow)) {
                return false;
            }
            NavigationRow navigationRow = (NavigationRow) other;
            return Intrinsics.areEqual(unknownFields(), navigationRow.unknownFields()) && Intrinsics.areEqual(this.row_id, navigationRow.row_id) && Intrinsics.areEqual(this.header_text, navigationRow.header_text) && Intrinsics.areEqual(this.subheader_text, navigationRow.subheader_text) && Intrinsics.areEqual(this.image, navigationRow.image) && Intrinsics.areEqual(this.NavigationAction, navigationRow.NavigationAction) && Intrinsics.areEqual(this.icon, navigationRow.icon);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.row_id);
            LocalizedString localizedString = this.header_text;
            int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subheader_text;
            int hashCode2 = (hashCode + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
            NavigationAction_ navigationAction_ = this.NavigationAction;
            int hashCode4 = (hashCode3 + (navigationAction_ != null ? navigationAction_.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode5 = hashCode4 + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.row_id = this.row_id;
            builder.header_text = this.header_text;
            builder.subheader_text = this.subheader_text;
            builder.image = this.image;
            builder.NavigationAction = this.NavigationAction;
            builder.icon = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.row_id, "row_id=", arrayList);
            LocalizedString localizedString = this.header_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("header_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subheader_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subheader_text=", localizedString2, arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            NavigationAction_ navigationAction_ = this.NavigationAction;
            if (navigationAction_ != null) {
                arrayList.add("NavigationAction=" + navigationAction_);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationRow{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ NavigationRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_;", "", "<init>", "()V", "ClientScenarioAction", "Dialog", "ClientRouteAction", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_$Dialog;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class NavigationAction_ {

            @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientRouteAction#ADAPTER", declaredName = "client_route_action", tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_$ClientRouteAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientRouteAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientScenarioAction#ADAPTER", declaredName = "client_scenario_action", tag = 5)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_$ClientScenarioAction;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientScenarioAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$Dialog#ADAPTER", declaredName = "dialog", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_$Dialog;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$NavigationRow$NavigationAction_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Dialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigationRow(String str, LocalizedString localizedString, LocalizedString localizedString2, Image image, NavigationAction_ navigationAction_, Icon icon, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.row_id = str;
            this.header_text = localizedString;
            this.subheader_text = localizedString2;
            this.image = image;
            this.NavigationAction = navigationAction_;
            this.icon = icon;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0006H\u0016J8\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet$Builder;", "button_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "default_row_id", "", "add_money_rows", "", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RadioBottomSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RadioBottomSheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$AddMoneyRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        public final List<AddMoneyRow> add_money_rows;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String default_row_id;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet;", "<init>", "()V", "button_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "default_row_id", "", "add_money_rows", "", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$AddMoneyRow;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<AddMoneyRow> add_money_rows = EmptyList.INSTANCE;
            public LocalizedString button_text;
            public String default_row_id;

            public final Builder add_money_rows(List<AddMoneyRow> add_money_rows) {
                add_money_rows.getClass();
                TransactorKt.checkElementsNotNull(add_money_rows);
                this.add_money_rows = add_money_rows;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public RadioBottomSheet build() {
                return new RadioBottomSheet(this.button_text, this.default_row_id, this.add_money_rows, buildUnknownFields());
            }

            public final Builder button_text(LocalizedString button_text) {
                this.button_text = button_text;
                return this;
            }

            public final Builder default_row_id(String default_row_id) {
                this.default_row_id = default_row_id;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RadioBottomSheet.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.unicorn.AddMoneyBottomSheet$RadioBottomSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.RadioBottomSheet decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AddMoneyBottomSheet.RadioBottomSheet((LocalizedString) obj, (String) obj2, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(AddMoneyBottomSheet.AddMoneyRow.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyBottomSheet.RadioBottomSheet value) {
                    writer.getClass();
                    value.getClass();
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.button_text);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.default_row_id);
                    AddMoneyBottomSheet.AddMoneyRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.add_money_rows);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyBottomSheet.RadioBottomSheet value) {
                    value.getClass();
                    return AddMoneyBottomSheet.AddMoneyRow.ADAPTER.asRepeated().encodedSizeWithTag(3, value.add_money_rows) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.default_row_id) + LocalizedString.ADAPTER.encodedSizeWithTag(1, value.button_text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyBottomSheet.RadioBottomSheet redact(AddMoneyBottomSheet.RadioBottomSheet value) {
                    value.getClass();
                    LocalizedString localizedString = value.button_text;
                    return AddMoneyBottomSheet.RadioBottomSheet.copy$default(value, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, null, TransactorKt.m1169redactElements(value.add_money_rows, AddMoneyBottomSheet.AddMoneyRow.ADAPTER), ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyBottomSheet.RadioBottomSheet value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    AddMoneyBottomSheet.AddMoneyRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.add_money_rows);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.default_row_id);
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.button_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public RadioBottomSheet(LocalizedString localizedString, String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : str, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RadioBottomSheet copy$default(RadioBottomSheet radioBottomSheet, LocalizedString localizedString, String str, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = radioBottomSheet.button_text;
            }
            if ((i & 2) != 0) {
                str = radioBottomSheet.default_row_id;
            }
            if ((i & 4) != 0) {
                list = radioBottomSheet.add_money_rows;
            }
            if ((i & 8) != 0) {
                byteString = radioBottomSheet.unknownFields();
            }
            return radioBottomSheet.copy(localizedString, str, list, byteString);
        }

        public final RadioBottomSheet copy(LocalizedString button_text, String default_row_id, List<AddMoneyRow> add_money_rows, ByteString unknownFields) {
            add_money_rows.getClass();
            unknownFields.getClass();
            return new RadioBottomSheet(button_text, default_row_id, add_money_rows, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof RadioBottomSheet)) {
                return false;
            }
            RadioBottomSheet radioBottomSheet = (RadioBottomSheet) other;
            return Intrinsics.areEqual(unknownFields(), radioBottomSheet.unknownFields()) && Intrinsics.areEqual(this.button_text, radioBottomSheet.button_text) && Intrinsics.areEqual(this.default_row_id, radioBottomSheet.default_row_id) && Intrinsics.areEqual(this.add_money_rows, radioBottomSheet.add_money_rows);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.button_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            String str = this.default_row_id;
            int hashCode3 = this.add_money_rows.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.button_text = this.button_text;
            builder.default_row_id = this.default_row_id;
            builder.add_money_rows = this.add_money_rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.button_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString, arrayList);
            }
            String str = this.default_row_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "default_row_id=", arrayList);
            }
            if (!this.add_money_rows.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("add_money_rows=", arrayList, this.add_money_rows);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RadioBottomSheet{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ RadioBottomSheet build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public RadioBottomSheet() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RadioBottomSheet(LocalizedString localizedString, String str, List<AddMoneyRow> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.button_text = localizedString;
            this.default_row_id = str;
            this.add_money_rows = TransactorKt.immutableCopyOf("add_money_rows", list);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_;", "", "<init>", "()V", "RadioBottomSheet", "ClickBottomSheet", "ClientPoweredBottomSheet", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_$ClickBottomSheet;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_$ClientPoweredBottomSheet;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_$RadioBottomSheet;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class BottomSheetType_ {

        @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$ClickBottomSheet#ADAPTER", declaredName = "click_bottom_sheet", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_$ClickBottomSheet;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClickBottomSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClickBottomSheet extends BottomSheetType_ {
            private final ClickBottomSheet value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClickBottomSheet(ClickBottomSheet clickBottomSheet) {
                super(null);
                clickBottomSheet.getClass();
                this.value = clickBottomSheet;
            }

            public static /* synthetic */ ClickBottomSheet copy$default(ClickBottomSheet clickBottomSheet, ClickBottomSheet clickBottomSheet2, int i, Object obj) {
                if ((i & 1) != 0) {
                    clickBottomSheet2 = clickBottomSheet.value;
                }
                return clickBottomSheet.copy(clickBottomSheet2);
            }

            /* renamed from: component1, reason: from getter */
            public final ClickBottomSheet getValue() {
                return this.value;
            }

            public final ClickBottomSheet copy(ClickBottomSheet value) {
                value.getClass();
                return new ClickBottomSheet(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ClickBottomSheet) && Intrinsics.areEqual(this.value, ((ClickBottomSheet) other).value);
            }

            public final ClickBottomSheet getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ClickBottomSheet(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$ClientPoweredBottomSheet#ADAPTER", declaredName = "client_powered_bottom_sheet", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_$ClientPoweredBottomSheet;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$ClientPoweredBottomSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClientPoweredBottomSheet extends BottomSheetType_ {
            private final ClientPoweredBottomSheet value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClientPoweredBottomSheet(ClientPoweredBottomSheet clientPoweredBottomSheet) {
                super(null);
                clientPoweredBottomSheet.getClass();
                this.value = clientPoweredBottomSheet;
            }

            public static /* synthetic */ ClientPoweredBottomSheet copy$default(ClientPoweredBottomSheet clientPoweredBottomSheet, ClientPoweredBottomSheet clientPoweredBottomSheet2, int i, Object obj) {
                if ((i & 1) != 0) {
                    clientPoweredBottomSheet2 = clientPoweredBottomSheet.value;
                }
                return clientPoweredBottomSheet.copy(clientPoweredBottomSheet2);
            }

            /* renamed from: component1, reason: from getter */
            public final ClientPoweredBottomSheet getValue() {
                return this.value;
            }

            public final ClientPoweredBottomSheet copy(ClientPoweredBottomSheet value) {
                value.getClass();
                return new ClientPoweredBottomSheet(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ClientPoweredBottomSheet) && Intrinsics.areEqual(this.value, ((ClientPoweredBottomSheet) other).value);
            }

            public final ClientPoweredBottomSheet getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ClientPoweredBottomSheet(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.unicorn.AddMoneyBottomSheet$RadioBottomSheet#ADAPTER", declaredName = "radio_bottom_sheet", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_$RadioBottomSheet;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$BottomSheetType_;", "value", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet;", "<init>", "(Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet;)V", "getValue", "()Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$RadioBottomSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RadioBottomSheet extends BottomSheetType_ {
            private final RadioBottomSheet value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RadioBottomSheet(RadioBottomSheet radioBottomSheet) {
                super(null);
                radioBottomSheet.getClass();
                this.value = radioBottomSheet;
            }

            public static /* synthetic */ RadioBottomSheet copy$default(RadioBottomSheet radioBottomSheet, RadioBottomSheet radioBottomSheet2, int i, Object obj) {
                if ((i & 1) != 0) {
                    radioBottomSheet2 = radioBottomSheet.value;
                }
                return radioBottomSheet.copy(radioBottomSheet2);
            }

            /* renamed from: component1, reason: from getter */
            public final RadioBottomSheet getValue() {
                return this.value;
            }

            public final RadioBottomSheet copy(RadioBottomSheet value) {
                value.getClass();
                return new RadioBottomSheet(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RadioBottomSheet) && Intrinsics.areEqual(this.value, ((RadioBottomSheet) other).value);
            }

            public final RadioBottomSheet getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RadioBottomSheet(value=" + this.value + ")";
            }
        }

        public /* synthetic */ BottomSheetType_(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BottomSheetType_() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet$Builder;", "", "body", "Lcom/squareup/protos/unicorn/AddMoneyBottomSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/unicorn/AddMoneyBottomSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AddMoneyBottomSheet build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
