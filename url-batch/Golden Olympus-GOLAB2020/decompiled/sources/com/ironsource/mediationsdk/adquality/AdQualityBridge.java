package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C1481i1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.br;
import com.ironsource.de;
import com.ironsource.ee;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.o9;
import com.ironsource.zb;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class AdQualityBridge {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() {
            try {
                return Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getDeclaredMethods().length >= 10;
            } catch (Throwable th) {
                o9.d().a(th);
                logEvent$default(this, 84, null, null, 6, null);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(int i4, Integer num, String str) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            if (num != null) {
                mediationAdditionalData.put("errorCode", num.intValue());
            }
            if (str != null) {
                mediationAdditionalData.put("reason", str);
            }
            br.i().a(new zb(i4, mediationAdditionalData));
        }

        static /* synthetic */ void logEvent$default(Companion companion, int i4, Integer num, String str, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                num = null;
            }
            if ((i5 & 4) != 0) {
                str = null;
            }
            companion.logEvent(i4, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i4 = 0;
            String[] strArr = (String[]) StringsKt.split$default(new Regex("[^0-9.]").replace(str, ""), new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
            String[] strArr2 = (String[]) StringsKt.split$default(new Regex("[^0-9.]").replace(str2, ""), new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
            while (i4 < strArr.length && i4 < strArr2.length && Intrinsics.areEqual(strArr[i4], strArr2[i4])) {
                i4++;
            }
            if (i4 >= strArr.length || i4 >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int intValue = Integer.valueOf(strArr[i4]).intValue();
            Integer valueOf = Integer.valueOf(strArr2[i4]);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(vals2[i])");
            return Integer.signum(Intrinsics.compare(intValue, valueOf.intValue()));
        }

        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdQualityBridge(@NotNull Context context, @NotNull String appKey, @Nullable String str, @NotNull C1481i1 adQualityDataProvider, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(adQualityDataProvider, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i4)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            public void adQualitySdkInitFailed(@NotNull ISAdQualityInitError isAdQualityInitError, @NotNull String message) {
                Intrinsics.checkNotNullParameter(isAdQualityInitError, "isAdQualityInitError");
                Intrinsics.checkNotNullParameter(message, "message");
                AdQualityBridge.Companion.logEvent(isAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED ? 82 : 83, Integer.valueOf(isAdQualityInitError.getValue()), message);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + message, 3);
            }

            public void adQualitySdkInitSuccess() {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, 81, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject a4 = adQualityDataProvider.a();
            if (a4.length() > 0) {
                deviceIdType.setMetaData(a4);
            }
        }
        Companion.logEvent$default(companion, 80, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i4) {
        return i4 != 0 ? i4 != 2 ? i4 != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.VERBOSE;
    }

    private static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String a4 = de.a().a("is_coppa");
        return a4 != null && Boolean.parseBoolean(a4);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(de.a().a(ee.f16004N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(int i4, Integer num, String str) {
        Companion.logEvent(i4, num, str);
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(@NotNull IronSourceSegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (segment.getSegmentName() != null) {
            builder.setSegmentName(segment.getSegmentName());
        }
        if (segment.getAge() > -1) {
            builder.setAge(segment.getAge());
        }
        if (segment.getGender() != null) {
            builder.setGender(segment.getGender());
        }
        if (segment.getLevel() > -1) {
            builder.setLevel(segment.getLevel());
        }
        if (segment.getIsPaying() != null) {
            builder.setIsPaying(segment.getIsPaying().get());
        }
        if (segment.getIapt() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.getIapt());
        }
        if (segment.getUcd() > 0) {
            builder.setUserCreationDate(segment.getUcd());
        }
        ArrayList<Pair<String, String>> segmentData = segment.getSegmentData();
        int size = segmentData.size();
        int i4 = 0;
        while (i4 < size) {
            Pair<String, String> pair = segmentData.get(i4);
            i4++;
            Pair<String, String> pair2 = pair;
            String key = (String) pair2.first;
            String str = (String) pair2.second;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (StringsKt.K(key, "custom_", false, 2, null)) {
                builder.setCustomData(StringsKt.v0(key, "custom_"), str);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
