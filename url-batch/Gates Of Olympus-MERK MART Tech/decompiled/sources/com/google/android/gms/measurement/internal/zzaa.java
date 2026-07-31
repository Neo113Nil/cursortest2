package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzaa extends zzz {
    private zzff.zzb zzg;
    private final /* synthetic */ zzu zzh;

    @Override // com.google.android.gms.measurement.internal.zzz
    final int zza() {
        return this.zzg.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    final boolean zzc() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzu zzuVar, String str, int i, zzff.zzb zzbVar) {
        super(str, i);
        this.zzh = zzuVar;
        this.zzg = zzbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    final boolean zzb() {
        return this.zzg.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
    
        if (r6.booleanValue() == false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zza(Long l, Long l2, zzfn.zzf zzfVar, long j, zzaz zzazVar, boolean z) {
        Boolean zza;
        Boolean bool = false;
        boolean z2 = zzoc.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbk);
        long j2 = this.zzg.zzj() ? zzazVar.zze : j;
        if (this.zzh.zzj().zza(2)) {
            this.zzh.zzj().zzp().zza("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzb), this.zzg.zzl() ? Integer.valueOf(this.zzg.zzb()) : null, this.zzh.zzi().zza(this.zzg.zzf()));
            this.zzh.zzj().zzp().zza("Filter definition", this.zzh.g_().zza(this.zzg));
        }
        if (!this.zzg.zzl() || this.zzg.zzb() > 256) {
            this.zzh.zzj().zzu().zza("Invalid event filter ID. appId, id", zzfw.zza(this.zza), String.valueOf(this.zzg.zzl() ? Integer.valueOf(this.zzg.zzb()) : null));
            return false;
        }
        boolean z3 = this.zzg.zzh() || this.zzg.zzi() || this.zzg.zzj();
        if (z && !z3) {
            this.zzh.zzj().zzp().zza("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zzl() ? Integer.valueOf(this.zzg.zzb()) : null);
            return true;
        }
        zzff.zzb zzbVar = this.zzg;
        String zzg = zzfVar.zzg();
        if (zzbVar.zzk()) {
            Boolean zza2 = zza(j2, zzbVar.zze());
            if (zza2 != null) {
            }
            bool = null;
            this.zzh.zzj().zzp().zza("Event filter result", bool != null ? AbstractJsonLexerKt.NULL : bool);
            if (bool != null) {
                return false;
            }
            this.zzc = true;
            if (!bool.booleanValue()) {
                return true;
            }
            this.zzd = true;
            if (z3 && zzfVar.zzk()) {
                Long valueOf = Long.valueOf(zzfVar.zzd());
                if (this.zzg.zzi()) {
                    if (z2 && this.zzg.zzk()) {
                        valueOf = l;
                    }
                    this.zzf = valueOf;
                } else {
                    if (z2 && this.zzg.zzk()) {
                        valueOf = l2;
                    }
                    this.zze = valueOf;
                }
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator<zzff.zzc> it = zzbVar.zzg().iterator();
        while (true) {
            if (it.hasNext()) {
                zzff.zzc next = it.next();
                if (next.zze().isEmpty()) {
                    this.zzh.zzj().zzu().zza("null or empty param name in filter. event", this.zzh.zzi().zza(zzg));
                    break;
                }
                hashSet.add(next.zze());
            } else {
                ArrayMap arrayMap = new ArrayMap();
                Iterator<zzfn.zzh> it2 = zzfVar.zzh().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zzfn.zzh next2 = it2.next();
                        if (hashSet.contains(next2.zzg())) {
                            if (next2.zzl()) {
                                arrayMap.put(next2.zzg(), next2.zzl() ? Long.valueOf(next2.zzd()) : null);
                            } else if (next2.zzj()) {
                                arrayMap.put(next2.zzg(), next2.zzj() ? Double.valueOf(next2.zza()) : null);
                            } else if (next2.zzn()) {
                                arrayMap.put(next2.zzg(), next2.zzh());
                            } else {
                                this.zzh.zzj().zzu().zza("Unknown value for param. event, param", this.zzh.zzi().zza(zzg), this.zzh.zzi().zzb(next2.zzg()));
                                break;
                            }
                        }
                    } else {
                        Iterator<zzff.zzc> it3 = zzbVar.zzg().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                zzff.zzc next3 = it3.next();
                                boolean z4 = next3.zzg() && next3.zzf();
                                String zze = next3.zze();
                                if (zze.isEmpty()) {
                                    this.zzh.zzj().zzu().zza("Event has empty param name. event", this.zzh.zzi().zza(zzg));
                                    break;
                                }
                                Object obj = arrayMap.get(zze);
                                if (obj instanceof Long) {
                                    if (!next3.zzh()) {
                                        this.zzh.zzj().zzu().zza("No number filter for long param. event, param", this.zzh.zzi().zza(zzg), this.zzh.zzi().zzb(zze));
                                        break;
                                    }
                                    Boolean zza3 = zza(((Long) obj).longValue(), next3.zzc());
                                    if (zza3 == null) {
                                        break;
                                    }
                                    if (zza3.booleanValue() == z4) {
                                        break;
                                    }
                                } else if (obj instanceof Double) {
                                    if (!next3.zzh()) {
                                        this.zzh.zzj().zzu().zza("No number filter for double param. event, param", this.zzh.zzi().zza(zzg), this.zzh.zzi().zzb(zze));
                                        break;
                                    }
                                    Boolean zza4 = zza(((Double) obj).doubleValue(), next3.zzc());
                                    if (zza4 == null) {
                                        break;
                                    }
                                    if (zza4.booleanValue() == z4) {
                                        break;
                                    }
                                } else if (obj instanceof String) {
                                    if (next3.zzj()) {
                                        zza = zza((String) obj, next3.zzd(), this.zzh.zzj());
                                    } else if (next3.zzh()) {
                                        String str = (String) obj;
                                        if (zznl.zzb(str)) {
                                            zza = zza(str, next3.zzc());
                                        } else {
                                            this.zzh.zzj().zzu().zza("Invalid param value for number filter. event, param", this.zzh.zzi().zza(zzg), this.zzh.zzi().zzb(zze));
                                            break;
                                        }
                                    } else {
                                        this.zzh.zzj().zzu().zza("No filter for String param. event, param", this.zzh.zzi().zza(zzg), this.zzh.zzi().zzb(zze));
                                        break;
                                    }
                                    if (zza == null) {
                                        break;
                                    }
                                    if (zza.booleanValue() == z4) {
                                        break;
                                    }
                                } else if (obj == null) {
                                    this.zzh.zzj().zzp().zza("Missing param for filter. event, param", this.zzh.zzi().zza(zzg), this.zzh.zzi().zzb(zze));
                                } else {
                                    this.zzh.zzj().zzu().zza("Unknown param type. event, param", this.zzh.zzi().zza(zzg), this.zzh.zzi().zzb(zze));
                                }
                            } else {
                                bool = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.zzh.zzj().zzp().zza("Event filter result", bool != null ? AbstractJsonLexerKt.NULL : bool);
        if (bool != null) {
        }
    }
}
