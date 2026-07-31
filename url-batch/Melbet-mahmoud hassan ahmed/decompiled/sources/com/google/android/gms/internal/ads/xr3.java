package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class xr3 extends lo3 {

    /* renamed from: f, reason: collision with root package name */
    final bs3 f14336f;

    /* renamed from: g, reason: collision with root package name */
    no3 f14337g = a();

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ds3 f14338h;

    xr3(ds3 ds3Var) {
        this.f14338h = ds3Var;
        this.f14336f = new bs3(ds3Var, null);
    }

    private final no3 a() {
        if (this.f14336f.hasNext()) {
            return this.f14336f.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14337g != null;
    }

    @Override // com.google.android.gms.internal.ads.no3
    public final byte zza() {
        no3 no3Var = this.f14337g;
        if (no3Var == null) {
            throw new NoSuchElementException();
        }
        byte zza = no3Var.zza();
        if (!this.f14337g.hasNext()) {
            this.f14337g = a();
        }
        return zza;
    }
}
