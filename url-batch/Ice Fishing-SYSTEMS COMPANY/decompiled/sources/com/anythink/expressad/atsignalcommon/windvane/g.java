package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.bridge.BannerJSPlugin;
import com.anythink.expressad.atsignalcommon.mraid.MraidSignalCommunication;
import com.anythink.expressad.atsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.anythink.expressad.splash.js.SplashJs;
import com.anythink.expressad.video.signal.communication.RewardJs;
import com.anythink.expressad.video.signal.communication.VideoBridge;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f18230a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f18231b;

    /* renamed from: c, reason: collision with root package name */
    private Object f18232c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f18233d;

    public g(Context context, WindVaneWebView windVaneWebView) {
        this.f18231b = context;
        this.f18233d = windVaneWebView;
        try {
            a(BannerJSPlugin.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(RewardJs.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(VideoBridge.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f18096e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(SplashJs.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f18099h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
    }

    private static void b(String str) {
        if (f18230a == null) {
            f18230a = new HashMap<>();
        }
        f18230a.remove(str);
    }

    public final void a(Context context) {
        this.f18231b = context;
    }

    public final void a(Object obj) {
        this.f18232c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f18230a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!j.class.isAssignableFrom(cls)) {
                return null;
            }
            j jVar = (j) cls.newInstance();
            jVar.initialize(context, windVaneWebView);
            jVar.initialize(this.f18232c, windVaneWebView);
            return jVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static void a(Class cls) {
        if (f18230a == null) {
            f18230a = new HashMap<>();
        }
        f18230a.put(cls.getSimpleName(), cls);
    }

    private static void a(String str, Class cls) {
        if (f18230a == null) {
            f18230a = new HashMap<>();
        }
        f18230a.put(str, cls);
    }

    public final Object a(String str) {
        if (f18230a == null) {
            f18230a = new HashMap<>();
        }
        return a(str, this.f18233d, this.f18231b);
    }

    private static void a() {
        try {
            a(BannerJSPlugin.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(RewardJs.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(VideoBridge.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f18096e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(SplashJs.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f18099h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
    }
}
