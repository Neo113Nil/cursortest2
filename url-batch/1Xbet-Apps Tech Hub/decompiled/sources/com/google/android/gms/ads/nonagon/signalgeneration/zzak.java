package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzdyl;
import com.google.android.gms.internal.ads.zzgai;
import com.google.android.gms.internal.ads.zzgbb;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzak implements zzgai {
    private final Executor zza;
    private final zzdyl zzb;

    public zzak(Executor executor, zzdyl zzdylVar) {
        this.zza = executor;
        this.zzb = zzdylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgai
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzbwa zzbwaVar = (zzbwa) obj;
        return zzgbb.zzn(this.zzb.zzb(zzbwaVar), new zzgai() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj2) {
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzay.zzb().zzh(zzbwa.this.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return zzgbb.zzh(zzamVar);
            }
        }, this.zza);
    }
}
