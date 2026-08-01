package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfjy implements zzfjw {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    zzfjy(Context context, int i) {
        this.zza = context;
        this.zzo = i;
    }

    public final synchronized zzfjy zzH(int i) {
        this.zzp = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzb(zzfeg zzfegVar) {
        zzr(zzfegVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzf(boolean z) {
        zzv(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzg(Throwable th) {
        zzw(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final synchronized zzfka zzl() {
        zzfjz zzfjzVar = null;
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfka(this, zzfjzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final /* bridge */ /* synthetic */ zzfjw zzm(int i) {
        zzH(i);
        return this;
    }

    public final synchronized zzfjy zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcya zzcyaVar = (zzcya) iBinder;
            String zzk = zzcyaVar.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            String zzi = zzcyaVar.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.zzg = zzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfjy zzr(zzfeg zzfegVar) {
        if (!TextUtils.isEmpty(zzfegVar.zzb.zzb)) {
            this.zzf = zzfegVar.zzb.zzb;
        }
        Iterator it = zzfegVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfdu zzfduVar = (zzfdu) it.next();
            if (!TextUtils.isEmpty(zzfduVar.zzac)) {
                break;
            }
        }
        return this;
    }

    public final synchronized zzfjy zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziE)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfjy zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfjy zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfjy zzv(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfjy zzw(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziE)).booleanValue()) {
            this.zzk = zzbus.zzd(th);
            this.zzj = (String) zzful.zzc(zzftk.zzc('\n')).zzd(zzbus.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfjy zzx() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfjy zzy() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}
