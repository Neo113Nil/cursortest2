package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class K5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37864a;

    /* renamed from: b, reason: collision with root package name */
    public final L5 f37865b = new L5();

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f37866c = EnumSet.of(Te.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final String f37867d = "connection based";

    public K5(@NotNull Context context) {
        this.f37864a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        L5 l5 = this.f37865b;
        Context context = this.f37864a;
        l5.getClass();
        SafePackageManager safePackageManager = Ue.f38360a;
        return !this.f37866c.contains((Te) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Te.UNDEFINED, new Se()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f37867d;
    }
}
