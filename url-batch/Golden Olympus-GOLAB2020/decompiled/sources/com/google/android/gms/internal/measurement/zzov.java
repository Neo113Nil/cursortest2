package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzov implements Supplier {
    private static final zzov zza = new zzov();
    private final Supplier zzb = Suppliers.ofInstance(new zzox());

    public static boolean zzb() {
        return zza.get().zza();
    }

    public static boolean zzc() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzow get() {
        return (zzow) this.zzb.get();
    }
}
