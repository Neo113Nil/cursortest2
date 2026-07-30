package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2811Uj implements InterfaceC4877a {

    /* renamed from: n, reason: collision with root package name */
    public final C2862Xj f28065n;

    /* renamed from: u, reason: collision with root package name */
    public final C3226fu f28066u;

    public C2811Uj(C2862Xj c2862Xj, C3226fu c3226fu) {
        this.f28065n = c2862Xj;
        this.f28066u = c3226fu;
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        C3226fu c3226fu = this.f28066u;
        C2862Xj c2862Xj = this.f28065n;
        String str = c3226fu.f30904g;
        synchronized (c2862Xj.f28673a) {
            try {
                ConcurrentHashMap concurrentHashMap = c2862Xj.f28674b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
