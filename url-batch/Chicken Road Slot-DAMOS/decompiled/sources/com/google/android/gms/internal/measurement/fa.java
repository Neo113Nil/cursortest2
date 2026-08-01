package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class fa extends c7.i {
    @Override // c7.f
    public final IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof ea ? (ea) queryLocalInterface : new ea(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 0);
    }

    @Override // c7.f
    public final z6.d[] g() {
        return h.f2352d;
    }

    @Override // c7.f
    public final int j() {
        return 9410000;
    }

    @Override // c7.f
    public final String n() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // c7.f
    public final String o() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
