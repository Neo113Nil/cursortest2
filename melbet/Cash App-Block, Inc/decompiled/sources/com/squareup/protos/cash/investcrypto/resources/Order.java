package com.squareup.protos.cash.investcrypto.resources;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.GetC4bEligibilityResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.common.Money;
import com.squareup.protos.consentsys.service.CopyParameters;
import com.squareup.protos.franklin.investing.resources.CustomOrder;
import com.squareup.protos.rewardly.ui.UiReward;
import com.squareup.protos.teamapp.ui.Link;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Order> CREATOR;
    public final Long creation_epoch_ms;
    public final Money crypto_amount;
    public final String crypto_instrument_token;
    public final Money current_price;
    public final String customer_token;
    public final Long expiration_epoch_ms;
    public final Feature feature;
    public final FeatureMetadata feature_metadata;
    public final Money fee;
    public final FeeStrategy fee_strategy;
    public final Money fiat_amount;
    public final String fiat_instrument_token;
    public final Money final_price;
    public final FundingSource funding_source;
    public final String funding_transaction_token;
    public final String idempotence_token;
    public final Double incorporated_spread_bps;
    public final OrderSponsorship order_sponsorship;
    public final Origin origin;
    public final Money original_price;
    public final Double price_spread_bps;
    public final PriceStrategy price_strategy;
    public final String push_transaction_token;
    public final RecurringSchedule recurring_schedule;
    public final Money reference_price;
    public final OrderSide side;
    public final String source_instrument_token;
    public final Money source_money;
    public final String source_transaction_token;
    public final Money spread_price_fee;
    public final OrderState state;
    public final String target_instrument_token;
    public final Money target_money;
    public final Money target_price;
    public final String target_transaction_token;
    public final String token;
    public final TradingModel trading_model;

    /* renamed from: type, reason: collision with root package name */
    public final OrderType f1280type;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable creation_epoch_ms;
        public AndroidMessage crypto_amount;
        public Serializable crypto_instrument_token;
        public AndroidMessage current_price;
        public Serializable customer_token;
        public Long expiration_epoch_ms;
        public Serializable feature;
        public AndroidMessage feature_metadata;
        public AndroidMessage fee;
        public Serializable fee_strategy;
        public AndroidMessage fiat_amount;
        public Serializable fiat_instrument_token;
        public AndroidMessage final_price;
        public AndroidMessage funding_source;
        public Serializable funding_transaction_token;
        public Serializable idempotence_token;
        public Serializable incorporated_spread_bps;
        public AndroidMessage order_sponsorship;
        public Serializable origin;
        public AndroidMessage original_price;
        public Serializable price_spread_bps;
        public Serializable price_strategy;
        public Serializable push_transaction_token;
        public AndroidMessage recurring_schedule;
        public AndroidMessage reference_price;
        public Serializable side;
        public Serializable source_instrument_token;
        public AndroidMessage source_money;
        public Serializable source_transaction_token;
        public AndroidMessage spread_price_fee;
        public Serializable state;
        public Serializable target_instrument_token;
        public AndroidMessage target_money;
        public AndroidMessage target_price;
        public Serializable target_transaction_token;
        public String token;
        public Serializable trading_model;

        /* renamed from: type, reason: collision with root package name */
        public Serializable f1281type;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Order(this.token, (OrderSide) this.side, (OrderType) this.f1281type, (OrderState) this.state, (Money) this.crypto_amount, (Money) this.fiat_amount, (Money) this.fee, (FeeStrategy) this.fee_strategy, (Money) this.current_price, (Money) this.target_price, (Money) this.original_price, this.expiration_epoch_ms, (Money) this.final_price, (String) this.fiat_instrument_token, (String) this.crypto_instrument_token, (String) this.funding_transaction_token, (String) this.customer_token, (Long) this.creation_epoch_ms, (Origin) this.origin, (Feature) this.feature, (String) this.idempotence_token, (RecurringSchedule) this.recurring_schedule, (String) this.push_transaction_token, (Money) this.source_money, (Money) this.target_money, (String) this.source_instrument_token, (String) this.target_instrument_token, (String) this.source_transaction_token, (String) this.target_transaction_token, (Money) this.reference_price, (Money) this.spread_price_fee, (PriceStrategy) this.price_strategy, (FeatureMetadata) this.feature_metadata, (Double) this.price_spread_bps, (Double) this.incorporated_spread_bps, (OrderSponsorship) this.order_sponsorship, (FundingSource) this.funding_source, (TradingModel) this.trading_model, buildUnknownFields());
                default:
                    return new GetC4bEligibilityResponse(this.token, this.expiration_epoch_ms, (C4bEligibilityState) this.fiat_instrument_token, (C4bEligibilityState) this.crypto_instrument_token, (C4bEligibilityState) this.funding_transaction_token, (C4bEligibilityState) this.customer_token, (C4bEligibilityState) this.idempotence_token, (C4bEligibilityState) this.push_transaction_token, (C4bEligibilityState) this.source_instrument_token, (C4bEligibilityState) this.target_instrument_token, (C4bEligibilityState) this.source_transaction_token, (C4bEligibilityState) this.target_transaction_token, (C4bEligibilityState) this.side, (C4bEligibilityState) this.f1281type, (C4bEligibilityState) this.state, (C4bEligibilityState) this.crypto_amount, (C4bEligibilityState) this.fiat_amount, (C4bEligibilityState) this.fee, (C4bEligibilityState) this.current_price, (C4bEligibilityState) this.target_price, (C4bEligibilityState) this.original_price, (C4bEligibilityState) this.final_price, (C4bEligibilityState) this.source_money, (C4bEligibilityState) this.target_money, (C4bEligibilityState) this.reference_price, (C4bEligibilityState) this.spread_price_fee, (C4bEligibilityState) this.fee_strategy, (C4bEligibilityState) this.creation_epoch_ms, (C4bEligibilityState) this.origin, (C4bEligibilityState) this.feature, (C4bEligibilityState) this.recurring_schedule, (C4bEligibilityState) this.price_strategy, (C4bEligibilityState) this.feature_metadata, (C4bEligibilityState) this.price_spread_bps, (C4bEligibilityState) this.incorporated_spread_bps, (C4bEligibilityState) this.order_sponsorship, (C4bEligibilityState) this.funding_source, (C4bEligibilityState) this.trading_model, buildUnknownFields());
            }
        }
    }

    public final class CustomOrderConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CustomOrderConfiguration> CREATOR;
        public final Money original_share_price;
        public final String period_token;
        public final Money target_share_price;

        static {
            Order$CustomOrderConfiguration$Companion$ADAPTER$1 order$CustomOrderConfiguration$Companion$ADAPTER$1 = new Order$CustomOrderConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomOrderConfiguration.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.CustomOrderConfiguration", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
            ADAPTER = order$CustomOrderConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(order$CustomOrderConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomOrderConfiguration(Money money, Money money2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.period_token = str;
            this.original_share_price = money;
            this.target_share_price = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomOrderConfiguration)) {
                return false;
            }
            CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), customOrderConfiguration.unknownFields()) && Intrinsics.areEqual(this.period_token, customOrderConfiguration.period_token) && Intrinsics.areEqual(this.original_share_price, customOrderConfiguration.original_share_price) && Intrinsics.areEqual(this.target_share_price, customOrderConfiguration.target_share_price);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.period_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.original_share_price;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.target_share_price;
            int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CustomOrder.Builder builder = new CustomOrder.Builder(1);
            builder.period_token = this.period_token;
            builder.original_share_price = this.original_share_price;
            builder.target_share_price = this.target_share_price;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.period_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "period_token=", arrayList);
            }
            Money money = this.original_share_price;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("original_share_price=", money, arrayList);
            }
            Money money2 = this.target_share_price;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("target_share_price=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CustomOrderConfiguration{", "}", 0, null, null, 56);
        }
    }

    public enum Feature implements WireEnum {
        MANUAL(1),
        MANUAL_RECURRING(2),
        CASH_CARD_BOOST(3),
        P2P_GIFTING(4),
        PAYROLL_CONVERSION(5),
        CASH_CARD_ROUND_UP(6),
        SQUARE_BITCOIN_SAVINGS(7),
        CANCELED_SPONSORSHIP(8),
        REVERSAL(9),
        BITKEY_TRANSFER(10),
        USD_ON_LN_PAYMENT(11),
        BTC_CARD_SPEND(12),
        ACH_CLAWBACK(13),
        BITCOIN_MODE_REWARD(14),
        P2P_RECEIVE(15),
        P2P_SEND(16),
        BTC_FUNDED_ACH(17);

        public final int value;
        public static final ContactAliasType.Companion Companion = new ContactAliasType.Companion();
        public static final Order$Feature$Companion$ADAPTER$1 ADAPTER = new Order$Feature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Feature.class), Syntax.PROTO_2, null);

        Feature(int i) {
            this.value = i;
        }

        public static final Feature fromValue(int i) {
            Companion.getClass();
            return ContactAliasType.Companion.m3889fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class FeatureMetadata extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FeatureMetadata> CREATOR;
        public final MediaStoreUtil metadata;

        public final class CanceledSponsorshipMetadata extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CanceledSponsorshipMetadata> CREATOR;
            public final String dependent_customer_token;
            public final String sponsor_customer_token;

            static {
                Order$FeatureMetadata$CanceledSponsorshipMetadata$Companion$ADAPTER$1 order$FeatureMetadata$CanceledSponsorshipMetadata$Companion$ADAPTER$1 = new Order$FeatureMetadata$CanceledSponsorshipMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CanceledSponsorshipMetadata.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.FeatureMetadata.CanceledSponsorshipMetadata", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
                ADAPTER = order$FeatureMetadata$CanceledSponsorshipMetadata$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(order$FeatureMetadata$CanceledSponsorshipMetadata$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CanceledSponsorshipMetadata(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.sponsor_customer_token = str;
                this.dependent_customer_token = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CanceledSponsorshipMetadata)) {
                    return false;
                }
                CanceledSponsorshipMetadata canceledSponsorshipMetadata = (CanceledSponsorshipMetadata) obj;
                return Intrinsics.areEqual(unknownFields(), canceledSponsorshipMetadata.unknownFields()) && Intrinsics.areEqual(this.sponsor_customer_token, canceledSponsorshipMetadata.sponsor_customer_token) && Intrinsics.areEqual(this.dependent_customer_token, canceledSponsorshipMetadata.dependent_customer_token);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.sponsor_customer_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.dependent_customer_token;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                FullName.Builder builder = new FullName.Builder(8);
                builder.given_name = this.sponsor_customer_token;
                builder.family_name = this.dependent_customer_token;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.sponsor_customer_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sponsor_customer_token=", arrayList);
                }
                String str2 = this.dependent_customer_token;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dependent_customer_token=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CanceledSponsorshipMetadata{", "}", 0, null, null, 56);
            }
        }

        public final class P2pReceiveMetadata extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<P2pReceiveMetadata> CREATOR;
            public final Integer conversion_bps;
            public final Money payment_amount;
            public final String payment_id;
            public final String sender_customer_token;
            public final String sender_display_name;

            static {
                Order$FeatureMetadata$P2pReceiveMetadata$Companion$ADAPTER$1 order$FeatureMetadata$P2pReceiveMetadata$Companion$ADAPTER$1 = new Order$FeatureMetadata$P2pReceiveMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2pReceiveMetadata.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.FeatureMetadata.P2pReceiveMetadata", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
                ADAPTER = order$FeatureMetadata$P2pReceiveMetadata$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(order$FeatureMetadata$P2pReceiveMetadata$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public P2pReceiveMetadata(String str, String str2, Integer num, Money money, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.sender_display_name = str;
                this.payment_id = str2;
                this.conversion_bps = num;
                this.payment_amount = money;
                this.sender_customer_token = str3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof P2pReceiveMetadata)) {
                    return false;
                }
                P2pReceiveMetadata p2pReceiveMetadata = (P2pReceiveMetadata) obj;
                return Intrinsics.areEqual(unknownFields(), p2pReceiveMetadata.unknownFields()) && Intrinsics.areEqual(this.sender_display_name, p2pReceiveMetadata.sender_display_name) && Intrinsics.areEqual(this.payment_id, p2pReceiveMetadata.payment_id) && Intrinsics.areEqual(this.conversion_bps, p2pReceiveMetadata.conversion_bps) && Intrinsics.areEqual(this.payment_amount, p2pReceiveMetadata.payment_amount) && Intrinsics.areEqual(this.sender_customer_token, p2pReceiveMetadata.sender_customer_token);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.sender_display_name;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.payment_id;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Integer num = this.conversion_bps;
                int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                Money money = this.payment_amount;
                int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
                String str3 = this.sender_customer_token;
                int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Text.Builder builder = new Text.Builder(17);
                builder.text = this.sender_display_name;
                builder.text_style = this.payment_id;
                builder.text_decoration = this.conversion_bps;
                builder.text_color = this.payment_amount;
                builder.icon = this.sender_customer_token;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.sender_display_name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sender_display_name=", arrayList);
                }
                String str2 = this.payment_id;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "payment_id=", arrayList);
                }
                Integer num = this.conversion_bps;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("conversion_bps=", num, arrayList);
                }
                Money money = this.payment_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("payment_amount=", money, arrayList);
                }
                String str3 = this.sender_customer_token;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "sender_customer_token=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "P2pReceiveMetadata{", "}", 0, null, null, 56);
            }
        }

        public final class PaycheckConversionMetadata extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PaycheckConversionMetadata> CREATOR;
            public final String allocation_token;
            public final Integer basis_points;
            public final String paycheck_transaction_token;

            static {
                Order$FeatureMetadata$PaycheckConversionMetadata$Companion$ADAPTER$1 order$FeatureMetadata$PaycheckConversionMetadata$Companion$ADAPTER$1 = new Order$FeatureMetadata$PaycheckConversionMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaycheckConversionMetadata.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.FeatureMetadata.PaycheckConversionMetadata", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
                ADAPTER = order$FeatureMetadata$PaycheckConversionMetadata$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(order$FeatureMetadata$PaycheckConversionMetadata$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaycheckConversionMetadata(String str, Integer num, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.allocation_token = str;
                this.basis_points = num;
                this.paycheck_transaction_token = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PaycheckConversionMetadata)) {
                    return false;
                }
                PaycheckConversionMetadata paycheckConversionMetadata = (PaycheckConversionMetadata) obj;
                return Intrinsics.areEqual(unknownFields(), paycheckConversionMetadata.unknownFields()) && Intrinsics.areEqual(this.allocation_token, paycheckConversionMetadata.allocation_token) && Intrinsics.areEqual(this.basis_points, paycheckConversionMetadata.basis_points) && Intrinsics.areEqual(this.paycheck_transaction_token, paycheckConversionMetadata.paycheck_transaction_token);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.allocation_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Integer num = this.basis_points;
                int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                String str2 = this.paycheck_transaction_token;
                int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CopyParameters.Builder builder = new CopyParameters.Builder(1);
                builder.copy_group_token = this.allocation_token;
                builder.version = this.basis_points;
                builder.locale = this.paycheck_transaction_token;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.allocation_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "allocation_token=", arrayList);
                }
                Integer num = this.basis_points;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("basis_points=", num, arrayList);
                }
                String str2 = this.paycheck_transaction_token;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "paycheck_transaction_token=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PaycheckConversionMetadata{", "}", 0, null, null, 56);
            }
        }

        public final class ReversalMetadata extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ReversalMetadata> CREATOR;
            public final String original_order_token;

            static {
                Order$FeatureMetadata$ReversalMetadata$Companion$ADAPTER$1 order$FeatureMetadata$ReversalMetadata$Companion$ADAPTER$1 = new Order$FeatureMetadata$ReversalMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReversalMetadata.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.FeatureMetadata.ReversalMetadata", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
                ADAPTER = order$FeatureMetadata$ReversalMetadata$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(order$FeatureMetadata$ReversalMetadata$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReversalMetadata(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.original_order_token = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ReversalMetadata)) {
                    return false;
                }
                ReversalMetadata reversalMetadata = (ReversalMetadata) obj;
                return Intrinsics.areEqual(unknownFields(), reversalMetadata.unknownFields()) && Intrinsics.areEqual(this.original_order_token, reversalMetadata.original_order_token);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.original_order_token;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Favorite.Builder builder = new Favorite.Builder(23);
                builder.favorite_customer_token = this.original_order_token;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.original_order_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "original_order_token=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ReversalMetadata{", "}", 0, null, null, 56);
            }
        }

        public final class UsdOnLnPaymentMetadata extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<UsdOnLnPaymentMetadata> CREATOR;
            public final String lightning_withdraw_token;
            public final String merchant_token;
            public final Boolean skip_order_confirmation;

            static {
                Order$FeatureMetadata$UsdOnLnPaymentMetadata$Companion$ADAPTER$1 order$FeatureMetadata$UsdOnLnPaymentMetadata$Companion$ADAPTER$1 = new Order$FeatureMetadata$UsdOnLnPaymentMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UsdOnLnPaymentMetadata.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.FeatureMetadata.UsdOnLnPaymentMetadata", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
                ADAPTER = order$FeatureMetadata$UsdOnLnPaymentMetadata$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(order$FeatureMetadata$UsdOnLnPaymentMetadata$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UsdOnLnPaymentMetadata(Boolean bool, String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.lightning_withdraw_token = str;
                this.skip_order_confirmation = bool;
                this.merchant_token = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof UsdOnLnPaymentMetadata)) {
                    return false;
                }
                UsdOnLnPaymentMetadata usdOnLnPaymentMetadata = (UsdOnLnPaymentMetadata) obj;
                return Intrinsics.areEqual(unknownFields(), usdOnLnPaymentMetadata.unknownFields()) && Intrinsics.areEqual(this.lightning_withdraw_token, usdOnLnPaymentMetadata.lightning_withdraw_token) && Intrinsics.areEqual(this.skip_order_confirmation, usdOnLnPaymentMetadata.skip_order_confirmation) && Intrinsics.areEqual(this.merchant_token, usdOnLnPaymentMetadata.merchant_token);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.lightning_withdraw_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Boolean bool = this.skip_order_confirmation;
                int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                String str2 = this.merchant_token;
                int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Link.Builder builder = new Link.Builder(1);
                builder.web_url = this.lightning_withdraw_token;
                builder.web_url_hides_navigation = this.skip_order_confirmation;
                builder.deep_link = this.merchant_token;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.lightning_withdraw_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "lightning_withdraw_token=", arrayList);
                }
                Boolean bool = this.skip_order_confirmation;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_order_confirmation=", bool, arrayList);
                }
                String str2 = this.merchant_token;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_token=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "UsdOnLnPaymentMetadata{", "}", 0, null, null, 56);
            }
        }

        static {
            Order$FeatureMetadata$Companion$ADAPTER$1 order$FeatureMetadata$Companion$ADAPTER$1 = new Order$FeatureMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FeatureMetadata.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.FeatureMetadata", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
            ADAPTER = order$FeatureMetadata$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(order$FeatureMetadata$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeatureMetadata(MediaStoreUtil mediaStoreUtil, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = mediaStoreUtil;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureMetadata)) {
                return false;
            }
            FeatureMetadata featureMetadata = (FeatureMetadata) obj;
            return Intrinsics.areEqual(unknownFields(), featureMetadata.unknownFields()) && Intrinsics.areEqual(this.metadata, featureMetadata.metadata);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            MediaStoreUtil mediaStoreUtil = this.metadata;
            int hashCode2 = hashCode + (mediaStoreUtil != null ? mediaStoreUtil.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GroupParticipant.Builder builder = new GroupParticipant.Builder(7);
            builder.f1276type = this.metadata;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            MediaStoreUtil mediaStoreUtil = this.metadata;
            if (mediaStoreUtil != null) {
                arrayList.add("metadata=" + mediaStoreUtil);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FeatureMetadata{", "}", 0, null, null, 56);
        }
    }

    public final class FundingSource extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FundingSource> CREATOR;
        public final Money cash_in_amount;
        public final String cash_in_instrument_token;
        public final CashInInstrumentType cash_in_instrument_type;
        public final Money restricted_amount;
        public final Money restricted_fee;
        public final Money restricted_source_amount;
        public final String restricted_source_instrument_token;
        public final String restricted_source_transaction_token;
        public final Money restricted_target_amount;
        public final String restricted_target_instrument_token;
        public final String restricted_target_transaction_token;
        public final TransactionOrchestrator transaction_orchestrator;
        public final Money unrestricted_amount;
        public final Money unrestricted_fee;
        public final Money unrestricted_source_amount;
        public final String unrestricted_source_instrument_token;
        public final String unrestricted_source_transaction_token;
        public final Money unrestricted_target_amount;
        public final String unrestricted_target_instrument_token;
        public final String unrestricted_target_transaction_token;

        static {
            Order$FundingSource$Companion$ADAPTER$1 order$FundingSource$Companion$ADAPTER$1 = new Order$FundingSource$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FundingSource.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.FundingSource", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
            ADAPTER = order$FundingSource$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(order$FundingSource$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingSource(Money money, String str, CashInInstrumentType cashInInstrumentType, Money money2, String str2, String str3, String str4, String str5, Money money3, String str6, String str7, String str8, String str9, Money money4, Money money5, Money money6, Money money7, Money money8, Money money9, TransactionOrchestrator transactionOrchestrator, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cash_in_amount = money;
            this.cash_in_instrument_token = str;
            this.cash_in_instrument_type = cashInInstrumentType;
            this.unrestricted_amount = money2;
            this.unrestricted_source_instrument_token = str2;
            this.unrestricted_source_transaction_token = str3;
            this.unrestricted_target_instrument_token = str4;
            this.unrestricted_target_transaction_token = str5;
            this.restricted_amount = money3;
            this.restricted_source_instrument_token = str6;
            this.restricted_source_transaction_token = str7;
            this.restricted_target_instrument_token = str8;
            this.restricted_target_transaction_token = str9;
            this.unrestricted_fee = money4;
            this.restricted_fee = money5;
            this.unrestricted_source_amount = money6;
            this.unrestricted_target_amount = money7;
            this.restricted_source_amount = money8;
            this.restricted_target_amount = money9;
            this.transaction_orchestrator = transactionOrchestrator;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FundingSource)) {
                return false;
            }
            FundingSource fundingSource = (FundingSource) obj;
            return Intrinsics.areEqual(unknownFields(), fundingSource.unknownFields()) && Intrinsics.areEqual(this.cash_in_amount, fundingSource.cash_in_amount) && Intrinsics.areEqual(this.cash_in_instrument_token, fundingSource.cash_in_instrument_token) && this.cash_in_instrument_type == fundingSource.cash_in_instrument_type && Intrinsics.areEqual(this.unrestricted_amount, fundingSource.unrestricted_amount) && Intrinsics.areEqual(this.unrestricted_source_instrument_token, fundingSource.unrestricted_source_instrument_token) && Intrinsics.areEqual(this.unrestricted_source_transaction_token, fundingSource.unrestricted_source_transaction_token) && Intrinsics.areEqual(this.unrestricted_target_instrument_token, fundingSource.unrestricted_target_instrument_token) && Intrinsics.areEqual(this.unrestricted_target_transaction_token, fundingSource.unrestricted_target_transaction_token) && Intrinsics.areEqual(this.restricted_amount, fundingSource.restricted_amount) && Intrinsics.areEqual(this.restricted_source_instrument_token, fundingSource.restricted_source_instrument_token) && Intrinsics.areEqual(this.restricted_source_transaction_token, fundingSource.restricted_source_transaction_token) && Intrinsics.areEqual(this.restricted_target_instrument_token, fundingSource.restricted_target_instrument_token) && Intrinsics.areEqual(this.restricted_target_transaction_token, fundingSource.restricted_target_transaction_token) && Intrinsics.areEqual(this.unrestricted_fee, fundingSource.unrestricted_fee) && Intrinsics.areEqual(this.restricted_fee, fundingSource.restricted_fee) && Intrinsics.areEqual(this.unrestricted_source_amount, fundingSource.unrestricted_source_amount) && Intrinsics.areEqual(this.unrestricted_target_amount, fundingSource.unrestricted_target_amount) && Intrinsics.areEqual(this.restricted_source_amount, fundingSource.restricted_source_amount) && Intrinsics.areEqual(this.restricted_target_amount, fundingSource.restricted_target_amount) && this.transaction_orchestrator == fundingSource.transaction_orchestrator;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.cash_in_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            String str = this.cash_in_instrument_token;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            CashInInstrumentType cashInInstrumentType = this.cash_in_instrument_type;
            int hashCode4 = (hashCode3 + (cashInInstrumentType != null ? cashInInstrumentType.hashCode() : 0)) * 37;
            Money money2 = this.unrestricted_amount;
            int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
            String str2 = this.unrestricted_source_instrument_token;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.unrestricted_source_transaction_token;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.unrestricted_target_instrument_token;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.unrestricted_target_transaction_token;
            int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Money money3 = this.restricted_amount;
            int hashCode10 = (hashCode9 + (money3 != null ? money3.hashCode() : 0)) * 37;
            String str6 = this.restricted_source_instrument_token;
            int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.restricted_source_transaction_token;
            int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.restricted_target_instrument_token;
            int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
            String str9 = this.restricted_target_transaction_token;
            int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 37;
            Money money4 = this.unrestricted_fee;
            int hashCode15 = (hashCode14 + (money4 != null ? money4.hashCode() : 0)) * 37;
            Money money5 = this.restricted_fee;
            int hashCode16 = (hashCode15 + (money5 != null ? money5.hashCode() : 0)) * 37;
            Money money6 = this.unrestricted_source_amount;
            int hashCode17 = (hashCode16 + (money6 != null ? money6.hashCode() : 0)) * 37;
            Money money7 = this.unrestricted_target_amount;
            int hashCode18 = (hashCode17 + (money7 != null ? money7.hashCode() : 0)) * 37;
            Money money8 = this.restricted_source_amount;
            int hashCode19 = (hashCode18 + (money8 != null ? money8.hashCode() : 0)) * 37;
            Money money9 = this.restricted_target_amount;
            int hashCode20 = (hashCode19 + (money9 != null ? money9.hashCode() : 0)) * 37;
            TransactionOrchestrator transactionOrchestrator = this.transaction_orchestrator;
            int hashCode21 = hashCode20 + (transactionOrchestrator != null ? transactionOrchestrator.hashCode() : 0);
            this.hashCode = hashCode21;
            return hashCode21;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiReward.Builder builder = new UiReward.Builder(2);
            builder.offerly_token = this.cash_in_amount;
            builder.token = this.cash_in_instrument_token;
            builder.reward_avatars = this.cash_in_instrument_type;
            builder.activation_date_time_ms = this.unrestricted_amount;
            builder.category = this.unrestricted_source_instrument_token;
            builder.title = this.unrestricted_source_transaction_token;
            builder.main_text = this.unrestricted_target_instrument_token;
            builder.affiliate_link_url = this.unrestricted_target_transaction_token;
            builder.expiration_date_time_ms = this.restricted_amount;
            builder.user_agent = this.restricted_source_instrument_token;
            builder.full_title_text = this.restricted_source_transaction_token;
            builder.discount_text = this.restricted_target_instrument_token;
            builder.merchant_name = this.restricted_target_transaction_token;
            builder.boost_attributes = this.unrestricted_fee;
            builder.merchant_tokens = this.restricted_fee;
            builder.draggable = this.unrestricted_source_amount;
            builder.is_custom_offer = this.unrestricted_target_amount;
            builder.redeemable_with_cash_card = this.restricted_source_amount;
            builder.redeemable_with_cash_app_pay = this.restricted_target_amount;
            builder.app_links = this.transaction_orchestrator;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.cash_in_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("cash_in_amount=", money, arrayList);
            }
            String str = this.cash_in_instrument_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cash_in_instrument_token=", arrayList);
            }
            CashInInstrumentType cashInInstrumentType = this.cash_in_instrument_type;
            if (cashInInstrumentType != null) {
                arrayList.add("cash_in_instrument_type=" + cashInInstrumentType);
            }
            Money money2 = this.unrestricted_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("unrestricted_amount=", money2, arrayList);
            }
            String str2 = this.unrestricted_source_instrument_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "unrestricted_source_instrument_token=", arrayList);
            }
            String str3 = this.unrestricted_source_transaction_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "unrestricted_source_transaction_token=", arrayList);
            }
            String str4 = this.unrestricted_target_instrument_token;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "unrestricted_target_instrument_token=", arrayList);
            }
            String str5 = this.unrestricted_target_transaction_token;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "unrestricted_target_transaction_token=", arrayList);
            }
            Money money3 = this.restricted_amount;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("restricted_amount=", money3, arrayList);
            }
            String str6 = this.restricted_source_instrument_token;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "restricted_source_instrument_token=", arrayList);
            }
            String str7 = this.restricted_source_transaction_token;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "restricted_source_transaction_token=", arrayList);
            }
            String str8 = this.restricted_target_instrument_token;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "restricted_target_instrument_token=", arrayList);
            }
            String str9 = this.restricted_target_transaction_token;
            if (str9 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "restricted_target_transaction_token=", arrayList);
            }
            Money money4 = this.unrestricted_fee;
            if (money4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("unrestricted_fee=", money4, arrayList);
            }
            Money money5 = this.restricted_fee;
            if (money5 != null) {
                Matcher$$ExternalSyntheticOutline0.m("restricted_fee=", money5, arrayList);
            }
            Money money6 = this.unrestricted_source_amount;
            if (money6 != null) {
                Matcher$$ExternalSyntheticOutline0.m("unrestricted_source_amount=", money6, arrayList);
            }
            Money money7 = this.unrestricted_target_amount;
            if (money7 != null) {
                Matcher$$ExternalSyntheticOutline0.m("unrestricted_target_amount=", money7, arrayList);
            }
            Money money8 = this.restricted_source_amount;
            if (money8 != null) {
                Matcher$$ExternalSyntheticOutline0.m("restricted_source_amount=", money8, arrayList);
            }
            Money money9 = this.restricted_target_amount;
            if (money9 != null) {
                Matcher$$ExternalSyntheticOutline0.m("restricted_target_amount=", money9, arrayList);
            }
            TransactionOrchestrator transactionOrchestrator = this.transaction_orchestrator;
            if (transactionOrchestrator != null) {
                arrayList.add("transaction_orchestrator=" + transactionOrchestrator);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FundingSource{", "}", 0, null, null, 56);
        }
    }

    public final class OrderSponsorship extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderSponsorship> CREATOR;
        public final String dependent_customer_token;
        public final String sponsor_customer_token;

        static {
            Order$OrderSponsorship$Companion$ADAPTER$1 order$OrderSponsorship$Companion$ADAPTER$1 = new Order$OrderSponsorship$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderSponsorship.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.OrderSponsorship", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
            ADAPTER = order$OrderSponsorship$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(order$OrderSponsorship$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderSponsorship(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.sponsor_customer_token = str;
            this.dependent_customer_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OrderSponsorship)) {
                return false;
            }
            OrderSponsorship orderSponsorship = (OrderSponsorship) obj;
            return Intrinsics.areEqual(unknownFields(), orderSponsorship.unknownFields()) && Intrinsics.areEqual(this.sponsor_customer_token, orderSponsorship.sponsor_customer_token) && Intrinsics.areEqual(this.dependent_customer_token, orderSponsorship.dependent_customer_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.sponsor_customer_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.dependent_customer_token;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(9);
            builder.given_name = this.sponsor_customer_token;
            builder.family_name = this.dependent_customer_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.sponsor_customer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sponsor_customer_token=", arrayList);
            }
            String str2 = this.dependent_customer_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dependent_customer_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSponsorship{", "}", 0, null, null, 56);
        }
    }

    public final class RecurringSchedule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecurringSchedule> CREATOR;
        public final List days_of_period;
        public final Frequency frequency;
        public final Integer time_of_day;
        public final String timezone;

        public enum Frequency implements WireEnum {
            EVERY_WEEK(1),
            EVERY_TWO_WEEKS(2),
            EVERY_MONTH(3),
            EVERY_DAY(4);

            public final int value;
            public static final RetailerType.Companion Companion = new RetailerType.Companion();
            public static final Order$RecurringSchedule$Frequency$Companion$ADAPTER$1 ADAPTER = new Order$RecurringSchedule$Frequency$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Frequency.class), Syntax.PROTO_2, null);

            Frequency(int i) {
                this.value = i;
            }

            public static final Frequency fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return EVERY_WEEK;
                }
                if (i == 2) {
                    return EVERY_TWO_WEEKS;
                }
                if (i == 3) {
                    return EVERY_MONTH;
                }
                if (i != 4) {
                    return null;
                }
                return EVERY_DAY;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Order$RecurringSchedule$Companion$ADAPTER$1 order$RecurringSchedule$Companion$ADAPTER$1 = new Order$RecurringSchedule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringSchedule.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order.RecurringSchedule", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
            ADAPTER = order$RecurringSchedule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(order$RecurringSchedule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringSchedule(Frequency frequency, List list, String str, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.frequency = frequency;
            this.timezone = str;
            this.time_of_day = num;
            this.days_of_period = TransactorKt.immutableCopyOf("days_of_period", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecurringSchedule)) {
                return false;
            }
            RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
            return Intrinsics.areEqual(unknownFields(), recurringSchedule.unknownFields()) && this.frequency == recurringSchedule.frequency && Intrinsics.areEqual(this.days_of_period, recurringSchedule.days_of_period) && Intrinsics.areEqual(this.timezone, recurringSchedule.timezone) && Intrinsics.areEqual(this.time_of_day, recurringSchedule.time_of_day);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Frequency frequency = this.frequency;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (frequency != null ? frequency.hashCode() : 0)) * 37, 37, this.days_of_period);
            String str = this.timezone;
            int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.time_of_day;
            int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.CardPii.Builder builder = new Card.CardPii.Builder(24, false);
            builder.last_four_digits = this.frequency;
            builder.expiration = this.days_of_period;
            builder.postal_code = this.timezone;
            builder.ciphertext_ = this.time_of_day;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Frequency frequency = this.frequency;
            if (frequency != null) {
                arrayList.add("frequency=" + frequency);
            }
            List list = this.days_of_period;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("days_of_period=", arrayList, list);
            }
            String str = this.timezone;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timezone=", arrayList);
            }
            Integer num = this.time_of_day;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("time_of_day=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringSchedule{", "}", 0, null, null, 56);
        }
    }

    static {
        Order$Companion$ADAPTER$1 order$Companion$ADAPTER$1 = new Order$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Order.class), "type.googleapis.com/squareup.cash.investcrypto.resources.Order", Syntax.PROTO_2, null, "squareup/cash/investcrypto/resources/order.proto");
        ADAPTER = order$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(order$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Order(String str, OrderSide orderSide, OrderType orderType, OrderState orderState, Money money, Money money2, Money money3, FeeStrategy feeStrategy, Money money4, Money money5, Money money6, Long l, Money money7, String str2, String str3, String str4, String str5, Long l2, Origin origin, Feature feature, String str6, RecurringSchedule recurringSchedule, String str7, Money money8, Money money9, String str8, String str9, String str10, String str11, Money money10, Money money11, PriceStrategy priceStrategy, FeatureMetadata featureMetadata, Double d, Double d2, OrderSponsorship orderSponsorship, FundingSource fundingSource, TradingModel tradingModel, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.side = orderSide;
        this.f1280type = orderType;
        this.state = orderState;
        this.crypto_amount = money;
        this.fiat_amount = money2;
        this.fee = money3;
        this.fee_strategy = feeStrategy;
        this.current_price = money4;
        this.target_price = money5;
        this.original_price = money6;
        this.expiration_epoch_ms = l;
        this.final_price = money7;
        this.fiat_instrument_token = str2;
        this.crypto_instrument_token = str3;
        this.funding_transaction_token = str4;
        this.customer_token = str5;
        this.creation_epoch_ms = l2;
        this.origin = origin;
        this.feature = feature;
        this.idempotence_token = str6;
        this.recurring_schedule = recurringSchedule;
        this.push_transaction_token = str7;
        this.source_money = money8;
        this.target_money = money9;
        this.source_instrument_token = str8;
        this.target_instrument_token = str9;
        this.source_transaction_token = str10;
        this.target_transaction_token = str11;
        this.reference_price = money10;
        this.spread_price_fee = money11;
        this.price_strategy = priceStrategy;
        this.feature_metadata = featureMetadata;
        this.price_spread_bps = d;
        this.incorporated_spread_bps = d2;
        this.order_sponsorship = orderSponsorship;
        this.funding_source = fundingSource;
        this.trading_model = tradingModel;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        return Intrinsics.areEqual(unknownFields(), order.unknownFields()) && Intrinsics.areEqual(this.token, order.token) && this.side == order.side && this.f1280type == order.f1280type && this.state == order.state && Intrinsics.areEqual(this.crypto_amount, order.crypto_amount) && Intrinsics.areEqual(this.fiat_amount, order.fiat_amount) && Intrinsics.areEqual(this.fee, order.fee) && this.fee_strategy == order.fee_strategy && Intrinsics.areEqual(this.current_price, order.current_price) && Intrinsics.areEqual(this.target_price, order.target_price) && Intrinsics.areEqual(this.original_price, order.original_price) && Intrinsics.areEqual(this.expiration_epoch_ms, order.expiration_epoch_ms) && Intrinsics.areEqual(this.final_price, order.final_price) && Intrinsics.areEqual(this.fiat_instrument_token, order.fiat_instrument_token) && Intrinsics.areEqual(this.crypto_instrument_token, order.crypto_instrument_token) && Intrinsics.areEqual(this.funding_transaction_token, order.funding_transaction_token) && Intrinsics.areEqual(this.customer_token, order.customer_token) && Intrinsics.areEqual(this.creation_epoch_ms, order.creation_epoch_ms) && this.origin == order.origin && this.feature == order.feature && Intrinsics.areEqual(this.idempotence_token, order.idempotence_token) && Intrinsics.areEqual(this.recurring_schedule, order.recurring_schedule) && Intrinsics.areEqual(this.push_transaction_token, order.push_transaction_token) && Intrinsics.areEqual(this.source_money, order.source_money) && Intrinsics.areEqual(this.target_money, order.target_money) && Intrinsics.areEqual(this.source_instrument_token, order.source_instrument_token) && Intrinsics.areEqual(this.target_instrument_token, order.target_instrument_token) && Intrinsics.areEqual(this.source_transaction_token, order.source_transaction_token) && Intrinsics.areEqual(this.target_transaction_token, order.target_transaction_token) && Intrinsics.areEqual(this.reference_price, order.reference_price) && Intrinsics.areEqual(this.spread_price_fee, order.spread_price_fee) && this.price_strategy == order.price_strategy && Intrinsics.areEqual(this.feature_metadata, order.feature_metadata) && Intrinsics.areEqual(this.price_spread_bps, order.price_spread_bps) && Intrinsics.areEqual(this.incorporated_spread_bps, order.incorporated_spread_bps) && Intrinsics.areEqual(this.order_sponsorship, order.order_sponsorship) && Intrinsics.areEqual(this.funding_source, order.funding_source) && this.trading_model == order.trading_model;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        OrderSide orderSide = this.side;
        int hashCode3 = (hashCode2 + (orderSide != null ? orderSide.hashCode() : 0)) * 37;
        OrderType orderType = this.f1280type;
        int hashCode4 = (hashCode3 + (orderType != null ? orderType.hashCode() : 0)) * 37;
        OrderState orderState = this.state;
        int hashCode5 = (hashCode4 + (orderState != null ? orderState.hashCode() : 0)) * 37;
        Money money = this.crypto_amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.fiat_amount;
        int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.fee;
        int hashCode8 = (hashCode7 + (money3 != null ? money3.hashCode() : 0)) * 37;
        FeeStrategy feeStrategy = this.fee_strategy;
        int hashCode9 = (hashCode8 + (feeStrategy != null ? feeStrategy.hashCode() : 0)) * 37;
        Money money4 = this.current_price;
        int hashCode10 = (hashCode9 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.target_price;
        int hashCode11 = (hashCode10 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.original_price;
        int hashCode12 = (hashCode11 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Long l = this.expiration_epoch_ms;
        int hashCode13 = (hashCode12 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money7 = this.final_price;
        int hashCode14 = (hashCode13 + (money7 != null ? money7.hashCode() : 0)) * 37;
        String str2 = this.fiat_instrument_token;
        int hashCode15 = (hashCode14 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.crypto_instrument_token;
        int hashCode16 = (hashCode15 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.funding_transaction_token;
        int hashCode17 = (hashCode16 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.customer_token;
        int hashCode18 = (hashCode17 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l2 = this.creation_epoch_ms;
        int hashCode19 = (hashCode18 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Origin origin = this.origin;
        int hashCode20 = (hashCode19 + (origin != null ? origin.hashCode() : 0)) * 37;
        Feature feature = this.feature;
        int hashCode21 = (hashCode20 + (feature != null ? feature.hashCode() : 0)) * 37;
        String str6 = this.idempotence_token;
        int hashCode22 = (hashCode21 + (str6 != null ? str6.hashCode() : 0)) * 37;
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        int hashCode23 = (hashCode22 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0)) * 37;
        String str7 = this.push_transaction_token;
        int hashCode24 = (hashCode23 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Money money8 = this.source_money;
        int hashCode25 = (hashCode24 + (money8 != null ? money8.hashCode() : 0)) * 37;
        Money money9 = this.target_money;
        int hashCode26 = (hashCode25 + (money9 != null ? money9.hashCode() : 0)) * 37;
        String str8 = this.source_instrument_token;
        int hashCode27 = (hashCode26 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.target_instrument_token;
        int hashCode28 = (hashCode27 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.source_transaction_token;
        int hashCode29 = (hashCode28 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.target_transaction_token;
        int hashCode30 = (hashCode29 + (str11 != null ? str11.hashCode() : 0)) * 37;
        Money money10 = this.reference_price;
        int hashCode31 = (hashCode30 + (money10 != null ? money10.hashCode() : 0)) * 37;
        Money money11 = this.spread_price_fee;
        int hashCode32 = (hashCode31 + (money11 != null ? money11.hashCode() : 0)) * 37;
        PriceStrategy priceStrategy = this.price_strategy;
        int hashCode33 = (hashCode32 + (priceStrategy != null ? priceStrategy.hashCode() : 0)) * 37;
        FeatureMetadata featureMetadata = this.feature_metadata;
        int hashCode34 = (hashCode33 + (featureMetadata != null ? featureMetadata.hashCode() : 0)) * 37;
        Double d = this.price_spread_bps;
        int hashCode35 = (hashCode34 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Double d2 = this.incorporated_spread_bps;
        int hashCode36 = (hashCode35 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
        OrderSponsorship orderSponsorship = this.order_sponsorship;
        int hashCode37 = (hashCode36 + (orderSponsorship != null ? orderSponsorship.hashCode() : 0)) * 37;
        FundingSource fundingSource = this.funding_source;
        int hashCode38 = (hashCode37 + (fundingSource != null ? fundingSource.hashCode() : 0)) * 37;
        TradingModel tradingModel = this.trading_model;
        int hashCode39 = hashCode38 + (tradingModel != null ? tradingModel.hashCode() : 0);
        this.hashCode = hashCode39;
        return hashCode39;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.side = this.side;
        builder.f1281type = this.f1280type;
        builder.state = this.state;
        builder.crypto_amount = this.crypto_amount;
        builder.fiat_amount = this.fiat_amount;
        builder.fee = this.fee;
        builder.fee_strategy = this.fee_strategy;
        builder.current_price = this.current_price;
        builder.target_price = this.target_price;
        builder.original_price = this.original_price;
        builder.expiration_epoch_ms = this.expiration_epoch_ms;
        builder.final_price = this.final_price;
        builder.fiat_instrument_token = this.fiat_instrument_token;
        builder.crypto_instrument_token = this.crypto_instrument_token;
        builder.funding_transaction_token = this.funding_transaction_token;
        builder.customer_token = this.customer_token;
        builder.creation_epoch_ms = this.creation_epoch_ms;
        builder.origin = this.origin;
        builder.feature = this.feature;
        builder.idempotence_token = this.idempotence_token;
        builder.recurring_schedule = this.recurring_schedule;
        builder.push_transaction_token = this.push_transaction_token;
        builder.source_money = this.source_money;
        builder.target_money = this.target_money;
        builder.source_instrument_token = this.source_instrument_token;
        builder.target_instrument_token = this.target_instrument_token;
        builder.source_transaction_token = this.source_transaction_token;
        builder.target_transaction_token = this.target_transaction_token;
        builder.reference_price = this.reference_price;
        builder.spread_price_fee = this.spread_price_fee;
        builder.price_strategy = this.price_strategy;
        builder.feature_metadata = this.feature_metadata;
        builder.price_spread_bps = this.price_spread_bps;
        builder.incorporated_spread_bps = this.incorporated_spread_bps;
        builder.order_sponsorship = this.order_sponsorship;
        builder.funding_source = this.funding_source;
        builder.trading_model = this.trading_model;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        OrderSide orderSide = this.side;
        if (orderSide != null) {
            arrayList.add("side=" + orderSide);
        }
        OrderType orderType = this.f1280type;
        if (orderType != null) {
            arrayList.add("type=" + orderType);
        }
        OrderState orderState = this.state;
        if (orderState != null) {
            arrayList.add("state=" + orderState);
        }
        Money money = this.crypto_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("crypto_amount=", money, arrayList);
        }
        Money money2 = this.fiat_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fiat_amount=", money2, arrayList);
        }
        Money money3 = this.fee;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fee=", money3, arrayList);
        }
        FeeStrategy feeStrategy = this.fee_strategy;
        if (feeStrategy != null) {
            arrayList.add("fee_strategy=" + feeStrategy);
        }
        Money money4 = this.current_price;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("current_price=", money4, arrayList);
        }
        Money money5 = this.target_price;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("target_price=", money5, arrayList);
        }
        Money money6 = this.original_price;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("original_price=", money6, arrayList);
        }
        Long l = this.expiration_epoch_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expiration_epoch_ms=", l, arrayList);
        }
        Money money7 = this.final_price;
        if (money7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("final_price=", money7, arrayList);
        }
        String str2 = this.fiat_instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "fiat_instrument_token=", arrayList);
        }
        String str3 = this.crypto_instrument_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "crypto_instrument_token=", arrayList);
        }
        String str4 = this.funding_transaction_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "funding_transaction_token=", arrayList);
        }
        String str5 = this.customer_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "customer_token=", arrayList);
        }
        Long l2 = this.creation_epoch_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("creation_epoch_ms=", l2, arrayList);
        }
        Origin origin = this.origin;
        if (origin != null) {
            arrayList.add("origin=" + origin);
        }
        Feature feature = this.feature;
        if (feature != null) {
            arrayList.add("feature=" + feature);
        }
        String str6 = this.idempotence_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "idempotence_token=", arrayList);
        }
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        if (recurringSchedule != null) {
            arrayList.add("recurring_schedule=" + recurringSchedule);
        }
        String str7 = this.push_transaction_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "push_transaction_token=", arrayList);
        }
        Money money8 = this.source_money;
        if (money8 != null) {
            Matcher$$ExternalSyntheticOutline0.m("source_money=", money8, arrayList);
        }
        Money money9 = this.target_money;
        if (money9 != null) {
            Matcher$$ExternalSyntheticOutline0.m("target_money=", money9, arrayList);
        }
        String str8 = this.source_instrument_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "source_instrument_token=", arrayList);
        }
        String str9 = this.target_instrument_token;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "target_instrument_token=", arrayList);
        }
        String str10 = this.source_transaction_token;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "source_transaction_token=", arrayList);
        }
        String str11 = this.target_transaction_token;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "target_transaction_token=", arrayList);
        }
        Money money10 = this.reference_price;
        if (money10 != null) {
            Matcher$$ExternalSyntheticOutline0.m("reference_price=", money10, arrayList);
        }
        Money money11 = this.spread_price_fee;
        if (money11 != null) {
            Matcher$$ExternalSyntheticOutline0.m("spread_price_fee=", money11, arrayList);
        }
        PriceStrategy priceStrategy = this.price_strategy;
        if (priceStrategy != null) {
            arrayList.add("price_strategy=" + priceStrategy);
        }
        FeatureMetadata featureMetadata = this.feature_metadata;
        if (featureMetadata != null) {
            arrayList.add("feature_metadata=" + featureMetadata);
        }
        Double d = this.price_spread_bps;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("price_spread_bps=", d, arrayList);
        }
        Double d2 = this.incorporated_spread_bps;
        if (d2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("incorporated_spread_bps=", d2, arrayList);
        }
        OrderSponsorship orderSponsorship = this.order_sponsorship;
        if (orderSponsorship != null) {
            arrayList.add("order_sponsorship=" + orderSponsorship);
        }
        FundingSource fundingSource = this.funding_source;
        if (fundingSource != null) {
            arrayList.add("funding_source=" + fundingSource);
        }
        TradingModel tradingModel = this.trading_model;
        if (tradingModel != null) {
            arrayList.add("trading_model=" + tradingModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Order{", "}", 0, null, null, 56);
    }
}
