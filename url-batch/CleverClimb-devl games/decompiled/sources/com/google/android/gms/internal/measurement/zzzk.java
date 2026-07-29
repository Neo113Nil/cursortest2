package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzzk implements zzzp {
    private zzzp[] zzbvr;

    zzzk(zzzp... zzzpVarArr) {
        this.zzbvr = zzzpVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzzp
    public final boolean zzd(Class<?> cls) {
        for (zzzp zzzpVar : this.zzbvr) {
            if (zzzpVar.zzd(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzzp
    public final zzzo zze(Class<?> cls) {
        for (zzzp zzzpVar : this.zzbvr) {
            if (zzzpVar.zzd(cls)) {
                return zzzpVar.zze(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
