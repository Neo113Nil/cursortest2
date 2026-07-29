package com.appsflyer;

/* loaded from: classes.dex */
final class ad implements b {

    /* renamed from: a, reason: collision with root package name */
    private b f3424a = this;

    interface b {
        Class<?> b(String str) throws ClassNotFoundException;
    }

    enum a {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native");

        private String g;
        private String h;

        a(String str, String str2) {
            this.g = str;
            this.h = str2;
        }
    }

    final String a() {
        for (a aVar : a.values()) {
            if (a(aVar.h)) {
                return aVar.g;
            }
        }
        return a.DEFAULT.g;
    }

    ad() {
    }

    final boolean a(String str) {
        try {
            this.f3424a.b(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            d.a(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            d.a(th.getMessage(), th);
            return false;
        }
    }

    @Override // com.appsflyer.ad.b
    public final Class<?> b(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }
}
