package com.github.dart_lang.jni_flutter;

import D6.z;
import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import o4.c;
import p4.InterfaceC0828a;
import p4.b;

/* loaded from: classes.dex */
public class JniFlutterPlugin implements c, InterfaceC0828a {
    private static Context context;
    private static final ConcurrentHashMap<Long, JniFlutterPlugin> pluginMap = new ConcurrentHashMap<>();
    private volatile Activity activity;
    private long engineId;

    public static Activity getActivity(long j) {
        JniFlutterPlugin jniFlutterPlugin = pluginMap.get(Long.valueOf(j));
        Objects.requireNonNull(jniFlutterPlugin);
        return jniFlutterPlugin.activity;
    }

    public static Context getApplicationContext() {
        return context;
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // p4.InterfaceC0828a
    public void onAttachedToActivity(b bVar) {
        setActivity((Activity) ((z) bVar).f640c);
    }

    @Override // o4.c
    public void onAttachedToEngine(o4.b bVar) {
        long j = bVar.f7121b.f5522w;
        this.engineId = j;
        context = bVar.f7120a;
        pluginMap.put(Long.valueOf(j), this);
    }

    @Override // p4.InterfaceC0828a
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // p4.InterfaceC0828a
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // o4.c
    public void onDetachedFromEngine(o4.b bVar) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // p4.InterfaceC0828a
    public void onReattachedToActivityForConfigChanges(b bVar) {
        setActivity((Activity) ((z) bVar).f640c);
    }
}
