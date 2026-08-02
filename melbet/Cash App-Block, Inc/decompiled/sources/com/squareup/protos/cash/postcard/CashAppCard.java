package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.core.DisputeClaim$Reason;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.protos.wire.roster.mds.UnitCapabilities;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashAppCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppCard> CREATOR;
    public final Boolean activated;
    public final String apple_pay_description;
    public final String apple_pay_identifier;
    public final String card_theme_token;
    public final String card_token;
    public final CardType card_type;
    public final String cardholder_name;
    public final String customization_image_path;
    public final Boolean enabled;
    public final ExternalIssuingAccountState externalIssuingAccountState;
    public final Boolean isCardExpired;
    public final String last_four;
    public final PaymentMethod payment_method;
    public final PhysicalCardOrderState physical_card_order_state;
    public final Boolean sponsor_locked;
    public final String version_token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable activated;
        public Object apple_pay_description;
        public Object apple_pay_identifier;
        public Serializable card_theme_token;
        public Object card_token;
        public Object card_type;
        public Object cardholder_name;
        public Object customization_image_path;
        public Serializable enabled;
        public Object externalIssuingAccountState;
        public Object isCardExpired;
        public Serializable last_four;
        public Object payment_method;
        public Object physical_card_order_state;
        public Object sponsor_locked;
        public Object version_token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CashAppCard((String) this.card_token, (String) this.version_token, (String) this.last_four, (String) this.cardholder_name, (Boolean) this.enabled, (Boolean) this.sponsor_locked, (String) this.apple_pay_identifier, (String) this.apple_pay_description, (CardType) this.card_type, (PhysicalCardOrderState) this.physical_card_order_state, (Boolean) this.activated, (String) this.card_theme_token, (ExternalIssuingAccountState) this.externalIssuingAccountState, (Boolean) this.isCardExpired, (PaymentMethod) this.payment_method, (String) this.customization_image_path, buildUnknownFields());
                case 1:
                    return new DisputedTransactionRenderData.DisputedCapture.DisputeCase((Long) this.version_token, (Money) this.last_four, (DisputeClaim$Reason) this.cardholder_name, (Long) this.apple_pay_identifier, (Long) this.apple_pay_description, (Money) this.card_theme_token, (Long) this.customization_image_path, (Money) this.enabled, (Long) this.sponsor_locked, (Money) this.activated, (Long) this.isCardExpired, (String) this.card_token, (DisputedTransactionRenderData.DisputedCapture.DisputeCase.State) this.card_type, (DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason) this.physical_card_order_state, (DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason) this.externalIssuingAccountState, (Long) this.payment_method, buildUnknownFields());
                default:
                    return new UnitCapabilities((Long) this.card_token, (Long) this.version_token, (Long) this.last_four, (Long) this.cardholder_name, (Long) this.apple_pay_identifier, (Long) this.apple_pay_description, (Long) this.card_theme_token, (Long) this.customization_image_path, (Long) this.enabled, (Long) this.sponsor_locked, (Long) this.activated, (Long) this.isCardExpired, (Long) this.card_type, (Long) this.physical_card_order_state, (Long) this.externalIssuingAccountState, (Long) this.payment_method, buildUnknownFields());
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum CardType implements WireEnum {
        CARD_TYPE_UNSPECIFIED(0),
        PHYSICAL(1),
        VIRTUAL(2);

        public static final CashAppCard$CardType$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            CardType cardType = CARD_TYPE_UNSPECIFIED;
            Companion = new ActionType.Companion();
            ADAPTER = new CashAppCard$CardType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CardType.class), Syntax.PROTO_2, cardType);
        }

        CardType(int i) {
            this.value = i;
        }

        public static final CardType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CARD_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return PHYSICAL;
            }
            if (i != 2) {
                return null;
            }
            return VIRTUAL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum ExternalIssuingAccountState implements WireEnum {
        EXTERNAL_ISSUING_ACCOUNT_STATE_UNSPECIFIED(0),
        ACTIVE(1),
        SUSPENDED(2);

        public static final CashAppCard$ExternalIssuingAccountState$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            ExternalIssuingAccountState externalIssuingAccountState = EXTERNAL_ISSUING_ACCOUNT_STATE_UNSPECIFIED;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new CashAppCard$ExternalIssuingAccountState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ExternalIssuingAccountState.class), Syntax.PROTO_2, externalIssuingAccountState);
        }

        ExternalIssuingAccountState(int i) {
            this.value = i;
        }

        public static final ExternalIssuingAccountState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return EXTERNAL_ISSUING_ACCOUNT_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return ACTIVE;
            }
            if (i != 2) {
                return null;
            }
            return SUSPENDED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum PaymentMethod implements WireEnum {
        PAYMENT_METHOD_UNSPECIFIED(0),
        PREPAID(1),
        DEBIT_FLEX(2);

        public static final CashAppCard$PaymentMethod$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            PaymentMethod paymentMethod = PAYMENT_METHOD_UNSPECIFIED;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new CashAppCard$PaymentMethod$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentMethod.class), Syntax.PROTO_2, paymentMethod);
        }

        PaymentMethod(int i) {
            this.value = i;
        }

        public static final PaymentMethod fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return PAYMENT_METHOD_UNSPECIFIED;
            }
            if (i == 1) {
                return PREPAID;
            }
            if (i != 2) {
                return null;
            }
            return DEBIT_FLEX;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum PhysicalCardOrderState implements WireEnum {
        STATE_UNSPECIFIED(0),
        NO_CARD(1),
        PENDING_SHIPMENT(2),
        PENDING_ACTIVATION(3),
        ACTIVATED(4);

        public static final CashAppCard$PhysicalCardOrderState$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            PhysicalCardOrderState physicalCardOrderState = STATE_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new CashAppCard$PhysicalCardOrderState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PhysicalCardOrderState.class), Syntax.PROTO_2, physicalCardOrderState);
        }

        PhysicalCardOrderState(int i) {
            this.value = i;
        }

        public static final PhysicalCardOrderState fromValue(int i) {
            Companion.getClass();
            return TextSize.Companion.m3919fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppCard$Companion$ADAPTER$1 cashAppCard$Companion$ADAPTER$1 = new CashAppCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppCard.class), "type.googleapis.com/squareup.cash.postcard.CashAppCard", Syntax.PROTO_2, null, "squareup/cash/postcard/CashAppCard.proto");
        ADAPTER = cashAppCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppCard(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, String str6, CardType cardType, PhysicalCardOrderState physicalCardOrderState, Boolean bool3, String str7, ExternalIssuingAccountState externalIssuingAccountState, Boolean bool4, PaymentMethod paymentMethod, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_token = str;
        this.version_token = str2;
        this.last_four = str3;
        this.cardholder_name = str4;
        this.enabled = bool;
        this.sponsor_locked = bool2;
        this.apple_pay_identifier = str5;
        this.apple_pay_description = str6;
        this.card_type = cardType;
        this.physical_card_order_state = physicalCardOrderState;
        this.activated = bool3;
        this.card_theme_token = str7;
        this.externalIssuingAccountState = externalIssuingAccountState;
        this.isCardExpired = bool4;
        this.payment_method = paymentMethod;
        this.customization_image_path = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppCard)) {
            return false;
        }
        CashAppCard cashAppCard = (CashAppCard) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppCard.unknownFields()) && Intrinsics.areEqual(this.card_token, cashAppCard.card_token) && Intrinsics.areEqual(this.version_token, cashAppCard.version_token) && Intrinsics.areEqual(this.last_four, cashAppCard.last_four) && Intrinsics.areEqual(this.cardholder_name, cashAppCard.cardholder_name) && Intrinsics.areEqual(this.enabled, cashAppCard.enabled) && Intrinsics.areEqual(this.sponsor_locked, cashAppCard.sponsor_locked) && Intrinsics.areEqual(this.apple_pay_identifier, cashAppCard.apple_pay_identifier) && Intrinsics.areEqual(this.apple_pay_description, cashAppCard.apple_pay_description) && this.card_type == cashAppCard.card_type && this.physical_card_order_state == cashAppCard.physical_card_order_state && Intrinsics.areEqual(this.activated, cashAppCard.activated) && Intrinsics.areEqual(this.card_theme_token, cashAppCard.card_theme_token) && this.externalIssuingAccountState == cashAppCard.externalIssuingAccountState && Intrinsics.areEqual(this.isCardExpired, cashAppCard.isCardExpired) && this.payment_method == cashAppCard.payment_method && Intrinsics.areEqual(this.customization_image_path, cashAppCard.customization_image_path);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.card_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.version_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.last_four;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cardholder_name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.sponsor_locked;
        int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str5 = this.apple_pay_identifier;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.apple_pay_description;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        CardType cardType = this.card_type;
        int hashCode10 = (hashCode9 + (cardType != null ? cardType.hashCode() : 0)) * 37;
        PhysicalCardOrderState physicalCardOrderState = this.physical_card_order_state;
        int hashCode11 = (hashCode10 + (physicalCardOrderState != null ? physicalCardOrderState.hashCode() : 0)) * 37;
        Boolean bool3 = this.activated;
        int hashCode12 = (hashCode11 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        String str7 = this.card_theme_token;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 37;
        ExternalIssuingAccountState externalIssuingAccountState = this.externalIssuingAccountState;
        int hashCode14 = (hashCode13 + (externalIssuingAccountState != null ? externalIssuingAccountState.hashCode() : 0)) * 37;
        Boolean bool4 = this.isCardExpired;
        int hashCode15 = (hashCode14 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        PaymentMethod paymentMethod = this.payment_method;
        int hashCode16 = (hashCode15 + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 37;
        String str8 = this.customization_image_path;
        int hashCode17 = hashCode16 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = hashCode17;
        return hashCode17;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.card_token = this.card_token;
        builder.version_token = this.version_token;
        builder.last_four = this.last_four;
        builder.cardholder_name = this.cardholder_name;
        builder.enabled = this.enabled;
        builder.sponsor_locked = this.sponsor_locked;
        builder.apple_pay_identifier = this.apple_pay_identifier;
        builder.apple_pay_description = this.apple_pay_description;
        builder.card_type = this.card_type;
        builder.physical_card_order_state = this.physical_card_order_state;
        builder.activated = this.activated;
        builder.card_theme_token = this.card_theme_token;
        builder.externalIssuingAccountState = this.externalIssuingAccountState;
        builder.isCardExpired = this.isCardExpired;
        builder.payment_method = this.payment_method;
        builder.customization_image_path = this.customization_image_path;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.card_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_token=", arrayList);
        }
        String str2 = this.version_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "version_token=", arrayList);
        }
        if (this.last_four != null) {
            arrayList.add("last_four=██");
        }
        if (this.cardholder_name != null) {
            arrayList.add("cardholder_name=██");
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        Boolean bool2 = this.sponsor_locked;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sponsor_locked=", bool2, arrayList);
        }
        String str3 = this.apple_pay_identifier;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "apple_pay_identifier=", arrayList);
        }
        String str4 = this.apple_pay_description;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "apple_pay_description=", arrayList);
        }
        CardType cardType = this.card_type;
        if (cardType != null) {
            arrayList.add("card_type=" + cardType);
        }
        PhysicalCardOrderState physicalCardOrderState = this.physical_card_order_state;
        if (physicalCardOrderState != null) {
            arrayList.add("physical_card_order_state=" + physicalCardOrderState);
        }
        Boolean bool3 = this.activated;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("activated=", bool3, arrayList);
        }
        String str5 = this.card_theme_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "card_theme_token=", arrayList);
        }
        ExternalIssuingAccountState externalIssuingAccountState = this.externalIssuingAccountState;
        if (externalIssuingAccountState != null) {
            arrayList.add("externalIssuingAccountState=" + externalIssuingAccountState);
        }
        Boolean bool4 = this.isCardExpired;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("isCardExpired=", bool4, arrayList);
        }
        PaymentMethod paymentMethod = this.payment_method;
        if (paymentMethod != null) {
            arrayList.add("payment_method=" + paymentMethod);
        }
        String str6 = this.customization_image_path;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "customization_image_path=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppCard{", "}", 0, null, null, 56);
    }
}
