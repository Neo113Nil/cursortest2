package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import com.ironsource.ge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzif extends zzpg implements zzal {
    final Map zza;
    final Map zzb;
    final Map zzc;
    final e zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzf;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    zzif(zzpv zzpvVar) {
        super(zzpvVar);
        this.zzf = new androidx.collection.a();
        this.zza = new androidx.collection.a();
        this.zzb = new androidx.collection.a();
        this.zzc = new androidx.collection.a();
        this.zzh = new androidx.collection.a();
        this.zzj = new androidx.collection.a();
        this.zzk = new androidx.collection.a();
        this.zzl = new androidx.collection.a();
        this.zzi = new androidx.collection.a();
        this.zzd = new zzic(this, 20);
        this.zze = new zzid(this);
    }

    private final com.google.android.gms.internal.measurement.zzgo zzG(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzgo.zzh();
        }
        try {
            com.google.android.gms.internal.measurement.zzgo zzgoVar = (com.google.android.gms.internal.measurement.zzgo) ((com.google.android.gms.internal.measurement.zzgn) zzqa.zzp(com.google.android.gms.internal.measurement.zzgo.zzf(), bArr)).zzba();
            this.zzu.zzaW().zzj().zzc("Parsed config. version, gmp_app_id", zzgoVar.zzw() ? Long.valueOf(zzgoVar.zzc()) : null, zzgoVar.zzu() ? zzgoVar.zzj() : null);
            return zzgoVar;
        } catch (com.google.android.gms.internal.measurement.zzmm e4) {
            this.zzu.zzaW().zzk().zzc("Unable to merge remote config. appId", zzhe.zzn(str), e4);
            return com.google.android.gms.internal.measurement.zzgo.zzh();
        } catch (RuntimeException e5) {
            this.zzu.zzaW().zzk().zzc("Unable to merge remote config. appId", zzhe.zzn(str), e5);
            return com.google.android.gms.internal.measurement.zzgo.zzh();
        }
    }

    private final void zzH(String str, com.google.android.gms.internal.measurement.zzgn zzgnVar) {
        HashSet hashSet = new HashSet();
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        Iterator it = zzgnVar.zzh().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzgk) it.next()).zzb());
        }
        for (int i4 = 0; i4 < zzgnVar.zza(); i4++) {
            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgnVar.zzb(i4).zzch();
            if (zzglVar.zzc().isEmpty()) {
                this.zzu.zzaW().zzk().zza("EventConfig contained null event name");
            } else {
                String zzc = zzglVar.zzc();
                String zzb = zzjy.zzb(zzglVar.zzc());
                if (!TextUtils.isEmpty(zzb)) {
                    zzglVar.zzb(zzb);
                    zzgnVar.zze(i4, zzglVar);
                }
                if (zzglVar.zzf() && zzglVar.zzd()) {
                    aVar.put(zzc, Boolean.TRUE);
                }
                if (zzglVar.zzg() && zzglVar.zze()) {
                    aVar2.put(zzglVar.zzc(), Boolean.TRUE);
                }
                if (zzglVar.zzh()) {
                    if (zzglVar.zza() < 2 || zzglVar.zza() > 65535) {
                        this.zzu.zzaW().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzglVar.zzc(), Integer.valueOf(zzglVar.zza()));
                    } else {
                        aVar3.put(zzglVar.zzc(), Integer.valueOf(zzglVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, aVar);
        this.zzc.put(str, aVar2);
        this.zzi.put(str, aVar3);
    }

    private final void zzI(String str) {
        zzav();
        zzg();
        Preconditions.checkNotEmpty(str);
        Map map = this.zzh;
        if (map.get(str) == null) {
            zzar zzn = this.zzg.zzj().zzn(str);
            if (zzn != null) {
                com.google.android.gms.internal.measurement.zzgn zzgnVar = (com.google.android.gms.internal.measurement.zzgn) zzG(str, zzn.zza).zzch();
                zzH(str, zzgnVar);
                this.zzf.put(str, zzK((com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba()));
                map.put(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
                zzJ(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
                this.zzj.put(str, zzgnVar.zzf());
                this.zzk.put(str, zzn.zzb);
                this.zzl.put(str, zzn.zzc);
                return;
            }
            this.zzf.put(str, null);
            this.zzb.put(str, null);
            this.zza.put(str, null);
            this.zzc.put(str, null);
            map.put(str, null);
            this.zzj.put(str, null);
            this.zzk.put(str, null);
            this.zzl.put(str, null);
            this.zzi.put(str, null);
        }
    }

    private final void zzJ(final String str, com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        if (zzgoVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzj().zzb("EES programs found", Integer.valueOf(zzgoVar.zza()));
        com.google.android.gms.internal.measurement.zziv zzivVar = (com.google.android.gms.internal.measurement.zziv) zzgoVar.zzo().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzie(zzif.this, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzif zzifVar = zzif.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzib
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzif zzifVar2 = zzif.this;
                            zzaw zzj = zzifVar2.zzg.zzj();
                            String str3 = str2;
                            zzh zzl = zzj.zzl(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put(ge.f16399G, "android");
                            hashMap.put(b9.h.f15462V, str3);
                            zzifVar2.zzu.zzf().zzj();
                            hashMap.put("gmp_version", 119002L);
                            if (zzl != null) {
                                String zzF = zzl.zzF();
                                if (zzF != null) {
                                    hashMap.put("app_version", zzF);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zzl.zze()));
                                hashMap.put("dynamite_version", Long.valueOf(zzl.zzo()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzia
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(zzif.this.zze);
                }
            });
            zzcVar.zzc(zzivVar);
            this.zzd.put(str, zzcVar);
            zzioVar.zzaW().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzivVar.zza().zza()));
            Iterator it = zzivVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzioVar.zzaW().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzit) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzu.zzaW().zze().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzK(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (zzgoVar != null) {
            for (com.google.android.gms.internal.measurement.zzgw zzgwVar : zzgoVar.zzp()) {
                aVar.put(zzgwVar.zzb(), zzgwVar.zzc());
            }
        }
        return aVar;
    }

    private static final zzjw zzL(int i4) {
        int i5 = i4 - 1;
        if (i5 == 1) {
            return zzjw.AD_STORAGE;
        }
        if (i5 == 2) {
            return zzjw.ANALYTICS_STORAGE;
        }
        if (i5 == 3) {
            return zzjw.AD_USER_DATA;
        }
        if (i5 != 4) {
            return null;
        }
        return zzjw.AD_PERSONALIZATION;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzif zzifVar, String str) {
        zzifVar.zzav();
        Preconditions.checkNotEmpty(str);
        if (!zzifVar.zzs(str)) {
            return null;
        }
        Map map = zzifVar.zzh;
        if (!map.containsKey(str) || map.get(str) == null) {
            zzifVar.zzI(str);
        } else {
            zzifVar.zzJ(str, (com.google.android.gms.internal.measurement.zzgo) map.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzifVar.zzd.snapshot().get(str);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zze(zzif zzifVar, String str) {
        zzifVar.zzav();
        Preconditions.checkNotEmpty(str);
        zzar zzn = zzifVar.zzg.zzj().zzn(str);
        if (zzn == null) {
            return null;
        }
        zzifVar.zzu.zzaW().zzj().zzb("Populate EES config from database on cache miss. appId", str);
        zzifVar.zzJ(str, zzifVar.zzG(str, zzn.zza));
        return (com.google.android.gms.internal.measurement.zzc) zzifVar.zzd.snapshot().get(str);
    }

    final boolean zzA(String str) {
        zzg();
        zzI(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    final boolean zzB(String str) {
        zzg();
        zzI(str);
        Map map = this.zza;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean zzC(String str) {
        zzg();
        zzI(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean zzD(String str) {
        zzg();
        zzI(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    final boolean zzE(String str) {
        zzg();
        zzI(str);
        Map map = this.zza;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(CommonUrlParts.OS_VERSION) || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean zzF(String str) {
        zzg();
        zzI(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.zzal
    public final String zza(String str, String str2) {
        zzg();
        zzI(str);
        Map map = (Map) this.zzf.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }

    final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzI(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final zzju zzf(String str, zzjw zzjwVar) {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzi = zzi(str);
        if (zzi == null) {
            return zzju.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.zzfz zzfzVar : zzi.zzf()) {
            if (zzL(zzfzVar.zzc()) == zzjwVar) {
                int zzb = zzfzVar.zzb() - 1;
                return zzb != 1 ? zzb != 2 ? zzju.UNINITIALIZED : zzju.DENIED : zzju.GRANTED;
            }
        }
        return zzju.UNINITIALIZED;
    }

    final zzjw zzh(String str, zzjw zzjwVar) {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzi = zzi(str);
        if (zzi == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.zzgb zzgbVar : zzi.zze()) {
            if (zzjwVar == zzL(zzgbVar.zzc())) {
                return zzL(zzgbVar.zzb());
            }
        }
        return null;
    }

    final com.google.android.gms.internal.measurement.zzgi zzi(String str) {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgo zzj = zzj(str);
        if (zzj == null || !zzj.zzt()) {
            return null;
        }
        return zzj.zzd();
    }

    protected final com.google.android.gms.internal.measurement.zzgo zzj(String str) {
        zzav();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzI(str);
        return (com.google.android.gms.internal.measurement.zzgo) this.zzh.get(str);
    }

    protected final String zzk(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    protected final String zzl(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    final String zzm(String str) {
        zzg();
        zzI(str);
        return (String) this.zzj.get(str);
    }

    final Set zzo(String str) {
        zzg();
        zzI(str);
        return (Set) this.zza.get(str);
    }

    final SortedSet zzp(String str) {
        zzg();
        zzI(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.zzgi zzi = zzi(str);
        if (zzi != null) {
            Iterator it = zzi.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.zzgh) it.next()).zzb());
            }
        }
        return treeSet;
    }

    protected final void zzq(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    final void zzr(String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzs(String str) {
        com.google.android.gms.internal.measurement.zzgo zzgoVar;
        return (TextUtils.isEmpty(str) || (zzgoVar = (com.google.android.gms.internal.measurement.zzgo) this.zzh.get(str)) == null || zzgoVar.zza() == 0) ? false : true;
    }

    final boolean zzt(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzu(String str, zzjw zzjwVar) {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzi = zzi(str);
        if (zzi == null) {
            return false;
        }
        Iterator it = zzi.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.zzfz zzfzVar = (com.google.android.gms.internal.measurement.zzfz) it.next();
            if (zzjwVar == zzL(zzfzVar.zzc())) {
                if (zzfzVar.zzb() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean zzv(String str) {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzi = zzi(str);
        return zzi == null || !zzi.zzh() || zzi.zzg();
    }

    final boolean zzw(String str, String str2) {
        Boolean bool;
        zzg();
        zzI(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzx(String str, String str2) {
        Boolean bool;
        zzg();
        zzI(str);
        if (zzt(str) && zzqf.zzap(str2)) {
            return true;
        }
        if (zzy(str) && zzqf.zzaq(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzy(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean zzz(String str, byte[] bArr, String str2, String str3) {
        zzav();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzgn zzgnVar = (com.google.android.gms.internal.measurement.zzgn) zzG(str, bArr).zzch();
        zzH(str, zzgnVar);
        zzJ(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
        this.zzj.put(str, zzgnVar.zzf());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzf.put(str, zzK((com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba()));
        this.zzg.zzj().zzR(str, new ArrayList(zzgnVar.zzg()));
        try {
            zzgnVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba()).zzcd();
        } catch (RuntimeException e4) {
            this.zzu.zzaW().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzhe.zzn(str), e4);
        }
        zzaw zzj = this.zzg.zzj();
        Preconditions.checkNotEmpty(str);
        zzj.zzg();
        zzj.zzav();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzj.zzj().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzj.zzu.zzaW().zze().zzb("Failed to update remote config (got 0). appId", zzhe.zzn(str));
            }
        } catch (SQLiteException e5) {
            zzj.zzu.zzaW().zze().zzc("Error storing remote config. appId", zzhe.zzn(str), e5);
        }
        if (this.zzu.zzf().zzx(null, zzgi.zzbn)) {
            zzgnVar.zzd();
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
        return true;
    }
}
