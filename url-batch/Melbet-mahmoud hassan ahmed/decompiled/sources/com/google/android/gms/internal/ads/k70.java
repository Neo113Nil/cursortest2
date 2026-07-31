package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class k70 implements t70<eu0> {
    k70() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        if (eu0Var2.K() != null) {
            eu0Var2.K().zza();
        }
        z2.o P = eu0Var2.P();
        if (P != null) {
            P.a();
            return;
        }
        z2.o u6 = eu0Var2.u();
        if (u6 != null) {
            u6.a();
        } else {
            io0.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
