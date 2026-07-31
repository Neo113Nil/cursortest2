package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzaa extends zzab {
    final /* synthetic */ zzae zza;
    private final com.google.android.gms.internal.measurement.zzfj zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzae zzaeVar, String str, int i4, com.google.android.gms.internal.measurement.zzfj zzfjVar) {
        super(str, i4);
        this.zza = zzaeVar;
        this.zzh = zzfjVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x035f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzd(Long l4, Long l5, com.google.android.gms.internal.measurement.zzhm zzhmVar, long j4, zzbd zzbdVar, boolean z4) {
        Boolean zzi;
        com.google.android.gms.internal.measurement.zzpq.zzb();
        zzae zzaeVar = this.zza;
        zzio zzioVar = zzaeVar.zzu;
        zzam zzf = zzioVar.zzf();
        String str = this.zzb;
        boolean zzx = zzf.zzx(str, zzgi.zzaE);
        com.google.android.gms.internal.measurement.zzfj zzfjVar = this.zzh;
        long j5 = zzfjVar.zzn() ? zzbdVar.zze : j4;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        Boolean bool = null;
        if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
            zzioVar.zzaW().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), zzfjVar.zzp() ? Integer.valueOf(zzfjVar.zzb()) : null, zzioVar.zzj().zzd(zzfjVar.zzg()));
            zzioVar.zzaW().zzj().zzb("Filter definition", zzaeVar.zzg.zzA().zzr(zzfjVar));
        }
        if (!zzfjVar.zzp() || zzfjVar.zzb() > 256) {
            zzioVar.zzaW().zzk().zzc("Invalid event filter ID. appId, id", zzhe.zzn(str), String.valueOf(zzfjVar.zzp() ? Integer.valueOf(zzfjVar.zzb()) : null));
            return false;
        }
        Object[] objArr = zzfjVar.zzk() || zzfjVar.zzm() || zzfjVar.zzn();
        if (z4 && objArr != true) {
            zzioVar.zzaW().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzfjVar.zzp() ? Integer.valueOf(zzfjVar.zzb()) : null);
            return true;
        }
        String zzh = zzhmVar.zzh();
        if (zzfjVar.zzo()) {
            Boolean zzh2 = zzab.zzh(j5, zzfjVar.zzf());
            if (zzh2 != null) {
                if (!zzh2.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            zzioVar.zzaW().zzj().zzb("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.zzd = bool2;
            if (!bool.booleanValue()) {
                return true;
            }
            this.zze = bool2;
            if (objArr != false && zzhmVar.zzu()) {
                Long valueOf = Long.valueOf(zzhmVar.zzd());
                if (zzfjVar.zzm()) {
                    if (zzx && zzfjVar.zzo()) {
                        valueOf = l4;
                    }
                    this.zzg = valueOf;
                } else {
                    if (zzx && zzfjVar.zzo()) {
                        valueOf = l5;
                    }
                    this.zzf = valueOf;
                }
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = zzfjVar.zzh().iterator();
        while (true) {
            if (!it.hasNext()) {
                androidx.collection.a aVar = new androidx.collection.a();
                Iterator it2 = zzhmVar.zzi().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = zzfjVar.zzh().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzfl zzflVar = (com.google.android.gms.internal.measurement.zzfl) it3.next();
                            boolean z5 = zzflVar.zzh() && zzflVar.zzg();
                            String zze = zzflVar.zze();
                            if (zze.isEmpty()) {
                                zzioVar.zzaW().zzk().zzb("Event has empty param name. event", zzioVar.zzj().zzd(zzh));
                                break;
                            }
                            Object obj = aVar.get(zze);
                            if (obj instanceof Long) {
                                if (!zzflVar.zzi()) {
                                    zzioVar.zzaW().zzk().zzc("No number filter for long param. event, param", zzioVar.zzj().zzd(zzh), zzioVar.zzj().zze(zze));
                                    break;
                                }
                                Boolean zzh3 = zzab.zzh(((Long) obj).longValue(), zzflVar.zzc());
                                if (zzh3 == null) {
                                    break;
                                }
                                if (zzh3.booleanValue() == z5) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!zzflVar.zzi()) {
                                    zzioVar.zzaW().zzk().zzc("No number filter for double param. event, param", zzioVar.zzj().zzd(zzh), zzioVar.zzj().zze(zze));
                                    break;
                                }
                                Boolean zzg = zzab.zzg(((Double) obj).doubleValue(), zzflVar.zzc());
                                if (zzg == null) {
                                    break;
                                }
                                if (zzg.booleanValue() == z5) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!zzflVar.zzk()) {
                                    if (!zzflVar.zzi()) {
                                        zzioVar.zzaW().zzk().zzc("No filter for String param. event, param", zzioVar.zzj().zzd(zzh), zzioVar.zzj().zze(zze));
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!zzqa.zzA(str2)) {
                                        zzioVar.zzaW().zzk().zzc("Invalid param value for number filter. event, param", zzioVar.zzj().zzd(zzh), zzioVar.zzj().zze(zze));
                                        break;
                                    }
                                    zzi = zzab.zzi(str2, zzflVar.zzc());
                                } else {
                                    zzi = zzab.zzf((String) obj, zzflVar.zzd(), zzioVar.zzaW());
                                }
                                if (zzi == null) {
                                    break;
                                }
                                if (zzi.booleanValue() == z5) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj == null) {
                                zzioVar.zzaW().zzj().zzc("Missing param for filter. event, param", zzioVar.zzj().zzd(zzh), zzioVar.zzj().zze(zze));
                                bool = Boolean.FALSE;
                            } else {
                                zzioVar.zzaW().zzk().zzc("Unknown param type. event, param", zzioVar.zzj().zzd(zzh), zzioVar.zzj().zze(zze));
                            }
                        }
                    } else {
                        com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it2.next();
                        if (hashSet.contains(zzhqVar.zzg())) {
                            if (!zzhqVar.zzw()) {
                                if (!zzhqVar.zzu()) {
                                    if (!zzhqVar.zzy()) {
                                        zzioVar.zzaW().zzk().zzc("Unknown value for param. event, param", zzioVar.zzj().zzd(zzh), zzioVar.zzj().zze(zzhqVar.zzg()));
                                        break;
                                    }
                                    aVar.put(zzhqVar.zzg(), zzhqVar.zzh());
                                } else {
                                    aVar.put(zzhqVar.zzg(), zzhqVar.zzu() ? Double.valueOf(zzhqVar.zza()) : null);
                                }
                            } else {
                                aVar.put(zzhqVar.zzg(), zzhqVar.zzw() ? Long.valueOf(zzhqVar.zzd()) : null);
                            }
                        }
                    }
                }
            } else {
                com.google.android.gms.internal.measurement.zzfl zzflVar2 = (com.google.android.gms.internal.measurement.zzfl) it.next();
                if (zzflVar2.zze().isEmpty()) {
                    zzioVar.zzaW().zzk().zzb("null or empty param name in filter. event", zzioVar.zzj().zzd(zzh));
                    break;
                }
                hashSet.add(zzflVar2.zze());
            }
        }
        zzioVar.zzaW().zzj().zzb("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
