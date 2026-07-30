package com.baidu.platform.comapi.license;

import android.util.Log;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.SVGLicenseOption;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil;
import com.baidu.mapsdkplatform.comjni.tools.JNITools;
import com.baidu.platform.comapi.license.LicenseAuthManager;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class LicenseAuthManagerProvider {
    private static final String FUNCTION_NAME_MULTI_SCREEN_RIDING_NAVI = "multi_screen_navi";
    private static final String FUNCTION_NAME_MULTI_SCREEN_WALKING_NAVI = "multi_screen_navi";
    private static final String FUNCTION_NAME_RTOS_MAP_SVG = "active_map";
    private static final String SERVICE_NAME_RTOS_MAP = "lbs_rtossdk";
    private static final String SERVICE_NAME_WALK_BIKE_NAVI = "lbs_androidsdk";
    public static final String TAG = "LicenseAuthManagerProvider";
    private static volatile LicenseAuthManagerProvider provider;

    class a implements IExtraLicenseAuth {
        a() {
        }

        @Override // com.baidu.platform.comapi.license.IExtraLicenseAuth
        public void check() {
            if (!PermissionUtils.getInstance().isBWNaviMultiMapAuthorized()) {
                throw new BaseLicenseAuthDataStandardProcess.ProcessException(200, "没有步骑行多实例权限");
            }
        }
    }

    class b implements IExtraLicenseAuth {
        b() {
        }

        @Override // com.baidu.platform.comapi.license.IExtraLicenseAuth
        public void check() {
            if (!PermissionUtils.getInstance().isBWNaviMultiMapAuthorized()) {
                throw new BaseLicenseAuthDataStandardProcess.ProcessException(200, "没有步骑行多实例权限");
            }
        }
    }

    private LicenseAuthManagerProvider() {
    }

    private String getDecryptAK(SVGLicenseOption sVGLicenseOption, String str) {
        if (sVGLicenseOption != null && !str.isEmpty()) {
            String time = sVGLicenseOption.getTime();
            String akCipher = sVGLicenseOption.getAkCipher();
            if (time != null && akCipher != null) {
                String licenseAESSaltKey = JNITools.getLicenseAESSaltKey(str, time);
                String licenseAESIvKey = JNITools.getLicenseAESIvKey(str, time);
                if (licenseAESSaltKey != null && licenseAESIvKey != null) {
                    try {
                        return new String(AlgorithmUtil.getDecryptCBCInfo(licenseAESIvKey, licenseAESSaltKey, hexStringConvertBytes(akCipher))).trim();
                    } catch (Exception unused) {
                        Log.e(TAG, "DecryptAK Decrypt failed");
                    }
                }
            }
        }
        return null;
    }

    private String getDecryptDeviceID(SVGLicenseOption sVGLicenseOption) {
        if (sVGLicenseOption == null) {
            return null;
        }
        String akCipher = sVGLicenseOption.getAkCipher();
        String deviceIDCipher = sVGLicenseOption.getDeviceIDCipher();
        if (akCipher != null && deviceIDCipher != null) {
            String deviceIDAESSaltKey = JNITools.getDeviceIDAESSaltKey(akCipher);
            String deviceIDAESIvKey = JNITools.getDeviceIDAESIvKey(akCipher);
            if (deviceIDAESSaltKey != null && deviceIDAESIvKey != null) {
                try {
                    return new String(AlgorithmUtil.getDecryptCBCInfo(deviceIDAESIvKey, deviceIDAESSaltKey, hexStringConvertBytes(deviceIDCipher))).trim();
                } catch (Exception unused) {
                    Log.e(TAG, "DecryptAK Decrypt failed");
                }
            }
        }
        return null;
    }

    public static LicenseAuthManagerProvider getInstance() {
        if (provider == null) {
            synchronized (LicenseAuthManagerProvider.class) {
                provider = new LicenseAuthManagerProvider();
            }
        }
        return provider;
    }

    private byte[] hexStringConvertBytes(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            int i10 = i9 + 1;
            bArr[i8] = (byte) ((Integer.parseInt(str.substring(i9, i10), 16) * 16) + Integer.parseInt(str.substring(i10, i9 + 2), 16));
        }
        return bArr;
    }

    public ILicenseAuthManager getMultiScreenRidingNaviAuthManager() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new b());
        return new LicenseAuthManager.Builder().serviceName(SERVICE_NAME_WALK_BIKE_NAVI).functionName("multi_screen_navi").type(1).extraAuth(arrayList).build();
    }

    public ILicenseAuthManager getMultiScreenWalkingNaviAuthManager() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new a());
        return new LicenseAuthManager.Builder().serviceName(SERVICE_NAME_WALK_BIKE_NAVI).functionName("multi_screen_navi").type(1).extraAuth(arrayList).build();
    }

    public ILicenseAuthManager getRTOSSVGMapLicenseAuthManager(SVGLicenseOption sVGLicenseOption) {
        if (sVGLicenseOption == null || sVGLicenseOption.getAkCipher() == null || sVGLicenseOption.getDeviceIDCipher() == null || sVGLicenseOption.getTime() == null || sVGLicenseOption.getSign() == null) {
            return null;
        }
        String decryptDeviceID = getDecryptDeviceID(sVGLicenseOption);
        String decryptAK = getDecryptAK(sVGLicenseOption, decryptDeviceID);
        String cuid = sVGLicenseOption.getCuid();
        String appVersion = sVGLicenseOption.getAppVersion();
        return new LicenseAuthManager.Builder().serviceName(SERVICE_NAME_RTOS_MAP).functionName(FUNCTION_NAME_RTOS_MAP_SVG).type(1).ak(decryptAK).deviceId(decryptDeviceID).appVersion(appVersion).osVersion(sVGLicenseOption.getOSVersion()).cuid(cuid).build();
    }
}
