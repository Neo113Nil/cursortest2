package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdyc implements zzhdp {
    private final zzhec zza;

    public zzdyc(zzhec zzhecVar) {
        this.zza = zzhecVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzhec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        String valueOf;
        zzfeq zza = ((zzcxy) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhm)).booleanValue()) {
            String str = zza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString("request_id");
                } catch (JSONException unused) {
                }
            }
            if (zza.zzd.zzs != null) {
                try {
                    valueOf = new JSONObject(zza.zzd.zzs.zza).getString("request_id");
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zze().nextInt() & Integer.MAX_VALUE);
        zzhdx.zzb(valueOf);
        return valueOf;
    }
}
