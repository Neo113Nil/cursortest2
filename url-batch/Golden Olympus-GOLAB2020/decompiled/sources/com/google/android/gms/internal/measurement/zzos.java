package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: classes.dex */
public final class zzos implements Supplier {
    private static final zzos zza = new zzos();
    private final Supplier zzb = Suppliers.ofInstance(new zzou());

    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzot get() {
        return (zzot) this.zzb.get();
    }
}
