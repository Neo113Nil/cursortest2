package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2674ha {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39135a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f39136b;

    /* renamed from: c, reason: collision with root package name */
    public final C2951s3 f39137c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f39138d;

    public C2674ha(Context context, Vm vm, C2951s3 c2951s3, SafePackageManager safePackageManager) {
        this.f39135a = context;
        this.f39136b = vm;
        this.f39137c = c2951s3;
        this.f39138d = safePackageManager;
    }

    public C2674ha(Context context) {
        this(context, new Vm(context, "io.appmetrica.analytics.build_id"), new C2951s3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
