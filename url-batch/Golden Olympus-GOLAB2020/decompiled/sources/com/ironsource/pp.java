package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.cg;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.BasePlacement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class pp implements cg, cg.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18697a = "CappingManager.IS_DELIVERY_ENABLED";

    /* renamed from: b, reason: collision with root package name */
    private static final String f18698b = "CappingManager.IS_CAPPING_ENABLED";

    /* renamed from: c, reason: collision with root package name */
    private static final String f18699c = "CappingManager.IS_PACING_ENABLED";

    /* renamed from: d, reason: collision with root package name */
    private static final String f18700d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* renamed from: e, reason: collision with root package name */
    private static final String f18701e = "CappingManager.CAPPING_TYPE";

    /* renamed from: f, reason: collision with root package name */
    private static final String f18702f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* renamed from: g, reason: collision with root package name */
    private static final String f18703g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* renamed from: h, reason: collision with root package name */
    private static final String f18704h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* renamed from: i, reason: collision with root package name */
    private static final String f18705i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18706a;

        static {
            int[] iArr = new int[qp.values().length];
            f18706a = iArr;
            try {
                iArr[qp.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18706a[qp.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    private long a(qp qpVar) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i4 = a.f18706a[qpVar.ordinal()];
        if (i4 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i4 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private b b(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f18697a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f18699c, str2), false)) {
            if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, a(str, f18705i, str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, a(str, f18702f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f18698b, str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a(str, f18700d, str2), 0);
            String a4 = a(str, f18703g, str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a4, 0);
            String a5 = a(str, f18704h, str2);
            if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a5, 0L)) {
                IronSourceUtils.saveIntToSharedPrefs(context, a4, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, a5, 0L);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.cg.a
    public synchronized void c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null || basePlacement == null) {
            return;
        }
        mp placementAvailabilitySettings = basePlacement.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, a(ad_unit), basePlacement.getPlacementName(), placementAvailabilitySettings);
    }

    @Override // com.ironsource.cg
    public synchronized b a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return b.NOT_CAPPED;
        }
        if (basePlacement == null) {
            return b.NOT_CAPPED;
        }
        String a4 = a(ad_unit);
        if (basePlacement.getPlacementName() == null) {
            return b.NOT_CAPPED;
        }
        if (basePlacement.getPlacementAvailabilitySettings() == null) {
            return b.NOT_CAPPED;
        }
        return b(context, a4, basePlacement.getPlacementName());
    }

    @Override // com.ironsource.cg
    public synchronized boolean b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        return a(context, basePlacement, ad_unit) != b.NOT_CAPPED;
    }

    private String a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit == IronSource.AD_UNIT.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    private String a(String str, String str2, String str3) {
        return str + BundleUtil.UNDERLINE_TAG + str2 + BundleUtil.UNDERLINE_TAG + str3;
    }

    @Override // com.ironsource.cg.a
    public synchronized void a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(ad_unit), str);
    }

    private void a(Context context, String str, String str2) {
        qp qpVar;
        int i4 = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f18699c, str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, a(str, f18705i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f18698b, str2), false)) {
            String a4 = a(str, f18703g, str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a4, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, a(str, f18701e, str2), qp.PER_DAY.toString());
                qp[] values = qp.values();
                int length = values.length;
                while (true) {
                    if (i4 >= length) {
                        qpVar = null;
                        break;
                    }
                    qpVar = values[i4];
                    if (qpVar.f18873a.equals(stringFromSharedPrefs)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                IronSourceUtils.saveLongToSharedPrefs(context, a(str, f18704h, str2), a(qpVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a4, intFromSharedPrefs + 1);
        }
    }

    private void a(Context context, String str, String str2, mp mpVar) {
        boolean e4 = mpVar.e();
        IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f18697a, str2), e4);
        if (e4) {
            boolean d4 = mpVar.d();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f18698b, str2), d4);
            if (d4) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, f18700d, str2), mpVar.b());
                IronSourceUtils.saveStringToSharedPrefs(context, a(str, f18701e, str2), mpVar.a().toString());
            }
            boolean f4 = mpVar.f();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f18699c, str2), f4);
            if (f4) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, f18702f, str2), mpVar.c());
            }
        }
    }
}
