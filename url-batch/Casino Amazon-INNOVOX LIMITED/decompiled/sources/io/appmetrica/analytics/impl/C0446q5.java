package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0446q5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1447a;
    public final C0263j b = C0401oa.k().b();
    public final EnumSet c = EnumSet.of(NetworkType.OFFLINE);
    public final String d = "connection based";

    public C0446q5(Context context) {
        this.f1447a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0263j c0263j = this.b;
        Context context = this.f1447a;
        c0263j.getClass();
        De de = He.f873a;
        return !this.c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ge()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.d;
    }
}
