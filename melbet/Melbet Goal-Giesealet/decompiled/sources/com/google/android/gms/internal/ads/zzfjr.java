package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfjr {
    private final zzehk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfcv zzf;
    private final zzfcw zzg;
    private final Clock zzh;
    private final zzauu zzi;

    public zzfjr(zzehk zzehkVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfcv zzfcvVar, zzfcw zzfcwVar, Clock clock, zzauu zzauuVar) {
        this.zza = zzehkVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfcvVar;
        this.zzg = zzfcwVar;
        this.zzh = clock;
        this.zzi = zzauuVar;
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

    public final List zza(zzfcu zzfcuVar, zzfcj zzfcjVar, List list) {
        return zzb(zzfcuVar, zzfcjVar, false, "", "", list, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
    
        if (r2 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, boolean z, String str, String str2, List list, zzcum zzcumVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String zzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfcuVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfcjVar != null) {
                String zzd2 = zzd(zzd(zzd(zzd, "@gw_qdata@", zzfcjVar.zzy), "@gw_adnetid@", zzfcjVar.zzx), "@gw_allocid@", zzfcjVar.zzw);
                Context context = this.zze;
                zzd = zzbxt.zza(zzd2, context, zzfcjVar.zzW, zzfcjVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoj)).booleanValue() && zzfcjVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzd = zzd(zzd, "@gw_aps@", true == com.google.android.gms.ads.internal.util.zzs.zzK(context) ? "1" : "0");
                }
            }
            zzehk zzehkVar = this.zza;
            String zzd3 = zzd(zzd(zzd(zzd(zzd, "@gw_adnetstatus@", zzehkVar.zzg()), "@gw_ttr@", Long.toString(zzehkVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzos)).booleanValue()) {
                zzd3 = (zzcumVar == null || zzcumVar.zza() <= 0) ? zzd(zzd3, "@gw_placement_id@", "") : zzd(zzd3, "@gw_placement_id@", Long.toString(zzcumVar.zza(), 10));
            }
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdW)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (z3) {
                z2 = z4;
            }
            if (this.zzi.zza(Uri.parse(zzd3))) {
                Uri.Builder buildUpon = Uri.parse(zzd3).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzd3 = buildUpon.build().toString();
                arrayList.add(zzd3);
            }
            arrayList.add(zzd3);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzc(zzfcj zzfcjVar, List list, zzbvh zzbvhVar) {
        zzfcv zzfcvVar;
        zzgha zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zzb = zzbvhVar.zzb();
            String num = Integer.toString(zzbvhVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdX)).booleanValue()) {
                zzfcw zzfcwVar = this.zzg;
                if (zzfcwVar == null) {
                    zzd = zzgha.zzc();
                    String str = (String) zzd.zzb(zzfjq.zza).zza("");
                    String str2 = (String) zzd.zzb(zzfjp.zza).zza("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzbxt.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzb)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfcjVar.zzW, zzfcjVar.zzaw));
                    }
                    return arrayList;
                }
                zzfcvVar = zzfcwVar.zza;
            } else {
                zzfcvVar = this.zzf;
            }
            zzd = zzgha.zzd(zzfcvVar);
            String str3 = (String) zzd.zzb(zzfjq.zza).zza("");
            String str22 = (String) zzd.zzb(zzfjp.zza).zza("");
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
