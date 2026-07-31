package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2721j6 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f39261a;

    /* renamed from: b, reason: collision with root package name */
    public String f39262b;

    /* renamed from: c, reason: collision with root package name */
    public C2633fm f39263c;

    public final String b() {
        return this.f39262b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f39261a + "', mAppSystem='" + this.f39262b + "', startupState=" + this.f39263c + '}';
    }

    @NonNull
    public final String a() {
        return this.f39261a;
    }
}
