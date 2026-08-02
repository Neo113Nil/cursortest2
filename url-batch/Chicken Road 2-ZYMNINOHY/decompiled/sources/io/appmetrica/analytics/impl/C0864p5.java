package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864p5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12561a;

    /* renamed from: b, reason: collision with root package name */
    public final C0702j f12562b = C0817na.k().b();

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f12563c = EnumSet.of(NetworkType.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final String f12564d = "connection based";

    public C0864p5(Context context) {
        this.f12561a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0702j c0702j = this.f12562b;
        Context context = this.f12561a;
        c0702j.getClass();
        Ce ce = Ge.f10317a;
        return !this.f12563c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f12564d;
    }
}
