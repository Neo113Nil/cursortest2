package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfuw extends zzfus {
    public zzfuw(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfulVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfth zza = zzfth.zza();
        if (zza != null) {
            for (zzfsn zzfsnVar : zza.zze()) {
                if (this.zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfut, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfut
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
