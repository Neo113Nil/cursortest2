package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfkw {
    private final zzejp zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfei zzf;
    private final zzfej zzg;
    private final Clock zzh;
    private final zzasi zzi;

    public zzfkw(zzejp zzejpVar, zzcbt zzcbtVar, String str, String str2, Context context, zzfei zzfeiVar, zzfej zzfejVar, Clock clock, zzasi zzasiVar) {
        this.zza = zzejpVar;
        this.zzb = zzcbtVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfeiVar;
        this.zzg = zzfejVar;
        this.zzh = clock;
        this.zzi = zzasiVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(String str) {
        return TextUtils.isEmpty(str) ? "" : zzcbm.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfeh zzfehVar, zzfdu zzfduVar, List list) {
        return zzd(zzfehVar, zzfduVar, false, "", "", list);
    }

    public final List zzd(zzfeh zzfehVar, zzfdu zzfduVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfehVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfduVar != null) {
                zzj = zzbzu.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfduVar.zzz), "@gw_adnetid@", zzfduVar.zzy), "@gw_allocid@", zzfduVar.zzx), this.zze, zzfduVar.zzX);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdn)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !TextUtils.isEmpty(str2);
            if (z3) {
                z2 = z4;
            } else if (!z4) {
                arrayList.add(zzj2);
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zze(zzfdu zzfduVar, List list, zzbwq zzbwqVar) {
        zzfei zzfeiVar;
        zzftu zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zzc = zzbwqVar.zzc();
            String num = Integer.toString(zzbwqVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdo)).booleanValue()) {
                zzfej zzfejVar = this.zzg;
                if (zzfejVar == null) {
                    zzd = zzftu.zzc();
                    String str = (String) zzd.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfku
                        @Override // com.google.android.gms.internal.ads.zzftn
                        public final Object apply(Object obj) {
                            String zzi;
                            zzi = zzfkw.zzi(((zzfei) obj).zza);
                            return zzi;
                        }
                    }).zzb("");
                    String str2 = (String) zzd.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfkv
                        @Override // com.google.android.gms.internal.ads.zzftn
                        public final Object apply(Object obj) {
                            String zzi;
                            zzi = zzfkw.zzi(((zzfei) obj).zzb);
                            return zzi;
                        }
                    }).zzb("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzbzu.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfduVar.zzX));
                    }
                    return arrayList;
                }
                zzfeiVar = zzfejVar.zza;
            } else {
                zzfeiVar = this.zzf;
            }
            zzd = zzftu.zzd(zzfeiVar);
            String str3 = (String) zzd.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfku
                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object apply(Object obj) {
                    String zzi;
                    zzi = zzfkw.zzi(((zzfei) obj).zza);
                    return zzi;
                }
            }).zzb("");
            String str22 = (String) zzd.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfkv
                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object apply(Object obj) {
                    String zzi;
                    zzi = zzfkw.zzi(((zzfei) obj).zzb);
                    return zzi;
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            zzcbn.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
