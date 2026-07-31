package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzql implements Supplier {
    private static final zzql zza = new zzql();
    private final Supplier zzb = Suppliers.ofInstance(new zzqn());

    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqm get() {
        return (zzqm) this.zzb.get();
    }
}
