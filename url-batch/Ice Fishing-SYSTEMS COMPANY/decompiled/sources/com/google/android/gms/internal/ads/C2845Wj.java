package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.Wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2845Wj implements InterfaceC3647nl, InterfaceC2608Ik {

    /* renamed from: n, reason: collision with root package name */
    public final S2.a f28448n;

    /* renamed from: u, reason: collision with root package name */
    public final C2862Xj f28449u;

    /* renamed from: v, reason: collision with root package name */
    public final C3226fu f28450v;

    /* renamed from: w, reason: collision with root package name */
    public final String f28451w;

    public C2845Wj(S2.a aVar, C2862Xj c2862Xj, C3226fu c3226fu, String str) {
        this.f28448n = aVar;
        this.f28449u = c2862Xj;
        this.f28450v = c3226fu;
        this.f28451w = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3647nl
    public final void a() {
        this.f28448n.getClass();
        this.f28449u.f28675c.put(this.f28451w, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        this.f28448n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f28450v.f30904g;
        C2862Xj c2862Xj = this.f28449u;
        ConcurrentHashMap concurrentHashMap = c2862Xj.f28675c;
        String str2 = this.f28451w;
        Long l9 = (Long) concurrentHashMap.get(str2);
        if (l9 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        c2862Xj.f28676d.put(str, Long.valueOf(elapsedRealtime - l9.longValue()));
    }
}
