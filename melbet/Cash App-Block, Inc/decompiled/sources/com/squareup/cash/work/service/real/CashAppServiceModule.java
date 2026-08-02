package com.squareup.cash.work.service.real;

import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.viewmodels.InputError;
import app.cash.local.viewmodels.OrderBuilderModel;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.service.api.MultipassService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public abstract class CashAppServiceModule {
    public static final OrderBuilderModel.BuyerInfo.UiReady.Editing asEditable(OrderBuilderModel.BuyerInfo buyerInfo) {
        buyerInfo.getClass();
        if (buyerInfo instanceof OrderBuilderModel.BuyerInfo.UiReady.Editing) {
            return (OrderBuilderModel.BuyerInfo.UiReady.Editing) buyerInfo;
        }
        if (buyerInfo instanceof OrderBuilderModel.BuyerInfo.Unvalidated) {
            OrderBuilderModel.BuyerInfo.Unvalidated unvalidated = (OrderBuilderModel.BuyerInfo.Unvalidated) buyerInfo;
            return new OrderBuilderModel.BuyerInfo.UiReady.Editing(unvalidated.name, unvalidated.phone, unvalidated.legalConsent);
        }
        if (buyerInfo instanceof OrderBuilderModel.BuyerInfo.UiReady.Validated) {
            OrderBuilderModel.BuyerInfo.UiReady.Validated validated = (OrderBuilderModel.BuyerInfo.UiReady.Validated) buyerInfo;
            return new OrderBuilderModel.BuyerInfo.UiReady.Editing(validated.name, validated.phone, validated.legalConsent);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCardMerchantInfoFeedbackWithAddress.deepLinkSpecs;
    }

    public static final LocalMoney getDisplayTotal(OrderBuilderModel orderBuilderModel) {
        LocalMoney localMoney;
        LocalMoney localMoney2;
        ComputedOrderSummary.Row grandTotalRow;
        orderBuilderModel.getClass();
        ComputedOrderSummary computedOrderSummary = orderBuilderModel.computedOrderSummary;
        if (computedOrderSummary == null || (grandTotalRow = ComputedOrderSummaryKt.getGrandTotalRow(computedOrderSummary)) == null || (localMoney = grandTotalRow.amount) == null) {
            localMoney = orderBuilderModel.cart.total;
        }
        return (orderBuilderModel.computedOrderSummary != null || (localMoney2 = orderBuilderModel.tipAmount) == null) ? localMoney : LocalMoneysKt.plus(localMoney, localMoney2);
    }

    public static MultipassService provideMultipassService(Retrofit retrofit) {
        Object create = retrofit.create(MultipassService.class);
        create.getClass();
        return (MultipassService) create;
    }

    public static final OrderBuilderModel.BuyerInfo.UiReady validateForCheckout(OrderBuilderModel.BuyerInfo buyerInfo, AndroidStringManager androidStringManager, boolean z) {
        InputError valueMissing;
        InputError valueMissing2;
        buyerInfo.getClass();
        if (buyerInfo instanceof OrderBuilderModel.BuyerInfo.UiReady.Validated) {
            return (OrderBuilderModel.BuyerInfo.UiReady) buyerInfo;
        }
        String name = buyerInfo.getName();
        if (name == null || StringsKt.isBlank(name)) {
            valueMissing = new InputError.ValueMissing(androidStringManager.get(R.string.local_presenters_name_required));
        } else {
            String name2 = buyerInfo.getName();
            name2.getClass();
            valueMissing = name2.length() > 50 ? new InputError.TextTooLong(50) : null;
        }
        String phone = buyerInfo.getPhone();
        if (phone == null || StringsKt.isBlank(phone)) {
            valueMissing2 = new InputError.ValueMissing(androidStringManager.get(R.string.local_presenters_phone_required));
        } else {
            String phone2 = buyerInfo.getPhone();
            phone2.getClass();
            valueMissing2 = phone2.length() > 20 ? new InputError.TextTooLong(20) : null;
        }
        if (valueMissing != null || valueMissing2 != null) {
            String name3 = buyerInfo.getName();
            if (!z) {
                valueMissing = null;
            }
            return new OrderBuilderModel.BuyerInfo.UiReady.Editing(name3, valueMissing, buyerInfo.getPhone(), z ? valueMissing2 : null, buyerInfo.getLegalConsent());
        }
        String name4 = buyerInfo.getName();
        name4.getClass();
        String phone3 = buyerInfo.getPhone();
        phone3.getClass();
        return new OrderBuilderModel.BuyerInfo.UiReady.Validated(name4, phone3, buyerInfo.getLegalConsent());
    }
}
