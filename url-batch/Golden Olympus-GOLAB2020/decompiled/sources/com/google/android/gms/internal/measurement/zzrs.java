package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzrs implements Supplier {
    private static final zzrs zza = new zzrs();
    private final Supplier zzb = Suppliers.ofInstance(new zzru());

    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrt get() {
        return (zzrt) this.zzb.get();
    }
}
