package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nk2 implements ij2<ok2> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9139a;

    /* renamed from: b, reason: collision with root package name */
    private final tn0 f9140b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f9141c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f9142d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9143e;

    /* renamed from: f, reason: collision with root package name */
    private final ln0 f9144f;

    public nk2(ln0 ln0Var, int i7, Context context, tn0 tn0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f9144f = ln0Var;
        this.f9139a = context;
        this.f9140b = tn0Var;
        this.f9141c = scheduledExecutorService;
        this.f9142d = executor;
        this.f9143e = str;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ok2> a() {
        return rb3.f((ib3) rb3.o(rb3.m(ib3.E(rb3.l(new wa3() { // from class: com.google.android.gms.internal.ads.mk2
            @Override // com.google.android.gms.internal.ads.wa3
            public final cc3 zza() {
                return rb3.i(null);
            }
        }, this.f9142d)), new e43() { // from class: com.google.android.gms.internal.ads.lk2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new ok2(str);
            }
        }, this.f9142d), ((Long) sw.c().b(m10.J0)).longValue(), TimeUnit.MILLISECONDS, this.f9141c), Exception.class, new e43() { // from class: com.google.android.gms.internal.ads.kk2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                nk2.this.b((Exception) obj);
                return null;
            }
        }, jc3.b());
    }

    final /* synthetic */ ok2 b(Exception exc) {
        this.f9140b.s(exc, "AttestationTokenSignal");
        return null;
    }
}
