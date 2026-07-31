package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class zzfe extends s implements Function0 {
    public static final zzfe zza = new zzfe();

    public zzfe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzey.class.getName().hashCode());
        if (zzb != null) {
            return (zzey) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
