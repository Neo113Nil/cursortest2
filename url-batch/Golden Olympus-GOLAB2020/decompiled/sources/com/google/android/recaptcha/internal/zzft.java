package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.d;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.K;

/* loaded from: classes.dex */
public final class zzft implements zzfo {
    private final InterfaceC3316J zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(InterfaceC3316J interfaceC3316J, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = interfaceC3316J;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int zzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (zza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i4 = zzbk.zza;
        int zzk = zzufVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, d dVar) {
        Object g4 = K.g(new zzfq(zzgdVar, list, this, null), dVar);
        return g4 == AbstractC1241b.f() ? g4 : Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, d dVar) {
        Object g4 = K.g(new zzfr(exc, zzgdVar, this, null), dVar);
        return g4 == AbstractC1241b.f() ? g4 : Unit.f41027a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        AbstractC3337k.d(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3, null);
    }
}
