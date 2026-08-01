package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzecg extends zzbvp {
    private final Context zza;
    private final zzewm zzb;
    private final zzewk zzc;
    private final zzeco zzd;
    private final zzgbl zze;
    private final zzecl zzf;
    private final zzbwm zzg;

    zzecg(Context context, zzewm zzewmVar, zzewk zzewkVar, zzecl zzeclVar, zzeco zzecoVar, zzgbl zzgblVar, zzbwm zzbwmVar) {
        this.zza = context;
        this.zzb = zzewmVar;
        this.zzc = zzewkVar;
        this.zzf = zzeclVar;
        this.zzd = zzecoVar;
        this.zze = zzgblVar;
        this.zzg = zzbwmVar;
    }

    private final void zzc(ListenableFuture listenableFuture, zzbvt zzbvtVar) {
        zzgbb.zzr(zzgbb.zzn(zzgas.zzu(listenableFuture), new zzgai() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh(zzffq.zza((InputStream) obj));
            }
        }, zzcca.zza), new zzecf(this, zzbvtVar), zzcca.zzf);
    }

    public final ListenableFuture zzb(zzbvi zzbviVar, int i) {
        ListenableFuture zzh;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbviVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final zzeci zzeciVar = new zzeci(zzbviVar.zza, zzbviVar.zzb, hashMap, zzbviVar.zzd, "", zzbviVar.zze);
        zzewk zzewkVar = this.zzc;
        zzewkVar.zza(new zzexs(zzbviVar));
        boolean z = zzeciVar.zzf;
        zzewl zzb = zzewkVar.zzb();
        if (z) {
            String str2 = zzbviVar.zza;
            String str3 = (String) zzbfc.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzful.zzc(zzftk.zzc(';')).zzd(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            zzh = zzgbb.zzm(zzb.zza().zza(new JSONObject()), new zzftn() { // from class: com.google.android.gms.internal.ads.zzeby
                                @Override // com.google.android.gms.internal.ads.zzftn
                                public final Object apply(Object obj) {
                                    zzeci zzeciVar2 = zzeci.this;
                                    zzeco.zza(zzeciVar2.zzc, (JSONObject) obj);
                                    return zzeciVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzgbb.zzh(zzeciVar);
        zzfiu zzb2 = zzb.zzb();
        return zzgbb.zzn(zzb2.zzb(zzfio.HTTP, zzh).zze(new zzeck(this.zza, "", this.zzg, i)).zza(), new zzgai() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                zzecj zzecjVar = (zzecj) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzecjVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : zzecjVar.zzb.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) zzecjVar.zzb.get(str4);
                            JSONArray jSONArray = new JSONArray();
                            for (String str5 : list) {
                                if (str5 != null) {
                                    jSONArray.put(str5);
                                }
                            }
                            jSONObject2.put(str4, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzecjVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzecjVar.zzd);
                    return zzgbb.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    zzcbn.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zze(zzbvi zzbviVar, zzbvt zzbvtVar) {
        zzc(zzb(zzbviVar, Binder.getCallingUid()), zzbvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzf(zzbve zzbveVar, zzbvt zzbvtVar) {
        zzewb zzewbVar = new zzewb(zzbveVar, Binder.getCallingUid());
        zzewm zzewmVar = this.zzb;
        zzewmVar.zza(zzewbVar);
        final zzewn zzb = zzewmVar.zzb();
        zzfiu zzb2 = zzb.zzb();
        zzfhz zza = zzb2.zzb(zzfio.GMS_SIGNALS, zzgbb.zzi()).zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzewn.this.zza().zza(new JSONObject());
            }
        }).zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzeca
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbvtVar);
        if (((Boolean) zzbev.zzd.zze()).booleanValue()) {
            final zzeco zzecoVar = this.zzd;
            zzecoVar.getClass();
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzece
                @Override // java.lang.Runnable
                public final void run() {
                    zzeco.this.zzb();
                }
            }, this.zze);
        }
    }
}
