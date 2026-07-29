package com.chartboost.sdk.Model;

import android.os.Build;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.i;
import com.chartboost.sdk.impl.o;
import com.chartboost.sdk.impl.s;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    public final boolean A;
    public final int B;
    public final boolean C;
    public final int D;
    public final boolean E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final String f3621a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3622b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3623c;

    /* renamed from: d, reason: collision with root package name */
    public final List<String> f3624d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final long s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final List<String> x;
    public final boolean y;
    public final boolean z;

    public e(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f3621a = jSONObject.optString("configVariant");
        this.f3622b = jSONObject.optBoolean("prefetchDisable");
        this.f3623c = jSONObject.optBoolean("publisherDisable");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        boolean z = false;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.isEmpty()) {
                    arrayList.add(optString);
                }
            }
        }
        this.f3624d = Collections.unmodifiableList(arrayList);
        JSONObject optJSONObject2 = jSONObject.optJSONObject(TapjoyConstants.TJC_PLUGIN_NATIVE);
        optJSONObject2 = optJSONObject2 == null ? new JSONObject() : optJSONObject2;
        this.e = optJSONObject2.optBoolean(TJAdUnitConstants.String.ENABLED, true);
        this.f = optJSONObject2.optBoolean("inplayEnabled", true);
        this.g = optJSONObject2.optBoolean("interstitialEnabled", true);
        this.h = optJSONObject2.optBoolean("lockOrientation");
        this.i = optJSONObject2.optInt("prefetchSession", 3);
        this.j = optJSONObject2.optBoolean("rewardVideoEnabled", true);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("trackingLevels");
        optJSONObject3 = optJSONObject3 == null ? new JSONObject() : optJSONObject3;
        this.k = optJSONObject3.optBoolean("critical", true);
        this.r = optJSONObject3.optBoolean("includeStackTrace", true);
        this.l = optJSONObject3.optBoolean("error");
        this.m = optJSONObject3.optBoolean("debug");
        this.n = optJSONObject3.optBoolean(com.umeng.analytics.pro.b.ac);
        this.o = optJSONObject3.optBoolean("system");
        this.p = optJSONObject3.optBoolean("timing");
        this.q = optJSONObject3.optBoolean("user");
        this.s = jSONObject.optLong("getAdRetryBaseMs", com.chartboost.sdk.Libraries.b.f3572b);
        this.t = jSONObject.optInt("getAdRetryMaxBackoffExponent", 5);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("webview");
        optJSONObject4 = optJSONObject4 == null ? new JSONObject() : optJSONObject4;
        boolean z2 = !"Amazon".equalsIgnoreCase(Build.MANUFACTURER) || Build.VERSION.SDK_INT >= 21;
        this.u = optJSONObject4.optInt("cacheMaxBytes", 104857600);
        int optInt = optJSONObject4.optInt("cacheMaxUnits", 10);
        this.v = optInt <= 0 ? 10 : optInt;
        this.w = (int) TimeUnit.SECONDS.toDays(optJSONObject4.optInt("cacheTTLs", com.chartboost.sdk.Libraries.b.f3571a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("directories");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String optString2 = optJSONArray2.optString(i2);
                if (!optString2.isEmpty()) {
                    arrayList2.add(optString2);
                }
            }
        }
        this.x = Collections.unmodifiableList(arrayList2);
        this.y = z2 && optJSONObject4.optBoolean(TJAdUnitConstants.String.ENABLED, a());
        this.z = optJSONObject4.optBoolean("inplayEnabled", true);
        this.A = optJSONObject4.optBoolean("interstitialEnabled", true);
        int optInt2 = optJSONObject4.optInt("invalidatePendingImpression", 3);
        this.B = optInt2 <= 0 ? 3 : optInt2;
        this.C = optJSONObject4.optBoolean("lockOrientation", true);
        this.D = optJSONObject4.optInt("prefetchSession", 3);
        this.E = optJSONObject4.optBoolean("rewardVideoEnabled", true);
        this.F = optJSONObject4.optString("version", "v2");
        this.G = String.format("%s/%s%s", "webview", this.F, "/interstitial/get");
        this.H = String.format("%s/%s/%s", "webview", this.F, "prefetch");
        this.I = String.format("%s/%s%s", "webview", this.F, "/reward/get");
        ArrayList arrayList3 = new ArrayList();
        boolean z3 = i.x != Chartboost.CBPIDataUseConsent.NO_BEHAVIORAL;
        boolean z4 = i.x != Chartboost.CBPIDataUseConsent.NO_BEHAVIORAL;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("certificationProviders");
        if (optJSONObject5 != null && (optJSONObject = optJSONObject5.optJSONObject("moat")) != null) {
            arrayList3.add("moat");
            z = optJSONObject.optBoolean("loggingEnabled", false);
            z3 = optJSONObject.optBoolean("locationEnabled", z3);
            z4 = optJSONObject.optBoolean("idfaCollectionEnabled", z4);
        }
        this.J = z;
        this.K = z3;
        this.L = z4;
        o.a(arrayList3);
    }

    private static boolean a() {
        int[] iArr = {4, 4, 2};
        String d2 = s.a().d();
        if (d2 == null || d2.length() <= 0) {
            return false;
        }
        String[] split = d2.replaceAll("[^\\d.]", "").split("\\.");
        for (int i = 0; i < split.length && i < iArr.length; i++) {
            try {
                if (Integer.valueOf(split[i]).intValue() > iArr[i]) {
                    return true;
                }
                if (Integer.valueOf(split[i]).intValue() < iArr[i]) {
                    return false;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
