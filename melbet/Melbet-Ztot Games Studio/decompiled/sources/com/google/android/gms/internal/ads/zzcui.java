package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzcui implements zzczo, zzdfc {
    private zzbuv zza;
    private final Context zzc;
    private final zzfki zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzcui(Context context, zzfki zzfkiVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfkiVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    final /* synthetic */ void zzc() {
        zzbbg.zze(this.zzc);
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, androidx.core.app.NotificationCompat.CATEGORY_SERVICE) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() {
        zzbuv zzbuvVar;
        int i;
        int i2;
        zzbno zza;
        if (!this.zzb.getAndSet(true)) {
            if (!((Boolean) zzbds.zzk.zze()).booleanValue()) {
                i = 3;
                if (!((Boolean) zzbds.zzl.zze()).booleanValue()) {
                    if (((Boolean) zzbds.zzj.zze()).booleanValue()) {
                        try {
                            String optString = new JSONObject(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc()).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i2 = i - 1;
                if (i2 != 1) {
                    zza = com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                } else if (i2 == 2) {
                    zza = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                }
                this.zza = new zzbux(this.zzc, zza.zza("google.afma.sdkConstants.getSdkConstants", zzbnl.zza, zzbnl.zza), this.zze);
                this.zzg = true;
            }
            i = 2;
            i2 = i - 1;
            if (i2 != 1) {
            }
            this.zza = new zzbux(this.zzc, zza.zza("google.afma.sdkConstants.getSdkConstants", zzbnl.zza, zzbnl.zza), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbuvVar = this.zza) != null) {
            ListenableFuture zza2 = zzbuvVar.zza();
            if (!this.zzh && ((Boolean) zzbdk.zzi.zze()).booleanValue()) {
                zza2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcui.this.zzc();
                    }
                }, this.zzf);
            }
            zzbzr.zza(zza2, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zzf(String str) {
        zzd();
    }
}
