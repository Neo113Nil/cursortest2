package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.migration.internal.MigrationDataProvider;
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
public final class AFh1oSDK implements AFh1pSDK {
    private Long AFAdRevenueData;
    private boolean component1;
    private boolean component2;
    private JSONObject getCurrencyIso4217Code;
    private Long getMediationNetwork;
    private final AFc1oSDK getMonetizationNetwork;
    private final AFj1sSDK getRevenue;

    public AFh1oSDK(AFc1oSDK aFc1oSDK, AFj1sSDK aFj1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        this.getMonetizationNetwork = aFc1oSDK;
        this.getRevenue = aFj1sSDK;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            AFAdRevenueData("attr", aFh1mSDK, attributionData);
            this.component2 = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject jSONObject = this.getCurrencyIso4217Code;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            AFAdRevenueData("attr", aFh1mSDK, jSONObject);
        } else {
            JSONObject currencyIso4217Code = getCurrencyIso4217Code();
            if (currencyIso4217Code != null) {
                AFAdRevenueData("attr", aFh1mSDK, currencyIso4217Code);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFf1rSDK aFf1rSDK, Function0<Unit> function0) {
        JSONObject currencyIso4217Code;
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.getMonetizationNetwork.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 1 && aFf1rSDK.getRevenue == AFe1pSDK.CONVERSION && this.getRevenue.getMediationNetwork() && !getRevenue() && (currencyIso4217Code = getCurrencyIso4217Code()) != null) {
            this.getCurrencyIso4217Code = currencyIso4217Code;
            function0.invoke();
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

    private final void AFAdRevenueData(String str, AFh1mSDK aFh1mSDK, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("branch", hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("external", hashMap2);
        aFh1mSDK.AFAdRevenueData(hashMap3);
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFe1pSDK AFAdRevenueData = aFh1mSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        getMonetizationNetwork(map, AFAdRevenueData);
    }

    private final void getMonetizationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        Long l;
        int i = AFa1uSDK.AFAdRevenueData[aFe1pSDK.ordinal()];
        if (i == 1) {
            l = this.AFAdRevenueData;
        } else {
            l = i != 2 ? null : this.getMediationNetwork;
        }
        if (l != null) {
            long longValue = l.longValue();
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("migration", MapsKt.mapOf(TuplesKt.to("delay", Long.valueOf(longValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getRevenue() {
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getMonetizationNetwork() {
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void AFAdRevenueData() {
        this.component1 = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void u_(Intent intent, AFa1mSDK aFa1mSDK) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component1 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1mSDK};
            Object obj = AFa1hSDK.d.get(862139947);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (62049 - ExpandableListView.getPackedPositionGroup(0L)), 37 - (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                AFa1hSDK.d.put(862139947, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            Object obj2 = AFa1hSDK.d.get(-180621578);
            if (obj2 == null) {
                obj2 = ((Class) AFa1hSDK.getRevenue((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (62050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36)).getMethod("getMediationNetwork", null);
                AFa1hSDK.d.put(-180621578, obj2);
            }
            Object invoke = ((Method) obj2).invoke(newInstance, null);
            Object obj3 = AFa1hSDK.d.get(614194017);
            if (obj3 == null) {
                obj3 = ((Class) AFa1hSDK.getRevenue(Color.blue(0) + 37, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 52 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", null);
                AFa1hSDK.d.put(614194017, obj3);
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

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (waitForDeepLinkingData != null) {
            this.AFAdRevenueData = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            AFAdRevenueData("dl", aFh1mSDK, waitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1pSDK.values().length];
            try {
                iArr[AFe1pSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1pSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
        }
    }
}
