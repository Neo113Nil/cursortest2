package com.squareup.protos.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.InitiateLoanData;
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
import kotlin.Deprecated;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0019\u0018\u001a\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/InitiateLoanData$Builder;", "Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption;", "custom_loan_option", "Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "Lcom/squareup/protos/common/Money;", "minimum_loan_amount", "Lcom/squareup/protos/common/Money;", "maximum_loan_amount", "primary_button_text", "Lcom/squareup/protos/cash/ui/Color;", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "getTint_color$annotations", "()V", "", "Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption;", "quick_loan_options", "Ljava/util/List;", "Companion", "Builder", "QuickLoanOption", "CustomLoanOption", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InitiateLoanData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateLoanData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.lending.InitiateLoanData$CustomLoanOption#ADAPTER", schemaIndex = 1, tag = 2)
    public final CustomLoanOption custom_loan_option;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 5, tag = 6)
    public final Money maximum_loan_amount;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 5)
    public final Money minimum_loan_amount;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 6, tag = 7)
    public final LocalizedString primary_button_text;

    @WireField(adapter = "com.squareup.protos.lending.InitiateLoanData$QuickLoanOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<QuickLoanOption> quick_loan_options;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalizedString subtitle;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 7, tag = 8)
    public final Color tint_color;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString title;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/InitiateLoanData;", "<init>", "()V", "quick_loan_options", "", "Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption;", "custom_loan_option", "Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "minimum_loan_amount", "Lcom/squareup/protos/common/Money;", "maximum_loan_amount", "primary_button_text", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public CustomLoanOption custom_loan_option;
        public Money maximum_loan_amount;
        public Money minimum_loan_amount;
        public LocalizedString primary_button_text;
        public List<QuickLoanOption> quick_loan_options = EmptyList.INSTANCE;
        public LocalizedString subtitle;
        public Color tint_color;
        public LocalizedString title;

        @Override // com.squareup.wire.Message.Builder
        public InitiateLoanData build() {
            return new InitiateLoanData(this.quick_loan_options, this.custom_loan_option, this.title, this.subtitle, this.minimum_loan_amount, this.maximum_loan_amount, this.primary_button_text, this.tint_color, buildUnknownFields());
        }

        public final Builder custom_loan_option(CustomLoanOption custom_loan_option) {
            this.custom_loan_option = custom_loan_option;
            return this;
        }

        public final Builder maximum_loan_amount(Money maximum_loan_amount) {
            this.maximum_loan_amount = maximum_loan_amount;
            return this;
        }

        public final Builder minimum_loan_amount(Money minimum_loan_amount) {
            this.minimum_loan_amount = minimum_loan_amount;
            return this;
        }

        public final Builder primary_button_text(LocalizedString primary_button_text) {
            this.primary_button_text = primary_button_text;
            return this;
        }

        public final Builder quick_loan_options(List<QuickLoanOption> quick_loan_options) {
            quick_loan_options.getClass();
            TransactorKt.checkElementsNotNull(quick_loan_options);
            this.quick_loan_options = quick_loan_options;
            return this;
        }

        public final Builder subtitle(LocalizedString subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        @Deprecated
        public final Builder tint_color(Color tint_color) {
            this.tint_color = tint_color;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateLoanData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.InitiateLoanData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InitiateLoanData decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                        return new InitiateLoanData(m, (InitiateLoanData.CustomLoanOption) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Money) obj4, (Money) obj5, (LocalizedString) obj6, (Color) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(InitiateLoanData.QuickLoanOption.ADAPTER.decode(reader));
                            break;
                        case 2:
                            obj = TransactorKt.decodeMessageOrMerge(InitiateLoanData.CustomLoanOption.ADAPTER, reader, obj);
                            break;
                        case 3:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                            break;
                        case 4:
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj5);
                            break;
                        case 7:
                            obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj6);
                            break;
                        case 8:
                            obj7 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj7);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InitiateLoanData value) {
                writer.getClass();
                value.getClass();
                InitiateLoanData.QuickLoanOption.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.quick_loan_options);
                InitiateLoanData.CustomLoanOption.ADAPTER.encodeWithTag(writer, 2, value.custom_loan_option);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, value.title);
                protoAdapter2.encodeWithTag(writer, 4, value.subtitle);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 5, value.minimum_loan_amount);
                protoAdapter3.encodeWithTag(writer, 6, value.maximum_loan_amount);
                protoAdapter2.encodeWithTag(writer, 7, value.primary_button_text);
                Color.ADAPTER.encodeWithTag(writer, 8, value.tint_color);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InitiateLoanData value) {
                value.getClass();
                int encodedSizeWithTag = InitiateLoanData.CustomLoanOption.ADAPTER.encodedSizeWithTag(2, value.custom_loan_option) + InitiateLoanData.QuickLoanOption.ADAPTER.asRepeated().encodedSizeWithTag(1, value.quick_loan_options) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, value.subtitle) + protoAdapter2.encodedSizeWithTag(3, value.title) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                return Color.ADAPTER.encodedSizeWithTag(8, value.tint_color) + protoAdapter2.encodedSizeWithTag(7, value.primary_button_text) + protoAdapter3.encodedSizeWithTag(6, value.maximum_loan_amount) + protoAdapter3.encodedSizeWithTag(5, value.minimum_loan_amount) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InitiateLoanData redact(InitiateLoanData value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.quick_loan_options, InitiateLoanData.QuickLoanOption.ADAPTER);
                InitiateLoanData.CustomLoanOption customLoanOption = value.custom_loan_option;
                InitiateLoanData.CustomLoanOption customLoanOption2 = customLoanOption != null ? (InitiateLoanData.CustomLoanOption) InitiateLoanData.CustomLoanOption.ADAPTER.redact(customLoanOption) : null;
                LocalizedString localizedString = value.title;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                LocalizedString localizedString3 = value.subtitle;
                LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                Money money = value.minimum_loan_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.maximum_loan_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                LocalizedString localizedString5 = value.primary_button_text;
                LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                Color color = value.tint_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new InitiateLoanData(m1169redactElements, customLoanOption2, localizedString2, localizedString4, money2, money4, localizedString6, color2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InitiateLoanData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Color.ADAPTER.encodeWithTag(writer, 8, value.tint_color);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 7, value.primary_button_text);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 6, value.maximum_loan_amount);
                protoAdapter3.encodeWithTag(writer, 5, value.minimum_loan_amount);
                protoAdapter2.encodeWithTag(writer, 4, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 3, value.title);
                InitiateLoanData.CustomLoanOption.ADAPTER.encodeWithTag(writer, 2, value.custom_loan_option);
                InitiateLoanData.QuickLoanOption.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.quick_loan_options);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateLoanData(List list, CustomLoanOption customLoanOption, LocalizedString localizedString, LocalizedString localizedString2, Money money, Money money2, LocalizedString localizedString3, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.custom_loan_option = customLoanOption;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.minimum_loan_amount = money;
        this.maximum_loan_amount = money2;
        this.primary_button_text = localizedString3;
        this.tint_color = color;
        this.quick_loan_options = TransactorKt.immutableCopyOf("quick_loan_options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateLoanData)) {
            return false;
        }
        InitiateLoanData initiateLoanData = (InitiateLoanData) obj;
        return Intrinsics.areEqual(unknownFields(), initiateLoanData.unknownFields()) && Intrinsics.areEqual(this.quick_loan_options, initiateLoanData.quick_loan_options) && Intrinsics.areEqual(this.custom_loan_option, initiateLoanData.custom_loan_option) && Intrinsics.areEqual(this.title, initiateLoanData.title) && Intrinsics.areEqual(this.subtitle, initiateLoanData.subtitle) && Intrinsics.areEqual(this.minimum_loan_amount, initiateLoanData.minimum_loan_amount) && Intrinsics.areEqual(this.maximum_loan_amount, initiateLoanData.maximum_loan_amount) && Intrinsics.areEqual(this.primary_button_text, initiateLoanData.primary_button_text) && Intrinsics.areEqual(this.tint_color, initiateLoanData.tint_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.quick_loan_options);
        CustomLoanOption customLoanOption = this.custom_loan_option;
        int hashCode = (m + (customLoanOption != null ? customLoanOption.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Money money = this.minimum_loan_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.maximum_loan_amount;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.primary_button_text;
        int hashCode6 = (hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        Color color = this.tint_color;
        int hashCode7 = hashCode6 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.quick_loan_options = this.quick_loan_options;
        builder.custom_loan_option = this.custom_loan_option;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.minimum_loan_amount = this.minimum_loan_amount;
        builder.maximum_loan_amount = this.maximum_loan_amount;
        builder.primary_button_text = this.primary_button_text;
        builder.tint_color = this.tint_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.quick_loan_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("quick_loan_options=", arrayList, this.quick_loan_options);
        }
        CustomLoanOption customLoanOption = this.custom_loan_option;
        if (customLoanOption != null) {
            arrayList.add("custom_loan_option=" + customLoanOption);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        Money money = this.minimum_loan_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("minimum_loan_amount=", money, arrayList);
        }
        Money money2 = this.maximum_loan_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("maximum_loan_amount=", money2, arrayList);
        }
        LocalizedString localizedString3 = this.primary_button_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("primary_button_text=", localizedString3, arrayList);
        }
        Color color = this.tint_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateLoanData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption$Builder;", "display_string", "Lcom/squareup/protos/cash/localization/LocalizedString;", "action_url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CustomLoanOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CustomLoanOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String action_url;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString display_string;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption;", "<init>", "()V", "display_string", "Lcom/squareup/protos/cash/localization/LocalizedString;", "action_url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String action_url;
            public LocalizedString display_string;

            public final Builder action_url(String action_url) {
                this.action_url = action_url;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public CustomLoanOption build() {
                return new CustomLoanOption(this.display_string, this.action_url, buildUnknownFields());
            }

            public final Builder display_string(LocalizedString display_string) {
                this.display_string = display_string;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CustomLoanOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.InitiateLoanData$CustomLoanOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InitiateLoanData.CustomLoanOption decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InitiateLoanData.CustomLoanOption((LocalizedString) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InitiateLoanData.CustomLoanOption value) {
                    writer.getClass();
                    value.getClass();
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.display_string);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.action_url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InitiateLoanData.CustomLoanOption value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.action_url) + LocalizedString.ADAPTER.encodedSizeWithTag(1, value.display_string) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InitiateLoanData.CustomLoanOption redact(InitiateLoanData.CustomLoanOption value) {
                    value.getClass();
                    LocalizedString localizedString = value.display_string;
                    return InitiateLoanData.CustomLoanOption.copy$default(value, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InitiateLoanData.CustomLoanOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.action_url);
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.display_string);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CustomLoanOption(LocalizedString localizedString, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CustomLoanOption copy$default(CustomLoanOption customLoanOption, LocalizedString localizedString, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = customLoanOption.display_string;
            }
            if ((i & 2) != 0) {
                str = customLoanOption.action_url;
            }
            if ((i & 4) != 0) {
                byteString = customLoanOption.unknownFields();
            }
            return customLoanOption.copy(localizedString, str, byteString);
        }

        public final CustomLoanOption copy(LocalizedString display_string, String action_url, ByteString unknownFields) {
            unknownFields.getClass();
            return new CustomLoanOption(display_string, action_url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CustomLoanOption)) {
                return false;
            }
            CustomLoanOption customLoanOption = (CustomLoanOption) other;
            return Intrinsics.areEqual(unknownFields(), customLoanOption.unknownFields()) && Intrinsics.areEqual(this.display_string, customLoanOption.display_string) && Intrinsics.areEqual(this.action_url, customLoanOption.action_url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.display_string;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            String str = this.action_url;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.display_string = this.display_string;
            builder.action_url = this.action_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.display_string;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("display_string=", localizedString, arrayList);
            }
            String str = this.action_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CustomLoanOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption$Builder;", "", "body", "Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/InitiateLoanData$CustomLoanOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CustomLoanOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CustomLoanOption() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomLoanOption(LocalizedString localizedString, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_string = localizedString;
            this.action_url = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption$Builder;", "amount", "Lcom/squareup/protos/common/Money;", "action_url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/common/Money;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class QuickLoanOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<QuickLoanOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String action_url;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 0, tag = 1)
        public final Money amount;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption;", "<init>", "()V", "amount", "Lcom/squareup/protos/common/Money;", "action_url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String action_url;
            public Money amount;

            public final Builder action_url(String action_url) {
                this.action_url = action_url;
                return this;
            }

            public final Builder amount(Money amount) {
                this.amount = amount;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public QuickLoanOption build() {
                return new QuickLoanOption(this.amount, this.action_url, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(QuickLoanOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.InitiateLoanData$QuickLoanOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InitiateLoanData.QuickLoanOption decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InitiateLoanData.QuickLoanOption((Money) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InitiateLoanData.QuickLoanOption value) {
                    writer.getClass();
                    value.getClass();
                    Money.ADAPTER.encodeWithTag(writer, 1, value.amount);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.action_url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InitiateLoanData.QuickLoanOption value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.action_url) + Money.ADAPTER.encodedSizeWithTag(1, value.amount) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InitiateLoanData.QuickLoanOption redact(InitiateLoanData.QuickLoanOption value) {
                    value.getClass();
                    Money money = value.amount;
                    return InitiateLoanData.QuickLoanOption.copy$default(value, money != null ? (Money) Money.ADAPTER.redact(money) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InitiateLoanData.QuickLoanOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.action_url);
                    Money.ADAPTER.encodeWithTag(writer, 1, value.amount);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ QuickLoanOption(Money money, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ QuickLoanOption copy$default(QuickLoanOption quickLoanOption, Money money, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                money = quickLoanOption.amount;
            }
            if ((i & 2) != 0) {
                str = quickLoanOption.action_url;
            }
            if ((i & 4) != 0) {
                byteString = quickLoanOption.unknownFields();
            }
            return quickLoanOption.copy(money, str, byteString);
        }

        public final QuickLoanOption copy(Money amount, String action_url, ByteString unknownFields) {
            unknownFields.getClass();
            return new QuickLoanOption(amount, action_url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof QuickLoanOption)) {
                return false;
            }
            QuickLoanOption quickLoanOption = (QuickLoanOption) other;
            return Intrinsics.areEqual(unknownFields(), quickLoanOption.unknownFields()) && Intrinsics.areEqual(this.amount, quickLoanOption.amount) && Intrinsics.areEqual(this.action_url, quickLoanOption.action_url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            String str = this.action_url;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.amount = this.amount;
            builder.action_url = this.action_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            String str = this.action_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "QuickLoanOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption$Builder;", "", "body", "Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/InitiateLoanData$QuickLoanOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ QuickLoanOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public QuickLoanOption() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickLoanOption(Money money, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
            this.action_url = str;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/InitiateLoanData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/InitiateLoanData$Builder;", "", "body", "Lcom/squareup/protos/lending/InitiateLoanData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/InitiateLoanData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InitiateLoanData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
