package com.github.dart_lang.jni_flutter;

import D2.b;
import E2.a;
import M0.e;
import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public class JniFlutterPlugin implements b, a {
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

    @Override // E2.a
    public void onAttachedToActivity(E2.b bVar) {
        setActivity((AbstractActivityC1515c) ((e) bVar).f1788h);
    }

    @Override // D2.b
    public void onAttachedToEngine(D2.a aVar) {
        long j2 = aVar.f434b.f10104w;
        this.engineId = j2;
        context = aVar.f433a;
        pluginMap.put(Long.valueOf(j2), this);
    }

    @Override // E2.a
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // E2.a
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // D2.b
    public void onDetachedFromEngine(D2.a aVar) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // E2.a
    public void onReattachedToActivityForConfigChanges(E2.b bVar) {
        setActivity((AbstractActivityC1515c) ((e) bVar).f1788h);
    }
}
