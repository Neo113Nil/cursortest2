package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class lp implements Comparator<ap> {
    public lp(mp mpVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ap apVar, ap apVar2) {
        ap apVar3 = apVar;
        ap apVar4 = apVar2;
        if (apVar3.d() >= apVar4.d()) {
            if (apVar3.d() > apVar4.d()) {
                return 1;
            }
            if (apVar3.b() >= apVar4.b()) {
                if (apVar3.b() > apVar4.b()) {
                    return 1;
                }
                float a7 = (apVar3.a() - apVar3.d()) * (apVar3.c() - apVar3.b());
                float a8 = (apVar4.a() - apVar4.d()) * (apVar4.c() - apVar4.b());
                if (a7 <= a8) {
                    return a7 < a8 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
