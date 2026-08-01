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

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzblz implements zzamt {
    private volatile zzblm zza;
    private final Context zzb;

    public zzblz(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzblz zzblzVar) {
        if (zzblzVar.zza == null) {
            return;
        }
        zzblzVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamt
    public final zzamw zza(zzana zzanaVar) throws zzanj {
        Parcelable.Creator<zzbln> creator = zzbln.CREATOR;
        Map zzl = zzanaVar.zzl();
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
        zzbln zzblnVar = new zzbln(zzanaVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzccf zzccfVar = new zzccf();
            this.zza = new zzblm(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzblx(this, zzccfVar), new zzbly(this, zzccfVar));
            this.zza.checkAvailabilityAndConnect();
            ListenableFuture zzo = zzgbb.zzo(zzgbb.zzn(zzccfVar, new zzblv(this, zzblnVar), zzcca.zza), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeq)).intValue(), TimeUnit.MILLISECONDS, zzcca.zzd);
            zzo.addListener(new zzblw(this), zzcca.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzblp zzblpVar = (zzblp) new zzbvy(parcelFileDescriptor).zza(zzblp.CREATOR);
            if (zzblpVar == null) {
                return null;
            }
            if (zzblpVar.zza) {
                throw new zzanj(zzblpVar.zzb);
            }
            if (zzblpVar.zze.length != zzblpVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzblpVar.zze;
                if (i >= strArr3.length) {
                    return new zzamw(zzblpVar.zzc, zzblpVar.zzd, hashMap, zzblpVar.zzg, zzblpVar.zzh);
                }
                hashMap.put(strArr3[i], zzblpVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
