package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class nc4 implements td4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9044a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.td4
    public final void a(long j7, int i7, int i8, int i9, sd4 sd4Var) {
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final void b(c0 c0Var) {
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final /* synthetic */ int c(fc1 fc1Var, int i7, boolean z6) {
        return rd4.a(this, fc1Var, i7, true);
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final int d(fc1 fc1Var, int i7, boolean z6, int i8) {
        int a7 = fc1Var.a(this.f9044a, 0, Math.min(4096, i7));
        if (a7 != -1) {
            return a7;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final /* synthetic */ void e(dr2 dr2Var, int i7) {
        rd4.b(this, dr2Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final void f(dr2 dr2Var, int i7, int i8) {
        dr2Var.g(i7);
    }
}
