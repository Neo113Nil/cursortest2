package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class zzez extends s implements Function0 {
    public static final zzez zza = new zzez();

    public zzez() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzex.class.getName().hashCode());
        if (zzb != null) {
            return (zzex) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
