package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzehy implements zzgzl {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzehz zzb;

    zzehy(zzehz zzehzVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzehzVar);
        this.zzb = zzehzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        zzehz zzehzVar = this.zzb;
        zzdah zzdahVar = (zzdah) obj;
        if (zzehzVar.zzf()) {
            return;
        }
        Bundle bundle = zzdahVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                emptyList = Collections.emptyList();
                final ArrayList arrayList = new ArrayList();
                for (String str : emptyList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1052618729:
                            if (str.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzbgj.zzd.zza.REWARD_BASED_VIDEO_AD : zzbgj.zzd.zza.NATIVE_APP_INSTALL : zzbgj.zzd.zza.INTERSTITIAL : zzbgj.zzd.zza.BANNER);
                }
                final zzbgj.zzaf.zzd zze = zzehz.zze(bundle);
                final zzbgj.zzab zzb = zzehzVar.zzb(bundle);
                final boolean z = this.zza;
                zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
                    @Override // com.google.android.gms.internal.ads.zzfmu
                    public final /* synthetic */ Object zza(Object obj3) {
                        zzehz zzehzVar2 = zzehy.this.zzb;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzehzVar2.zzf()) {
                            return null;
                        }
                        zzbgj.zzaf.zzd zzdVar = zze;
                        zzbgj.zzab zzabVar = zzb;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] zzc = zzehzVar2.zzc(z2, arrayList2, zzabVar, zzdVar);
                        zzeic.zzf(sQLiteDatabase, z2, true);
                        zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), zzc);
                        return null;
                    }
                });
            }
            asList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        final zzbgj.zzaf.zzd zze2 = zzehz.zze(bundle);
        final zzbgj.zzab zzb2 = zzehzVar.zzb(bundle);
        final boolean z2 = this.zza;
        zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj32) {
                zzehz zzehzVar2 = zzehy.this.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzehzVar2.zzf()) {
                    return null;
                }
                zzbgj.zzaf.zzd zzdVar = zze2;
                zzbgj.zzab zzabVar = zzb2;
                ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] zzc = zzehzVar2.zzc(z22, arrayList22, zzabVar, zzdVar);
                zzeic.zzf(sQLiteDatabase, z22, true);
                zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), zzc);
                return null;
            }
        });
    }
}
