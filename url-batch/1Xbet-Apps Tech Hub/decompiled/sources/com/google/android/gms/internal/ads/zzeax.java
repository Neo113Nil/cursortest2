package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeax {
    public ListenableFuture zza;
    private final zzdba zzb;
    private final zzeaf zzc;
    private final zzfiu zzd;
    private final zzfeq zze;
    private final zzcbt zzf;
    private final zzfkk zzg;
    private final zzfkh zzh;
    private final Context zzi;
    private final zzgbl zzj;

    zzeax(zzdba zzdbaVar, zzeaf zzeafVar, zzfiu zzfiuVar, zzfeq zzfeqVar, zzcbt zzcbtVar, zzfkk zzfkkVar, zzfkh zzfkhVar, Context context, zzgbl zzgblVar) {
        this.zzb = zzdbaVar;
        this.zzc = zzeafVar;
        this.zzd = zzfiuVar;
        this.zze = zzfeqVar;
        this.zzf = zzcbtVar;
        this.zzg = zzfkkVar;
        this.zzh = zzfkhVar;
        this.zzi = context;
        this.zzj = zzgblVar;
    }

    final /* synthetic */ zzbvi zza(zzbwa zzbwaVar, zzeci zzeciVar) {
        zzeciVar.zzc.put(HttpHeaders.CONTENT_TYPE, zzeciVar.zze);
        zzeciVar.zzc.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzi, zzbwaVar.zzb.zza));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzeciVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbvi(zzeciVar.zza, zzeciVar.zzb, bundle, zzeciVar.zzd, zzeciVar.zzf, zzbwaVar.zzd, zzbwaVar.zzh);
    }

    public final ListenableFuture zzc(final zzbwa zzbwaVar, final JSONObject jSONObject, final zzbwd zzbwdVar) {
        this.zzb.zzbs(zzbwaVar);
        zzfil zzb = this.zzd.zzb(zzfio.PROXY, zzgbb.zzm(this.zzd.zzb(zzfio.PREPARE_HTTP_REQUEST, zzgbb.zzh(new zzecm(jSONObject, zzbwdVar))).zze(new zzecn(zzbwaVar.zzg, this.zzh, zzfjv.zza(this.zzi, 9))).zza(), new zzftn() { // from class: com.google.android.gms.internal.ads.zzeat
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return zzeax.this.zza(zzbwaVar, (zzeci) obj);
            }
        }, this.zzj));
        final zzeaf zzeafVar = this.zzc;
        zzfhz zza = zzb.zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzeau
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeaf.this.zzc((zzbvi) obj);
            }
        }).zza();
        this.zza = zza;
        ListenableFuture zzn = zzgbb.zzn(this.zzd.zzb(zzfio.PRE_PROCESS, zza).zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                return new zzebv(zzecj.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbwdVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzebv.zza, zzbor.zzb)).zza(), new zzgai() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeax.this.zzd((InputStream) obj);
            }
        }, this.zzj);
        zzgbb.zzr(zzn, new zzeaw(this), this.zzj);
        return zzn;
    }

    final /* synthetic */ ListenableFuture zzd(InputStream inputStream) throws Exception {
        return zzgbb.zzh(new zzfeh(new zzfee(this.zze), zzfeg.zza(new InputStreamReader(inputStream))));
    }
}
