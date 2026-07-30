package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Eh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2537Eh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC2554Fh f24785n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24786u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24787v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f24788w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f24789x;

    public /* synthetic */ RunnableC2537Eh(BinderC2554Fh binderC2554Fh, int i, int i4, boolean z8, boolean z9) {
        this.f24785n = binderC2554Fh;
        this.f24786u = i;
        this.f24787v = i4;
        this.f24788w = z8;
        this.f24789x = z9;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i;
        boolean z8;
        boolean z9;
        q2.C0 c02;
        q2.C0 c03;
        q2.C0 c04;
        BinderC2554Fh binderC2554Fh = this.f24785n;
        int i4 = this.f24786u;
        int i9 = this.f24787v;
        boolean z10 = this.f24788w;
        boolean z11 = this.f24789x;
        synchronized (binderC2554Fh.f25000u) {
            try {
                boolean z12 = binderC2554Fh.f25005z;
                if (z12 || i9 != 1) {
                    i = i9;
                    z8 = false;
                } else {
                    i9 = 1;
                    i = 1;
                    z8 = true;
                }
                boolean z13 = i4 != i9;
                if (z13 && i == 1) {
                    z9 = true;
                    i = 1;
                } else {
                    z9 = false;
                }
                boolean z14 = z13 && i == 2;
                boolean z15 = z13 && i == 3;
                binderC2554Fh.f25005z = z12 || z8;
                if (z8) {
                    try {
                        q2.C0 c05 = binderC2554Fh.f25004y;
                        if (c05 != null) {
                            c05.c();
                        }
                    } catch (RemoteException e6) {
                        u2.i.i("#007 Could not call remote method.", e6);
                    }
                }
                if (z9 && (c04 = binderC2554Fh.f25004y) != null) {
                    c04.f();
                }
                if (z14 && (c03 = binderC2554Fh.f25004y) != null) {
                    c03.e();
                }
                if (z15) {
                    q2.C0 c06 = binderC2554Fh.f25004y;
                    if (c06 != null) {
                        c06.g();
                    }
                    binderC2554Fh.f24999n.S();
                }
                if (z10 != z11 && (c02 = binderC2554Fh.f25004y) != null) {
                    c02.y2(z11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
