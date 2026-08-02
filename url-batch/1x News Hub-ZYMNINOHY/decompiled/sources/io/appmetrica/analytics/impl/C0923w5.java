package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923w5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8546a;

    /* renamed from: b, reason: collision with root package name */
    public final C0580j f8547b = C0876ua.k().b();

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f8548c = EnumSet.of(NetworkType.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final String f8549d = "connection based";

    public C0923w5(Context context) {
        this.f8546a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0580j c0580j = this.f8547b;
        Context context = this.f8546a;
        c0580j.getClass();
        He he = Le.f6279a;
        return !this.f8548c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f8549d;
    }
}
