package com.stripe.android.core.networking;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.inject.Provider;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes8.dex */
public class AnalyticsRequestFactory {
    public static final String DEVICE_TYPE;
    public static final AnalyticsRequestFactory$$ExternalSyntheticLambda0 PLUGIN_TYPE_PROVIDER;
    public static volatile UUID sessionId;
    public final Provider networkTypeProvider;
    public final PackageInfo packageInfo;
    public final PackageManager packageManager;
    public final String packageName;
    public final Provider pluginTypeProvider;
    public final Provider publishableKeyProvider;

    static {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        sessionId = randomUUID;
        DEVICE_TYPE = Boxes$$ExternalSyntheticOutline1.m$1(Build.MANUFACTURER, "_", Build.BRAND, "_", Build.MODEL);
        PLUGIN_TYPE_PROVIDER = new AnalyticsRequestFactory$$ExternalSyntheticLambda0();
    }

    public AnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Provider provider2) {
        AnalyticsRequestFactory$$ExternalSyntheticLambda0 analyticsRequestFactory$$ExternalSyntheticLambda0 = PLUGIN_TYPE_PROVIDER;
        analyticsRequestFactory$$ExternalSyntheticLambda0.getClass();
        this.packageManager = packageManager;
        this.packageInfo = packageInfo;
        this.packageName = str;
        this.publishableKeyProvider = provider;
        this.networkTypeProvider = provider2;
        this.pluginTypeProvider = analyticsRequestFactory$$ExternalSyntheticLambda0;
    }

    public AnalyticsRequest createRequest(AnalyticsEvent analyticsEvent, Map map) {
        Object failure;
        Map m;
        Map map2;
        Map map3;
        analyticsEvent.getClass();
        map.getClass();
        Pair pair = new Pair("analytics_ua", "analytics.stripe_android-1.0");
        try {
            Result.Companion companion = Result.Companion;
            String str = (String) this.publishableKeyProvider.get();
            str.getClass();
            boolean startsWith = StringsKt__StringsJVMKt.startsWith(str, "uk_", false);
            failure = str;
            if (startsWith) {
                failure = "[REDACTED_LIVE_KEY]";
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        Object obj = failure;
        if (z) {
            obj = "pk_undefined";
        }
        Map mapOf = MapsKt__MapsKt.mapOf(pair, new Pair("publishable_key", obj), new Pair("os_name", Build.VERSION.CODENAME), new Pair("os_release", Build.VERSION.RELEASE), new Pair("os_version", Integer.valueOf(Build.VERSION.SDK_INT)), new Pair("device_type", DEVICE_TYPE), new Pair("bindings_version", "23.9.1"), new Pair("is_development", Boolean.FALSE), new Pair("session_id", sessionId), new Pair("timestamp", Double.valueOf(System.currentTimeMillis() / 1000.0d)), new Pair("locale", Locale.getDefault().toString()));
        String str2 = (String) this.networkTypeProvider.get();
        if (str2 == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        } else {
            m = Thread$State$EnumUnboxingLocalUtility.m("network_type", str2);
        }
        LinkedHashMap plus = MapsKt__MapsKt.plus(mapOf, m);
        String str3 = (String) this.pluginTypeProvider.get();
        if (str3 == null || (map2 = Thread$State$EnumUnboxingLocalUtility.m("plugin_type", str3)) == null) {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        }
        LinkedHashMap plus2 = MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(plus, map2), new LinkedHashMap());
        PackageInfo packageInfo = this.packageInfo;
        PackageManager packageManager = this.packageManager;
        if (packageManager == null || packageInfo == null) {
            map3 = EmptyMap.INSTANCE;
            map3.getClass();
        } else {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            CharSequence charSequence = null;
            CharSequence loadLabel = applicationInfo != null ? applicationInfo.loadLabel(packageManager) : null;
            if (loadLabel != null && !StringsKt.isBlank(loadLabel)) {
                charSequence = loadLabel;
            }
            if (charSequence == null) {
                charSequence = this.packageName;
            }
            map3 = MapsKt__MapsKt.mapOf(new Pair("app_name", charSequence), new Pair("app_version", Integer.valueOf(packageInfo.versionCode)));
        }
        return new AnalyticsRequest(MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(plus2, map3), MapsKt__MapsJVMKt.mapOf(new Pair(BreadcrumbHelper.Category.EVENT, analyticsEvent.getEventName()))), map), RequestHeadersFactory.Analytics.INSTANCE.create());
    }
}
