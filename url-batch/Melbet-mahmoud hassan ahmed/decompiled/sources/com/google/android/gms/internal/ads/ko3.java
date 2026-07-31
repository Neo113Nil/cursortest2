package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class ko3 implements Comparator<uo3> {
    ko3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(uo3 uo3Var, uo3 uo3Var2) {
        uo3 uo3Var3 = uo3Var;
        uo3 uo3Var4 = uo3Var2;
        no3 it = uo3Var3.iterator();
        no3 it2 = uo3Var4.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int a7 = jo3.a(it.zza() & 255, it2.zza() & 255);
            if (a7 != 0) {
                return a7;
            }
        }
        return jo3.a(uo3Var3.q(), uo3Var4.q());
    }
}
