package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzov;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzx extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzek zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzx(zzaa zzaaVar, String str, int i8, com.google.android.gms.internal.measurement.zzek zzekVar) {
        super(str, i8);
        this.zza = zzaaVar;
        this.zzh = zzekVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    final boolean zzb() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    final boolean zzc() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzd(Long l8, Long l9, com.google.android.gms.internal.measurement.zzft zzftVar, long j8, zzas zzasVar, boolean z7) {
        Boolean zzi;
        zzov.zzc();
        boolean zzs = this.zza.zzt.zzf().zzs(this.zzb, zzeh.zzY);
        long j9 = this.zzh.zzn() ? zzasVar.zze : j8;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        Boolean bool = null;
        if (Log.isLoggable(this.zza.zzt.zzaA().zzr(), 2)) {
            this.zza.zzt.zzaA().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null, this.zza.zzt.zzj().zzd(this.zzh.zzg()));
            this.zza.zzt.zzaA().zzj().zzb("Filter definition", this.zza.zzf.zzu().zzo(this.zzh));
        }
        if (!this.zzh.zzp() || this.zzh.zzb() > 256) {
            this.zza.zzt.zzaA().zzk().zzc("Invalid event filter ID. appId, id", zzeu.zzn(this.zzb), String.valueOf(this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null));
            return false;
        }
        boolean z8 = this.zzh.zzk() || this.zzh.zzm() || this.zzh.zzn();
        if (z7 && !z8) {
            this.zza.zzt.zzaA().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzek zzekVar = this.zzh;
        String zzh = zzftVar.zzh();
        if (zzekVar.zzo()) {
            Boolean zzh2 = zzy.zzh(j9, zzekVar.zzf());
            if (zzh2 != null) {
                if (!zzh2.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            this.zza.zzt.zzaA().zzj().zzb("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.zzd = bool2;
            if (!bool.booleanValue()) {
                return true;
            }
            this.zze = bool2;
            if (z8 && zzftVar.zzu()) {
                Long valueOf = Long.valueOf(zzftVar.zzd());
                if (this.zzh.zzm()) {
                    if (zzs && this.zzh.zzo()) {
                        valueOf = l8;
                    }
                    this.zzg = valueOf;
                } else {
                    if (zzs && this.zzh.zzo()) {
                        valueOf = l9;
                    }
                    this.zzf = valueOf;
                }
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = zzekVar.zzh().iterator();
        while (true) {
            if (!it.hasNext()) {
                ArrayMap arrayMap = new ArrayMap();
                Iterator it2 = zzftVar.zzi().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = zzekVar.zzh().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzem zzemVar = (com.google.android.gms.internal.measurement.zzem) it3.next();
                            boolean z9 = zzemVar.zzh() && zzemVar.zzg();
                            String zze = zzemVar.zze();
                            if (zze.isEmpty()) {
                                this.zza.zzt.zzaA().zzk().zzb("Event has empty param name. event", this.zza.zzt.zzj().zzd(zzh));
                                break;
                            }
                            Object obj = arrayMap.get(zze);
                            if (obj instanceof Long) {
                                if (!zzemVar.zzi()) {
                                    this.zza.zzt.zzaA().zzk().zzc("No number filter for long param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                    break;
                                }
                                Boolean zzh3 = zzy.zzh(((Long) obj).longValue(), zzemVar.zzc());
                                if (zzh3 == null) {
                                    break;
                                }
                                if (zzh3.booleanValue() == z9) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!zzemVar.zzi()) {
                                    this.zza.zzt.zzaA().zzk().zzc("No number filter for double param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                    break;
                                }
                                Boolean zzg = zzy.zzg(((Double) obj).doubleValue(), zzemVar.zzc());
                                if (zzg == null) {
                                    break;
                                }
                                if (zzg.booleanValue() == z9) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!zzemVar.zzk()) {
                                    if (!zzemVar.zzi()) {
                                        this.zza.zzt.zzaA().zzk().zzc("No filter for String param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                        break;
                                    }
                                    String str = (String) obj;
                                    if (!zzli.zzx(str)) {
                                        this.zza.zzt.zzaA().zzk().zzc("Invalid param value for number filter. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                        break;
                                    }
                                    zzi = zzy.zzi(str, zzemVar.zzc());
                                } else {
                                    zzi = zzy.zzf((String) obj, zzemVar.zzd(), this.zza.zzt.zzaA());
                                }
                                if (zzi == null) {
                                    break;
                                }
                                if (zzi.booleanValue() == z9) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj == null) {
                                this.zza.zzt.zzaA().zzj().zzc("Missing param for filter. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                bool = Boolean.FALSE;
                            } else {
                                this.zza.zzt.zzaA().zzk().zzc("Unknown param type. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                            }
                        }
                    } else {
                        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                        if (hashSet.contains(zzfxVar.zzg())) {
                            if (!zzfxVar.zzw()) {
                                if (!zzfxVar.zzu()) {
                                    if (!zzfxVar.zzy()) {
                                        this.zza.zzt.zzaA().zzk().zzc("Unknown value for param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zzfxVar.zzg()));
                                        break;
                                    }
                                    arrayMap.put(zzfxVar.zzg(), zzfxVar.zzh());
                                } else {
                                    arrayMap.put(zzfxVar.zzg(), zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                                }
                            } else {
                                arrayMap.put(zzfxVar.zzg(), zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                            }
                        }
                    }
                }
            } else {
                com.google.android.gms.internal.measurement.zzem zzemVar2 = (com.google.android.gms.internal.measurement.zzem) it.next();
                if (zzemVar2.zze().isEmpty()) {
                    this.zza.zzt.zzaA().zzk().zzb("null or empty param name in filter. event", this.zza.zzt.zzj().zzd(zzh));
                    break;
                }
                hashSet.add(zzemVar2.zze());
            }
        }
        this.zza.zzt.zzaA().zzj().zzb("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
