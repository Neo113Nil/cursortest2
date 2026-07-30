package com.github.dart_lang.jni_flutter;

import android.app.Activity;
import android.content.Context;
import c0.AbstractActivityC0104f;
import d0.d;
import j0.C0177a;
import j0.InterfaceC0178b;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import k0.InterfaceC0180a;
import k0.InterfaceC0181b;

/* loaded from: classes.dex */
public class JniFlutterPlugin implements InterfaceC0178b, InterfaceC0180a {
    private static Context context;
    private static final ConcurrentHashMap<Long, JniFlutterPlugin> pluginMap = new ConcurrentHashMap<>();
    private volatile Activity activity;
    private long engineId;

    public static Activity getActivity(long j2) {
        JniFlutterPlugin jniFlutterPlugin = pluginMap.get(Long.valueOf(j2));
        Objects.requireNonNull(jniFlutterPlugin);
        return jniFlutterPlugin.activity;
    }

    public static Context getApplicationContext() {
        return context;
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // k0.InterfaceC0180a
    public void onAttachedToActivity(InterfaceC0181b interfaceC0181b) {
        setActivity((AbstractActivityC0104f) ((d) interfaceC0181b).f1811a);
    }

    @Override // j0.InterfaceC0178b
    public void onAttachedToEngine(C0177a c0177a) {
        long j2 = c0177a.f2643b.f1809w;
        this.engineId = j2;
        context = c0177a.f2642a;
        pluginMap.put(Long.valueOf(j2), this);
    }

    @Override // k0.InterfaceC0180a
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // k0.InterfaceC0180a
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // j0.InterfaceC0178b
    public void onDetachedFromEngine(C0177a c0177a) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // k0.InterfaceC0180a
    public void onReattachedToActivityForConfigChanges(InterfaceC0181b interfaceC0181b) {
        setActivity((AbstractActivityC0104f) ((d) interfaceC0181b).f1811a);
    }
}
