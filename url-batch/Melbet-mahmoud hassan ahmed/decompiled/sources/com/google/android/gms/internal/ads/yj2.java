package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import v2.a;

/* loaded from: classes.dex */
public final class yj2 implements ij2<zj2> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14708a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f14709b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14710c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14711d;

    /* renamed from: e, reason: collision with root package name */
    private final ln0 f14712e;

    public yj2(ln0 ln0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i7, byte[] bArr) {
        this.f14712e = ln0Var;
        this.f14708a = context;
        this.f14709b = scheduledExecutorService;
        this.f14710c = executor;
        this.f14711d = i7;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<zj2> a() {
        if (!((Boolean) sw.c().b(m10.I0)).booleanValue()) {
            return rb3.h(new Exception("Did not ad Ad ID into query param."));
        }
        return rb3.f((ib3) rb3.o(rb3.m(ib3.E(this.f14712e.a(this.f14708a, this.f14711d)), new e43() { // from class: com.google.android.gms.internal.ads.xj2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                a.C0146a c0146a = (a.C0146a) obj;
                c0146a.getClass();
                return new zj2(c0146a, null);
            }
        }, this.f14710c), ((Long) sw.c().b(m10.J0)).longValue(), TimeUnit.MILLISECONDS, this.f14709b), Throwable.class, new e43() { // from class: com.google.android.gms.internal.ads.wj2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return yj2.this.b((Throwable) obj);
            }
        }, this.f14710c);
    }

    final /* synthetic */ zj2 b(Throwable th) {
        qw.b();
        ContentResolver contentResolver = this.f14708a.getContentResolver();
        return new zj2(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }
}
