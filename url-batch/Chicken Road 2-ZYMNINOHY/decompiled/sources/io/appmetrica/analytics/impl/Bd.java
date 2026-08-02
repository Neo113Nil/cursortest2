package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* loaded from: classes.dex */
public final class Bd {

    /* renamed from: a, reason: collision with root package name */
    public final Bf f10104a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f10105b;

    /* renamed from: c, reason: collision with root package name */
    public final I0 f10106c;

    /* renamed from: d, reason: collision with root package name */
    public H0 f10107d;

    public Bd(Bf bf) {
        this.f10104a = bf;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f10105b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f10106c = new I0();
    }
}
