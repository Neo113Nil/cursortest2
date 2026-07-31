package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.s7;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class wt {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<IronSource.AD_UNIT, C1539q1> f20245a = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20246a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20247b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f20247b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20247b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20247b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20247b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.AD_UNIT.values().length];
            f20246a = iArr2;
            try {
                iArr2[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20246a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20246a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20246a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final IronSource.AD_UNIT f20248a;

        public b(IronSource.AD_UNIT ad_unit) {
            this.f20248a = ad_unit;
        }

        private String b() {
            IronSource.AD_UNIT ad_unit = this.f20248a;
            return ad_unit != null ? ad_unit.name() : "";
        }

        public String a() {
            return a(null);
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a(String str, String str2) {
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " - " + str2;
            }
            sb.append(str3);
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(str)) {
                return sb2;
            }
            return sb2 + " - " + str;
        }
    }

    public static IronSourceSegment a() {
        return com.ironsource.mediationsdk.p.m().t();
    }

    public static int b(IronSource.AD_UNIT ad_unit) {
        int i4 = a.f20246a[ad_unit.ordinal()];
        return (i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? s7.e.NOT_SUPPORTED : s7.e.BANNER : s7.e.NATIVE_AD : s7.e.INTERSTITIAL : s7.e.REWARDED_VIDEO).a();
    }

    private static C1539q1 a(AbstractC1584w1 abstractC1584w1) {
        Map<IronSource.AD_UNIT, C1539q1> map = f20245a;
        if (map.containsKey(abstractC1584w1.b().a())) {
            return map.get(abstractC1584w1.b().a());
        }
        C1539q1 c1539q1 = new C1539q1();
        map.put(abstractC1584w1.b().a(), c1539q1);
        return c1539q1;
    }

    public static C1553s2 a(AbstractC1584w1 abstractC1584w1, int i4) {
        return a(abstractC1584w1).a(abstractC1584w1.b().c(), abstractC1584w1.m(), i4);
    }

    public static b a(IronSource.AD_UNIT ad_unit) {
        return new b(ad_unit);
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i4 = a.f20247b[adFormat.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "" : "nativeAd" : "banner" : "interstitial" : "rewarded";
    }

    public static void a(int i4, JSONObject jSONObject) {
        br.i().a(new zb(i4, nk.a(IronSourceUtils.getMediationAdditionalData(false), jSONObject)));
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        a(IronSourceConstants.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        a(IronSourceConstants.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }
}
