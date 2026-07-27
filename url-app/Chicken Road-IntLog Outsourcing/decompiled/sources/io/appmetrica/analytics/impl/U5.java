package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public class U5 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f7587a;

    /* renamed from: b, reason: collision with root package name */
    public String f7588b;

    /* renamed from: c, reason: collision with root package name */
    public C0754jm f7589c;

    public final String b() {
        return this.f7588b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f7587a + "', mAppSystem='" + this.f7588b + "', startupState=" + this.f7589c + '}';
    }

    public final String a() {
        return this.f7587a;
    }
}
