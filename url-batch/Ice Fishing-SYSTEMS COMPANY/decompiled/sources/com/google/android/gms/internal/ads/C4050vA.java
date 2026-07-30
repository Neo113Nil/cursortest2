package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4050vA implements InterfaceC3673oA, By {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f34733g = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f34734a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f34735b;

    /* renamed from: c, reason: collision with root package name */
    public long f34736c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f34737d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f34738e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34739f = false;

    public C4050vA(Context context, String[] strArr, ExecutorService executorService) {
        this.f34734a = context;
        this.f34735b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.By
    public final J3.a a() {
        if (Build.VERSION.SDK_INT < 30) {
            return OD.f26665u;
        }
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE(Executors.callable(new RunnableC3873rw(8, this), null));
        this.f34735b.execute(runnableFutureC3083dE);
        return runnableFutureC3083dE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void b(HashMap hashMap) {
        e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void c(HashMap hashMap) {
        long j9;
        long j10;
        e();
        synchronized (this) {
            try {
                j9 = this.f34739f ? this.f34737d - this.f34736c : -1L;
            } finally {
            }
        }
        hashMap.put("vs", Long.valueOf(j9));
        synchronized (this) {
            j10 = this.f34738e;
            this.f34738e = -1L;
        }
        hashMap.put("vf", Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void d(HashMap hashMap, Context context, View view) {
        e();
    }

    public final void e() {
        synchronized (this) {
            try {
                if (this.f34739f) {
                    this.f34737d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
