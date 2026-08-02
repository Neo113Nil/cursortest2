package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public class U5 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f6755a;

    /* renamed from: b, reason: collision with root package name */
    public String f6756b;

    /* renamed from: c, reason: collision with root package name */
    public C0603jm f6757c;

    public final String b() {
        return this.f6756b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f6755a + "', mAppSystem='" + this.f6756b + "', startupState=" + this.f6757c + '}';
    }

    public final String a() {
        return this.f6755a;
    }
}
