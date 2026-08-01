package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfeo {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfl zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbfw zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbmm zzn;
    private zzenm zzq;
    private com.google.android.gms.ads.internal.client.zzcf zzs;
    private int zzm = 1;
    private final zzfeb zzo = new zzfeb();
    private boolean zzp = false;
    private boolean zzr = false;

    public final zzfeo zzA(zzbfw zzbfwVar) {
        this.zzh = zzbfwVar;
        return this;
    }

    public final zzfeo zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfeo zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfeo zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfeo zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfeo zzF(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        this.zzd = zzflVar;
        return this;
    }

    public final zzfeq zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfeq(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfeo zzQ(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzs = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzfeb zzo() {
        return this.zzo;
    }

    public final zzfeo zzp(zzfeq zzfeqVar) {
        this.zzo.zza(zzfeqVar.zzo.zza);
        this.zza = zzfeqVar.zzd;
        this.zzb = zzfeqVar.zze;
        this.zzs = zzfeqVar.zzr;
        this.zzc = zzfeqVar.zzf;
        this.zzd = zzfeqVar.zza;
        this.zzf = zzfeqVar.zzg;
        this.zzg = zzfeqVar.zzh;
        this.zzh = zzfeqVar.zzi;
        this.zzi = zzfeqVar.zzj;
        zzq(zzfeqVar.zzl);
        zzD(zzfeqVar.zzm);
        this.zzp = zzfeqVar.zzp;
        this.zzq = zzfeqVar.zzc;
        this.zzr = zzfeqVar.zzq;
        return this;
    }

    public final zzfeo zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfeo zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfeo zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfeo zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfeo zzu(zzenm zzenmVar) {
        this.zzq = zzenmVar;
        return this;
    }

    public final zzfeo zzv(zzbmm zzbmmVar) {
        this.zzn = zzbmmVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfl(false, true, false);
        return this;
    }

    public final zzfeo zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfeo zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfeo zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfeo zzz(int i) {
        this.zzm = i;
        return this;
    }
}
