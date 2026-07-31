package y4;

import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import m5.j;
import m5.k;

/* loaded from: classes.dex */
class b implements k.c {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f23471g = new String[0];

    /* renamed from: f, reason: collision with root package name */
    private final PackageManager f23472f;

    b(ContentResolver contentResolver, PackageManager packageManager) {
        this.f23472f = packageManager;
    }

    private String[] a() {
        FeatureInfo[] systemAvailableFeatures = this.f23472f.getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            return f23471g;
        }
        String[] strArr = new String[systemAvailableFeatures.length];
        for (int i7 = 0; i7 < systemAvailableFeatures.length; i7++) {
            strArr[i7] = systemAvailableFeatures[i7].name;
        }
        return strArr;
    }

    private boolean b() {
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        List asList;
        if (!jVar.f19247a.equals("getAndroidDeviceInfo")) {
            dVar.c();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("device", Build.DEVICE);
        hashMap.put("display", Build.DISPLAY);
        hashMap.put("fingerprint", Build.FINGERPRINT);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("host", Build.HOST);
        hashMap.put("id", Build.ID);
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("model", Build.MODEL);
        hashMap.put("product", Build.PRODUCT);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 21) {
            hashMap.put("supported32BitAbis", Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
            hashMap.put("supported64BitAbis", Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
            asList = Arrays.asList(Build.SUPPORTED_ABIS);
        } else {
            String[] strArr = f23471g;
            hashMap.put("supported32BitAbis", Arrays.asList(strArr));
            hashMap.put("supported64BitAbis", Arrays.asList(strArr));
            asList = Arrays.asList(strArr);
        }
        hashMap.put("supportedAbis", asList);
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
        hashMap.put("systemFeatures", Arrays.asList(a()));
        HashMap hashMap2 = new HashMap();
        if (i7 >= 23) {
            hashMap2.put("baseOS", Build.VERSION.BASE_OS);
            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
            hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        }
        hashMap2.put("codename", Build.VERSION.CODENAME);
        hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap2.put("release", Build.VERSION.RELEASE);
        hashMap2.put("sdkInt", Integer.valueOf(i7));
        hashMap.put("version", hashMap2);
        dVar.a(hashMap);
    }
}
