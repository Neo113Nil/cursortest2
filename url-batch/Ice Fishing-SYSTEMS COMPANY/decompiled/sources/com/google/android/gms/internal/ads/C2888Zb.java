package com.google.android.gms.internal.ads;

import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2888Zb implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2657Li f28992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28993c;

    public /* synthetic */ C2888Zb(C2657Li c2657Li, String str, int i) {
        this.f28991a = i;
        this.f28992b = c2657Li;
        this.f28993c = str;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        String str = this.f28993c;
        C2657Li c2657Li = this.f28992b;
        switch (this.f28991a) {
            case 0:
                String str2 = (String) obj;
                C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                return (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vb)).booleanValue() && c2657Li != null && C2657Li.b(str)) ? c2657Li.a(str2, C4907p.f40108g.f40113e) : C3686oN.c(str2);
            default:
                c2657Li.getClass();
                c2657Li.f26194e.a(new RunnableC2640Ki(c2657Li, (Throwable) obj, 1));
                return C3686oN.c(str);
        }
    }
}
