package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzffg {
    public final com.google.android.gms.ads.internal.client.zzfk zza;
    public final zzblh zzb;
    public final zzemk zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbes zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfet zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final com.google.android.gms.ads.internal.client.zzcf zzt;

    /* synthetic */ zzffg(zzffe zzffeVar, zzfff zzfffVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        String str;
        com.google.android.gms.ads.internal.client.zzcf zzcfVar;
        com.google.android.gms.ads.internal.client.zzl zzlVar;
        com.google.android.gms.ads.internal.client.zzl zzlVar2;
        com.google.android.gms.ads.internal.client.zzl zzlVar3;
        com.google.android.gms.ads.internal.client.zzl zzlVar4;
        com.google.android.gms.ads.internal.client.zzl zzlVar5;
        com.google.android.gms.ads.internal.client.zzl zzlVar6;
        com.google.android.gms.ads.internal.client.zzl zzlVar7;
        com.google.android.gms.ads.internal.client.zzl zzlVar8;
        com.google.android.gms.ads.internal.client.zzl zzlVar9;
        com.google.android.gms.ads.internal.client.zzl zzlVar10;
        com.google.android.gms.ads.internal.client.zzl zzlVar11;
        com.google.android.gms.ads.internal.client.zzl zzlVar12;
        com.google.android.gms.ads.internal.client.zzl zzlVar13;
        com.google.android.gms.ads.internal.client.zzl zzlVar14;
        com.google.android.gms.ads.internal.client.zzl zzlVar15;
        com.google.android.gms.ads.internal.client.zzl zzlVar16;
        com.google.android.gms.ads.internal.client.zzl zzlVar17;
        com.google.android.gms.ads.internal.client.zzl zzlVar18;
        com.google.android.gms.ads.internal.client.zzl zzlVar19;
        com.google.android.gms.ads.internal.client.zzl zzlVar20;
        com.google.android.gms.ads.internal.client.zzl zzlVar21;
        com.google.android.gms.ads.internal.client.zzl zzlVar22;
        com.google.android.gms.ads.internal.client.zzl zzlVar23;
        com.google.android.gms.ads.internal.client.zzl zzlVar24;
        com.google.android.gms.ads.internal.client.zzl zzlVar25;
        com.google.android.gms.ads.internal.client.zzl zzlVar26;
        com.google.android.gms.ads.internal.client.zzfk zzfkVar;
        zzbes zzbesVar;
        com.google.android.gms.ads.internal.client.zzfk zzfkVar2;
        zzbes zzbesVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zzbes zzbesVar3;
        zzbes zzbesVar4;
        com.google.android.gms.ads.internal.client.zzw zzwVar;
        int i;
        AdManagerAdViewOptions adManagerAdViewOptions;
        PublisherAdViewOptions publisherAdViewOptions;
        com.google.android.gms.ads.internal.client.zzcb zzcbVar;
        zzblh zzblhVar;
        zzfer zzferVar;
        boolean z;
        boolean z2;
        zzemk zzemkVar;
        boolean z3;
        Bundle bundle;
        boolean z4;
        zzqVar = zzffeVar.zzb;
        this.zze = zzqVar;
        str = zzffeVar.zzc;
        this.zzf = str;
        zzcfVar = zzffeVar.zzu;
        this.zzt = zzcfVar;
        zzlVar = zzffeVar.zza;
        int i2 = zzlVar.zza;
        zzlVar2 = zzffeVar.zza;
        long j = zzlVar2.zzb;
        zzlVar3 = zzffeVar.zza;
        Bundle bundle2 = zzlVar3.zzc;
        zzlVar4 = zzffeVar.zza;
        int i3 = zzlVar4.zzd;
        zzlVar5 = zzffeVar.zza;
        List list = zzlVar5.zze;
        zzlVar6 = zzffeVar.zza;
        boolean z5 = zzlVar6.zzf;
        zzlVar7 = zzffeVar.zza;
        int i4 = zzlVar7.zzg;
        zzlVar8 = zzffeVar.zza;
        boolean z6 = true;
        if (!zzlVar8.zzh) {
            z4 = zzffeVar.zze;
            if (!z4) {
                z6 = false;
            }
        }
        zzlVar9 = zzffeVar.zza;
        String str2 = zzlVar9.zzi;
        zzlVar10 = zzffeVar.zza;
        com.google.android.gms.ads.internal.client.zzfh zzfhVar = zzlVar10.zzj;
        zzlVar11 = zzffeVar.zza;
        Location location = zzlVar11.zzk;
        zzlVar12 = zzffeVar.zza;
        String str3 = zzlVar12.zzl;
        zzlVar13 = zzffeVar.zza;
        Bundle bundle3 = zzlVar13.zzm;
        zzlVar14 = zzffeVar.zza;
        Bundle bundle4 = zzlVar14.zzn;
        zzlVar15 = zzffeVar.zza;
        List list2 = zzlVar15.zzo;
        zzlVar16 = zzffeVar.zza;
        String str4 = zzlVar16.zzp;
        zzlVar17 = zzffeVar.zza;
        String str5 = zzlVar17.zzq;
        zzlVar18 = zzffeVar.zza;
        boolean z7 = zzlVar18.zzr;
        zzlVar19 = zzffeVar.zza;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar19.zzs;
        zzlVar20 = zzffeVar.zza;
        int i5 = zzlVar20.zzt;
        zzlVar21 = zzffeVar.zza;
        String str6 = zzlVar21.zzu;
        zzlVar22 = zzffeVar.zza;
        List list3 = zzlVar22.zzv;
        zzlVar23 = zzffeVar.zza;
        int zza = com.google.android.gms.ads.internal.util.zzt.zza(zzlVar23.zzw);
        zzlVar24 = zzffeVar.zza;
        String str7 = zzlVar24.zzx;
        zzlVar25 = zzffeVar.zza;
        int i6 = zzlVar25.zzy;
        zzlVar26 = zzffeVar.zza;
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i2, j, bundle2, i3, list, z5, i4, z6, str2, zzfhVar, location, str3, bundle3, bundle4, list2, str4, str5, z7, zzcVar, i5, str6, list3, zza, str7, i6, zzlVar26.zzz);
        zzfkVar = zzffeVar.zzd;
        if (zzfkVar != null) {
            zzfkVar2 = zzffeVar.zzd;
        } else {
            zzbesVar = zzffeVar.zzh;
            if (zzbesVar != null) {
                zzbesVar2 = zzffeVar.zzh;
                zzfkVar2 = zzbesVar2.zzf;
            } else {
                zzfkVar2 = null;
            }
        }
        this.zza = zzfkVar2;
        arrayList = zzffeVar.zzf;
        this.zzg = arrayList;
        arrayList2 = zzffeVar.zzg;
        this.zzh = arrayList2;
        arrayList3 = zzffeVar.zzf;
        if (arrayList3 == null) {
            zzbesVar4 = null;
        } else {
            zzbesVar3 = zzffeVar.zzh;
            zzbesVar4 = zzbesVar3 == null ? new zzbes(new NativeAdOptions.Builder().build()) : zzffeVar.zzh;
        }
        this.zzi = zzbesVar4;
        zzwVar = zzffeVar.zzi;
        this.zzj = zzwVar;
        i = zzffeVar.zzm;
        this.zzk = i;
        adManagerAdViewOptions = zzffeVar.zzj;
        this.zzl = adManagerAdViewOptions;
        publisherAdViewOptions = zzffeVar.zzk;
        this.zzm = publisherAdViewOptions;
        zzcbVar = zzffeVar.zzl;
        this.zzn = zzcbVar;
        zzblhVar = zzffeVar.zzn;
        this.zzb = zzblhVar;
        zzferVar = zzffeVar.zzo;
        this.zzo = new zzfet(zzferVar, null);
        z = zzffeVar.zzp;
        this.zzp = z;
        z2 = zzffeVar.zzq;
        this.zzq = z2;
        zzemkVar = zzffeVar.zzr;
        this.zzc = zzemkVar;
        z3 = zzffeVar.zzs;
        this.zzr = z3;
        bundle = zzffeVar.zzt;
        this.zzs = bundle;
    }

    public final zzbgu zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcP));
    }
}
