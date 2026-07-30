package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfqg {
    private final zzenr zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfjd zzf;
    private final zzfje zzg;
    private final Clock zzh;
    private final zzazh zzi;

    public zzfqg(zzenr zzenrVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfjd zzfjdVar, zzfje zzfjeVar, Clock clock, zzazh zzazhVar) {
        this.zza = zzenrVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfjdVar;
        this.zzg = zzfjeVar;
        this.zzh = clock;
        this.zzi = zzazhVar;
    }

    public static String zzd(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        return TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfjc zzfjcVar, zzfir zzfirVar, List list) {
        return zzb(zzfjcVar, zzfirVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        if (r5 == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzfjc zzfjcVar, zzfir zzfirVar, boolean z, String str, String str2, List list, zzczz zzczzVar, zzcdv zzcdvVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            boolean z2 = true;
            String zzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfjcVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES), "@gw_sdkver@", this.zzb);
            if (zzfirVar != null) {
                String zzd2 = zzd(zzd(zzd(zzd, "@gw_qdata@", zzfirVar.zzy), "@gw_adnetid@", zzfirVar.zzx), "@gw_allocid@", zzfirVar.zzw);
                Context context = this.zze;
                zzd = zzccs.zza(zzd2, context, zzfirVar.zzW, zzfirVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoY)).booleanValue() && zzfirVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    if (true == com.google.android.gms.ads.internal.util.zzs.zzL(context)) {
                        str3 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                    }
                    zzd = zzd(zzd, "@gw_aps@", str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpj)).booleanValue() && zzcdvVar != null) {
                    int i = zzcdvVar.zza;
                    String zzd3 = zzd(zzd, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i2 = zzcdvVar.zzb;
                    String zzd4 = zzd(zzd3, "@gw_fis@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcdvVar.zzc;
                    zzd = zzd(zzd4, "@gw_sfis@", i3 >= 0 ? Integer.toString(i3) : "");
                }
            }
            zzenr zzenrVar = this.zza;
            String zzd5 = zzd(zzd(zzd(zzd(zzd, "@gw_adnetstatus@", zzenrVar.zzg()), "@gw_ttr@", Long.toString(zzenrVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzph)).booleanValue()) {
                zzd5 = (zzczzVar == null || zzczzVar.zza() <= 0) ? zzd(zzd5, "@gw_placement_id@", "") : zzd(zzd5, "@gw_placement_id@", Long.toString(zzczzVar.zza(), 10));
            }
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzes)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (z3) {
                z2 = z4;
            }
            if (this.zzi.zza(Uri.parse(zzd5))) {
                Uri.Builder buildUpon = Uri.parse(zzd5).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzd5 = buildUpon.build().toString();
                arrayList.add(zzd5);
            }
            arrayList.add(zzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzc(zzfir zzfirVar, List list, zzcag zzcagVar) {
        zzfjd zzfjdVar;
        zzgra zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zzb = zzcagVar.zzb();
            String num = Integer.toString(zzcagVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzet)).booleanValue()) {
                zzfje zzfjeVar = this.zzg;
                if (zzfjeVar == null) {
                    zzd = zzgra.zzc();
                    String str = (String) zzd.zzb(zzfqf.zza).zza("");
                    String str2 = (String) zzd.zzb(zzfqe.zza).zza("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzccs.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzb)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfirVar.zzW, zzfirVar.zzaw));
                    }
                    return arrayList;
                }
                zzfjdVar = zzfjeVar.zza;
            } else {
                zzfjdVar = this.zzf;
            }
            zzd = zzgra.zzd(zzfjdVar);
            String str3 = (String) zzd.zzb(zzfqf.zza).zza("");
            String str22 = (String) zzd.zzb(zzfqe.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
