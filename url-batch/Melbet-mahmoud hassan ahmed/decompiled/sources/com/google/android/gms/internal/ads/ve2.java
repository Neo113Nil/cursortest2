package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ve2 implements ij2<we2> {

    /* renamed from: a, reason: collision with root package name */
    private final l3.b f13329a;

    ve2(Context context) {
        this.f13329a = l3.a.a(context);
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<we2> a() {
        if (!((Boolean) sw.c().b(m10.U1)).booleanValue()) {
            return rb3.i(new we2(null, -1));
        }
        j4.h<l3.c> a7 = this.f13329a.a();
        final kc3 E = kc3.E();
        a7.c(jc3.b(), new j4.d() { // from class: com.google.android.gms.internal.ads.t33
            @Override // j4.d
            public final void a(j4.h hVar) {
                kc3 kc3Var = kc3.this;
                if (hVar.k()) {
                    kc3Var.cancel(false);
                    return;
                }
                if (hVar.m()) {
                    kc3Var.w(hVar.j());
                    return;
                }
                Exception i7 = hVar.i();
                if (i7 == null) {
                    throw new IllegalStateException();
                }
                kc3Var.x(i7);
            }
        });
        return rb3.m(E, new e43() { // from class: com.google.android.gms.internal.ads.ue2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                l3.c cVar = (l3.c) obj;
                return new we2(cVar.a(), cVar.b());
            }
        }, wo0.f13899f);
    }
}
