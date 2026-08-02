package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public final class M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10637a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f10638b;

    /* renamed from: c, reason: collision with root package name */
    public final W2 f10639c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f10640d;

    public M9(Context context, Vm vm, W2 w22, SafePackageManager safePackageManager) {
        this.f10637a = context;
        this.f10638b = vm;
        this.f10639c = w22;
        this.f10640d = safePackageManager;
    }

    public M9(Context context) {
        this(context, new Vm(context, "io.appmetrica.analytics.build_id"), new W2(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
