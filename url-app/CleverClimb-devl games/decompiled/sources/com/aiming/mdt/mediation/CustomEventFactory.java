package com.aiming.mdt.mediation;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class CustomEventFactory {
    public static CustomBannerEvent createBanner(String str) {
        Constructor declaredConstructor = Class.forName(str).asSubclass(CustomBannerEvent.class).getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (CustomBannerEvent) declaredConstructor.newInstance(new Object[0]);
    }

    public static CustomInteractiveEvent createInteractive(String str) {
        Constructor declaredConstructor = Class.forName(str).asSubclass(CustomInteractiveEvent.class).getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (CustomInteractiveEvent) declaredConstructor.newInstance(new Object[0]);
    }

    public static CustomInterstitialEvent createInterstitial(String str) {
        Constructor declaredConstructor = Class.forName(str).asSubclass(CustomInterstitialEvent.class).getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (CustomInterstitialEvent) declaredConstructor.newInstance(new Object[0]);
    }

    public static CustomNativeEvent createNative(String str) {
        Constructor declaredConstructor = Class.forName(str).asSubclass(CustomNativeEvent.class).getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (CustomNativeEvent) declaredConstructor.newInstance(new Object[0]);
    }

    public static CustomVideoEvent createVideo(String str) {
        Constructor declaredConstructor = Class.forName(str).asSubclass(CustomVideoEvent.class).getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (CustomVideoEvent) declaredConstructor.newInstance(new Object[0]);
    }
}
