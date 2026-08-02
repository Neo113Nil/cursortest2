package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbbc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzeck implements zzgcf {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzecl zzb;

    zzeck(zzecl zzeclVar, boolean z) {
        this.zza = z;
        this.zzb = zzeclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzgcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
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
                            if (str.equals("native")) {
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
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbbc.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzbbc.zzd.zza.REWARD_BASED_VIDEO_AD : zzbbc.zzd.zza.NATIVE_APP_INSTALL : zzbbc.zzd.zza.INTERSTITIAL : zzbbc.zzd.zza.BANNER);
                }
                final zzbbc.zzaf.zzd zzb = zzecl.zzb(this.zzb, bundle);
                final zzbbc.zzab zza = zzecl.zza(this.zzb, bundle);
                zzecl zzeclVar = this.zzb;
                final boolean z = this.zza;
                zzeclVar.zza.zza(new zzfio() { // from class: com.google.android.gms.internal.ads.zzecj
                    @Override // com.google.android.gms.internal.ads.zzfio
                    public final Object zza(Object obj3) {
                        zzecd zzecdVar;
                        zzeck zzeckVar = zzeck.this;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzeckVar.zzb.zzf()) {
                            return null;
                        }
                        zzbbc.zzaf.zzd zzdVar = zzb;
                        zzbbc.zzab zzabVar = zza;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] zze = zzecl.zze(zzeckVar.zzb, z2, arrayList2, zzabVar, zzdVar);
                        zzeco.zzf(sQLiteDatabase, z2, true);
                        zzecdVar = zzeckVar.zzb.zzf;
                        zzeco.zzc(sQLiteDatabase, zzecdVar.zzd(), zze);
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
        while (r0.hasNext()) {
        }
        final zzbbc.zzaf.zzd zzb2 = zzecl.zzb(this.zzb, bundle);
        final zzbbc.zzab zza2 = zzecl.zza(this.zzb, bundle);
        zzecl zzeclVar2 = this.zzb;
        final boolean z2 = this.zza;
        zzeclVar2.zza.zza(new zzfio() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj32) {
                zzecd zzecdVar;
                zzeck zzeckVar = zzeck.this;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzeckVar.zzb.zzf()) {
                    return null;
                }
                zzbbc.zzaf.zzd zzdVar = zzb2;
                zzbbc.zzab zzabVar = zza2;
                ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] zze = zzecl.zze(zzeckVar.zzb, z22, arrayList22, zzabVar, zzdVar);
                zzeco.zzf(sQLiteDatabase, z22, true);
                zzecdVar = zzeckVar.zzb.zzf;
                zzeco.zzc(sQLiteDatabase, zzecdVar.zzd(), zze);
                return null;
            }
        });
    }
}
