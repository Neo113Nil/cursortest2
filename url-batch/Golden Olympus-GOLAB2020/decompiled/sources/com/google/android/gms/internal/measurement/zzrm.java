package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzrm implements Supplier {
    private static final zzrm zza = new zzrm();
    private final Supplier zzb = Suppliers.ofInstance(new zzro());

    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrn get() {
        return (zzrn) this.zzb.get();
    }
}
