package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CreateCartResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/giftly/GiftCard$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzho", "CartLoyaltySummary", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateCartResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateCartResponse> CREATOR;
    public final List additional_buyer_info;
    public final List available_order_workflows;
    public final CartLoyaltySummary cart_loyalty_summary;
    public final List discount_codes;
    public final LocalFulfillment fulfillment;
    public final List fulfillment_options;
    public final List gift_cards;
    public final LegalConsent legal_consent;
    public final LocalCashEarningsConfiguration local_cash_earnings_configuration;
    public final LocalCheckoutBrandSummary local_checkout_brand_summary;
    public final LocalCheckoutLocationSummary local_checkout_location_summary;
    public final LocalOnboardingUpsell onboarding_upsell;
    public final BrandBanner order_detail_banner;
    public final List payment_methods;
    public final LocalPaymentOption payment_option;
    public final List payment_options;
    public final PreferredPaymentMethod preferred_payment_method;
    public final Boolean redeem_local_cash;
    public final LocalCashConfiguration redeemable_local_cash_configuration;
    public final List required_inputs;
    public final Boolean required_inputs_fulfilled;
    public final zzho response;
    public final ShippingRateConfiguration shipping_rate_configuration;
    public final LocalMoney tip_amount;
    public final LocalTippingConfiguration tipping_configuration;

    public final class CartLoyaltySummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CartLoyaltySummary> CREATOR;
        public final List applicable_reward_tokens;
        public final LocalLoyaltyAccount loyalty_account;
        public final LocalLoyaltyProgram loyalty_program;
        public final String selected_reward_token;

        static {
            CreateCartResponse$CartLoyaltySummary$Companion$ADAPTER$1 createCartResponse$CartLoyaltySummary$Companion$ADAPTER$1 = new CreateCartResponse$CartLoyaltySummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CartLoyaltySummary.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateCartResponse.CartLoyaltySummary", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = createCartResponse$CartLoyaltySummary$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createCartResponse$CartLoyaltySummary$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CartLoyaltySummary(LocalLoyaltyProgram localLoyaltyProgram, LocalLoyaltyAccount localLoyaltyAccount, List list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.loyalty_program = localLoyaltyProgram;
            this.loyalty_account = localLoyaltyAccount;
            this.selected_reward_token = str;
            this.applicable_reward_tokens = TransactorKt.immutableCopyOf("applicable_reward_tokens", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CartLoyaltySummary)) {
                return false;
            }
            CartLoyaltySummary cartLoyaltySummary = (CartLoyaltySummary) obj;
            return Intrinsics.areEqual(unknownFields(), cartLoyaltySummary.unknownFields()) && Intrinsics.areEqual(this.loyalty_program, cartLoyaltySummary.loyalty_program) && Intrinsics.areEqual(this.loyalty_account, cartLoyaltySummary.loyalty_account) && Intrinsics.areEqual(this.applicable_reward_tokens, cartLoyaltySummary.applicable_reward_tokens) && Intrinsics.areEqual(this.selected_reward_token, cartLoyaltySummary.selected_reward_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalLoyaltyProgram localLoyaltyProgram = this.loyalty_program;
            int hashCode2 = (hashCode + (localLoyaltyProgram != null ? localLoyaltyProgram.hashCode() : 0)) * 37;
            LocalLoyaltyAccount localLoyaltyAccount = this.loyalty_account;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localLoyaltyAccount != null ? localLoyaltyAccount.hashCode() : 0)) * 37, 37, this.applicable_reward_tokens);
            String str = this.selected_reward_token;
            int hashCode3 = m + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(2, false);
            builder.last_4 = this.loyalty_program;
            builder.gift_card_id = this.loyalty_account;
            builder.gift_card_amount = this.applicable_reward_tokens;
            builder.id = this.selected_reward_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalLoyaltyProgram localLoyaltyProgram = this.loyalty_program;
            if (localLoyaltyProgram != null) {
                arrayList.add("loyalty_program=" + localLoyaltyProgram);
            }
            LocalLoyaltyAccount localLoyaltyAccount = this.loyalty_account;
            if (localLoyaltyAccount != null) {
                arrayList.add("loyalty_account=" + localLoyaltyAccount);
            }
            List list = this.applicable_reward_tokens;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("applicable_reward_tokens=", arrayList, list);
            }
            String str = this.selected_reward_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_reward_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CartLoyaltySummary{", "}", 0, null, null, 56);
        }
    }

    static {
        CreateCartResponse$Companion$ADAPTER$1 createCartResponse$Companion$ADAPTER$1 = new CreateCartResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateCartResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateCartResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = createCartResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createCartResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCartResponse(zzho zzhoVar, List list, List list2, List list3, LocalTippingConfiguration localTippingConfiguration, LocalPaymentOption localPaymentOption, LegalConsent legalConsent, LocalOnboardingUpsell localOnboardingUpsell, LocalFulfillment localFulfillment, LocalCashConfiguration localCashConfiguration, LocalCashEarningsConfiguration localCashEarningsConfiguration, List list4, PreferredPaymentMethod preferredPaymentMethod, BrandBanner brandBanner, CartLoyaltySummary cartLoyaltySummary, List list5, LocalMoney localMoney, Boolean bool, List list6, List list7, LocalCheckoutBrandSummary localCheckoutBrandSummary, LocalCheckoutLocationSummary localCheckoutLocationSummary, List list8, Boolean bool2, ShippingRateConfiguration shippingRateConfiguration, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list6, list7, list8, byteString);
        this.response = zzhoVar;
        this.tipping_configuration = localTippingConfiguration;
        this.payment_option = localPaymentOption;
        this.legal_consent = legalConsent;
        this.onboarding_upsell = localOnboardingUpsell;
        this.fulfillment = localFulfillment;
        this.redeemable_local_cash_configuration = localCashConfiguration;
        this.local_cash_earnings_configuration = localCashEarningsConfiguration;
        this.preferred_payment_method = preferredPaymentMethod;
        this.order_detail_banner = brandBanner;
        this.cart_loyalty_summary = cartLoyaltySummary;
        this.tip_amount = localMoney;
        this.redeem_local_cash = bool;
        this.local_checkout_brand_summary = localCheckoutBrandSummary;
        this.local_checkout_location_summary = localCheckoutLocationSummary;
        this.required_inputs_fulfilled = bool2;
        this.shipping_rate_configuration = shippingRateConfiguration;
        this.payment_options = TransactorKt.immutableCopyOf("payment_options", list);
        this.additional_buyer_info = TransactorKt.immutableCopyOf("additional_buyer_info", list2);
        this.fulfillment_options = TransactorKt.immutableCopyOf("fulfillment_options", list3);
        this.payment_methods = TransactorKt.immutableCopyOf("payment_methods", list4);
        this.available_order_workflows = TransactorKt.immutableCopyOf("available_order_workflows", list5);
        this.gift_cards = TransactorKt.immutableCopyOf("gift_cards", list6);
        this.discount_codes = TransactorKt.immutableCopyOf("discount_codes", list7);
        this.required_inputs = TransactorKt.immutableCopyOf("required_inputs", list8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.mlkit_vision_common.zzho] */
    public static CreateCartResponse copy$default(CreateCartResponse createCartResponse, CreateCartResponse$Response$Cart createCartResponse$Response$Cart, ArrayList arrayList, ArrayList arrayList2, LocalTippingConfiguration localTippingConfiguration, LegalConsent legalConsent, LocalOnboardingUpsell localOnboardingUpsell, LocalFulfillment localFulfillment, LocalCashConfiguration localCashConfiguration, LocalCashEarningsConfiguration localCashEarningsConfiguration, ArrayList arrayList3, PreferredPaymentMethod preferredPaymentMethod, BrandBanner brandBanner, CartLoyaltySummary cartLoyaltySummary, LocalMoney localMoney, ArrayList arrayList4, LocalCheckoutBrandSummary localCheckoutBrandSummary, LocalCheckoutLocationSummary localCheckoutLocationSummary, ArrayList arrayList5, ShippingRateConfiguration shippingRateConfiguration, ByteString byteString, int i) {
        CreateCartResponse$Response$Cart createCartResponse$Response$Cart2 = (i & 1) != 0 ? createCartResponse.response : createCartResponse$Response$Cart;
        List list = createCartResponse.payment_options;
        ArrayList arrayList6 = (i & 4) != 0 ? createCartResponse.additional_buyer_info : arrayList;
        ArrayList arrayList7 = (i & 8) != 0 ? createCartResponse.fulfillment_options : arrayList2;
        LocalTippingConfiguration localTippingConfiguration2 = (i & 16) != 0 ? createCartResponse.tipping_configuration : localTippingConfiguration;
        LocalPaymentOption localPaymentOption = createCartResponse.payment_option;
        LegalConsent legalConsent2 = (i & 64) != 0 ? createCartResponse.legal_consent : legalConsent;
        LocalOnboardingUpsell localOnboardingUpsell2 = (i & 128) != 0 ? createCartResponse.onboarding_upsell : localOnboardingUpsell;
        LocalFulfillment localFulfillment2 = (i & 256) != 0 ? createCartResponse.fulfillment : localFulfillment;
        LocalCashConfiguration localCashConfiguration2 = (i & 512) != 0 ? createCartResponse.redeemable_local_cash_configuration : localCashConfiguration;
        LocalCashEarningsConfiguration localCashEarningsConfiguration2 = (i & 1024) != 0 ? createCartResponse.local_cash_earnings_configuration : localCashEarningsConfiguration;
        ArrayList arrayList8 = (i & 2048) != 0 ? createCartResponse.payment_methods : arrayList3;
        PreferredPaymentMethod preferredPaymentMethod2 = (i & 4096) != 0 ? createCartResponse.preferred_payment_method : preferredPaymentMethod;
        BrandBanner brandBanner2 = (i & PKIFailureInfo.certRevoked) != 0 ? createCartResponse.order_detail_banner : brandBanner;
        CartLoyaltySummary cartLoyaltySummary2 = (i & 16384) != 0 ? createCartResponse.cart_loyalty_summary : cartLoyaltySummary;
        List list2 = createCartResponse.available_order_workflows;
        LocalMoney localMoney2 = (65536 & i) != 0 ? createCartResponse.tip_amount : localMoney;
        Boolean bool = createCartResponse.redeem_local_cash;
        ArrayList arrayList9 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? createCartResponse.gift_cards : arrayList4;
        List list3 = createCartResponse.discount_codes;
        LocalCheckoutBrandSummary localCheckoutBrandSummary2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? createCartResponse.local_checkout_brand_summary : localCheckoutBrandSummary;
        LocalCheckoutLocationSummary localCheckoutLocationSummary2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? createCartResponse.local_checkout_location_summary : localCheckoutLocationSummary;
        ArrayList arrayList10 = (i & 4194304) != 0 ? createCartResponse.required_inputs : arrayList5;
        Boolean bool2 = createCartResponse.required_inputs_fulfilled;
        ShippingRateConfiguration shippingRateConfiguration2 = (i & 16777216) != 0 ? createCartResponse.shipping_rate_configuration : shippingRateConfiguration;
        ByteString unknownFields = (i & 33554432) != 0 ? createCartResponse.unknownFields() : byteString;
        createCartResponse.getClass();
        list.getClass();
        arrayList6.getClass();
        arrayList7.getClass();
        arrayList8.getClass();
        list2.getClass();
        arrayList9.getClass();
        list3.getClass();
        arrayList10.getClass();
        unknownFields.getClass();
        return new CreateCartResponse(createCartResponse$Response$Cart2, list, arrayList6, arrayList7, localTippingConfiguration2, localPaymentOption, legalConsent2, localOnboardingUpsell2, localFulfillment2, localCashConfiguration2, localCashEarningsConfiguration2, arrayList8, preferredPaymentMethod2, brandBanner2, cartLoyaltySummary2, list2, localMoney2, bool, arrayList9, list3, localCheckoutBrandSummary2, localCheckoutLocationSummary2, arrayList10, bool2, shippingRateConfiguration2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateCartResponse)) {
            return false;
        }
        CreateCartResponse createCartResponse = (CreateCartResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createCartResponse.unknownFields()) && Intrinsics.areEqual(this.response, createCartResponse.response) && Intrinsics.areEqual(this.payment_options, createCartResponse.payment_options) && Intrinsics.areEqual(this.additional_buyer_info, createCartResponse.additional_buyer_info) && Intrinsics.areEqual(this.fulfillment_options, createCartResponse.fulfillment_options) && Intrinsics.areEqual(this.tipping_configuration, createCartResponse.tipping_configuration) && this.payment_option == createCartResponse.payment_option && Intrinsics.areEqual(this.legal_consent, createCartResponse.legal_consent) && Intrinsics.areEqual(this.onboarding_upsell, createCartResponse.onboarding_upsell) && Intrinsics.areEqual(this.fulfillment, createCartResponse.fulfillment) && Intrinsics.areEqual(this.redeemable_local_cash_configuration, createCartResponse.redeemable_local_cash_configuration) && Intrinsics.areEqual(this.local_cash_earnings_configuration, createCartResponse.local_cash_earnings_configuration) && Intrinsics.areEqual(this.payment_methods, createCartResponse.payment_methods) && Intrinsics.areEqual(this.preferred_payment_method, createCartResponse.preferred_payment_method) && Intrinsics.areEqual(this.order_detail_banner, createCartResponse.order_detail_banner) && Intrinsics.areEqual(this.cart_loyalty_summary, createCartResponse.cart_loyalty_summary) && Intrinsics.areEqual(this.available_order_workflows, createCartResponse.available_order_workflows) && Intrinsics.areEqual(this.tip_amount, createCartResponse.tip_amount) && Intrinsics.areEqual(this.redeem_local_cash, createCartResponse.redeem_local_cash) && Intrinsics.areEqual(this.gift_cards, createCartResponse.gift_cards) && Intrinsics.areEqual(this.discount_codes, createCartResponse.discount_codes) && Intrinsics.areEqual(this.local_checkout_brand_summary, createCartResponse.local_checkout_brand_summary) && Intrinsics.areEqual(this.local_checkout_location_summary, createCartResponse.local_checkout_location_summary) && Intrinsics.areEqual(this.required_inputs, createCartResponse.required_inputs) && Intrinsics.areEqual(this.required_inputs_fulfilled, createCartResponse.required_inputs_fulfilled) && Intrinsics.areEqual(this.shipping_rate_configuration, createCartResponse.shipping_rate_configuration);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzho zzhoVar = this.response;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (zzhoVar != null ? zzhoVar.hashCode() : 0)) * 37, 37, this.payment_options), 37, this.additional_buyer_info), 37, this.fulfillment_options);
        LocalTippingConfiguration localTippingConfiguration = this.tipping_configuration;
        int hashCode2 = (m + (localTippingConfiguration != null ? localTippingConfiguration.hashCode() : 0)) * 37;
        LocalPaymentOption localPaymentOption = this.payment_option;
        int hashCode3 = (hashCode2 + (localPaymentOption != null ? localPaymentOption.hashCode() : 0)) * 37;
        LegalConsent legalConsent = this.legal_consent;
        int hashCode4 = (hashCode3 + (legalConsent != null ? legalConsent.hashCode() : 0)) * 37;
        LocalOnboardingUpsell localOnboardingUpsell = this.onboarding_upsell;
        int hashCode5 = (hashCode4 + (localOnboardingUpsell != null ? localOnboardingUpsell.hashCode() : 0)) * 37;
        LocalFulfillment localFulfillment = this.fulfillment;
        int hashCode6 = (hashCode5 + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37;
        LocalCashConfiguration localCashConfiguration = this.redeemable_local_cash_configuration;
        int hashCode7 = (hashCode6 + (localCashConfiguration != null ? localCashConfiguration.hashCode() : 0)) * 37;
        LocalCashEarningsConfiguration localCashEarningsConfiguration = this.local_cash_earnings_configuration;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (localCashEarningsConfiguration != null ? localCashEarningsConfiguration.hashCode() : 0)) * 37, 37, this.payment_methods);
        PreferredPaymentMethod preferredPaymentMethod = this.preferred_payment_method;
        int hashCode8 = (m2 + (preferredPaymentMethod != null ? preferredPaymentMethod.hashCode() : 0)) * 37;
        BrandBanner brandBanner = this.order_detail_banner;
        int hashCode9 = (hashCode8 + (brandBanner != null ? brandBanner.hashCode() : 0)) * 37;
        CartLoyaltySummary cartLoyaltySummary = this.cart_loyalty_summary;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (cartLoyaltySummary != null ? cartLoyaltySummary.hashCode() : 0)) * 37, 37, this.available_order_workflows);
        LocalMoney localMoney = this.tip_amount;
        int hashCode10 = (m3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        Boolean bool = this.redeem_local_cash;
        int m4 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.gift_cards), 37, this.discount_codes);
        LocalCheckoutBrandSummary localCheckoutBrandSummary = this.local_checkout_brand_summary;
        int hashCode11 = (m4 + (localCheckoutBrandSummary != null ? localCheckoutBrandSummary.hashCode() : 0)) * 37;
        LocalCheckoutLocationSummary localCheckoutLocationSummary = this.local_checkout_location_summary;
        int m5 = Recorder$$ExternalSyntheticOutline2.m((hashCode11 + (localCheckoutLocationSummary != null ? localCheckoutLocationSummary.hashCode() : 0)) * 37, 37, this.required_inputs);
        Boolean bool2 = this.required_inputs_fulfilled;
        int hashCode12 = (m5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        ShippingRateConfiguration shippingRateConfiguration = this.shipping_rate_configuration;
        int hashCode13 = hashCode12 + (shippingRateConfiguration != null ? shippingRateConfiguration.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(1);
        builder.token = this.response;
        builder.details = this.payment_options;
        builder.senders = this.additional_buyer_info;
        builder.options = this.fulfillment_options;
        builder.status = this.tipping_configuration;
        builder.title = this.payment_option;
        builder.subtitle = this.legal_consent;
        builder.activation_text = this.onboarding_upsell;
        builder.original_amount_text = this.fulfillment;
        builder.current_amount_text = this.redeemable_local_cash_configuration;
        builder.stored_value_balance_token = this.local_cash_earnings_configuration;
        builder.gift_card_type_description = this.payment_methods;
        builder.current_status_description_text = this.preferred_payment_method;
        builder.preview_title = this.order_detail_banner;
        builder.localizable_title = this.cart_loyalty_summary;
        builder.localizable_subtitle = this.available_order_workflows;
        builder.localizable_activation_text = this.tip_amount;
        builder.localizable_original_amount_text = this.redeem_local_cash;
        builder.localizable_current_amount_text = this.gift_cards;
        builder.localizable_gift_card_type_description = this.discount_codes;
        builder.localizable_current_status_description_text = this.local_checkout_brand_summary;
        builder.localizable_preview_title = this.local_checkout_location_summary;
        builder.themed_color = this.required_inputs;
        builder.logo = this.required_inputs_fulfilled;
        builder.card = this.shipping_rate_configuration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzho zzhoVar = this.response;
        if (zzhoVar != null) {
            arrayList.add("response=" + zzhoVar);
        }
        List list = this.payment_options;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_options=", arrayList, list);
        }
        List list2 = this.additional_buyer_info;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_buyer_info=", arrayList, list2);
        }
        List list3 = this.fulfillment_options;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fulfillment_options=", arrayList, list3);
        }
        LocalTippingConfiguration localTippingConfiguration = this.tipping_configuration;
        if (localTippingConfiguration != null) {
            arrayList.add("tipping_configuration=" + localTippingConfiguration);
        }
        LocalPaymentOption localPaymentOption = this.payment_option;
        if (localPaymentOption != null) {
            arrayList.add("payment_option=" + localPaymentOption);
        }
        LegalConsent legalConsent = this.legal_consent;
        if (legalConsent != null) {
            arrayList.add("legal_consent=" + legalConsent);
        }
        LocalOnboardingUpsell localOnboardingUpsell = this.onboarding_upsell;
        if (localOnboardingUpsell != null) {
            arrayList.add("onboarding_upsell=" + localOnboardingUpsell);
        }
        LocalFulfillment localFulfillment = this.fulfillment;
        if (localFulfillment != null) {
            arrayList.add("fulfillment=" + localFulfillment);
        }
        LocalCashConfiguration localCashConfiguration = this.redeemable_local_cash_configuration;
        if (localCashConfiguration != null) {
            arrayList.add("redeemable_local_cash_configuration=" + localCashConfiguration);
        }
        LocalCashEarningsConfiguration localCashEarningsConfiguration = this.local_cash_earnings_configuration;
        if (localCashEarningsConfiguration != null) {
            arrayList.add("local_cash_earnings_configuration=" + localCashEarningsConfiguration);
        }
        List list4 = this.payment_methods;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_methods=", arrayList, list4);
        }
        PreferredPaymentMethod preferredPaymentMethod = this.preferred_payment_method;
        if (preferredPaymentMethod != null) {
            arrayList.add("preferred_payment_method=" + preferredPaymentMethod);
        }
        BrandBanner brandBanner = this.order_detail_banner;
        if (brandBanner != null) {
            arrayList.add("order_detail_banner=" + brandBanner);
        }
        CartLoyaltySummary cartLoyaltySummary = this.cart_loyalty_summary;
        if (cartLoyaltySummary != null) {
            arrayList.add("cart_loyalty_summary=" + cartLoyaltySummary);
        }
        List list5 = this.available_order_workflows;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_order_workflows=", arrayList, list5);
        }
        LocalMoney localMoney = this.tip_amount;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tip_amount=", localMoney, arrayList);
        }
        Boolean bool = this.redeem_local_cash;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("redeem_local_cash=", bool, arrayList);
        }
        List list6 = this.gift_cards;
        if (!list6.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("gift_cards=", arrayList, list6);
        }
        List list7 = this.discount_codes;
        if (!list7.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_codes=", arrayList, list7);
        }
        LocalCheckoutBrandSummary localCheckoutBrandSummary = this.local_checkout_brand_summary;
        if (localCheckoutBrandSummary != null) {
            arrayList.add("local_checkout_brand_summary=" + localCheckoutBrandSummary);
        }
        LocalCheckoutLocationSummary localCheckoutLocationSummary = this.local_checkout_location_summary;
        if (localCheckoutLocationSummary != null) {
            arrayList.add("local_checkout_location_summary=" + localCheckoutLocationSummary);
        }
        List list8 = this.required_inputs;
        if (!list8.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("required_inputs=", arrayList, list8);
        }
        Boolean bool2 = this.required_inputs_fulfilled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("required_inputs_fulfilled=", bool2, arrayList);
        }
        ShippingRateConfiguration shippingRateConfiguration = this.shipping_rate_configuration;
        if (shippingRateConfiguration != null) {
            arrayList.add("shipping_rate_configuration=" + shippingRateConfiguration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateCartResponse{", "}", 0, null, null, 56);
    }
}
