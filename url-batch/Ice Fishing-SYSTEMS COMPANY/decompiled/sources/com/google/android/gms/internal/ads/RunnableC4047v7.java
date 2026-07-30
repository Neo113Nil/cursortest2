package com.google.android.gms.internal.ads;

import java.io.IOException;
import o2.C4829b;

/* renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4047v7 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34715n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4101w7 f34716u;

    public /* synthetic */ RunnableC4047v7(C4101w7 c4101w7, int i) {
        this.f34715n = i;
        this.f34716u = c4101w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34715n) {
            case 0:
                C4101w7 c4101w7 = this.f34716u;
                c4101w7.getClass();
                try {
                    if (c4101w7.f34934f == null && c4101w7.f34935g) {
                        C4829b c4829b = new C4829b(c4101w7.f34929a, 30000L, false);
                        c4829b.d(true);
                        c4101w7.f34934f = c4829b;
                        break;
                    }
                } catch (L2.g | IOException unused) {
                    c4101w7.f34934f = null;
                    return;
                }
                break;
            default:
                AbstractC3368ia.a(this.f34716u.f34929a);
                break;
        }
    }
}
