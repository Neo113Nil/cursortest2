package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class dw extends pw<ng0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f4359b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dd0 f4360c;

    dw(ow owVar, Context context, dd0 dd0Var) {
        this.f4359b = context;
        this.f4360c = dd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw
    protected final /* bridge */ /* synthetic */ ng0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ ng0 b(xx xxVar) {
        return xxVar.T1(x3.b.B3(this.f4359b), this.f4360c, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ ng0 c() {
        try {
            return ((qg0) no0.b(this.f4359b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new lo0() { // from class: com.google.android.gms.internal.ads.cw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    return pg0.s6(obj);
                }
            })).A0(x3.b.B3(this.f4359b), this.f4360c, 214106000);
        } catch (RemoteException | mo0 | NullPointerException unused) {
            return null;
        }
    }
}
