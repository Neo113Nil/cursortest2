package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbsu extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsu(zzbga zzbgaVar) {
        try {
            this.zzb = zzbgaVar.zzg();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbgaVar.zzh()) {
                zzbgi zzg = obj instanceof IBinder ? zzbgh.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbsw(zzg));
                }
            }
        } catch (RemoteException e2) {
            zzcbn.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
