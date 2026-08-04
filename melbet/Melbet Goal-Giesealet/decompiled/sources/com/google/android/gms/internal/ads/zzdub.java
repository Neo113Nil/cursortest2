package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdub extends zzbkn {
    private final zzdue zza;
    private final zzdtz zzb;
    private final Map zzc = new HashMap();

    zzdub(zzdue zzdueVar, zzdtz zzdtzVar) {
        this.zza = zzdueVar;
        this.zzb = zzdtzVar;
    }

    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (!nextName.equals("extras")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            zznVar.zzb(bundle);
                            break;
                        }
                    case -839117230:
                        if (!nextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzd(jsonReader.nextBoolean());
                            break;
                        }
                    case -733436947:
                        if (!nextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                            break;
                        } else {
                            zznVar.zzf(1);
                            break;
                        }
                    case -99890337:
                        if (!nextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzh(jsonReader.nextInt());
                            break;
                        }
                    case 523149226:
                        if (!nextName.equals("keywords")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            zznVar.zzc(arrayList);
                            break;
                        }
                    case 597632527:
                        if (!nextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            String nextString = jsonReader.nextString();
                            if (!RequestConfiguration.zza.contains(nextString)) {
                                break;
                            } else {
                                zznVar.zzg(nextString);
                                break;
                            }
                        }
                    case 1411582723:
                        if (!nextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                            break;
                        } else {
                            zznVar.zze(1);
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zza = zznVar.zza();
        Bundle bundle2 = zza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zza.zza, zza.zzb, bundle3, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, bundle2, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx, zza.zzy, zza.zzz, zza.zzA);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zze(String str) throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkK)).booleanValue()) {
            String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map zzU = com.google.android.gms.ads.internal.util.zzs.zzU(parse);
            String str2 = (String) zzU.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    this.zzc.clear();
                    this.zzb.zza();
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdtv) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) zzU.get("obj_id");
            try {
                long parseLong = Long.parseLong((String) Objects.requireNonNull(str3));
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            zzdtv zzdtvVar = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtvVar != null) {
                                zzdtvVar.zzb();
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzd(parseLong);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            zzdtv zzdtvVar2 = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtvVar2 != null) {
                                zzdtvVar2.zzb();
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzj(parseLong);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            zzdtv zzdtvVar3 = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtvVar3 != null) {
                                zzdtvVar3.zza(zzc(zzU));
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzj(parseLong);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            Map map2 = this.zzc;
                            if (map2.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkL)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                                this.zzb.zzc(parseLong);
                                return;
                            }
                            Long valueOf = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(parseLong);
                                return;
                            }
                            String str4 = (String) zzU.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzc(parseLong);
                                return;
                            }
                            zzdtw zzc = this.zza.zzc();
                            zzc.zzc(parseLong);
                            zzc.zzb(str4);
                            map2.put(valueOf, zzc.zza().zza());
                            this.zzb.zzb(parseLong);
                            StringBuilder sb = new StringBuilder(String.valueOf(parseLong).length() + 39 + String.valueOf(str4).length());
                            sb.append("Created H5 interstitial #");
                            sb.append(parseLong);
                            sb.append(" with ad unit ");
                            sb.append(str4);
                            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            zzdtv zzdtvVar4 = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtvVar4 != null) {
                                zzdtvVar4.zza(zzc(zzU));
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzd(parseLong);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map3 = this.zzc;
                            Long valueOf2 = Long.valueOf(parseLong);
                            zzdtv zzdtvVar5 = (zzdtv) map3.get(valueOf2);
                            if (zzdtvVar5 == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdtvVar5.zzc();
                            map3.remove(valueOf2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(parseLong).length() + 16);
                            sb2.append("Disposed H5 ad #");
                            sb2.append(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            Map map4 = this.zzc;
                            if (map4.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkL)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                                this.zzb.zzc(parseLong);
                                return;
                            }
                            Long valueOf3 = Long.valueOf(parseLong);
                            if (map4.containsKey(valueOf3)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(parseLong);
                                return;
                            }
                            String str5 = (String) zzU.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzc(parseLong);
                                return;
                            }
                            zzdtw zzc2 = this.zza.zzc();
                            zzc2.zzc(parseLong);
                            zzc2.zzb(str5);
                            map4.put(valueOf3, zzc2.zza().zzb());
                            this.zzb.zzb(parseLong);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(parseLong).length() + 35 + String.valueOf(str5).length());
                            sb3.append("Created H5 rewarded #");
                            sb3.append(parseLong);
                            sb3.append(" with ad unit ");
                            sb3.append(str5);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            return;
                        }
                        break;
                }
                String.valueOf(str2);
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg contained invalid action: ".concat(String.valueOf(str2)));
            } catch (NullPointerException | NumberFormatException unused) {
                String.valueOf(str3);
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzf() {
        this.zzc.clear();
    }
}
