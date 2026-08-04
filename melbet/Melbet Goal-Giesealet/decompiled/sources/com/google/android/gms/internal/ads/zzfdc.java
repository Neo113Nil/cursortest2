package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfdc {
    public final com.google.android.gms.ads.internal.client.zzga zza;
    public final zzblw zzb;
    public final zzeli zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbfl zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzco zzo;
    public final zzfcq zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final com.google.android.gms.ads.internal.client.zzcs zzv;

    /* synthetic */ zzfdc(zzfdb zzfdbVar, byte[] bArr) {
        this.zzf = zzfdbVar.zzD();
        this.zzg = zzfdbVar.zzE();
        this.zzv = zzfdbVar.zzY();
        this.zze = zzfdbVar.zzC().zzB;
        com.google.android.gms.ads.internal.client.zzm zzC = zzfdbVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzC2 = zzfdbVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzC3 = zzfdbVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzC4 = zzfdbVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzC5 = zzfdbVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzC6 = zzfdbVar.zzC();
        com.google.android.gms.ads.internal.client.zzm zzC7 = zzfdbVar.zzC();
        int i = zzfdbVar.zzC().zza;
        long j = zzC7.zzb;
        Bundle bundle = zzC6.zzc;
        int i2 = zzC5.zzd;
        List list = zzC4.zze;
        boolean z = zzC3.zzf;
        int i3 = zzC2.zzg;
        boolean z2 = true;
        if (!zzC.zzh && !zzfdbVar.zzG()) {
            z2 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z2, zzfdbVar.zzC().zzi, zzfdbVar.zzC().zzj, zzfdbVar.zzC().zzk, zzfdbVar.zzC().zzl, zzfdbVar.zzC().zzm, zzfdbVar.zzC().zzn, zzfdbVar.zzC().zzo, zzfdbVar.zzC().zzp, zzfdbVar.zzC().zzq, zzfdbVar.zzC().zzr, zzfdbVar.zzC().zzs, zzfdbVar.zzC().zzt, zzfdbVar.zzC().zzu, zzfdbVar.zzC().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfdbVar.zzC().zzw), zzfdbVar.zzC().zzx, zzfdbVar.zzC().zzy, zzfdbVar.zzC().zzz, zzfdbVar.zzC().zzA);
        this.zzd = zzmVar;
        this.zza = zzfdbVar.zzF() != null ? zzfdbVar.zzF() : zzfdbVar.zzJ() != null ? zzfdbVar.zzJ().zzf : null;
        this.zzh = zzfdbVar.zzH();
        this.zzi = zzfdbVar.zzI();
        this.zzj = zzfdbVar.zzH() == null ? null : zzfdbVar.zzJ() == null ? new zzbfl(new NativeAdOptions.Builder().build()) : zzfdbVar.zzJ();
        this.zzk = zzfdbVar.zzK();
        this.zzl = zzfdbVar.zzO();
        this.zzm = zzfdbVar.zzL();
        this.zzn = zzfdbVar.zzM();
        this.zzo = zzfdbVar.zzN();
        this.zzb = zzfdbVar.zzP();
        this.zzp = new zzfcq(zzfdbVar.zzQ(), null);
        this.zzq = zzfdbVar.zzR();
        this.zzr = zzfdbVar.zzS();
        this.zzc = zzfdbVar.zzT();
        this.zzs = zzfdbVar.zzU();
        this.zzt = zzfdbVar.zzV();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzfdbVar.zzW();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdE));
    }
}
