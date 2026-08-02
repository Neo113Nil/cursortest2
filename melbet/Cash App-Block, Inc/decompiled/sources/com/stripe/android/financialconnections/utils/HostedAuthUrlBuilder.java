package com.stripe.android.financialconnections.utils;

import com.google.android.datatransport.cct.StringMerger;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.model.LinkMode;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes8.dex */
public final class HostedAuthUrlBuilder {
    public static String create(FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs, String str, ElementsSessionContext.PrefillDetails prefillDetails) {
        financialConnectionsSheetActivityArgs.getClass();
        boolean z = StringMerger.getFlowType(financialConnectionsSheetActivityArgs) == FinancialConnectionsSheetFlowType.ForInstantDebits;
        ElementsSessionContext elementsSessionContext = financialConnectionsSheetActivityArgs.getElementsSessionContext();
        LinkMode linkMode = elementsSessionContext != null ? elementsSessionContext.linkMode : null;
        ElementsSessionContext elementsSessionContext2 = financialConnectionsSheetActivityArgs.getElementsSessionContext();
        ElementsSessionContext.BillingDetails billingDetails = elementsSessionContext2 != null ? elementsSessionContext2.billingDetails : null;
        ElementsSessionContext elementsSessionContext3 = financialConnectionsSheetActivityArgs.getElementsSessionContext();
        ElementsSessionContext.AllowRedisplay allowRedisplay = elementsSessionContext3 != null ? elementsSessionContext3.allowRedisplay : null;
        if (str == null) {
            return null;
        }
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(str);
        if (z) {
            mutableListOf.add("return_payment_method=true");
            mutableListOf.add("expand_payment_method=true");
            mutableListOf.add("instantDebitsIncentive=false");
            if (linkMode != null) {
                mutableListOf.add("link_mode=".concat(linkMode.value));
            }
            if (billingDetails != null) {
                Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("billingDetails", ComposeUtilsKt.toApiParams(billingDetails)));
                mutableListOf.add(mapOf != null ? CollectionsKt.joinToString$default(JsonUtilsKt.flattenParamsMap(null, JsonUtilsKt.compactParams(mapOf)), "&", null, null, 0, null, new MarkdownParser$$ExternalSyntheticLambda0(4), 30) : "");
            }
            if (allowRedisplay != null) {
                mutableListOf.add("allow_redisplay=".concat(allowRedisplay.value));
            }
        }
        if (prefillDetails != null) {
            String str2 = prefillDetails.email;
            if (str2 != null) {
                mutableListOf.add("email=".concat(str2));
            }
            String str3 = prefillDetails.phone;
            if (str3 != null) {
                mutableListOf.add("linkMobilePhone=".concat(str3));
            }
            String str4 = prefillDetails.phoneCountryCode;
            if (str4 != null) {
                mutableListOf.add("linkMobilePhoneCountry=".concat(str4));
            }
        }
        mutableListOf.add("launched_by=android_sdk");
        return CollectionsKt.joinToString$default(mutableListOf, "&", null, null, 0, null, null, 62);
    }
}
