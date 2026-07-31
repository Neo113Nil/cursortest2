package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import o2.AbstractC3337k;
import o2.AbstractC3344n0;
import o2.InterfaceC3316J;
import o2.K;
import o2.Z;

/* loaded from: classes.dex */
public final class zzbi {
    private final InterfaceC3316J zza = K.b();
    private final InterfaceC3316J zzb;
    private final InterfaceC3316J zzc;
    private final InterfaceC3316J zzd;

    public zzbi() {
        InterfaceC3316J a4 = K.a(AbstractC3344n0.c(Executors.newSingleThreadExecutor()));
        AbstractC3337k.d(a4, null, null, new zzbh(null), 3, null);
        this.zzb = a4;
        this.zzc = K.a(Z.b());
        InterfaceC3316J a5 = K.a(AbstractC3344n0.c(Executors.newSingleThreadExecutor()));
        AbstractC3337k.d(a5, null, null, new zzbg(null), 3, null);
        this.zzd = a5;
    }

    public final InterfaceC3316J zza() {
        return this.zzc;
    }

    public final InterfaceC3316J zzb() {
        return this.zza;
    }

    public final InterfaceC3316J zzc() {
        return this.zzd;
    }

    public final InterfaceC3316J zzd() {
        return this.zzb;
    }
}
