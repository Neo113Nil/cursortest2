package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzedt implements zzgax {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzedu zzb;

    zzedt(zzedu zzeduVar, boolean z) {
        this.zzb = zzeduVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzcbn.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzgax
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
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzazn.AD_FORMAT_TYPE_UNSPECIFIED : zzazn.REWARD_BASED_VIDEO_AD : zzazn.NATIVE_APP_INSTALL : zzazn.INTERSTITIAL : zzazn.BANNER);
                }
                final zzbbc zzb = zzedu.zzb(this.zzb, bundle);
                final zzbat zza = zzedu.zza(this.zzb, bundle);
                zzedu zzeduVar = this.zzb;
                final boolean z = this.zza;
                zzeduVar.zza.zza(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeds
                    @Override // com.google.android.gms.internal.ads.zzfhx
                    public final Object zza(Object obj3) {
                        zzedm zzedmVar;
                        zzedt zzedtVar = zzedt.this;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzedtVar.zzb.zzf()) {
                            return null;
                        }
                        zzbbc zzbbcVar = zzb;
                        zzbat zzbatVar = zza;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] zze = zzedu.zze(zzedtVar.zzb, z2, arrayList2, zzbatVar, zzbbcVar);
                        zzedx.zzg(sQLiteDatabase, z2, true);
                        zzedmVar = zzedtVar.zzb.zzf;
                        zzedx.zzd(sQLiteDatabase, zzedmVar.zzd(), zze);
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
        final zzbbc zzb2 = zzedu.zzb(this.zzb, bundle);
        final zzbat zza2 = zzedu.zza(this.zzb, bundle);
        zzedu zzeduVar2 = this.zzb;
        final boolean z2 = this.zza;
        zzeduVar2.zza.zza(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj32) {
                zzedm zzedmVar;
                zzedt zzedtVar = zzedt.this;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzedtVar.zzb.zzf()) {
                    return null;
                }
                zzbbc zzbbcVar = zzb2;
                zzbat zzbatVar = zza2;
                ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] zze = zzedu.zze(zzedtVar.zzb, z22, arrayList22, zzbatVar, zzbbcVar);
                zzedx.zzg(sQLiteDatabase, z22, true);
                zzedmVar = zzedtVar.zzb.zzf;
                zzedx.zzd(sQLiteDatabase, zzedmVar.zzd(), zze);
                return null;
            }
        });
    }
}
