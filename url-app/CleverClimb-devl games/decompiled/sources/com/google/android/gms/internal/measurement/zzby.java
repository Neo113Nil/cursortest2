package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzby extends zzar {
    @VisibleForTesting
    zzby(zzat zzatVar) {
        super(zzatVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    public final zzz zzeg() {
        zzch();
        return zzbw().zzaa();
    }

    public final String zzeh() {
        zzch();
        zzz zzeg = zzeg();
        int i = zzeg.zztr;
        int i2 = zzeg.zzts;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
