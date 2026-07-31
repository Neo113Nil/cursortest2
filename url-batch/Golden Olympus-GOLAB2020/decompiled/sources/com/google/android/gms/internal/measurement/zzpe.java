package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzpe implements Supplier {
    private static final zzpe zza = new zzpe();
    private final Supplier zzb = Suppliers.ofInstance(new zzpg());

    public static long zza() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzpf get() {
        return (zzpf) this.zzb.get();
    }
}
