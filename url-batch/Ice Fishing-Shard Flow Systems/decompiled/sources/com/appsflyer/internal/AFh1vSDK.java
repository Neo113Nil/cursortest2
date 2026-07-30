package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.migration.internal.MigrationDataProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.H;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1vSDK implements AFh1wSDK {
    private final AFj1rSDK AFAdRevenueData;
    private boolean component2;
    private boolean component3;
    private final AFc1kSDK getCurrencyIso4217Code;
    private Long getMediationNetwork;
    private Long getMonetizationNetwork;
    private JSONObject getRevenue;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1lSDK.values().length];
            try {
                iArr[AFe1lSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1lSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
        }
    }

    public AFh1vSDK(AFc1kSDK aFc1kSDK, AFj1rSDK aFj1rSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.AFAdRevenueData = aFj1rSDK;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final boolean AFAdRevenueData() {
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        JSONObject jSONObject = this.getRevenue;
        if (jSONObject != null) {
            Intrinsics.b(jSONObject);
            getMonetizationNetwork("attr", aFh1sSDK, jSONObject);
        } else {
            JSONObject currencyIso4217Code = getCurrencyIso4217Code();
            if (currencyIso4217Code != null) {
                getMonetizationNetwork("attr", aFh1sSDK, currencyIso4217Code);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final boolean getMediationNetwork() {
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void getMonetizationNetwork(AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            getMonetizationNetwork("attr", aFh1sSDK, attributionData);
            this.component3 = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void getRevenue() {
        this.component2 = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void u_(Intent intent, AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component2 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1oSDK};
            Map map = AFa1kSDK.f4295i;
            Object obj = map.get(-1523018365);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 37, View.MeasureSpec.getMode(0))).getDeclaredConstructor(Uri.class, AFa1oSDK.class);
                map.put(-1523018365, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            Object obj2 = map.get(275685916);
            if (obj2 == null) {
                obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, TextUtils.indexOf("", "", 0))).getMethod("getMediationNetwork", null);
                map.put(275685916, obj2);
            }
            Object invoke = ((Method) obj2).invoke(newInstance, null);
            Object obj3 = map.get(-1366801308);
            if (obj3 == null) {
                obj3 = ((Class) AFa1kSDK.getMediationNetwork((char) (44102 - View.MeasureSpec.getMode(0)), 50 - (ViewConfiguration.getFadingEdgeLength() >> 16), 36 - ((byte) KeyEvent.getModifierMetaStateMask()))).getMethod("getMediationNetwork", null);
                map.put(-1366801308, obj3);
            }
            this.component2 = !((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (waitForDeepLinkingData != null) {
            this.getMediationNetwork = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            getMonetizationNetwork("dl", aFh1sSDK, waitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    private final void getMonetizationNetwork(String str, AFh1sSDK aFh1sSDK, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("branch", hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("external", hashMap2);
        aFh1sSDK.getCurrencyIso4217Code(hashMap3);
        Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFe1lSDK revenue = aFh1sSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        getMonetizationNetwork(map, revenue);
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void getCurrencyIso4217Code(AFf1tSDK aFf1tSDK, Function0<Unit> function0) {
        JSONObject currencyIso4217Code;
        Intrinsics.checkNotNullParameter(aFf1tSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.getCurrencyIso4217Code.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) == 1 && aFf1tSDK.getMonetizationNetwork == AFe1lSDK.CONVERSION && this.AFAdRevenueData.AFAdRevenueData() && !AFAdRevenueData() && (currencyIso4217Code = getCurrencyIso4217Code()) != null) {
            this.getRevenue = currencyIso4217Code;
            function0.invoke();
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map, AFe1lSDK aFe1lSDK) {
        Long l7;
        int i2 = AFa1uSDK.getRevenue[aFe1lSDK.ordinal()];
        if (i2 != 1) {
            l7 = i2 != 2 ? null : this.getMonetizationNetwork;
        } else {
            l7 = this.getMediationNetwork;
        }
        if (l7 != null) {
            long longValue = l7.longValue();
            Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("migration", H.b(new Pair("delay", Long.valueOf(longValue))));
        }
    }

    private final JSONObject getCurrencyIso4217Code() {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (waitForAttributionData != null) {
            this.getMonetizationNetwork = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        }
        return waitForAttributionData;
    }
}
