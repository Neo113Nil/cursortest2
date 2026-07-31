package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzjl implements Callable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjp zzc;

    zzjl(zzjp zzjpVar, zzbh zzbhVar, String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        this.zzc = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzpv zzpvVar;
        zzpv zzpvVar2;
        byte[] bArr;
        zzpv zzpvVar3;
        zzqd zzqdVar;
        zzpv zzpvVar4;
        zzh zzhVar;
        zzio zzioVar;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Bundle bundle;
        String str;
        Object obj;
        boolean z4;
        com.google.android.gms.internal.measurement.zzht zzhtVar;
        zzbd zzc;
        long j4;
        byte[] bArr2;
        zzjp zzjpVar = this.zzc;
        zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        zzpvVar2 = zzjpVar.zza;
        zzmc zzv = zzpvVar2.zzv();
        zzv.zzg();
        zzio zzioVar2 = zzv.zzu;
        zzio.zzP();
        zzbh zzbhVar = this.zza;
        Preconditions.checkNotNull(zzbhVar);
        String str2 = this.zzb;
        Preconditions.checkNotEmpty(str2);
        String str3 = zzbhVar.zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzv.zzu.zzaW().zzd().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpv zzpvVar5 = zzv.zzg;
        com.google.android.gms.internal.measurement.zzht zzb = com.google.android.gms.internal.measurement.zzhv.zzb();
        zzpvVar5.zzj().zzH();
        try {
            zzh zzl = zzpvVar5.zzj().zzl(str2);
            if (zzl == null) {
                zzv.zzu.zzaW().zzd().zzb("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (zzl.zzaJ()) {
                    com.google.android.gms.internal.measurement.zzhw zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                    zzz.zzar(1);
                    zzz.zzan("android");
                    if (!TextUtils.isEmpty(zzl.zzC())) {
                        zzz.zzI(zzl.zzC());
                    }
                    if (!TextUtils.isEmpty(zzl.zzE())) {
                        zzz.zzK((String) Preconditions.checkNotNull(zzl.zzE()));
                    }
                    if (!TextUtils.isEmpty(zzl.zzF())) {
                        zzz.zzL((String) Preconditions.checkNotNull(zzl.zzF()));
                    }
                    if (zzl.zze() != -2147483648L) {
                        zzz.zzM((int) zzl.zze());
                    }
                    zzz.zzai(zzl.zzq());
                    zzz.zzZ(zzl.zzo());
                    String zzH = zzl.zzH();
                    String zzA = zzl.zzA();
                    if (!TextUtils.isEmpty(zzH)) {
                        zzz.zzah(zzH);
                    } else if (!TextUtils.isEmpty(zzA)) {
                        zzz.zzH(zzA);
                    }
                    zzz.zzay(zzl.zzw());
                    zzjx zzu = zzv.zzg.zzu(str2);
                    zzz.zzW(zzl.zzn());
                    if (zzioVar2.zzJ() && zzv.zzu.zzf().zzy(zzz.zzaF()) && zzu.zzr(zzjw.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzz.zzY(null);
                    }
                    zzz.zzT(zzu.zzp());
                    if (zzu.zzr(zzjw.AD_STORAGE) && zzl.zzaI()) {
                        Pair zzd = zzpvVar5.zzw().zzd(zzl.zzC(), zzu);
                        if (zzl.zzaI() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                zzz.zzas(zzmc.zza((String) zzd.first, Long.toString(zzbhVar.zzd)));
                                Object obj2 = zzd.second;
                                if (obj2 != null) {
                                    zzz.zzal(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e4) {
                                zzv.zzu.zzaW().zzd().zzb("Resettable device id encryption failed", e4.getMessage());
                                bArr = new byte[0];
                                zzpvVar3 = zzv.zzg;
                                zzpvVar3.zzj().zzL();
                                return bArr;
                            }
                        }
                    }
                    zzio zzioVar3 = zzv.zzu;
                    zzioVar3.zzg().zzv();
                    zzz.zzX(Build.MODEL);
                    zzioVar3.zzg().zzv();
                    zzz.zzam(Build.VERSION.RELEASE);
                    zzz.zzaz((int) zzioVar3.zzg().zza());
                    zzz.zzaD(zzioVar3.zzg().zzb());
                    try {
                        if (zzu.zzr(zzjw.ANALYTICS_STORAGE) && zzl.zzD() != null) {
                            zzz.zzJ(zzmc.zza((String) Preconditions.checkNotNull(zzl.zzD()), Long.toString(zzbhVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzl.zzG())) {
                            zzz.zzag((String) Preconditions.checkNotNull(zzl.zzG()));
                        }
                        String zzC = zzl.zzC();
                        zzpv zzpvVar6 = zzv.zzg;
                        List zzE = zzpvVar6.zzj().zzE(zzC);
                        Iterator it = zzE.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzqdVar = null;
                                break;
                            }
                            zzqdVar = (zzqd) it.next();
                            if ("_lte".equals(zzqdVar.zzc)) {
                                break;
                            }
                        }
                        if (zzqdVar == null || zzqdVar.zze == null) {
                            zzqd zzqdVar2 = new zzqd(zzC, "auto", "_lte", zzv.zzu.zzaU().currentTimeMillis(), 0L);
                            zzE.add(zzqdVar2);
                            zzpvVar6.zzj().zzai(zzqdVar2);
                        }
                        com.google.android.gms.internal.measurement.zzio[] zzioVarArr = new com.google.android.gms.internal.measurement.zzio[zzE.size()];
                        for (int i4 = 0; i4 < zzE.size(); i4++) {
                            com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
                            zze.zzf(((zzqd) zzE.get(i4)).zzc);
                            zze.zzg(((zzqd) zzE.get(i4)).zzd);
                            zzpvVar6.zzA().zzx(zze, ((zzqd) zzE.get(i4)).zze);
                            zzioVarArr[i4] = (com.google.android.gms.internal.measurement.zzio) zze.zzba();
                        }
                        zzz.zzm(Arrays.asList(zzioVarArr));
                        zzpv zzpvVar7 = zzv.zzg;
                        zzpvVar7.zzQ(zzl, zzz);
                        zzpvVar7.zzaa(zzl, zzz);
                        zzhf zzb2 = zzhf.zzb(zzbhVar);
                        zzio zzioVar4 = zzv.zzu;
                        zzqf zzw = zzioVar4.zzw();
                        Bundle bundle2 = zzb2.zzd;
                        zzw.zzO(bundle2, zzpvVar6.zzj().zzk(str2));
                        zzioVar4.zzw().zzQ(zzb2, zzioVar4.zzf().zzf(str2));
                        bundle2.putLong("_c", 1L);
                        zzioVar4.zzaW().zzd().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = zzbhVar.zzc;
                        bundle2.putString("_o", str4);
                        if (zzioVar4.zzw().zzak(zzz.zzaF(), zzl.zzM())) {
                            zzioVar4.zzw().zzS(bundle2, "_dbg", 1L);
                            zzioVar4.zzw().zzS(bundle2, "_r", 1L);
                        }
                        zzaw zzj = zzpvVar6.zzj();
                        String str5 = zzbhVar.zza;
                        zzbd zzs = zzj.zzs(str2, str5);
                        if (zzs == null) {
                            zzhVar = zzl;
                            zzioVar = zzioVar4;
                            zzhwVar = zzz;
                            zzpvVar4 = zzpvVar7;
                            obj = null;
                            z4 = true;
                            str = str4;
                            bundle = bundle2;
                            zzc = new zzbd(str2, str5, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                            j4 = 0;
                            zzhtVar = zzb;
                        } else {
                            zzpvVar4 = zzpvVar7;
                            zzhVar = zzl;
                            zzioVar = zzioVar4;
                            zzhwVar = zzz;
                            bundle = bundle2;
                            str = str4;
                            obj = null;
                            z4 = true;
                            zzhtVar = zzb;
                            long j5 = zzs.zzf;
                            zzc = zzs.zzc(zzbhVar.zzd);
                            j4 = j5;
                        }
                        zzbd zzbdVar = zzc;
                        zzpvVar6.zzj().zzV(zzbdVar);
                        zzio zzioVar5 = zzv.zzu;
                        long j6 = zzbhVar.zzd;
                        zzh zzhVar2 = zzhVar;
                        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = zzhwVar;
                        zzpv zzpvVar8 = zzpvVar4;
                        boolean z5 = z4;
                        zzbc zzbcVar = new zzbc(zzioVar5, str, str2, str5, j6, j4, bundle);
                        com.google.android.gms.internal.measurement.zzhl zze2 = com.google.android.gms.internal.measurement.zzhm.zze();
                        zze2.zzm(zzbcVar.zzd);
                        zze2.zzi(zzbcVar.zzb);
                        zze2.zzl(zzbcVar.zze);
                        zzbf zzbfVar = zzbcVar.zzf;
                        zzbe zzbeVar = new zzbe(zzbfVar);
                        while (zzbeVar.hasNext()) {
                            String next = zzbeVar.next();
                            com.google.android.gms.internal.measurement.zzhp zze3 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze3.zzj(next);
                            Object zzf = zzbfVar.zzf(next);
                            if (zzf != null) {
                                zzpvVar6.zzA().zzw(zze3, zzf);
                                zze2.zze(zze3);
                            }
                        }
                        zzhwVar2.zzn(zze2);
                        com.google.android.gms.internal.measurement.zzhy zza = com.google.android.gms.internal.measurement.zzia.zza();
                        com.google.android.gms.internal.measurement.zzhn zza2 = com.google.android.gms.internal.measurement.zzho.zza();
                        zza2.zza(zzbdVar.zzc);
                        zza2.zzb(str5);
                        zza.zza(zza2);
                        zzhwVar2.zzao(zza);
                        zzhwVar2.zzi(zzpvVar6.zzh().zza(zzhVar2.zzC(), Collections.EMPTY_LIST, zzhwVar2.zzaN(), Long.valueOf(zze2.zzc()), Long.valueOf(zze2.zzc()), false));
                        if (zze2.zzq()) {
                            zzhwVar2.zzax(zze2.zzc());
                            zzhwVar2.zzab(zze2.zzc());
                        }
                        long zzs2 = zzhVar2.zzs();
                        if (zzs2 != 0) {
                            zzhwVar2.zzap(zzs2);
                        }
                        long zzu2 = zzhVar2.zzu();
                        if (zzu2 != 0) {
                            zzhwVar2.zzaq(zzu2);
                        } else if (zzs2 != 0) {
                            zzhwVar2.zzaq(zzs2);
                        }
                        String zzL = zzhVar2.zzL();
                        zzrd.zzb();
                        if (zzioVar.zzf().zzx(str2, zzgi.zzaL) && zzL != null) {
                            zzhwVar2.zzav(zzL);
                        }
                        zzhVar2.zzP();
                        zzhwVar2.zzP((int) zzhVar2.zzt());
                        zzioVar.zzf().zzj();
                        zzhwVar2.zzaB(119002L);
                        zzhwVar2.zzaA(zzioVar.zzaU().currentTimeMillis());
                        zzhwVar2.zzau(z5);
                        zzpvVar8.zzN(zzhwVar2.zzaF(), zzhwVar2);
                        zzhtVar.zzc(zzhwVar2);
                        zzhVar2.zzau(zzhwVar2.zzf());
                        zzhVar2.zzas(zzhwVar2.zze());
                        zzpvVar6.zzj().zzT(zzhVar2, false, false);
                        zzpvVar6.zzj().zzS();
                        zzpvVar6.zzj().zzL();
                        try {
                            return zzpvVar6.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba()).zzcd());
                        } catch (IOException e5) {
                            zzv.zzu.zzaW().zze().zzc("Data loss. Failed to bundle and serialize. appId", zzhe.zzn(str2), e5);
                            return obj;
                        }
                    } catch (SecurityException e6) {
                        zzv.zzu.zzaW().zzd().zzb("app instance id encryption failed", e6.getMessage());
                        bArr = new byte[0];
                        zzpvVar3 = zzv.zzg;
                        zzpvVar3.zzj().zzL();
                        return bArr;
                    }
                }
                zzv.zzu.zzaW().zzd().zzb("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            zzpvVar5.zzj().zzL();
            return bArr2;
        } catch (Throwable th) {
            zzv.zzg.zzj().zzL();
            throw th;
        }
    }
}
