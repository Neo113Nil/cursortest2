package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzibd extends zzibc {
    zzibd() {
    }

    @Override // com.google.android.gms.internal.ads.zzibc
    final void zza(Object obj) {
        ((zzibn) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzibc
    final void zzb(zzieu zzieuVar, Map.Entry entry) throws IOException {
        zzibo zziboVar = (zzibo) entry.getKey();
        if (!zziboVar.zzc) {
            zzies zziesVar = zzies.DOUBLE;
            switch (zziboVar.zzb) {
                case DOUBLE:
                    zzieuVar.zzf(zziboVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzieuVar.zze(zziboVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzieuVar.zzc(zziboVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzieuVar.zzh(zziboVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzieuVar.zzi(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzieuVar.zzj(zziboVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzieuVar.zzk(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzieuVar.zzl(zziboVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzieuVar.zzm(zziboVar.zza, (String) entry.getValue());
                    break;
                case GROUP:
                    zzieuVar.zzs(zziboVar.zza, entry.getValue(), zzidm.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzieuVar.zzr(zziboVar.zza, entry.getValue(), zzidm.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzieuVar.zzn(zziboVar.zza, (zzian) entry.getValue());
                    break;
                case UINT32:
                    zzieuVar.zzo(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzieuVar.zzi(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzieuVar.zzb(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzieuVar.zzd(zziboVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzieuVar.zzp(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzieuVar.zzq(zziboVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzies zziesVar2 = zzies.DOUBLE;
        switch (zziboVar.zzb) {
            case DOUBLE:
                zzidw.zza(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case FLOAT:
                zzidw.zzb(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case INT64:
                zzidw.zzc(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case UINT64:
                zzidw.zzd(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case INT32:
                zzidw.zzh(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case FIXED64:
                zzidw.zzf(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case FIXED32:
                zzidw.zzk(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case BOOL:
                zzidw.zzn(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case STRING:
                zzidw.zzo(zziboVar.zza, (List) entry.getValue(), zzieuVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzidw.zzr(zziboVar.zza, (List) entry.getValue(), zzieuVar, zzidm.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzidw.zzq(zziboVar.zza, (List) entry.getValue(), zzieuVar, zzidm.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzidw.zzp(zziboVar.zza, (List) entry.getValue(), zzieuVar);
                break;
            case UINT32:
                zzidw.zzi(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case ENUM:
                zzidw.zzh(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case SFIXED32:
                zzidw.zzl(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case SFIXED64:
                zzidw.zzg(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case SINT32:
                zzidw.zzj(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
            case SINT64:
                zzidw.zze(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                break;
        }
    }
}
