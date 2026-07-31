package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class wd0 implements c3.d<c3.k, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jd0 f13794a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c3.a f13795b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ce0 f13796c;

    wd0(ce0 ce0Var, jd0 jd0Var, c3.a aVar) {
        this.f13796c = ce0Var;
        this.f13794a = jd0Var;
        this.f13795b = aVar;
    }

    @Override // c3.d
    public final void a(r2.a aVar) {
        try {
            String canonicalName = this.f13795b.getClass().getCanonicalName();
            int a7 = aVar.a();
            String c7 = aVar.c();
            String b7 = aVar.b();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(c7).length() + String.valueOf(b7).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(a7);
            sb.append(". ErrorMessage = ");
            sb.append(c7);
            sb.append(". ErrorDomain = ");
            sb.append(b7);
            io0.b(sb.toString());
            this.f13794a.T3(aVar.d());
            this.f13794a.V1(aVar.a(), aVar.c());
            this.f13794a.A(aVar.a());
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
