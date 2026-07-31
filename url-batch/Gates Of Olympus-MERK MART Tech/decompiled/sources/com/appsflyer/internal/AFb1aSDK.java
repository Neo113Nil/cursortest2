package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: classes3.dex */
public final class AFb1aSDK {
    private final AFa1ySDK AFInAppEventType = new AFa1ySDK() { // from class: com.appsflyer.internal.AFb1aSDK.1
        @Override // com.appsflyer.internal.AFb1aSDK.AFa1ySDK
        public final Class<?> values(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    interface AFa1ySDK {
        Class<?> values(String str) throws ClassNotFoundException;
    }

    public final String AFInAppEventParameterName() {
        for (AFa1tSDK aFa1tSDK : AFa1tSDK.values()) {
            if (AFKeystoreWrapper(aFa1tSDK.afRDLog)) {
                return aFa1tSDK.w;
            }
        }
        return AFa1tSDK.DEFAULT.w;
    }

    private boolean AFKeystoreWrapper(String str) {
        try {
            this.AFInAppEventType.values(str);
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

    enum AFa1tSDK {
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

        private final String afRDLog;
        private final String w;

        AFa1tSDK(String str, String str2) {
            this.w = str;
            this.afRDLog = str2;
        }
    }
}
