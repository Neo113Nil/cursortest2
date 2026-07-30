package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sl3 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ jm3 t;

    public sl3(jm3 jm3Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.m = str;
        this.n = str2;
        this.o = j;
        this.p = bundle;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = jm3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.F(this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }
}
