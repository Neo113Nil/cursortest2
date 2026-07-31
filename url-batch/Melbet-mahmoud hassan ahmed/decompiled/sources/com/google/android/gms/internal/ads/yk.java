package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yk extends Cif {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f14713d = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final long f14714b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14715c;

    public yk(long j7, boolean z6) {
        this.f14714b = j7;
        this.f14715c = j7;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final int a(Object obj) {
        return f14713d.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final gf d(int i7, gf gfVar, boolean z6) {
        jm.a(i7, 0, 1);
        Object obj = z6 ? f14713d : null;
        long j7 = this.f14714b;
        gfVar.f5593a = obj;
        gfVar.f5594b = obj;
        gfVar.f5595c = j7;
        return gfVar;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final hf e(int i7, hf hfVar, boolean z6, long j7) {
        jm.a(i7, 0, 1);
        hfVar.f6216a = this.f14715c;
        return hfVar;
    }
}
