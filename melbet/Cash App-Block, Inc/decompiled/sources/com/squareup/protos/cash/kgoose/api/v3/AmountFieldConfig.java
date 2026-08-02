package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig$Builder;", "Lcom/squareup/protos/common/Money;", "prefilled_amount", "Lcom/squareup/protos/common/Money;", "min_amount", "max_amount", "Lcom/squareup/protos/cash/localization/LocalizedString;", "cta", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AmountFieldConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AmountFieldConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalizedString cta;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 2)
    public final Money max_amount;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 1)
    public final Money min_amount;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 0, tag = 3)
    public final Money prefilled_amount;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig;", "<init>", "()V", "prefilled_amount", "Lcom/squareup/protos/common/Money;", "min_amount", "max_amount", "cta", "Lcom/squareup/protos/cash/localization/LocalizedString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString cta;
        public Money max_amount;
        public Money min_amount;
        public Money prefilled_amount;

        @Override // com.squareup.wire.Message.Builder
        public AmountFieldConfig build() {
            return new AmountFieldConfig(this.prefilled_amount, this.min_amount, this.max_amount, this.cta, buildUnknownFields());
        }

        public final Builder cta(LocalizedString cta) {
            this.cta = cta;
            return this;
        }

        public final Builder max_amount(Money max_amount) {
            this.max_amount = max_amount;
            return this;
        }

        public final Builder min_amount(Money min_amount) {
            this.min_amount = min_amount;
            return this;
        }

        public final Builder prefilled_amount(Money prefilled_amount) {
            this.prefilled_amount = prefilled_amount;
            return this;
        }
    }

    static {
        AmountFieldConfig$Companion$ADAPTER$1 amountFieldConfig$Companion$ADAPTER$1 = new AmountFieldConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AmountFieldConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.AmountFieldConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = amountFieldConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(amountFieldConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountFieldConfig(Money money, Money money2, Money money3, LocalizedString localizedString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prefilled_amount = money;
        this.min_amount = money2;
        this.max_amount = money3;
        this.cta = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AmountFieldConfig)) {
            return false;
        }
        AmountFieldConfig amountFieldConfig = (AmountFieldConfig) obj;
        return Intrinsics.areEqual(unknownFields(), amountFieldConfig.unknownFields()) && Intrinsics.areEqual(this.prefilled_amount, amountFieldConfig.prefilled_amount) && Intrinsics.areEqual(this.min_amount, amountFieldConfig.min_amount) && Intrinsics.areEqual(this.max_amount, amountFieldConfig.max_amount) && Intrinsics.areEqual(this.cta, amountFieldConfig.cta);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.prefilled_amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.min_amount;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.max_amount;
        int hashCode4 = (hashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.cta;
        int hashCode5 = hashCode4 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.prefilled_amount = this.prefilled_amount;
        builder.min_amount = this.min_amount;
        builder.max_amount = this.max_amount;
        builder.cta = this.cta;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.prefilled_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("prefilled_amount=", money, arrayList);
        }
        Money money2 = this.min_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("min_amount=", money2, arrayList);
        }
        Money money3 = this.max_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("max_amount=", money3, arrayList);
        }
        LocalizedString localizedString = this.cta;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("cta=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AmountFieldConfig{", "}", 0, null, null, 56);
    }
}
