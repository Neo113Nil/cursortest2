package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzpw implements Supplier {
    private static final zzpw zza = new zzpw();
    private final Supplier zzb = Suppliers.ofInstance(new zzpy());

    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpx get() {
        return (zzpx) this.zzb.get();
    }
}
