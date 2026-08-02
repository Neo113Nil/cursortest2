package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateCartResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.squareup.wire.ProtoAdapter
    public final java.lang.Object decode(com.squareup.wire.ProtoReader r34) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.protos.cash.local.client.v1.CreateCartResponse$Companion$ADAPTER$1.decode(com.squareup.wire.ProtoReader):java.lang.Object");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateCartResponse createCartResponse = (CreateCartResponse) obj;
        reverseProtoWriter.getClass();
        createCartResponse.getClass();
        reverseProtoWriter.writeBytes(createCartResponse.unknownFields());
        zzho zzhoVar = createCartResponse.response;
        if (zzhoVar instanceof CreateCartResponse$Response$Cart) {
            LocalCart.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CreateCartResponse$Response$Cart) zzhoVar).value);
        } else if (zzhoVar instanceof CreateCartResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((CreateCartResponse$Response$ErrorResponse) zzhoVar).value);
        } else if (zzhoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ShippingRateConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 27, createCartResponse.shipping_rate_configuration);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, createCartResponse.required_inputs_fulfilled);
        RequiredInput.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 25, createCartResponse.required_inputs);
        LocalCheckoutLocationSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 22, createCartResponse.local_checkout_location_summary);
        LocalCheckoutBrandSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 21, createCartResponse.local_checkout_brand_summary);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 20, createCartResponse.discount_codes);
        GiftCard.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 19, createCartResponse.gift_cards);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, createCartResponse.redeem_local_cash);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 17, createCartResponse.tip_amount);
        OrderWorkflow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 23, createCartResponse.available_order_workflows);
        CreateCartResponse.CartLoyaltySummary.ADAPTER.encodeWithTag(reverseProtoWriter, 15, createCartResponse.cart_loyalty_summary);
        BrandBanner.ADAPTER.encodeWithTag(reverseProtoWriter, 14, createCartResponse.order_detail_banner);
        PreferredPaymentMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 16, createCartResponse.preferred_payment_method);
        LocalPaymentMethod.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 13, createCartResponse.payment_methods);
        LocalCashEarningsConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 12, createCartResponse.local_cash_earnings_configuration);
        LocalCashConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 11, createCartResponse.redeemable_local_cash_configuration);
        LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 10, createCartResponse.fulfillment);
        LocalOnboardingUpsell.ADAPTER.encodeWithTag(reverseProtoWriter, 8, createCartResponse.onboarding_upsell);
        LegalConsent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, createCartResponse.legal_consent);
        ProtoAdapter protoAdapter2 = LocalPaymentOption.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, createCartResponse.payment_option);
        LocalTippingConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 5, createCartResponse.tipping_configuration);
        LocalFulfillmentOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, createCartResponse.fulfillment_options);
        LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, createCartResponse.additional_buyer_info);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, createCartResponse.payment_options);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CreateCartResponse createCartResponse = (CreateCartResponse) obj;
        createCartResponse.getClass();
        int size$okio = createCartResponse.unknownFields().getSize$okio();
        zzho zzhoVar = createCartResponse.response;
        if (zzhoVar instanceof CreateCartResponse$Response$Cart) {
            encodedSizeWithTag = LocalCart.ADAPTER.encodedSizeWithTag(1, ((CreateCartResponse$Response$Cart) zzhoVar).value);
        } else {
            if (!(zzhoVar instanceof CreateCartResponse$Response$ErrorResponse)) {
                if (zzhoVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = LocalPaymentOption.ADAPTER;
                int encodedSizeWithTag2 = LocalMoney.ADAPTER.encodedSizeWithTag(17, createCartResponse.tip_amount) + OrderWorkflow.ADAPTER.asRepeated().encodedSizeWithTag(23, createCartResponse.available_order_workflows) + CreateCartResponse.CartLoyaltySummary.ADAPTER.encodedSizeWithTag(15, createCartResponse.cart_loyalty_summary) + BrandBanner.ADAPTER.encodedSizeWithTag(14, createCartResponse.order_detail_banner) + PreferredPaymentMethod.ADAPTER.encodedSizeWithTag(16, createCartResponse.preferred_payment_method) + LocalPaymentMethod.ADAPTER.asRepeated().encodedSizeWithTag(13, createCartResponse.payment_methods) + LocalCashEarningsConfiguration.ADAPTER.encodedSizeWithTag(12, createCartResponse.local_cash_earnings_configuration) + LocalCashConfiguration.ADAPTER.encodedSizeWithTag(11, createCartResponse.redeemable_local_cash_configuration) + LocalFulfillment.ADAPTER.encodedSizeWithTag(10, createCartResponse.fulfillment) + LocalOnboardingUpsell.ADAPTER.encodedSizeWithTag(8, createCartResponse.onboarding_upsell) + LegalConsent.ADAPTER.encodedSizeWithTag(7, createCartResponse.legal_consent) + protoAdapter.encodedSizeWithTag(6, createCartResponse.payment_option) + LocalTippingConfiguration.ADAPTER.encodedSizeWithTag(5, createCartResponse.tipping_configuration) + LocalFulfillmentOption.ADAPTER.asRepeated().encodedSizeWithTag(4, createCartResponse.fulfillment_options) + LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, createCartResponse.additional_buyer_info) + protoAdapter.asRepeated().encodedSizeWithTag(2, createCartResponse.payment_options) + size$okio;
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return ShippingRateConfiguration.ADAPTER.encodedSizeWithTag(27, createCartResponse.shipping_rate_configuration) + protoAdapter2.encodedSizeWithTag(26, createCartResponse.required_inputs_fulfilled) + RequiredInput.ADAPTER.asRepeated().encodedSizeWithTag(25, createCartResponse.required_inputs) + LocalCheckoutLocationSummary.ADAPTER.encodedSizeWithTag(22, createCartResponse.local_checkout_location_summary) + LocalCheckoutBrandSummary.ADAPTER.encodedSizeWithTag(21, createCartResponse.local_checkout_brand_summary) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(20, createCartResponse.discount_codes) + GiftCard.ADAPTER.asRepeated().encodedSizeWithTag(19, createCartResponse.gift_cards) + protoAdapter2.encodedSizeWithTag(18, createCartResponse.redeem_local_cash) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(9, ((CreateCartResponse$Response$ErrorResponse) zzhoVar).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalPaymentOption.ADAPTER;
        int encodedSizeWithTag22 = LocalMoney.ADAPTER.encodedSizeWithTag(17, createCartResponse.tip_amount) + OrderWorkflow.ADAPTER.asRepeated().encodedSizeWithTag(23, createCartResponse.available_order_workflows) + CreateCartResponse.CartLoyaltySummary.ADAPTER.encodedSizeWithTag(15, createCartResponse.cart_loyalty_summary) + BrandBanner.ADAPTER.encodedSizeWithTag(14, createCartResponse.order_detail_banner) + PreferredPaymentMethod.ADAPTER.encodedSizeWithTag(16, createCartResponse.preferred_payment_method) + LocalPaymentMethod.ADAPTER.asRepeated().encodedSizeWithTag(13, createCartResponse.payment_methods) + LocalCashEarningsConfiguration.ADAPTER.encodedSizeWithTag(12, createCartResponse.local_cash_earnings_configuration) + LocalCashConfiguration.ADAPTER.encodedSizeWithTag(11, createCartResponse.redeemable_local_cash_configuration) + LocalFulfillment.ADAPTER.encodedSizeWithTag(10, createCartResponse.fulfillment) + LocalOnboardingUpsell.ADAPTER.encodedSizeWithTag(8, createCartResponse.onboarding_upsell) + LegalConsent.ADAPTER.encodedSizeWithTag(7, createCartResponse.legal_consent) + protoAdapter3.encodedSizeWithTag(6, createCartResponse.payment_option) + LocalTippingConfiguration.ADAPTER.encodedSizeWithTag(5, createCartResponse.tipping_configuration) + LocalFulfillmentOption.ADAPTER.asRepeated().encodedSizeWithTag(4, createCartResponse.fulfillment_options) + LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, createCartResponse.additional_buyer_info) + protoAdapter3.asRepeated().encodedSizeWithTag(2, createCartResponse.payment_options) + size$okio;
        ProtoAdapter protoAdapter22 = ProtoAdapter.BOOL;
        return ShippingRateConfiguration.ADAPTER.encodedSizeWithTag(27, createCartResponse.shipping_rate_configuration) + protoAdapter22.encodedSizeWithTag(26, createCartResponse.required_inputs_fulfilled) + RequiredInput.ADAPTER.asRepeated().encodedSizeWithTag(25, createCartResponse.required_inputs) + LocalCheckoutLocationSummary.ADAPTER.encodedSizeWithTag(22, createCartResponse.local_checkout_location_summary) + LocalCheckoutBrandSummary.ADAPTER.encodedSizeWithTag(21, createCartResponse.local_checkout_brand_summary) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(20, createCartResponse.discount_codes) + GiftCard.ADAPTER.asRepeated().encodedSizeWithTag(19, createCartResponse.gift_cards) + protoAdapter22.encodedSizeWithTag(18, createCartResponse.redeem_local_cash) + encodedSizeWithTag22;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateCartResponse createCartResponse = (CreateCartResponse) obj;
        createCartResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(createCartResponse.additional_buyer_info, LocalAdditionalBuyerInfo.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(createCartResponse.fulfillment_options, LocalFulfillmentOption.ADAPTER);
        LocalTippingConfiguration localTippingConfiguration = createCartResponse.tipping_configuration;
        LocalTippingConfiguration localTippingConfiguration2 = localTippingConfiguration != null ? (LocalTippingConfiguration) LocalTippingConfiguration.ADAPTER.redact(localTippingConfiguration) : null;
        LegalConsent legalConsent = createCartResponse.legal_consent;
        LegalConsent legalConsent2 = legalConsent != null ? (LegalConsent) LegalConsent.ADAPTER.redact(legalConsent) : null;
        LocalOnboardingUpsell localOnboardingUpsell = createCartResponse.onboarding_upsell;
        LocalOnboardingUpsell localOnboardingUpsell2 = localOnboardingUpsell != null ? (LocalOnboardingUpsell) LocalOnboardingUpsell.ADAPTER.redact(localOnboardingUpsell) : null;
        LocalFulfillment localFulfillment = createCartResponse.fulfillment;
        LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
        LocalCashConfiguration localCashConfiguration = createCartResponse.redeemable_local_cash_configuration;
        LocalCashConfiguration localCashConfiguration2 = localCashConfiguration != null ? (LocalCashConfiguration) LocalCashConfiguration.ADAPTER.redact(localCashConfiguration) : null;
        LocalCashEarningsConfiguration localCashEarningsConfiguration = createCartResponse.local_cash_earnings_configuration;
        LocalCashEarningsConfiguration localCashEarningsConfiguration2 = localCashEarningsConfiguration != null ? (LocalCashEarningsConfiguration) LocalCashEarningsConfiguration.ADAPTER.redact(localCashEarningsConfiguration) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(createCartResponse.payment_methods, LocalPaymentMethod.ADAPTER);
        PreferredPaymentMethod preferredPaymentMethod = createCartResponse.preferred_payment_method;
        PreferredPaymentMethod preferredPaymentMethod2 = preferredPaymentMethod != null ? (PreferredPaymentMethod) PreferredPaymentMethod.ADAPTER.redact(preferredPaymentMethod) : null;
        BrandBanner brandBanner = createCartResponse.order_detail_banner;
        BrandBanner brandBanner2 = brandBanner != null ? (BrandBanner) BrandBanner.ADAPTER.redact(brandBanner) : null;
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = createCartResponse.cart_loyalty_summary;
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary2 = cartLoyaltySummary != null ? (CreateCartResponse.CartLoyaltySummary) CreateCartResponse.CartLoyaltySummary.ADAPTER.redact(cartLoyaltySummary) : null;
        LocalMoney localMoney = createCartResponse.tip_amount;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(createCartResponse.gift_cards, GiftCard.ADAPTER);
        LocalCheckoutBrandSummary localCheckoutBrandSummary = createCartResponse.local_checkout_brand_summary;
        LocalCheckoutBrandSummary localCheckoutBrandSummary2 = localCheckoutBrandSummary != null ? (LocalCheckoutBrandSummary) LocalCheckoutBrandSummary.ADAPTER.redact(localCheckoutBrandSummary) : null;
        LocalCheckoutLocationSummary localCheckoutLocationSummary = createCartResponse.local_checkout_location_summary;
        LocalCheckoutLocationSummary localCheckoutLocationSummary2 = localCheckoutLocationSummary != null ? (LocalCheckoutLocationSummary) LocalCheckoutLocationSummary.ADAPTER.redact(localCheckoutLocationSummary) : null;
        ArrayList m1169redactElements5 = TransactorKt.m1169redactElements(createCartResponse.required_inputs, RequiredInput.ADAPTER);
        ShippingRateConfiguration shippingRateConfiguration = createCartResponse.shipping_rate_configuration;
        return CreateCartResponse.copy$default(createCartResponse, null, m1169redactElements, m1169redactElements2, localTippingConfiguration2, legalConsent2, localOnboardingUpsell2, localFulfillment2, localCashConfiguration2, localCashEarningsConfiguration2, m1169redactElements3, preferredPaymentMethod2, brandBanner2, cartLoyaltySummary2, localMoney2, m1169redactElements4, localCheckoutBrandSummary2, localCheckoutLocationSummary2, m1169redactElements5, shippingRateConfiguration != null ? (ShippingRateConfiguration) ShippingRateConfiguration.ADAPTER.redact(shippingRateConfiguration) : null, ByteString.EMPTY, 9076771);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateCartResponse createCartResponse = (CreateCartResponse) obj;
        createCartResponse.getClass();
        ProtoAdapter protoAdapter = LocalPaymentOption.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, createCartResponse.payment_options);
        LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, createCartResponse.additional_buyer_info);
        LocalFulfillmentOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, createCartResponse.fulfillment_options);
        LocalTippingConfiguration.ADAPTER.encodeWithTag(protoWriter, 5, createCartResponse.tipping_configuration);
        protoAdapter.encodeWithTag(protoWriter, 6, createCartResponse.payment_option);
        LegalConsent.ADAPTER.encodeWithTag(protoWriter, 7, createCartResponse.legal_consent);
        LocalOnboardingUpsell.ADAPTER.encodeWithTag(protoWriter, 8, createCartResponse.onboarding_upsell);
        LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 10, createCartResponse.fulfillment);
        LocalCashConfiguration.ADAPTER.encodeWithTag(protoWriter, 11, createCartResponse.redeemable_local_cash_configuration);
        LocalCashEarningsConfiguration.ADAPTER.encodeWithTag(protoWriter, 12, createCartResponse.local_cash_earnings_configuration);
        LocalPaymentMethod.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, createCartResponse.payment_methods);
        PreferredPaymentMethod.ADAPTER.encodeWithTag(protoWriter, 16, createCartResponse.preferred_payment_method);
        BrandBanner.ADAPTER.encodeWithTag(protoWriter, 14, createCartResponse.order_detail_banner);
        CreateCartResponse.CartLoyaltySummary.ADAPTER.encodeWithTag(protoWriter, 15, createCartResponse.cart_loyalty_summary);
        OrderWorkflow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 23, createCartResponse.available_order_workflows);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 17, createCartResponse.tip_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 18, createCartResponse.redeem_local_cash);
        GiftCard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, createCartResponse.gift_cards);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 20, createCartResponse.discount_codes);
        LocalCheckoutBrandSummary.ADAPTER.encodeWithTag(protoWriter, 21, createCartResponse.local_checkout_brand_summary);
        LocalCheckoutLocationSummary.ADAPTER.encodeWithTag(protoWriter, 22, createCartResponse.local_checkout_location_summary);
        RequiredInput.ADAPTER.asRepeated().encodeWithTag(protoWriter, 25, createCartResponse.required_inputs);
        protoAdapter2.encodeWithTag(protoWriter, 26, createCartResponse.required_inputs_fulfilled);
        ShippingRateConfiguration.ADAPTER.encodeWithTag(protoWriter, 27, createCartResponse.shipping_rate_configuration);
        zzho zzhoVar = createCartResponse.response;
        if (zzhoVar instanceof CreateCartResponse$Response$Cart) {
            LocalCart.ADAPTER.encodeWithTag(protoWriter, 1, ((CreateCartResponse$Response$Cart) zzhoVar).value);
        } else if (zzhoVar instanceof CreateCartResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 9, ((CreateCartResponse$Response$ErrorResponse) zzhoVar).value);
        } else if (zzhoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(createCartResponse.unknownFields());
    }
}
