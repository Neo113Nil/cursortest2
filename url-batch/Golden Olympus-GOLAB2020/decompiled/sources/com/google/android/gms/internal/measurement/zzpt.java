package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzpt implements Supplier {
    private static final zzpt zza = new zzpt();
    private final Supplier zzb = Suppliers.ofInstance(new zzpv());

    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpu get() {
        return (zzpu) this.zzb.get();
    }
}
