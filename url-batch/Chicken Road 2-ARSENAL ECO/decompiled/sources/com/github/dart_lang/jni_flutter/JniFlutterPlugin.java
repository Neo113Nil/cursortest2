package com.github.dart_lang.jni_flutter;

import D0.h;
import K3.b;
import L3.a;
import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class JniFlutterPlugin implements b, a {
    private static Context context;
    private static final ConcurrentHashMap<Long, JniFlutterPlugin> pluginMap = new ConcurrentHashMap<>();
    private volatile Activity activity;
    private long engineId;

    public static Activity getActivity(long j4) {
        JniFlutterPlugin jniFlutterPlugin = pluginMap.get(Long.valueOf(j4));
        Objects.requireNonNull(jniFlutterPlugin);
        return jniFlutterPlugin.activity;
    }

    public static Context getApplicationContext() {
        return context;
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // L3.a
    public void onAttachedToActivity(L3.b bVar) {
        setActivity((Activity) ((h) bVar).f330b);
    }

    @Override // K3.b
    public void onAttachedToEngine(K3.a aVar) {
        long j4 = aVar.f1369b.f622w;
        this.engineId = j4;
        context = aVar.f1368a;
        pluginMap.put(Long.valueOf(j4), this);
    }

    @Override // L3.a
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // L3.a
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // K3.b
    public void onDetachedFromEngine(K3.a aVar) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // L3.a
    public void onReattachedToActivityForConfigChanges(L3.b bVar) {
        setActivity((Activity) ((h) bVar).f330b);
    }
}
