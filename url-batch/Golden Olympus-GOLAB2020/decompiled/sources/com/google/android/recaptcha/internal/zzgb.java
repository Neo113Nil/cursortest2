package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class zzgb extends s implements Function0 {
    public static final zzgb zza = new zzgb();

    public zzgb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzfu.class.getName().hashCode());
        if (zzb != null) {
            return (zzfu) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
