package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import r3.c;

/* loaded from: classes.dex */
final class c90 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp0 f3763a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e90 f3764b;

    c90(e90 e90Var, bp0 bp0Var) {
        this.f3764b = e90Var;
        this.f3763a = bp0Var;
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        q80 q80Var;
        try {
            bp0 bp0Var = this.f3763a;
            q80Var = this.f3764b.f4525a;
            bp0Var.e(q80Var.i0());
        } catch (DeadObjectException e7) {
            this.f3763a.f(e7);
        }
    }

    @Override // r3.c.a
    public final void q0(int i7) {
        bp0 bp0Var = this.f3763a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i7);
        bp0Var.f(new RuntimeException(sb.toString()));
    }
}
