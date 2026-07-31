package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class x23 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14014a;

    /* renamed from: b, reason: collision with root package name */
    private int f14015b;

    /* renamed from: c, reason: collision with root package name */
    private int f14016c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ y23 f14017d;

    /* synthetic */ x23(y23 y23Var, byte[] bArr, w23 w23Var) {
        this.f14017d = y23Var;
        this.f14014a = bArr;
    }

    public final x23 a(int i7) {
        this.f14016c = i7;
        return this;
    }

    public final x23 b(int i7) {
        this.f14015b = i7;
        return this;
    }

    public final synchronized void c() {
        try {
            y23 y23Var = this.f14017d;
            if (y23Var.f14521b) {
                y23Var.f14520a.E0(this.f14014a);
                this.f14017d.f14520a.R(this.f14015b);
                this.f14017d.f14520a.A(this.f14016c);
                this.f14017d.f14520a.t0(null);
                this.f14017d.f14520a.d();
            }
        } catch (RemoteException e7) {
            Log.d("GASS", "Clearcut log failed", e7);
        }
    }
}
