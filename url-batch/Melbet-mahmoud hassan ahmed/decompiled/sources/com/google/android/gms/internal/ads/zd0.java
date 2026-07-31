package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zd0 implements c3.d<c3.l, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jd0 f15079a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce0 f15080b;

    zd0(ce0 ce0Var, jd0 jd0Var) {
        this.f15080b = ce0Var;
        this.f15079a = jd0Var;
    }

    @Override // c3.d
    public final void a(r2.a aVar) {
        Object obj;
        try {
            obj = this.f15080b.f3820f;
            String canonicalName = obj.getClass().getCanonicalName();
            int a7 = aVar.a();
            String c7 = aVar.c();
            String b7 = aVar.b();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(c7).length() + String.valueOf(b7).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(a7);
            sb.append(". ErrorMessage = ");
            sb.append(c7);
            sb.append(". ErrorDomain = ");
            sb.append(b7);
            io0.b(sb.toString());
            this.f15079a.T3(aVar.d());
            this.f15079a.V1(aVar.a(), aVar.c());
            this.f15079a.A(aVar.a());
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
