package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Deprecated
/* loaded from: classes.dex */
public final class AFb1xSDK implements AFa1vSDK {
    private final AFa1vSDK valueOf = this;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface AFa1vSDK {
        Class<?> AFKeystoreWrapper(String str);
    }

    private boolean AFInAppEventParameterName(String str) {
        try {
            this.valueOf.AFKeystoreWrapper(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException e) {
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), e, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1xSDK.AFa1vSDK
    public final Class<?> AFKeystoreWrapper(String str) {
        return Class.forName(str);
    }

    public final String values() {
        for (AFa1zSDK aFa1zSDK : AFa1zSDK.values()) {
            if (AFInAppEventParameterName(aFa1zSDK.onAppOpenAttributionNative)) {
                return aFa1zSDK.getLevel;
            }
        }
        return AFa1zSDK.DEFAULT.getLevel;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum AFa1zSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        private final String getLevel;
        private final String onAppOpenAttributionNative;

        AFa1zSDK(String str, String str2) {
            this.getLevel = str;
            this.onAppOpenAttributionNative = str2;
        }
    }
}
