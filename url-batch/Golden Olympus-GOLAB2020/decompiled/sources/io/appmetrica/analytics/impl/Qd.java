package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* loaded from: classes3.dex */
public final class Qd {

    /* renamed from: a, reason: collision with root package name */
    public final Pf f38163a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f38164b;

    /* renamed from: c, reason: collision with root package name */
    public final D0 f38165c;

    /* renamed from: d, reason: collision with root package name */
    public C0 f38166d;

    public Qd(Pf pf) {
        this.f38163a = pf;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f38164b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f38165c = new D0();
    }
}
