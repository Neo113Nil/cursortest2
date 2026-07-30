package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: classes.dex */
public final class AFb1xSDK implements AFa1vSDK {
    private final AFa1vSDK valueOf = this;

    interface AFa1vSDK {
        Class<?> AFKeystoreWrapper(String str) throws ClassNotFoundException;
    }

    public final String values() {
        for (AFa1zSDK aFa1zSDK : AFa1zSDK.values()) {
            if (AFInAppEventParameterName(aFa1zSDK.onAppOpenAttributionNative)) {
                return aFa1zSDK.getLevel;
            }
        }
        return AFa1zSDK.DEFAULT.getLevel;
    }

    private boolean AFInAppEventParameterName(String str) {
        try {
            this.valueOf.AFKeystoreWrapper(str);
            AFLogger.afRDLog(new StringBuilder("Class: ").append(str).append(" is found.").toString());
            return true;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly(new StringBuilder("Class: ").append(str).append(" is  not found. (Platform extension)").toString(), e, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    enum AFa1zSDK {
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

    @Override // com.appsflyer.internal.AFb1xSDK.AFa1vSDK
    public final Class<?> AFKeystoreWrapper(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }
}
