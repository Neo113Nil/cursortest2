package com.amplitude.reactnative;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.appsflyer.AdRevenueScheme;
import com.facebook.hermes.intl.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidContextProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u0000 /2\u00020\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\b\u0018\u00010\rR\u00020\u00008BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0011\u0010\"\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0013\u0010$\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0013\u0010&\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u0011\u0010(\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0013\u0010*\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0011\u0010,\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u00060"}, d2 = {"Lcom/amplitude/reactnative/AndroidContextProvider;", "", "context", "Landroid/content/Context;", "shouldTrackAdid", "", "<init>", "(Landroid/content/Context;Z)V", "getShouldTrackAdid", "()Z", "setShouldTrackAdid", "(Z)V", "cachedInfo", "Lcom/amplitude/reactnative/AndroidContextProvider$CachedInfo;", "getCachedInfo", "()Lcom/amplitude/reactnative/AndroidContextProvider$CachedInfo;", "prefetch", "", "isGooglePlayServicesEnabled", "isLimitAdTrackingEnabled", "versionName", "", "getVersionName", "()Ljava/lang/String;", "osName", "getOsName", "platform", "getPlatform", "osVersion", "getOsVersion", "brand", "getBrand", "manufacturer", "getManufacturer", "model", "getModel", "carrier", "getCarrier", AdRevenueScheme.COUNTRY, "getCountry", "language", "getLanguage", "advertisingId", "getAdvertisingId", "appSetId", "getAppSetId", "CachedInfo", "Companion", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidContextProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String OS_NAME = "android";
    public static final String PLATFORM = "Android";
    public static final String SETTING_ADVERTISING_ID = "advertising_id";
    public static final String SETTING_LIMIT_AD_TRACKING = "limit_ad_tracking";
    private CachedInfo cachedInfo;
    private final Context context;
    private boolean shouldTrackAdid;

    public AndroidContextProvider(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shouldTrackAdid = z;
    }

    public final boolean getShouldTrackAdid() {
        return this.shouldTrackAdid;
    }

    public final void setShouldTrackAdid(boolean z) {
        this.shouldTrackAdid = z;
    }

    private final CachedInfo getCachedInfo() {
        if (this.cachedInfo == null) {
            this.cachedInfo = new CachedInfo();
        }
        return this.cachedInfo;
    }

    /* compiled from: AndroidContextProvider.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010)\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010*\u001a\u00020\u0005H\u0002J\b\u0010+\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0005H\u0002J\b\u0010-\u001a\u00020\u0005H\u0002J\n\u0010.\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u00108\u001a\u00020\u0005H\u0002J\n\u00109\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010:\u001a\u00020\u0005H\u0002J\b\u0010?\u001a\u00020\u001fH\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001a\u0010&\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u0016\u00100\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0007R\u0016\u0010;\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0007R\u0016\u0010=\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0007¨\u0006@"}, d2 = {"Lcom/amplitude/reactnative/AndroidContextProvider$CachedInfo;", "", "<init>", "(Lcom/amplitude/reactnative/AndroidContextProvider;)V", "advertisingId", "", "getAdvertisingId", "()Ljava/lang/String;", "setAdvertisingId", "(Ljava/lang/String;)V", AdRevenueScheme.COUNTRY, "getCountry", "versionName", "getVersionName", "osName", "getOsName", "platform", "getPlatform", "osVersion", "getOsVersion", "brand", "getBrand", "manufacturer", "getManufacturer", "model", "getModel", "carrier", "getCarrier", "language", "getLanguage", "limitAdTrackingEnabled", "", "getLimitAdTrackingEnabled", "()Z", "setLimitAdTrackingEnabled", "(Z)V", "gpsEnabled", "getGpsEnabled", "appSetId", "getAppSetId", "setAppSetId", "fetchVersionName", "fetchOsVersion", "fetchBrand", "fetchManufacturer", "fetchModel", "fetchCarrier", "fetchCountry", "countryFromNetwork", "getCountryFromNetwork", Constants.LOCALE, "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "countryFromLocale", "getCountryFromLocale", "fetchLanguage", "fetchAdvertisingId", "fetchAppSetId", "fetchAndCacheAmazonAdvertisingId", "getFetchAndCacheAmazonAdvertisingId", "fetchAndCacheGoogleAdvertisingId", "getFetchAndCacheGoogleAdvertisingId", "checkGPSEnabled", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CachedInfo {
        private boolean limitAdTrackingEnabled = true;
        private String advertisingId = fetchAdvertisingId();
        private final String versionName = fetchVersionName();
        private final String osName = AndroidContextProvider.OS_NAME;
        private final String platform = AndroidContextProvider.PLATFORM;
        private final String osVersion = fetchOsVersion();
        private final String brand = fetchBrand();
        private final String manufacturer = fetchManufacturer();
        private final String model = fetchModel();
        private final String carrier = fetchCarrier();
        private final String country = fetchCountry();
        private final String language = fetchLanguage();
        private final boolean gpsEnabled = checkGPSEnabled();
        private String appSetId = fetchAppSetId();

        public CachedInfo() {
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getVersionName() {
            return this.versionName;
        }

        public final String getOsName() {
            return this.osName;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getOsVersion() {
            return this.osVersion;
        }

        public final String getBrand() {
            return this.brand;
        }

        public final String getManufacturer() {
            return this.manufacturer;
        }

        public final String getModel() {
            return this.model;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final boolean getLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        public final void setLimitAdTrackingEnabled(boolean z) {
            this.limitAdTrackingEnabled = z;
        }

        public final boolean getGpsEnabled() {
            return this.gpsEnabled;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final void setAppSetId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appSetId = str;
        }

        private final String fetchVersionName() {
            try {
                return AndroidContextProvider.this.context.getPackageManager().getPackageInfo(AndroidContextProvider.this.context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                return null;
            }
        }

        private final String fetchOsVersion() {
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            return RELEASE;
        }

        private final String fetchBrand() {
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            return BRAND;
        }

        private final String fetchManufacturer() {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            return MANUFACTURER;
        }

        private final String fetchModel() {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            return MODEL;
        }

        private final String fetchCarrier() {
            try {
                Object systemService = AndroidContextProvider.this.context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            } catch (Exception unused) {
                return null;
            }
        }

        private final String fetchCountry() {
            String countryFromNetwork = getCountryFromNetwork();
            String str = countryFromNetwork;
            return (str == null || str.length() == 0) ? getCountryFromLocale() : countryFromNetwork;
        }

        private final String getCountryFromNetwork() {
            String networkCountryIso;
            try {
                Object systemService = AndroidContextProvider.this.context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = networkCountryIso.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return upperCase;
            } catch (Exception unused) {
                return null;
            }
        }

        private final Locale getLocale() {
            LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
            Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
            if (locales.isEmpty()) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                return locale;
            }
            Locale locale2 = locales.get(0);
            Intrinsics.checkNotNullExpressionValue(locale2, "get(...)");
            return locale2;
        }

        private final String getCountryFromLocale() {
            String country = getLocale().getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
            return country;
        }

        private final String fetchLanguage() {
            String language = getLocale().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            return language;
        }

        private final String fetchAdvertisingId() {
            if (!AndroidContextProvider.this.getShouldTrackAdid()) {
                return null;
            }
            if (Intrinsics.areEqual("Amazon", fetchManufacturer())) {
                return getFetchAndCacheAmazonAdvertisingId();
            }
            return getFetchAndCacheGoogleAdvertisingId();
        }

        private final String fetchAppSetId() {
            try {
                Object invoke = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, AndroidContextProvider.this.context);
                Object invoke2 = Class.forName("com.google.android.gms.tasks.Tasks").getMethod("await", Class.forName("com.google.android.gms.tasks.Task")).invoke(null, invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]));
                Object invoke3 = invoke2.getClass().getMethod("getId", new Class[0]).invoke(invoke2, new Object[0]);
                Intrinsics.checkNotNull(invoke3, "null cannot be cast to non-null type kotlin.String");
                this.appSetId = (String) invoke3;
            } catch (ClassNotFoundException unused) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services SDK not found for app set id!");
            } catch (InvocationTargetException unused2) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services not available for app set id");
            } catch (Exception unused3) {
                LogcatLogger.INSTANCE.getLogger().error("Encountered an error connecting to Google Play Services for app set id");
            }
            return this.appSetId;
        }

        private final String getFetchAndCacheAmazonAdvertisingId() {
            ContentResolver contentResolver = AndroidContextProvider.this.context.getContentResolver();
            this.limitAdTrackingEnabled = Settings.Secure.getInt(contentResolver, AndroidContextProvider.SETTING_LIMIT_AD_TRACKING, 0) == 1;
            String string = Settings.Secure.getString(contentResolver, AndroidContextProvider.SETTING_ADVERTISING_ID);
            this.advertisingId = string;
            return string;
        }

        private final String getFetchAndCacheGoogleAdvertisingId() {
            try {
                Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, AndroidContextProvider.this.context);
                Object invoke2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type kotlin.Boolean");
                this.limitAdTrackingEnabled = ((Boolean) invoke2).booleanValue();
                Object invoke3 = invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
                Intrinsics.checkNotNull(invoke3, "null cannot be cast to non-null type kotlin.String");
                this.advertisingId = (String) invoke3;
            } catch (ClassNotFoundException unused) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services SDK not found for advertising id!");
            } catch (InvocationTargetException unused2) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services not available for advertising id");
            } catch (Exception unused3) {
                LogcatLogger.INSTANCE.getLogger().error("Encountered an error connecting to Google Play Services for advertising id");
            }
            return this.advertisingId;
        }

        private final boolean checkGPSEnabled() {
            try {
                Object invoke = Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, AndroidContextProvider.this.context);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue() == 0;
            } catch (ClassNotFoundException unused) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services Util not found!");
                return false;
            } catch (IllegalAccessException unused2) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services not available");
                return false;
            } catch (NoClassDefFoundError unused3) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services Util not found!");
                return false;
            } catch (NoSuchMethodException unused4) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services not available");
                return false;
            } catch (InvocationTargetException unused5) {
                LogcatLogger.INSTANCE.getLogger().warn("Google Play Services not available");
                return false;
            } catch (Exception e) {
                LogcatLogger.INSTANCE.getLogger().warn("Error when checking for Google Play Services: " + e);
                return false;
            }
        }
    }

    public final void prefetch() {
        getCachedInfo();
    }

    public final boolean isGooglePlayServicesEnabled() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getGpsEnabled();
    }

    public final boolean isLimitAdTrackingEnabled() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getLimitAdTrackingEnabled();
    }

    public final String getVersionName() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getVersionName();
    }

    public final String getOsName() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getOsName();
    }

    public final String getPlatform() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getPlatform();
    }

    public final String getOsVersion() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getOsVersion();
    }

    public final String getBrand() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getBrand();
    }

    public final String getManufacturer() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getManufacturer();
    }

    public final String getModel() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getModel();
    }

    public final String getCarrier() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getCarrier();
    }

    public final String getCountry() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getCountry();
    }

    public final String getLanguage() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getLanguage();
    }

    public final String getAdvertisingId() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getAdvertisingId();
    }

    public final String getAppSetId() {
        CachedInfo cachedInfo = getCachedInfo();
        Intrinsics.checkNotNull(cachedInfo);
        return cachedInfo.getAppSetId();
    }

    /* compiled from: AndroidContextProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amplitude/reactnative/AndroidContextProvider$Companion;", "", "<init>", "()V", "OS_NAME", "", "PLATFORM", "SETTING_LIMIT_AD_TRACKING", "SETTING_ADVERTISING_ID", "generateUUID", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String generateUUID() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            return uuid;
        }
    }
}
