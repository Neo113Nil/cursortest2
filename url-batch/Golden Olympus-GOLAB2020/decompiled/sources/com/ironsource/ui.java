package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ms;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ui {

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19928a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19928a = iArr;
        }
    }

    @NotNull
    public final IronSourceError a(@NotNull nr error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return (error.c() == 2070 || error.c() == 2110) ? wb.f20181a.b() : (error.c() == 2080 || error.c() == 2100) ? wb.f20181a.c() : error.c() == 2090 ? wb.f20181a.a() : new IronSourceError(510, error.d());
    }

    public final void b(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ig.f16710a.a(callback);
    }

    public final void a(long j4, @NotNull ms.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("isMultipleAdObjects", 1);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j4);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.a());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        br.i().a(new zb(IronSourceConstants.SDK_INIT_SUCCESS, mediationAdditionalData));
    }

    public final void a(@NotNull nr error, long j4) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("errorCode", error.c());
            mediationAdditionalData.put("reason", error.d());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j4);
            mediationAdditionalData.put("isMultipleAdObjects", 1);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        br.i().a(new zb(IronSourceConstants.SDK_INIT_FAILED, mediationAdditionalData));
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ig.a(ig.f16710a, runnable, 0L, 2, (Object) null);
    }

    @NotNull
    public final IronSource.AD_UNIT[] a(@NotNull List<? extends IronSourceAds.AdFormat> adFormats) {
        IronSource.AD_UNIT ad_unit;
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i4 = a.f19928a[it.next().ordinal()];
            if (i4 == 1) {
                ad_unit = IronSource.AD_UNIT.BANNER;
            } else if (i4 == 2) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            } else if (i4 == 3) {
                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            }
            arrayList.add(ad_unit);
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }
}
