package com.facebook.appevents.iap;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.pv;
import defpackage.qv;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseDedupeConfig {
    public static final InAppPurchaseDedupeConfig INSTANCE = new InAppPurchaseDedupeConfig();
    private static final List<String> defaultCurrencyParameterEquivalents = pv.c(AppEventsConstants.EVENT_PARAM_CURRENCY);
    private static final List<String> defaultValueParameterEquivalents = pv.c(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
    private static final long defaultDedupeWindow = 60000;
    private static final List<Pair<String, List<String>>> defaultDedupeParameters = qv.g(new Pair(Constants.IAP_PRODUCT_ID, pv.c(Constants.IAP_PRODUCT_ID)), new Pair(Constants.IAP_PRODUCT_DESCRIPTION, pv.c(Constants.IAP_PRODUCT_DESCRIPTION)), new Pair(Constants.IAP_PRODUCT_TITLE, pv.c(Constants.IAP_PRODUCT_TITLE)), new Pair(Constants.IAP_PURCHASE_TOKEN, pv.c(Constants.IAP_PURCHASE_TOKEN)));

    private InAppPurchaseDedupeConfig() {
    }

    public final Pair<Bundle, OperationalData> addDedupeParameters(Bundle bundle, Bundle bundle2, OperationalData operationalData) {
        Bundle bundle3;
        OperationalData operationalData2;
        if (bundle == null) {
            return new Pair<>(bundle2, operationalData);
        }
        try {
            bundle3 = bundle2;
            operationalData2 = operationalData;
            for (String str : bundle.keySet()) {
                try {
                    String string = bundle.getString(str);
                    if (string != null) {
                        OperationalData.Companion companion = OperationalData.Companion;
                        OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                        str.getClass();
                        Pair<Bundle, OperationalData> addParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, str, string, bundle3, operationalData2);
                        Bundle bundle4 = (Bundle) addParameterAndReturn.m;
                        operationalData2 = (OperationalData) addParameterAndReturn.n;
                        bundle3 = bundle4;
                    }
                } catch (Exception unused) {
                    bundle2 = bundle3;
                    operationalData = operationalData2;
                    bundle3 = bundle2;
                    operationalData2 = operationalData;
                    return new Pair<>(bundle3, operationalData2);
                }
            }
        } catch (Exception unused2) {
        }
        return new Pair<>(bundle3, operationalData2);
    }

    public final Currency getCurrencyOfManualEvent(Bundle bundle) {
        Iterator<String> it = getCurrencyParameterEquivalents().iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                return null;
            }
            String next = it.next();
            if (bundle != null) {
                try {
                    str = bundle.getString(next);
                } catch (Exception unused) {
                    continue;
                }
            }
            if (str != null && str.length() != 0) {
                return Currency.getInstance(str);
            }
        }
    }

    public final List<String> getCurrencyParameterEquivalents() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getCurrencyDedupeParameters() : null) == null || appSettingsWithoutQuery.getCurrencyDedupeParameters().isEmpty()) ? defaultCurrencyParameterEquivalents : appSettingsWithoutQuery.getCurrencyDedupeParameters();
    }

    public final List<Pair<String, List<String>>> getDedupeParameters(boolean z) {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getProdDedupeParameters() : null) == null || appSettingsWithoutQuery.getProdDedupeParameters().isEmpty()) {
            return defaultDedupeParameters;
        }
        if (!z) {
            return appSettingsWithoutQuery.getProdDedupeParameters();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : appSettingsWithoutQuery.getProdDedupeParameters()) {
            Iterator it = ((List) pair.n).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), pv.c(pair.m)));
            }
        }
        return arrayList;
    }

    public final long getDedupeWindow() {
        Long dedupeWindow;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getDedupeWindow() : null) == null || ((dedupeWindow = appSettingsWithoutQuery.getDedupeWindow()) != null && dedupeWindow.longValue() == 0)) ? defaultDedupeWindow : appSettingsWithoutQuery.getDedupeWindow().longValue();
    }

    public final List<Pair<String, List<String>>> getTestDedupeParameters(boolean z) {
        List<Pair<String, List<String>>> testDedupeParameters;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery == null || (testDedupeParameters = appSettingsWithoutQuery.getTestDedupeParameters()) == null || testDedupeParameters.isEmpty()) {
            return null;
        }
        if (!z) {
            return appSettingsWithoutQuery.getTestDedupeParameters();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : appSettingsWithoutQuery.getTestDedupeParameters()) {
            Iterator it = ((List) pair.n).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), pv.c(pair.m)));
            }
        }
        return arrayList;
    }

    public final Double getValueOfManualEvent(Double d, Bundle bundle) {
        if (d != null) {
            return d;
        }
        Iterator<String> it = getValueParameterEquivalents().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(next));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public final List<String> getValueParameterEquivalents() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getPurchaseValueDedupeParameters() : null) == null || appSettingsWithoutQuery.getPurchaseValueDedupeParameters().isEmpty()) ? defaultValueParameterEquivalents : appSettingsWithoutQuery.getPurchaseValueDedupeParameters();
    }
}
