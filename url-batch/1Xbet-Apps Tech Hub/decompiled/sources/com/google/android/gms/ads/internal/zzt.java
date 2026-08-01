package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zzcm;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzawk;
import com.google.android.gms.internal.ads.zzaxx;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzccg;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzcfa;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzefn;
import com.google.android.gms.internal.ads.zzefo;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbzs zzA;
    private final zzcm zzB;
    private final zzcfa zzC;
    private final zzccn zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzt zzd;
    private final zzchh zze;
    private final zzab zzf;
    private final zzawk zzg;
    private final zzcaw zzh;
    private final zzac zzi;
    private final zzaxx zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbdl zzm;
    private final zzay zzn;
    private final zzbwi zzo;
    private final zzbna zzp;
    private final zzccg zzq;
    private final zzbol zzr;
    private final zzw zzs;
    private final zzbx zzt;
    private final zzaa zzu;
    private final com.google.android.gms.ads.internal.overlay.zzab zzv;
    private final zzbpn zzw;
    private final zzby zzx;
    private final zzefo zzy;
    private final zzaym zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzt zztVar = new com.google.android.gms.ads.internal.util.zzt();
        zzchh zzchhVar = new zzchh();
        zzab zzo = zzab.zzo(Build.VERSION.SDK_INT);
        zzawk zzawkVar = new zzawk();
        zzcaw zzcawVar = new zzcaw();
        zzac zzacVar = new zzac();
        zzaxx zzaxxVar = new zzaxx();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbdl zzbdlVar = new zzbdl();
        zzay zzayVar = new zzay();
        zzbwi zzbwiVar = new zzbwi();
        zzbna zzbnaVar = new zzbna();
        zzccg zzccgVar = new zzccg();
        zzbol zzbolVar = new zzbol();
        zzw zzwVar = new zzw();
        zzbx zzbxVar = new zzbx();
        zzaa zzaaVar = new zzaa();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar = new com.google.android.gms.ads.internal.overlay.zzab();
        zzbpn zzbpnVar = new zzbpn();
        zzby zzbyVar = new zzby();
        zzefn zzefnVar = new zzefn();
        zzaym zzaymVar = new zzaym();
        zzbzs zzbzsVar = new zzbzs();
        zzcm zzcmVar = new zzcm();
        zzcfa zzcfaVar = new zzcfa();
        zzccn zzccnVar = new zzccn();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zztVar;
        this.zze = zzchhVar;
        this.zzf = zzo;
        this.zzg = zzawkVar;
        this.zzh = zzcawVar;
        this.zzi = zzacVar;
        this.zzj = zzaxxVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbdlVar;
        this.zzn = zzayVar;
        this.zzo = zzbwiVar;
        this.zzp = zzbnaVar;
        this.zzq = zzccgVar;
        this.zzr = zzbolVar;
        this.zzt = zzbxVar;
        this.zzs = zzwVar;
        this.zzu = zzaaVar;
        this.zzv = zzabVar;
        this.zzw = zzbpnVar;
        this.zzx = zzbyVar;
        this.zzy = zzefnVar;
        this.zzz = zzaymVar;
        this.zzA = zzbzsVar;
        this.zzB = zzcmVar;
        this.zzC = zzcfaVar;
        this.zzD = zzccnVar;
    }

    public static zzefo zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzawk zzb() {
        return zza.zzg;
    }

    public static zzaxx zzc() {
        return zza.zzj;
    }

    public static zzaym zzd() {
        return zza.zzz;
    }

    public static zzbdl zze() {
        return zza.zzm;
    }

    public static zzbol zzf() {
        return zza.zzr;
    }

    public static zzbpn zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzi() {
        return zza.zzc;
    }

    public static zzw zzj() {
        return zza.zzs;
    }

    public static zzaa zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzl() {
        return zza.zzv;
    }

    public static zzbwi zzm() {
        return zza.zzo;
    }

    public static zzbzs zzn() {
        return zza.zzA;
    }

    public static zzcaw zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzt zzp() {
        return zza.zzd;
    }

    public static zzab zzq() {
        return zza.zzf;
    }

    public static zzac zzr() {
        return zza.zzi;
    }

    public static zzay zzs() {
        return zza.zzn;
    }

    public static zzbx zzt() {
        return zza.zzt;
    }

    public static zzby zzu() {
        return zza.zzx;
    }

    public static zzcm zzv() {
        return zza.zzB;
    }

    public static zzccg zzw() {
        return zza.zzq;
    }

    public static zzccn zzx() {
        return zza.zzD;
    }

    public static zzcfa zzy() {
        return zza.zzC;
    }

    public static zzchh zzz() {
        return zza.zze;
    }
}
