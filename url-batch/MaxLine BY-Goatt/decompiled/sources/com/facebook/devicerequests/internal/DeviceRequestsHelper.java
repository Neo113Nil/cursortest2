package com.facebook.devicerequests.internal;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.eo;
import defpackage.gh0;
import defpackage.l93;
import defpackage.nm1;
import defpackage.tp2;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class DeviceRequestsHelper {
    public static final String DEVICE_INFO_DEVICE = "device";
    public static final String DEVICE_INFO_MODEL = "model";
    public static final String DEVICE_INFO_PARAM = "device_info";
    public static final String DEVICE_TARGET_USER_ID = "target_user_id";
    public static final String SDK_FLAVOR = "android";
    public static final String SDK_HEADER = "fbsdk";
    public static final String SERVICE_TYPE = "_fb._tcp.";
    public static final DeviceRequestsHelper INSTANCE = new DeviceRequestsHelper();
    private static final String TAG = DeviceRequestsHelper.class.getCanonicalName();
    private static final HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners = new HashMap<>();

    private DeviceRequestsHelper() {
    }

    public static final void cleanUpAdvertisementService(String str) {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return;
        }
        try {
            INSTANCE.cleanUpAdvertisementServiceImpl(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
        }
    }

    private final void cleanUpAdvertisementServiceImpl(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = deviceRequestsListeners.get(str);
            if (registrationListener != null) {
                Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
                systemService.getClass();
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e) {
                    Utility.logd(TAG, e);
                }
                deviceRequestsListeners.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final Bitmap generateQRCode(String str) {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(gh0.class);
            enumMap.put((EnumMap) gh0.r, (gh0) 2);
            try {
                eo f = new nm1(0).f(str, 12, enumMap);
                int i = f.n;
                int i2 = f.m;
                int[] iArr = new int[i * i2];
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i3 * i2;
                    for (int i5 = 0; i5 < i2; i5++) {
                        iArr[i4 + i5] = f.a(i5, i3) ? -16777216 : -1;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    return createBitmap;
                } catch (l93 unused) {
                    return createBitmap;
                }
            } catch (l93 unused2) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return null;
        }
    }

    public static final String getDeviceInfo(Map<String, String> map) {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
                return null;
            }
        }
        String str = Build.DEVICE;
        str.getClass();
        map.put(DEVICE_INFO_DEVICE, str);
        String str2 = Build.MODEL;
        str2.getClass();
        map.put(DEVICE_INFO_MODEL, str2);
        String jSONObject = new JSONObject(map).toString();
        jSONObject.getClass();
        return jSONObject;
    }

    public static final boolean isAvailable() {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (appSettingsWithoutQuery != null) {
                if (appSettingsWithoutQuery.getSmartLoginOptions().contains(SmartLoginOption.Enabled)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return false;
        }
    }

    public static final boolean startAdvertisementService(String str) {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            if (isAvailable()) {
                return INSTANCE.startAdvertisementServiceImpl(str);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return false;
        }
    }

    private final boolean startAdvertisementServiceImpl(final String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = deviceRequestsListeners;
            if (hashMap.containsKey(str)) {
                return true;
            }
            final String str2 = "fbsdk_" + "android-".concat(tp2.l(FacebookSdk.getSdkVersion(), '.', '|')) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType(SERVICE_TYPE);
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
            systemService.getClass();
            NsdManager.RegistrationListener registrationListener = new NsdManager.RegistrationListener() { // from class: com.facebook.devicerequests.internal.DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1
                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                    nsdServiceInfo2.getClass();
                    DeviceRequestsHelper.cleanUpAdvertisementService(str);
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onServiceRegistered(NsdServiceInfo nsdServiceInfo2) {
                    nsdServiceInfo2.getClass();
                    if (Intrinsics.b(str2, nsdServiceInfo2.getServiceName())) {
                        return;
                    }
                    DeviceRequestsHelper.cleanUpAdvertisementService(str);
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo2) {
                    nsdServiceInfo2.getClass();
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                    nsdServiceInfo2.getClass();
                }
            };
            hashMap.put(str, registrationListener);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, registrationListener);
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final String getDeviceInfo() {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return null;
        }
        try {
            return getDeviceInfo(null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return null;
        }
    }
}
