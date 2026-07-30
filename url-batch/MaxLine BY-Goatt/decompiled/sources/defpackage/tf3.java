package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tf3 extends uf3 {
    public final /* synthetic */ Long q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ dg3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf3(dg3 dg3Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(dg3Var, true);
        this.q = l;
        this.r = str;
        this.s = str2;
        this.t = bundle;
        this.u = z;
        this.v = z2;
        this.w = dg3Var;
    }

    @Override // defpackage.uf3
    public final void a() {
        Long l = this.q;
        long longValue = l == null ? this.m : l.longValue();
        he3 he3Var = this.w.f;
        ll3.v(he3Var);
        he3Var.logEvent(this.r, this.s, this.t, this.u, this.v, longValue);
    }
}
