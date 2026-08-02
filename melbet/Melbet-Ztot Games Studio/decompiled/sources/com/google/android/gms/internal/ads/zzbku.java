package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbku implements zzapa {
    private volatile zzbkh zza;
    private final Context zzb;

    public zzbku(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbku zzbkuVar) {
        if (zzbkuVar.zza == null) {
            return;
        }
        zzbkuVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzapd zza(zzaph zzaphVar) throws zzapq {
        Parcelable.Creator<zzbki> creator = zzbki.CREATOR;
        Map zzl = zzaphVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbki zzbkiVar = new zzbki(zzaphVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        try {
            zzbzt zzbztVar = new zzbzt();
            this.zza = new zzbkh(this.zzb, com.google.android.gms.ads.internal.zzu.zzt().zzb(), new zzbks(this, zzbztVar), new zzbkt(this, zzbztVar));
            this.zza.checkAvailabilityAndConnect();
            ListenableFuture zzo = zzgcj.zzo(zzgcj.zzn(zzbztVar, new zzbkq(this, zzbkiVar), zzbzo.zza), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdY)).intValue(), TimeUnit.MILLISECONDS, zzbzo.zzd);
            zzo.addListener(new zzbkr(this), zzbzo.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbkk zzbkkVar = (zzbkk) new zzbuz(parcelFileDescriptor).zza(zzbkk.CREATOR);
            if (zzbkkVar == null) {
                return null;
            }
            if (zzbkkVar.zza) {
                throw new zzapq(zzbkkVar.zzb);
            }
            if (zzbkkVar.zze.length != zzbkkVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbkkVar.zze;
                if (i >= strArr3.length) {
                    return new zzapd(zzbkkVar.zzc, zzbkkVar.zzd, hashMap, zzbkkVar.zzg, zzbkkVar.zzh);
                }
                hashMap.put(strArr3[i], zzbkkVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
