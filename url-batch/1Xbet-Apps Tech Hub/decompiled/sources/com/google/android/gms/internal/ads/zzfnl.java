package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfnl extends zzfng {
    public zzfnl(zzfmz zzfmzVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfmzVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfmq.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnh, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfnh
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzflx zza;
        if (!TextUtils.isEmpty(str) && (zza = zzflx.zza()) != null) {
            for (zzflj zzfljVar : zza.zzc()) {
                if (this.zza.contains(zzfljVar.zzh())) {
                    zzfljVar.zzg().zzf(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
