package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class er {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4715a;

    /* renamed from: b, reason: collision with root package name */
    private int f4716b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fr f4717c;

    /* synthetic */ er(fr frVar, byte[] bArr, dr drVar) {
        this.f4717c = frVar;
        this.f4715a = bArr;
    }

    public final er a(int i7) {
        this.f4716b = i7;
        return this;
    }

    public final synchronized void b() {
        try {
            fr frVar = this.f4717c;
            if (frVar.f5180b) {
                frVar.f5179a.E0(this.f4715a);
                this.f4717c.f5179a.R(0);
                this.f4717c.f5179a.A(this.f4716b);
                this.f4717c.f5179a.t0(null);
                this.f4717c.f5179a.d();
            }
        } catch (RemoteException e7) {
            io0.c("Clearcut log failed", e7);
        }
    }
}
