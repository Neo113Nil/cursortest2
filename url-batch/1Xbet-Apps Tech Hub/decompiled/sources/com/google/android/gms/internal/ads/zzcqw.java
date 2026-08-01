package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcqw implements zzhdp {
    private final zzhec zza;

    public zzcqw(zzhec zzhecVar) {
        this.zza = zzhecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcui) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
