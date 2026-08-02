package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public class N5 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f10689a;

    /* renamed from: b, reason: collision with root package name */
    public String f10690b;

    /* renamed from: c, reason: collision with root package name */
    public C0622fm f10691c;

    public final String b() {
        return this.f10690b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f10689a + "', mAppSystem='" + this.f10690b + "', startupState=" + this.f10691c + '}';
    }

    public final String a() {
        return this.f10689a;
    }
}
