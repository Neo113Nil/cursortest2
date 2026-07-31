package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class zzdi extends s implements Function0 {
    public static final zzdi zza = new zzdi();

    public zzdi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzbe.class.getName().hashCode());
        if (zzb != null) {
            return (zzbe) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
