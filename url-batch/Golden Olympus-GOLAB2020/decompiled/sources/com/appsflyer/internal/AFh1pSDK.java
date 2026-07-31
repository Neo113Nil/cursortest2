package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.appsflyer.migration.internal.MigrationDataProvider;
import com.ironsource.C1435b4;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1pSDK implements AFh1uSDK {
    private final AFj1sSDK AFAdRevenueData;
    private boolean component1;
    private boolean component2;
    private final AFc1pSDK getCurrencyIso4217Code;
    private Long getMediationNetwork;
    private JSONObject getMonetizationNetwork;
    private Long getRevenue;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFe1mSDK.values().length];
            try {
                iArr[AFe1mSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1mSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getMediationNetwork = iArr;
        }
    }

    public AFh1pSDK(AFc1pSDK aFc1pSDK, AFj1sSDK aFj1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.AFAdRevenueData = aFj1sSDK;
    }

    private final void getMonetizationNetwork(String str, AFh1rSDK aFh1rSDK, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("branch", hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(C1435b4.f15254e, hashMap2);
        aFh1rSDK.getMediationNetwork(hashMap3);
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFe1mSDK currencyIso4217Code = aFh1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        getMonetizationNetwork(map, currencyIso4217Code);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            getMonetizationNetwork("attr", aFh1rSDK, attributionData);
            this.component2 = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        JSONObject jSONObject = this.getMonetizationNetwork;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            getMonetizationNetwork("attr", aFh1rSDK, jSONObject);
        } else {
            JSONObject currencyIso4217Code = getCurrencyIso4217Code();
            if (currencyIso4217Code != null) {
                getMonetizationNetwork("attr", aFh1rSDK, currencyIso4217Code);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getRevenue(AFf1uSDK aFf1uSDK, Function0<Unit> function0) {
        JSONObject currencyIso4217Code;
        Intrinsics.checkNotNullParameter(aFf1uSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.getCurrencyIso4217Code.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) == 1 && aFf1uSDK.getMonetizationNetwork == AFe1mSDK.CONVERSION && this.AFAdRevenueData.AFAdRevenueData() && !getMonetizationNetwork() && (currencyIso4217Code = getCurrencyIso4217Code()) != null) {
            this.getMonetizationNetwork = currencyIso4217Code;
            function0.invoke();
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void u_(Intent intent, AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component1 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1oSDK};
            Map map = AFa1kSDK.f13355i;
            Object obj = map.get(-1523018365);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(KeyEvent.getDeadChar(0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).getDeclaredConstructor(Uri.class, AFa1oSDK.class);
                map.put(-1523018365, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            Object obj2 = map.get(1191605722);
            if (obj2 == null) {
                obj2 = ((Class) AFa1kSDK.getCurrencyIso4217Code((-1) - MotionEvent.axisFromString(""), (char) TextUtils.indexOf("", ""), 37 - TextUtils.indexOf("", ""))).getMethod("getRevenue", null);
                map.put(1191605722, obj2);
            }
            Object invoke = ((Method) obj2).invoke(newInstance, null);
            Object obj3 = map.get(1984406162);
            if (obj3 == null) {
                obj3 = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, (char) (TextUtils.indexOf("", "") + 44102), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50)).getMethod("getRevenue", null);
                map.put(1984406162, obj3);
            }
            this.component1 = !((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final JSONObject getCurrencyIso4217Code() {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (waitForAttributionData != null) {
            this.getMediationNetwork = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        }
        return waitForAttributionData;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getMediationNetwork() {
        this.component1 = false;
        MigrationDataProvider.clear();
    }

    private final void getMonetizationNetwork(Map<String, Object> map, AFe1mSDK aFe1mSDK) {
        Long l4;
        int i4 = AFa1tSDK.getMediationNetwork[aFe1mSDK.ordinal()];
        if (i4 != 1) {
            l4 = i4 != 2 ? null : this.getMediationNetwork;
        } else {
            l4 = this.getRevenue;
        }
        if (l4 != null) {
            long longValue = l4.longValue();
            Map<String, Object> revenue = com.appsflyer.internal.AFa1tSDK.getRevenue(map);
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            revenue.put("migration", MapsKt.mapOf(TuplesKt.to("delay", Long.valueOf(longValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final boolean getRevenue() {
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final boolean getMonetizationNetwork() {
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (waitForDeepLinkingData != null) {
            this.getRevenue = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            getMonetizationNetwork("dl", aFh1rSDK, waitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }
}
