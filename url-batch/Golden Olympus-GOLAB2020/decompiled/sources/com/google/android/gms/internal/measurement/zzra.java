package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzra implements Supplier {
    private static final zzra zza = new zzra();
    private final Supplier zzb = Suppliers.ofInstance(new zzrc());

    public static boolean zzb() {
        zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrb get() {
        return (zzrb) this.zzb.get();
    }
}
