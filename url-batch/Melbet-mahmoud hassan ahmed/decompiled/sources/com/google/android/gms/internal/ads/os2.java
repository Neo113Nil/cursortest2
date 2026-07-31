package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class os2 {
    public static pv a(Context context, List<sr2> list) {
        ArrayList arrayList = new ArrayList();
        for (sr2 sr2Var : list) {
            if (sr2Var.f11947c) {
                arrayList.add(r2.h.f21149p);
            } else {
                arrayList.add(new r2.h(sr2Var.f11945a, sr2Var.f11946b));
            }
        }
        return new pv(context, (r2.h[]) arrayList.toArray(new r2.h[arrayList.size()]));
    }

    public static sr2 b(List<sr2> list, sr2 sr2Var) {
        return list.get(0);
    }

    public static sr2 c(pv pvVar) {
        return pvVar.f10384n ? new sr2(-3, 0, true) : new sr2(pvVar.f10380j, pvVar.f10377g, false);
    }
}
