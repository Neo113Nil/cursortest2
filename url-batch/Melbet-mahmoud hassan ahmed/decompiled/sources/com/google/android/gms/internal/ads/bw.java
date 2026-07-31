package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class bw extends pw<bn0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f3549b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dd0 f3550c;

    bw(ow owVar, Context context, dd0 dd0Var) {
        this.f3549b = context;
        this.f3550c = dd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw
    protected final /* bridge */ /* synthetic */ bn0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ bn0 b(xx xxVar) {
        return xxVar.x1(x3.b.B3(this.f3549b), this.f3550c, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ bn0 c() {
        try {
            return ((en0) no0.b(this.f3549b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new lo0() { // from class: com.google.android.gms.internal.ads.aw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    return dn0.s6(obj);
                }
            })).A0(x3.b.B3(this.f3549b), this.f3550c, 214106000);
        } catch (RemoteException | mo0 | NullPointerException unused) {
            return null;
        }
    }
}
