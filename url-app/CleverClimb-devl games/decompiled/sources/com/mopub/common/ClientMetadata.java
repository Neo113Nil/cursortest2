package com.mopub.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.MoPubIdentifier;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Dips;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ClientMetadata {
    private static final String DEVICE_ORIENTATION_LANDSCAPE = "l";
    private static final String DEVICE_ORIENTATION_PORTRAIT = "p";
    private static final String DEVICE_ORIENTATION_SQUARE = "s";
    private static final String DEVICE_ORIENTATION_UNKNOWN = "u";
    private static final int TYPE_ETHERNET = 9;
    private static final int UNKNOWN_NETWORK = -1;
    private static volatile ClientMetadata sInstance;
    private String mAppName;
    private final String mAppPackageName;
    private final String mAppVersion;
    private final ConnectivityManager mConnectivityManager;
    private final Context mContext;
    private String mIsoCountryCode;
    private final String mNetworkOperator;
    private String mNetworkOperatorForUrl;
    private String mNetworkOperatorName;
    private String mSimIsoCountryCode;
    private String mSimOperator;
    private String mSimOperatorName;
    private final MoPubIdentifier moPubIdentifier;
    private final String mDeviceManufacturer = Build.MANUFACTURER;
    private final String mDeviceModel = Build.MODEL;
    private final String mDeviceProduct = Build.PRODUCT;
    private final String mDeviceOsVersion = Build.VERSION.RELEASE;
    private final String mSdkVersion = "5.0.0";

    public enum MoPubNetworkType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        MOBILE(3);

        private final int mId;

        MoPubNetworkType(int i) {
            this.mId = i;
        }

        @Override // java.lang.Enum
        public String toString() {
            return Integer.toString(this.mId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MoPubNetworkType fromAndroidNetworkType(int i) {
            if (i == 9) {
                return ETHERNET;
            }
            switch (i) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                    return MOBILE;
                case 1:
                    return WIFI;
                default:
                    return UNKNOWN;
            }
        }

        public int getId() {
            return this.mId;
        }
    }

    public static ClientMetadata getInstance(Context context) {
        ClientMetadata clientMetadata = sInstance;
        if (clientMetadata == null) {
            synchronized (ClientMetadata.class) {
                clientMetadata = sInstance;
                if (clientMetadata == null) {
                    clientMetadata = new ClientMetadata(context);
                    sInstance = clientMetadata;
                }
            }
        }
        return clientMetadata;
    }

    public static ClientMetadata getInstance() {
        ClientMetadata clientMetadata = sInstance;
        if (clientMetadata == null) {
            synchronized (ClientMetadata.class) {
                clientMetadata = sInstance;
            }
        }
        return clientMetadata;
    }

    public ClientMetadata(Context context) {
        ApplicationInfo applicationInfo;
        this.mContext = context.getApplicationContext();
        this.mConnectivityManager = (ConnectivityManager) this.mContext.getSystemService("connectivity");
        this.mAppVersion = getAppVersionFromContext(this.mContext);
        PackageManager packageManager = this.mContext.getPackageManager();
        this.mAppPackageName = context.getPackageName();
        try {
            applicationInfo = packageManager.getApplicationInfo(this.mAppPackageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            this.mAppName = (String) packageManager.getApplicationLabel(applicationInfo);
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        this.mNetworkOperatorForUrl = telephonyManager.getNetworkOperator();
        this.mNetworkOperator = telephonyManager.getNetworkOperator();
        if (telephonyManager.getPhoneType() == 2 && telephonyManager.getSimState() == 5) {
            this.mNetworkOperatorForUrl = telephonyManager.getSimOperator();
            this.mSimOperator = telephonyManager.getSimOperator();
        }
        if (MoPub.canCollectPersonalInformation()) {
            this.mIsoCountryCode = telephonyManager.getNetworkCountryIso();
            this.mSimIsoCountryCode = telephonyManager.getSimCountryIso();
        } else {
            this.mIsoCountryCode = "";
            this.mSimIsoCountryCode = "";
        }
        try {
            this.mNetworkOperatorName = telephonyManager.getNetworkOperatorName();
            if (telephonyManager.getSimState() == 5) {
                this.mSimOperatorName = telephonyManager.getSimOperatorName();
            }
        } catch (SecurityException unused2) {
            this.mNetworkOperatorName = null;
            this.mSimOperatorName = null;
        }
        this.moPubIdentifier = new MoPubIdentifier(this.mContext);
    }

    public void repopulateCountryData() {
        TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        if (!MoPub.canCollectPersonalInformation() || telephonyManager == null) {
            return;
        }
        this.mIsoCountryCode = telephonyManager.getNetworkCountryIso();
        this.mSimIsoCountryCode = telephonyManager.getSimCountryIso();
    }

    private static String getAppVersionFromContext(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            MoPubLog.d("Failed to retrieve PackageInfo#versionName.");
            return null;
        }
    }

    public String getOrientationString() {
        int i = this.mContext.getResources().getConfiguration().orientation;
        return i == 1 ? "p" : i == 2 ? DEVICE_ORIENTATION_LANDSCAPE : i == 3 ? "s" : DEVICE_ORIENTATION_UNKNOWN;
    }

    public MoPubNetworkType getActiveNetworkType() {
        NetworkInfo activeNetworkInfo;
        int i = -1;
        if (DeviceUtils.isPermissionGranted(this.mContext, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo()) != null) {
            i = activeNetworkInfo.getType();
        }
        return MoPubNetworkType.fromAndroidNetworkType(i);
    }

    public float getDensity() {
        return this.mContext.getResources().getDisplayMetrics().density;
    }

    public String getNetworkOperatorForUrl() {
        return this.mNetworkOperatorForUrl;
    }

    public String getNetworkOperator() {
        return this.mNetworkOperator;
    }

    public Locale getDeviceLocale() {
        return this.mContext.getResources().getConfiguration().locale;
    }

    public String getSimOperator() {
        return this.mSimOperator;
    }

    public String getIsoCountryCode() {
        return MoPub.canCollectPersonalInformation() ? this.mIsoCountryCode : "";
    }

    public String getSimIsoCountryCode() {
        return MoPub.canCollectPersonalInformation() ? this.mSimIsoCountryCode : "";
    }

    public String getNetworkOperatorName() {
        return this.mNetworkOperatorName;
    }

    public String getSimOperatorName() {
        return this.mSimOperatorName;
    }

    public MoPubIdentifier getMoPubIdentifier() {
        return this.moPubIdentifier;
    }

    public String getDeviceManufacturer() {
        return this.mDeviceManufacturer;
    }

    public String getDeviceModel() {
        return this.mDeviceModel;
    }

    public String getDeviceProduct() {
        return this.mDeviceProduct;
    }

    public String getDeviceOsVersion() {
        return this.mDeviceOsVersion;
    }

    public int getDeviceScreenWidthDip() {
        return Dips.screenWidthAsIntDips(this.mContext);
    }

    public int getDeviceScreenHeightDip() {
        return Dips.screenHeightAsIntDips(this.mContext);
    }

    public Point getDeviceDimensions() {
        if (Preconditions.NoThrow.checkNotNull(this.mContext)) {
            return DeviceUtils.getDeviceDimensions(this.mContext);
        }
        return new Point(0, 0);
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getAppPackageName() {
        return this.mAppPackageName;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public static String getCurrentLanguage(Context context) {
        String trim = Locale.getDefault().getLanguage().trim();
        Locale locale = context.getResources().getConfiguration().locale;
        return (locale == null || locale.getLanguage().trim().isEmpty()) ? trim : locale.getLanguage().trim();
    }

    @VisibleForTesting
    @Deprecated
    public static void setInstance(ClientMetadata clientMetadata) {
        synchronized (ClientMetadata.class) {
            sInstance = clientMetadata;
        }
    }

    @VisibleForTesting
    @Deprecated
    public static void clearForTesting() {
        sInstance = null;
    }
}
