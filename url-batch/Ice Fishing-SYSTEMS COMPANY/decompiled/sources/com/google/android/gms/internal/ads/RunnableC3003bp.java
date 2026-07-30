package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3003bp implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29593n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29594u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f29595v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f29596w;

    public /* synthetic */ RunnableC3003bp(int i, int i4, Object obj, Object obj2) {
        this.f29593n = i4;
        this.f29595v = obj;
        this.f29594u = i;
        this.f29596w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29593n) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f29595v).iterator();
                while (it.hasNext()) {
                    C2765Ro c2765Ro = (C2765Ro) it.next();
                    if (!c2765Ro.f27426d) {
                        int i = this.f29594u;
                        if (i != -1) {
                            c2765Ro.f27424b.t(i);
                        }
                        c2765Ro.f27425c = true;
                        ((InterfaceC3865ro) this.f29596w).mo2b(c2765Ro.f27423a);
                    }
                }
                break;
            default:
                ((AbstractC4107wD) this.f29595v).t(this.f29594u, (J3.a) this.f29596w);
                break;
        }
    }
}
