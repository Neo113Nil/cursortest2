package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker$Builder;", "", "prefilled_value", "Ljava/lang/String;", "amount_field_placeholder_key", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title_template", "Lcom/squareup/protos/cash/localization/LocalizedString;", "cta", "", "Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind;", "transfer_option_kinds", "Ljava/util/List;", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkTransferOption;", "link_transfer_options", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule;", "option_rules", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavingsTransferOptionPicker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsTransferOptionPicker> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String amount_field_placeholder_key;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 6, tag = 7)
    public final LocalizedString cta;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LinkTransferOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<LinkTransferOption> link_transfer_options;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PickerOptionRule#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<PickerOptionRule> option_rules;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String prefilled_value;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 5, tag = 6)
    public final LocalizedString title_template;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TransferOptionKind#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<TransferOptionKind> transfer_option_kinds;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "<init>", "()V", "transfer_option_kinds", "", "Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind;", "link_transfer_options", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkTransferOption;", "prefilled_value", "", "amount_field_placeholder_key", "option_rules", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule;", "title_template", "Lcom/squareup/protos/cash/localization/LocalizedString;", "cta", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String amount_field_placeholder_key;
        public LocalizedString cta;
        public List<LinkTransferOption> link_transfer_options;
        public List<PickerOptionRule> option_rules;
        public String prefilled_value;
        public LocalizedString title_template;
        public List<? extends TransferOptionKind> transfer_option_kinds;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.transfer_option_kinds = emptyList;
            this.link_transfer_options = emptyList;
            this.option_rules = emptyList;
        }

        public final Builder amount_field_placeholder_key(String amount_field_placeholder_key) {
            this.amount_field_placeholder_key = amount_field_placeholder_key;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SavingsTransferOptionPicker build() {
            return new SavingsTransferOptionPicker(this.transfer_option_kinds, this.link_transfer_options, this.prefilled_value, this.amount_field_placeholder_key, this.option_rules, this.title_template, this.cta, buildUnknownFields());
        }

        public final Builder cta(LocalizedString cta) {
            this.cta = cta;
            return this;
        }

        public final Builder link_transfer_options(List<LinkTransferOption> link_transfer_options) {
            link_transfer_options.getClass();
            TransactorKt.checkElementsNotNull(link_transfer_options);
            this.link_transfer_options = link_transfer_options;
            return this;
        }

        public final Builder option_rules(List<PickerOptionRule> option_rules) {
            option_rules.getClass();
            TransactorKt.checkElementsNotNull(option_rules);
            this.option_rules = option_rules;
            return this;
        }

        public final Builder prefilled_value(String prefilled_value) {
            this.prefilled_value = prefilled_value;
            return this;
        }

        public final Builder title_template(LocalizedString title_template) {
            this.title_template = title_template;
            return this;
        }

        public final Builder transfer_option_kinds(List<? extends TransferOptionKind> transfer_option_kinds) {
            transfer_option_kinds.getClass();
            TransactorKt.checkElementsNotNull(transfer_option_kinds);
            this.transfer_option_kinds = transfer_option_kinds;
            return this;
        }
    }

    static {
        SavingsTransferOptionPicker$Companion$ADAPTER$1 savingsTransferOptionPicker$Companion$ADAPTER$1 = new SavingsTransferOptionPicker$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsTransferOptionPicker.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.SavingsTransferOptionPicker", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = savingsTransferOptionPicker$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsTransferOptionPicker$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsTransferOptionPicker(List list, List list2, String str, String str2, List list3, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.prefilled_value = str;
        this.amount_field_placeholder_key = str2;
        this.title_template = localizedString;
        this.cta = localizedString2;
        this.transfer_option_kinds = TransactorKt.immutableCopyOf("transfer_option_kinds", list);
        this.link_transfer_options = TransactorKt.immutableCopyOf("link_transfer_options", list2);
        this.option_rules = TransactorKt.immutableCopyOf("option_rules", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsTransferOptionPicker)) {
            return false;
        }
        SavingsTransferOptionPicker savingsTransferOptionPicker = (SavingsTransferOptionPicker) obj;
        return Intrinsics.areEqual(unknownFields(), savingsTransferOptionPicker.unknownFields()) && Intrinsics.areEqual(this.transfer_option_kinds, savingsTransferOptionPicker.transfer_option_kinds) && Intrinsics.areEqual(this.link_transfer_options, savingsTransferOptionPicker.link_transfer_options) && Intrinsics.areEqual(this.prefilled_value, savingsTransferOptionPicker.prefilled_value) && Intrinsics.areEqual(this.amount_field_placeholder_key, savingsTransferOptionPicker.amount_field_placeholder_key) && Intrinsics.areEqual(this.option_rules, savingsTransferOptionPicker.option_rules) && Intrinsics.areEqual(this.title_template, savingsTransferOptionPicker.title_template) && Intrinsics.areEqual(this.cta, savingsTransferOptionPicker.cta);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.transfer_option_kinds), 37, this.link_transfer_options);
        String str = this.prefilled_value;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.amount_field_placeholder_key;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.option_rules);
        LocalizedString localizedString = this.title_template;
        int hashCode2 = (m2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.cta;
        int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.transfer_option_kinds = this.transfer_option_kinds;
        builder.link_transfer_options = this.link_transfer_options;
        builder.prefilled_value = this.prefilled_value;
        builder.amount_field_placeholder_key = this.amount_field_placeholder_key;
        builder.option_rules = this.option_rules;
        builder.title_template = this.title_template;
        builder.cta = this.cta;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.transfer_option_kinds.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("transfer_option_kinds=", arrayList, this.transfer_option_kinds);
        }
        if (!this.link_transfer_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("link_transfer_options=", arrayList, this.link_transfer_options);
        }
        String str = this.prefilled_value;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prefilled_value=", arrayList);
        }
        String str2 = this.amount_field_placeholder_key;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "amount_field_placeholder_key=", arrayList);
        }
        if (!this.option_rules.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("option_rules=", arrayList, this.option_rules);
        }
        LocalizedString localizedString = this.title_template;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title_template=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.cta;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("cta=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsTransferOptionPicker{", "}", 0, null, null, 56);
    }
}
