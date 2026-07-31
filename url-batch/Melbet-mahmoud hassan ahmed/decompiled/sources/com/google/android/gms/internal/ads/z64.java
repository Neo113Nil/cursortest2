package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z64 extends v44 implements p64 {

    /* renamed from: g, reason: collision with root package name */
    private final zo f14979g;

    /* renamed from: h, reason: collision with root package name */
    private final vj f14980h;

    /* renamed from: i, reason: collision with root package name */
    private final gd1 f14981i;

    /* renamed from: j, reason: collision with root package name */
    private final b34 f14982j;

    /* renamed from: k, reason: collision with root package name */
    private final int f14983k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14984l;

    /* renamed from: m, reason: collision with root package name */
    private long f14985m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14986n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14987o;

    /* renamed from: p, reason: collision with root package name */
    private vt1 f14988p;

    /* renamed from: q, reason: collision with root package name */
    private final w64 f14989q;

    /* renamed from: r, reason: collision with root package name */
    private final m94 f14990r;

    /* synthetic */ z64(zo zoVar, gd1 gd1Var, w64 w64Var, b34 b34Var, m94 m94Var, int i7, y64 y64Var, byte[] bArr) {
        vj vjVar = zoVar.f15203b;
        Objects.requireNonNull(vjVar);
        this.f14980h = vjVar;
        this.f14979g = zoVar;
        this.f14981i = gd1Var;
        this.f14989q = w64Var;
        this.f14982j = b34Var;
        this.f14990r = m94Var;
        this.f14983k = i7;
        this.f14984l = true;
        this.f14985m = -9223372036854775807L;
    }

    private final void w() {
        long j7 = this.f14985m;
        boolean z6 = this.f14986n;
        boolean z7 = this.f14987o;
        zo zoVar = this.f14979g;
        m74 m74Var = new m74(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j7, j7, 0L, 0L, z6, false, false, null, zoVar, z7 ? zoVar.f15205d : null);
        t(this.f14984l ? new v64(this, m74Var) : m74Var);
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final zo C() {
        return this.f14979g;
    }

    @Override // com.google.android.gms.internal.ads.p64
    public final void g(long j7, boolean z6, boolean z7) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f14985m;
        }
        if (!this.f14984l && this.f14985m == j7 && this.f14986n == z6 && this.f14987o == z7) {
            return;
        }
        this.f14985m = j7;
        this.f14986n = z6;
        this.f14987o = z7;
        this.f14984l = false;
        w();
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final r54 h(s54 s54Var, g94 g94Var, long j7) {
        he1 zza = this.f14981i.zza();
        vt1 vt1Var = this.f14988p;
        if (vt1Var != null) {
            zza.j(vt1Var);
        }
        Uri uri = this.f14980h.f13415a;
        x44 x44Var = new x44(this.f14989q.f13734a);
        b34 b34Var = this.f14982j;
        v24 l7 = l(s54Var);
        m94 m94Var = this.f14990r;
        c64 n7 = n(s54Var);
        String str = this.f14980h.f13418d;
        return new t64(uri, zza, x44Var, b34Var, l7, m94Var, n7, this, g94Var, null, this.f14983k, null);
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void j(r54 r54Var) {
        ((t64) r54Var).y();
    }

    @Override // com.google.android.gms.internal.ads.v44
    protected final void s(vt1 vt1Var) {
        this.f14988p = vt1Var;
        w();
    }

    @Override // com.google.android.gms.internal.ads.v44
    protected final void u() {
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void x() {
    }
}
