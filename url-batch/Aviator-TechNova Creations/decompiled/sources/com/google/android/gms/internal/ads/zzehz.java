package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzehz extends zzeia {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdaj zzc;
    private final TelephonyManager zzd;
    private final zzehr zze;
    private zzbgj.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbgj.zzaf.zzd.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbgj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbgj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbgj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbgj.zzaf.zzd.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbgj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbgj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbgj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbgj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbgj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbgj.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbgj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbgj.zzaf.zzd.CONNECTING);
    }

    zzehz(Context context, zzdaj zzdajVar, zzehr zzehrVar, zzehn zzehnVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzehnVar, zzgVar);
        this.zzb = context;
        this.zzc = zzdajVar;
        this.zze = zzehrVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    static final /* synthetic */ zzbgj.zzaf.zzd zze(Bundle bundle) {
        return (zzbgj.zzaf.zzd) zzg.get(zzfjz.zza(zzfjz.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE), "network").getInt("active_network_state", -1), zzbgj.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbgj.zzq zzg(boolean z) {
        return z ? zzbgj.zzq.ENUM_TRUE : zzbgj.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z) {
        zzgzo.zzr(this.zzc.zza(new Bundle()), new zzehy(this, z), zzcei.zzg);
    }

    final /* synthetic */ zzbgj.zzab zzb(Bundle bundle) {
        zzbgj.zzab.zzb zzbVar;
        zzbgj.zzab.zza zzq = zzbgj.zzab.zzq();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzf = zzbgj.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbgj.zzq.ENUM_FALSE;
            if (i == 0) {
                zzq.zzc(zzbgj.zzab.zzc.CELL);
            } else if (i != 1) {
                zzq.zzc(zzbgj.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzq.zzc(zzbgj.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbgj.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbgj.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbgj.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbgj.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzq.zzg(zzbVar);
        }
        return zzq.zzbu();
    }

    final /* synthetic */ byte[] zzc(boolean z, ArrayList arrayList, zzbgj.zzab zzabVar, zzbgj.zzaf.zzd zzdVar) {
        zzbgj.zzaf.zza.C0013zza zzz = zzbgj.zzaf.zza.zzz();
        zzz.zzv(arrayList);
        Context context = this.zzb;
        zzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzf(context, this.zzd));
        zzehr zzehrVar = this.zze;
        zzz.zzk(zzehrVar.zzf());
        zzz.zzo(zzehrVar.zzj());
        zzz.zzR(zzehrVar.zzd());
        zzz.zzZ(zzdVar);
        zzz.zzz(zzabVar);
        zzz.zzV(this.zzf);
        zzz.zzg(zzg(z));
        zzz.zzad(zzehrVar.zzb());
        zzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return zzz.zzbu().zzaN();
    }

    final /* synthetic */ zzehr zzd() {
        return this.zze;
    }
}
