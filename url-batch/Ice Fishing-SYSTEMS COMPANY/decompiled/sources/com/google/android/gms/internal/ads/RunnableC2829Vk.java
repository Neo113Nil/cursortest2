package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Vk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2829Vk implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28292n;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f28293u;

    public /* synthetic */ RunnableC2829Vk(C2863Xk c2863Xk, int i) {
        this.f28292n = i;
        switch (i) {
            case 1:
                this.f28293u = new WeakReference(c2863Xk);
                break;
            default:
                this.f28293u = new WeakReference(c2863Xk);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28292n) {
            case 0:
                C2863Xk c2863Xk = (C2863Xk) this.f28293u.get();
                if (c2863Xk != null) {
                    c2863Xk.u1(C2943ak.f29288S);
                    break;
                }
                break;
            default:
                C2863Xk c2863Xk2 = (C2863Xk) this.f28293u.get();
                if (c2863Xk2 != null) {
                    c2863Xk2.u1(C2943ak.f29287R);
                    break;
                }
                break;
        }
    }
}
