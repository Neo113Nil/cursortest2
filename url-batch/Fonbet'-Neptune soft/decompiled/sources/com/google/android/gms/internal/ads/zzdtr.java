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

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzdtr extends zzblg {
    private final zzdtu zza;
    private final zzdtp zzb;
    private final Map zzc = new HashMap();

    zzdtr(zzdtu zzdtuVar, zzdtp zzdtpVar) {
        this.zza = zzdtuVar;
        this.zzb = zzdtpVar;
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
                            zznVar.zzi(0);
                            break;
                        } else {
                            zznVar.zzi(1);
                            break;
                        }
                    case -99890337:
                        if (!nextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzc(jsonReader.nextInt());
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
                            zznVar.zze(arrayList);
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
                                zznVar.zzf(nextString);
                                break;
                            }
                        }
                    case 1411582723:
                        if (!nextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzh(0);
                            break;
                        } else {
                            zznVar.zzh(1);
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
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad Request json was malformed, parsing ended early.");
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

    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zzf(String str) throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkr)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            com.google.android.gms.ads.internal.zzv.zzr();
            Map zzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(parse);
            String str2 = (String) zzQ.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg did not contain an action");
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
                    ((zzdtk) it.next()).zza();
                }
                map.clear();
                return;
            }
            String str3 = (String) zzQ.get("obj_id");
            try {
                long parseLong = Long.parseLong((String) Objects.requireNonNull(str3));
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            zzdtk zzdtkVar = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar != null) {
                                zzdtkVar.zzc();
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            zzdtk zzdtkVar2 = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar2 != null) {
                                zzdtkVar2.zzc();
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            zzdtk zzdtkVar3 = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar3 != null) {
                                zzdtkVar3.zzb(zzc(zzQ));
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            Map map2 = this.zzc;
                            if (map2.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzks)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Long valueOf = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str4 = (String) zzQ.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdtl zzb = this.zza.zzb();
                            zzb.zzb(parseLong);
                            zzb.zza(str4);
                            map2.put(valueOf, zzb.zzc().zza());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            zzdtk zzdtkVar4 = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar4 != null) {
                                zzdtkVar4.zzb(zzc(zzQ));
                                return;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map3 = this.zzc;
                            Long valueOf2 = Long.valueOf(parseLong);
                            zzdtk zzdtkVar5 = (zzdtk) map3.get(valueOf2);
                            if (zzdtkVar5 == null) {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdtkVar5.zza();
                            map3.remove(valueOf2);
                            com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + parseLong);
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            Map map4 = this.zzc;
                            if (map4.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzks)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Long valueOf3 = Long.valueOf(parseLong);
                            if (map4.containsKey(valueOf3)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str5 = (String) zzQ.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdtl zzb2 = this.zza.zzb();
                            zzb2.zzb(parseLong);
                            zzb2.zza(str5);
                            map4.put(valueOf3, zzb2.zzc().zzb());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                            return;
                        }
                        break;
                }
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg contained invalid action: ".concat(String.valueOf(str2)));
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
